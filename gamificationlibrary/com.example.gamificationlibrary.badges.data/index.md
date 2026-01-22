//[gamificationlibrary](../../index.md)/[com.example.gamificationlibrary.badges.data](index.md)

# Package-level declarations

## Types

| Name | Summary |
|---|---|
| [Badge](-badge/index.md) | [androidJvm]<br>data class [Badge](-badge/index.md)(val id: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin/-string/index.html), val name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin/-string/index.html), val description: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin/-string/index.html), val iconResId: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin/-int/index.html), val rarity: [BadgeRarity](-badge-rarity/index.md) = BadgeRarity.COMMON, val condition: [BadgeCondition](../com.example.gamificationlibrary.badges/-badge-condition/index.md))<br>Represents a single badge definition within the gamification system. |
| [BadgeRarity](-badge-rarity/index.md) | [androidJvm]<br>enum [BadgeRarity](-badge-rarity/index.md) : [Enum](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin/-enum/index.html)&lt;[BadgeRarity](-badge-rarity/index.md)&gt; <br>Enum to define different levels of badge rarity or tier. |
| [UserBadgesData](-user-badges-data/index.md) | [androidJvm]<br>data class [UserBadgesData](-user-badges-data/index.md)(val earnedBadges: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin.collections/-list/index.html)&lt;[Badge](-badge/index.md)&gt; = emptyList())<br>Represents the badges-related data for a single user or gamifiable entity. |
