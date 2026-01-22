//[gamificationlibrary](../../../index.md)/[com.example.gamificationlibrary.points](../index.md)/[PointsManager](index.md)

# PointsManager

class [PointsManager](index.md)(storage: [IGamificationStorage](../../com.example.gamificationlibrary.storage/-i-gamification-storage/index.md), onEventPublished: ([GamificationEvent](../../com.example.gamificationlibrary.core/-gamification-event/index.md)) -&gt; [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin/-unit/index.html))

Manages the accumulation, deduction, and retrieval of points for gamified entities.

#### Parameters

androidJvm

| | |
|---|---|
| storage | The storage mechanism used to persist user points data. |
| onEventPublished | A callback function to publish gamification events (e.g., PointsEarned). |

## Constructors

| | |
|---|---|
| [PointsManager](-points-manager.md) | [androidJvm]<br>constructor(storage: [IGamificationStorage](../../com.example.gamificationlibrary.storage/-i-gamification-storage/index.md), onEventPublished: ([GamificationEvent](../../com.example.gamificationlibrary.core/-gamification-event/index.md)) -&gt; [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin/-unit/index.html)) |

## Functions

| Name | Summary |
|---|---|
| [addPoints](add-points.md) | [androidJvm]<br>fun [addPoints](add-points.md)(entityId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin/-string/index.html), amount: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin/-int/index.html), reason: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin/-string/index.html)): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin/-int/index.html)<br>Adds points to a specific user. |
| [deductPoints](deduct-points.md) | [androidJvm]<br>fun [deductPoints](deduct-points.md)(entityId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin/-string/index.html), amount: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin/-int/index.html), reason: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin/-string/index.html)): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin/-int/index.html)<br>Deducts points from a specific user. |
| [getPoints](get-points.md) | [androidJvm]<br>fun [getPoints](get-points.md)(entityId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin/-string/index.html)): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin/-int/index.html)<br>Retrieves the current total points for a specific user. |
