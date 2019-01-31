package io.elastest.epm.client.api.integration;

import io.elastest.epm.client.ApiClient;
import io.elastest.epm.client.ApiException;
import io.elastest.epm.client.JSON;
import io.elastest.epm.client.api.*;
import io.elastest.epm.client.model.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class FullTest {

  private final PackageApi packageApi = new PackageApi();
  private final WorkerApi workerApi = new WorkerApi();
  private final RuntimeApi runtimeApi = new RuntimeApi();
  private final AdapterApi adapterApi = new AdapterApi();
  private final PoPApi poPApi = new PoPApi();
  private final ClusterApi clusterApi = new ClusterApi();
  private JSON json;

  @Before
  public void init() {
    ApiClient apiClient = new ApiClient();
    apiClient.setBasePath("http://<REPLACE>:8180/v1");
    packageApi.setApiClient(apiClient);
    clusterApi.setApiClient(apiClient);
    workerApi.setApiClient(apiClient);
    adapterApi.setApiClient(apiClient);
    poPApi.setApiClient(apiClient);
    runtimeApi.setApiClient(apiClient);
    json = new JSON(apiClient);
  }

  @Test
  @Ignore
  public void fullTestCompose() throws FileNotFoundException, ApiException, InterruptedException {

    // Check if all needed adapters are already registered
    assert adapterForType("ansible") != null;

    PoP pop = new PoP();
    pop.setName("tub-os");
    pop.setInterfaceEndpoint("<REPLACE>");
    pop.addInterfaceInfoItem(
        new KeyValuePair().key("auth_url").value("http://<REPLACE>:5000/v2.0"));
    pop.addInterfaceInfoItem(new KeyValuePair().key("password").value("<REPLACE>"));
    pop.addInterfaceInfoItem(new KeyValuePair().key("project_name").value("<REPLACE>"));
    pop.addInterfaceInfoItem(new KeyValuePair().key("username").value("<REPLACE>"));
    pop.addInterfaceInfoItem(new KeyValuePair().key("type").value("openstack"));
    PoP poPR = null;
    try {
      poPR = poPApi.registerPoP(pop);
    } catch (ApiException e) {
      System.err.println("Exception when calling PoPApi#registerPoP");
      e.printStackTrace();
    }

    // Launch Ansible Package

    File ansible = new File("src/test/resources/ansible-package.tar");
    ResourceGroup ansibleRG = packageApi.receivePackage(ansible);
    System.out.print(ansibleRG.toString());

    WorkerFromVDU workerFromVDU = new WorkerFromVDU();
    workerFromVDU.setVduId(ansibleRG.getVdus().get(0).getId());
    workerFromVDU.setType(new ArrayList<String>());
    workerFromVDU.addTypeItem("docker-compose");
    Worker registeredWorker = workerApi.createWorker(workerFromVDU);

    /*
    DOCKER COMPOSE TEST
     */

    // Launch Package
    boolean composeFound = false;
    int tries = 5;
    while (!composeFound && tries > 0) {
      TimeUnit.SECONDS.sleep(5);
      List<Adapter> adapters = adapterApi.getAllAdapters();
      for (Adapter adapter : adapters) {
        if (adapter.getType().equals("docker-compose")) composeFound = true;
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
    String r =
        runtimeApi.executeOnInstance(resourceGroup.getVdus().get(0).getId(), commandExecutionBody);
    System.out.print(r);

    /*
    Clean
     */
    packageApi.deletePackage(resourceGroup.getId());
    workerApi.deleteWorker(registeredWorker.getId());
    packageApi.deletePackage(ansibleRG.getId());
  }

  @Test
  public void fullTestCluster() throws ApiException {

    // Check if all needed adapters are already registered
    assert adapterForType("ansible") != null;

    PoP pop = new PoP();
    pop.setName("tub-os");
    pop.setInterfaceEndpoint("<REPLACE>");
    pop.addInterfaceInfoItem(
        new KeyValuePair().key("auth_url").value("http://<REPLACE>:5000/v2.0"));
    pop.addInterfaceInfoItem(new KeyValuePair().key("password").value("<REPLACE>"));
    pop.addInterfaceInfoItem(new KeyValuePair().key("project_name").value("<REPLACE>"));
    pop.addInterfaceInfoItem(new KeyValuePair().key("username").value("<REPLACE>"));
    pop.addInterfaceInfoItem(new KeyValuePair().key("type").value("openstack"));
    PoP poPR = null;
    try {
      poPR = poPApi.registerPoP(pop);
    } catch (ApiException e) {
      System.err.println("Exception when calling PoPApi#registerPoP");
      e.printStackTrace();
    }

    // Launch Ansible Package

    File ansible = new File("src/test/resources/ansible-package.tar");
    ResourceGroup ansibleRG = packageApi.receivePackage(ansible);
    System.out.print(ansibleRG.toString());

    File ansible2 = new File("src/test/resources/ansible-package2.tar");
    ResourceGroup ansible2RG = packageApi.receivePackage(ansible2);
    System.out.print(ansible2RG.toString());

    ClusterFromResourceGroup clusterFromResourceGroup = new ClusterFromResourceGroup();
    clusterFromResourceGroup.setResourceGroupId(ansible2RG.getId());
    clusterFromResourceGroup.setMasterId(ansible2RG.getVdus().get(0).getId());
    clusterFromResourceGroup.addTypeItem("kubernetes");

    Cluster cluster = clusterApi.createCluster(clusterFromResourceGroup);
    System.out.print(cluster.toString());

    clusterApi.addWorker(cluster.getId(), ansibleRG.getVdus().get(0).getId());

    clusterApi.deleteCluster(cluster.getId());
    packageApi.deletePackage(ansibleRG.getId());
    packageApi.deletePackage(ansible2RG.getId());
  }

  private Adapter adapterForType(String type) throws ApiException {
    Adapter adapter = null;
    List<Adapter> pops = adapterApi.getAllAdapters();
    for (Adapter a : pops) {
      if (a.getType().equals("ansible")) adapter = a;
    }
    return adapter;
  }
}
