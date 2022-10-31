# TeamsApi

All URIs are relative to *https://statsapi.web.nhl.com/api/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getTeam**](TeamsApi.md#getTeam) | **GET** /teams/{id} | Get an NHL team. |
| [**getTeamRoster**](TeamsApi.md#getTeamRoster) | **GET** /teams/{id}/roster | Get an NHL team&#39;s roster. |
| [**getTeamStats**](TeamsApi.md#getTeamStats) | **GET** /teams/{id}/stats | Get all statistics for an NHL team. |
| [**getTeams**](TeamsApi.md#getTeams) | **GET** /teams | Get all NHL teams. |



## getTeam

> Team getTeam(id, expand, season)

Get an NHL team.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TeamsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://statsapi.web.nhl.com/api/v1");

        TeamsApi apiInstance = new TeamsApi(defaultClient);
        BigDecimal id = new BigDecimal("28"); // BigDecimal | The ID of the team.
        String expand = "team.roster"; // String | Expand your response for some additional data.
        BigDecimal season = new BigDecimal("20172018"); // BigDecimal | Return a team's specific season.
        try {
            Team result = apiInstance.getTeam(id, expand, season);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TeamsApi#getTeam");
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
| **id** | **BigDecimal**| The ID of the team. | |
| **expand** | **String**| Expand your response for some additional data. | [optional] [enum: team.roster, team.schedule.next, team.schedule.previous] |
| **season** | **BigDecimal**| Return a team&#39;s specific season. | [optional] |

### Return type

[**Team**](Team.md)

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


## getTeamRoster

> Rosters getTeamRoster(id, season)

Get an NHL team&#39;s roster.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TeamsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://statsapi.web.nhl.com/api/v1");

        TeamsApi apiInstance = new TeamsApi(defaultClient);
        BigDecimal id = new BigDecimal("28"); // BigDecimal | The ID of the team.
        BigDecimal season = new BigDecimal("20172018"); // BigDecimal | Return a team's specific season.
        try {
            Rosters result = apiInstance.getTeamRoster(id, season);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TeamsApi#getTeamRoster");
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
| **id** | **BigDecimal**| The ID of the team. | |
| **season** | **BigDecimal**| Return a team&#39;s specific season. | [optional] |

### Return type

[**Rosters**](Rosters.md)

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


## getTeamStats

> TeamStats getTeamStats(id)

Get all statistics for an NHL team.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TeamsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://statsapi.web.nhl.com/api/v1");

        TeamsApi apiInstance = new TeamsApi(defaultClient);
        BigDecimal id = new BigDecimal("28"); // BigDecimal | The ID of the team.
        try {
            TeamStats result = apiInstance.getTeamStats(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TeamsApi#getTeamStats");
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
| **id** | **BigDecimal**| The ID of the team. | |

### Return type

[**TeamStats**](TeamStats.md)

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


## getTeams

> Teams getTeams(expand, season)

Get all NHL teams.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TeamsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://statsapi.web.nhl.com/api/v1");

        TeamsApi apiInstance = new TeamsApi(defaultClient);
        String expand = "team.roster"; // String | Expand your response for some additional data.
        BigDecimal season = new BigDecimal("20172018"); // BigDecimal | Return a team's specific season.
        try {
            Teams result = apiInstance.getTeams(expand, season);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TeamsApi#getTeams");
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
| **expand** | **String**| Expand your response for some additional data. | [optional] [enum: team.roster, team.schedule.next, team.schedule.previous] |
| **season** | **BigDecimal**| Return a team&#39;s specific season. | [optional] |

### Return type

[**Teams**](Teams.md)

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

