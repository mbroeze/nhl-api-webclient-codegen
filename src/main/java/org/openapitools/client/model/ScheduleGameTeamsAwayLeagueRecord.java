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
 * ScheduleGameTeamsAwayLeagueRecord
 */
@JsonPropertyOrder({
  ScheduleGameTeamsAwayLeagueRecord.JSON_PROPERTY_WINS,
  ScheduleGameTeamsAwayLeagueRecord.JSON_PROPERTY_LOSSES,
  ScheduleGameTeamsAwayLeagueRecord.JSON_PROPERTY_OT,
  ScheduleGameTeamsAwayLeagueRecord.JSON_PROPERTY_TYPE
})
@JsonTypeName("ScheduleGame_teams_away_leagueRecord")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-30T23:05:09.464412-04:00[America/Toronto]")
public class ScheduleGameTeamsAwayLeagueRecord {
  public static final String JSON_PROPERTY_WINS = "wins";
  private BigDecimal wins;

  public static final String JSON_PROPERTY_LOSSES = "losses";
  private BigDecimal losses;

  public static final String JSON_PROPERTY_OT = "ot";
  private BigDecimal ot;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public ScheduleGameTeamsAwayLeagueRecord() {
  }

  public ScheduleGameTeamsAwayLeagueRecord wins(BigDecimal wins) {
    
    this.wins = wins;
    return this;
  }

   /**
   * Get wins
   * @return wins
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "23", value = "")
  @JsonProperty(JSON_PROPERTY_WINS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getWins() {
    return wins;
  }


  @JsonProperty(JSON_PROPERTY_WINS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWins(BigDecimal wins) {
    this.wins = wins;
  }


  public ScheduleGameTeamsAwayLeagueRecord losses(BigDecimal losses) {
    
    this.losses = losses;
    return this;
  }

   /**
   * Get losses
   * @return losses
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "27", value = "")
  @JsonProperty(JSON_PROPERTY_LOSSES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getLosses() {
    return losses;
  }


  @JsonProperty(JSON_PROPERTY_LOSSES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLosses(BigDecimal losses) {
    this.losses = losses;
  }


  public ScheduleGameTeamsAwayLeagueRecord ot(BigDecimal ot) {
    
    this.ot = ot;
    return this;
  }

   /**
   * Get ot
   * @return ot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "4", value = "")
  @JsonProperty(JSON_PROPERTY_OT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getOt() {
    return ot;
  }


  @JsonProperty(JSON_PROPERTY_OT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOt(BigDecimal ot) {
    this.ot = ot;
  }


  public ScheduleGameTeamsAwayLeagueRecord type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "league", value = "")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScheduleGameTeamsAwayLeagueRecord scheduleGameTeamsAwayLeagueRecord = (ScheduleGameTeamsAwayLeagueRecord) o;
    return Objects.equals(this.wins, scheduleGameTeamsAwayLeagueRecord.wins) &&
        Objects.equals(this.losses, scheduleGameTeamsAwayLeagueRecord.losses) &&
        Objects.equals(this.ot, scheduleGameTeamsAwayLeagueRecord.ot) &&
        Objects.equals(this.type, scheduleGameTeamsAwayLeagueRecord.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(wins, losses, ot, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScheduleGameTeamsAwayLeagueRecord {\n");
    sb.append("    wins: ").append(toIndentedString(wins)).append("\n");
    sb.append("    losses: ").append(toIndentedString(losses)).append("\n");
    sb.append("    ot: ").append(toIndentedString(ot)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
