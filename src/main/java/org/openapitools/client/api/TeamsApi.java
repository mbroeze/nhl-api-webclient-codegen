package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import java.math.BigDecimal;
import org.openapitools.client.model.Error;
import org.openapitools.client.model.Rosters;
import org.openapitools.client.model.Team;
import org.openapitools.client.model.TeamStats;
import org.openapitools.client.model.Teams;

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
public class TeamsApi {
    private ApiClient apiClient;

    public TeamsApi() {
        this(new ApiClient());
    }

    @Autowired
    public TeamsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Get an NHL team.
     * 
     * <p><b>200</b> - OK
     * <p><b>404</b> - Error
     * @param id The ID of the team.
     * @param expand Expand your response for some additional data.
     * @param season Return a team&#39;s specific season.
     * @return Team
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getTeamRequestCreation(BigDecimal id, String expand, BigDecimal season) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling getTeam", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("id", id);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "expand", expand));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "season", season));

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Team> localVarReturnType = new ParameterizedTypeReference<Team>() {};
        return apiClient.invokeAPI("/teams/{id}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get an NHL team.
     * 
     * <p><b>200</b> - OK
     * <p><b>404</b> - Error
     * @param id The ID of the team.
     * @param expand Expand your response for some additional data.
     * @param season Return a team&#39;s specific season.
     * @return Team
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Team> getTeam(BigDecimal id, String expand, BigDecimal season) throws WebClientResponseException {
        ParameterizedTypeReference<Team> localVarReturnType = new ParameterizedTypeReference<Team>() {};
        return getTeamRequestCreation(id, expand, season).bodyToMono(localVarReturnType);
    }

    /**
     * Get an NHL team.
     * 
     * <p><b>200</b> - OK
     * <p><b>404</b> - Error
     * @param id The ID of the team.
     * @param expand Expand your response for some additional data.
     * @param season Return a team&#39;s specific season.
     * @return ResponseEntity&lt;Team&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Team>> getTeamWithHttpInfo(BigDecimal id, String expand, BigDecimal season) throws WebClientResponseException {
        ParameterizedTypeReference<Team> localVarReturnType = new ParameterizedTypeReference<Team>() {};
        return getTeamRequestCreation(id, expand, season).toEntity(localVarReturnType);
    }

    /**
     * Get an NHL team.
     * 
     * <p><b>200</b> - OK
     * <p><b>404</b> - Error
     * @param id The ID of the team.
     * @param expand Expand your response for some additional data.
     * @param season Return a team&#39;s specific season.
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getTeamWithResponseSpec(BigDecimal id, String expand, BigDecimal season) throws WebClientResponseException {
        return getTeamRequestCreation(id, expand, season);
    }
    /**
     * Get an NHL team&#39;s roster.
     * 
     * <p><b>200</b> - OK
     * <p><b>404</b> - Error
     * @param id The ID of the team.
     * @param season Return a team&#39;s specific season.
     * @return Rosters
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getTeamRosterRequestCreation(BigDecimal id, BigDecimal season) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling getTeamRoster", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("id", id);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "season", season));

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Rosters> localVarReturnType = new ParameterizedTypeReference<Rosters>() {};
        return apiClient.invokeAPI("/teams/{id}/roster", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get an NHL team&#39;s roster.
     * 
     * <p><b>200</b> - OK
     * <p><b>404</b> - Error
     * @param id The ID of the team.
     * @param season Return a team&#39;s specific season.
     * @return Rosters
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Rosters> getTeamRoster(BigDecimal id, BigDecimal season) throws WebClientResponseException {
        ParameterizedTypeReference<Rosters> localVarReturnType = new ParameterizedTypeReference<Rosters>() {};
        return getTeamRosterRequestCreation(id, season).bodyToMono(localVarReturnType);
    }

    /**
     * Get an NHL team&#39;s roster.
     * 
     * <p><b>200</b> - OK
     * <p><b>404</b> - Error
     * @param id The ID of the team.
     * @param season Return a team&#39;s specific season.
     * @return ResponseEntity&lt;Rosters&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Rosters>> getTeamRosterWithHttpInfo(BigDecimal id, BigDecimal season) throws WebClientResponseException {
        ParameterizedTypeReference<Rosters> localVarReturnType = new ParameterizedTypeReference<Rosters>() {};
        return getTeamRosterRequestCreation(id, season).toEntity(localVarReturnType);
    }

    /**
     * Get an NHL team&#39;s roster.
     * 
     * <p><b>200</b> - OK
     * <p><b>404</b> - Error
     * @param id The ID of the team.
     * @param season Return a team&#39;s specific season.
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getTeamRosterWithResponseSpec(BigDecimal id, BigDecimal season) throws WebClientResponseException {
        return getTeamRosterRequestCreation(id, season);
    }
    /**
     * Get all statistics for an NHL team.
     * 
     * <p><b>200</b> - OK
     * <p><b>404</b> - Error
     * @param id The ID of the team.
     * @return TeamStats
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getTeamStatsRequestCreation(BigDecimal id) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling getTeamStats", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<TeamStats> localVarReturnType = new ParameterizedTypeReference<TeamStats>() {};
        return apiClient.invokeAPI("/teams/{id}/stats", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get all statistics for an NHL team.
     * 
     * <p><b>200</b> - OK
     * <p><b>404</b> - Error
     * @param id The ID of the team.
     * @return TeamStats
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<TeamStats> getTeamStats(BigDecimal id) throws WebClientResponseException {
        ParameterizedTypeReference<TeamStats> localVarReturnType = new ParameterizedTypeReference<TeamStats>() {};
        return getTeamStatsRequestCreation(id).bodyToMono(localVarReturnType);
    }

    /**
     * Get all statistics for an NHL team.
     * 
     * <p><b>200</b> - OK
     * <p><b>404</b> - Error
     * @param id The ID of the team.
     * @return ResponseEntity&lt;TeamStats&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<TeamStats>> getTeamStatsWithHttpInfo(BigDecimal id) throws WebClientResponseException {
        ParameterizedTypeReference<TeamStats> localVarReturnType = new ParameterizedTypeReference<TeamStats>() {};
        return getTeamStatsRequestCreation(id).toEntity(localVarReturnType);
    }

    /**
     * Get all statistics for an NHL team.
     * 
     * <p><b>200</b> - OK
     * <p><b>404</b> - Error
     * @param id The ID of the team.
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getTeamStatsWithResponseSpec(BigDecimal id) throws WebClientResponseException {
        return getTeamStatsRequestCreation(id);
    }
    /**
     * Get all NHL teams.
     * 
     * <p><b>200</b> - OK
     * <p><b>404</b> - Error
     * @param expand Expand your response for some additional data.
     * @param season Return a team&#39;s specific season.
     * @return Teams
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getTeamsRequestCreation(String expand, BigDecimal season) throws WebClientResponseException {
        Object postBody = null;
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "expand", expand));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "season", season));

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Teams> localVarReturnType = new ParameterizedTypeReference<Teams>() {};
        return apiClient.invokeAPI("/teams", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get all NHL teams.
     * 
     * <p><b>200</b> - OK
     * <p><b>404</b> - Error
     * @param expand Expand your response for some additional data.
     * @param season Return a team&#39;s specific season.
     * @return Teams
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Teams> getTeams(String expand, BigDecimal season) throws WebClientResponseException {
        ParameterizedTypeReference<Teams> localVarReturnType = new ParameterizedTypeReference<Teams>() {};
        return getTeamsRequestCreation(expand, season).bodyToMono(localVarReturnType);
    }

    /**
     * Get all NHL teams.
     * 
     * <p><b>200</b> - OK
     * <p><b>404</b> - Error
     * @param expand Expand your response for some additional data.
     * @param season Return a team&#39;s specific season.
     * @return ResponseEntity&lt;Teams&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Teams>> getTeamsWithHttpInfo(String expand, BigDecimal season) throws WebClientResponseException {
        ParameterizedTypeReference<Teams> localVarReturnType = new ParameterizedTypeReference<Teams>() {};
        return getTeamsRequestCreation(expand, season).toEntity(localVarReturnType);
    }

    /**
     * Get all NHL teams.
     * 
     * <p><b>200</b> - OK
     * <p><b>404</b> - Error
     * @param expand Expand your response for some additional data.
     * @param season Return a team&#39;s specific season.
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getTeamsWithResponseSpec(String expand, BigDecimal season) throws WebClientResponseException {
        return getTeamsRequestCreation(expand, season);
    }
}
