
# Worker

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** |  |  [optional]
**ip** | **String** |  |  [optional]
**vduId** | **String** | The vduId if the worker was created from a vdu. |  [optional]
**epmIp** | **String** | This is the IP where the EPM is reachable for the Worker. This is needed because the Worker has to be able to reach the EPM for registering adapters. |  [optional]
**type** | **List&lt;String&gt;** | The types which this worker supports at the moment when this information is requested. |  [optional]
**authCredentials** | [**AuthCredentials**](AuthCredentials.md) |  |  [optional]



