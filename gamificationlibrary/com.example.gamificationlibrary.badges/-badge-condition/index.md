//[gamificationlibrary](../../../index.md)/[com.example.gamificationlibrary.badges](../index.md)/[BadgeCondition](index.md)

# BadgeCondition

interface [BadgeCondition](index.md)

Interface for defining conditions that must be met for a badge to be awarded. Implementations of this interface will determine when a user is eligible for a specific badge.

#### Inheritors

| |
|---|
| [LevelThresholdCondition](../../com.example.gamificationlibrary.badges.conditions/-level-threshold-condition/index.md) |
| [PointsThresholdCondition](../../com.example.gamificationlibrary.badges.conditions/-points-threshold-condition/index.md) |
| [TaskCountCondition](../../com.example.gamificationlibrary.badges.conditions/-task-count-condition/index.md) |

## Functions

| Name | Summary |
|---|---|
| [isMet](is-met.md) | [androidJvm]<br>abstract fun [isMet](is-met.md)(userData: [UserGamificationData](../../com.example.gamificationlibrary.core.data/-user-gamification-data/index.md)): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin/-boolean/index.html)<br>Evaluates if the condition for this badge is met based on the current gamification data of a user. |
