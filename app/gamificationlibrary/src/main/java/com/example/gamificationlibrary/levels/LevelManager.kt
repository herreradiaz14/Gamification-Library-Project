package com.example.gamificationlibrary.levels

import com.example.gamificationlibrary.core.GamificationEvent
import com.example.gamificationlibrary.levels.data.LevelDefinition
import com.example.gamificationlibrary.storage.IGamificationStorage

/**
 * Manages the level progression for gamified entities based on accumulated points or other metrics.
 *
 * @param storage The storage mechanism used to persist user level data.
 * @param levelDefinitions A sorted list of all available level definitions, from lowest to highest level.
 * @param onEventPublished A callback function to publish gamification events (e.g., LevelUp).
 */
class LevelManager(
    private val storage: IGamificationStorage,
    private val levelDefinitions: List<LevelDefinition>,
    private val onEventPublished: (GamificationEvent) -> Unit
) {

    init {
        // Ensure level definitions are sorted by level for correct progression logic
        require(levelDefinitions.sortedBy { it.level } == levelDefinitions) {
            "Level definitions must be sorted by level in ascending order."
        }
        // Ensure there's a level 0 or 1 defined as the starting point.
        require(levelDefinitions.isNotEmpty() && levelDefinitions.first().level in listOf(0, 1)) {
            "Level definitions must start with level 0 or 1."
        }
    }

    /**
     * Checks if a user has leveled up based on their current points.
     * This method should be called whenever a user's points change.
     *
     * @param entityId The ID of the entity (e.g., user) to check for level up.
     * @return The new level of the user if they leveled up, otherwise their current level.
     */
    fun checkLevelUp(entityId: String): Int {
        val userData = storage.loadUserGamificationData(entityId)
        val currentPoints = userData.pointsData.totalPoints
        val currentLevel = userData.levelData.currentLevel

        // Find the highest level the user qualifies for with their current points
        val newLevelDefinition = levelDefinitions
            .lastOrNull { it.pointsRequired <= currentPoints }

        if (newLevelDefinition != null && newLevelDefinition.level > currentLevel) {
            // User has leveled up!
            val updatedLevelData = userData.levelData.copy(
                currentLevel = newLevelDefinition.level,
                progressToNextLevel = calculateProgress(newLevelDefinition.level, currentPoints)
            )
            storage.saveUserGamificationData(userData.copy(levelData = updatedLevelData))

            // Publish LevelUp event
            onEventPublished(GamificationEvent.LevelUp(entityId, newLevelDefinition.level))

            println("User $entityId leveled up from $currentLevel to ${newLevelDefinition.level}!")
            return newLevelDefinition.level
        } else {
            // No level up, but update progress if points changed within current level
            val updatedLevelData = userData.levelData.copy(
                progressToNextLevel = calculateProgress(currentLevel, currentPoints)
            )
            storage.saveUserGamificationData(userData.copy(levelData = updatedLevelData))
        }
        return currentLevel // No level up or progress updated
    }

    /**
     * Retrieves the current level of a specific user.
     *
     * @param entityId The ID of the entity (e.g., user).
     * @return The current level of the user.
     */
    fun getCurrentLevel(entityId: String): Int {
        return storage.loadUserGamificationData(entityId).levelData.currentLevel
    }

    /**
     * Retrieves the current level progress of a specific user.
     *
     * @param entityId The ID of the entity (e.g., user).
     * @return A float representing the progress (0.0 to 1.0) within the current level.
     */
    fun getLevelProgress(entityId: String): Float {
        return storage.loadUserGamificationData(entityId).levelData.progressToNextLevel
    }

    /**
     * Retrieves the total points required to reach the next level beyond the current level.
     *
     * @param currentLevel The user's current level.
     * @return The total points required for the next level (currentLevel + 1). Returns -1 if the user is at the maximum defined level.
     */
    fun getNextLevelThreshold(currentLevel: Int): Int {
        val nextLevelDef = levelDefinitions.find { it.level == currentLevel + 1 }
        // If the next level definition is found, return its required points; otherwise, return -1 (max level)
        return nextLevelDef?.pointsRequired ?: -1
    }

    /**
     * Calculates the progress within the current level.
     *
     * @param currentLevel The user's current level.
     * @param currentPoints The user's total points.
     * @return A float from 0.0 to 1.0 representing progress.
     */
    private fun calculateProgress(currentLevel: Int, currentPoints: Int): Float {
        val currentLevelDef = levelDefinitions.find { it.level == currentLevel }
        val nextLevelDef = levelDefinitions.find { it.level == currentLevel + 1 }

        return if (currentLevelDef == null) {
            0.0f // Should not happen if levels start from 0/1
        } else if (nextLevelDef == null) {
            1.0f // User is at the highest defined level
        } else {
            val pointsForCurrentLevel = currentLevelDef.pointsRequired
            val pointsToNextLevel = nextLevelDef.pointsRequired - pointsForCurrentLevel
            val pointsEarnedInCurrentLevel = currentPoints - pointsForCurrentLevel

            if (pointsToNextLevel <= 0) { // Avoid division by zero if levels are misconfigured
                1.0f
            } else {
                (pointsEarnedInCurrentLevel.toFloat() / pointsToNextLevel).coerceIn(0.0f, 1.0f)
            }
        }
    }
}