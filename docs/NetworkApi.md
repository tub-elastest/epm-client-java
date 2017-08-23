# NetworkApi

All URIs are relative to *https://localhost:8180/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createNetwork**](NetworkApi.md#createNetwork) | **POST** /network | Creates a new network.
[**deleteNetwork**](NetworkApi.md#deleteNetwork) | **DELETE** /network/{id} | Deletes a network.
[**getAllNetworks**](NetworkApi.md#getAllNetworks) | **GET** /network | Returns all existing networks.
[**getNetworkById**](NetworkApi.md#getNetworkById) | **GET** /network/{id} | Returns a network.
[**updateNetwork**](NetworkApi.md#updateNetwork) | **PATCH** /network/{id} | Updates a Network.


<a name="createNetwork"></a>
# **createNetwork**
> Network createNetwork(body)

Creates a new network.

Creates a new network in the target cloud environment with the given CIDR.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.NetworkApi;


NetworkApi apiInstance = new NetworkApi();
Network body = new Network(); // Network | Defintion of a Network which has to be created on a certain PoP
try {
    Network result = apiInstance.createNetwork(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NetworkApi#createNetwork");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Network**](Network.md)| Defintion of a Network which has to be created on a certain PoP |

### Return type

[**Network**](Network.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteNetwork"></a>
# **deleteNetwork**
> String deleteNetwork(id)

Deletes a network.

Deletes the network that matches with a given ID.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.NetworkApi;


NetworkApi apiInstance = new NetworkApi();
String id = "id_example"; // String | ID of Network
try {
    String result = apiInstance.deleteNetwork(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NetworkApi#deleteNetwork");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| ID of Network |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getAllNetworks"></a>
# **getAllNetworks**
> List&lt;Network&gt; getAllNetworks()

Returns all existing networks.

Returns all networks with all details.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.NetworkApi;


NetworkApi apiInstance = new NetworkApi();
try {
    List<Network> result = apiInstance.getAllNetworks();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NetworkApi#getAllNetworks");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Network&gt;**](Network.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getNetworkById"></a>
# **getNetworkById**
> Network getNetworkById(id)

Returns a network.

Returns the network with the given ID. Returns all its details.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.NetworkApi;


NetworkApi apiInstance = new NetworkApi();
String id = "id_example"; // String | ID of Network
try {
    Network result = apiInstance.getNetworkById(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NetworkApi#getNetworkById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| ID of Network |

### Return type

[**Network**](Network.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateNetwork"></a>
# **updateNetwork**
> Network updateNetwork(id, body)

Updates a Network.

Updates an existing Network.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.NetworkApi;


NetworkApi apiInstance = new NetworkApi();
String id = "id_example"; // String | ID of Network
Network body = new Network(); // Network | Network that needs to be updated.
try {
    Network result = apiInstance.updateNetwork(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NetworkApi#updateNetwork");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| ID of Network |
 **body** | [**Network**](Network.md)| Network that needs to be updated. |

### Return type

[**Network**](Network.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

