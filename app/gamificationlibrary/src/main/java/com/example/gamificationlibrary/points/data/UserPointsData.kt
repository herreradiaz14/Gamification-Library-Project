package com.example.gamificationlibrary.points.data

/**
 * Represents the points-related data for a single user or gamifiable entity.
 *
 * @property totalPoints The current total number of points.
 * @property transactions A list of point transactions (optional, for history).
 */
data class UserPointsData(
    val totalPoints: Int = 0,
    val transactions: List<PointTransaction> = emptyList()
)
