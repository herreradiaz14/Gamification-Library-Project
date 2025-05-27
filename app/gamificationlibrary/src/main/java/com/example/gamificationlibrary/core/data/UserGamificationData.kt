package com.example.gamificationlibrary.core.data

import com.example.gamificationlibrary.badges.data.UserBadgesData
import com.example.gamificationlibrary.levels.data.UserLevelData
import com.example.gamificationlibrary.points.data.UserPointsData
// Import other data types as they are created

/**
 * Represents the comprehensive gamification data for a single user or gamifiable entity.
 * This acts as a single source of truth for an entity's gamification state.
 *
 * @property entityId The unique ID of the gamifiable entity (e.g., user ID).
 * @property pointsData The user's points data.
 * @property badgesData The user's badge data.
 * @property levelData The user's level data.
 * // Add other gamification data types here
 */
data class UserGamificationData(
    val entityId: String,
    val pointsData: UserPointsData,
    val badgesData: UserBadgesData,
    val levelData: UserLevelData
    // Add more gamification data sub-objects here (e.g., rewards, leaderboard stats)
)