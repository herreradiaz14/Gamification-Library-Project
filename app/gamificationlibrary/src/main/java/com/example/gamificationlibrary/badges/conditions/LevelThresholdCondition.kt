package com.example.gamificationlibrary.badges.conditions

import com.example.gamificationlibrary.badges.BadgeCondition
import com.example.gamificationlibrary.core.data.UserGamificationData

/**
 * A [BadgeCondition] that is met when a user reaches or exceeds a specified level.
 *
 * @property levelThreshold The minimum level required to meet this condition.
 */
data class LevelThresholdCondition(val levelThreshold: Int) : BadgeCondition {
    override fun isMet(userData: UserGamificationData): Boolean {
        return userData.levelData.currentLevel >= levelThreshold
    }
}
