# WorkerApi

All URIs are relative to *https://localhost:8180/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createWorker**](WorkerApi.md#createWorker) | **POST** /workers/create | Creates a new worker.
[**deleteWorker**](WorkerApi.md#deleteWorker) | **DELETE** /workers/{id} | Deletes a Worker.
[**getAllWorkers**](WorkerApi.md#getAllWorkers) | **GET** /workers | Returns all registered workers
[**installAdapter**](WorkerApi.md#installAdapter) | **GET** /workers/{id}/{type} | Sets up the specified worker to install the specified type of adapter.
[**registerWorker**](WorkerApi.md#registerWorker) | **POST** /workers | Registers the worker and saves the information.


<a name="createWorker"></a>
# **createWorker**
> Worker createWorker(workerFromVDU)

Creates a new worker.

Receives a package that can be used for creating a new worker.

### Example
```java
// Import classes:
//import io.elastest.epm.client.ApiException;
//import io.elastest.epm.client.api.WorkerApi;


WorkerApi apiInstance = new WorkerApi();
WorkerFromVDU workerFromVDU = new WorkerFromVDU(); // WorkerFromVDU | Body to create Worker from VDU
try {
    Worker result = apiInstance.createWorker(workerFromVDU);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkerApi#createWorker");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workerFromVDU** | [**WorkerFromVDU**](WorkerFromVDU.md)| Body to create Worker from VDU |

### Return type

[**Worker**](Worker.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteWorker"></a>
# **deleteWorker**
> String deleteWorker(id)

Deletes a Worker.

Deletes the Worker that matches with a given ID.

### Example
```java
// Import classes:
//import io.elastest.epm.client.ApiException;
//import io.elastest.epm.client.api.WorkerApi;


WorkerApi apiInstance = new WorkerApi();
String id = "id_example"; // String | ID of Worker
try {
    String result = apiInstance.deleteWorker(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkerApi#deleteWorker");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| ID of Worker |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: *_/_*

<a name="getAllWorkers"></a>
# **getAllWorkers**
> List&lt;Worker&gt; getAllWorkers()

Returns all registered workers

### Example
```java
// Import classes:
//import io.elastest.epm.client.ApiException;
//import io.elastest.epm.client.api.WorkerApi;


WorkerApi apiInstance = new WorkerApi();
try {
    List<Worker> result = apiInstance.getAllWorkers();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkerApi#getAllWorkers");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Worker&gt;**](Worker.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="installAdapter"></a>
# **installAdapter**
> String installAdapter(id, type)

Sets up the specified worker to install the specified type of adapter.

### Example
```java
// Import classes:
//import io.elastest.epm.client.ApiException;
//import io.elastest.epm.client.api.WorkerApi;


WorkerApi apiInstance = new WorkerApi();
String id = "id_example"; // String | ID of Worker
String type = "type_example"; // String | type of adapter
try {
    String result = apiInstance.installAdapter(id, type);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkerApi#installAdapter");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| ID of Worker |
 **type** | **String**| type of adapter |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="registerWorker"></a>
# **registerWorker**
> Worker registerWorker(body)

Registers the worker and saves the information.

This registers a worker with the information provided.

### Example
```java
// Import classes:
//import io.elastest.epm.client.ApiException;
//import io.elastest.epm.client.api.WorkerApi;


WorkerApi apiInstance = new WorkerApi();
Worker body = new Worker(); // Worker | worker in a json
try {
    Worker result = apiInstance.registerWorker(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkerApi#registerWorker");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Worker**](Worker.md)| worker in a json |

### Return type

[**Worker**](Worker.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

