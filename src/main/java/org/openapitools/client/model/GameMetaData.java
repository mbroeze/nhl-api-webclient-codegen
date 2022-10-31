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
 * GameMetaData
 */
@JsonPropertyOrder({
  GameMetaData.JSON_PROPERTY_WAIT,
  GameMetaData.JSON_PROPERTY_TIME_STAMP
})
@JsonTypeName("Game_metaData")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-30T23:05:09.464412-04:00[America/Toronto]")
public class GameMetaData {
  public static final String JSON_PROPERTY_WAIT = "wait";
  private BigDecimal wait;

  public static final String JSON_PROPERTY_TIME_STAMP = "timeStamp";
  private String timeStamp;

  public GameMetaData() {
  }

  public GameMetaData wait(BigDecimal wait) {
    
    this.wait = wait;
    return this;
  }

   /**
   * Get wait
   * @return wait
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10", value = "")
  @JsonProperty(JSON_PROPERTY_WAIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getWait() {
    return wait;
  }


  @JsonProperty(JSON_PROPERTY_WAIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWait(BigDecimal wait) {
    this.wait = wait;
  }


  public GameMetaData timeStamp(String timeStamp) {
    
    this.timeStamp = timeStamp;
    return this;
  }

   /**
   * Get timeStamp
   * @return timeStamp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20180211_054345", value = "")
  @JsonProperty(JSON_PROPERTY_TIME_STAMP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTimeStamp() {
    return timeStamp;
  }


  @JsonProperty(JSON_PROPERTY_TIME_STAMP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTimeStamp(String timeStamp) {
    this.timeStamp = timeStamp;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GameMetaData gameMetaData = (GameMetaData) o;
    return Objects.equals(this.wait, gameMetaData.wait) &&
        Objects.equals(this.timeStamp, gameMetaData.timeStamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(wait, timeStamp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GameMetaData {\n");
    sb.append("    wait: ").append(toIndentedString(wait)).append("\n");
    sb.append("    timeStamp: ").append(toIndentedString(timeStamp)).append("\n");
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

