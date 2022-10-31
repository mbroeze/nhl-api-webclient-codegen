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
 * GameBoxscoreTeamPlayersStatsSkaterStats
 */
@JsonPropertyOrder({
  GameBoxscoreTeamPlayersStatsSkaterStats.JSON_PROPERTY_TIME_ON_ICE,
  GameBoxscoreTeamPlayersStatsSkaterStats.JSON_PROPERTY_ASSISTS,
  GameBoxscoreTeamPlayersStatsSkaterStats.JSON_PROPERTY_GOALS,
  GameBoxscoreTeamPlayersStatsSkaterStats.JSON_PROPERTY_SHOTS,
  GameBoxscoreTeamPlayersStatsSkaterStats.JSON_PROPERTY_HITS,
  GameBoxscoreTeamPlayersStatsSkaterStats.JSON_PROPERTY_POWER_PLAY_GOALS,
  GameBoxscoreTeamPlayersStatsSkaterStats.JSON_PROPERTY_POWER_PLAY_ASSISTS,
  GameBoxscoreTeamPlayersStatsSkaterStats.JSON_PROPERTY_PENALTY_MINUTES,
  GameBoxscoreTeamPlayersStatsSkaterStats.JSON_PROPERTY_FACE_OFF_WINS,
  GameBoxscoreTeamPlayersStatsSkaterStats.JSON_PROPERTY_FACEOFF_TAKEN,
  GameBoxscoreTeamPlayersStatsSkaterStats.JSON_PROPERTY_TAKEAWAYS,
  GameBoxscoreTeamPlayersStatsSkaterStats.JSON_PROPERTY_GIVEAWAYS,
  GameBoxscoreTeamPlayersStatsSkaterStats.JSON_PROPERTY_SHORT_HANDED_GOALS,
  GameBoxscoreTeamPlayersStatsSkaterStats.JSON_PROPERTY_SHORT_HANDED_ASSISTS,
  GameBoxscoreTeamPlayersStatsSkaterStats.JSON_PROPERTY_BLOCKED,
  GameBoxscoreTeamPlayersStatsSkaterStats.JSON_PROPERTY_PLUS_MINUS,
  GameBoxscoreTeamPlayersStatsSkaterStats.JSON_PROPERTY_EVEN_TIME_ON_ICE,
  GameBoxscoreTeamPlayersStatsSkaterStats.JSON_PROPERTY_POWER_PLAY_TIME_ON_ICE,
  GameBoxscoreTeamPlayersStatsSkaterStats.JSON_PROPERTY_SHORT_HANDED_TIME_ON_ICE
})
@JsonTypeName("GameBoxscoreTeam_players_stats_skaterStats")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-30T23:05:09.464412-04:00[America/Toronto]")
public class GameBoxscoreTeamPlayersStatsSkaterStats {
  public static final String JSON_PROPERTY_TIME_ON_ICE = "timeOnIce";
  private String timeOnIce;

  public static final String JSON_PROPERTY_ASSISTS = "assists";
  private BigDecimal assists;

  public static final String JSON_PROPERTY_GOALS = "goals";
  private BigDecimal goals;

  public static final String JSON_PROPERTY_SHOTS = "shots";
  private BigDecimal shots;

  public static final String JSON_PROPERTY_HITS = "hits";
  private BigDecimal hits;

  public static final String JSON_PROPERTY_POWER_PLAY_GOALS = "powerPlayGoals";
  private BigDecimal powerPlayGoals;

  public static final String JSON_PROPERTY_POWER_PLAY_ASSISTS = "powerPlayAssists";
  private BigDecimal powerPlayAssists;

  public static final String JSON_PROPERTY_PENALTY_MINUTES = "penaltyMinutes";
  private BigDecimal penaltyMinutes;

  public static final String JSON_PROPERTY_FACE_OFF_WINS = "faceOffWins";
  private BigDecimal faceOffWins;

  public static final String JSON_PROPERTY_FACEOFF_TAKEN = "faceoffTaken";
  private BigDecimal faceoffTaken;

  public static final String JSON_PROPERTY_TAKEAWAYS = "takeaways";
  private BigDecimal takeaways;

  public static final String JSON_PROPERTY_GIVEAWAYS = "giveaways";
  private BigDecimal giveaways;

