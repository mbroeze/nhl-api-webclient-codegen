package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import java.math.BigDecimal;
import org.openapitools.client.model.Division;
import org.openapitools.client.model.Divisions;
import org.openapitools.client.model.Error;

import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.web.reactive.function.client.WebClient.ResponseSpec;
import org.springframework.web.reactive.function.client.WebClientResponseException;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import reactor.core.publisher.Mono;
import reactor.core.publisher.Flux;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-30T23:05:09.464412-04:00[America/Toronto]")
public class DivisionsApi {
    private ApiClient apiClient;

    public DivisionsApi() {
        this(new ApiClient());
    }

    @Autowired
    public DivisionsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Get an NHL division.
     * You can use this to also retrieve inactive divisions. For example, the ID for the old Patrick division is &#x60;13&#x60;.
     * <p><b>200</b> - OK
     * <p><b>404</b> - Error
     * @param id The ID of the division.
     * @return Division
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getDivisionRequestCreation(BigDecimal id) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling getDivision", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("id", id);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Division> localVarReturnType = new ParameterizedTypeReference<Division>() {};
        return apiClient.invokeAPI("/divisions/{id}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get an NHL division.
     * You can use this to also retrieve inactive divisions. For example, the ID for the old Patrick division is &#x60;13&#x60;.
     * <p><b>200</b> - OK
     * <p><b>404</b> - Error
     * @param id The ID of the division.
     * @return Division
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Division> getDivision(BigDecimal id) throws WebClientResponseException {
        ParameterizedTypeReference<Division> localVarReturnType = new ParameterizedTypeReference<Division>() {};
        return getDivisionRequestCreation(id).bodyToMono(localVarReturnType);
    }

    /**
     * Get an NHL division.
     * You can use this to also retrieve inactive divisions. For example, the ID for the old Patrick division is &#x60;13&#x60;.
     * <p><b>200</b> - OK
     * <p><b>404</b> - Error
     * @param id The ID of the division.
     * @return ResponseEntity&lt;Division&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Division>> getDivisionWithHttpInfo(BigDecimal id) throws WebClientResponseException {
        ParameterizedTypeReference<Division> localVarReturnType = new ParameterizedTypeReference<Division>() {};
        return getDivisionRequestCreation(id).toEntity(localVarReturnType);
    }

    /**
     * Get an NHL division.
     * You can use this to also retrieve inactive divisions. For example, the ID for the old Patrick division is &#x60;13&#x60;.
     * <p><b>200</b> - OK
     * <p><b>404</b> - Error
     * @param id The ID of the division.
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getDivisionWithResponseSpec(BigDecimal id) throws WebClientResponseException {
        return getDivisionRequestCreation(id);
    }
    /**
     * Get all current NHL divisions.
     * This only retrieves active divisions. For inactive divisions, use &#x60;/divisions/{id}&#x60;.
     * <p><b>200</b> - OK
     * <p><b>404</b> - Error
     * @return Divisions
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getDivisionsRequestCreation() throws WebClientResponseException {
        Object postBody = null;
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Divisions> localVarReturnType = new ParameterizedTypeReference<Divisions>() {};
        return apiClient.invokeAPI("/divisions", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get all current NHL divisions.
     * This only retrieves active divisions. For inactive divisions, use &#x60;/divisions/{id}&#x60;.
     * <p><b>200</b> - OK
     * <p><b>404</b> - Error
     * @return Divisions
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Divisions> getDivisions() throws WebClientResponseException {
        ParameterizedTypeReference<Divisions> localVarReturnType = new ParameterizedTypeReference<Divisions>() {};
        return getDivisionsRequestCreation().bodyToMono(localVarReturnType);
    }

    /**
     * Get all current NHL divisions.
     * This only retrieves active divisions. For inactive divisions, use &#x60;/divisions/{id}&#x60;.
     * <p><b>200</b> - OK
     * <p><b>404</b> - Error
     * @return ResponseEntity&lt;Divisions&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Divisions>> getDivisionsWithHttpInfo() throws WebClientResponseException {
        ParameterizedTypeReference<Divisions> localVarReturnType = new ParameterizedTypeReference<Divisions>() {};
        return getDivisionsRequestCreation().toEntity(localVarReturnType);
    }

    /**
     * Get all current NHL divisions.
     * This only retrieves active divisions. For inactive divisions, use &#x60;/divisions/{id}&#x60;.
     * <p><b>200</b> - OK
     * <p><b>404</b> - Error
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getDivisionsWithResponseSpec() throws WebClientResponseException {
        return getDivisionsRequestCreation();
    }
}
