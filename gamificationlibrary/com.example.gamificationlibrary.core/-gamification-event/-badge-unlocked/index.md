//[gamificationlibrary](../../../../index.md)/[com.example.gamificationlibrary.core](../../index.md)/[GamificationEvent](../index.md)/[BadgeUnlocked](index.md)

# BadgeUnlocked

[androidJvm]\
data class [BadgeUnlocked](index.md)(val entityId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin/-string/index.html), val badgeId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin/-string/index.html)) : [GamificationEvent](../index.md)

## Constructors

| | |
|---|---|
| [BadgeUnlocked](-badge-unlocked.md) | [androidJvm]<br>constructor(entityId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin/-string/index.html), badgeId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin/-string/index.html)) |

## Properties

| Name | Summary |
|---|---|
| [badgeId](badge-id.md) | [androidJvm]<br>val [badgeId](badge-id.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin/-string/index.html) |
| [entityId](entity-id.md) | [androidJvm]<br>open override val [entityId](entity-id.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin/-string/index.html)<br>The ID of the user or entity associated with this event. |
| [timestamp](../timestamp.md) | [androidJvm]<br>val [timestamp](../timestamp.md): [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin/-long/index.html)<br>Timestamp when the event occurred. |
