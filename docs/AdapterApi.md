# AdapterApi

All URIs are relative to *https://localhost:8180/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAllAdapters**](AdapterApi.md#getAllAdapters) | **GET** /adapters | Returns all registered adapters


<a name="getAllAdapters"></a>
# **getAllAdapters**
> List&lt;Adapter&gt; getAllAdapters()

Returns all registered adapters

### Example
```java
// Import classes:
//import io.elastest.epm.client.ApiException;
//import io.elastest.epm.client.api.AdapterApi;


AdapterApi apiInstance = new AdapterApi();
try {
    List<Adapter> result = apiInstance.getAllAdapters();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdapterApi#getAllAdapters");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Adapter&gt;**](Adapter.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

