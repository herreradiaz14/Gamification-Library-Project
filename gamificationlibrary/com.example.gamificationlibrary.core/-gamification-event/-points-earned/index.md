//[gamificationlibrary](../../../../index.md)/[com.example.gamificationlibrary.core](../../index.md)/[GamificationEvent](../index.md)/[PointsEarned](index.md)

# PointsEarned

[androidJvm]\
data class [PointsEarned](index.md)(val entityId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin/-string/index.html), val amount: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin/-int/index.html), val reason: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin/-string/index.html)) : [GamificationEvent](../index.md)

## Constructors

| | |
|---|---|
| [PointsEarned](-points-earned.md) | [androidJvm]<br>constructor(entityId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin/-string/index.html), amount: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin/-int/index.html), reason: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin/-string/index.html)) |

## Properties

| Name | Summary |
|---|---|
| [amount](amount.md) | [androidJvm]<br>val [amount](amount.md): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin/-int/index.html) |
| [entityId](entity-id.md) | [androidJvm]<br>open override val [entityId](entity-id.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin/-string/index.html)<br>The ID of the user or entity associated with this event. |
| [reason](reason.md) | [androidJvm]<br>val [reason](reason.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin/-string/index.html) |
| [timestamp](../timestamp.md) | [androidJvm]<br>val [timestamp](../timestamp.md): [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin/-long/index.html)<br>Timestamp when the event occurred. |
