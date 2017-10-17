# PackageApi

All URIs are relative to *https://localhost:8180/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deletePackage**](PackageApi.md#deletePackage) | **DELETE** /packages/{id} | Deletes a package.
[**receivePackage**](PackageApi.md#receivePackage) | **POST** /packages | Receives a package.


<a name="deletePackage"></a>
# **deletePackage**
> deletePackage(id)

Deletes a package.

Deletes the package that matches with a given ID.

### Example
```java
// Import classes:
//import io.elastest.epm.client.ApiException;
//import io.elastest.epm.client.api.PackageApi;


PackageApi apiInstance = new PackageApi();
String id = "id_example"; // String | ID of Package
try {
    apiInstance.deletePackage(id);
} catch (ApiException e) {
    System.err.println("Exception when calling PackageApi#deletePackage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| ID of Package |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="receivePackage"></a>
# **receivePackage**
> ResourceGroup receivePackage(file)

Receives a package.

Receives a package so that it can be forwarded to the correct environment.

### Example
```java
// Import classes:
//import io.elastest.epm.client.ApiException;
//import io.elastest.epm.client.api.PackageApi;


PackageApi apiInstance = new PackageApi();
File file = new File("/path/to/file.txt"); // File | Package in a multipart form
try {
    ResourceGroup result = apiInstance.receivePackage(file);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PackageApi#receivePackage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file** | **File**| Package in a multipart form |

### Return type

[**ResourceGroup**](ResourceGroup.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

