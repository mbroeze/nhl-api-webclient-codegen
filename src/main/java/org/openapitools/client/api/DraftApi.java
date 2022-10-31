package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import java.math.BigDecimal;
import org.openapitools.client.model.Draft;
import org.openapitools.client.model.DraftProspects;
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
public class DraftApi {
    private ApiClient apiClient;

    public DraftApi() {
        this(new ApiClient());
    }

    @Autowired
    public DraftApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Get round-by-round data for current year&#39;s NHL Entry Draft.
     * 
     * <p><b>200</b> - OK
     * <p><b>404</b> - Error
     * @return Draft
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getDraftRequestCreation() throws WebClientResponseException {
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

        ParameterizedTypeReference<Draft> localVarReturnType = new ParameterizedTypeReference<Draft>() {};
        return apiClient.invokeAPI("/draft", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get round-by-round data for current year&#39;s NHL Entry Draft.
     * 
     * <p><b>200</b> - OK
     * <p><b>404</b> - Error
     * @return Draft
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Draft> getDraft() throws WebClientResponseException {
        ParameterizedTypeReference<Draft> localVarReturnType = new ParameterizedTypeReference<Draft>() {};
        return getDraftRequestCreation().bodyToMono(localVarReturnType);
    }

    /**
     * Get round-by-round data for current year&#39;s NHL Entry Draft.
     * 
     * <p><b>200</b> - OK
     * <p><b>404</b> - Error
     * @return ResponseEntity&lt;Draft&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Draft>> getDraftWithHttpInfo() throws WebClientResponseException {
        ParameterizedTypeReference<Draft> localVarReturnType = new ParameterizedTypeReference<Draft>() {};
        return getDraftRequestCreation().toEntity(localVarReturnType);
    }

    /**
     * Get round-by-round data for current year&#39;s NHL Entry Draft.
     * 
     * <p><b>200</b> - OK
     * <p><b>404</b> - Error
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getDraftWithResponseSpec() throws WebClientResponseException {
        return getDraftRequestCreation();
    }
    /**
     * Get round-by-round data for a specific year&#39;s NHL Entry Draft.
     * 
     * <p><b>200</b> - OK
     * <p><b>404</b> - Error
     * @param year The draft year.
     * @return Draft
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getDraftByYearRequestCreation(BigDecimal year) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'year' is set
        if (year == null) {
            throw new WebClientResponseException("Missing the required parameter 'year' when calling getDraftByYear", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("year", year);

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

        ParameterizedTypeReference<Draft> localVarReturnType = new ParameterizedTypeReference<Draft>() {};
        return apiClient.invokeAPI("/draft/{year}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get round-by-round data for a specific year&#39;s NHL Entry Draft.
     * 
     * <p><b>200</b> - OK
     * <p><b>404</b> - Error
     * @param year The draft year.
     * @return Draft
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Draft> getDraftByYear(BigDecimal year) throws WebClientResponseException {
        ParameterizedTypeReference<Draft> localVarReturnType = new ParameterizedTypeReference<Draft>() {};
        return getDraftByYearRequestCreation(year).bodyToMono(localVarReturnType);
    }

    /**
     * Get round-by-round data for a specific year&#39;s NHL Entry Draft.
     * 
     * <p><b>200</b> - OK
     * <p><b>404</b> - Error
     * @param year The draft year.
     * @return ResponseEntity&lt;Draft&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Draft>> getDraftByYearWithHttpInfo(BigDecimal year) throws WebClientResponseException {
        ParameterizedTypeReference<Draft> localVarReturnType = new ParameterizedTypeReference<Draft>() {};
        return getDraftByYearRequestCreation(year).toEntity(localVarReturnType);
    }

    /**
     * Get round-by-round data for a specific year&#39;s NHL Entry Draft.
     * 
     * <p><b>200</b> - OK
     * <p><b>404</b> - Error
     * @param year The draft year.
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getDraftByYearWithResponseSpec(BigDecimal year) throws WebClientResponseException {
        return getDraftByYearRequestCreation(year);
    }
    /**
     * Get an NHL Entry Draft prospect.
     * 
     * <p><b>200</b> - OK
     * <p><b>404</b> - Error
     * @param id The prospect ID.
     * @return DraftProspects
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getDraftProspectRequestCreation(BigDecimal id) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling getDraftProspect", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<DraftProspects> localVarReturnType = new ParameterizedTypeReference<DraftProspects>() {};
        return apiClient.invokeAPI("/draft/prospects/{id}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get an NHL Entry Draft prospect.
     * 
     * <p><b>200</b> - OK
     * <p><b>404</b> - Error
     * @param id The prospect ID.
     * @return DraftProspects
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<DraftProspects> getDraftProspect(BigDecimal id) throws WebClientResponseException {
        ParameterizedTypeReference<DraftProspects> localVarReturnType = new ParameterizedTypeReference<DraftProspects>() {};
        return getDraftProspectRequestCreation(id).bodyToMono(localVarReturnType);
    }

    /**
     * Get an NHL Entry Draft prospect.
     * 
     * <p><b>200</b> - OK
     * <p><b>404</b> - Error
     * @param id The prospect ID.
     * @return ResponseEntity&lt;DraftProspects&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<DraftProspects>> getDraftProspectWithHttpInfo(BigDecimal id) throws WebClientResponseException {
        ParameterizedTypeReference<DraftProspects> localVarReturnType = new ParameterizedTypeReference<DraftProspects>() {};
        return getDraftProspectRequestCreation(id).toEntity(localVarReturnType);
    }

    /**
     * Get an NHL Entry Draft prospect.
     * 
     * <p><b>200</b> - OK
     * <p><b>404</b> - Error
     * @param id The prospect ID.
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getDraftProspectWithResponseSpec(BigDecimal id) throws WebClientResponseException {
        return getDraftProspectRequestCreation(id);
    }
    /**
     * Get all NHL Entry Draft prospects.
     * Be forewarned that this endpoint returns a **lot** of data and there does not appear to be a way to paginate results.
     * <p><b>200</b> - OK
     * <p><b>404</b> - Error
     * @return DraftProspects
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getDraftProspectsRequestCreation() throws WebClientResponseException {
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

        ParameterizedTypeReference<DraftProspects> localVarReturnType = new ParameterizedTypeReference<DraftProspects>() {};
        return apiClient.invokeAPI("/draft/prospects", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get all NHL Entry Draft prospects.
     * Be forewarned that this endpoint returns a **lot** of data and there does not appear to be a way to paginate results.
     * <p><b>200</b> - OK
     * <p><b>404</b> - Error
     * @return DraftProspects
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<DraftProspects> getDraftProspects() throws WebClientResponseException {
        ParameterizedTypeReference<DraftProspects> localVarReturnType = new ParameterizedTypeReference<DraftProspects>() {};
        return getDraftProspectsRequestCreation().bodyToMono(localVarReturnType);
    }

    /**
     * Get all NHL Entry Draft prospects.
     * Be forewarned that this endpoint returns a **lot** of data and there does not appear to be a way to paginate results.
     * <p><b>200</b> - OK
     * <p><b>404</b> - Error
     * @return ResponseEntity&lt;DraftProspects&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<DraftProspects>> getDraftProspectsWithHttpInfo() throws WebClientResponseException {
        ParameterizedTypeReference<DraftProspects> localVarReturnType = new ParameterizedTypeReference<DraftProspects>() {};
        return getDraftProspectsRequestCreation().toEntity(localVarReturnType);
    }

    /**
     * Get all NHL Entry Draft prospects.
     * Be forewarned that this endpoint returns a **lot** of data and there does not appear to be a way to paginate results.
     * <p><b>200</b> - OK
     * <p><b>404</b> - Error
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getDraftProspectsWithResponseSpec() throws WebClientResponseException {
        return getDraftProspectsRequestCreation();
    }
}
