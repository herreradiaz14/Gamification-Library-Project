//[gamificationlibrary](../../index.md)/[com.example.gamificationlibrary.levels.data](index.md)

# Package-level declarations

## Types

| Name | Summary |
|---|---|
| [LevelDefinition](-level-definition/index.md) | [androidJvm]<br>data class [LevelDefinition](-level-definition/index.md)(val level: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin/-int/index.html), val name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin/-string/index.html), val pointsRequired: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin/-int/index.html), val description: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin/-string/index.html) = &quot;&quot;, val rewards: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin.collections/-list/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin/-string/index.html)&gt; = emptyList())<br>Defines the properties of a single level in the gamification system. |
| [UserLevelData](-user-level-data/index.md) | [androidJvm]<br>data class [UserLevelData](-user-level-data/index.md)(val currentLevel: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin/-int/index.html) = 0, val progressToNextLevel: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin/-float/index.html) = 0.0f)<br>Represents the level-related data for a single user or gamifiable entity. |
