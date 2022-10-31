# StatsApi

All URIs are relative to *https://statsapi.web.nhl.com/api/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getStatTypes**](StatsApi.md#getStatTypes) | **GET** /statTypes | Get all available NHL statistic types. |



## getStatTypes

> List&lt;StatTypesInner&gt; getStatTypes()

Get all available NHL statistic types.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StatsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://statsapi.web.nhl.com/api/v1");

        StatsApi apiInstance = new StatsApi(defaultClient);
        try {
            List<StatTypesInner> result = apiInstance.getStatTypes();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StatsApi#getStatTypes");
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

[**List&lt;StatTypesInner&gt;**](StatTypesInner.md)

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

