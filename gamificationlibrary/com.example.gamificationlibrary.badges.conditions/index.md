//[gamificationlibrary](../../index.md)/[com.example.gamificationlibrary.badges.conditions](index.md)

# Package-level declarations

## Types

| Name | Summary |
|---|---|
| [LevelThresholdCondition](-level-threshold-condition/index.md) | [androidJvm]<br>data class [LevelThresholdCondition](-level-threshold-condition/index.md)(val levelThreshold: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin/-int/index.html)) : [BadgeCondition](../com.example.gamificationlibrary.badges/-badge-condition/index.md)<br>A [BadgeCondition](../com.example.gamificationlibrary.badges/-badge-condition/index.md) that is met when a user reaches or exceeds a specified level. |
| [PointsThresholdCondition](-points-threshold-condition/index.md) | [androidJvm]<br>data class [PointsThresholdCondition](-points-threshold-condition/index.md)(val pointsThreshold: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin/-int/index.html)) : [BadgeCondition](../com.example.gamificationlibrary.badges/-badge-condition/index.md)<br>A [BadgeCondition](../com.example.gamificationlibrary.badges/-badge-condition/index.md) that is met when a user's total points reach or exceed a specified threshold. |
| [TaskCountCondition](-task-count-condition/index.md) | [androidJvm]<br>data class [TaskCountCondition](-task-count-condition/index.md)(val taskCount: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin/-int/index.html)) : [BadgeCondition](../com.example.gamificationlibrary.badges/-badge-condition/index.md)<br>A [BadgeCondition](../com.example.gamificationlibrary.badges/-badge-condition/index.md) that is met when a user has completed a specified number of tasks. This condition requires that task completion count is part of [UserGamificationData](../com.example.gamificationlibrary.core.data/-user-gamification-data/index.md). |
