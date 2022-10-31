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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * GameMediaAudioItemsInner
 */
@JsonPropertyOrder({
  GameMediaAudioItemsInner.JSON_PROPERTY_MEDIA_STATE,
  GameMediaAudioItemsInner.JSON_PROPERTY_MEDIA_PLAYBACK_ID,
  GameMediaAudioItemsInner.JSON_PROPERTY_MEDIA_FEED_TYPE,
  GameMediaAudioItemsInner.JSON_PROPERTY_CALL_LETTERS,
  GameMediaAudioItemsInner.JSON_PROPERTY_EVENT_ID,
  GameMediaAudioItemsInner.JSON_PROPERTY_LANGUAGE,
  GameMediaAudioItemsInner.JSON_PROPERTY_FREE_GAME,
  GameMediaAudioItemsInner.JSON_PROPERTY_FEED_NAME,
  GameMediaAudioItemsInner.JSON_PROPERTY_GAME_PLUS
})
@JsonTypeName("GameMediaAudio_items_inner")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-30T23:05:09.464412-04:00[America/Toronto]")
public class GameMediaAudioItemsInner {
  public static final String JSON_PROPERTY_MEDIA_STATE = "mediaState";
  private String mediaState;

  public static final String JSON_PROPERTY_MEDIA_PLAYBACK_ID = "mediaPlaybackId";
  private String mediaPlaybackId;

  public static final String JSON_PROPERTY_MEDIA_FEED_TYPE = "mediaFeedType";
  private String mediaFeedType;

  public static final String JSON_PROPERTY_CALL_LETTERS = "callLetters";
  private String callLetters;

  public static final String JSON_PROPERTY_EVENT_ID = "eventId";
  private String eventId;

  public static final String JSON_PROPERTY_LANGUAGE = "language";
  private String language;

  public static final String JSON_PROPERTY_FREE_GAME = "freeGame";
  private Boolean freeGame;

  public static final String JSON_PROPERTY_FEED_NAME = "feedName";
  private String feedName;

  public static final String JSON_PROPERTY_GAME_PLUS = "gamePlus";
  private Boolean gamePlus;

  public GameMediaAudioItemsInner() {
  }

  public GameMediaAudioItemsInner mediaState(String mediaState) {
    
    this.mediaState = mediaState;
    return this;
  }

