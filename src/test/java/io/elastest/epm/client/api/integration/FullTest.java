package io.elastest.epm.client.api.integration;

import com.google.gson.reflect.TypeToken;
import io.elastest.epm.client.ApiClient;
import io.elastest.epm.client.ApiException;
import io.elastest.epm.client.JSON;
import io.elastest.epm.client.api.*;
import io.elastest.epm.client.model.*;
import org.junit.Before;
import org.junit.Test;
import sun.misc.IOUtils;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;


public class FullTest {

    private final PackageApi packageApi = new PackageApi();
    private final WorkerApi workerApi = new WorkerApi();
    private final KeyApi keyApi = new KeyApi();
    private final RuntimeApi runtimeApi = new RuntimeApi();
    private final AdapterApi adapterApi = new AdapterApi();
    private final PoPApi poPApi = new PoPApi();
    private JSON json;

    @Before
    public void init() {
        ApiClient apiClient = new ApiClient();
        apiClient.setBasePath("http://localhost:8180/v1");
        packageApi.setApiClient(apiClient);
        json = new JSON(apiClient);
    }

    @Test
    public void fullTestCompose() throws FileNotFoundException, ApiException, InterruptedException {

        // Check if all needed adapters are already registered

        boolean dockerFound = false;
        List<Adapter> adapters = adapterApi.getAllAdapters();
        for(Adapter adapter : adapters) {
            if(adapter.getType().equals("docker")) dockerFound = true;
        }
        assert popForType("ansible") != null;
        assert dockerFound;

        // Launch Ansible Package

        File ansible = new File("src/test/resources/ansible-package.tar");
        ResourceGroup ansibleRG = packageApi.receivePackage(ansible);
        // Read files from json

        File w = new File("src/test/resources/key.json");
        InputStream is = new FileInputStream(w);
        Scanner s = new Scanner(is).useDelimiter("\\A");
        String result = s.hasNext() ? s.next() : "";
        result = result.replace("  ", "");
        Key key = json.deserialize(result, new TypeToken<Key>(){}.getType());

        w = new File("src/test/resources/worker.json");
        is = new FileInputStream(w);
        s = new Scanner(is).useDelimiter("\\A");
        result = s.hasNext() ? s.next() : "";
        Worker worker = json.deserialize(result, new TypeToken<Worker>(){}.getType());
        s.close();

        // Register Key
        key = keyApi.addKey(key);

        TimeUnit.SECONDS.sleep(15);
        // Register Worker
        Worker registeredWorker = workerApi.registerWorker(worker);

        /*
        DOCKER COMPOSE TEST
         */

        // Setup docker-compose and docker
        workerApi.installAdapter(registeredWorker.getId(), "docker");
        workerApi.installAdapter(registeredWorker.getId(), "docker-compose");

        // Launch Package
        boolean composeFound = false;
        int tries = 5;
        while (!composeFound && tries > 0){
            TimeUnit.SECONDS.sleep(2);
            adapters = adapterApi.getAllAdapters();
            for(Adapter adapter : adapters) {
                if(adapter.getType().equals("docker-compose")) composeFound = true;
            }
            tries--;
        }
        assert composeFound;

        File testPackage = new File("src/test/resources/compose-package.tar");
        ResourceGroup resourceGroup = packageApi.receivePackage(testPackage);

        // Runtime Operations
        assert resourceGroup.getVdus().size() > 0;
        CommandExecutionBody commandExecutionBody = new CommandExecutionBody();
        commandExecutionBody.setAwaitCompletion(true);
        commandExecutionBody.setCommand("ls /");
        String r = runtimeApi.executeOnInstance(resourceGroup.getVdus().get(0).getId(), commandExecutionBody);
        System.out.print(r);

        /* DOCKER TEST
         */


        // Launch Package
        boolean dockerPop = false;
        tries = 5;
        while (!dockerPop && tries > 0){
            TimeUnit.SECONDS.sleep(2);
            if(popForType("docker") != null) dockerPop = true;
            tries--;
        }
        assert dockerPop;
        File dockerPackage = new File("src/test/resources/docker-package.tar");
        ResourceGroup dockerResourceGroup = packageApi.receivePackage(dockerPackage);

        assert dockerResourceGroup.getVdus().size() > 0;
        // Runtime
        r = runtimeApi.executeOnInstance(dockerResourceGroup.getVdus().get(0).getId(), commandExecutionBody);
        System.out.print(r);

        /*
        Clean
         */
        packageApi.deletePackage(dockerResourceGroup.getId());
        packageApi.deletePackage(resourceGroup.getId());
        workerApi.deleteWorker(registeredWorker.getId());
        keyApi.deleteKey(key.getId());
        packageApi.deletePackage(ansibleRG.getId());
    }

    private PoP popForType(String type) throws ApiException {
        PoP poP = null;
        List<PoP> pops = poPApi.getAllPoPs();
        for (PoP pop : pops) {
            for (KeyValuePair kvp : pop.getInterfaceInfo()) {
                if (kvp.getKey().equals("type") && kvp.getValue().equals(type)) {
                    poP = pop;
                    break;
                }
            }
        }
        return poP;
    }
}
