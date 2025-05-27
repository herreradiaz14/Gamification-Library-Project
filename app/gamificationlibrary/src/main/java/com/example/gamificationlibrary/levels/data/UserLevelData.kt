package com.example.gamificationlibrary.levels.data

/**
 * Represents the level-related data for a single user or gamifiable entity.
 *
 * @property currentLevel The current level of the user.
 * @property progressToNextLevel A floating-point number representing progress within the current level (0.0 to 1.0).
 * This is typically calculated based on points towards the next level.
 * This field is primarily for UI display.
 */
data class UserLevelData(
    val currentLevel: Int = 0, // Starting level (e.g., 0 or 1)
    val progressToNextLevel: Float = 0.0f
)
