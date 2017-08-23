# ResourceGroupApi

All URIs are relative to *https://localhost:8180/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createResourceGroup**](ResourceGroupApi.md#createResourceGroup) | **POST** /resourceGroup | Creates a new Resource Group.
[**deleteResourceGroup**](ResourceGroupApi.md#deleteResourceGroup) | **DELETE** /resourceGroup/{id} | Deletes a Resource Group.
[**getAllResourceGroups**](ResourceGroupApi.md#getAllResourceGroups) | **GET** /resourceGroup | Returns all Resource Groups.
[**getResourceGroupById**](ResourceGroupApi.md#getResourceGroupById) | **GET** /resourceGroup/{id} | Returns a Resource Group.
[**updateResourceGroup**](ResourceGroupApi.md#updateResourceGroup) | **PATCH** /resourceGroup/{id} | Updates a ResourceGroup.


<a name="createResourceGroup"></a>
# **createResourceGroup**
> ResourceGroup createResourceGroup(body)

Creates a new Resource Group.

Creates a new Resource Group and allocates the defined resources in the defined PoPs.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ResourceGroupApi;


ResourceGroupApi apiInstance = new ResourceGroupApi();
ResourceGroup body = new ResourceGroup(); // ResourceGroup | Defintion of a Resource Group which includes all VDUs, Network and respective PoPs
try {
    ResourceGroup result = apiInstance.createResourceGroup(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ResourceGroupApi#createResourceGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ResourceGroup**](ResourceGroup.md)| Defintion of a Resource Group which includes all VDUs, Network and respective PoPs |

### Return type

[**ResourceGroup**](ResourceGroup.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteResourceGroup"></a>
# **deleteResourceGroup**
> String deleteResourceGroup(id)

Deletes a Resource Group.

Deletes the Resource Group that matches with a given ID.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ResourceGroupApi;


ResourceGroupApi apiInstance = new ResourceGroupApi();
String id = "id_example"; // String | ID of ResourceGroup
try {
    String result = apiInstance.deleteResourceGroup(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ResourceGroupApi#deleteResourceGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| ID of ResourceGroup |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getAllResourceGroups"></a>
# **getAllResourceGroups**
> List&lt;ResourceGroup&gt; getAllResourceGroups()

Returns all Resource Groups.

Returns all Resource Groups with all details.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ResourceGroupApi;


ResourceGroupApi apiInstance = new ResourceGroupApi();
try {
    List<ResourceGroup> result = apiInstance.getAllResourceGroups();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ResourceGroupApi#getAllResourceGroups");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;ResourceGroup&gt;**](ResourceGroup.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getResourceGroupById"></a>
# **getResourceGroupById**
> ResourceGroup getResourceGroupById(id)

Returns a Resource Group.

Returns the Resource Group with the given ID. Returns all its details.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ResourceGroupApi;


ResourceGroupApi apiInstance = new ResourceGroupApi();
String id = "id_example"; // String | ID of ResourceGroup
try {
    ResourceGroup result = apiInstance.getResourceGroupById(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ResourceGroupApi#getResourceGroupById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| ID of ResourceGroup |

### Return type

[**ResourceGroup**](ResourceGroup.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateResourceGroup"></a>
# **updateResourceGroup**
> ResourceGroup updateResourceGroup(id, body)

Updates a ResourceGroup.

Updates an existing ResourceGroup.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ResourceGroupApi;


ResourceGroupApi apiInstance = new ResourceGroupApi();
String id = "id_example"; // String | ID of ResourceGroup
ResourceGroup body = new ResourceGroup(); // ResourceGroup | ResourceGroup that needs to be updated.
try {
    ResourceGroup result = apiInstance.updateResourceGroup(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ResourceGroupApi#updateResourceGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| ID of ResourceGroup |
 **body** | [**ResourceGroup**](ResourceGroup.md)| ResourceGroup that needs to be updated. |

### Return type

[**ResourceGroup**](ResourceGroup.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

