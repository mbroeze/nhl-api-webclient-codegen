# StandingsApi

All URIs are relative to *https://statsapi.web.nhl.com/api/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getStandingTypes**](StandingsApi.md#getStandingTypes) | **GET** /standingsTypes | Get all available NHL standing types. |
| [**getStandings**](StandingsApi.md#getStandings) | **GET** /standings | Get NHL division standings. |
| [**getStandingsByType**](StandingsApi.md#getStandingsByType) | **GET** /standings/{type} | Get NHL standings for a specific standing type. |



## getStandingTypes

> List&lt;StandingTypesInner&gt; getStandingTypes()

Get all available NHL standing types.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StandingsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://statsapi.web.nhl.com/api/v1");

        StandingsApi apiInstance = new StandingsApi(defaultClient);
        try {
            List<StandingTypesInner> result = apiInstance.getStandingTypes();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StandingsApi#getStandingTypes");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**List&lt;StandingTypesInner&gt;**](StandingTypesInner.md)

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


## getStandings

> Standings getStandings(season, date)

Get NHL division standings.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StandingsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://statsapi.web.nhl.com/api/v1");

        StandingsApi apiInstance = new StandingsApi(defaultClient);
        LocalDate season = LocalDate.now(); // LocalDate | Standings for a specified season.
        LocalDate date = LocalDate.parse("Mon Jan 08 19:00:00 EST 2018"); // LocalDate | Standings on a specified date.
        try {
            Standings result = apiInstance.getStandings(season, date);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StandingsApi#getStandings");
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
| **season** | **LocalDate**| Standings for a specified season. | [optional] |
| **date** | **LocalDate**| Standings on a specified date. | [optional] |

### Return type

[**Standings**](Standings.md)

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


## getStandingsByType

> Standings getStandingsByType(type)

Get NHL standings for a specific standing type.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StandingsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://statsapi.web.nhl.com/api/v1");

        StandingsApi apiInstance = new StandingsApi(defaultClient);
        String type = "byConference"; // String | Standing types:   * `byConference` - Standings by Conference   * `byDivision` - Standings by Division   * `byLeague` - Standings by League   * `divisionLeaders` - Division Leader standings   * `postseason` - Postseason Standings   * `preseason` - Preseason Standings   * `regularSeason` - Regular Season Standings   * `wildCard` - Wild card standings   * `wildCardWithLeaders` - Wild card standings with Division Leaders 
        try {
            Standings result = apiInstance.getStandingsByType(type);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StandingsApi#getStandingsByType");
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
| **type** | **String**| Standing types:   * &#x60;byConference&#x60; - Standings by Conference   * &#x60;byDivision&#x60; - Standings by Division   * &#x60;byLeague&#x60; - Standings by League   * &#x60;divisionLeaders&#x60; - Division Leader standings   * &#x60;postseason&#x60; - Postseason Standings   * &#x60;preseason&#x60; - Preseason Standings   * &#x60;regularSeason&#x60; - Regular Season Standings   * &#x60;wildCard&#x60; - Wild card standings   * &#x60;wildCardWithLeaders&#x60; - Wild card standings with Division Leaders  | [enum: byConference, byDivision, byLeague, divisionLeaders, postseason, preseason, regularSeason, wildCard, wildCardWithLeaders] |

### Return type

[**Standings**](Standings.md)

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

