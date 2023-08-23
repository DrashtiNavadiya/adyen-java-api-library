/*
 * Management API
 *
 * The version of the OpenAPI document: 1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.adyen.service.management;

import com.adyen.Client;
import com.adyen.Service;
import com.adyen.constants.ApiConstants;
import com.adyen.model.management.ListStoresResponse;
import com.adyen.model.management.RestServiceError;
import com.adyen.model.management.Store;
import com.adyen.model.management.StoreCreationRequest;
import com.adyen.model.management.StoreCreationWithMerchantCodeRequest;
import com.adyen.model.management.UpdateStoreRequest;
import com.adyen.model.RequestOptions;
import com.adyen.service.exception.ApiException;
import com.adyen.service.resource.Resource;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class AccountStoreLevelApi extends Service {

    public static final String API_VERSION = "1";

    protected String baseURL;

    /**
    * Account - store level constructor in {@link com.adyen.service.management package}.
    * @param client {@link Client } (required)
    */
    public AccountStoreLevelApi(Client client) {
        super(client);
        this.baseURL = createBaseURL("https://management-test.adyen.com/v1");
    }

    /**
    * Account - store level constructor in {@link com.adyen.service.management package}.
    * Please use this constructor only if you would like to pass along your own url for routing or testing purposes. The latest API version is defined in this class as a constant.
    * @param client {@link Client } (required)
    * @param baseURL {@link String } (required)
    */
    public AccountStoreLevelApi(Client client, String baseURL) {
        super(client);
        this.baseURL = baseURL;
    }

    /**
    * Get a list of stores
    *
    * @param merchantId {@link String } The unique identifier of the merchant account. (required)
    * @return {@link ListStoresResponse }
    * @throws ApiException if fails to make API call
    */
    public ListStoresResponse listStoresByMerchantId(String merchantId) throws ApiException, IOException {
        return listStoresByMerchantId(merchantId, null,  null,  null,  null);
    }

    /**
    * Get a list of stores
    *
    * @param merchantId {@link String } The unique identifier of the merchant account. (required)
    * @param pageNumber {@link Integer } Query: The number of the page to fetch. (optional)
    * @param pageSize {@link Integer } Query: The number of items to have on a page, maximum 100. The default is 10 items on a page. (optional)
    * @param reference {@link String } Query: The reference of the store. (optional)
    * @param requestOptions {@link RequestOptions } Object to store additional data such as idempotency-keys (optional)
    * @return {@link ListStoresResponse }
    * @throws ApiException if fails to make API call
    */
    public ListStoresResponse listStoresByMerchantId(String merchantId, Integer pageNumber, Integer pageSize, String reference, RequestOptions requestOptions) throws ApiException, IOException {
        //Add path params
        Map<String, String> pathParams = new HashMap<>();
        if (merchantId == null) {
            throw new IllegalArgumentException("Please provide the merchantId path parameter");
        }
        pathParams.put("merchantId", merchantId);
        //Add query params
        Map<String, String> queryParams = new HashMap<>();
        if (pageNumber != null) {
        queryParams.put("pageNumber", pageNumber.toString());
        }
        if (pageSize != null) {
        queryParams.put("pageSize", pageSize.toString());
        }
        if (reference != null) {
        queryParams.put("reference", reference);
        }

        String requestBody = null;
        Resource resource = new Resource(this, this.baseURL + "/merchants/{merchantId}/stores", null);
        String jsonResult = resource.request(requestBody, requestOptions, ApiConstants.HttpMethod.GET, pathParams, queryParams);
        return ListStoresResponse.fromJson(jsonResult);
    }

    /**
    * Get a store
    *
    * @param merchantId {@link String } The unique identifier of the merchant account. (required)
    * @param storeId {@link String } The unique identifier of the store. (required)
    * @return {@link Store }
    * @throws ApiException if fails to make API call
    */
    public Store getStore(String merchantId, String storeId) throws ApiException, IOException {
        return getStore(merchantId, storeId, null);
    }

    /**
    * Get a store
    *
    * @param merchantId {@link String } The unique identifier of the merchant account. (required)
    * @param storeId {@link String } The unique identifier of the store. (required)
    * @param requestOptions {@link RequestOptions } Object to store additional data such as idempotency-keys (optional)
    * @return {@link Store }
    * @throws ApiException if fails to make API call
    */
    public Store getStore(String merchantId, String storeId, RequestOptions requestOptions) throws ApiException, IOException {
        //Add path params
        Map<String, String> pathParams = new HashMap<>();
        if (merchantId == null) {
            throw new IllegalArgumentException("Please provide the merchantId path parameter");
        }
        pathParams.put("merchantId", merchantId);
        if (storeId == null) {
            throw new IllegalArgumentException("Please provide the storeId path parameter");
        }
        pathParams.put("storeId", storeId);

        String requestBody = null;
        Resource resource = new Resource(this, this.baseURL + "/merchants/{merchantId}/stores/{storeId}", null);
        String jsonResult = resource.request(requestBody, requestOptions, ApiConstants.HttpMethod.GET, pathParams);
        return Store.fromJson(jsonResult);
    }

    /**
    * Get a list of stores
    *
    * @return {@link ListStoresResponse }
    * @throws ApiException if fails to make API call
    */
    public ListStoresResponse listStores() throws ApiException, IOException {
        return listStores(null,  null,  null,  null,  null);
    }

    /**
    * Get a list of stores
    *
    * @param pageNumber {@link Integer } Query: The number of the page to fetch. (optional)
    * @param pageSize {@link Integer } Query: The number of items to have on a page, maximum 100. The default is 10 items on a page. (optional)
    * @param reference {@link String } Query: The reference of the store. (optional)
    * @param merchantId {@link String } Query: The unique identifier of the merchant account. (optional)
    * @param requestOptions {@link RequestOptions } Object to store additional data such as idempotency-keys (optional)
    * @return {@link ListStoresResponse }
    * @throws ApiException if fails to make API call
    */
    public ListStoresResponse listStores(Integer pageNumber, Integer pageSize, String reference, String merchantId, RequestOptions requestOptions) throws ApiException, IOException {
        //Add query params
        Map<String, String> queryParams = new HashMap<>();
        if (pageNumber != null) {
        queryParams.put("pageNumber", pageNumber.toString());
        }
        if (pageSize != null) {
        queryParams.put("pageSize", pageSize.toString());
        }
        if (reference != null) {
        queryParams.put("reference", reference);
        }
        if (merchantId != null) {
        queryParams.put("merchantId", merchantId);
        }

        String requestBody = null;
        Resource resource = new Resource(this, this.baseURL + "/stores", null);
        String jsonResult = resource.request(requestBody, requestOptions, ApiConstants.HttpMethod.GET, null, queryParams);
        return ListStoresResponse.fromJson(jsonResult);
    }

    /**
    * Get a store
    *
    * @param storeId {@link String } The unique identifier of the store. (required)
    * @return {@link Store }
    * @throws ApiException if fails to make API call
    */
    public Store getStoreById(String storeId) throws ApiException, IOException {
        return getStoreById(storeId, null);
    }

    /**
    * Get a store
    *
    * @param storeId {@link String } The unique identifier of the store. (required)
    * @param requestOptions {@link RequestOptions } Object to store additional data such as idempotency-keys (optional)
    * @return {@link Store }
    * @throws ApiException if fails to make API call
    */
    public Store getStoreById(String storeId, RequestOptions requestOptions) throws ApiException, IOException {
        //Add path params
        Map<String, String> pathParams = new HashMap<>();
        if (storeId == null) {
            throw new IllegalArgumentException("Please provide the storeId path parameter");
        }
        pathParams.put("storeId", storeId);

        String requestBody = null;
        Resource resource = new Resource(this, this.baseURL + "/stores/{storeId}", null);
        String jsonResult = resource.request(requestBody, requestOptions, ApiConstants.HttpMethod.GET, pathParams);
        return Store.fromJson(jsonResult);
    }

    /**
    * Update a store
    *
    * @param merchantId {@link String } The unique identifier of the merchant account. (required)
    * @param storeId {@link String } The unique identifier of the store. (required)
    * @param updateStoreRequest {@link UpdateStoreRequest }  (required)
    * @return {@link Store }
    * @throws ApiException if fails to make API call
    */
    public Store updateStore(String merchantId, String storeId, UpdateStoreRequest updateStoreRequest) throws ApiException, IOException {
        return updateStore(merchantId, storeId, updateStoreRequest, null);
    }

    /**
    * Update a store
    *
    * @param merchantId {@link String } The unique identifier of the merchant account. (required)
    * @param storeId {@link String } The unique identifier of the store. (required)
    * @param updateStoreRequest {@link UpdateStoreRequest }  (required)
    * @param requestOptions {@link RequestOptions } Object to store additional data such as idempotency-keys (optional)
    * @return {@link Store }
    * @throws ApiException if fails to make API call
    */
    public Store updateStore(String merchantId, String storeId, UpdateStoreRequest updateStoreRequest, RequestOptions requestOptions) throws ApiException, IOException {
        //Add path params
        Map<String, String> pathParams = new HashMap<>();
        if (merchantId == null) {
            throw new IllegalArgumentException("Please provide the merchantId path parameter");
        }
        pathParams.put("merchantId", merchantId);
        if (storeId == null) {
            throw new IllegalArgumentException("Please provide the storeId path parameter");
        }
        pathParams.put("storeId", storeId);

        String requestBody = updateStoreRequest.toJson();
        Resource resource = new Resource(this, this.baseURL + "/merchants/{merchantId}/stores/{storeId}", null);
        String jsonResult = resource.request(requestBody, requestOptions, ApiConstants.HttpMethod.PATCH, pathParams);
        return Store.fromJson(jsonResult);
    }

    /**
    * Update a store
    *
    * @param storeId {@link String } The unique identifier of the store. (required)
    * @param updateStoreRequest {@link UpdateStoreRequest }  (required)
    * @return {@link Store }
    * @throws ApiException if fails to make API call
    */
    public Store updateStoreById(String storeId, UpdateStoreRequest updateStoreRequest) throws ApiException, IOException {
        return updateStoreById(storeId, updateStoreRequest, null);
    }

    /**
    * Update a store
    *
    * @param storeId {@link String } The unique identifier of the store. (required)
    * @param updateStoreRequest {@link UpdateStoreRequest }  (required)
    * @param requestOptions {@link RequestOptions } Object to store additional data such as idempotency-keys (optional)
    * @return {@link Store }
    * @throws ApiException if fails to make API call
    */
    public Store updateStoreById(String storeId, UpdateStoreRequest updateStoreRequest, RequestOptions requestOptions) throws ApiException, IOException {
        //Add path params
        Map<String, String> pathParams = new HashMap<>();
        if (storeId == null) {
            throw new IllegalArgumentException("Please provide the storeId path parameter");
        }
        pathParams.put("storeId", storeId);

        String requestBody = updateStoreRequest.toJson();
        Resource resource = new Resource(this, this.baseURL + "/stores/{storeId}", null);
        String jsonResult = resource.request(requestBody, requestOptions, ApiConstants.HttpMethod.PATCH, pathParams);
        return Store.fromJson(jsonResult);
    }

    /**
    * Create a store
    *
    * @param merchantId {@link String } The unique identifier of the merchant account. (required)
    * @param storeCreationRequest {@link StoreCreationRequest }  (required)
    * @return {@link Store }
    * @throws ApiException if fails to make API call
    */
    public Store createStoreByMerchantId(String merchantId, StoreCreationRequest storeCreationRequest) throws ApiException, IOException {
        return createStoreByMerchantId(merchantId, storeCreationRequest, null);
    }

    /**
    * Create a store
    *
    * @param merchantId {@link String } The unique identifier of the merchant account. (required)
    * @param storeCreationRequest {@link StoreCreationRequest }  (required)
    * @param requestOptions {@link RequestOptions } Object to store additional data such as idempotency-keys (optional)
    * @return {@link Store }
    * @throws ApiException if fails to make API call
    */
    public Store createStoreByMerchantId(String merchantId, StoreCreationRequest storeCreationRequest, RequestOptions requestOptions) throws ApiException, IOException {
        //Add path params
        Map<String, String> pathParams = new HashMap<>();
        if (merchantId == null) {
            throw new IllegalArgumentException("Please provide the merchantId path parameter");
        }
        pathParams.put("merchantId", merchantId);

        String requestBody = storeCreationRequest.toJson();
        Resource resource = new Resource(this, this.baseURL + "/merchants/{merchantId}/stores", null);
        String jsonResult = resource.request(requestBody, requestOptions, ApiConstants.HttpMethod.POST, pathParams);
        return Store.fromJson(jsonResult);
    }

    /**
    * Create a store
    *
    * @param storeCreationWithMerchantCodeRequest {@link StoreCreationWithMerchantCodeRequest }  (required)
    * @return {@link Store }
    * @throws ApiException if fails to make API call
    */
    public Store createStore(StoreCreationWithMerchantCodeRequest storeCreationWithMerchantCodeRequest) throws ApiException, IOException {
        return createStore(storeCreationWithMerchantCodeRequest, null);
    }

    /**
    * Create a store
    *
    * @param storeCreationWithMerchantCodeRequest {@link StoreCreationWithMerchantCodeRequest }  (required)
    * @param requestOptions {@link RequestOptions } Object to store additional data such as idempotency-keys (optional)
    * @return {@link Store }
    * @throws ApiException if fails to make API call
    */
    public Store createStore(StoreCreationWithMerchantCodeRequest storeCreationWithMerchantCodeRequest, RequestOptions requestOptions) throws ApiException, IOException {

        String requestBody = storeCreationWithMerchantCodeRequest.toJson();
        Resource resource = new Resource(this, this.baseURL + "/stores", null);
        String jsonResult = resource.request(requestBody, requestOptions, ApiConstants.HttpMethod.POST, null);
        return Store.fromJson(jsonResult);
    }
}
