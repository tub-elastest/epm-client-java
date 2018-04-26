# KeyApi

All URIs are relative to *https://localhost:8180/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addKey**](KeyApi.md#addKey) | **POST** /keys | Uploads a key to the EPM.
[**deleteKey**](KeyApi.md#deleteKey) | **DELETE** /keys/{id} | Deletes a Key.
[**getAllKeys**](KeyApi.md#getAllKeys) | **GET** /keys | Returns all available Keys


<a name="addKey"></a>
# **addKey**
> Key addKey(body)

Uploads a key to the EPM.

This uploads a key to the EPM, so it can be later used when registering workers.

### Example
```java
// Import classes:
//import io.elastest.epm.client.ApiException;
//import io.elastest.epm.client.api.KeyApi;


KeyApi apiInstance = new KeyApi();
Key body = new Key(); // Key | Key in a json
try {
    Key result = apiInstance.addKey(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling KeyApi#addKey");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Key**](Key.md)| Key in a json |

### Return type

[**Key**](Key.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="deleteKey"></a>
# **deleteKey**
> String deleteKey(id)

Deletes a Key.

Deletes the Key that matches with a given ID.

### Example
```java
// Import classes:
//import io.elastest.epm.client.ApiException;
//import io.elastest.epm.client.api.KeyApi;


KeyApi apiInstance = new KeyApi();
String id = "id_example"; // String | ID of Key
try {
    String result = apiInstance.deleteKey(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling KeyApi#deleteKey");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| ID of Key |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getAllKeys"></a>
# **getAllKeys**
> List&lt;Key&gt; getAllKeys()

Returns all available Keys

### Example
```java
// Import classes:
//import io.elastest.epm.client.ApiException;
//import io.elastest.epm.client.api.KeyApi;


KeyApi apiInstance = new KeyApi();
try {
    List<Key> result = apiInstance.getAllKeys();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling KeyApi#getAllKeys");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Key&gt;**](Key.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

