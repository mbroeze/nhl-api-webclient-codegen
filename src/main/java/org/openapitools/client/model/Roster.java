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
import org.openapitools.client.model.DraftProspectPrimaryPosition;
import org.openapitools.client.model.RosterPerson;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Roster
 */
@JsonPropertyOrder({
  Roster.JSON_PROPERTY_PERSON,
  Roster.JSON_PROPERTY_JERSEY_NUMBER,
  Roster.JSON_PROPERTY_POSITION
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-30T23:05:09.464412-04:00[America/Toronto]")
public class Roster {
  public static final String JSON_PROPERTY_PERSON = "person";
  private RosterPerson person;

  public static final String JSON_PROPERTY_JERSEY_NUMBER = "jerseyNumber";
  private BigDecimal jerseyNumber;

  public static final String JSON_PROPERTY_POSITION = "position";
  private DraftProspectPrimaryPosition position;

  public Roster() {
  }

  public Roster person(RosterPerson person) {
    
    this.person = person;
    return this;
  }

   /**
   * Get person
   * @return person
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PERSON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RosterPerson getPerson() {
    return person;
  }


  @JsonProperty(JSON_PROPERTY_PERSON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPerson(RosterPerson person) {
    this.person = person;
  }


  public Roster jerseyNumber(BigDecimal jerseyNumber) {
    
    this.jerseyNumber = jerseyNumber;
    return this;
  }

   /**
   * Get jerseyNumber
   * @return jerseyNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "19", value = "")
  @JsonProperty(JSON_PROPERTY_JERSEY_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getJerseyNumber() {
    return jerseyNumber;
  }


  @JsonProperty(JSON_PROPERTY_JERSEY_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setJerseyNumber(BigDecimal jerseyNumber) {
    this.jerseyNumber = jerseyNumber;
  }


  public Roster position(DraftProspectPrimaryPosition position) {
    
    this.position = position;
    return this;
  }

   /**
   * Get position
   * @return position
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_POSITION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DraftProspectPrimaryPosition getPosition() {
    return position;
  }


  @JsonProperty(JSON_PROPERTY_POSITION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPosition(DraftProspectPrimaryPosition position) {
    this.position = position;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Roster roster = (Roster) o;
    return Objects.equals(this.person, roster.person) &&
        Objects.equals(this.jerseyNumber, roster.jerseyNumber) &&
        Objects.equals(this.position, roster.position);
  }

  @Override
  public int hashCode() {
    return Objects.hash(person, jerseyNumber, position);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Roster {\n");
    sb.append("    person: ").append(toIndentedString(person)).append("\n");
    sb.append("    jerseyNumber: ").append(toIndentedString(jerseyNumber)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
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

