package io.elastest.epm.client.api.integration;

import io.elastest.epm.client.ApiClient;
import io.elastest.epm.client.ApiException;
import io.elastest.epm.client.api.PackageApi;
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


    @Before
    public void init() {
        ApiClient apiClient = new ApiClient();
        apiClient.setBasePath("http://localhost:8180/v1");
        packageApi.setApiClient(apiClient);
    }

    @Test
    public void sendAndDeletePackage() throws ApiException {
        File testPackage = new File("src/test/resources/compose-package.tar");
        ResourceGroup resourceGroup = packageApi.receivePackage(testPackage);
        packageApi.deletePackage(resourceGroup.getId());
    }
}
