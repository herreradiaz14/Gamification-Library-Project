//[gamificationlibrary](../../../index.md)/[com.example.gamificationlibrary.points.data](../index.md)/[UserPointsData](index.md)

# UserPointsData

[androidJvm]\
data class [UserPointsData](index.md)(val totalPoints: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin/-int/index.html) = 0, val transactions: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin.collections/-list/index.html)&lt;[PointTransaction](../-point-transaction/index.md)&gt; = emptyList())

Represents the points-related data for a single user or gamifiable entity.

## Constructors

| | |
|---|---|
| [UserPointsData](-user-points-data.md) | [androidJvm]<br>constructor(totalPoints: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin/-int/index.html) = 0, transactions: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin.collections/-list/index.html)&lt;[PointTransaction](../-point-transaction/index.md)&gt; = emptyList()) |

## Properties

| Name | Summary |
|---|---|
| [totalPoints](total-points.md) | [androidJvm]<br>val [totalPoints](total-points.md): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin/-int/index.html) = 0<br>The current total number of points. |
| [transactions](transactions.md) | [androidJvm]<br>val [transactions](transactions.md): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin.collections/-list/index.html)&lt;[PointTransaction](../-point-transaction/index.md)&gt;<br>A list of point transactions (optional, for history). |
