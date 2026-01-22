//[gamificationlibrary](../../../index.md)/[com.example.gamificationlibrary.badges.conditions](../index.md)/[LevelThresholdCondition](index.md)

# LevelThresholdCondition

[androidJvm]\
data class [LevelThresholdCondition](index.md)(val levelThreshold: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin/-int/index.html)) : [BadgeCondition](../../com.example.gamificationlibrary.badges/-badge-condition/index.md)

A [BadgeCondition](../../com.example.gamificationlibrary.badges/-badge-condition/index.md) that is met when a user reaches or exceeds a specified level.

## Constructors

| | |
|---|---|
| [LevelThresholdCondition](-level-threshold-condition.md) | [androidJvm]<br>constructor(levelThreshold: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin/-int/index.html)) |

## Properties

| Name | Summary |
|---|---|
| [levelThreshold](level-threshold.md) | [androidJvm]<br>val [levelThreshold](level-threshold.md): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin/-int/index.html)<br>The minimum level required to meet this condition. |

## Functions

| Name | Summary |
|---|---|
| [isMet](is-met.md) | [androidJvm]<br>open override fun [isMet](is-met.md)(userData: [UserGamificationData](../../com.example.gamificationlibrary.core.data/-user-gamification-data/index.md)): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin/-boolean/index.html)<br>Evaluates if the condition for this badge is met based on the current gamification data of a user. |
