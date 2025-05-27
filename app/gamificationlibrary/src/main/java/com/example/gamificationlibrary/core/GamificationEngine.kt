package com.example.gamificationlibrary.core

import com.example.gamificationlibrary.badges.BadgeManager
import com.example.gamificationlibrary.levels.LevelManager
import com.example.gamificationlibrary.points.PointsManager

/**
 * The central orchestrator for processing gamification events and
 * updating the state of various gamification components.
 * It acts as a bridge between application actions and gamification logic.
 *
 * @param pointsManager The manager responsible for points logic.
 * @param badgeManager The manager responsible for badge logic.
 * @param levelManager The manager responsible for level logic.
 * // ... inject other managers as they are created
 */
class GamificationEngine(
    private val pointsManager: PointsManager,
    private val badgeManager: BadgeManager,
    private val levelManager: LevelManager
    // Add other managers here
) {

    /**
     * Processes a gamification event, dispatching it to the relevant managers.
     *
     * @param event The gamification event to process.
     */
    fun processEvent(event: GamificationEvent) {
        when (event) {
            is GamificationEvent.PointsEarned -> {
                pointsManager.addPoints(event.entityId, event.amount, event.reason)
                // After points are added, check for level progression
                levelManager.checkLevelUp(event.entityId)
                // Also check for badge conditions that depend on points
                badgeManager.checkBadgeConditions(event.entityId)
            }
            is GamificationEvent.TaskCompleted -> {
                // Example: award points for task completion
                pointsManager.addPoints(event.entityId, 10, "Completed Task: ${event.taskId}")
                levelManager.checkLevelUp(event.entityId) // Task completion might also contribute to level
                badgeManager.checkBadgeConditions(event.entityId) // Check badges for task completion
            }
            is GamificationEvent.LevelUp -> {
                // Potentially trigger events like awarding a badge for reaching a new level
                badgeManager.checkBadgeConditions(event.entityId)
                println("User ${event.entityId} leveled up to ${event.newLevel}!")
            }
            is GamificationEvent.BadgeUnlocked -> {
                // Potentially show a celebratory UI or log
                println("User ${event.entityId} unlocked badge: ${event.badgeId}!")
            }
            // Handle other event types
        }
    }
}