/*
 * NHL API
 * Documenting the publicly accessible portions of the NHL API.
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import java.math.BigDecimal;
import org.openapitools.client.model.Division;
import org.openapitools.client.model.Divisions;
import org.openapitools.client.model.Error;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * API tests for DivisionsApi
 */
@Ignore
public class DivisionsApiTest {

    private final DivisionsApi api = new DivisionsApi();

    
    /**
     * Get an NHL division.
     *
     * You can use this to also retrieve inactive divisions. For example, the ID for the old Patrick division is &#x60;13&#x60;.
     */
    @Test
    public void getDivisionTest()  {
        BigDecimal id = null;
        Division response = api.getDivision(id).block();

        // TODO: test validations
    }
    
    /**
     * Get all current NHL divisions.
     *
     * This only retrieves active divisions. For inactive divisions, use &#x60;/divisions/{id}&#x60;.
     */
    @Test
    public void getDivisionsTest()  {
        Divisions response = api.getDivisions().block();

        // TODO: test validations
    }
    
}
