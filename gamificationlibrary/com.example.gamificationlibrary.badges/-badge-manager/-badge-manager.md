//[gamificationlibrary](../../../index.md)/[com.example.gamificationlibrary.badges](../index.md)/[BadgeManager](index.md)/[BadgeManager](-badge-manager.md)

# BadgeManager

[androidJvm]\
constructor(storage: [IGamificationStorage](../../com.example.gamificationlibrary.storage/-i-gamification-storage/index.md), badgeDefinitions: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin.collections/-list/index.html)&lt;[Badge](../../com.example.gamificationlibrary.badges.data/-badge/index.md)&gt;, onEventPublished: ([GamificationEvent](../../com.example.gamificationlibrary.core/-gamification-event/index.md)) -&gt; [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin/-unit/index.html))

#### Parameters

androidJvm

| | |
|---|---|
| storage | The storage mechanism for badge data. |
| badgeDefinitions | A list of all available badge definitions. |
| onEventPublished | A callback function to publish gamification events (e.g., BadgeUnlocked). |
