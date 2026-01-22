//[gamificationlibrary](../../../index.md)/[com.example.gamificationlibrary.storage.inmemory](../index.md)/[InMemoryGamificationStorage](index.md)

# InMemoryGamificationStorage

[androidJvm]\
class [InMemoryGamificationStorage](index.md) : [IGamificationStorage](../../com.example.gamificationlibrary.storage/-i-gamification-storage/index.md)

An in-memory implementation of [IGamificationStorage](../../com.example.gamificationlibrary.storage/-i-gamification-storage/index.md) for testing or simple use cases. Data stored here is not persistent across application restarts.

## Constructors

| | |
|---|---|
| [InMemoryGamificationStorage](-in-memory-gamification-storage.md) | [androidJvm]<br>constructor() |

## Functions

| Name | Summary |
|---|---|
| [getAllUsers](get-all-users.md) | [androidJvm]<br>fun [getAllUsers](get-all-users.md)(): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin.collections/-list/index.html)&lt;[UserGamificationData](../../com.example.gamificationlibrary.core.data/-user-gamification-data/index.md)&gt; |
| [loadUserGamificationData](load-user-gamification-data.md) | [androidJvm]<br>open override fun [loadUserGamificationData](load-user-gamification-data.md)(entityId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin/-string/index.html)): [UserGamificationData](../../com.example.gamificationlibrary.core.data/-user-gamification-data/index.md)<br>Loads the complete gamification data for a specific entity. If no data exists, it should return a default or initialized [UserGamificationData](../../com.example.gamificationlibrary.core.data/-user-gamification-data/index.md) object. |
| [resetUserGamificationData](reset-user-gamification-data.md) | [androidJvm]<br>open override fun [resetUserGamificationData](reset-user-gamification-data.md)(entityId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin/-string/index.html))<br>Resets all gamification data for a specific entity. |
| [saveUserGamificationData](save-user-gamification-data.md) | [androidJvm]<br>open override fun [saveUserGamificationData](save-user-gamification-data.md)(data: [UserGamificationData](../../com.example.gamificationlibrary.core.data/-user-gamification-data/index.md))<br>Saves the complete gamification data for a specific entity. |
