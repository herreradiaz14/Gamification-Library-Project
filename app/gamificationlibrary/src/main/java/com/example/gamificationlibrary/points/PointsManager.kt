package com.example.gamificationlibrary.points

import com.example.gamificationlibrary.core.GamificationEvent
import com.example.gamificationlibrary.points.data.PointTransaction
import com.example.gamificationlibrary.points.data.UserPointsData
import com.example.gamificationlibrary.storage.IGamificationStorage

/**
 * Manages the accumulation, deduction, and retrieval of points for gamified entities.
 *
 * @param storage The storage mechanism used to persist user points data.
 * @param onEventPublished A callback function to publish gamification events (e.g., PointsEarned).
 */
class PointsManager(
    private val storage: IGamificationStorage,
    private val onEventPublished: (GamificationEvent) -> Unit
) {

    /**
     * Adds points to a specific user.
     *
     * @param entityId The ID of the entity (e.g., user) to add points to.
     * @param amount The number of points to add. Must be positive.
     * @param reason A description of why the points were awarded.
     * @return The updated total points for the entity.
     * @throws IllegalArgumentException if amount is not positive.
     */
    fun addPoints(entityId: String, amount: Int, reason: String): Int {
        require(amount > 0) { "Amount must be positive." }

        val userData = storage.loadUserGamificationData(entityId)
        val currentPoints = userData.pointsData.totalPoints
        val newPoints = currentPoints + amount

        val updatedPointsData = userData.pointsData.copy(
            totalPoints = newPoints,
            transactions = userData.pointsData.transactions + PointTransaction(amount, reason, System.currentTimeMillis())
        )
        storage.saveUserGamificationData(userData.copy(pointsData = updatedPointsData))

        // Publish an event indicating points were earned
        onEventPublished(GamificationEvent.PointsEarned(entityId, amount, reason))

        return newPoints
    }

    /**
     * Deducts points from a specific user.
     *
     * @param entityId The ID of the entity (e.g., user) to deduct points from.
     * @param amount The number of points to deduct. Must be positive.
     * @param reason A description of why the points were deducted.
     * @return The updated total points for the entity.
     * @throws IllegalArgumentException if amount is not positive or if deduction would result in negative points.
     */
    fun deductPoints(entityId: String, amount: Int, reason: String): Int {
        require(amount > 0) { "Amount must be positive." }

        val userData = storage.loadUserGamificationData(entityId)
        val currentPoints = userData.pointsData.totalPoints
        require(currentPoints >= amount) { "Cannot deduct more points than available." }

        val newPoints = currentPoints - amount
        val updatedPointsData = userData.pointsData.copy(
            totalPoints = newPoints,
            transactions = userData.pointsData.transactions + PointTransaction(-amount, reason, System.currentTimeMillis())
        )
        storage.saveUserGamificationData(userData.copy(pointsData = updatedPointsData))
        return newPoints
    }

    /**
     * Retrieves the current total points for a specific user.
     *
     * @param entityId The ID of the entity (e.g., user) to retrieve points for.
     * @return The total points.
     */
    fun getPoints(entityId: String): Int {
        return storage.loadUserGamificationData(entityId).pointsData.totalPoints
    }

    // You might add methods to get point history, specific rule processing, etc.
}