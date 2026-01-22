//[gamificationlibrary](../../../index.md)/[com.example.gamificationlibrary.points.data](../index.md)/[PointTransaction](index.md)

# PointTransaction

[androidJvm]\
data class [PointTransaction](index.md)(val amount: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin/-int/index.html), val reason: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin/-string/index.html), val timestamp: [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin/-long/index.html))

Represents a single transaction of points (either earned or deducted).

## Constructors

| | |
|---|---|
| [PointTransaction](-point-transaction.md) | [androidJvm]<br>constructor(amount: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin/-int/index.html), reason: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin/-string/index.html), timestamp: [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin/-long/index.html)) |

## Properties

| Name | Summary |
|---|---|
| [amount](amount.md) | [androidJvm]<br>val [amount](amount.md): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin/-int/index.html)<br>The amount of points for this transaction (positive for earned, negative for deducted). |
| [reason](reason.md) | [androidJvm]<br>val [reason](reason.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin/-string/index.html)<br>A description of the transaction. |
| [timestamp](timestamp.md) | [androidJvm]<br>val [timestamp](timestamp.md): [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin/-long/index.html)<br>The Unix timestamp (in milliseconds) when the transaction occurred. |
