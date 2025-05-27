package com.example.gamificationlibrary.badges.conditions

import com.example.gamificationlibrary.badges.BadgeCondition
import com.example.gamificationlibrary.core.data.UserGamificationData

/**
 * A [BadgeCondition] that is met when a user's total points reach or exceed a specified threshold.
 *
 * @property pointsThreshold The minimum number of points required to meet this condition.
 */
data class PointsThresholdCondition(val pointsThreshold: Int) : BadgeCondition {
    override fun isMet(userData: UserGamificationData): Boolean {
        return userData.pointsData.totalPoints >= pointsThreshold
    }
}
