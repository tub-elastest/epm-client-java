# VDUApi

All URIs are relative to *https://localhost:8180/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteVdu**](VDUApi.md#deleteVdu) | **DELETE** /vdu/{id} | Terminates a VDU.
[**deployVdu**](VDUApi.md#deployVdu) | **POST** /vdu | Allocates resources in the target cloud.
[**getAllVdus**](VDUApi.md#getAllVdus) | **GET** /vdu | Returns all VDUs.
[**getVduById**](VDUApi.md#getVduById) | **GET** /vdu/{id} | Returns a VDU.
[**updateVdu**](VDUApi.md#updateVdu) | **PATCH** /vdu/{id} | Updates a VDU.


<a name="deleteVdu"></a>
# **deleteVdu**
> String deleteVdu(id)

Terminates a VDU.

Terminates the VDU that matches with a given ID.

### Example
```java
// Import classes:
//import io.elastest.epm.client.ApiException;
//import io.elastest.epm.client.api.VDUApi;


VDUApi apiInstance = new VDUApi();
String id = "id_example"; // String | ID of VDU
try {
    String result = apiInstance.deleteVdu(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VDUApi#deleteVdu");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| ID of VDU |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="deployVdu"></a>
# **deployVdu**
> VDU deployVdu(body)

Allocates resources in the target cloud.

Allocates resources defined as a VDU in the cloud to be deployed in the target cloud environment. It instantiates computing resources, deploys artifacts on them and manages the their lifecycle

### Example
```java
// Import classes:
//import io.elastest.epm.client.ApiException;
//import io.elastest.epm.client.api.VDUApi;


VDUApi apiInstance = new VDUApi();
VDU body = new VDU(); // VDU | Defintion of a VDU which defines resources that have to be deployed
try {
    VDU result = apiInstance.deployVdu(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VDUApi#deployVdu");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**VDU**](VDU.md)| Defintion of a VDU which defines resources that have to be deployed |

### Return type

[**VDU**](VDU.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAllVdus"></a>
# **getAllVdus**
> List&lt;VDU&gt; getAllVdus()

Returns all VDUs.

Returns all VDUs with all its details.

### Example
```java
// Import classes:
//import io.elastest.epm.client.ApiException;
//import io.elastest.epm.client.api.VDUApi;


VDUApi apiInstance = new VDUApi();
try {
    List<VDU> result = apiInstance.getAllVdus();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VDUApi#getAllVdus");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;VDU&gt;**](VDU.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVduById"></a>
# **getVduById**
> VDU getVduById(id)

Returns a VDU.

Returns the VDU with the given ID. Returns all its details.

### Example
```java
// Import classes:
//import io.elastest.epm.client.ApiException;
//import io.elastest.epm.client.api.VDUApi;


VDUApi apiInstance = new VDUApi();
String id = "id_example"; // String | ID of VDU
try {
    VDU result = apiInstance.getVduById(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VDUApi#getVduById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| ID of VDU |

### Return type

[**VDU**](VDU.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateVdu"></a>
# **updateVdu**
> VDU updateVdu(id, body)

Updates a VDU.

Updates an already deployed VDU.

### Example
```java
// Import classes:
//import io.elastest.epm.client.ApiException;
//import io.elastest.epm.client.api.VDUApi;


VDUApi apiInstance = new VDUApi();
String id = "id_example"; // String | ID of VDU
VDU body = new VDU(); // VDU | VDU object that needs to be updated.
try {
    VDU result = apiInstance.updateVdu(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VDUApi#updateVdu");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| ID of VDU |
 **body** | [**VDU**](VDU.md)| VDU object that needs to be updated. |

### Return type

[**VDU**](VDU.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

