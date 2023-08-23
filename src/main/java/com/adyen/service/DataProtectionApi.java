/*
 * Adyen Data Protection API
 * Adyen Data Protection API provides a way for you to process [Subject Erasure Requests](https://gdpr-info.eu/art-17-gdpr/) as mandated in GDPR.  Use our API to submit a request to delete shopper's data, including payment details and other related information (for example, delivery address or shopper email).## Authentication Each request to the Data Protection API must be signed with an API key. Get your API Key from your Customer Area, as described in [How to get the API key](https://docs.adyen.com/development-resources/api-credentials#generate-api-key). Then set this key to the `X-API-Key` header value, for example:  ``` curl -H \"Content-Type: application/json\" \\ -H \"X-API-Key: Your_API_key\" \\ ... ``` Note that when going live, you need to generate a new API Key to access the [live endpoints](https://docs.adyen.com/development-resources/live-endpoints).  ## Versioning Data Protection Service API supports [versioning](https://docs.adyen.com/development-resources/versioning) using a version suffix in the endpoint URL. This suffix has the following format: \"vXX\", where XX is the version number.  For example: ``` https://ca-test.adyen.com/ca/services/DataProtectionService/v1/requestSubjectErasure ```
 *
 * The version of the OpenAPI document: 1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.adyen.service;

import com.adyen.Client;
import com.adyen.Service;
import com.adyen.constants.ApiConstants;
import com.adyen.model.dataprotection.ServiceError;
import com.adyen.model.dataprotection.SubjectErasureByPspReferenceRequest;
import com.adyen.model.dataprotection.SubjectErasureResponse;
import com.adyen.model.RequestOptions;
import com.adyen.service.exception.ApiException;
import com.adyen.service.resource.Resource;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class DataProtectionApi extends Service {

    public static final String API_VERSION = "1";

    protected String baseURL;

    /**
    * General constructor in {@link com.adyen.service package}.
    * @param client {@link Client }  (required)
    */
    public DataProtectionApi(Client client) {
        super(client);
        this.baseURL = createBaseURL("https://ca-test.adyen.com/ca/services/DataProtectionService/v1");
    }

    /**
    * General constructor in {@link com.adyen.service package}.
    * Please use this constructor only if you would like to pass along your own url for routing or testing purposes. The latest API version is defined in this class as a constant.
    * @param client {@link Client }  (required)
    * @param baseURL {@link String }  (required)
    */
    public DataProtectionApi(Client client, String baseURL) {
        super(client);
        this.baseURL = baseURL;
    }

    /**
    * Submit a Subject Erasure Request.
    *
    * @param subjectErasureByPspReferenceRequest {@link SubjectErasureByPspReferenceRequest }  (required)
    * @return {@link SubjectErasureResponse }
    * @throws ApiException if fails to make API call
    */
    public SubjectErasureResponse requestSubjectErasure(SubjectErasureByPspReferenceRequest subjectErasureByPspReferenceRequest) throws ApiException, IOException {
        return requestSubjectErasure(subjectErasureByPspReferenceRequest, null);
    }

    /**
    * Submit a Subject Erasure Request.
    *
    * @param subjectErasureByPspReferenceRequest {@link SubjectErasureByPspReferenceRequest }  (required)
    * @param requestOptions {@link RequestOptions } Object to store additional data such as idempotency-keys (optional)
    * @return {@link SubjectErasureResponse }
    * @throws ApiException if fails to make API call
    */
    public SubjectErasureResponse requestSubjectErasure(SubjectErasureByPspReferenceRequest subjectErasureByPspReferenceRequest, RequestOptions requestOptions) throws ApiException, IOException {

        String requestBody = subjectErasureByPspReferenceRequest.toJson();
        Resource resource = new Resource(this, this.baseURL + "/requestSubjectErasure", null);
        String jsonResult = resource.request(requestBody, requestOptions, ApiConstants.HttpMethod.POST, null);
        return SubjectErasureResponse.fromJson(jsonResult);
    }
}
