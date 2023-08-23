/*
 * Legal Entity Management API
 *
 * The version of the OpenAPI document: 3
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.adyen.service.legalentitymanagement;

import com.adyen.Client;
import com.adyen.Service;
import com.adyen.constants.ApiConstants;
import com.adyen.model.legalentitymanagement.ServiceError;
import com.adyen.model.legalentitymanagement.TransferInstrument;
import com.adyen.model.legalentitymanagement.TransferInstrumentInfo;
import com.adyen.model.RequestOptions;
import com.adyen.service.exception.ApiException;
import com.adyen.service.resource.Resource;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class TransferInstrumentsApi extends Service {

    public static final String API_VERSION = "3";

    protected String baseURL;

    /**
    * Transfer instruments constructor in {@link com.adyen.service.legalentitymanagement package}.
    * @param client {@link Client } (required)
    */
    public TransferInstrumentsApi(Client client) {
        super(client);
        this.baseURL = createBaseURL("https://kyc-test.adyen.com/lem/v3");
    }

    /**
    * Transfer instruments constructor in {@link com.adyen.service.legalentitymanagement package}.
    * Please use this constructor only if you would like to pass along your own url for routing or testing purposes. The latest API version is defined in this class as a constant.
    * @param client {@link Client } (required)
    * @param baseURL {@link String } (required)
    */
    public TransferInstrumentsApi(Client client, String baseURL) {
        super(client);
        this.baseURL = baseURL;
    }

    /**
    * Delete a transfer instrument
    *
    * @param id {@link String } The unique identifier of the transfer instrument to be deleted. (required)
    * @throws ApiException if fails to make API call
    */
    public void deleteTransferInstrument(String id) throws ApiException, IOException {
        deleteTransferInstrument(id, null);
    }

    /**
    * Delete a transfer instrument
    *
    * @param id {@link String } The unique identifier of the transfer instrument to be deleted. (required)
    * @param requestOptions {@link RequestOptions } Object to store additional data such as idempotency-keys (optional)
    * @throws ApiException if fails to make API call
    */
    public void deleteTransferInstrument(String id, RequestOptions requestOptions) throws ApiException, IOException {
        //Add path params
        Map<String, String> pathParams = new HashMap<>();
        if (id == null) {
            throw new IllegalArgumentException("Please provide the id path parameter");
        }
        pathParams.put("id", id);

        String requestBody = null;
        Resource resource = new Resource(this, this.baseURL + "/transferInstruments/{id}", null);
        resource.request(requestBody, requestOptions, ApiConstants.HttpMethod.DELETE, pathParams);
    }

    /**
    * Get a transfer instrument
    *
    * @param id {@link String } The unique identifier of the transfer instrument. (required)
    * @return {@link TransferInstrument }
    * @throws ApiException if fails to make API call
    */
    public TransferInstrument getTransferInstrument(String id) throws ApiException, IOException {
        return getTransferInstrument(id, null);
    }

    /**
    * Get a transfer instrument
    *
    * @param id {@link String } The unique identifier of the transfer instrument. (required)
    * @param requestOptions {@link RequestOptions } Object to store additional data such as idempotency-keys (optional)
    * @return {@link TransferInstrument }
    * @throws ApiException if fails to make API call
    */
    public TransferInstrument getTransferInstrument(String id, RequestOptions requestOptions) throws ApiException, IOException {
        //Add path params
        Map<String, String> pathParams = new HashMap<>();
        if (id == null) {
            throw new IllegalArgumentException("Please provide the id path parameter");
        }
        pathParams.put("id", id);

        String requestBody = null;
        Resource resource = new Resource(this, this.baseURL + "/transferInstruments/{id}", null);
        String jsonResult = resource.request(requestBody, requestOptions, ApiConstants.HttpMethod.GET, pathParams);
        return TransferInstrument.fromJson(jsonResult);
    }

    /**
    * Update a transfer instrument
    *
    * @param id {@link String } The unique identifier of the transfer instrument. (required)
    * @param transferInstrumentInfo {@link TransferInstrumentInfo }  (required)
    * @return {@link TransferInstrument }
    * @throws ApiException if fails to make API call
    */
    public TransferInstrument updateTransferInstrument(String id, TransferInstrumentInfo transferInstrumentInfo) throws ApiException, IOException {
        return updateTransferInstrument(id, transferInstrumentInfo, null);
    }

    /**
    * Update a transfer instrument
    *
    * @param id {@link String } The unique identifier of the transfer instrument. (required)
    * @param transferInstrumentInfo {@link TransferInstrumentInfo }  (required)
    * @param requestOptions {@link RequestOptions } Object to store additional data such as idempotency-keys (optional)
    * @return {@link TransferInstrument }
    * @throws ApiException if fails to make API call
    */
    public TransferInstrument updateTransferInstrument(String id, TransferInstrumentInfo transferInstrumentInfo, RequestOptions requestOptions) throws ApiException, IOException {
        //Add path params
        Map<String, String> pathParams = new HashMap<>();
        if (id == null) {
            throw new IllegalArgumentException("Please provide the id path parameter");
        }
        pathParams.put("id", id);

        String requestBody = transferInstrumentInfo.toJson();
        Resource resource = new Resource(this, this.baseURL + "/transferInstruments/{id}", null);
        String jsonResult = resource.request(requestBody, requestOptions, ApiConstants.HttpMethod.PATCH, pathParams);
        return TransferInstrument.fromJson(jsonResult);
    }

    /**
    * Create a transfer instrument
    *
    * @param transferInstrumentInfo {@link TransferInstrumentInfo }  (required)
    * @return {@link TransferInstrument }
    * @throws ApiException if fails to make API call
    */
    public TransferInstrument createTransferInstrument(TransferInstrumentInfo transferInstrumentInfo) throws ApiException, IOException {
        return createTransferInstrument(transferInstrumentInfo, null);
    }

    /**
    * Create a transfer instrument
    *
    * @param transferInstrumentInfo {@link TransferInstrumentInfo }  (required)
    * @param requestOptions {@link RequestOptions } Object to store additional data such as idempotency-keys (optional)
    * @return {@link TransferInstrument }
    * @throws ApiException if fails to make API call
    */
    public TransferInstrument createTransferInstrument(TransferInstrumentInfo transferInstrumentInfo, RequestOptions requestOptions) throws ApiException, IOException {

        String requestBody = transferInstrumentInfo.toJson();
        Resource resource = new Resource(this, this.baseURL + "/transferInstruments", null);
        String jsonResult = resource.request(requestBody, requestOptions, ApiConstants.HttpMethod.POST, null);
        return TransferInstrument.fromJson(jsonResult);
    }
}
