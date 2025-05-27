package com.example.gamificationlibrary.badges

import com.example.gamificationlibrary.badges.data.Badge
import com.example.gamificationlibrary.badges.data.UserBadgesData
import com.example.gamificationlibrary.core.GamificationEvent
import com.example.gamificationlibrary.core.data.UserGamificationData
import com.example.gamificationlibrary.storage.IGamificationStorage

/**
 * Manages the definition, awarding, and tracking of badges for gamified entities.
 *
 * @param storage The storage mechanism for badge data.
 * @param badgeDefinitions A list of all available badge definitions.
 * @param onEventPublished A callback function to publish gamification events (e.g., BadgeUnlocked).
 */
class BadgeManager(
    private val storage: IGamificationStorage,
    private val badgeDefinitions: List<Badge>,
    private val onEventPublished: (GamificationEvent) -> Unit
) {

    /**
     * Awards a specific badge to an entity.
     * This method assumes the badge condition has already been met.
     *
     * @param entityId The ID of the entity to award the badge to.
     * @param badgeId The ID of the badge to award.
     * @return True if the badge was successfully awarded (not already owned), false otherwise.
     */
    fun awardBadge(entityId: String, badgeId: String): Boolean {
        val userData = storage.loadUserGamificationData(entityId)
        val currentBadges = userData.badgesData.earnedBadges

        if (currentBadges.any { it.id == badgeId }) {
            // User already has this badge
            return false
        }

        val badgeToAward = badgeDefinitions.find { it.id == badgeId }
            ?: throw IllegalArgumentException("Badge with ID '$badgeId' not found.")

        val updatedBadgesData = userData.badgesData.copy(
            earnedBadges = currentBadges + badgeToAward
        )
        storage.saveUserGamificationData(userData.copy(badgesData = updatedBadgesData))

        onEventPublished(GamificationEvent.BadgeUnlocked(entityId, badgeId))
        return true
    }

    /**
     * Retrieves all badges earned by a specific entity.
     *
     * @param entityId The ID of the entity.
     * @return A list of [Badge] objects earned by the entity.
     */
    fun getEarnedBadges(entityId: String): List<Badge> {
        return storage.loadUserGamificationData(entityId).badgesData.earnedBadges
    }

    /**
     * Checks all defined badge conditions for a given entity based on its current gamification state.
     * This method is typically called after an event that might affect badge progress (e.g., points earned, tasks completed).
     *
     * @param entityId The ID of the entity to check conditions for.
     */
    fun checkBadgeConditions(entityId: String) {
        val userData = storage.loadUserGamificationData(entityId)
        val earnedBadgeIds = userData.badgesData.earnedBadges.map { it.id }.toSet()

        badgeDefinitions.forEach { badge ->
            if (badge.condition.isMet(userData) && badge.id !in earnedBadgeIds) {
                // If condition is met and user doesn't already have the badge, award it
                awardBadge(entityId, badge.id)
            }
        }
    }

    // You might add methods to get available badges, delete badges, etc.
}