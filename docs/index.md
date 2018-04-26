# EPM SDK for Java

This repository provides an SDK for Java to be used for the ElasTest Platform Manager.

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>io.elastest</groupId>
    <artifactId>epm.client</artifactId>
    <version>0.9.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.elastest:epm.client:0.9.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/epm.client-0.9.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import io.elastest.epm.client.*;
import io.elastest.epm.client.auth.*;
import io.elastest.epm.client.model.*;
import io.elastest.epm.client.api.NetworkApi;

import java.io.File;
import java.util.*;

public class NetworkApiExample {

    public static void main(String[] args) {
        
        NetworkApi apiInstance = new NetworkApi();
        Network body = new Network(); // Network | Defintion of a Network which has to be created on a certain PoP
        try {
            Network result = apiInstance.createNetwork(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NetworkApi#createNetworkUsingPOST");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://localhost:8180/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AdapterApi* | [**getAllAdapters**](docs/AdapterApi.md#getAllAdapters) | **GET** /adapters | Returns all registered adapters
*KeyApi* | [**addKey**](docs/KeyApi.md#addKey) | **POST** /keys | Uploads a key to the EPM.
*KeyApi* | [**deleteKey**](docs/KeyApi.md#deleteKey) | **DELETE** /keys/{id} | Deletes a Key.
*KeyApi* | [**getAllKeys**](docs/KeyApi.md#getAllKeys) | **GET** /keys | Returns all available Keys
*NetworkApi* | [**createNetwork**](docs/NetworkApi.md#createNetwork) | **POST** /network | Creates a new network.
*NetworkApi* | [**deleteNetwork**](docs/NetworkApi.md#deleteNetwork) | **DELETE** /network/{id} | Deletes a network.
*NetworkApi* | [**getAllNetworks**](docs/NetworkApi.md#getAllNetworks) | **GET** /network | Returns all existing networks.
*NetworkApi* | [**getNetworkById**](docs/NetworkApi.md#getNetworkById) | **GET** /network/{id} | Returns a network.
*NetworkApi* | [**updateNetwork**](docs/NetworkApi.md#updateNetwork) | **PATCH** /network/{id} | Updates a Network.
*PackageApi* | [**deletePackage**](docs/PackageApi.md#deletePackage) | **DELETE** /packages/{id} | Deletes a package.
*PackageApi* | [**receivePackage**](docs/PackageApi.md#receivePackage) | **POST** /packages | Receives a package.
*PoPApi* | [**getAllPoPs**](docs/PoPApi.md#getAllPoPs) | **GET** /pop | Returns all PoPs.
*PoPApi* | [**getPoPById**](docs/PoPApi.md#getPoPById) | **GET** /pop/{id} | Returns a PoP.
*PoPApi* | [**registerPoP**](docs/PoPApi.md#registerPoP) | **POST** /pop | Registers a new PoP
*PoPApi* | [**unregisterPoP**](docs/PoPApi.md#unregisterPoP) | **DELETE** /pop/{id} | Unregisters a PoP.
*PoPApi* | [**updatePoP**](docs/PoPApi.md#updatePoP) | **PATCH** /pop/{id} | Updates a PoP.
*ResourceGroupApi* | [**createResourceGroup**](docs/ResourceGroupApi.md#createResourceGroup) | **POST** /resourceGroup | Creates a new Resource Group.
*ResourceGroupApi* | [**deleteResourceGroup**](docs/ResourceGroupApi.md#deleteResourceGroup) | **DELETE** /resourceGroup/{id} | Deletes a Resource Group.
*ResourceGroupApi* | [**getAllResourceGroups**](docs/ResourceGroupApi.md#getAllResourceGroups) | **GET** /resourceGroup | Returns all Resource Groups.
*ResourceGroupApi* | [**getResourceGroupById**](docs/ResourceGroupApi.md#getResourceGroupById) | **GET** /resourceGroup/{id} | Returns a Resource Group.
*ResourceGroupApi* | [**updateResourceGroup**](docs/ResourceGroupApi.md#updateResourceGroup) | **PATCH** /resourceGroup/{id} | Updates a ResourceGroup.
*RuntimeApi* | [**downloadFileFromInstance**](docs/RuntimeApi.md#downloadFileFromInstance) | **GET** /runtime/{id}/file | Downloads a file from a VDU.
*RuntimeApi* | [**executeOnInstance**](docs/RuntimeApi.md#executeOnInstance) | **PUT** /runtime/{id}/action/execute | Executes given command on the given VDU.
*RuntimeApi* | [**startInstance**](docs/RuntimeApi.md#startInstance) | **PUT** /runtime/{id}/action/start | Starts the given VDU.
*RuntimeApi* | [**stopInstance**](docs/RuntimeApi.md#stopInstance) | **PUT** /runtime/{id}/action/stop | Stops the given VDU.
*RuntimeApi* | [**uploadFileToInstanceByFile**](docs/RuntimeApi.md#uploadFileToInstanceByFile) | **POST** /runtime/{id}/file | Uploads a file to a VDU.
*RuntimeApi* | [**uploadFileToInstanceByPath**](docs/RuntimeApi.md#uploadFileToInstanceByPath) | **POST** /runtime/{id}/path | Uploads a file to a VDU.
*TOSCAApi* | [**deployToscaTemplate**](docs/TOSCAApi.md#deployToscaTemplate) | **POST** /tosca | Deploys a Tosca template.
*VDUApi* | [**deleteVdu**](docs/VDUApi.md#deleteVdu) | **DELETE** /vdu/{id} | Terminates a VDU.
*VDUApi* | [**deployVdu**](docs/VDUApi.md#deployVdu) | **POST** /vdu | Allocates resources in the target cloud.
*VDUApi* | [**getAllVdus**](docs/VDUApi.md#getAllVdus) | **GET** /vdu | Returns all VDUs.
*VDUApi* | [**getVduById**](docs/VDUApi.md#getVduById) | **GET** /vdu/{id} | Returns a VDU.
*VDUApi* | [**updateVdu**](docs/VDUApi.md#updateVdu) | **PATCH** /vdu/{id} | Updates a VDU.
*WorkerApi* | [**deleteWorker**](docs/WorkerApi.md#deleteWorker) | **DELETE** /workers/{id} | Deletes a Resource Group.
*WorkerApi* | [**getAllWorkers**](docs/WorkerApi.md#getAllWorkers) | **GET** /workers | Returns all registered workers
*WorkerApi* | [**installAdapter**](docs/WorkerApi.md#installAdapter) | **GET** /workers/{id}/{type} | Sets up the specified worker to install the specified type of adapter.
*WorkerApi* | [**registerWorker**](docs/WorkerApi.md#registerWorker) | **POST** /workers | Registers the worker and saves the information.


## Documentation for Models

 - [Adapter](docs/Adapter.md)
 - [CommandExecutionBody](docs/CommandExecutionBody.md)
 - [Event](docs/Event.md)
 - [FileDownloadBody](docs/FileDownloadBody.md)
 - [FileUploadBody](docs/FileUploadBody.md)
 - [Key](docs/Key.md)
 - [KeyValuePair](docs/KeyValuePair.md)
 - [Network](docs/Network.md)
 - [PoP](docs/PoP.md)
 - [ResourceGroup](docs/ResourceGroup.md)
 - [VDU](docs/VDU.md)
 - [Worker](docs/Worker.md)



## Documentation for Authorization

All endpoints do not require authorization.

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.
