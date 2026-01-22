//[gamificationlibrary](../../../index.md)/[com.example.gamificationlibrary.leaderboard](../index.md)/[LeaderboardManager](index.md)/[generateAndUpdateLeaderboard](generate-and-update-leaderboard.md)

# generateAndUpdateLeaderboard

[androidJvm]\
fun [generateAndUpdateLeaderboard](generate-and-update-leaderboard.md)(criteria: [LeaderboardCriteria](../../com.example.gamificationlibrary.leaderboard.data/-leaderboard-criteria/index.md) = LeaderboardCriteria.TOTAL_POINTS, updateUserData: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin/-boolean/index.html) = true): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin.collections/-list/index.html)&lt;[LeaderboardEntry](../../com.example.gamificationlibrary.leaderboard.data/-leaderboard-entry/index.md)&gt;

Builds and optionally persists a leaderboard sorted by the selected criteria. Updates each user's leaderboard rank if [updateUserData](generate-and-update-leaderboard.md) is true.
