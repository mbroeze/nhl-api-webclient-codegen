# DivisionsApi

All URIs are relative to *https://statsapi.web.nhl.com/api/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getDivision**](DivisionsApi.md#getDivision) | **GET** /divisions/{id} | Get an NHL division. |
| [**getDivisions**](DivisionsApi.md#getDivisions) | **GET** /divisions | Get all current NHL divisions. |



## getDivision

> Division getDivision(id)

Get an NHL division.

You can use this to also retrieve inactive divisions. For example, the ID for the old Patrick division is &#x60;13&#x60;.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DivisionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://statsapi.web.nhl.com/api/v1");

        DivisionsApi apiInstance = new DivisionsApi(defaultClient);
        BigDecimal id = new BigDecimal("15"); // BigDecimal | The ID of the division.
        try {
            Division result = apiInstance.getDivision(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DivisionsApi#getDivision");
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
| **id** | **BigDecimal**| The ID of the division. | |

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


## getDivisions

> Divisions getDivisions()

Get all current NHL divisions.

This only retrieves active divisions. For inactive divisions, use &#x60;/divisions/{id}&#x60;.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DivisionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://statsapi.web.nhl.com/api/v1");

        DivisionsApi apiInstance = new DivisionsApi(defaultClient);
        try {
            Divisions result = apiInstance.getDivisions();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DivisionsApi#getDivisions");
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

[**Divisions**](Divisions.md)

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

