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
import org.openapitools.client.model.GameHighlight;
import org.openapitools.client.model.GameHighlightType;
import org.openapitools.client.model.GameMediaAudio;
import org.openapitools.client.model.GameMediaNHLTV;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * GameContentMediaEpgInner
 */
@JsonPropertyOrder({
  GameContentMediaEpgInner.JSON_PROPERTY_TITLE,
  GameContentMediaEpgInner.JSON_PROPERTY_PLATFORM,
  GameContentMediaEpgInner.JSON_PROPERTY_ITEMS,
  GameContentMediaEpgInner.JSON_PROPERTY_TOPIC_LIST
})
@JsonTypeName("GameContent_media_epg_inner")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-30T23:05:09.464412-04:00[America/Toronto]")
public class GameContentMediaEpgInner {
  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public static final String JSON_PROPERTY_PLATFORM = "platform";
  private String platform;

  public static final String JSON_PROPERTY_ITEMS = "items";
  private List<GameHighlight> items = null;

  public static final String JSON_PROPERTY_TOPIC_LIST = "topicList";
  private String topicList;

  public GameContentMediaEpgInner() {
  }

  public GameContentMediaEpgInner title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Highlights", value = "")
  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTitle() {
    return title;
  }


  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTitle(String title) {
    this.title = title;
  }


  public GameContentMediaEpgInner platform(String platform) {
    
    this.platform = platform;
    return this;
  }

   /**
   * Get platform
   * @return platform
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "web", value = "")
  @JsonProperty(JSON_PROPERTY_PLATFORM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPlatform() {
    return platform;
  }


  @JsonProperty(JSON_PROPERTY_PLATFORM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPlatform(String platform) {
    this.platform = platform;
  }


  public GameContentMediaEpgInner items(List<GameHighlight> items) {
    
    this.items = items;
    return this;
  }

  public GameContentMediaEpgInner addItemsItem(GameHighlight itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Get items
   * @return items
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ITEMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<GameHighlight> getItems() {
    return items;
  }


  @JsonProperty(JSON_PROPERTY_ITEMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setItems(List<GameHighlight> items) {
    this.items = items;
  }


  public GameContentMediaEpgInner topicList(String topicList) {
    
    this.topicList = topicList;
    return this;
  }

   /**
   * Get topicList
   * @return topicList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "293642378", value = "")
  @JsonProperty(JSON_PROPERTY_TOPIC_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTopicList() {
    return topicList;
  }


  @JsonProperty(JSON_PROPERTY_TOPIC_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTopicList(String topicList) {
    this.topicList = topicList;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GameContentMediaEpgInner gameContentMediaEpgInner = (GameContentMediaEpgInner) o;
    return Objects.equals(this.title, gameContentMediaEpgInner.title) &&
        Objects.equals(this.platform, gameContentMediaEpgInner.platform) &&
        Objects.equals(this.items, gameContentMediaEpgInner.items) &&
        Objects.equals(this.topicList, gameContentMediaEpgInner.topicList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, platform, items, topicList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GameContentMediaEpgInner {\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    topicList: ").append(toIndentedString(topicList)).append("\n");
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
