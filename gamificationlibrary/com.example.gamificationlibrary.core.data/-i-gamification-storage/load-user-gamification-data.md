//[gamificationlibrary](../../../index.md)/[com.example.gamificationlibrary.core.data](../index.md)/[IGamificationStorage](index.md)/[loadUserGamificationData](load-user-gamification-data.md)

# loadUserGamificationData

[androidJvm]\
abstract fun [loadUserGamificationData](load-user-gamification-data.md)(entityId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin/-string/index.html)): [UserGamificationData](../-user-gamification-data/index.md)

Loads the complete gamification data for a specific entity. If no data exists, it should return a default or initialized [UserGamificationData](../-user-gamification-data/index.md) object.

#### Return

The [UserGamificationData](../-user-gamification-data/index.md) for the entity.

#### Parameters

androidJvm

| | |
|---|---|
| entityId | The ID of the gamifiable entity. |
