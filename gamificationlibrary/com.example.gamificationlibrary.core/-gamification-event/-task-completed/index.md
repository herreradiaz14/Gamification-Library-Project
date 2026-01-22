//[gamificationlibrary](../../../../index.md)/[com.example.gamificationlibrary.core](../../index.md)/[GamificationEvent](../index.md)/[TaskCompleted](index.md)

# TaskCompleted

[androidJvm]\
data class [TaskCompleted](index.md)(val entityId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin/-string/index.html), val taskId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin/-string/index.html)) : [GamificationEvent](../index.md)

## Constructors

| | |
|---|---|
| [TaskCompleted](-task-completed.md) | [androidJvm]<br>constructor(entityId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin/-string/index.html), taskId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin/-string/index.html)) |

## Properties

| Name | Summary |
|---|---|
| [entityId](entity-id.md) | [androidJvm]<br>open override val [entityId](entity-id.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin/-string/index.html)<br>The ID of the user or entity associated with this event. |
| [taskId](task-id.md) | [androidJvm]<br>val [taskId](task-id.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin/-string/index.html) |
| [timestamp](../timestamp.md) | [androidJvm]<br>val [timestamp](../timestamp.md): [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin/-long/index.html)<br>Timestamp when the event occurred. |
