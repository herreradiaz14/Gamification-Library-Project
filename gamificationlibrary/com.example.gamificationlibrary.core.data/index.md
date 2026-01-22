//[gamificationlibrary](../../index.md)/[com.example.gamificationlibrary.core.data](index.md)

# Package-level declarations

## Types

| Name | Summary |
|---|---|
| [IGamificationStorage](-i-gamification-storage/index.md) | [androidJvm]<br>interface [IGamificationStorage](-i-gamification-storage/index.md)<br>Interface defining the contract for storing and retrieving gamification data. Implementations can be in-memory, SQLite, remote API, etc. |
| [UserGamificationData](-user-gamification-data/index.md) | [androidJvm]<br>data class [UserGamificationData](-user-gamification-data/index.md)(val entityId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin/-string/index.html), val pointsData: [UserPointsData](../com.example.gamificationlibrary.points.data/-user-points-data/index.md), val badgesData: [UserBadgesData](../com.example.gamificationlibrary.badges.data/-user-badges-data/index.md), val levelData: [UserLevelData](../com.example.gamificationlibrary.levels.data/-user-level-data/index.md), val leaderboardRank: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin/-int/index.html)? = null)<br>Represents the comprehensive gamification data for a single user or gamifiable entity. This acts as a single source of truth for an entity's gamification state. |
