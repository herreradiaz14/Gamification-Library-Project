//[gamificationlibrary](../../../index.md)/[com.example.gamificationlibrary.levels.data](../index.md)/[UserLevelData](index.md)

# UserLevelData

[androidJvm]\
data class [UserLevelData](index.md)(val currentLevel: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin/-int/index.html) = 0, val progressToNextLevel: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin/-float/index.html) = 0.0f)

Represents the level-related data for a single user or gamifiable entity.

## Constructors

| | |
|---|---|
| [UserLevelData](-user-level-data.md) | [androidJvm]<br>constructor(currentLevel: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin/-int/index.html) = 0, progressToNextLevel: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin/-float/index.html) = 0.0f) |

## Properties

| Name | Summary |
|---|---|
| [currentLevel](current-level.md) | [androidJvm]<br>val [currentLevel](current-level.md): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin/-int/index.html) = 0<br>The current level of the user. |
| [progressToNextLevel](progress-to-next-level.md) | [androidJvm]<br>val [progressToNextLevel](progress-to-next-level.md): [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin/-float/index.html) = 0.0f<br>A floating-point number representing progress within the current level (0.0 to 1.0). This is typically calculated based on points towards the next level. This field is primarily for UI display. |
