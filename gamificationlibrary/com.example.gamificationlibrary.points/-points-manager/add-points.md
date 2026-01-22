//[gamificationlibrary](../../../index.md)/[com.example.gamificationlibrary.points](../index.md)/[PointsManager](index.md)/[addPoints](add-points.md)

# addPoints

[androidJvm]\
fun [addPoints](add-points.md)(entityId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin/-string/index.html), amount: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin/-int/index.html), reason: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin/-string/index.html)): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin/-int/index.html)

Adds points to a specific user.

#### Return

The updated total points for the entity.

#### Parameters

androidJvm

| | |
|---|---|
| entityId | The ID of the entity (e.g., user) to add points to. |
| amount | The number of points to add. Must be positive. |
| reason | A description of why the points were awarded. |

#### Throws

| | |
|---|---|
| [IllegalArgumentException](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin/-illegal-argument-exception/index.html) | if amount is not positive. |
