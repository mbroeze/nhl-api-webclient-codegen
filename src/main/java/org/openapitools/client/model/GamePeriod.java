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
import java.time.OffsetDateTime;
import org.openapitools.client.model.GamePeriodAway;
import org.openapitools.client.model.GamePeriodHome;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * GamePeriod
 */
@JsonPropertyOrder({
  GamePeriod.JSON_PROPERTY_PERIOD_TYPE,
  GamePeriod.JSON_PROPERTY_START_TIME,
  GamePeriod.JSON_PROPERTY_END_TIME,
  GamePeriod.JSON_PROPERTY_NUM,
  GamePeriod.JSON_PROPERTY_ORDINAL_NUM,
  GamePeriod.JSON_PROPERTY_HOME,
  GamePeriod.JSON_PROPERTY_AWAY
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-30T23:05:09.464412-04:00[America/Toronto]")
public class GamePeriod {
  public static final String JSON_PROPERTY_PERIOD_TYPE = "periodType";
  private String periodType;

  public static final String JSON_PROPERTY_START_TIME = "startTime";
  private OffsetDateTime startTime;

  public static final String JSON_PROPERTY_END_TIME = "endTime";
  private OffsetDateTime endTime;

  public static final String JSON_PROPERTY_NUM = "num";
  private BigDecimal num;

  public static final String JSON_PROPERTY_ORDINAL_NUM = "ordinalNum";
  private String ordinalNum;

  public static final String JSON_PROPERTY_HOME = "home";
  private GamePeriodHome home;

  public static final String JSON_PROPERTY_AWAY = "away";
  private GamePeriodAway away;

  public GamePeriod() {
  }

  public GamePeriod periodType(String periodType) {
    
    this.periodType = periodType;
    return this;
  }

   /**
   * Get periodType
   * @return periodType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "REGULAR", value = "")
  @JsonProperty(JSON_PROPERTY_PERIOD_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPeriodType() {
    return periodType;
  }


  @JsonProperty(JSON_PROPERTY_PERIOD_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPeriodType(String periodType) {
    this.periodType = periodType;
  }


  public GamePeriod startTime(OffsetDateTime startTime) {
    
    this.startTime = startTime;
    return this;
  }

   /**
   * Get startTime
   * @return startTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2018-02-11T03:09:50Z", value = "")
  @JsonProperty(JSON_PROPERTY_START_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getStartTime() {
    return startTime;
  }


  @JsonProperty(JSON_PROPERTY_START_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStartTime(OffsetDateTime startTime) {
    this.startTime = startTime;
  }


  public GamePeriod endTime(OffsetDateTime endTime) {
    
    this.endTime = endTime;
    return this;
  }

   /**
   * Get endTime
   * @return endTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2018-02-11T03:44:47Z", value = "")
  @JsonProperty(JSON_PROPERTY_END_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getEndTime() {
    return endTime;
  }


  @JsonProperty(JSON_PROPERTY_END_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEndTime(OffsetDateTime endTime) {
    this.endTime = endTime;
  }


  public GamePeriod num(BigDecimal num) {
    
    this.num = num;
    return this;
  }

   /**
   * Get num
   * @return num
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")
  @JsonProperty(JSON_PROPERTY_NUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getNum() {
    return num;
  }


  @JsonProperty(JSON_PROPERTY_NUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNum(BigDecimal num) {
    this.num = num;
  }


  public GamePeriod ordinalNum(String ordinalNum) {
    
    this.ordinalNum = ordinalNum;
    return this;
  }

   /**
   * Get ordinalNum
   * @return ordinalNum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1st", value = "")
  @JsonProperty(JSON_PROPERTY_ORDINAL_NUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getOrdinalNum() {
    return ordinalNum;
  }


  @JsonProperty(JSON_PROPERTY_ORDINAL_NUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOrdinalNum(String ordinalNum) {
    this.ordinalNum = ordinalNum;
  }


  public GamePeriod home(GamePeriodHome home) {
    
    this.home = home;
    return this;
  }

   /**
   * Get home
   * @return home
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_HOME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GamePeriodHome getHome() {
    return home;
  }


  @JsonProperty(JSON_PROPERTY_HOME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHome(GamePeriodHome home) {
    this.home = home;
  }


  public GamePeriod away(GamePeriodAway away) {
    
    this.away = away;
    return this;
  }

   /**
   * Get away
   * @return away
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AWAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GamePeriodAway getAway() {
    return away;
  }


  @JsonProperty(JSON_PROPERTY_AWAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAway(GamePeriodAway away) {
    this.away = away;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GamePeriod gamePeriod = (GamePeriod) o;
    return Objects.equals(this.periodType, gamePeriod.periodType) &&
        Objects.equals(this.startTime, gamePeriod.startTime) &&
        Objects.equals(this.endTime, gamePeriod.endTime) &&
        Objects.equals(this.num, gamePeriod.num) &&
        Objects.equals(this.ordinalNum, gamePeriod.ordinalNum) &&
        Objects.equals(this.home, gamePeriod.home) &&
        Objects.equals(this.away, gamePeriod.away);
  }

  @Override
  public int hashCode() {
    return Objects.hash(periodType, startTime, endTime, num, ordinalNum, home, away);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GamePeriod {\n");
    sb.append("    periodType: ").append(toIndentedString(periodType)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    num: ").append(toIndentedString(num)).append("\n");
    sb.append("    ordinalNum: ").append(toIndentedString(ordinalNum)).append("\n");
    sb.append("    home: ").append(toIndentedString(home)).append("\n");
    sb.append("    away: ").append(toIndentedString(away)).append("\n");
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

