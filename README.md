[![][ElasTest Logo]][ElasTest]

Copyright © 2017-2019 [ElasTest]. Licensed under [Apache 2.0 License].

# EPM client for java

# What is ElasTest

This repository is part of [ElasTest], which is an open source elastic platform
aimed to simplify end-to-end testing. ElasTest platform is based on three
principles: i) Test orchestration: Combining intelligently testing units for
creating a more complete test suite following the “divide and conquer” principle.
ii) Instrumentation and monitoring: Customizing the SuT (Subject under Test)
infrastructure so that it reproduces real-world operational behavior and allowing
to gather relevant information during testing. iii) Test recommendation: Using machine
learning and cognitive computing for recommending testing actions and providing
testers with friendly interactive facilities for decision taking.

# Documentation

The [ElasTest] project provides detailed documentation including tutorials,
installation and development guide.

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
    <version>0.0.1</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.elastest:epm.client:0.0.1"
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
*NetworkApi* | [**createNetwork**](docs/NetworkApi.md#createNetwork) | **POST** /network | Creates a new network.
*NetworkApi* | [**deleteNetwork**](docs/NetworkApi.md#deleteNetwork) | **DELETE** /network/{id} | Deletes a network.
*NetworkApi* | [**getAllNetworks**](docs/NetworkApi.md#getAllNetworks) | **GET** /network | Returns all existing networks.
*NetworkApi* | [**getNetworkById**](docs/NetworkApi.md#getNetworkById) | **GET** /network/{id} | Returns a network.
*NetworkApi* | [**updateNetwork**](docs/NetworkApi.md#updateNetwork) | **PATCH** /network/{id} | Updates a Network.
*PoPApi* | [**getAllPoPs**](docs/PoPApi.md#getAllPoPs) | **GET** /pop | Returns all PoPs.
*PoPApi* | [**getPoPById**](docs/PoPApi.md#getPoPById) | **GET** /pop/{id} | Returns a PoP.
*PoPApi* | [**registerPoP**](docs/PoPApi.md#registerPoP) | **POST** /pop | Registers a new PoP
*PoPApi* | [**unregisterPoP**](docs/PoPApi.md#unregisterPoP) | **DELETE** /pop/{id} | Unregisters a PoP.
*PoPApi* | [**updatePoP**](docs/PoPApi.md#updatePoP) | **PATCH** /pop/{id} | Updates a PoP.
*VDUApi* | [**deleteVdu**](docs/VDUApi.md#deleteVdu) | **DELETE** /vdu/{id} | Terminates a VDU.
*VDUApi* | [**deployVdu**](docs/VDUApi.md#deployVdu) | **POST** /vdu | Allocates resources in the target cloud.
*VDUApi* | [**getAllVdus**](docs/VDUApi.md#getAllVdus) | **GET** /vdu | Returns all VDUs.
*VDUApi* | [**getVduById**](docs/VDUApi.md#getVduById) | **GET** /vdu/{id} | Returns a VDU.
*VDUApi* | [**updateVdu**](docs/VDUApi.md#updateVdu) | **PATCH** /vdu/{id} | Updates a VDU.
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

# Source
Source code for other ElasTest projects can be found in the [GitHub ElasTest
Group].

# News
Follow us on Twitter @[ElasTest Twitter].

# Contribution policy
You can contribute to the ElasTest community through bug-reports, bug-fixes,
new code or new documentation. For contributing to the ElasTest community,
you can use the issue support of GitHub providing full information about your
contribution and its value. In your contributions, you must comply with the
following guidelines

* You must specify the specific contents of your contribution either through a
  detailed bug description, through a pull-request or through a patch.
* You must specify the licensing restrictions of the code you contribute.
* For newly created code to be incorporated in the ElasTest code-base, you
  must accept ElasTest to own the code copyright, so that its open source
  nature is guaranteed.
* You must justify appropriately the need and value of your contribution. The
  ElasTest project has no obligations in relation to accepting contributions
  from third parties.
* The ElasTest project leaders have the right of asking for further
  explanations, tests or validations of any code contributed to the community
  before it being incorporated into the ElasTest code-base. You must be ready
  to addressing all these kind of concerns before having your code approved.

# Licensing and distribution
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

  http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.


[Apache 2.0 License]: http://www.apache.org/licenses/LICENSE-2.0
[ElasTest]: http://elastest.io/
[ElasTest Logo]: http://elastest.io/images/logos_elastest/elastest-logo-gray-small.png
[ElasTest Twitter]: https://twitter.com/elastestio
[GitHub ElasTest Group]: https://github.com/elastest
[Bugtracker]: https://github.com/elastest/bugtracker



