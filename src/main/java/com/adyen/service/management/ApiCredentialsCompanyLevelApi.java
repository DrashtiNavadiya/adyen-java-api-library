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
import com.adyen.model.management.CompanyApiCredential;
import com.adyen.model.management.CreateCompanyApiCredentialRequest;
import com.adyen.model.management.CreateCompanyApiCredentialResponse;
import com.adyen.model.management.ListCompanyApiCredentialsResponse;
import com.adyen.model.management.RestServiceError;
import com.adyen.model.management.UpdateCompanyApiCredentialRequest;
import com.adyen.model.RequestOptions;
import com.adyen.service.exception.ApiException;
import com.adyen.service.resource.Resource;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ApiCredentialsCompanyLevelApi extends Service {
    private final String baseURL;

    public ApiCredentialsCompanyLevelApi(Client client) {
        super(client);
        this.baseURL = createBaseURL("https://management-test.adyen.com/v1");
    }

    /**
    * Get a list of API credentials
    *
    * @param companyId {@link String } The unique identifier of the company account. (required)
    * @return {@link ListCompanyApiCredentialsResponse }
    * @throws ApiException if fails to make API call
    */
    public ListCompanyApiCredentialsResponse listApiCredentials(String companyId) throws ApiException, IOException {
        return listApiCredentials(companyId, null,  null,  null);
    }

    /**
    * Get a list of API credentials
    *
    * @param companyId {@link String } The unique identifier of the company account. (required)
    * @param pageNumber {@link Integer } Query: The number of the page to fetch. (optional)
    * @param pageSize {@link Integer } Query: The number of items to have on a page, maximum 100. The default is 10 items on a page. (optional)
    * @param requestOptions {@link RequestOptions } Object to store additional data such as idempotency-keys (optional)
    * @return {@link ListCompanyApiCredentialsResponse }
    * @throws ApiException if fails to make API call
    */
    public ListCompanyApiCredentialsResponse listApiCredentials(String companyId, Integer pageNumber, Integer pageSize, RequestOptions requestOptions) throws ApiException, IOException {
        //Add path params
        Map<String, String> pathParams = new HashMap<>();
        if (companyId == null) {
            throw new IllegalArgumentException("Please provide the companyId path parameter");
        }
        pathParams.put("companyId", companyId);
        //Add query params
        Map<String, String> queryParams = new HashMap<>();
        if (pageNumber != null) {
        queryParams.put("pageNumber", pageNumber.toString());
        }
        if (pageSize != null) {
        queryParams.put("pageSize", pageSize.toString());
        }

        String requestBody = null;
        Resource resource = new Resource(this, this.baseURL + "/companies/{companyId}/apiCredentials", null);
        String jsonResult = resource.request(requestBody, requestOptions, ApiConstants.HttpMethod.GET, pathParams, queryParams);
        return ListCompanyApiCredentialsResponse.fromJson(jsonResult);
    }

    /**
    * Get an API credential
    *
    * @param companyId {@link String } The unique identifier of the company account. (required)
    * @param apiCredentialId {@link String } Unique identifier of the API credential. (required)
    * @return {@link CompanyApiCredential }
    * @throws ApiException if fails to make API call
    */
    public CompanyApiCredential getApiCredential(String companyId, String apiCredentialId) throws ApiException, IOException {
        return getApiCredential(companyId, apiCredentialId, null);
    }

    /**
    * Get an API credential
    *
    * @param companyId {@link String } The unique identifier of the company account. (required)
    * @param apiCredentialId {@link String } Unique identifier of the API credential. (required)
    * @param requestOptions {@link RequestOptions } Object to store additional data such as idempotency-keys (optional)
    * @return {@link CompanyApiCredential }
    * @throws ApiException if fails to make API call
    */
    public CompanyApiCredential getApiCredential(String companyId, String apiCredentialId, RequestOptions requestOptions) throws ApiException, IOException {
        //Add path params
        Map<String, String> pathParams = new HashMap<>();
        if (companyId == null) {
            throw new IllegalArgumentException("Please provide the companyId path parameter");
        }
        pathParams.put("companyId", companyId);
        if (apiCredentialId == null) {
            throw new IllegalArgumentException("Please provide the apiCredentialId path parameter");
        }
        pathParams.put("apiCredentialId", apiCredentialId);

        String requestBody = null;
        Resource resource = new Resource(this, this.baseURL + "/companies/{companyId}/apiCredentials/{apiCredentialId}", null);
        String jsonResult = resource.request(requestBody, requestOptions, ApiConstants.HttpMethod.GET, pathParams);
        return CompanyApiCredential.fromJson(jsonResult);
    }

    /**
    * Update an API credential.
    *
    * @param companyId {@link String } The unique identifier of the company account. (required)
    * @param apiCredentialId {@link String } Unique identifier of the API credential. (required)
    * @param updateCompanyApiCredentialRequest {@link UpdateCompanyApiCredentialRequest }  (required)
    * @return {@link CompanyApiCredential }
    * @throws ApiException if fails to make API call
    */
    public CompanyApiCredential updateApiCredential(String companyId, String apiCredentialId, UpdateCompanyApiCredentialRequest updateCompanyApiCredentialRequest) throws ApiException, IOException {
        return updateApiCredential(companyId, apiCredentialId, updateCompanyApiCredentialRequest, null);
    }

    /**
    * Update an API credential.
    *
    * @param companyId {@link String } The unique identifier of the company account. (required)
    * @param apiCredentialId {@link String } Unique identifier of the API credential. (required)
    * @param updateCompanyApiCredentialRequest {@link UpdateCompanyApiCredentialRequest }  (required)
    * @param requestOptions {@link RequestOptions } Object to store additional data such as idempotency-keys (optional)
    * @return {@link CompanyApiCredential }
    * @throws ApiException if fails to make API call
    */
    public CompanyApiCredential updateApiCredential(String companyId, String apiCredentialId, UpdateCompanyApiCredentialRequest updateCompanyApiCredentialRequest, RequestOptions requestOptions) throws ApiException, IOException {
        //Add path params
        Map<String, String> pathParams = new HashMap<>();
        if (companyId == null) {
            throw new IllegalArgumentException("Please provide the companyId path parameter");
        }
        pathParams.put("companyId", companyId);
        if (apiCredentialId == null) {
            throw new IllegalArgumentException("Please provide the apiCredentialId path parameter");
        }
        pathParams.put("apiCredentialId", apiCredentialId);

        String requestBody = updateCompanyApiCredentialRequest.toJson();
        Resource resource = new Resource(this, this.baseURL + "/companies/{companyId}/apiCredentials/{apiCredentialId}", null);
        String jsonResult = resource.request(requestBody, requestOptions, ApiConstants.HttpMethod.PATCH, pathParams);
        return CompanyApiCredential.fromJson(jsonResult);
    }

    /**
    * Create an API credential.
    *
    * @param companyId {@link String } The unique identifier of the company account. (required)
    * @param createCompanyApiCredentialRequest {@link CreateCompanyApiCredentialRequest }  (required)
    * @return {@link CreateCompanyApiCredentialResponse }
    * @throws ApiException if fails to make API call
    */
    public CreateCompanyApiCredentialResponse createApiCredential(String companyId, CreateCompanyApiCredentialRequest createCompanyApiCredentialRequest) throws ApiException, IOException {
        return createApiCredential(companyId, createCompanyApiCredentialRequest, null);
    }

    /**
    * Create an API credential.
    *
    * @param companyId {@link String } The unique identifier of the company account. (required)
    * @param createCompanyApiCredentialRequest {@link CreateCompanyApiCredentialRequest }  (required)
    * @param requestOptions {@link RequestOptions } Object to store additional data such as idempotency-keys (optional)
    * @return {@link CreateCompanyApiCredentialResponse }
    * @throws ApiException if fails to make API call
    */
    public CreateCompanyApiCredentialResponse createApiCredential(String companyId, CreateCompanyApiCredentialRequest createCompanyApiCredentialRequest, RequestOptions requestOptions) throws ApiException, IOException {
        //Add path params
        Map<String, String> pathParams = new HashMap<>();
        if (companyId == null) {
            throw new IllegalArgumentException("Please provide the companyId path parameter");
        }
        pathParams.put("companyId", companyId);

        String requestBody = createCompanyApiCredentialRequest.toJson();
        Resource resource = new Resource(this, this.baseURL + "/companies/{companyId}/apiCredentials", null);
        String jsonResult = resource.request(requestBody, requestOptions, ApiConstants.HttpMethod.POST, pathParams);
        return CreateCompanyApiCredentialResponse.fromJson(jsonResult);
    }
}
