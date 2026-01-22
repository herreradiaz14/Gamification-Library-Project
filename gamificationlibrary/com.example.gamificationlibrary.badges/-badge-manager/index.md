//[gamificationlibrary](../../../index.md)/[com.example.gamificationlibrary.badges](../index.md)/[BadgeManager](index.md)

# BadgeManager

class [BadgeManager](index.md)(storage: [IGamificationStorage](../../com.example.gamificationlibrary.storage/-i-gamification-storage/index.md), badgeDefinitions: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin.collections/-list/index.html)&lt;[Badge](../../com.example.gamificationlibrary.badges.data/-badge/index.md)&gt;, onEventPublished: ([GamificationEvent](../../com.example.gamificationlibrary.core/-gamification-event/index.md)) -&gt; [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin/-unit/index.html))

Manages the definition, awarding, and tracking of badges for gamified entities.

#### Parameters

androidJvm

| | |
|---|---|
| storage | The storage mechanism for badge data. |
| badgeDefinitions | A list of all available badge definitions. |
| onEventPublished | A callback function to publish gamification events (e.g., BadgeUnlocked). |

## Constructors

| | |
|---|---|
| [BadgeManager](-badge-manager.md) | [androidJvm]<br>constructor(storage: [IGamificationStorage](../../com.example.gamificationlibrary.storage/-i-gamification-storage/index.md), badgeDefinitions: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin.collections/-list/index.html)&lt;[Badge](../../com.example.gamificationlibrary.badges.data/-badge/index.md)&gt;, onEventPublished: ([GamificationEvent](../../com.example.gamificationlibrary.core/-gamification-event/index.md)) -&gt; [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin/-unit/index.html)) |

## Functions

| Name | Summary |
|---|---|
| [awardBadge](award-badge.md) | [androidJvm]<br>fun [awardBadge](award-badge.md)(entityId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin/-string/index.html), badgeId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin/-string/index.html)): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin/-boolean/index.html)<br>Awards a specific badge to an entity. This method assumes the badge condition has already been met. |
| [checkBadgeConditions](check-badge-conditions.md) | [androidJvm]<br>fun [checkBadgeConditions](check-badge-conditions.md)(entityId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin/-string/index.html))<br>Checks all defined badge conditions for a given entity based on its current gamification state. This method is typically called after an event that might affect badge progress (e.g., points earned, tasks completed). |
| [getEarnedBadges](get-earned-badges.md) | [androidJvm]<br>fun [getEarnedBadges](get-earned-badges.md)(entityId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin/-string/index.html)): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin.collections/-list/index.html)&lt;[Badge](../../com.example.gamificationlibrary.badges.data/-badge/index.md)&gt;<br>Retrieves all badges earned by a specific entity. |
