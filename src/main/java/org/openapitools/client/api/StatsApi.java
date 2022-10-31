package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.Error;
import org.openapitools.client.model.StatTypesInner;

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
public class StatsApi {
    private ApiClient apiClient;

    public StatsApi() {
        this(new ApiClient());
    }

    @Autowired
    public StatsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Get all available NHL statistic types.
     * 
     * <p><b>200</b> - OK
     * <p><b>404</b> - Error
     * @return List&lt;StatTypesInner&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getStatTypesRequestCreation() throws WebClientResponseException {
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

        ParameterizedTypeReference<StatTypesInner> localVarReturnType = new ParameterizedTypeReference<StatTypesInner>() {};
        return apiClient.invokeAPI("/statTypes", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get all available NHL statistic types.
     * 
     * <p><b>200</b> - OK
     * <p><b>404</b> - Error
     * @return List&lt;StatTypesInner&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Flux<StatTypesInner> getStatTypes() throws WebClientResponseException {
        ParameterizedTypeReference<StatTypesInner> localVarReturnType = new ParameterizedTypeReference<StatTypesInner>() {};
        return getStatTypesRequestCreation().bodyToFlux(localVarReturnType);
    }

    /**
     * Get all available NHL statistic types.
     * 
     * <p><b>200</b> - OK
     * <p><b>404</b> - Error
     * @return ResponseEntity&lt;List&lt;StatTypesInner&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<List<StatTypesInner>>> getStatTypesWithHttpInfo() throws WebClientResponseException {
        ParameterizedTypeReference<StatTypesInner> localVarReturnType = new ParameterizedTypeReference<StatTypesInner>() {};
        return getStatTypesRequestCreation().toEntityList(localVarReturnType);
    }

    /**
     * Get all available NHL statistic types.
     * 
     * <p><b>200</b> - OK
     * <p><b>404</b> - Error
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getStatTypesWithResponseSpec() throws WebClientResponseException {
        return getStatTypesRequestCreation();
    }
}
