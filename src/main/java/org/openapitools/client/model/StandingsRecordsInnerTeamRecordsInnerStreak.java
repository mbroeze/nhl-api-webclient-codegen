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
 * StandingsRecordsInnerTeamRecordsInnerStreak
 */
@JsonPropertyOrder({
  StandingsRecordsInnerTeamRecordsInnerStreak.JSON_PROPERTY_STREAK_TYPE,
  StandingsRecordsInnerTeamRecordsInnerStreak.JSON_PROPERTY_STREAK_NUMBER,
  StandingsRecordsInnerTeamRecordsInnerStreak.JSON_PROPERTY_STREAK_CODE
})
@JsonTypeName("Standings_records_inner_teamRecords_inner_streak")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-30T23:05:09.464412-04:00[America/Toronto]")
public class StandingsRecordsInnerTeamRecordsInnerStreak {
  public static final String JSON_PROPERTY_STREAK_TYPE = "streakType";
  private String streakType;

  public static final String JSON_PROPERTY_STREAK_NUMBER = "streakNumber";
  private BigDecimal streakNumber;

  public static final String JSON_PROPERTY_STREAK_CODE = "streakCode";
  private String streakCode;

  public StandingsRecordsInnerTeamRecordsInnerStreak() {
  }

  public StandingsRecordsInnerTeamRecordsInnerStreak streakType(String streakType) {
    
    this.streakType = streakType;
    return this;
  }

   /**
   * Get streakType
   * @return streakType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "wins", value = "")
  @JsonProperty(JSON_PROPERTY_STREAK_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStreakType() {
    return streakType;
  }


  @JsonProperty(JSON_PROPERTY_STREAK_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStreakType(String streakType) {
    this.streakType = streakType;
  }


  public StandingsRecordsInnerTeamRecordsInnerStreak streakNumber(BigDecimal streakNumber) {
    
    this.streakNumber = streakNumber;
    return this;
  }

   /**
   * Get streakNumber
   * @return streakNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")
  @JsonProperty(JSON_PROPERTY_STREAK_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getStreakNumber() {
    return streakNumber;
  }


  @JsonProperty(JSON_PROPERTY_STREAK_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStreakNumber(BigDecimal streakNumber) {
    this.streakNumber = streakNumber;
  }


  public StandingsRecordsInnerTeamRecordsInnerStreak streakCode(String streakCode) {
    
    this.streakCode = streakCode;
    return this;
  }

   /**
   * Get streakCode
   * @return streakCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "W1", value = "")
  @JsonProperty(JSON_PROPERTY_STREAK_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStreakCode() {
    return streakCode;
  }


  @JsonProperty(JSON_PROPERTY_STREAK_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStreakCode(String streakCode) {
    this.streakCode = streakCode;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StandingsRecordsInnerTeamRecordsInnerStreak standingsRecordsInnerTeamRecordsInnerStreak = (StandingsRecordsInnerTeamRecordsInnerStreak) o;
    return Objects.equals(this.streakType, standingsRecordsInnerTeamRecordsInnerStreak.streakType) &&
        Objects.equals(this.streakNumber, standingsRecordsInnerTeamRecordsInnerStreak.streakNumber) &&
        Objects.equals(this.streakCode, standingsRecordsInnerTeamRecordsInnerStreak.streakCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(streakType, streakNumber, streakCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StandingsRecordsInnerTeamRecordsInnerStreak {\n");
    sb.append("    streakType: ").append(toIndentedString(streakType)).append("\n");
    sb.append("    streakNumber: ").append(toIndentedString(streakNumber)).append("\n");
    sb.append("    streakCode: ").append(toIndentedString(streakCode)).append("\n");
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
