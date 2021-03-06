/*
 * EPM REST API
 * REST API description of the ElasTest Platform Manager Module.
 *
 * OpenAPI spec version: 0.1.2
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.elastest.epm.client.api.integration;

import io.elastest.epm.client.ApiClient;
import io.elastest.epm.client.ApiException;
import io.elastest.epm.client.api.*;
import io.elastest.epm.client.model.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.BasicConfigurator;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/** API tests for NetworkApi */
@Ignore
public class RealApiTest {

  private Logger log = LoggerFactory.getLogger(RealApiTest.class);

  private final NetworkApi networkApi = new NetworkApi();
  private final VDUApi vduApi = new VDUApi();
  private final PoPApi popApi = new PoPApi();
  private final ResourceGroupApi resourceGroupApi = new ResourceGroupApi();
  private final TOSCAApi toscaApi = new TOSCAApi();
  private final PackageApi packageApi = new PackageApi();
  private final RuntimeApi runtimeApi = new RuntimeApi();

  @Before
  public void init() {
    ApiClient apiClient = new ApiClient();
    apiClient.setBasePath("http://localhost:8180/v1");
    networkApi.setApiClient(apiClient);
    vduApi.setApiClient(apiClient);
    popApi.setApiClient(apiClient);
    resourceGroupApi.setApiClient(apiClient);
    runtimeApi.setApiClient(apiClient);
    packageApi.setApiClient(apiClient);
    BasicConfigurator.configure();
    log.info("Starting ResourceGroupManagementTest");
  }

  @Test
  @Ignore
  public void listAll() throws ApiException {
    listResourceGroups();
    listPoPs();
    listNetworks();
    listVdus();
  }

  @Test
  @Ignore
  public void completeResourceGroupTest() throws ApiException {
    ResourceGroup resourceGroup = deployResourceGroup();
    listResourceGroups();

    terminateResourceGroup(resourceGroup);
  }

  @Test
  @Ignore
  public void completePopNetworkVduTest() throws ApiException, FileNotFoundException {
    PoP pop = createPop();
    pop = popApi.registerPoP(pop);
    listPoPs();
    Network network = createNetwork(pop.getName());
    network = networkApi.createNetwork(network);
    listNetworks();
    VDU vdu = vduApi.deployVdu(createVdu(pop.getName(), network.getName()));

    log.info("Status: " + vdu.getStatus());
    log.info("IP address: " + vdu.getIp());

    listVdus();

    String vduId = vdu.getId();
    //        String vduId = "a21fef65-31f6-4782-9b43-7ec35b99de46";

    runtimeApi.startInstance(vduId);

    executeCommand(vduId, "mkdir /test");

    File file = new File("/tmp/test.txt");
    PrintWriter pw = new PrintWriter(file);
    pw.println("this is a test file");
    pw.close();

    FileUploadBody fileUploadBody = new FileUploadBody();
    fileUploadBody.setHostPath(file.getAbsolutePath());
    fileUploadBody.setRemotePath("/test");
    runtimeApi.uploadFileToInstanceByPath(vduId, fileUploadBody);

    executeCommand(vduId, "ls -la /test/");
    executeCommand(vduId, "mv /test/test.txt /test/test.txt.backup");
    executeCommand(vduId, "ls -la /test/");

    runtimeApi.uploadFileToInstanceByFile(vduId, "/test", file);

    executeCommand(vduId, "ls -la /test/");

    file.delete();

    runtimeApi.stopInstance(vduId);

    runtimeApi.startInstance(vduId);

    vdu = vduApi.getVduById(vduId);

    log.info("VDU: " + vdu);
    log.info("VDU status: " + vdu.getStatus());

    vduApi.deleteVdu(vdu.getId());

    networkApi.deleteNetwork(network.getId());

    popApi.unregisterPoP(pop.getId());
  }

  private String executeCommand(String vduId, String command) throws ApiException {
    log.info("Execute command: " + command);
    CommandExecutionBody commandExecutionBody = new CommandExecutionBody();
    commandExecutionBody.setCommand(command);
    commandExecutionBody.setAwaitCompletion(true);
    String output = runtimeApi.executeOnInstance(vduId, commandExecutionBody);
    log.info("Output of \"" + command + "\": " + output);
    return output;
  }

