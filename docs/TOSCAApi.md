# TOSCAApi

All URIs are relative to *https://localhost:8180/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deployToscaTemplate**](TOSCAApi.md#deployToscaTemplate) | **POST** /tosca | Deploys a Tosca template.


<a name="deployToscaTemplate"></a>
# **deployToscaTemplate**
> ResourceGroup deployToscaTemplate(body)

Deploys a Tosca template.

The TOSCA template defines VDUs, Networks and the PoPs where to allocate the virtual resources

### Example
```java
// Import classes:
//import io.elastest.epm.client.ApiException;
//import io.elastest.epm.client.api.TOSCAApi;


TOSCAApi apiInstance = new TOSCAApi();
String body = "body_example"; // String | TOSCA formatted template
try {
    ResourceGroup result = apiInstance.deployToscaTemplate(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TOSCAApi#deployToscaTemplate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | **String**| TOSCA formatted template |

### Return type

[**ResourceGroup**](ResourceGroup.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: text/yaml
 - **Accept**: application/json

