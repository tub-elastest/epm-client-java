# RuntimeApi

All URIs are relative to *https://localhost:8180/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**downloadFileFromInstance**](RuntimeApi.md#downloadFileFromInstance) | **GET** /runtime/{id}/file | Downloads a file from a VDU.
[**executeOnInstance**](RuntimeApi.md#executeOnInstance) | **PUT** /runtime/{id}/action/execute | Executes given command on the given VDU.
[**startInstance**](RuntimeApi.md#startInstance) | **PUT** /runtime/{id}/action/start | Starts the given VDU.
[**stopInstance**](RuntimeApi.md#stopInstance) | **PUT** /runtime/{id}/action/stop | Stops the given VDU.
[**uploadFileToInstanceByFile**](RuntimeApi.md#uploadFileToInstanceByFile) | **POST** /runtime/{id}/file | Uploads a file to a VDU.
[**uploadFileToInstanceByPath**](RuntimeApi.md#uploadFileToInstanceByPath) | **POST** /runtime/{id}/path | Uploads a file to a VDU.


<a name="downloadFileFromInstance"></a>
# **downloadFileFromInstance**
> File downloadFileFromInstance(id, fileDownloadBody)

Downloads a file from a VDU.

Download a file with the given filepath from the given VDU.

### Example
```java
// Import classes:
//import io.elastest.epm.client.ApiException;
//import io.elastest.epm.client.api.RuntimeApi;


RuntimeApi apiInstance = new RuntimeApi();
String id = "id_example"; // String | ID of VDU
FileDownloadBody fileDownloadBody = new FileDownloadBody(); // FileDownloadBody | Contains details of the file to be downloaded from the given Instance
try {
    File result = apiInstance.downloadFileFromInstance(id, fileDownloadBody);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RuntimeApi#downloadFileFromInstance");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| ID of VDU |
 **fileDownloadBody** | [**FileDownloadBody**](FileDownloadBody.md)| Contains details of the file to be downloaded from the given Instance |

### Return type

[**File**](File.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: multipart/form-data

<a name="executeOnInstance"></a>
# **executeOnInstance**
> String executeOnInstance(id, commandExecutionBody)

Executes given command on the given VDU.

Executes the given command on the VDU with the given ID.

### Example
```java
// Import classes:
//import io.elastest.epm.client.ApiException;
//import io.elastest.epm.client.api.RuntimeApi;


RuntimeApi apiInstance = new RuntimeApi();
String id = "id_example"; // String | ID of VDU
CommandExecutionBody commandExecutionBody = new CommandExecutionBody(); // CommandExecutionBody | Contains command to be executed and a flag if for the completion of the execution should be awaited
try {
    String result = apiInstance.executeOnInstance(id, commandExecutionBody);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RuntimeApi#executeOnInstance");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| ID of VDU |
 **commandExecutionBody** | [**CommandExecutionBody**](CommandExecutionBody.md)| Contains command to be executed and a flag if for the completion of the execution should be awaited |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="startInstance"></a>
# **startInstance**
> startInstance(id)

Starts the given VDU.

Starts the VDU with the given ID.

### Example
```java
// Import classes:
//import io.elastest.epm.client.ApiException;
//import io.elastest.epm.client.api.RuntimeApi;


RuntimeApi apiInstance = new RuntimeApi();
String id = "id_example"; // String | ID of VDU
try {
    apiInstance.startInstance(id);
} catch (ApiException e) {
    System.err.println("Exception when calling RuntimeApi#startInstance");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| ID of VDU |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="stopInstance"></a>
# **stopInstance**
> stopInstance(id)

Stops the given VDU.

Stops the VDU with the given ID.

### Example
```java
// Import classes:
//import io.elastest.epm.client.ApiException;
//import io.elastest.epm.client.api.RuntimeApi;


RuntimeApi apiInstance = new RuntimeApi();
String id = "id_example"; // String | ID of VDU
try {
    apiInstance.stopInstance(id);
} catch (ApiException e) {
    System.err.println("Exception when calling RuntimeApi#stopInstance");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| ID of VDU |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="uploadFileToInstanceByFile"></a>
# **uploadFileToInstanceByFile**
> uploadFileToInstanceByFile(id, remotePath, file)

Uploads a file to a VDU.

Uploads a given file to the given filepath to the given VDU.

### Example
```java
// Import classes:
//import io.elastest.epm.client.ApiException;
//import io.elastest.epm.client.api.RuntimeApi;


RuntimeApi apiInstance = new RuntimeApi();
String id = "id_example"; // String | ID of VDU
String remotePath = "remotePath_example"; // String | Absolute path where the file should go on the Instance
File file = new File("/path/to/file.txt"); // File | File which has to be uploaded to the Instance. Either this or the hostPath but not both can be provided.
try {
    apiInstance.uploadFileToInstanceByFile(id, remotePath, file);
} catch (ApiException e) {
    System.err.println("Exception when calling RuntimeApi#uploadFileToInstanceByFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| ID of VDU |
 **remotePath** | **String**| Absolute path where the file should go on the Instance |
 **file** | **File**| File which has to be uploaded to the Instance. Either this or the hostPath but not both can be provided. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: Not defined

<a name="uploadFileToInstanceByPath"></a>
# **uploadFileToInstanceByPath**
> uploadFileToInstanceByPath(id, fileUploadBody)

Uploads a file to a VDU.

Uploads a given file from the host path to the given file path to the given VDU.

### Example
```java
// Import classes:
//import io.elastest.epm.client.ApiException;
//import io.elastest.epm.client.api.RuntimeApi;


RuntimeApi apiInstance = new RuntimeApi();
String id = "id_example"; // String | ID of VDU
FileUploadBody fileUploadBody = new FileUploadBody(); // FileUploadBody | Contains details of the file with the given path to upload to the Instance
try {
    apiInstance.uploadFileToInstanceByPath(id, fileUploadBody);
} catch (ApiException e) {
    System.err.println("Exception when calling RuntimeApi#uploadFileToInstanceByPath");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| ID of VDU |
 **fileUploadBody** | [**FileUploadBody**](FileUploadBody.md)| Contains details of the file with the given path to upload to the Instance |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

