package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.Error;
import java.time.LocalDate;
import org.openapitools.client.model.StandingTypesInner;
import org.openapitools.client.model.Standings;

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
public class StandingsApi {
    private ApiClient apiClient;

    public StandingsApi() {
        this(new ApiClient());
    }

    @Autowired
    public StandingsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Get all available NHL standing types.
     * 
     * <p><b>200</b> - OK
     * <p><b>404</b> - Error
     * @return List&lt;StandingTypesInner&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getStandingTypesRequestCreation() throws WebClientResponseException {
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

        ParameterizedTypeReference<StandingTypesInner> localVarReturnType = new ParameterizedTypeReference<StandingTypesInner>() {};
        return apiClient.invokeAPI("/standingsTypes", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get all available NHL standing types.
     * 
     * <p><b>200</b> - OK
     * <p><b>404</b> - Error
     * @return List&lt;StandingTypesInner&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Flux<StandingTypesInner> getStandingTypes() throws WebClientResponseException {
        ParameterizedTypeReference<StandingTypesInner> localVarReturnType = new ParameterizedTypeReference<StandingTypesInner>() {};
        return getStandingTypesRequestCreation().bodyToFlux(localVarReturnType);
    }

    /**
     * Get all available NHL standing types.
     * 
     * <p><b>200</b> - OK
     * <p><b>404</b> - Error
     * @return ResponseEntity&lt;List&lt;StandingTypesInner&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<List<StandingTypesInner>>> getStandingTypesWithHttpInfo() throws WebClientResponseException {
        ParameterizedTypeReference<StandingTypesInner> localVarReturnType = new ParameterizedTypeReference<StandingTypesInner>() {};
        return getStandingTypesRequestCreation().toEntityList(localVarReturnType);
    }

    /**
     * Get all available NHL standing types.
     * 
     * <p><b>200</b> - OK
     * <p><b>404</b> - Error
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getStandingTypesWithResponseSpec() throws WebClientResponseException {
        return getStandingTypesRequestCreation();
    }
    /**
     * Get NHL division standings.
     * 
     * <p><b>200</b> - OK
     * <p><b>404</b> - Error
     * @param season Standings for a specified season.
     * @param date Standings on a specified date.
     * @return Standings
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getStandingsRequestCreation(LocalDate season, LocalDate date) throws WebClientResponseException {
        Object postBody = null;
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "season", season));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "date", date));

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Standings> localVarReturnType = new ParameterizedTypeReference<Standings>() {};
        return apiClient.invokeAPI("/standings", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get NHL division standings.
     * 
     * <p><b>200</b> - OK
     * <p><b>404</b> - Error
     * @param season Standings for a specified season.
     * @param date Standings on a specified date.
     * @return Standings
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Standings> getStandings(LocalDate season, LocalDate date) throws WebClientResponseException {
        ParameterizedTypeReference<Standings> localVarReturnType = new ParameterizedTypeReference<Standings>() {};
        return getStandingsRequestCreation(season, date).bodyToMono(localVarReturnType);
    }

    /**
     * Get NHL division standings.
     * 
     * <p><b>200</b> - OK
     * <p><b>404</b> - Error
     * @param season Standings for a specified season.
     * @param date Standings on a specified date.
     * @return ResponseEntity&lt;Standings&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Standings>> getStandingsWithHttpInfo(LocalDate season, LocalDate date) throws WebClientResponseException {
        ParameterizedTypeReference<Standings> localVarReturnType = new ParameterizedTypeReference<Standings>() {};
        return getStandingsRequestCreation(season, date).toEntity(localVarReturnType);
    }

    /**
     * Get NHL division standings.
     * 
     * <p><b>200</b> - OK
     * <p><b>404</b> - Error
     * @param season Standings for a specified season.
     * @param date Standings on a specified date.
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getStandingsWithResponseSpec(LocalDate season, LocalDate date) throws WebClientResponseException {
        return getStandingsRequestCreation(season, date);
    }
    /**
     * Get NHL standings for a specific standing type.
     * 
     * <p><b>200</b> - OK
     * <p><b>404</b> - Error
     * @param type Standing types:   * &#x60;byConference&#x60; - Standings by Conference   * &#x60;byDivision&#x60; - Standings by Division   * &#x60;byLeague&#x60; - Standings by League   * &#x60;divisionLeaders&#x60; - Division Leader standings   * &#x60;postseason&#x60; - Postseason Standings   * &#x60;preseason&#x60; - Preseason Standings   * &#x60;regularSeason&#x60; - Regular Season Standings   * &#x60;wildCard&#x60; - Wild card standings   * &#x60;wildCardWithLeaders&#x60; - Wild card standings with Division Leaders 
     * @return Standings
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getStandingsByTypeRequestCreation(String type) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'type' is set
        if (type == null) {
            throw new WebClientResponseException("Missing the required parameter 'type' when calling getStandingsByType", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("type", type);

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

        ParameterizedTypeReference<Standings> localVarReturnType = new ParameterizedTypeReference<Standings>() {};
        return apiClient.invokeAPI("/standings/{type}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get NHL standings for a specific standing type.
     * 
     * <p><b>200</b> - OK
     * <p><b>404</b> - Error
     * @param type Standing types:   * &#x60;byConference&#x60; - Standings by Conference   * &#x60;byDivision&#x60; - Standings by Division   * &#x60;byLeague&#x60; - Standings by League   * &#x60;divisionLeaders&#x60; - Division Leader standings   * &#x60;postseason&#x60; - Postseason Standings   * &#x60;preseason&#x60; - Preseason Standings   * &#x60;regularSeason&#x60; - Regular Season Standings   * &#x60;wildCard&#x60; - Wild card standings   * &#x60;wildCardWithLeaders&#x60; - Wild card standings with Division Leaders 
     * @return Standings
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Standings> getStandingsByType(String type) throws WebClientResponseException {
        ParameterizedTypeReference<Standings> localVarReturnType = new ParameterizedTypeReference<Standings>() {};
        return getStandingsByTypeRequestCreation(type).bodyToMono(localVarReturnType);
    }

    /**
     * Get NHL standings for a specific standing type.
     * 
     * <p><b>200</b> - OK
     * <p><b>404</b> - Error
     * @param type Standing types:   * &#x60;byConference&#x60; - Standings by Conference   * &#x60;byDivision&#x60; - Standings by Division   * &#x60;byLeague&#x60; - Standings by League   * &#x60;divisionLeaders&#x60; - Division Leader standings   * &#x60;postseason&#x60; - Postseason Standings   * &#x60;preseason&#x60; - Preseason Standings   * &#x60;regularSeason&#x60; - Regular Season Standings   * &#x60;wildCard&#x60; - Wild card standings   * &#x60;wildCardWithLeaders&#x60; - Wild card standings with Division Leaders 
     * @return ResponseEntity&lt;Standings&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Standings>> getStandingsByTypeWithHttpInfo(String type) throws WebClientResponseException {
        ParameterizedTypeReference<Standings> localVarReturnType = new ParameterizedTypeReference<Standings>() {};
        return getStandingsByTypeRequestCreation(type).toEntity(localVarReturnType);
    }

    /**
     * Get NHL standings for a specific standing type.
     * 
     * <p><b>200</b> - OK
     * <p><b>404</b> - Error
     * @param type Standing types:   * &#x60;byConference&#x60; - Standings by Conference   * &#x60;byDivision&#x60; - Standings by Division   * &#x60;byLeague&#x60; - Standings by League   * &#x60;divisionLeaders&#x60; - Division Leader standings   * &#x60;postseason&#x60; - Postseason Standings   * &#x60;preseason&#x60; - Preseason Standings   * &#x60;regularSeason&#x60; - Regular Season Standings   * &#x60;wildCard&#x60; - Wild card standings   * &#x60;wildCardWithLeaders&#x60; - Wild card standings with Division Leaders 
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getStandingsByTypeWithResponseSpec(String type) throws WebClientResponseException {
        return getStandingsByTypeRequestCreation(type);
    }
}
