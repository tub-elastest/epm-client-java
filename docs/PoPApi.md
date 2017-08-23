# PoPApi

All URIs are relative to *https://localhost:8180/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAllPoPs**](PoPApi.md#getAllPoPs) | **GET** /pop | Returns all PoPs.
[**getPoPById**](PoPApi.md#getPoPById) | **GET** /pop/{id} | Returns a PoP.
[**registerPoP**](PoPApi.md#registerPoP) | **POST** /pop | Registers a new PoP
[**unregisterPoP**](PoPApi.md#unregisterPoP) | **DELETE** /pop/{id} | Unregisters a PoP.
[**updatePoP**](PoPApi.md#updatePoP) | **PATCH** /pop/{id} | Updates a PoP.


<a name="getAllPoPs"></a>
# **getAllPoPs**
> List&lt;PoP&gt; getAllPoPs()

Returns all PoPs.

Returns all PoPs with all its details.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PoPApi;


PoPApi apiInstance = new PoPApi();
try {
    List<PoP> result = apiInstance.getAllPoPs();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PoPApi#getAllPoPs");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;PoP&gt;**](PoP.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getPoPById"></a>
# **getPoPById**
> PoP getPoPById(id)

Returns a PoP.

Returns the PoP with the given ID. Returns all its details.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PoPApi;


PoPApi apiInstance = new PoPApi();
String id = "id_example"; // String | ID of PoP
try {
    PoP result = apiInstance.getPoPById(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PoPApi#getPoPById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| ID of PoP |

### Return type

[**PoP**](PoP.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="registerPoP"></a>
# **registerPoP**
> PoP registerPoP(body)

Registers a new PoP

Registers a new Point-of-Presence represented by a PoP

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PoPApi;


PoPApi apiInstance = new PoPApi();
PoP body = new PoP(); // PoP | Defintion of a PoP which defines a Point-of-Presence used to host resources
try {
    PoP result = apiInstance.registerPoP(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PoPApi#registerPoP");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PoP**](PoP.md)| Defintion of a PoP which defines a Point-of-Presence used to host resources |

### Return type

[**PoP**](PoP.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="unregisterPoP"></a>
# **unregisterPoP**
> String unregisterPoP(id)

Unregisters a PoP.

Unregisters the PoP that matches with a given ID.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PoPApi;


PoPApi apiInstance = new PoPApi();
String id = "id_example"; // String | ID of PoP
try {
    String result = apiInstance.unregisterPoP(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PoPApi#unregisterPoP");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| ID of PoP |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="updatePoP"></a>
# **updatePoP**
> PoP updatePoP(id, body)

Updates a PoP.

Updates an already registered PoP.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PoPApi;


PoPApi apiInstance = new PoPApi();
String id = "id_example"; // String | ID of PoP
PoP body = new PoP(); // PoP | PoP object that needs to be updated.
try {
    PoP result = apiInstance.updatePoP(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PoPApi#updatePoP");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| ID of PoP |
 **body** | [**PoP**](PoP.md)| PoP object that needs to be updated. |

### Return type

[**PoP**](PoP.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

