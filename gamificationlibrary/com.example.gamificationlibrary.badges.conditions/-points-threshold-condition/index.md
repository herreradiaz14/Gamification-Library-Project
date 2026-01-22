//[gamificationlibrary](../../../index.md)/[com.example.gamificationlibrary.badges.conditions](../index.md)/[PointsThresholdCondition](index.md)

# PointsThresholdCondition

[androidJvm]\
data class [PointsThresholdCondition](index.md)(val pointsThreshold: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin/-int/index.html)) : [BadgeCondition](../../com.example.gamificationlibrary.badges/-badge-condition/index.md)

A [BadgeCondition](../../com.example.gamificationlibrary.badges/-badge-condition/index.md) that is met when a user's total points reach or exceed a specified threshold.

## Constructors

| | |
|---|---|
| [PointsThresholdCondition](-points-threshold-condition.md) | [androidJvm]<br>constructor(pointsThreshold: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin/-int/index.html)) |

## Properties

| Name | Summary |
|---|---|
| [pointsThreshold](points-threshold.md) | [androidJvm]<br>val [pointsThreshold](points-threshold.md): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin/-int/index.html)<br>The minimum number of points required to meet this condition. |

## Functions

| Name | Summary |
|---|---|
| [isMet](is-met.md) | [androidJvm]<br>open override fun [isMet](is-met.md)(userData: [UserGamificationData](../../com.example.gamificationlibrary.core.data/-user-gamification-data/index.md)): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin/-boolean/index.html)<br>Evaluates if the condition for this badge is met based on the current gamification data of a user. |
