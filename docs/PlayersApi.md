# PlayersApi

All URIs are relative to *https://statsapi.web.nhl.com/api/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getPlayer**](PlayersApi.md#getPlayer) | **GET** /people/{id} | Get an NHL player. |
| [**getPlayerStats**](PlayersApi.md#getPlayerStats) | **GET** /people/{id}/stats | Get specific statistics for an NHL player. |



## getPlayer

> Players getPlayer(id)

Get an NHL player.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PlayersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://statsapi.web.nhl.com/api/v1");

        PlayersApi apiInstance = new PlayersApi(defaultClient);
        BigDecimal id = new BigDecimal("8466138"); // BigDecimal | The ID of the player.
        try {
            Players result = apiInstance.getPlayer(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PlayersApi#getPlayer");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **BigDecimal**| The ID of the player. | |

### Return type

[**Players**](Players.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **404** | Error |  -  |


## getPlayerStats

> PlayerStats getPlayerStats(id, stats, season)

Get specific statistics for an NHL player.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PlayersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://statsapi.web.nhl.com/api/v1");

        PlayersApi apiInstance = new PlayersApi(defaultClient);
        BigDecimal id = new BigDecimal("8466138"); // BigDecimal | The ID of the player.
        String stats = "homeAndAway"; // String | Stats explanations:   * `homeAndAway` - Provides a split between home and away games.   * `byMonth` - Monthly split of stats.   * `byDayOfWeek` - Split done by day of the week.   * `goalsByGameSituation` - Shows number on when goals for a player happened like how many in the shootout, how many in each period, etc.   * `onPaceRegularSeason` - This only works with the current in-progress season and shows projected totals based on current onPaceRegularSeason.   * `regularSeasonStatRankings` - Returns where someone stands vs the rest of the league for a specific regularSeasonStatRankings   * `statsSingleSeason` - Obtains single season statistics for a player.   * `vsConference` - Conference stats split.   * `vsDivision` - Division stats split.   * `vsTeam` - Conference stats split.   * `winLoss` - Very similar to the previous modifier except it provides the W/L/OT split instead of Home and Away. 
        BigDecimal season = new BigDecimal("20172018"); // BigDecimal | Return a team's specific season.
        try {
            PlayerStats result = apiInstance.getPlayerStats(id, stats, season);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PlayersApi#getPlayerStats");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **BigDecimal**| The ID of the player. | |
| **stats** | **String**| Stats explanations:   * &#x60;homeAndAway&#x60; - Provides a split between home and away games.   * &#x60;byMonth&#x60; - Monthly split of stats.   * &#x60;byDayOfWeek&#x60; - Split done by day of the week.   * &#x60;goalsByGameSituation&#x60; - Shows number on when goals for a player happened like how many in the shootout, how many in each period, etc.   * &#x60;onPaceRegularSeason&#x60; - This only works with the current in-progress season and shows projected totals based on current onPaceRegularSeason.   * &#x60;regularSeasonStatRankings&#x60; - Returns where someone stands vs the rest of the league for a specific regularSeasonStatRankings   * &#x60;statsSingleSeason&#x60; - Obtains single season statistics for a player.   * &#x60;vsConference&#x60; - Conference stats split.   * &#x60;vsDivision&#x60; - Division stats split.   * &#x60;vsTeam&#x60; - Conference stats split.   * &#x60;winLoss&#x60; - Very similar to the previous modifier except it provides the W/L/OT split instead of Home and Away.  | [enum: homeAndAway, byDayOfWeek, byMonth, goalsByGameSituation, onPaceRegularSeason, regularSeasonStatRankings, statsSingleSeason, vsConference, vsDivision, vsTeam, winLoss] |
| **season** | **BigDecimal**| Return a team&#39;s specific season. | [optional] |

### Return type

[**PlayerStats**](PlayerStats.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **404** | Error |  -  |

