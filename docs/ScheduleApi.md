# ScheduleApi

All URIs are relative to *https://statsapi.web.nhl.com/api/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getSchedule**](ScheduleApi.md#getSchedule) | **GET** /schedule | Get the NHL game schedule. |



## getSchedule

> Schedule getSchedule(expand, teamId, startDate, endDate)

Get the NHL game schedule.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ScheduleApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://statsapi.web.nhl.com/api/v1");

        ScheduleApi apiInstance = new ScheduleApi(defaultClient);
        String expand = "schedule.brodcasts"; // String | Expand explanations:   * `schedule.brodcasts` - Shows the broadcasts of the game.   * `schedule.linescore` - Linescore for completed games.   * `schedule.ticket` - Provides the different places to buy tickets for the upcoming games.   * `team.schedule.previous` - Same as above but for the last game played. 
        String teamId = "28"; // String | Limit results to a specific team. Team ids can be found through the teams endpoint
        LocalDate startDate = LocalDate.parse("Sat Feb 10 19:00:00 EST 2018"); // LocalDate | Start date for the search.
        LocalDate endDate = LocalDate.parse("Sat Feb 17 19:00:00 EST 2018"); // LocalDate | End date for the search.
        try {
            Schedule result = apiInstance.getSchedule(expand, teamId, startDate, endDate);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ScheduleApi#getSchedule");
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
| **expand** | **String**| Expand explanations:   * &#x60;schedule.brodcasts&#x60; - Shows the broadcasts of the game.   * &#x60;schedule.linescore&#x60; - Linescore for completed games.   * &#x60;schedule.ticket&#x60; - Provides the different places to buy tickets for the upcoming games.   * &#x60;team.schedule.previous&#x60; - Same as above but for the last game played.  | [optional] [enum: schedule.brodcasts, schedule.linescore, schedule.ticket, team.schedule.previous] |
| **teamId** | **String**| Limit results to a specific team. Team ids can be found through the teams endpoint | [optional] |
| **startDate** | **LocalDate**| Start date for the search. | [optional] |
| **endDate** | **LocalDate**| End date for the search. | [optional] |

### Return type

[**Schedule**](Schedule.md)

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

