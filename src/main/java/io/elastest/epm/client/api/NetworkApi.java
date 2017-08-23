/*
 * EPM REST API
 * REST API description of the ElasTest Platform Manager Module.
 *
 * OpenAPI spec version: 0.1.2
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.elastest.epm.client.api;

import com.google.gson.reflect.TypeToken;
import io.elastest.epm.client.*;
import io.elastest.epm.client.model.Network;


import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NetworkApi {
    private ApiClient apiClient;

    public NetworkApi() {
        this(Configuration.getDefaultApiClient());
    }

    public NetworkApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /* Build call for createNetwork */
    private com.squareup.okhttp.Call createNetworkCall(Network body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/network".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call createNetworkValidateBeforeCall(Network body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {

        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling createNetwork(Async)");
        }


        com.squareup.okhttp.Call call = createNetworkCall(body, progressListener, progressRequestListener);
        return call;





    }

    /**
     * Creates a new network.
     * Creates a new network in the target cloud environment with the given CIDR.
     * @param body Defintion of a Network which has to be created on a certain PoP (required)
     * @return Network
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Network createNetwork(Network body) throws ApiException {
        ApiResponse<Network> resp = createNetworkWithHttpInfo(body);
        return resp.getData();
    }

    /**
     * Creates a new network.
     * Creates a new network in the target cloud environment with the given CIDR.
     * @param body Defintion of a Network which has to be created on a certain PoP (required)
     * @return ApiResponse&lt;Network&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Network> createNetworkWithHttpInfo(Network body) throws ApiException {
        com.squareup.okhttp.Call call = createNetworkValidateBeforeCall(body, null, null);
        Type localVarReturnType = new TypeToken<Network>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Creates a new network. (asynchronously)
     * Creates a new network in the target cloud environment with the given CIDR.
     * @param body Defintion of a Network which has to be created on a certain PoP (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createNetworkAsync(Network body, final ApiCallback<Network> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = createNetworkValidateBeforeCall(body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Network>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for deleteNetwork */
    private com.squareup.okhttp.Call deleteNetworkCall(String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/network/{id}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {

        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {

        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call deleteNetworkValidateBeforeCall(String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {

        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling deleteNetwork(Async)");
        }


        com.squareup.okhttp.Call call = deleteNetworkCall(id, progressListener, progressRequestListener);
        return call;





    }

    /**
     * Deletes a network.
     * Deletes the network that matches with a given ID.
     * @param id ID of Network (required)
     * @return String
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public String deleteNetwork(String id) throws ApiException {
        ApiResponse<String> resp = deleteNetworkWithHttpInfo(id);
        return resp.getData();
    }

    /**
     * Deletes a network.
     * Deletes the network that matches with a given ID.
     * @param id ID of Network (required)
     * @return ApiResponse&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<String> deleteNetworkWithHttpInfo(String id) throws ApiException {
        com.squareup.okhttp.Call call = deleteNetworkValidateBeforeCall(id, null, null);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Deletes a network. (asynchronously)
     * Deletes the network that matches with a given ID.
     * @param id ID of Network (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteNetworkAsync(String id, final ApiCallback<String> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = deleteNetworkValidateBeforeCall(id, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getAllNetworks */
    private com.squareup.okhttp.Call getAllNetworksCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/network".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {

        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getAllNetworksValidateBeforeCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {


        com.squareup.okhttp.Call call = getAllNetworksCall(progressListener, progressRequestListener);
        return call;





    }

    /**
     * Returns all existing networks.
     * Returns all networks with all details.
     * @return List&lt;Network&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<Network> getAllNetworks() throws ApiException {
        ApiResponse<List<Network>> resp = getAllNetworksWithHttpInfo();
        return resp.getData();
    }

    /**
     * Returns all existing networks.
     * Returns all networks with all details.
     * @return ApiResponse&lt;List&lt;Network&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<Network>> getAllNetworksWithHttpInfo() throws ApiException {
        com.squareup.okhttp.Call call = getAllNetworksValidateBeforeCall(null, null);
        Type localVarReturnType = new TypeToken<List<Network>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Returns all existing networks. (asynchronously)
     * Returns all networks with all details.
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getAllNetworksAsync(final ApiCallback<List<Network>> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getAllNetworksValidateBeforeCall(progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<Network>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getNetworkById */
    private com.squareup.okhttp.Call getNetworkByIdCall(String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/network/{id}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getNetworkByIdValidateBeforeCall(String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {

        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getNetworkById(Async)");
        }


        com.squareup.okhttp.Call call = getNetworkByIdCall(id, progressListener, progressRequestListener);
        return call;





    }

    /**
     * Returns a network.
     * Returns the network with the given ID. Returns all its details.
     * @param id ID of Network (required)
     * @return Network
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Network getNetworkById(String id) throws ApiException {
        ApiResponse<Network> resp = getNetworkByIdWithHttpInfo(id);
        return resp.getData();
    }

    /**
     * Returns a network.
     * Returns the network with the given ID. Returns all its details.
     * @param id ID of Network (required)
     * @return ApiResponse&lt;Network&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Network> getNetworkByIdWithHttpInfo(String id) throws ApiException {
        com.squareup.okhttp.Call call = getNetworkByIdValidateBeforeCall(id, null, null);
        Type localVarReturnType = new TypeToken<Network>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Returns a network. (asynchronously)
     * Returns the network with the given ID. Returns all its details.
     * @param id ID of Network (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getNetworkByIdAsync(String id, final ApiCallback<Network> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getNetworkByIdValidateBeforeCall(id, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Network>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for updateNetwork */
    private com.squareup.okhttp.Call updateNetworkCall(String id, Network body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/network/{id}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "PATCH", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call updateNetworkValidateBeforeCall(String id, Network body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling updateNetwork(Async)");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling updateNetwork(Async)");
        }
        
        
        com.squareup.okhttp.Call call = updateNetworkCall(id, body, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Updates a Network.
     * Updates an existing Network.
     * @param id ID of Network (required)
     * @param body Network that needs to be updated. (required)
     * @return Network
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Network updateNetwork(String id, Network body) throws ApiException {
        ApiResponse<Network> resp = updateNetworkWithHttpInfo(id, body);
        return resp.getData();
    }

    /**
     * Updates a Network.
     * Updates an existing Network.
     * @param id ID of Network (required)
     * @param body Network that needs to be updated. (required)
     * @return ApiResponse&lt;Network&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Network> updateNetworkWithHttpInfo(String id, Network body) throws ApiException {
        com.squareup.okhttp.Call call = updateNetworkValidateBeforeCall(id, body, null, null);
        Type localVarReturnType = new TypeToken<Network>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Updates a Network. (asynchronously)
     * Updates an existing Network.
     * @param id ID of Network (required)
     * @param body Network that needs to be updated. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call updateNetworkAsync(String id, Network body, final ApiCallback<Network> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = updateNetworkValidateBeforeCall(id, body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Network>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
