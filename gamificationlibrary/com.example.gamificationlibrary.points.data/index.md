//[gamificationlibrary](../../index.md)/[com.example.gamificationlibrary.points.data](index.md)

# Package-level declarations

## Types

| Name | Summary |
|---|---|
| [PointTransaction](-point-transaction/index.md) | [androidJvm]<br>data class [PointTransaction](-point-transaction/index.md)(val amount: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin/-int/index.html), val reason: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin/-string/index.html), val timestamp: [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin/-long/index.html))<br>Represents a single transaction of points (either earned or deducted). |
| [UserPointsData](-user-points-data/index.md) | [androidJvm]<br>data class [UserPointsData](-user-points-data/index.md)(val totalPoints: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin/-int/index.html) = 0, val transactions: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin.collections/-list/index.html)&lt;[PointTransaction](-point-transaction/index.md)&gt; = emptyList())<br>Represents the points-related data for a single user or gamifiable entity. |
