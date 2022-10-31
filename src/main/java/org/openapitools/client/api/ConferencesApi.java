package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import java.math.BigDecimal;
import org.openapitools.client.model.Conferences;
import org.openapitools.client.model.Division;
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
public class ConferencesApi {
    private ApiClient apiClient;

    public ConferencesApi() {
        this(new ApiClient());
    }

    @Autowired
    public ConferencesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Get an NHL conference.
     * You can use this to also retrieve inactive conferences. For example, the ID for the World Cup of Hockey is &#x60;7&#x60;.
     * <p><b>200</b> - OK
     * <p><b>404</b> - Error
     * @param id The ID of the conference.
     * @return Division
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getConferenceRequestCreation(BigDecimal id) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling getConference", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/conferences/{id}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get an NHL conference.
     * You can use this to also retrieve inactive conferences. For example, the ID for the World Cup of Hockey is &#x60;7&#x60;.
     * <p><b>200</b> - OK
     * <p><b>404</b> - Error
     * @param id The ID of the conference.
     * @return Division
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Division> getConference(BigDecimal id) throws WebClientResponseException {
        ParameterizedTypeReference<Division> localVarReturnType = new ParameterizedTypeReference<Division>() {};
        return getConferenceRequestCreation(id).bodyToMono(localVarReturnType);
    }

    /**
     * Get an NHL conference.
     * You can use this to also retrieve inactive conferences. For example, the ID for the World Cup of Hockey is &#x60;7&#x60;.
     * <p><b>200</b> - OK
     * <p><b>404</b> - Error
     * @param id The ID of the conference.
     * @return ResponseEntity&lt;Division&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Division>> getConferenceWithHttpInfo(BigDecimal id) throws WebClientResponseException {
        ParameterizedTypeReference<Division> localVarReturnType = new ParameterizedTypeReference<Division>() {};
        return getConferenceRequestCreation(id).toEntity(localVarReturnType);
    }

    /**
     * Get an NHL conference.
     * You can use this to also retrieve inactive conferences. For example, the ID for the World Cup of Hockey is &#x60;7&#x60;.
     * <p><b>200</b> - OK
     * <p><b>404</b> - Error
     * @param id The ID of the conference.
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getConferenceWithResponseSpec(BigDecimal id) throws WebClientResponseException {
        return getConferenceRequestCreation(id);
    }
    /**
     * Get all current NHL conferences.
     * This only retrieves active conferences. For inactive conferences, use &#x60;/conferences/{id}&#x60;.
     * <p><b>200</b> - OK
     * <p><b>404</b> - Error
     * @return Conferences
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getConferencesRequestCreation() throws WebClientResponseException {
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

        ParameterizedTypeReference<Conferences> localVarReturnType = new ParameterizedTypeReference<Conferences>() {};
        return apiClient.invokeAPI("/conferences", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get all current NHL conferences.
     * This only retrieves active conferences. For inactive conferences, use &#x60;/conferences/{id}&#x60;.
     * <p><b>200</b> - OK
     * <p><b>404</b> - Error
     * @return Conferences
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Conferences> getConferences() throws WebClientResponseException {
        ParameterizedTypeReference<Conferences> localVarReturnType = new ParameterizedTypeReference<Conferences>() {};
        return getConferencesRequestCreation().bodyToMono(localVarReturnType);
    }

    /**
     * Get all current NHL conferences.
     * This only retrieves active conferences. For inactive conferences, use &#x60;/conferences/{id}&#x60;.
     * <p><b>200</b> - OK
     * <p><b>404</b> - Error
     * @return ResponseEntity&lt;Conferences&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Conferences>> getConferencesWithHttpInfo() throws WebClientResponseException {
        ParameterizedTypeReference<Conferences> localVarReturnType = new ParameterizedTypeReference<Conferences>() {};
        return getConferencesRequestCreation().toEntity(localVarReturnType);
    }

    /**
     * Get all current NHL conferences.
     * This only retrieves active conferences. For inactive conferences, use &#x60;/conferences/{id}&#x60;.
     * <p><b>200</b> - OK
     * <p><b>404</b> - Error
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getConferencesWithResponseSpec() throws WebClientResponseException {
        return getConferencesRequestCreation();
    }
}
