//[gamificationlibrary](../../../../index.md)/[com.example.gamificationlibrary.core](../../index.md)/[GamificationEvent](../index.md)/[LevelUp](index.md)

# LevelUp

[androidJvm]\
data class [LevelUp](index.md)(val entityId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin/-string/index.html), val newLevel: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin/-int/index.html)) : [GamificationEvent](../index.md)

## Constructors

| | |
|---|---|
| [LevelUp](-level-up.md) | [androidJvm]<br>constructor(entityId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin/-string/index.html), newLevel: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin/-int/index.html)) |

## Properties

| Name | Summary |
|---|---|
| [entityId](entity-id.md) | [androidJvm]<br>open override val [entityId](entity-id.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin/-string/index.html)<br>The ID of the user or entity associated with this event. |
| [newLevel](new-level.md) | [androidJvm]<br>val [newLevel](new-level.md): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin/-int/index.html) |
| [timestamp](../timestamp.md) | [androidJvm]<br>val [timestamp](../timestamp.md): [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin/-long/index.html)<br>Timestamp when the event occurred. |
