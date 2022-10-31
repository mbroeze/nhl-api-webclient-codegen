package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.Error;
import java.time.LocalDate;
import org.openapitools.client.model.Schedule;

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
public class ScheduleApi {
    private ApiClient apiClient;

    public ScheduleApi() {
        this(new ApiClient());
    }

    @Autowired
    public ScheduleApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Get the NHL game schedule.
     * 
     * <p><b>200</b> - OK
     * <p><b>404</b> - Error
     * @param expand Expand explanations:   * &#x60;schedule.brodcasts&#x60; - Shows the broadcasts of the game.   * &#x60;schedule.linescore&#x60; - Linescore for completed games.   * &#x60;schedule.ticket&#x60; - Provides the different places to buy tickets for the upcoming games.   * &#x60;team.schedule.previous&#x60; - Same as above but for the last game played. 
     * @param teamId Limit results to a specific team. Team ids can be found through the teams endpoint
     * @param startDate Start date for the search.
     * @param endDate End date for the search.
     * @return Schedule
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getScheduleRequestCreation(String expand, String teamId, LocalDate startDate, LocalDate endDate) throws WebClientResponseException {
        Object postBody = null;
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "expand", expand));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "teamId", teamId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "startDate", startDate));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "endDate", endDate));

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Schedule> localVarReturnType = new ParameterizedTypeReference<Schedule>() {};
        return apiClient.invokeAPI("/schedule", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get the NHL game schedule.
     * 
     * <p><b>200</b> - OK
     * <p><b>404</b> - Error
     * @param expand Expand explanations:   * &#x60;schedule.brodcasts&#x60; - Shows the broadcasts of the game.   * &#x60;schedule.linescore&#x60; - Linescore for completed games.   * &#x60;schedule.ticket&#x60; - Provides the different places to buy tickets for the upcoming games.   * &#x60;team.schedule.previous&#x60; - Same as above but for the last game played. 
     * @param teamId Limit results to a specific team. Team ids can be found through the teams endpoint
     * @param startDate Start date for the search.
     * @param endDate End date for the search.
     * @return Schedule
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Schedule> getSchedule(String expand, String teamId, LocalDate startDate, LocalDate endDate) throws WebClientResponseException {
        ParameterizedTypeReference<Schedule> localVarReturnType = new ParameterizedTypeReference<Schedule>() {};
        return getScheduleRequestCreation(expand, teamId, startDate, endDate).bodyToMono(localVarReturnType);
    }

    /**
     * Get the NHL game schedule.
     * 
     * <p><b>200</b> - OK
     * <p><b>404</b> - Error
     * @param expand Expand explanations:   * &#x60;schedule.brodcasts&#x60; - Shows the broadcasts of the game.   * &#x60;schedule.linescore&#x60; - Linescore for completed games.   * &#x60;schedule.ticket&#x60; - Provides the different places to buy tickets for the upcoming games.   * &#x60;team.schedule.previous&#x60; - Same as above but for the last game played. 
     * @param teamId Limit results to a specific team. Team ids can be found through the teams endpoint
     * @param startDate Start date for the search.
     * @param endDate End date for the search.
     * @return ResponseEntity&lt;Schedule&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Schedule>> getScheduleWithHttpInfo(String expand, String teamId, LocalDate startDate, LocalDate endDate) throws WebClientResponseException {
        ParameterizedTypeReference<Schedule> localVarReturnType = new ParameterizedTypeReference<Schedule>() {};
        return getScheduleRequestCreation(expand, teamId, startDate, endDate).toEntity(localVarReturnType);
    }

    /**
     * Get the NHL game schedule.
     * 
     * <p><b>200</b> - OK
     * <p><b>404</b> - Error
     * @param expand Expand explanations:   * &#x60;schedule.brodcasts&#x60; - Shows the broadcasts of the game.   * &#x60;schedule.linescore&#x60; - Linescore for completed games.   * &#x60;schedule.ticket&#x60; - Provides the different places to buy tickets for the upcoming games.   * &#x60;team.schedule.previous&#x60; - Same as above but for the last game played. 
     * @param teamId Limit results to a specific team. Team ids can be found through the teams endpoint
     * @param startDate Start date for the search.
     * @param endDate End date for the search.
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getScheduleWithResponseSpec(String expand, String teamId, LocalDate startDate, LocalDate endDate) throws WebClientResponseException {
        return getScheduleRequestCreation(expand, teamId, startDate, endDate);
    }
}
