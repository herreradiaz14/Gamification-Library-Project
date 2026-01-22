//[gamificationlibrary](../../../index.md)/[com.example.gamificationlibrary.badges.conditions](../index.md)/[TaskCountCondition](index.md)

# TaskCountCondition

[androidJvm]\
data class [TaskCountCondition](index.md)(val taskCount: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin/-int/index.html)) : [BadgeCondition](../../com.example.gamificationlibrary.badges/-badge-condition/index.md)

A [BadgeCondition](../../com.example.gamificationlibrary.badges/-badge-condition/index.md) that is met when a user has completed a specified number of tasks. This condition requires that task completion count is part of [UserGamificationData](../../com.example.gamificationlibrary.core.data/-user-gamification-data/index.md).

## Constructors

| | |
|---|---|
| [TaskCountCondition](-task-count-condition.md) | [androidJvm]<br>constructor(taskCount: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin/-int/index.html)) |

## Properties

| Name | Summary |
|---|---|
| [taskCount](task-count.md) | [androidJvm]<br>val [taskCount](task-count.md): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin/-int/index.html)<br>The minimum number of tasks required to meet this condition. |

## Functions

| Name | Summary |
|---|---|
| [isMet](is-met.md) | [androidJvm]<br>open override fun [isMet](is-met.md)(userData: [UserGamificationData](../../com.example.gamificationlibrary.core.data/-user-gamification-data/index.md)): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin/-boolean/index.html)<br>Evaluates if the condition for this badge is met based on the current gamification data of a user. |