  @Test
  @Ignore
  public void cleanResourceGroupTest() throws ApiException {
    List<ResourceGroup> resourceGroupList = listResourceGroups();
    for (ResourceGroup resourceGroup : resourceGroupList) {
      log.info("Deleteing Resource Group: " + resourceGroup);
      resourceGroupApi.deleteResourceGroup(resourceGroup.getId());
    }
  }

  @Test
  @Ignore
  public void sendAndDeletePackage() throws ApiException {
    File testPackage = new File("src/test/resources/compose-package.tar");
    ResourceGroup resourceGroup = packageApi.receivePackage(testPackage);
    log.info(String.valueOf(resourceGroup));
    packageApi.deletePackage(resourceGroup.getId());
  }

  private List<ResourceGroup> listResourceGroups() throws ApiException {
    log.info("Retrieving all existing Resource Groups...");
    List<ResourceGroup> allResourceGroups = resourceGroupApi.getAllResourceGroups();
    log.info("List all existing Resource Groups: " + allResourceGroups);
    return allResourceGroups;
  }

  private List<VDU> listVdus() throws ApiException {
    log.info("Retrieving all existing VDUs...");
    List<VDU> allVdus = vduApi.getAllVdus();
    log.info("List all existing VDUs: " + allVdus);
    return allVdus;
  }

  private List<PoP> listPoPs() throws ApiException {
    log.info("Retrieving all PoPs...");
    List<PoP> allPoPs = popApi.getAllPoPs();
    log.info("Retrieving all PoPs" + allPoPs);
    return allPoPs;
  }

  private List<Network> listNetworks() throws ApiException {
    log.info("Retrieving all Networks...");
    List<Network> allNetworks = networkApi.getAllNetworks();
    log.info("List all Networks: " + allNetworks);
    return allNetworks;
  }

  private ResourceGroup deployResourceGroup() throws ApiException {
    log.info("Deploying Resource Group...");
    ResourceGroup resourceGroup = new ResourceGroup();
    resourceGroup.setName("testingGroup");
    //Definition of PoP(s)
    PoP pop = createPop();
    List<PoP> pops = new ArrayList<>();
    pops.add(pop);
    resourceGroup.setPops(pops);

    //Defintion of Network(s)
    List<Network> networks = new ArrayList<>();
    Network network = createNetwork(pop.getName());
    networks.add(network);
    resourceGroup.setNetworks(networks);

    //Defintion of VDU(s)
    VDU vdu = createVdu(pop.getName(), network.getName());
    List<VDU> vdus = new ArrayList<>();
    vdus.add(vdu);
    resourceGroup.setVdus(vdus);

    //Send request to EPM
    resourceGroup = resourceGroupApi.createResourceGroup(resourceGroup);

    log.info("Deployed Resource Group: " + resourceGroup);
    return resourceGroup;
  }

  private void terminateResourceGroup(ResourceGroup resourceGroup) throws ApiException {
    log.info("Terminating Resource Group: " + resourceGroup);
    resourceGroupApi.deleteResourceGroup(resourceGroup.getId());
    log.info("Terminated Resource Group");
  }

  private PoP createPop() {
    PoP pop = new PoP();
    pop.setName("another-docker-local");
    pop.setInterfaceEndpoint("unix:///var/run/docker.sock");
    KeyValuePair keyValuePair = new KeyValuePair();
    keyValuePair.setKey("type");
    keyValuePair.setValue("docker");
    List<KeyValuePair> keyValuePairs = new ArrayList<>();
    keyValuePairs.add(keyValuePair);
    pop.setInterfaceInfo(keyValuePairs);
    return pop;
  }

  private Network createNetwork(String popName) {
    Network network = new Network();
    network.setName("docker-test-network");
    network.setPoPName(popName);
    // network.setCidr("192.168.4.1/24");
    return network;
  }

  private VDU createVdu(String popName, String networkName) {
    VDU vdu = new VDU();
    vdu.setName("testContainer");
    vdu.setPoPName(popName);
    vdu.setImageName("elastest/elastest-platform-manager");
    vdu.setNetName(networkName);
    return vdu;
  }
}
