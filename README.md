# openapi-java-client

NHL API

- API version: 1.0.0

- Build date: 2022-10-30T23:05:09.464412-04:00[America/Toronto]

Documenting the publicly accessible portions of the NHL API.

  For more information, please visit [https://github.com/mbroeze/nhl-api-specifications/tree/justyaml](https://github.com/mbroeze/nhl-api-specifications/tree/justyaml)

*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*

## Requirements

Building the API client library requires:

1. Java 1.8+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>org.openapitools</groupId>
  <artifactId>openapi-java-client</artifactId>
  <version>1.0.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
  repositories {
    mavenCentral()     // Needed if the 'openapi-java-client' jar has been published to maven central.
    mavenLocal()       // Needed if the 'openapi-java-client' jar has been published to the local maven repo.
  }

  dependencies {
     implementation "org.openapitools:openapi-java-client:1.0.0"
  }
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

- `target/openapi-java-client-1.0.0.jar`
- `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import org.openapitools.client.*;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.ConferencesApi;

public class ConferencesApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://statsapi.web.nhl.com/api/v1");
        
        ConferencesApi apiInstance = new ConferencesApi(defaultClient);
        BigDecimal id = new BigDecimal("5"); // BigDecimal | The ID of the conference.
        try {
            Division result = apiInstance.getConference(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ConferencesApi#getConference");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://statsapi.web.nhl.com/api/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*ConferencesApi* | [**getConference**](docs/ConferencesApi.md#getConference) | **GET** /conferences/{id} | Get an NHL conference.
*ConferencesApi* | [**getConferences**](docs/ConferencesApi.md#getConferences) | **GET** /conferences | Get all current NHL conferences.
*DivisionsApi* | [**getDivision**](docs/DivisionsApi.md#getDivision) | **GET** /divisions/{id} | Get an NHL division.
*DivisionsApi* | [**getDivisions**](docs/DivisionsApi.md#getDivisions) | **GET** /divisions | Get all current NHL divisions.
*DraftApi* | [**getDraft**](docs/DraftApi.md#getDraft) | **GET** /draft | Get round-by-round data for current year&#39;s NHL Entry Draft.
*DraftApi* | [**getDraftByYear**](docs/DraftApi.md#getDraftByYear) | **GET** /draft/{year} | Get round-by-round data for a specific year&#39;s NHL Entry Draft.
*DraftApi* | [**getDraftProspect**](docs/DraftApi.md#getDraftProspect) | **GET** /draft/prospects/{id} | Get an NHL Entry Draft prospect.
*DraftApi* | [**getDraftProspects**](docs/DraftApi.md#getDraftProspects) | **GET** /draft/prospects | Get all NHL Entry Draft prospects.
*GamesApi* | [**getGame**](docs/GamesApi.md#getGame) | **GET** /game/{id}/feed/live | Get all available data for an NHL game.
*GamesApi* | [**getGameBoxscore**](docs/GamesApi.md#getGameBoxscore) | **GET** /game/{id}/boxscore | Get the boxscore for an NHL game.
*GamesApi* | [**getGameContent**](docs/GamesApi.md#getGameContent) | **GET** /game/{id}/content | Get editorials, video replays and photo highlights for an NHL game.
*GamesApi* | [**getGameDiff**](docs/GamesApi.md#getGameDiff) | **GET** /game/{id}/feed/live/diffPatch | Get all available data for an NHL game after a specific time.
*PlayersApi* | [**getPlayer**](docs/PlayersApi.md#getPlayer) | **GET** /people/{id} | Get an NHL player.
*PlayersApi* | [**getPlayerStats**](docs/PlayersApi.md#getPlayerStats) | **GET** /people/{id}/stats | Get specific statistics for an NHL player.
*ScheduleApi* | [**getSchedule**](docs/ScheduleApi.md#getSchedule) | **GET** /schedule | Get the NHL game schedule.
*StandingsApi* | [**getStandingTypes**](docs/StandingsApi.md#getStandingTypes) | **GET** /standingsTypes | Get all available NHL standing types.
*StandingsApi* | [**getStandings**](docs/StandingsApi.md#getStandings) | **GET** /standings | Get NHL division standings.
*StandingsApi* | [**getStandingsByType**](docs/StandingsApi.md#getStandingsByType) | **GET** /standings/{type} | Get NHL standings for a specific standing type.
*StatsApi* | [**getStatTypes**](docs/StatsApi.md#getStatTypes) | **GET** /statTypes | Get all available NHL statistic types.
*TeamsApi* | [**getTeam**](docs/TeamsApi.md#getTeam) | **GET** /teams/{id} | Get an NHL team.
*TeamsApi* | [**getTeamRoster**](docs/TeamsApi.md#getTeamRoster) | **GET** /teams/{id}/roster | Get an NHL team&#39;s roster.
*TeamsApi* | [**getTeamStats**](docs/TeamsApi.md#getTeamStats) | **GET** /teams/{id}/stats | Get all statistics for an NHL team.
*TeamsApi* | [**getTeams**](docs/TeamsApi.md#getTeams) | **GET** /teams | Get all NHL teams.


## Documentation for Models

 - [Conference](docs/Conference.md)
 - [Conferences](docs/Conferences.md)
 - [Division](docs/Division.md)
 - [DivisionConference](docs/DivisionConference.md)
 - [Divisions](docs/Divisions.md)
 - [Draft](docs/Draft.md)
 - [DraftDraftsInner](docs/DraftDraftsInner.md)
 - [DraftDraftsInnerRoundsInner](docs/DraftDraftsInnerRoundsInner.md)
 - [DraftDraftsInnerRoundsInnerPicksInner](docs/DraftDraftsInnerRoundsInnerPicksInner.md)
 - [DraftDraftsInnerRoundsInnerPicksInnerProspect](docs/DraftDraftsInnerRoundsInnerPicksInnerProspect.md)
 - [DraftDraftsInnerRoundsInnerPicksInnerTeam](docs/DraftDraftsInnerRoundsInnerPicksInnerTeam.md)
 - [DraftProspect](docs/DraftProspect.md)
 - [DraftProspectAmateurLeague](docs/DraftProspectAmateurLeague.md)
 - [DraftProspectAmateurTeam](docs/DraftProspectAmateurTeam.md)
 - [DraftProspectPrimaryPosition](docs/DraftProspectPrimaryPosition.md)
 - [DraftProspectProspectCategory](docs/DraftProspectProspectCategory.md)
 - [DraftProspects](docs/DraftProspects.md)
 - [Error](docs/Error.md)
 - [Franchise](docs/Franchise.md)
 - [Game](docs/Game.md)
 - [GameBoxscore](docs/GameBoxscore.md)
 - [GameBoxscoreTeam](docs/GameBoxscoreTeam.md)
 - [GameBoxscoreTeamCoachesInner](docs/GameBoxscoreTeamCoachesInner.md)
 - [GameBoxscoreTeamCoachesInnerPerson](docs/GameBoxscoreTeamCoachesInnerPerson.md)
 - [GameBoxscoreTeamCoachesInnerPosition](docs/GameBoxscoreTeamCoachesInnerPosition.md)
 - [GameBoxscoreTeamOnIcePlusInner](docs/GameBoxscoreTeamOnIcePlusInner.md)
 - [GameBoxscoreTeamPlayers](docs/GameBoxscoreTeamPlayers.md)
 - [GameBoxscoreTeamPlayersPerson](docs/GameBoxscoreTeamPlayersPerson.md)
 - [GameBoxscoreTeamPlayersPosition](docs/GameBoxscoreTeamPlayersPosition.md)
 - [GameBoxscoreTeamPlayersStats](docs/GameBoxscoreTeamPlayersStats.md)
 - [GameBoxscoreTeamPlayersStatsSkaterStats](docs/GameBoxscoreTeamPlayersStatsSkaterStats.md)
 - [GameBoxscoreTeamTeam](docs/GameBoxscoreTeamTeam.md)
 - [GameBoxscoreTeamTeamStats](docs/GameBoxscoreTeamTeamStats.md)
 - [GameBoxscoreTeamTeamStatsTeamSkaterStats](docs/GameBoxscoreTeamTeamStatsTeamSkaterStats.md)
 - [GameBoxscoreTeams](docs/GameBoxscoreTeams.md)
 - [GameBoxscores](docs/GameBoxscores.md)
 - [GameBoxscoresAllOf](docs/GameBoxscoresAllOf.md)
 - [GameContent](docs/GameContent.md)
 - [GameContentEditorial](docs/GameContentEditorial.md)
 - [GameContentHighlights](docs/GameContentHighlights.md)
 - [GameContentMedia](docs/GameContentMedia.md)
 - [GameContentMediaEpgInner](docs/GameContentMediaEpgInner.md)
 - [GameContentMediaMilestones](docs/GameContentMediaMilestones.md)
 - [GameContentMediaMilestonesItemsInner](docs/GameContentMediaMilestonesItemsInner.md)
 - [GameDecisionPlayer](docs/GameDecisionPlayer.md)
 - [GameEditorial](docs/GameEditorial.md)
 - [GameEditorialContributor](docs/GameEditorialContributor.md)
 - [GameEditorialContributorContributorsInner](docs/GameEditorialContributorContributorsInner.md)
 - [GameEditorialKeyword](docs/GameEditorialKeyword.md)
 - [GameEditorialMedia](docs/GameEditorialMedia.md)
 - [GameEditorialTokenData](docs/GameEditorialTokenData.md)
 - [GameEditorials](docs/GameEditorials.md)
 - [GameGameData](docs/GameGameData.md)
 - [GameGameDataDatetime](docs/GameGameDataDatetime.md)
 - [GameGameDataGame](docs/GameGameDataGame.md)
 - [GameGameDataStatus](docs/GameGameDataStatus.md)
 - [GameGameDataTeams](docs/GameGameDataTeams.md)
 - [GameGameDataVenue](docs/GameGameDataVenue.md)
 - [GameHighlight](docs/GameHighlight.md)
 - [GameHighlightPlaybacksInner](docs/GameHighlightPlaybacksInner.md)
 - [GameHighlightType](docs/GameHighlightType.md)
 - [GameHighlights](docs/GameHighlights.md)
 - [GameLinescore](docs/GameLinescore.md)
 - [GameLinescoreIntermissionInfo](docs/GameLinescoreIntermissionInfo.md)
 - [GameLinescorePowerPlayInfo](docs/GameLinescorePowerPlayInfo.md)
 - [GameLinescoreShootoutInfo](docs/GameLinescoreShootoutInfo.md)
 - [GameLinescoreShootoutInfoAway](docs/GameLinescoreShootoutInfoAway.md)
 - [GameLinescoreTeam](docs/GameLinescoreTeam.md)
 - [GameLinescoreTeams](docs/GameLinescoreTeams.md)
 - [GameLiveData](docs/GameLiveData.md)
 - [GameLiveDataDecisions](docs/GameLiveDataDecisions.md)
 - [GameLiveDataPlays](docs/GameLiveDataPlays.md)
 - [GameLiveDataPlaysPlaysByPeriodInner](docs/GameLiveDataPlaysPlaysByPeriodInner.md)
 - [GameMediaAudio](docs/GameMediaAudio.md)
 - [GameMediaAudioItemsInner](docs/GameMediaAudioItemsInner.md)
 - [GameMediaNHLTV](docs/GameMediaNHLTV.md)
 - [GameMediaNHLTVItemsInner](docs/GameMediaNHLTVItemsInner.md)
 - [GameMetaData](docs/GameMetaData.md)
 - [GameOfficial](docs/GameOfficial.md)
 - [GameOfficialOfficial](docs/GameOfficialOfficial.md)
 - [GamePeriod](docs/GamePeriod.md)
 - [GamePeriodAway](docs/GamePeriodAway.md)
 - [GamePeriodHome](docs/GamePeriodHome.md)
 - [GamePlay](docs/GamePlay.md)
 - [GamePlayAbout](docs/GamePlayAbout.md)
 - [GamePlayAboutGoals](docs/GamePlayAboutGoals.md)
 - [GamePlayCoordinates](docs/GamePlayCoordinates.md)
 - [GamePlayPlayersInner](docs/GamePlayPlayersInner.md)
 - [GamePlayPlayersInnerPlayer](docs/GamePlayPlayersInnerPlayer.md)
 - [GamePlayResult](docs/GamePlayResult.md)
 - [GamePlayTeam](docs/GamePlayTeam.md)
 - [Photo](docs/Photo.md)
 - [PhotoCuts](docs/PhotoCuts.md)
 - [Player](docs/Player.md)
 - [PlayerCurrentTeam](docs/PlayerCurrentTeam.md)
 - [PlayerStats](docs/PlayerStats.md)
 - [PlayerStatsStatsInner](docs/PlayerStatsStatsInner.md)
 - [PlayerStatsStatsInnerSplitsInner](docs/PlayerStatsStatsInnerSplitsInner.md)
 - [PlayerStatsStatsInnerSplitsInnerOpponentDivision](docs/PlayerStatsStatsInnerSplitsInnerOpponentDivision.md)
 - [PlayerStatsStatsInnerSplitsInnerStat](docs/PlayerStatsStatsInnerSplitsInnerStat.md)
 - [PlayerStatsStatsInnerType](docs/PlayerStatsStatsInnerType.md)
 - [Players](docs/Players.md)
 - [Roster](docs/Roster.md)
 - [RosterPerson](docs/RosterPerson.md)
 - [Rosters](docs/Rosters.md)
 - [Schedule](docs/Schedule.md)
 - [ScheduleDay](docs/ScheduleDay.md)
 - [ScheduleGame](docs/ScheduleGame.md)
 - [ScheduleGameContent](docs/ScheduleGameContent.md)
 - [ScheduleGameTeams](docs/ScheduleGameTeams.md)
 - [ScheduleGameTeamsAway](docs/ScheduleGameTeamsAway.md)
 - [ScheduleGameTeamsAwayLeagueRecord](docs/ScheduleGameTeamsAwayLeagueRecord.md)
 - [ScheduleGameTeamsAwayTeam](docs/ScheduleGameTeamsAwayTeam.md)
 - [ScheduleGameTeamsHome](docs/ScheduleGameTeamsHome.md)
 - [ScheduleGameTeamsHomeLeagueRecord](docs/ScheduleGameTeamsHomeLeagueRecord.md)
 - [ScheduleGameTicketsInner](docs/ScheduleGameTicketsInner.md)
 - [StandingTypesInner](docs/StandingTypesInner.md)
 - [Standings](docs/Standings.md)
 - [StandingsRecordsInner](docs/StandingsRecordsInner.md)
 - [StandingsRecordsInnerDivision](docs/StandingsRecordsInnerDivision.md)
 - [StandingsRecordsInnerLeague](docs/StandingsRecordsInnerLeague.md)
 - [StandingsRecordsInnerTeamRecordsInner](docs/StandingsRecordsInnerTeamRecordsInner.md)
 - [StandingsRecordsInnerTeamRecordsInnerStreak](docs/StandingsRecordsInnerTeamRecordsInnerStreak.md)
 - [StatTypesInner](docs/StatTypesInner.md)
 - [Team](docs/Team.md)
 - [TeamNextGameSchedule](docs/TeamNextGameSchedule.md)
 - [TeamNextGameScheduleDatesInner](docs/TeamNextGameScheduleDatesInner.md)
 - [TeamNextGameScheduleDatesInnerGamesInner](docs/TeamNextGameScheduleDatesInnerGamesInner.md)
 - [TeamNextGameScheduleDatesInnerGamesInnerStatus](docs/TeamNextGameScheduleDatesInnerGamesInnerStatus.md)
 - [TeamNextGameScheduleDatesInnerGamesInnerTeams](docs/TeamNextGameScheduleDatesInnerGamesInnerTeams.md)
 - [TeamNextGameScheduleDatesInnerGamesInnerTeamsAway](docs/TeamNextGameScheduleDatesInnerGamesInnerTeamsAway.md)
 - [TeamNextGameScheduleDatesInnerGamesInnerTeamsAwayLeagueRecord](docs/TeamNextGameScheduleDatesInnerGamesInnerTeamsAwayLeagueRecord.md)
 - [TeamNextGameScheduleDatesInnerGamesInnerTeamsAwayTeam](docs/TeamNextGameScheduleDatesInnerGamesInnerTeamsAwayTeam.md)
 - [TeamNextGameScheduleDatesInnerGamesInnerTeamsHome](docs/TeamNextGameScheduleDatesInnerGamesInnerTeamsHome.md)
 - [TeamNextGameScheduleDatesInnerGamesInnerTeamsHomeLeagueRecord](docs/TeamNextGameScheduleDatesInnerGamesInnerTeamsHomeLeagueRecord.md)
 - [TeamRoster](docs/TeamRoster.md)
 - [TeamStats](docs/TeamStats.md)
 - [TeamStatsStatsInner](docs/TeamStatsStatsInner.md)
 - [TeamStatsStatsInnerSplitsInner](docs/TeamStatsStatsInnerSplitsInner.md)
 - [TeamStatsStatsInnerSplitsInnerStat](docs/TeamStatsStatsInnerSplitsInnerStat.md)
 - [TeamStatsStatsInnerType](docs/TeamStatsStatsInnerType.md)
 - [Teams](docs/Teams.md)
 - [Venue](docs/Venue.md)
 - [VenueTimeZone](docs/VenueTimeZone.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



