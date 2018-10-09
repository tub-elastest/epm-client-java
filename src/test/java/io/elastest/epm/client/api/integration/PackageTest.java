package io.elastest.epm.client.api.integration;

import io.elastest.epm.client.ApiClient;
import io.elastest.epm.client.ApiException;
import io.elastest.epm.client.api.PackageApi;
import io.elastest.epm.client.api.RuntimeApi;
import io.elastest.epm.client.model.CommandExecutionBody;
import io.elastest.epm.client.model.ResourceGroup;
import org.apache.log4j.BasicConfigurator;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;

public class PackageTest {

    private final PackageApi packageApi = new PackageApi();
    private final RuntimeApi runtimeApi = new RuntimeApi();

    @Before
    public void init() {
        ApiClient apiClient = new ApiClient();
        apiClient.setBasePath("http://localhost:8180/v1");
        packageApi.setApiClient(apiClient);
    }

    @Test
    @Ignore
    public void sendAndDeletePackage() throws ApiException {
        File testPackage = new File("src/test/resources/compose-package.tar");
        ResourceGroup resourceGroup = packageApi.receivePackage(testPackage);

        CommandExecutionBody commandExecutionBody = new CommandExecutionBody();
        commandExecutionBody.setAwaitCompletion(true);
        commandExecutionBody.setCommand("ls /");
        String r = runtimeApi.executeOnInstance(resourceGroup.getVdus().get(0).getId(), commandExecutionBody);
        System.out.print(r);

        packageApi.deletePackage(resourceGroup.getId());
    }
}
