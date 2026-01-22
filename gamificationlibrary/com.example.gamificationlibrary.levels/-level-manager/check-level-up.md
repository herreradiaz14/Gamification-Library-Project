//[gamificationlibrary](../../../index.md)/[com.example.gamificationlibrary.levels](../index.md)/[LevelManager](index.md)/[checkLevelUp](check-level-up.md)

# checkLevelUp

[androidJvm]\
fun [checkLevelUp](check-level-up.md)(entityId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin/-string/index.html)): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin/-int/index.html)

Checks if a user has leveled up based on their current points. This method should be called whenever a user's points change.

#### Return

The new level of the user if they leveled up, otherwise their current level.

#### Parameters

androidJvm

| | |
|---|---|
| entityId | The ID of the entity (e.g., user) to check for level up. |
