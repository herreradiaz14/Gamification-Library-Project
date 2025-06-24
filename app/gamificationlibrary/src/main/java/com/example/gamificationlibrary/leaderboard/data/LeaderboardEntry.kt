package com.example.gamificationlibrary.leaderboard.data

/**
 * Represents a user's entry in the leaderboard.
 *
 * @property entityId Unique identifier of the user.
 * @property displayName Optional display name for UI.
 * @property score The score used for ranking (typically points).
 */
data class LeaderboardEntry(
    val entityId: String,
    val displayName: String,
    val score: Int
)