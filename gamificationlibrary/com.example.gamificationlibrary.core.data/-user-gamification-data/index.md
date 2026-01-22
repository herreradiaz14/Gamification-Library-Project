//[gamificationlibrary](../../../index.md)/[com.example.gamificationlibrary.core.data](../index.md)/[UserGamificationData](index.md)

# UserGamificationData

[androidJvm]\
data class [UserGamificationData](index.md)(val entityId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin/-string/index.html), val pointsData: [UserPointsData](../../com.example.gamificationlibrary.points.data/-user-points-data/index.md), val badgesData: [UserBadgesData](../../com.example.gamificationlibrary.badges.data/-user-badges-data/index.md), val levelData: [UserLevelData](../../com.example.gamificationlibrary.levels.data/-user-level-data/index.md), val leaderboardRank: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin/-int/index.html)? = null)

Represents the comprehensive gamification data for a single user or gamifiable entity. This acts as a single source of truth for an entity's gamification state.

## Constructors

| | |
|---|---|
| [UserGamificationData](-user-gamification-data.md) | [androidJvm]<br>constructor(entityId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin/-string/index.html), pointsData: [UserPointsData](../../com.example.gamificationlibrary.points.data/-user-points-data/index.md), badgesData: [UserBadgesData](../../com.example.gamificationlibrary.badges.data/-user-badges-data/index.md), levelData: [UserLevelData](../../com.example.gamificationlibrary.levels.data/-user-level-data/index.md), leaderboardRank: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin/-int/index.html)? = null) |

## Properties

| Name | Summary |
|---|---|
| [badgesData](badges-data.md) | [androidJvm]<br>val [badgesData](badges-data.md): [UserBadgesData](../../com.example.gamificationlibrary.badges.data/-user-badges-data/index.md)<br>The user's badge data. |
| [entityId](entity-id.md) | [androidJvm]<br>val [entityId](entity-id.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin/-string/index.html)<br>The unique ID of the gamifiable entity (e.g., user ID). |
| [leaderboardRank](leaderboard-rank.md) | [androidJvm]<br>val [leaderboardRank](leaderboard-rank.md): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin/-int/index.html)? = null |
| [levelData](level-data.md) | [androidJvm]<br>val [levelData](level-data.md): [UserLevelData](../../com.example.gamificationlibrary.levels.data/-user-level-data/index.md)<br>The user's level data. // Add other gamification data types here |
| [pointsData](points-data.md) | [androidJvm]<br>val [pointsData](points-data.md): [UserPointsData](../../com.example.gamificationlibrary.points.data/-user-points-data/index.md)<br>The user's points data. |