   /**
   * Get mediaState
   * @return mediaState
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "MEDIA_DONE", value = "")
  @JsonProperty(JSON_PROPERTY_MEDIA_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMediaState() {
    return mediaState;
  }


  @JsonProperty(JSON_PROPERTY_MEDIA_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMediaState(String mediaState) {
    this.mediaState = mediaState;
  }


  public GameMediaAudioItemsInner mediaPlaybackId(String mediaPlaybackId) {
    
    this.mediaPlaybackId = mediaPlaybackId;
    return this;
  }

   /**
   * Get mediaPlaybackId
   * @return mediaPlaybackId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "57463903", value = "")
  @JsonProperty(JSON_PROPERTY_MEDIA_PLAYBACK_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMediaPlaybackId() {
    return mediaPlaybackId;
  }


  @JsonProperty(JSON_PROPERTY_MEDIA_PLAYBACK_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMediaPlaybackId(String mediaPlaybackId) {
    this.mediaPlaybackId = mediaPlaybackId;
  }


  public GameMediaAudioItemsInner mediaFeedType(String mediaFeedType) {
    
    this.mediaFeedType = mediaFeedType;
    return this;
  }

   /**
   * Get mediaFeedType
   * @return mediaFeedType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "HOME", value = "")
  @JsonProperty(JSON_PROPERTY_MEDIA_FEED_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMediaFeedType() {
    return mediaFeedType;
  }


  @JsonProperty(JSON_PROPERTY_MEDIA_FEED_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMediaFeedType(String mediaFeedType) {
    this.mediaFeedType = mediaFeedType;
  }


  public GameMediaAudioItemsInner callLetters(String callLetters) {
    
    this.callLetters = callLetters;
    return this;
  }

   /**
   * Get callLetters
   * @return callLetters
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "KFOX", value = "")
  @JsonProperty(JSON_PROPERTY_CALL_LETTERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCallLetters() {
    return callLetters;
  }


  @JsonProperty(JSON_PROPERTY_CALL_LETTERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCallLetters(String callLetters) {
    this.callLetters = callLetters;
  }


  public GameMediaAudioItemsInner eventId(String eventId) {
    
    this.eventId = eventId;
    return this;
  }

   /**
   * Get eventId
   * @return eventId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "221-1007449", value = "")
  @JsonProperty(JSON_PROPERTY_EVENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEventId() {
    return eventId;
  }


  @JsonProperty(JSON_PROPERTY_EVENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEventId(String eventId) {
    this.eventId = eventId;
  }


  public GameMediaAudioItemsInner language(String language) {
    
    this.language = language;
    return this;
  }

   /**
   * Get language
   * @return language
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "eng", value = "")
  @JsonProperty(JSON_PROPERTY_LANGUAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLanguage() {
    return language;
  }


  @JsonProperty(JSON_PROPERTY_LANGUAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLanguage(String language) {
    this.language = language;
  }


  public GameMediaAudioItemsInner freeGame(Boolean freeGame) {
    
    this.freeGame = freeGame;
    return this;
  }

   /**
   * Get freeGame
   * @return freeGame
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FREE_GAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getFreeGame() {
    return freeGame;
  }


  @JsonProperty(JSON_PROPERTY_FREE_GAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFreeGame(Boolean freeGame) {
    this.freeGame = freeGame;
  }


  public GameMediaAudioItemsInner feedName(String feedName) {
    
    this.feedName = feedName;
    return this;
  }

   /**
   * Get feedName
   * @return feedName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FEED_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFeedName() {
    return feedName;
  }


  @JsonProperty(JSON_PROPERTY_FEED_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFeedName(String feedName) {
    this.feedName = feedName;
  }


  public GameMediaAudioItemsInner gamePlus(Boolean gamePlus) {
    
    this.gamePlus = gamePlus;
    return this;
  }

   /**
   * Get gamePlus
   * @return gamePlus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_GAME_PLUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getGamePlus() {
    return gamePlus;
  }


  @JsonProperty(JSON_PROPERTY_GAME_PLUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGamePlus(Boolean gamePlus) {
    this.gamePlus = gamePlus;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GameMediaAudioItemsInner gameMediaAudioItemsInner = (GameMediaAudioItemsInner) o;
    return Objects.equals(this.mediaState, gameMediaAudioItemsInner.mediaState) &&
        Objects.equals(this.mediaPlaybackId, gameMediaAudioItemsInner.mediaPlaybackId) &&
        Objects.equals(this.mediaFeedType, gameMediaAudioItemsInner.mediaFeedType) &&
        Objects.equals(this.callLetters, gameMediaAudioItemsInner.callLetters) &&
        Objects.equals(this.eventId, gameMediaAudioItemsInner.eventId) &&
        Objects.equals(this.language, gameMediaAudioItemsInner.language) &&
        Objects.equals(this.freeGame, gameMediaAudioItemsInner.freeGame) &&
        Objects.equals(this.feedName, gameMediaAudioItemsInner.feedName) &&
        Objects.equals(this.gamePlus, gameMediaAudioItemsInner.gamePlus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mediaState, mediaPlaybackId, mediaFeedType, callLetters, eventId, language, freeGame, feedName, gamePlus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GameMediaAudioItemsInner {\n");
    sb.append("    mediaState: ").append(toIndentedString(mediaState)).append("\n");
    sb.append("    mediaPlaybackId: ").append(toIndentedString(mediaPlaybackId)).append("\n");
    sb.append("    mediaFeedType: ").append(toIndentedString(mediaFeedType)).append("\n");
    sb.append("    callLetters: ").append(toIndentedString(callLetters)).append("\n");
    sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    freeGame: ").append(toIndentedString(freeGame)).append("\n");
    sb.append("    feedName: ").append(toIndentedString(feedName)).append("\n");
    sb.append("    gamePlus: ").append(toIndentedString(gamePlus)).append("\n");
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

