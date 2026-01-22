//[gamificationlibrary](../../../index.md)/[com.example.gamificationlibrary.storage](../index.md)/[IGamificationStorage](index.md)

# IGamificationStorage

interface [IGamificationStorage](index.md)

Interface defining the contract for storing and retrieving gamification data. Implementations can be in-memory, SQLite, remote API, etc.

#### Inheritors

| |
|---|
| [InMemoryGamificationStorage](../../com.example.gamificationlibrary.storage.inmemory/-in-memory-gamification-storage/index.md) |

## Functions

| Name | Summary |
|---|---|
| [loadUserGamificationData](load-user-gamification-data.md) | [androidJvm]<br>abstract fun [loadUserGamificationData](load-user-gamification-data.md)(entityId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin/-string/index.html)): [UserGamificationData](../../com.example.gamificationlibrary.core.data/-user-gamification-data/index.md)<br>Loads the complete gamification data for a specific entity. If no data exists, it should return a default or initialized [UserGamificationData](../../com.example.gamificationlibrary.core.data/-user-gamification-data/index.md) object. |
| [resetUserGamificationData](reset-user-gamification-data.md) | [androidJvm]<br>abstract fun [resetUserGamificationData](reset-user-gamification-data.md)(entityId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin/-string/index.html))<br>Resets all gamification data for a specific entity. |
| [saveUserGamificationData](save-user-gamification-data.md) | [androidJvm]<br>abstract fun [saveUserGamificationData](save-user-gamification-data.md)(data: [UserGamificationData](../../com.example.gamificationlibrary.core.data/-user-gamification-data/index.md))<br>Saves the complete gamification data for a specific entity. |
