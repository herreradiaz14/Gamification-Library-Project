package com.example.gamificationlibrary.core

/**
 * Sealed class representing various events that can trigger gamification logic.
 * Extend this sealed class to define specific events like points earned,
 * tasks completed, badges unlocked, etc.
 */
sealed class GamificationEvent {
    /**
     * The ID of the user or entity associated with this event.
     */
    abstract val entityId: String

    /**
     * Timestamp when the event occurred.
     */
    val timestamp: Long = System.currentTimeMillis()

    data class PointsEarned(override val entityId: String, val amount: Int, val reason: String) : GamificationEvent()
    data class TaskCompleted(override val entityId: String, val taskId: String) : GamificationEvent()
    data class LevelUp(override val entityId: String, val newLevel: Int) : GamificationEvent()
    data class BadgeUnlocked(override val entityId: String, val badgeId: String) : GamificationEvent()
    // Add more specific event types as needed
}