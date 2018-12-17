
# AuthCredentials

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** |  |  [optional]
**key** | **String** | The name of the key saved in EPM, which can be used to execute runtime operations on this VDU. |  [optional]
**user** | **String** | This is the user, which the EPM will use when trying to ssh in to the Worker. | 
**passphrase** | **String** | This is the Passphrase of the Key provided for connecting to the Worker. |  [optional]
**password** | **String** | This is the password of the user, which can be left blank if no password is needed. |  [optional]
**port** | **Integer** | The ssh port of the worker, where the EPM can reach it. |  [optional]



