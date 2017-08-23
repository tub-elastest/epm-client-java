
# VDU

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**computeId** | **String** |  | 
**events** | [**List&lt;Event&gt;**](Event.md) |  |  [optional]
**id** | **String** |  |  [optional]
**imageName** | **String** |  | 
**ip** | **String** |  | 
**metadata** | [**List&lt;KeyValuePair&gt;**](KeyValuePair.md) |  |  [optional]
**name** | **String** |  | 
**netName** | **String** |  | 
**poPName** | **String** |  | 
**status** | [**StatusEnum**](#StatusEnum) |  |  [optional]


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
INITIALIZING | &quot;initializing&quot;
INITIALIZED | &quot;initialized&quot;
DEPLOYING | &quot;deploying&quot;
DEPLOYED | &quot;deployed&quot;
RUNNING | &quot;running&quot;
UNDEPLOYING | &quot;undeploying&quot;
UNDEPLOYED | &quot;undeployed&quot;
ERROR | &quot;error&quot;



