//[gamificationlibrary](../../../index.md)/[com.example.gamificationlibrary.badges](../index.md)/[BadgeManager](index.md)/[awardBadge](award-badge.md)

# awardBadge

[androidJvm]\
fun [awardBadge](award-badge.md)(entityId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin/-string/index.html), badgeId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin/-string/index.html)): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin/-boolean/index.html)

Awards a specific badge to an entity. This method assumes the badge condition has already been met.

#### Return

True if the badge was successfully awarded (not already owned), false otherwise.

#### Parameters

androidJvm

| | |
|---|---|
| entityId | The ID of the entity to award the badge to. |
| badgeId | The ID of the badge to award. |
