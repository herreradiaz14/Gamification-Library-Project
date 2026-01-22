//[gamificationlibrary](../../../index.md)/[com.example.gamificationlibrary.leaderboard](../index.md)/[LeaderboardManager](index.md)

# LeaderboardManager

[androidJvm]\
class [LeaderboardManager](index.md)(storage: [IGamificationStorage](../../com.example.gamificationlibrary.storage/-i-gamification-storage/index.md))

## Constructors

| | |
|---|---|
| [LeaderboardManager](-leaderboard-manager.md) | [androidJvm]<br>constructor(storage: [IGamificationStorage](../../com.example.gamificationlibrary.storage/-i-gamification-storage/index.md)) |

## Functions

| Name | Summary |
|---|---|
| [generateAndUpdateLeaderboard](generate-and-update-leaderboard.md) | [androidJvm]<br>fun [generateAndUpdateLeaderboard](generate-and-update-leaderboard.md)(criteria: [LeaderboardCriteria](../../com.example.gamificationlibrary.leaderboard.data/-leaderboard-criteria/index.md) = LeaderboardCriteria.TOTAL_POINTS, updateUserData: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin/-boolean/index.html) = true): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin.collections/-list/index.html)&lt;[LeaderboardEntry](../../com.example.gamificationlibrary.leaderboard.data/-leaderboard-entry/index.md)&gt;<br>Builds and optionally persists a leaderboard sorted by the selected criteria. Updates each user's leaderboard rank if [updateUserData](generate-and-update-leaderboard.md) is true. |
