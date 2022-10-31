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
 * GamePlayAboutGoals
 */
@JsonPropertyOrder({
  GamePlayAboutGoals.JSON_PROPERTY_AWAY,
  GamePlayAboutGoals.JSON_PROPERTY_HOME
})
@JsonTypeName("GamePlay_about_goals")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-30T23:05:09.464412-04:00[America/Toronto]")
public class GamePlayAboutGoals {
  public static final String JSON_PROPERTY_AWAY = "away";
  private BigDecimal away;

  public static final String JSON_PROPERTY_HOME = "home";
  private BigDecimal home;

  public GamePlayAboutGoals() {
  }

  public GamePlayAboutGoals away(BigDecimal away) {
    
    this.away = away;
    return this;
  }

   /**
   * Get away
   * @return away
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "4", value = "")
  @JsonProperty(JSON_PROPERTY_AWAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getAway() {
    return away;
  }


  @JsonProperty(JSON_PROPERTY_AWAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAway(BigDecimal away) {
    this.away = away;
  }


  public GamePlayAboutGoals home(BigDecimal home) {
    
    this.home = home;
    return this;
  }

   /**
   * Get home
   * @return home
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "6", value = "")
  @JsonProperty(JSON_PROPERTY_HOME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getHome() {
    return home;
  }


  @JsonProperty(JSON_PROPERTY_HOME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHome(BigDecimal home) {
    this.home = home;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GamePlayAboutGoals gamePlayAboutGoals = (GamePlayAboutGoals) o;
    return Objects.equals(this.away, gamePlayAboutGoals.away) &&
        Objects.equals(this.home, gamePlayAboutGoals.home);
  }

  @Override
  public int hashCode() {
    return Objects.hash(away, home);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GamePlayAboutGoals {\n");
    sb.append("    away: ").append(toIndentedString(away)).append("\n");
    sb.append("    home: ").append(toIndentedString(home)).append("\n");
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

