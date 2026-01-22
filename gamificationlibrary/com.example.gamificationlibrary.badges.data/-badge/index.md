//[gamificationlibrary](../../../index.md)/[com.example.gamificationlibrary.badges.data](../index.md)/[Badge](index.md)

# Badge

[androidJvm]\
data class [Badge](index.md)(val id: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin/-string/index.html), val name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin/-string/index.html), val description: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin/-string/index.html), val iconResId: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin/-int/index.html), val rarity: [BadgeRarity](../-badge-rarity/index.md) = BadgeRarity.COMMON, val condition: [BadgeCondition](../../com.example.gamificationlibrary.badges/-badge-condition/index.md))

Represents a single badge definition within the gamification system.

## Constructors

| | |
|---|---|
| [Badge](-badge.md) | [androidJvm]<br>constructor(id: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin/-string/index.html), name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin/-string/index.html), description: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin/-string/index.html), iconResId: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin/-int/index.html), rarity: [BadgeRarity](../-badge-rarity/index.md) = BadgeRarity.COMMON, condition: [BadgeCondition](../../com.example.gamificationlibrary.badges/-badge-condition/index.md)) |

## Properties

| Name | Summary |
|---|---|
| [condition](condition.md) | [androidJvm]<br>val [condition](condition.md): [BadgeCondition](../../com.example.gamificationlibrary.badges/-badge-condition/index.md)<br>The com.example.gamificationlibrary.badges.conditions.BadgeCondition that must be met for this badge to be awarded. |
| [description](description.md) | [androidJvm]<br>val [description](description.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin/-string/index.html)<br>A brief description of what the badge signifies and how it's earned. |
| [iconResId](icon-res-id.md) | [androidJvm]<br>val [iconResId](icon-res-id.md): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin/-int/index.html)<br>The resource ID for the badge's icon (e.g., R.drawable.ic_badge_star). This assumes an Android context, but can be a URL or path for other platforms. |
| [id](id.md) | [androidJvm]<br>val [id](id.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin/-string/index.html)<br>A unique identifier for the badge (e.g., &quot;early_bird&quot;, &quot;master_contributor&quot;). |
| [name](name.md) | [androidJvm]<br>val [name](name.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin/-string/index.html)<br>The display name of the badge (e.g., &quot;Early Bird&quot;, &quot;Master Contributor&quot;). |
| [rarity](rarity.md) | [androidJvm]<br>val [rarity](rarity.md): [BadgeRarity](../-badge-rarity/index.md)<br>The rarity or tier of the badge (e.g., Bronze, Silver, Gold, Legendary). |
