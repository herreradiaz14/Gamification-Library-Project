//[gamificationlibrary](../../index.md)/[com.example.gamificationlibrary.badges](index.md)

# Package-level declarations

## Types

| Name | Summary |
|---|---|
| [BadgeCondition](-badge-condition/index.md) | [androidJvm]<br>interface [BadgeCondition](-badge-condition/index.md)<br>Interface for defining conditions that must be met for a badge to be awarded. Implementations of this interface will determine when a user is eligible for a specific badge. |
| [BadgeManager](-badge-manager/index.md) | [androidJvm]<br>class [BadgeManager](-badge-manager/index.md)(storage: [IGamificationStorage](../com.example.gamificationlibrary.storage/-i-gamification-storage/index.md), badgeDefinitions: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin.collections/-list/index.html)&lt;[Badge](../com.example.gamificationlibrary.badges.data/-badge/index.md)&gt;, onEventPublished: ([GamificationEvent](../com.example.gamificationlibrary.core/-gamification-event/index.md)) -&gt; [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin/-unit/index.html))<br>Manages the definition, awarding, and tracking of badges for gamified entities. |
