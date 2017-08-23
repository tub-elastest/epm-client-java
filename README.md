# swagger-java-client

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
    <groupId>io.swagger</groupId>
    <artifactId>swagger-java-client</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.swagger:swagger-java-client:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/swagger-java-client-1.0.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.NetworkApi;

import java.io.File;
import java.util.*;

public class NetworkApiExample {

    public static void main(String[] args) {
        
        NetworkApi apiInstance = new NetworkApi();
        Network body = new Network(); // Network | Defintion of a Network which has to be created on a certain PoP
        try {
            Network result = apiInstance.createNetworkUsingPOST(body);
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
*NetworkApi* | [**createNetworkUsingPOST**](docs/NetworkApi.md#createNetworkUsingPOST) | **POST** /network | Creates a new network.
*NetworkApi* | [**deleteNetworkUsingDELETE**](docs/NetworkApi.md#deleteNetworkUsingDELETE) | **DELETE** /network/{id} | Deletes a network.
*NetworkApi* | [**getAllNetworksUsingGET**](docs/NetworkApi.md#getAllNetworksUsingGET) | **GET** /network | Returns all existing networks.
*NetworkApi* | [**getNetworkByIdUsingGET**](docs/NetworkApi.md#getNetworkByIdUsingGET) | **GET** /network/{id} | Returns a network.
*NetworkApi* | [**updateNetworkUsingPATCH**](docs/NetworkApi.md#updateNetworkUsingPATCH) | **PATCH** /network/{id} | Updates a Network.
*PoPApi* | [**getAllPoPsUsingGET**](docs/PoPApi.md#getAllPoPsUsingGET) | **GET** /pop | Returns all PoPs.
*PoPApi* | [**getPoPByIdUsingGET**](docs/PoPApi.md#getPoPByIdUsingGET) | **GET** /pop/{id} | Returns a PoP.
*PoPApi* | [**registerPoPUsingPOST**](docs/PoPApi.md#registerPoPUsingPOST) | **POST** /pop | Registers a new PoP
*PoPApi* | [**unregisterPoPUsingDELETE**](docs/PoPApi.md#unregisterPoPUsingDELETE) | **DELETE** /pop/{id} | Unregisters a PoP.
*PoPApi* | [**updatePoPUsingPATCH**](docs/PoPApi.md#updatePoPUsingPATCH) | **PATCH** /pop/{id} | Updates a PoP.
*VDUApi* | [**deleteVduUsingDELETE**](docs/VDUApi.md#deleteVduUsingDELETE) | **DELETE** /vdu/{id} | Terminates a VDU.
*VDUApi* | [**deployVduUsingPOST**](docs/VDUApi.md#deployVduUsingPOST) | **POST** /vdu | Allocates resources in the target cloud.
*VDUApi* | [**getAllVdusUsingGET**](docs/VDUApi.md#getAllVdusUsingGET) | **GET** /vdu | Returns all VDUs.
*VDUApi* | [**getVduByIdUsingGET**](docs/VDUApi.md#getVduByIdUsingGET) | **GET** /vdu/{id} | Returns a VDU.
*VDUApi* | [**updateVduUsingPATCH**](docs/VDUApi.md#updateVduUsingPATCH) | **PATCH** /vdu/{id} | Updates a VDU.


## Documentation for Models

 - [Event](docs/Event.md)
 - [KeyValuePair](docs/KeyValuePair.md)
 - [Network](docs/Network.md)
 - [PoP](docs/PoP.md)
 - [VDU](docs/VDU.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