  public static final String JSON_PROPERTY_SHORT_HANDED_GOALS = "shortHandedGoals";
  private BigDecimal shortHandedGoals;

  public static final String JSON_PROPERTY_SHORT_HANDED_ASSISTS = "shortHandedAssists";
  private BigDecimal shortHandedAssists;

  public static final String JSON_PROPERTY_BLOCKED = "blocked";
  private BigDecimal blocked;

  public static final String JSON_PROPERTY_PLUS_MINUS = "plusMinus";
  private BigDecimal plusMinus;

  public static final String JSON_PROPERTY_EVEN_TIME_ON_ICE = "evenTimeOnIce";
  private String evenTimeOnIce;

  public static final String JSON_PROPERTY_POWER_PLAY_TIME_ON_ICE = "powerPlayTimeOnIce";
  private String powerPlayTimeOnIce;

  public static final String JSON_PROPERTY_SHORT_HANDED_TIME_ON_ICE = "shortHandedTimeOnIce";
  private String shortHandedTimeOnIce;

  public GameBoxscoreTeamPlayersStatsSkaterStats() {
  }

  public GameBoxscoreTeamPlayersStatsSkaterStats timeOnIce(String timeOnIce) {
    
    this.timeOnIce = timeOnIce;
    return this;
  }

   /**
   * Get timeOnIce
   * @return timeOnIce
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "23:04", value = "")
  @JsonProperty(JSON_PROPERTY_TIME_ON_ICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTimeOnIce() {
    return timeOnIce;
  }


  @JsonProperty(JSON_PROPERTY_TIME_ON_ICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTimeOnIce(String timeOnIce) {
    this.timeOnIce = timeOnIce;
  }


  public GameBoxscoreTeamPlayersStatsSkaterStats assists(BigDecimal assists) {
    
    this.assists = assists;
    return this;
  }

   /**
   * Get assists
   * @return assists
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "")
  @JsonProperty(JSON_PROPERTY_ASSISTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getAssists() {
    return assists;
  }


  @JsonProperty(JSON_PROPERTY_ASSISTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAssists(BigDecimal assists) {
    this.assists = assists;
  }


  public GameBoxscoreTeamPlayersStatsSkaterStats goals(BigDecimal goals) {
    
    this.goals = goals;
    return this;
  }

   /**
   * Get goals
   * @return goals
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "")
  @JsonProperty(JSON_PROPERTY_GOALS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getGoals() {
    return goals;
  }


  @JsonProperty(JSON_PROPERTY_GOALS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGoals(BigDecimal goals) {
    this.goals = goals;
  }


  public GameBoxscoreTeamPlayersStatsSkaterStats shots(BigDecimal shots) {
    
    this.shots = shots;
    return this;
  }

   /**
   * Get shots
   * @return shots
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2", value = "")
  @JsonProperty(JSON_PROPERTY_SHOTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getShots() {
    return shots;
  }


  @JsonProperty(JSON_PROPERTY_SHOTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShots(BigDecimal shots) {
    this.shots = shots;
  }


  public GameBoxscoreTeamPlayersStatsSkaterStats hits(BigDecimal hits) {
    
    this.hits = hits;
    return this;
  }

   /**
   * Get hits
   * @return hits
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "")
  @JsonProperty(JSON_PROPERTY_HITS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getHits() {
    return hits;
  }


  @JsonProperty(JSON_PROPERTY_HITS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHits(BigDecimal hits) {
    this.hits = hits;
  }


  public GameBoxscoreTeamPlayersStatsSkaterStats powerPlayGoals(BigDecimal powerPlayGoals) {
    
    this.powerPlayGoals = powerPlayGoals;
    return this;
  }

   /**
   * Get powerPlayGoals
   * @return powerPlayGoals
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "")
  @JsonProperty(JSON_PROPERTY_POWER_PLAY_GOALS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getPowerPlayGoals() {
    return powerPlayGoals;
  }


  @JsonProperty(JSON_PROPERTY_POWER_PLAY_GOALS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPowerPlayGoals(BigDecimal powerPlayGoals) {
    this.powerPlayGoals = powerPlayGoals;
  }


  public GameBoxscoreTeamPlayersStatsSkaterStats powerPlayAssists(BigDecimal powerPlayAssists) {
    
    this.powerPlayAssists = powerPlayAssists;
    return this;
  }

   /**
   * Get powerPlayAssists
   * @return powerPlayAssists
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "")
  @JsonProperty(JSON_PROPERTY_POWER_PLAY_ASSISTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getPowerPlayAssists() {
    return powerPlayAssists;
  }


  @JsonProperty(JSON_PROPERTY_POWER_PLAY_ASSISTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPowerPlayAssists(BigDecimal powerPlayAssists) {
    this.powerPlayAssists = powerPlayAssists;
  }


  public GameBoxscoreTeamPlayersStatsSkaterStats penaltyMinutes(BigDecimal penaltyMinutes) {
    
    this.penaltyMinutes = penaltyMinutes;
    return this;
  }

   /**
   * Get penaltyMinutes
   * @return penaltyMinutes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "")
  @JsonProperty(JSON_PROPERTY_PENALTY_MINUTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getPenaltyMinutes() {
    return penaltyMinutes;
  }


  @JsonProperty(JSON_PROPERTY_PENALTY_MINUTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPenaltyMinutes(BigDecimal penaltyMinutes) {
    this.penaltyMinutes = penaltyMinutes;
  }


  public GameBoxscoreTeamPlayersStatsSkaterStats faceOffWins(BigDecimal faceOffWins) {
    
    this.faceOffWins = faceOffWins;
    return this;
  }

   /**
   * Get faceOffWins
   * @return faceOffWins
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "")
  @JsonProperty(JSON_PROPERTY_FACE_OFF_WINS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getFaceOffWins() {
    return faceOffWins;
  }


  @JsonProperty(JSON_PROPERTY_FACE_OFF_WINS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFaceOffWins(BigDecimal faceOffWins) {
    this.faceOffWins = faceOffWins;
  }


  public GameBoxscoreTeamPlayersStatsSkaterStats faceoffTaken(BigDecimal faceoffTaken) {
    
    this.faceoffTaken = faceoffTaken;
    return this;
  }

   /**
   * Get faceoffTaken
   * @return faceoffTaken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "")
  @JsonProperty(JSON_PROPERTY_FACEOFF_TAKEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getFaceoffTaken() {
    return faceoffTaken;
  }


  @JsonProperty(JSON_PROPERTY_FACEOFF_TAKEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFaceoffTaken(BigDecimal faceoffTaken) {
    this.faceoffTaken = faceoffTaken;
  }


  public GameBoxscoreTeamPlayersStatsSkaterStats takeaways(BigDecimal takeaways) {
    
    this.takeaways = takeaways;
    return this;
  }

   /**
   * Get takeaways
   * @return takeaways
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "")
  @JsonProperty(JSON_PROPERTY_TAKEAWAYS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getTakeaways() {
    return takeaways;
  }


  @JsonProperty(JSON_PROPERTY_TAKEAWAYS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTakeaways(BigDecimal takeaways) {
    this.takeaways = takeaways;
  }


  public GameBoxscoreTeamPlayersStatsSkaterStats giveaways(BigDecimal giveaways) {
    
    this.giveaways = giveaways;
    return this;
  }

   /**
   * Get giveaways
   * @return giveaways
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")
  @JsonProperty(JSON_PROPERTY_GIVEAWAYS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getGiveaways() {
    return giveaways;
  }


  @JsonProperty(JSON_PROPERTY_GIVEAWAYS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGiveaways(BigDecimal giveaways) {
    this.giveaways = giveaways;
  }


  public GameBoxscoreTeamPlayersStatsSkaterStats shortHandedGoals(BigDecimal shortHandedGoals) {
    
    this.shortHandedGoals = shortHandedGoals;
    return this;
  }

   /**
   * Get shortHandedGoals
   * @return shortHandedGoals
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "")
  @JsonProperty(JSON_PROPERTY_SHORT_HANDED_GOALS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getShortHandedGoals() {
    return shortHandedGoals;
  }


  @JsonProperty(JSON_PROPERTY_SHORT_HANDED_GOALS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShortHandedGoals(BigDecimal shortHandedGoals) {
    this.shortHandedGoals = shortHandedGoals;
  }


  public GameBoxscoreTeamPlayersStatsSkaterStats shortHandedAssists(BigDecimal shortHandedAssists) {
    
    this.shortHandedAssists = shortHandedAssists;
    return this;
  }

   /**
   * Get shortHandedAssists
   * @return shortHandedAssists
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "")
  @JsonProperty(JSON_PROPERTY_SHORT_HANDED_ASSISTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getShortHandedAssists() {
    return shortHandedAssists;
  }


  @JsonProperty(JSON_PROPERTY_SHORT_HANDED_ASSISTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShortHandedAssists(BigDecimal shortHandedAssists) {
    this.shortHandedAssists = shortHandedAssists;
  }


  public GameBoxscoreTeamPlayersStatsSkaterStats blocked(BigDecimal blocked) {
    
    this.blocked = blocked;
    return this;
  }

   /**
   * Get blocked
   * @return blocked
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "")
  @JsonProperty(JSON_PROPERTY_BLOCKED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getBlocked() {
    return blocked;
  }


  @JsonProperty(JSON_PROPERTY_BLOCKED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBlocked(BigDecimal blocked) {
    this.blocked = blocked;
  }


  public GameBoxscoreTeamPlayersStatsSkaterStats plusMinus(BigDecimal plusMinus) {
    
    this.plusMinus = plusMinus;
    return this;
  }

   /**
   * Get plusMinus
   * @return plusMinus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")
  @JsonProperty(JSON_PROPERTY_PLUS_MINUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getPlusMinus() {
    return plusMinus;
  }


  @JsonProperty(JSON_PROPERTY_PLUS_MINUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPlusMinus(BigDecimal plusMinus) {
    this.plusMinus = plusMinus;
  }


  public GameBoxscoreTeamPlayersStatsSkaterStats evenTimeOnIce(String evenTimeOnIce) {
    
    this.evenTimeOnIce = evenTimeOnIce;
    return this;
  }

   /**
   * Get evenTimeOnIce
   * @return evenTimeOnIce
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "18:12", value = "")
  @JsonProperty(JSON_PROPERTY_EVEN_TIME_ON_ICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEvenTimeOnIce() {
    return evenTimeOnIce;
  }


  @JsonProperty(JSON_PROPERTY_EVEN_TIME_ON_ICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEvenTimeOnIce(String evenTimeOnIce) {
    this.evenTimeOnIce = evenTimeOnIce;
  }


  public GameBoxscoreTeamPlayersStatsSkaterStats powerPlayTimeOnIce(String powerPlayTimeOnIce) {
    
    this.powerPlayTimeOnIce = powerPlayTimeOnIce;
    return this;
  }

   /**
   * Get powerPlayTimeOnIce
   * @return powerPlayTimeOnIce
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1:07", value = "")
  @JsonProperty(JSON_PROPERTY_POWER_PLAY_TIME_ON_ICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPowerPlayTimeOnIce() {
    return powerPlayTimeOnIce;
  }


  @JsonProperty(JSON_PROPERTY_POWER_PLAY_TIME_ON_ICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPowerPlayTimeOnIce(String powerPlayTimeOnIce) {
    this.powerPlayTimeOnIce = powerPlayTimeOnIce;
  }


  public GameBoxscoreTeamPlayersStatsSkaterStats shortHandedTimeOnIce(String shortHandedTimeOnIce) {
    
    this.shortHandedTimeOnIce = shortHandedTimeOnIce;
    return this;
  }

   /**
   * Get shortHandedTimeOnIce
   * @return shortHandedTimeOnIce
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "3:45", value = "")
  @JsonProperty(JSON_PROPERTY_SHORT_HANDED_TIME_ON_ICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getShortHandedTimeOnIce() {
    return shortHandedTimeOnIce;
  }


  @JsonProperty(JSON_PROPERTY_SHORT_HANDED_TIME_ON_ICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShortHandedTimeOnIce(String shortHandedTimeOnIce) {
    this.shortHandedTimeOnIce = shortHandedTimeOnIce;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GameBoxscoreTeamPlayersStatsSkaterStats gameBoxscoreTeamPlayersStatsSkaterStats = (GameBoxscoreTeamPlayersStatsSkaterStats) o;
    return Objects.equals(this.timeOnIce, gameBoxscoreTeamPlayersStatsSkaterStats.timeOnIce) &&
        Objects.equals(this.assists, gameBoxscoreTeamPlayersStatsSkaterStats.assists) &&
        Objects.equals(this.goals, gameBoxscoreTeamPlayersStatsSkaterStats.goals) &&
        Objects.equals(this.shots, gameBoxscoreTeamPlayersStatsSkaterStats.shots) &&
        Objects.equals(this.hits, gameBoxscoreTeamPlayersStatsSkaterStats.hits) &&
        Objects.equals(this.powerPlayGoals, gameBoxscoreTeamPlayersStatsSkaterStats.powerPlayGoals) &&
        Objects.equals(this.powerPlayAssists, gameBoxscoreTeamPlayersStatsSkaterStats.powerPlayAssists) &&
        Objects.equals(this.penaltyMinutes, gameBoxscoreTeamPlayersStatsSkaterStats.penaltyMinutes) &&
        Objects.equals(this.faceOffWins, gameBoxscoreTeamPlayersStatsSkaterStats.faceOffWins) &&
        Objects.equals(this.faceoffTaken, gameBoxscoreTeamPlayersStatsSkaterStats.faceoffTaken) &&
        Objects.equals(this.takeaways, gameBoxscoreTeamPlayersStatsSkaterStats.takeaways) &&
        Objects.equals(this.giveaways, gameBoxscoreTeamPlayersStatsSkaterStats.giveaways) &&
        Objects.equals(this.shortHandedGoals, gameBoxscoreTeamPlayersStatsSkaterStats.shortHandedGoals) &&
        Objects.equals(this.shortHandedAssists, gameBoxscoreTeamPlayersStatsSkaterStats.shortHandedAssists) &&
        Objects.equals(this.blocked, gameBoxscoreTeamPlayersStatsSkaterStats.blocked) &&
        Objects.equals(this.plusMinus, gameBoxscoreTeamPlayersStatsSkaterStats.plusMinus) &&
        Objects.equals(this.evenTimeOnIce, gameBoxscoreTeamPlayersStatsSkaterStats.evenTimeOnIce) &&
        Objects.equals(this.powerPlayTimeOnIce, gameBoxscoreTeamPlayersStatsSkaterStats.powerPlayTimeOnIce) &&
        Objects.equals(this.shortHandedTimeOnIce, gameBoxscoreTeamPlayersStatsSkaterStats.shortHandedTimeOnIce);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timeOnIce, assists, goals, shots, hits, powerPlayGoals, powerPlayAssists, penaltyMinutes, faceOffWins, faceoffTaken, takeaways, giveaways, shortHandedGoals, shortHandedAssists, blocked, plusMinus, evenTimeOnIce, powerPlayTimeOnIce, shortHandedTimeOnIce);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GameBoxscoreTeamPlayersStatsSkaterStats {\n");
    sb.append("    timeOnIce: ").append(toIndentedString(timeOnIce)).append("\n");
    sb.append("    assists: ").append(toIndentedString(assists)).append("\n");
    sb.append("    goals: ").append(toIndentedString(goals)).append("\n");
    sb.append("    shots: ").append(toIndentedString(shots)).append("\n");
    sb.append("    hits: ").append(toIndentedString(hits)).append("\n");
    sb.append("    powerPlayGoals: ").append(toIndentedString(powerPlayGoals)).append("\n");
    sb.append("    powerPlayAssists: ").append(toIndentedString(powerPlayAssists)).append("\n");
    sb.append("    penaltyMinutes: ").append(toIndentedString(penaltyMinutes)).append("\n");
    sb.append("    faceOffWins: ").append(toIndentedString(faceOffWins)).append("\n");
    sb.append("    faceoffTaken: ").append(toIndentedString(faceoffTaken)).append("\n");
    sb.append("    takeaways: ").append(toIndentedString(takeaways)).append("\n");
    sb.append("    giveaways: ").append(toIndentedString(giveaways)).append("\n");
    sb.append("    shortHandedGoals: ").append(toIndentedString(shortHandedGoals)).append("\n");
    sb.append("    shortHandedAssists: ").append(toIndentedString(shortHandedAssists)).append("\n");
    sb.append("    blocked: ").append(toIndentedString(blocked)).append("\n");
    sb.append("    plusMinus: ").append(toIndentedString(plusMinus)).append("\n");
    sb.append("    evenTimeOnIce: ").append(toIndentedString(evenTimeOnIce)).append("\n");
    sb.append("    powerPlayTimeOnIce: ").append(toIndentedString(powerPlayTimeOnIce)).append("\n");
    sb.append("    shortHandedTimeOnIce: ").append(toIndentedString(shortHandedTimeOnIce)).append("\n");
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
