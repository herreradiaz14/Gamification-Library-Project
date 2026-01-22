//[gamificationlibrary](../../../index.md)/[com.example.gamificationlibrary.levels](../index.md)/[LevelManager](index.md)/[LevelManager](-level-manager.md)

# LevelManager

[androidJvm]\
constructor(storage: [IGamificationStorage](../../com.example.gamificationlibrary.storage/-i-gamification-storage/index.md), levelDefinitions: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin.collections/-list/index.html)&lt;[LevelDefinition](../../com.example.gamificationlibrary.levels.data/-level-definition/index.md)&gt;, onEventPublished: ([GamificationEvent](../../com.example.gamificationlibrary.core/-gamification-event/index.md)) -&gt; [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin/-unit/index.html))

#### Parameters

androidJvm

| | |
|---|---|
| storage | The storage mechanism used to persist user level data. |
| levelDefinitions | A sorted list of all available level definitions, from lowest to highest level. |
| onEventPublished | A callback function to publish gamification events (e.g., LevelUp). |
