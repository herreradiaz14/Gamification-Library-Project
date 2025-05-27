package com.example.gamificationlibrary.badges.data

import com.example.gamificationlibrary.badges.BadgeCondition
import com.example.gamificationlibrary.badges.conditions.PointsThresholdCondition // Import for example usage

/**
 * Represents a single badge definition within the gamification system.
 *
 * @property id A unique identifier for the badge (e.g., "early_bird", "master_contributor").
 * @property name The display name of the badge (e.g., "Early Bird", "Master Contributor").
 * @property description A brief description of what the badge signifies and how it's earned.
 * @property iconResId The resource ID for the badge's icon (e.g., R.drawable.ic_badge_star).
 * This assumes an Android context, but can be a URL or path for other platforms.
 * @property rarity The rarity or tier of the badge (e.g., Bronze, Silver, Gold, Legendary).
 * @property condition The [com.example.gamificationlibrary.badges.conditions.BadgeCondition] that must be met for this badge to be awarded.
 */
data class Badge(
    val id: String,
    val name: String,
    val description: String,
    val iconResId: Int, // Or String for a URL/path if not Android specific
    val rarity: BadgeRarity = BadgeRarity.COMMON,
    val condition: BadgeCondition
)

/**
 * Enum to define different levels of badge rarity or tier.
 */
enum class BadgeRarity {
    COMMON,
    UNCOMMON,
    RARE,
    EPIC,
    LEGENDARY
}

/*
// Example of how you might define badges in your application
object DefaultBadges {
    val ALL_BADGES = listOf(
        Badge(
            id = "first_task_completed",
            name = "First Step",
            description = "Complete your very first task.",
            iconResId = com.example.gamificationlibrary.R.drawable.ic_badge_first_step, // Placeholder
            rarity = BadgeRarity.COMMON,
            condition = TaskCountCondition(1)
        ),
        Badge(
            id = "points_rookie",
            name = "Point Rookie",
            description = "Earned 100 points.",
            iconResId = com.example.gamificationlibrary.R.drawable.ic_badge_points_rookie, // Placeholder
            rarity = BadgeRarity.COMMON,
            condition = PointsThresholdCondition(100)
        ),
        Badge(
            id = "level_5_achiever",
            name = "Level 5 Achiever",
            description = "Reached Level 5.",
            iconResId = com.example.gamificationlibrary.R.drawable.ic_badge_level_5, // Placeholder
            rarity = BadgeRarity.UNCOMMON,
            condition = LevelThresholdCondition(5)
        )
        // Add more badges here
    )
}
*/
