# ConferencesApi

All URIs are relative to *https://statsapi.web.nhl.com/api/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getConference**](ConferencesApi.md#getConference) | **GET** /conferences/{id} | Get an NHL conference. |
| [**getConferences**](ConferencesApi.md#getConferences) | **GET** /conferences | Get all current NHL conferences. |



## getConference

> Division getConference(id)

Get an NHL conference.

You can use this to also retrieve inactive conferences. For example, the ID for the World Cup of Hockey is &#x60;7&#x60;.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ConferencesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://statsapi.web.nhl.com/api/v1");

        ConferencesApi apiInstance = new ConferencesApi(defaultClient);
        BigDecimal id = new BigDecimal("5"); // BigDecimal | The ID of the conference.
        try {
            Division result = apiInstance.getConference(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ConferencesApi#getConference");
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
| **id** | **BigDecimal**| The ID of the conference. | |

### Return type

[**Division**](Division.md)

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


## getConferences

> Conferences getConferences()

Get all current NHL conferences.

This only retrieves active conferences. For inactive conferences, use &#x60;/conferences/{id}&#x60;.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ConferencesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://statsapi.web.nhl.com/api/v1");

        ConferencesApi apiInstance = new ConferencesApi(defaultClient);
        try {
            Conferences result = apiInstance.getConferences();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ConferencesApi#getConferences");
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

[**Conferences**](Conferences.md)

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

