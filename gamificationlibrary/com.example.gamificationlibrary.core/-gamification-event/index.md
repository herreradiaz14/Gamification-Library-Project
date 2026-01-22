//[gamificationlibrary](../../../index.md)/[com.example.gamificationlibrary.core](../index.md)/[GamificationEvent](index.md)

# GamificationEvent

sealed class [GamificationEvent](index.md)

Sealed class representing various events that can trigger gamification logic. Extend this sealed class to define specific events like points earned, tasks completed, badges unlocked, etc.

#### Inheritors

| |
|---|
| [PointsEarned](-points-earned/index.md) |
| [TaskCompleted](-task-completed/index.md) |
| [LevelUp](-level-up/index.md) |
| [BadgeUnlocked](-badge-unlocked/index.md) |

## Types

| Name | Summary |
|---|---|
| [BadgeUnlocked](-badge-unlocked/index.md) | [androidJvm]<br>data class [BadgeUnlocked](-badge-unlocked/index.md)(val entityId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin/-string/index.html), val badgeId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin/-string/index.html)) : [GamificationEvent](index.md) |
| [LevelUp](-level-up/index.md) | [androidJvm]<br>data class [LevelUp](-level-up/index.md)(val entityId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin/-string/index.html), val newLevel: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin/-int/index.html)) : [GamificationEvent](index.md) |
| [PointsEarned](-points-earned/index.md) | [androidJvm]<br>data class [PointsEarned](-points-earned/index.md)(val entityId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin/-string/index.html), val amount: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin/-int/index.html), val reason: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin/-string/index.html)) : [GamificationEvent](index.md) |
| [TaskCompleted](-task-completed/index.md) | [androidJvm]<br>data class [TaskCompleted](-task-completed/index.md)(val entityId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin/-string/index.html), val taskId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin/-string/index.html)) : [GamificationEvent](index.md) |

## Properties

| Name | Summary |
|---|---|
| [entityId](entity-id.md) | [androidJvm]<br>abstract val [entityId](entity-id.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin/-string/index.html)<br>The ID of the user or entity associated with this event. |
| [timestamp](timestamp.md) | [androidJvm]<br>val [timestamp](timestamp.md): [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin/-long/index.html)<br>Timestamp when the event occurred. |
