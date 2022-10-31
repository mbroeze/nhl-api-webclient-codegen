package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import java.math.BigDecimal;
import org.openapitools.client.model.Error;
import org.openapitools.client.model.PlayerStats;
import org.openapitools.client.model.Players;

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
public class PlayersApi {
    private ApiClient apiClient;

    public PlayersApi() {
        this(new ApiClient());
    }

    @Autowired
    public PlayersApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Get an NHL player.
     * 
     * <p><b>200</b> - OK
     * <p><b>404</b> - Error
     * @param id The ID of the player.
     * @return Players
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getPlayerRequestCreation(BigDecimal id) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling getPlayer", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<Players> localVarReturnType = new ParameterizedTypeReference<Players>() {};
        return apiClient.invokeAPI("/people/{id}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get an NHL player.
     * 
     * <p><b>200</b> - OK
     * <p><b>404</b> - Error
     * @param id The ID of the player.
     * @return Players
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Players> getPlayer(BigDecimal id) throws WebClientResponseException {
        ParameterizedTypeReference<Players> localVarReturnType = new ParameterizedTypeReference<Players>() {};
        return getPlayerRequestCreation(id).bodyToMono(localVarReturnType);
    }

    /**
     * Get an NHL player.
     * 
     * <p><b>200</b> - OK
     * <p><b>404</b> - Error
     * @param id The ID of the player.
     * @return ResponseEntity&lt;Players&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Players>> getPlayerWithHttpInfo(BigDecimal id) throws WebClientResponseException {
        ParameterizedTypeReference<Players> localVarReturnType = new ParameterizedTypeReference<Players>() {};
        return getPlayerRequestCreation(id).toEntity(localVarReturnType);
    }

    /**
     * Get an NHL player.
     * 
     * <p><b>200</b> - OK
     * <p><b>404</b> - Error
     * @param id The ID of the player.
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getPlayerWithResponseSpec(BigDecimal id) throws WebClientResponseException {
        return getPlayerRequestCreation(id);
    }
    /**
     * Get specific statistics for an NHL player.
     * 
     * <p><b>200</b> - OK
     * <p><b>404</b> - Error
     * @param id The ID of the player.
     * @param stats Stats explanations:   * &#x60;homeAndAway&#x60; - Provides a split between home and away games.   * &#x60;byMonth&#x60; - Monthly split of stats.   * &#x60;byDayOfWeek&#x60; - Split done by day of the week.   * &#x60;goalsByGameSituation&#x60; - Shows number on when goals for a player happened like how many in the shootout, how many in each period, etc.   * &#x60;onPaceRegularSeason&#x60; - This only works with the current in-progress season and shows projected totals based on current onPaceRegularSeason.   * &#x60;regularSeasonStatRankings&#x60; - Returns where someone stands vs the rest of the league for a specific regularSeasonStatRankings   * &#x60;statsSingleSeason&#x60; - Obtains single season statistics for a player.   * &#x60;vsConference&#x60; - Conference stats split.   * &#x60;vsDivision&#x60; - Division stats split.   * &#x60;vsTeam&#x60; - Conference stats split.   * &#x60;winLoss&#x60; - Very similar to the previous modifier except it provides the W/L/OT split instead of Home and Away. 
     * @param season Return a team&#39;s specific season.
     * @return PlayerStats
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getPlayerStatsRequestCreation(BigDecimal id, String stats, BigDecimal season) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling getPlayerStats", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'stats' is set
        if (stats == null) {
            throw new WebClientResponseException("Missing the required parameter 'stats' when calling getPlayerStats", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("id", id);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "stats", stats));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "season", season));

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<PlayerStats> localVarReturnType = new ParameterizedTypeReference<PlayerStats>() {};
        return apiClient.invokeAPI("/people/{id}/stats", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get specific statistics for an NHL player.
     * 
     * <p><b>200</b> - OK
     * <p><b>404</b> - Error
     * @param id The ID of the player.
     * @param stats Stats explanations:   * &#x60;homeAndAway&#x60; - Provides a split between home and away games.   * &#x60;byMonth&#x60; - Monthly split of stats.   * &#x60;byDayOfWeek&#x60; - Split done by day of the week.   * &#x60;goalsByGameSituation&#x60; - Shows number on when goals for a player happened like how many in the shootout, how many in each period, etc.   * &#x60;onPaceRegularSeason&#x60; - This only works with the current in-progress season and shows projected totals based on current onPaceRegularSeason.   * &#x60;regularSeasonStatRankings&#x60; - Returns where someone stands vs the rest of the league for a specific regularSeasonStatRankings   * &#x60;statsSingleSeason&#x60; - Obtains single season statistics for a player.   * &#x60;vsConference&#x60; - Conference stats split.   * &#x60;vsDivision&#x60; - Division stats split.   * &#x60;vsTeam&#x60; - Conference stats split.   * &#x60;winLoss&#x60; - Very similar to the previous modifier except it provides the W/L/OT split instead of Home and Away. 
     * @param season Return a team&#39;s specific season.
     * @return PlayerStats
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<PlayerStats> getPlayerStats(BigDecimal id, String stats, BigDecimal season) throws WebClientResponseException {
        ParameterizedTypeReference<PlayerStats> localVarReturnType = new ParameterizedTypeReference<PlayerStats>() {};
        return getPlayerStatsRequestCreation(id, stats, season).bodyToMono(localVarReturnType);
    }

    /**
     * Get specific statistics for an NHL player.
     * 
     * <p><b>200</b> - OK
     * <p><b>404</b> - Error
     * @param id The ID of the player.
     * @param stats Stats explanations:   * &#x60;homeAndAway&#x60; - Provides a split between home and away games.   * &#x60;byMonth&#x60; - Monthly split of stats.   * &#x60;byDayOfWeek&#x60; - Split done by day of the week.   * &#x60;goalsByGameSituation&#x60; - Shows number on when goals for a player happened like how many in the shootout, how many in each period, etc.   * &#x60;onPaceRegularSeason&#x60; - This only works with the current in-progress season and shows projected totals based on current onPaceRegularSeason.   * &#x60;regularSeasonStatRankings&#x60; - Returns where someone stands vs the rest of the league for a specific regularSeasonStatRankings   * &#x60;statsSingleSeason&#x60; - Obtains single season statistics for a player.   * &#x60;vsConference&#x60; - Conference stats split.   * &#x60;vsDivision&#x60; - Division stats split.   * &#x60;vsTeam&#x60; - Conference stats split.   * &#x60;winLoss&#x60; - Very similar to the previous modifier except it provides the W/L/OT split instead of Home and Away. 
     * @param season Return a team&#39;s specific season.
     * @return ResponseEntity&lt;PlayerStats&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<PlayerStats>> getPlayerStatsWithHttpInfo(BigDecimal id, String stats, BigDecimal season) throws WebClientResponseException {
        ParameterizedTypeReference<PlayerStats> localVarReturnType = new ParameterizedTypeReference<PlayerStats>() {};
        return getPlayerStatsRequestCreation(id, stats, season).toEntity(localVarReturnType);
    }

    /**
     * Get specific statistics for an NHL player.
     * 
     * <p><b>200</b> - OK
     * <p><b>404</b> - Error
     * @param id The ID of the player.
     * @param stats Stats explanations:   * &#x60;homeAndAway&#x60; - Provides a split between home and away games.   * &#x60;byMonth&#x60; - Monthly split of stats.   * &#x60;byDayOfWeek&#x60; - Split done by day of the week.   * &#x60;goalsByGameSituation&#x60; - Shows number on when goals for a player happened like how many in the shootout, how many in each period, etc.   * &#x60;onPaceRegularSeason&#x60; - This only works with the current in-progress season and shows projected totals based on current onPaceRegularSeason.   * &#x60;regularSeasonStatRankings&#x60; - Returns where someone stands vs the rest of the league for a specific regularSeasonStatRankings   * &#x60;statsSingleSeason&#x60; - Obtains single season statistics for a player.   * &#x60;vsConference&#x60; - Conference stats split.   * &#x60;vsDivision&#x60; - Division stats split.   * &#x60;vsTeam&#x60; - Conference stats split.   * &#x60;winLoss&#x60; - Very similar to the previous modifier except it provides the W/L/OT split instead of Home and Away. 
     * @param season Return a team&#39;s specific season.
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getPlayerStatsWithResponseSpec(BigDecimal id, String stats, BigDecimal season) throws WebClientResponseException {
        return getPlayerStatsRequestCreation(id, stats, season);
    }
}
