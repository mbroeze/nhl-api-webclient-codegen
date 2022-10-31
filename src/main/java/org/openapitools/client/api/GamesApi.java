package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import java.math.BigDecimal;
import org.openapitools.client.model.Error;
import org.openapitools.client.model.Game;
import org.openapitools.client.model.GameBoxscores;
import org.openapitools.client.model.GameContent;

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
public class GamesApi {
    private ApiClient apiClient;

    public GamesApi() {
        this(new ApiClient());
    }

    @Autowired
    public GamesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Get all available data for an NHL game.
     * This contains all data related to a game, from the boxscore, to play data and even on-ice coordinates. Be forewarned that, depending on the game, this endpoint can return a **lot** of data.
     * <p><b>200</b> - OK
     * <p><b>404</b> - Error
     * @param id The ID of the game. The first 4 digits identify the season of the game (ie. 2017 for the 2017-2018 season). The next 2 digits give the type of game, where 01 &#x3D; preseason, 02 &#x3D; regular season, 03 &#x3D; playoffs, 04 &#x3D; all-star. The final 4 digits identify the specific game number. For regular season and preseason games, this ranges from 0001 to the number of games played. (1271 for seasons with 31 teams (2017 and onwards) and 1230 for seasons with 30 teams). For playoff games, the 2nd digit of the specific number gives the round of the playoffs, the 3rd digit specifies the matchup, and the 4th digit specifies the game (out of 7).
     * @return Game
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getGameRequestCreation(BigDecimal id) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling getGame", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<Game> localVarReturnType = new ParameterizedTypeReference<Game>() {};
        return apiClient.invokeAPI("/game/{id}/feed/live", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get all available data for an NHL game.
     * This contains all data related to a game, from the boxscore, to play data and even on-ice coordinates. Be forewarned that, depending on the game, this endpoint can return a **lot** of data.
     * <p><b>200</b> - OK
     * <p><b>404</b> - Error
     * @param id The ID of the game. The first 4 digits identify the season of the game (ie. 2017 for the 2017-2018 season). The next 2 digits give the type of game, where 01 &#x3D; preseason, 02 &#x3D; regular season, 03 &#x3D; playoffs, 04 &#x3D; all-star. The final 4 digits identify the specific game number. For regular season and preseason games, this ranges from 0001 to the number of games played. (1271 for seasons with 31 teams (2017 and onwards) and 1230 for seasons with 30 teams). For playoff games, the 2nd digit of the specific number gives the round of the playoffs, the 3rd digit specifies the matchup, and the 4th digit specifies the game (out of 7).
     * @return Game
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Game> getGame(BigDecimal id) throws WebClientResponseException {
        ParameterizedTypeReference<Game> localVarReturnType = new ParameterizedTypeReference<Game>() {};
        return getGameRequestCreation(id).bodyToMono(localVarReturnType);
    }

    /**
     * Get all available data for an NHL game.
     * This contains all data related to a game, from the boxscore, to play data and even on-ice coordinates. Be forewarned that, depending on the game, this endpoint can return a **lot** of data.
     * <p><b>200</b> - OK
     * <p><b>404</b> - Error
     * @param id The ID of the game. The first 4 digits identify the season of the game (ie. 2017 for the 2017-2018 season). The next 2 digits give the type of game, where 01 &#x3D; preseason, 02 &#x3D; regular season, 03 &#x3D; playoffs, 04 &#x3D; all-star. The final 4 digits identify the specific game number. For regular season and preseason games, this ranges from 0001 to the number of games played. (1271 for seasons with 31 teams (2017 and onwards) and 1230 for seasons with 30 teams). For playoff games, the 2nd digit of the specific number gives the round of the playoffs, the 3rd digit specifies the matchup, and the 4th digit specifies the game (out of 7).
     * @return ResponseEntity&lt;Game&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Game>> getGameWithHttpInfo(BigDecimal id) throws WebClientResponseException {
        ParameterizedTypeReference<Game> localVarReturnType = new ParameterizedTypeReference<Game>() {};
        return getGameRequestCreation(id).toEntity(localVarReturnType);
    }

    /**
     * Get all available data for an NHL game.
     * This contains all data related to a game, from the boxscore, to play data and even on-ice coordinates. Be forewarned that, depending on the game, this endpoint can return a **lot** of data.
     * <p><b>200</b> - OK
     * <p><b>404</b> - Error
     * @param id The ID of the game. The first 4 digits identify the season of the game (ie. 2017 for the 2017-2018 season). The next 2 digits give the type of game, where 01 &#x3D; preseason, 02 &#x3D; regular season, 03 &#x3D; playoffs, 04 &#x3D; all-star. The final 4 digits identify the specific game number. For regular season and preseason games, this ranges from 0001 to the number of games played. (1271 for seasons with 31 teams (2017 and onwards) and 1230 for seasons with 30 teams). For playoff games, the 2nd digit of the specific number gives the round of the playoffs, the 3rd digit specifies the matchup, and the 4th digit specifies the game (out of 7).
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getGameWithResponseSpec(BigDecimal id) throws WebClientResponseException {
        return getGameRequestCreation(id);
    }
    /**
     * Get the boxscore for an NHL game.
     * If you want detailed play information, you should use &#x60;/game/{id}/feed/live&#x60; or &#x60;/game/{id}/feed/live/diffPatch&#x60;.
     * <p><b>200</b> - OK
     * <p><b>404</b> - Error
     * @param id The ID of the game. The first 4 digits identify the season of the game (ie. 2017 for the 2017-2018 season). The next 2 digits give the type of game, where 01 &#x3D; preseason, 02 &#x3D; regular season, 03 &#x3D; playoffs, 04 &#x3D; all-star. The final 4 digits identify the specific game number. For regular season and preseason games, this ranges from 0001 to the number of games played. (1271 for seasons with 31 teams (2017 and onwards) and 1230 for seasons with 30 teams). For playoff games, the 2nd digit of the specific number gives the round of the playoffs, the 3rd digit specifies the matchup, and the 4th digit specifies the game (out of 7).
     * @return GameBoxscores
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getGameBoxscoreRequestCreation(BigDecimal id) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling getGameBoxscore", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<GameBoxscores> localVarReturnType = new ParameterizedTypeReference<GameBoxscores>() {};
        return apiClient.invokeAPI("/game/{id}/boxscore", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get the boxscore for an NHL game.
     * If you want detailed play information, you should use &#x60;/game/{id}/feed/live&#x60; or &#x60;/game/{id}/feed/live/diffPatch&#x60;.
     * <p><b>200</b> - OK
     * <p><b>404</b> - Error
     * @param id The ID of the game. The first 4 digits identify the season of the game (ie. 2017 for the 2017-2018 season). The next 2 digits give the type of game, where 01 &#x3D; preseason, 02 &#x3D; regular season, 03 &#x3D; playoffs, 04 &#x3D; all-star. The final 4 digits identify the specific game number. For regular season and preseason games, this ranges from 0001 to the number of games played. (1271 for seasons with 31 teams (2017 and onwards) and 1230 for seasons with 30 teams). For playoff games, the 2nd digit of the specific number gives the round of the playoffs, the 3rd digit specifies the matchup, and the 4th digit specifies the game (out of 7).
     * @return GameBoxscores
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<GameBoxscores> getGameBoxscore(BigDecimal id) throws WebClientResponseException {
        ParameterizedTypeReference<GameBoxscores> localVarReturnType = new ParameterizedTypeReference<GameBoxscores>() {};
        return getGameBoxscoreRequestCreation(id).bodyToMono(localVarReturnType);
    }

    /**
     * Get the boxscore for an NHL game.
     * If you want detailed play information, you should use &#x60;/game/{id}/feed/live&#x60; or &#x60;/game/{id}/feed/live/diffPatch&#x60;.
     * <p><b>200</b> - OK
     * <p><b>404</b> - Error
     * @param id The ID of the game. The first 4 digits identify the season of the game (ie. 2017 for the 2017-2018 season). The next 2 digits give the type of game, where 01 &#x3D; preseason, 02 &#x3D; regular season, 03 &#x3D; playoffs, 04 &#x3D; all-star. The final 4 digits identify the specific game number. For regular season and preseason games, this ranges from 0001 to the number of games played. (1271 for seasons with 31 teams (2017 and onwards) and 1230 for seasons with 30 teams). For playoff games, the 2nd digit of the specific number gives the round of the playoffs, the 3rd digit specifies the matchup, and the 4th digit specifies the game (out of 7).
     * @return ResponseEntity&lt;GameBoxscores&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<GameBoxscores>> getGameBoxscoreWithHttpInfo(BigDecimal id) throws WebClientResponseException {
        ParameterizedTypeReference<GameBoxscores> localVarReturnType = new ParameterizedTypeReference<GameBoxscores>() {};
        return getGameBoxscoreRequestCreation(id).toEntity(localVarReturnType);
    }

    /**
     * Get the boxscore for an NHL game.
     * If you want detailed play information, you should use &#x60;/game/{id}/feed/live&#x60; or &#x60;/game/{id}/feed/live/diffPatch&#x60;.
     * <p><b>200</b> - OK
     * <p><b>404</b> - Error
     * @param id The ID of the game. The first 4 digits identify the season of the game (ie. 2017 for the 2017-2018 season). The next 2 digits give the type of game, where 01 &#x3D; preseason, 02 &#x3D; regular season, 03 &#x3D; playoffs, 04 &#x3D; all-star. The final 4 digits identify the specific game number. For regular season and preseason games, this ranges from 0001 to the number of games played. (1271 for seasons with 31 teams (2017 and onwards) and 1230 for seasons with 30 teams). For playoff games, the 2nd digit of the specific number gives the round of the playoffs, the 3rd digit specifies the matchup, and the 4th digit specifies the game (out of 7).
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getGameBoxscoreWithResponseSpec(BigDecimal id) throws WebClientResponseException {
        return getGameBoxscoreRequestCreation(id);
    }
    /**
     * Get editorials, video replays and photo highlights for an NHL game.
     * 
     * <p><b>200</b> - OK
     * <p><b>404</b> - Error
     * @param id The ID of the game. The first 4 digits identify the season of the game (ie. 2017 for the 2017-2018 season). The next 2 digits give the type of game, where 01 &#x3D; preseason, 02 &#x3D; regular season, 03 &#x3D; playoffs, 04 &#x3D; all-star. The final 4 digits identify the specific game number. For regular season and preseason games, this ranges from 0001 to the number of games played. (1271 for seasons with 31 teams (2017 and onwards) and 1230 for seasons with 30 teams). For playoff games, the 2nd digit of the specific number gives the round of the playoffs, the 3rd digit specifies the matchup, and the 4th digit specifies the game (out of 7).
     * @return GameContent
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getGameContentRequestCreation(BigDecimal id) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling getGameContent", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<GameContent> localVarReturnType = new ParameterizedTypeReference<GameContent>() {};
        return apiClient.invokeAPI("/game/{id}/content", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get editorials, video replays and photo highlights for an NHL game.
     * 
     * <p><b>200</b> - OK
     * <p><b>404</b> - Error
     * @param id The ID of the game. The first 4 digits identify the season of the game (ie. 2017 for the 2017-2018 season). The next 2 digits give the type of game, where 01 &#x3D; preseason, 02 &#x3D; regular season, 03 &#x3D; playoffs, 04 &#x3D; all-star. The final 4 digits identify the specific game number. For regular season and preseason games, this ranges from 0001 to the number of games played. (1271 for seasons with 31 teams (2017 and onwards) and 1230 for seasons with 30 teams). For playoff games, the 2nd digit of the specific number gives the round of the playoffs, the 3rd digit specifies the matchup, and the 4th digit specifies the game (out of 7).
     * @return GameContent
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<GameContent> getGameContent(BigDecimal id) throws WebClientResponseException {
        ParameterizedTypeReference<GameContent> localVarReturnType = new ParameterizedTypeReference<GameContent>() {};
        return getGameContentRequestCreation(id).bodyToMono(localVarReturnType);
    }

    /**
     * Get editorials, video replays and photo highlights for an NHL game.
     * 
     * <p><b>200</b> - OK
     * <p><b>404</b> - Error
     * @param id The ID of the game. The first 4 digits identify the season of the game (ie. 2017 for the 2017-2018 season). The next 2 digits give the type of game, where 01 &#x3D; preseason, 02 &#x3D; regular season, 03 &#x3D; playoffs, 04 &#x3D; all-star. The final 4 digits identify the specific game number. For regular season and preseason games, this ranges from 0001 to the number of games played. (1271 for seasons with 31 teams (2017 and onwards) and 1230 for seasons with 30 teams). For playoff games, the 2nd digit of the specific number gives the round of the playoffs, the 3rd digit specifies the matchup, and the 4th digit specifies the game (out of 7).
     * @return ResponseEntity&lt;GameContent&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<GameContent>> getGameContentWithHttpInfo(BigDecimal id) throws WebClientResponseException {
        ParameterizedTypeReference<GameContent> localVarReturnType = new ParameterizedTypeReference<GameContent>() {};
        return getGameContentRequestCreation(id).toEntity(localVarReturnType);
    }

    /**
     * Get editorials, video replays and photo highlights for an NHL game.
     * 
     * <p><b>200</b> - OK
     * <p><b>404</b> - Error
     * @param id The ID of the game. The first 4 digits identify the season of the game (ie. 2017 for the 2017-2018 season). The next 2 digits give the type of game, where 01 &#x3D; preseason, 02 &#x3D; regular season, 03 &#x3D; playoffs, 04 &#x3D; all-star. The final 4 digits identify the specific game number. For regular season and preseason games, this ranges from 0001 to the number of games played. (1271 for seasons with 31 teams (2017 and onwards) and 1230 for seasons with 30 teams). For playoff games, the 2nd digit of the specific number gives the round of the playoffs, the 3rd digit specifies the matchup, and the 4th digit specifies the game (out of 7).
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getGameContentWithResponseSpec(BigDecimal id) throws WebClientResponseException {
        return getGameContentRequestCreation(id);
    }
    /**
     * Get all available data for an NHL game after a specific time.
     * You can use this to return a small subset of data relating to game.
     * <p><b>200</b> - OK
     * <p><b>404</b> - Error
     * @param id The ID of the game. The first 4 digits identify the season of the game (ie. 2017 for the 2017-2018 season). The next 2 digits give the type of game, where 01 &#x3D; preseason, 02 &#x3D; regular season, 03 &#x3D; playoffs, 04 &#x3D; all-star. The final 4 digits identify the specific game number. For regular season and preseason games, this ranges from 0001 to the number of games played. (1271 for seasons with 31 teams (2017 and onwards) and 1230 for seasons with 30 teams). For playoff games, the 2nd digit of the specific number gives the round of the playoffs, the 3rd digit specifies the matchup, and the 4th digit specifies the game (out of 7).
     * @param startTimeCode The prospect ID.
     * @return Game
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getGameDiffRequestCreation(BigDecimal id, String startTimeCode) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling getGameDiff", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'startTimeCode' is set
        if (startTimeCode == null) {
            throw new WebClientResponseException("Missing the required parameter 'startTimeCode' when calling getGameDiff", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("id", id);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "startTimeCode", startTimeCode));

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Game> localVarReturnType = new ParameterizedTypeReference<Game>() {};
        return apiClient.invokeAPI("/game/{id}/feed/live/diffPatch", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get all available data for an NHL game after a specific time.
     * You can use this to return a small subset of data relating to game.
     * <p><b>200</b> - OK
     * <p><b>404</b> - Error
     * @param id The ID of the game. The first 4 digits identify the season of the game (ie. 2017 for the 2017-2018 season). The next 2 digits give the type of game, where 01 &#x3D; preseason, 02 &#x3D; regular season, 03 &#x3D; playoffs, 04 &#x3D; all-star. The final 4 digits identify the specific game number. For regular season and preseason games, this ranges from 0001 to the number of games played. (1271 for seasons with 31 teams (2017 and onwards) and 1230 for seasons with 30 teams). For playoff games, the 2nd digit of the specific number gives the round of the playoffs, the 3rd digit specifies the matchup, and the 4th digit specifies the game (out of 7).
     * @param startTimeCode The prospect ID.
     * @return Game
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Game> getGameDiff(BigDecimal id, String startTimeCode) throws WebClientResponseException {
        ParameterizedTypeReference<Game> localVarReturnType = new ParameterizedTypeReference<Game>() {};
        return getGameDiffRequestCreation(id, startTimeCode).bodyToMono(localVarReturnType);
    }

    /**
     * Get all available data for an NHL game after a specific time.
     * You can use this to return a small subset of data relating to game.
     * <p><b>200</b> - OK
     * <p><b>404</b> - Error
     * @param id The ID of the game. The first 4 digits identify the season of the game (ie. 2017 for the 2017-2018 season). The next 2 digits give the type of game, where 01 &#x3D; preseason, 02 &#x3D; regular season, 03 &#x3D; playoffs, 04 &#x3D; all-star. The final 4 digits identify the specific game number. For regular season and preseason games, this ranges from 0001 to the number of games played. (1271 for seasons with 31 teams (2017 and onwards) and 1230 for seasons with 30 teams). For playoff games, the 2nd digit of the specific number gives the round of the playoffs, the 3rd digit specifies the matchup, and the 4th digit specifies the game (out of 7).
     * @param startTimeCode The prospect ID.
     * @return ResponseEntity&lt;Game&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Game>> getGameDiffWithHttpInfo(BigDecimal id, String startTimeCode) throws WebClientResponseException {
        ParameterizedTypeReference<Game> localVarReturnType = new ParameterizedTypeReference<Game>() {};
        return getGameDiffRequestCreation(id, startTimeCode).toEntity(localVarReturnType);
    }

    /**
     * Get all available data for an NHL game after a specific time.
     * You can use this to return a small subset of data relating to game.
     * <p><b>200</b> - OK
     * <p><b>404</b> - Error
     * @param id The ID of the game. The first 4 digits identify the season of the game (ie. 2017 for the 2017-2018 season). The next 2 digits give the type of game, where 01 &#x3D; preseason, 02 &#x3D; regular season, 03 &#x3D; playoffs, 04 &#x3D; all-star. The final 4 digits identify the specific game number. For regular season and preseason games, this ranges from 0001 to the number of games played. (1271 for seasons with 31 teams (2017 and onwards) and 1230 for seasons with 30 teams). For playoff games, the 2nd digit of the specific number gives the round of the playoffs, the 3rd digit specifies the matchup, and the 4th digit specifies the game (out of 7).
     * @param startTimeCode The prospect ID.
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getGameDiffWithResponseSpec(BigDecimal id, String startTimeCode) throws WebClientResponseException {
        return getGameDiffRequestCreation(id, startTimeCode);
    }
}
