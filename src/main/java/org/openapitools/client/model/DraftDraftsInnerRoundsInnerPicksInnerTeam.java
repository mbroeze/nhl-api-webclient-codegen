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
import java.net.URI;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * DraftDraftsInnerRoundsInnerPicksInnerTeam
 */
@JsonPropertyOrder({
  DraftDraftsInnerRoundsInnerPicksInnerTeam.JSON_PROPERTY_ID,
  DraftDraftsInnerRoundsInnerPicksInnerTeam.JSON_PROPERTY_NAME,
  DraftDraftsInnerRoundsInnerPicksInnerTeam.JSON_PROPERTY_LINK
})
@JsonTypeName("Draft_drafts_inner_rounds_inner_picks_inner_team")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-30T23:05:09.464412-04:00[America/Toronto]")
public class DraftDraftsInnerRoundsInnerPicksInnerTeam {
  public static final String JSON_PROPERTY_ID = "id";
  private BigDecimal id;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_LINK = "link";
  private URI link;

  public DraftDraftsInnerRoundsInnerPicksInnerTeam() {
  }

  public DraftDraftsInnerRoundsInnerPicksInnerTeam id(BigDecimal id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(BigDecimal id) {
    this.id = id;
  }


  public DraftDraftsInnerRoundsInnerPicksInnerTeam name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "New Jersey Devils", value = "")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(String name) {
    this.name = name;
  }


  public DraftDraftsInnerRoundsInnerPicksInnerTeam link(URI link) {
    
    this.link = link;
    return this;
  }

   /**
   * Get link
   * @return link
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "/api/v1/teams/1", value = "")
  @JsonProperty(JSON_PROPERTY_LINK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public URI getLink() {
    return link;
  }


  @JsonProperty(JSON_PROPERTY_LINK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLink(URI link) {
    this.link = link;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DraftDraftsInnerRoundsInnerPicksInnerTeam draftDraftsInnerRoundsInnerPicksInnerTeam = (DraftDraftsInnerRoundsInnerPicksInnerTeam) o;
    return Objects.equals(this.id, draftDraftsInnerRoundsInnerPicksInnerTeam.id) &&
        Objects.equals(this.name, draftDraftsInnerRoundsInnerPicksInnerTeam.name) &&
        Objects.equals(this.link, draftDraftsInnerRoundsInnerPicksInnerTeam.link);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, link);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DraftDraftsInnerRoundsInnerPicksInnerTeam {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
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

