# DraftApi

All URIs are relative to *https://statsapi.web.nhl.com/api/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getDraft**](DraftApi.md#getDraft) | **GET** /draft | Get round-by-round data for current year&#39;s NHL Entry Draft. |
| [**getDraftByYear**](DraftApi.md#getDraftByYear) | **GET** /draft/{year} | Get round-by-round data for a specific year&#39;s NHL Entry Draft. |
| [**getDraftProspect**](DraftApi.md#getDraftProspect) | **GET** /draft/prospects/{id} | Get an NHL Entry Draft prospect. |
| [**getDraftProspects**](DraftApi.md#getDraftProspects) | **GET** /draft/prospects | Get all NHL Entry Draft prospects. |



## getDraft

> Draft getDraft()

Get round-by-round data for current year&#39;s NHL Entry Draft.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DraftApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://statsapi.web.nhl.com/api/v1");

        DraftApi apiInstance = new DraftApi(defaultClient);
        try {
            Draft result = apiInstance.getDraft();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DraftApi#getDraft");
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

[**Draft**](Draft.md)

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


## getDraftByYear

> Draft getDraftByYear(year)

Get round-by-round data for a specific year&#39;s NHL Entry Draft.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DraftApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://statsapi.web.nhl.com/api/v1");

        DraftApi apiInstance = new DraftApi(defaultClient);
        BigDecimal year = new BigDecimal("2018"); // BigDecimal | The draft year.
        try {
            Draft result = apiInstance.getDraftByYear(year);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DraftApi#getDraftByYear");
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
| **year** | **BigDecimal**| The draft year. | |

### Return type

[**Draft**](Draft.md)

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


## getDraftProspect

> DraftProspects getDraftProspect(id)

Get an NHL Entry Draft prospect.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DraftApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://statsapi.web.nhl.com/api/v1");

        DraftApi apiInstance = new DraftApi(defaultClient);
        BigDecimal id = new BigDecimal("65242"); // BigDecimal | The prospect ID.
        try {
            DraftProspects result = apiInstance.getDraftProspect(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DraftApi#getDraftProspect");
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
| **id** | **BigDecimal**| The prospect ID. | |

### Return type

[**DraftProspects**](DraftProspects.md)

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


## getDraftProspects

> DraftProspects getDraftProspects()

Get all NHL Entry Draft prospects.

Be forewarned that this endpoint returns a **lot** of data and there does not appear to be a way to paginate results.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DraftApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://statsapi.web.nhl.com/api/v1");

        DraftApi apiInstance = new DraftApi(defaultClient);
        try {
            DraftProspects result = apiInstance.getDraftProspects();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DraftApi#getDraftProspects");
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

[**DraftProspects**](DraftProspects.md)

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

