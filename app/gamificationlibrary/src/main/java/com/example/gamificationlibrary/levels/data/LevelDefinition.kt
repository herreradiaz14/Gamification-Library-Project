package com.example.gamificationlibrary.levels.data

/**
 * Defines the properties of a single level in the gamification system.
 *
 * @property level The unique numerical identifier for this level (e.g., 1, 2, 3...).
 * @property name The display name of the level (e.g., "Novice", "Apprentice", "Master").
 * @property pointsRequired The total number of points required to reach or exceed this level.
 * @property description A brief description of what this level signifies.
 * @property rewards A list of rewards earned upon reaching this level (optional).
 * This would typically be a list of Reward objects or IDs.
 */
data class LevelDefinition(
    val level: Int,
    val name: String,
    val pointsRequired: Int,
    val description: String = "",
    val rewards: List<String> = emptyList() // Example: List of Reward IDs
)
