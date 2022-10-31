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
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.Player;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Players
 */
@JsonPropertyOrder({
  Players.JSON_PROPERTY_COPYRIGHT,
  Players.JSON_PROPERTY_TEAMS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-30T23:05:09.464412-04:00[America/Toronto]")
public class Players {
  public static final String JSON_PROPERTY_COPYRIGHT = "copyright";
  private String copyright;

  public static final String JSON_PROPERTY_TEAMS = "teams";
  private List<Player> teams = null;

  public Players() {
  }

  public Players copyright(String copyright) {
    
    this.copyright = copyright;
    return this;
  }

   /**
   * Get copyright
   * @return copyright
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_COPYRIGHT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getCopyright() {
    return copyright;
  }


  @JsonProperty(JSON_PROPERTY_COPYRIGHT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCopyright(String copyright) {
    this.copyright = copyright;
  }


  public Players teams(List<Player> teams) {
    
    this.teams = teams;
    return this;
  }

  public Players addTeamsItem(Player teamsItem) {
    if (this.teams == null) {
      this.teams = new ArrayList<>();
    }
    this.teams.add(teamsItem);
    return this;
  }

   /**
   * Get teams
   * @return teams
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TEAMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Player> getTeams() {
    return teams;
  }


  @JsonProperty(JSON_PROPERTY_TEAMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTeams(List<Player> teams) {
    this.teams = teams;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Players players = (Players) o;
    return Objects.equals(this.copyright, players.copyright) &&
        Objects.equals(this.teams, players.teams);
  }

  @Override
  public int hashCode() {
    return Objects.hash(copyright, teams);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Players {\n");
    sb.append("    copyright: ").append(toIndentedString(copyright)).append("\n");
    sb.append("    teams: ").append(toIndentedString(teams)).append("\n");
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

