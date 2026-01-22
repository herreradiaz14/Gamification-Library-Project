//[gamificationlibrary](../../../index.md)/[com.example.gamificationlibrary.core.data](../index.md)/[IGamificationStorage](index.md)

# IGamificationStorage

[androidJvm]\
interface [IGamificationStorage](index.md)

Interface defining the contract for storing and retrieving gamification data. Implementations can be in-memory, SQLite, remote API, etc.

## Functions

| Name | Summary |
|---|---|
| [loadUserGamificationData](load-user-gamification-data.md) | [androidJvm]<br>abstract fun [loadUserGamificationData](load-user-gamification-data.md)(entityId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin/-string/index.html)): [UserGamificationData](../-user-gamification-data/index.md)<br>Loads the complete gamification data for a specific entity. If no data exists, it should return a default or initialized [UserGamificationData](../-user-gamification-data/index.md) object. |
| [resetUserGamificationData](reset-user-gamification-data.md) | [androidJvm]<br>abstract fun [resetUserGamificationData](reset-user-gamification-data.md)(entityId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin/-string/index.html))<br>Resets all gamification data for a specific entity. |
| [saveUserGamificationData](save-user-gamification-data.md) | [androidJvm]<br>abstract fun [saveUserGamificationData](save-user-gamification-data.md)(data: [UserGamificationData](../-user-gamification-data/index.md))<br>Saves the complete gamification data for a specific entity. |
