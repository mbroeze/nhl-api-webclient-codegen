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
import org.openapitools.client.model.GameLinescoreTeam;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * GameLinescoreTeams
 */
@JsonPropertyOrder({
  GameLinescoreTeams.JSON_PROPERTY_HOME,
  GameLinescoreTeams.JSON_PROPERTY_AWAY
})
@JsonTypeName("GameLinescore_teams")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-30T23:05:09.464412-04:00[America/Toronto]")
public class GameLinescoreTeams {
  public static final String JSON_PROPERTY_HOME = "home";
  private GameLinescoreTeam home;

  public static final String JSON_PROPERTY_AWAY = "away";
  private GameLinescoreTeam away;

  public GameLinescoreTeams() {
  }

  public GameLinescoreTeams home(GameLinescoreTeam home) {
    
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

  public GameLinescoreTeam getHome() {
    return home;
  }


  @JsonProperty(JSON_PROPERTY_HOME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHome(GameLinescoreTeam home) {
    this.home = home;
  }


  public GameLinescoreTeams away(GameLinescoreTeam away) {
    
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

  public GameLinescoreTeam getAway() {
    return away;
  }


  @JsonProperty(JSON_PROPERTY_AWAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAway(GameLinescoreTeam away) {
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
    GameLinescoreTeams gameLinescoreTeams = (GameLinescoreTeams) o;
    return Objects.equals(this.home, gameLinescoreTeams.home) &&
        Objects.equals(this.away, gameLinescoreTeams.away);
  }

  @Override
  public int hashCode() {
    return Objects.hash(home, away);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GameLinescoreTeams {\n");
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

