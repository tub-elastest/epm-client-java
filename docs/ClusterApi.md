# ClusterApi

All URIs are relative to *https://localhost:8180/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addWorker**](ClusterApi.md#addWorker) | **GET** /cluster/{id}/add/{machineId} | Adds a worker to the cluster.
[**createCluster**](ClusterApi.md#createCluster) | **POST** /cluster/create | Creates a new cluster.
[**deleteCluster**](ClusterApi.md#deleteCluster) | **DELETE** /cluster/{id} | Deletes a Cluster.
[**getAllClusters**](ClusterApi.md#getAllClusters) | **GET** /cluster | Returns all clusters
[**setUpCluster**](ClusterApi.md#setUpCluster) | **GET** /cluster/{id}/{type} | Sets up the specified cluster to install the specified technology and connected it.


<a name="addWorker"></a>
# **addWorker**
> String addWorker(id, machineId)

Adds a worker to the cluster.

### Example
```java
// Import classes:
//import io.elastest.epm.client.ApiException;
//import io.elastest.epm.client.api.ClusterApi;


ClusterApi apiInstance = new ClusterApi();
String id = "id_example"; // String | ID of Cluster
String machineId = "machineId_example"; // String | The ID of either a Worker or a VDU, which will be added to the cluster
try {
    String result = apiInstance.addWorker(id, machineId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClusterApi#addWorker");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| ID of Cluster |
 **machineId** | **String**| The ID of either a Worker or a VDU, which will be added to the cluster |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createCluster"></a>
# **createCluster**
> Cluster createCluster(clusterFromResourceGroup)

Creates a new cluster.

Receives an Identifier for a ResourceGroup and an array of types to setup the Resource Group as a cluster.

### Example
```java
// Import classes:
//import io.elastest.epm.client.ApiException;
//import io.elastest.epm.client.api.ClusterApi;


ClusterApi apiInstance = new ClusterApi();
ClusterFromResourceGroup clusterFromResourceGroup = new ClusterFromResourceGroup(); // ClusterFromResourceGroup | Body to create Cluster from ResourceGroup
try {
    Cluster result = apiInstance.createCluster(clusterFromResourceGroup);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClusterApi#createCluster");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clusterFromResourceGroup** | [**ClusterFromResourceGroup**](ClusterFromResourceGroup.md)| Body to create Cluster from ResourceGroup |

### Return type

[**Cluster**](Cluster.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteCluster"></a>
# **deleteCluster**
> String deleteCluster(id)

Deletes a Cluster.

Deletes the Cluster that matches with a given ID.

### Example
```java
// Import classes:
//import io.elastest.epm.client.ApiException;
//import io.elastest.epm.client.api.ClusterApi;


ClusterApi apiInstance = new ClusterApi();
String id = "id_example"; // String | ID of Cluster
try {
    String result = apiInstance.deleteCluster(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClusterApi#deleteCluster");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| ID of Cluster |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: *_/_*

<a name="getAllClusters"></a>
# **getAllClusters**
> List&lt;Cluster&gt; getAllClusters()

Returns all clusters

### Example
```java
// Import classes:
//import io.elastest.epm.client.ApiException;
//import io.elastest.epm.client.api.ClusterApi;


ClusterApi apiInstance = new ClusterApi();
try {
    List<Cluster> result = apiInstance.getAllClusters();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClusterApi#getAllClusters");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Cluster&gt;**](Cluster.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="setUpCluster"></a>
# **setUpCluster**
> String setUpCluster(id, type)

Sets up the specified cluster to install the specified technology and connected it.

### Example
```java
// Import classes:
//import io.elastest.epm.client.ApiException;
//import io.elastest.epm.client.api.ClusterApi;


ClusterApi apiInstance = new ClusterApi();
String id = "id_example"; // String | ID of Cluster
String type = "type_example"; // String | type of technology
try {
    String result = apiInstance.setUpCluster(id, type);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClusterApi#setUpCluster");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| ID of Cluster |
 **type** | **String**| type of technology |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

