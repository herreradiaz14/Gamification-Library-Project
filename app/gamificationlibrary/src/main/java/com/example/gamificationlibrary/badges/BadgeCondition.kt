package com.example.gamificationlibrary.badges

import com.example.gamificationlibrary.core.data.UserGamificationData

/**
 * Interface for defining conditions that must be met for a badge to be awarded.
 * Implementations of this interface will determine when a user is eligible for a specific badge.
 */
interface BadgeCondition {
    /**
     * Evaluates if the condition for this badge is met based on the current
     * gamification data of a user.
     *
     * @param userData The current [UserGamificationData] of the entity being evaluated.
     * @return `true` if the condition is met, `false` otherwise.
     */
    fun isMet(userData: UserGamificationData): Boolean
}