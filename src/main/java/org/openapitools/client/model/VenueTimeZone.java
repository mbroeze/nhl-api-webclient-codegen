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


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * VenueTimeZone
 */
@JsonPropertyOrder({
  VenueTimeZone.JSON_PROPERTY_ID,
  VenueTimeZone.JSON_PROPERTY_OFFSET,
  VenueTimeZone.JSON_PROPERTY_TZ
})
@JsonTypeName("Venue_timeZone")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-30T23:05:09.464412-04:00[America/Toronto]")
public class VenueTimeZone {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_OFFSET = "offset";
  private BigDecimal offset;

  public static final String JSON_PROPERTY_TZ = "tz";
  private String tz;

  public VenueTimeZone() {
  }

  public VenueTimeZone id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "America/Los_Angeles", value = "")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(String id) {
    this.id = id;
  }


  public VenueTimeZone offset(BigDecimal offset) {
    
    this.offset = offset;
    return this;
  }

   /**
   * Get offset
   * @return offset
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "-8", value = "")
  @JsonProperty(JSON_PROPERTY_OFFSET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getOffset() {
    return offset;
  }


  @JsonProperty(JSON_PROPERTY_OFFSET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOffset(BigDecimal offset) {
    this.offset = offset;
  }


  public VenueTimeZone tz(String tz) {
    
    this.tz = tz;
    return this;
  }

   /**
   * Get tz
   * @return tz
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "PST", value = "")
  @JsonProperty(JSON_PROPERTY_TZ)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTz() {
    return tz;
  }


  @JsonProperty(JSON_PROPERTY_TZ)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTz(String tz) {
    this.tz = tz;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VenueTimeZone venueTimeZone = (VenueTimeZone) o;
    return Objects.equals(this.id, venueTimeZone.id) &&
        Objects.equals(this.offset, venueTimeZone.offset) &&
        Objects.equals(this.tz, venueTimeZone.tz);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, offset, tz);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VenueTimeZone {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    tz: ").append(toIndentedString(tz)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

