//[gamificationlibrary](../../../index.md)/[com.example.gamificationlibrary.points](../index.md)/[PointsManager](index.md)/[deductPoints](deduct-points.md)

# deductPoints

[androidJvm]\
fun [deductPoints](deduct-points.md)(entityId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin/-string/index.html), amount: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin/-int/index.html), reason: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin/-string/index.html)): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin/-int/index.html)

Deducts points from a specific user.

#### Return

The updated total points for the entity.

#### Parameters

androidJvm

| | |
|---|---|
| entityId | The ID of the entity (e.g., user) to deduct points from. |
| amount | The number of points to deduct. Must be positive. |
| reason | A description of why the points were deducted. |

#### Throws

| | |
|---|---|
| [IllegalArgumentException](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin/-illegal-argument-exception/index.html) | if amount is not positive or if deduction would result in negative points. |
