//[gamificationlibrary](../../../index.md)/[com.example.gamificationlibrary.levels](../index.md)/[LevelManager](index.md)

# LevelManager

class [LevelManager](index.md)(storage: [IGamificationStorage](../../com.example.gamificationlibrary.storage/-i-gamification-storage/index.md), levelDefinitions: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin.collections/-list/index.html)&lt;[LevelDefinition](../../com.example.gamificationlibrary.levels.data/-level-definition/index.md)&gt;, onEventPublished: ([GamificationEvent](../../com.example.gamificationlibrary.core/-gamification-event/index.md)) -&gt; [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin/-unit/index.html))

Manages the level progression for gamified entities based on accumulated points or other metrics.

#### Parameters

androidJvm

| | |
|---|---|
| storage | The storage mechanism used to persist user level data. |
| levelDefinitions | A sorted list of all available level definitions, from lowest to highest level. |
| onEventPublished | A callback function to publish gamification events (e.g., LevelUp). |

## Constructors

| | |
|---|---|
| [LevelManager](-level-manager.md) | [androidJvm]<br>constructor(storage: [IGamificationStorage](../../com.example.gamificationlibrary.storage/-i-gamification-storage/index.md), levelDefinitions: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin.collections/-list/index.html)&lt;[LevelDefinition](../../com.example.gamificationlibrary.levels.data/-level-definition/index.md)&gt;, onEventPublished: ([GamificationEvent](../../com.example.gamificationlibrary.core/-gamification-event/index.md)) -&gt; [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin/-unit/index.html)) |

## Functions

| Name | Summary |
|---|---|
| [checkLevelUp](check-level-up.md) | [androidJvm]<br>fun [checkLevelUp](check-level-up.md)(entityId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin/-string/index.html)): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin/-int/index.html)<br>Checks if a user has leveled up based on their current points. This method should be called whenever a user's points change. |
| [getCurrentLevel](get-current-level.md) | [androidJvm]<br>fun [getCurrentLevel](get-current-level.md)(entityId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin/-string/index.html)): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin/-int/index.html)<br>Retrieves the current level of a specific user. |
| [getLevelProgress](get-level-progress.md) | [androidJvm]<br>fun [getLevelProgress](get-level-progress.md)(entityId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin/-string/index.html)): [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin/-float/index.html)<br>Retrieves the current level progress of a specific user. |
| [getNextLevelThreshold](get-next-level-threshold.md) | [androidJvm]<br>fun [getNextLevelThreshold](get-next-level-threshold.md)(currentLevel: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin/-int/index.html)): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin/-int/index.html)<br>Retrieves the total points required to reach the next level beyond the current level. |
