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
    <version>0.8.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.elastest:epm.client:0.8.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/epm.client-0.8.0.jar
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
*NetworkApi* | [**createNetwork**](NetworkApi.md#createNetwork) | **POST** /network | Creates a new network.
*NetworkApi* | [**deleteNetwork**](NetworkApi.md#deleteNetwork) | **DELETE** /network/{id} | Deletes a network.
*NetworkApi* | [**getAllNetworks**](NetworkApi.md#getAllNetworks) | **GET** /network | Returns all existing networks.
*NetworkApi* | [**getNetworkById**](NetworkApi.md#getNetworkById) | **GET** /network/{id} | Returns a network.
*NetworkApi* | [**updateNetwork**](NetworkApi.md#updateNetwork) | **PATCH** /network/{id} | Updates a Network.
*PackageApi* | [**deletePackage**](PackageApi.md#deletePackage) | **DELETE** /packages/{id} | Deletes a package.
*PackageApi* | [**receivePackage**](PackageApi.md#receivePackage) | **POST** /packages | Receives a package.
*PoPApi* | [**getAllPoPs**](PoPApi.md#getAllPoPs) | **GET** /pop | Returns all PoPs.
*PoPApi* | [**getPoPById**](PoPApi.md#getPoPById) | **GET** /pop/{id} | Returns a PoP.
*PoPApi* | [**registerPoP**](PoPApi.md#registerPoP) | **POST** /pop | Registers a new PoP
*PoPApi* | [**unregisterPoP**](PoPApi.md#unregisterPoP) | **DELETE** /pop/{id} | Unregisters a PoP.
*PoPApi* | [**updatePoP**](PoPApi.md#updatePoP) | **PATCH** /pop/{id} | Updates a PoP.
*ResourceGroupApi* | [**createResourceGroup**](ResourceGroupApi.md#createResourceGroup) | **POST** /resourceGroup | Creates a new Resource Group.
*ResourceGroupApi* | [**deleteResourceGroup**](ResourceGroupApi.md#deleteResourceGroup) | **DELETE** /resourceGroup/{id} | Deletes a Resource Group.
*ResourceGroupApi* | [**getAllResourceGroups**](ResourceGroupApi.md#getAllResourceGroups) | **GET** /resourceGroup | Returns all Resource Groups.
*ResourceGroupApi* | [**getResourceGroupById**](ResourceGroupApi.md#getResourceGroupById) | **GET** /resourceGroup/{id} | Returns a Resource Group.
*ResourceGroupApi* | [**updateResourceGroup**](ResourceGroupApi.md#updateResourceGroup) | **PATCH** /resourceGroup/{id} | Updates a ResourceGroup.
*RuntimeApi* | [**downloadFileFromInstance**](RuntimeApi.md#downloadFileFromInstance) | **GET** /runtime/{id}/file | Downloads a file from a VDU.
*RuntimeApi* | [**executeOnInstance**](RuntimeApi.md#executeOnInstance) | **PUT** /runtime/{id}/action/execute | Executes given command on the given VDU.
*RuntimeApi* | [**startInstance**](RuntimeApi.md#startInstance) | **PUT** /runtime/{id}/action/start | Starts the given VDU.
*RuntimeApi* | [**stopInstance**](RuntimeApi.md#stopInstance) | **PUT** /runtime/{id}/action/stop | Stops the given VDU.
*RuntimeApi* | [**uploadFileToInstanceByFile**](RuntimeApi.md#uploadFileToInstanceByFile) | **POST** /runtime/{id}/file | Uploads a file to a VDU.
*RuntimeApi* | [**uploadFileToInstanceByPath**](RuntimeApi.md#uploadFileToInstanceByPath) | **POST** /runtime/{id}/path | Uploads a file to a VDU.
*TOSCAApi* | [**deployToscaTemplate**](TOSCAApi.md#deployToscaTemplate) | **POST** /tosca | Deploys a Tosca template.
*VDUApi* | [**deleteVdu**](VDUApi.md#deleteVdu) | **DELETE** /vdu/{id} | Terminates a VDU.
*VDUApi* | [**deployVdu**](VDUApi.md#deployVdu) | **POST** /vdu | Allocates resources in the target cloud.
*VDUApi* | [**getAllVdus**](VDUApi.md#getAllVdus) | **GET** /vdu | Returns all VDUs.
*VDUApi* | [**getVduById**](VDUApi.md#getVduById) | **GET** /vdu/{id} | Returns a VDU.
*VDUApi* | [**updateVdu**](VDUApi.md#updateVdu) | **PATCH** /vdu/{id} | Updates a VDU.


## Documentation for Models

 - [Event](Event.md)
 - [KeyValuePair](KeyValuePair.md)
 - [Network](Network.md)
 - [PoP](PoP.md)
 - [VDU](VDU.md)


## Documentation for Authorization

All endpoints do not require authorization.

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.
