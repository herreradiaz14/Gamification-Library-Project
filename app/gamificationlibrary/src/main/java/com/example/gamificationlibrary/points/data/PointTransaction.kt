package com.example.gamificationlibrary.points.data

/**
 * Represents a single transaction of points (either earned or deducted).
 *
 * @property amount The amount of points for this transaction (positive for earned, negative for deducted).
 * @property reason A description of the transaction.
 * @property timestamp The Unix timestamp (in milliseconds) when the transaction occurred.
 */
data class PointTransaction(
    val amount: Int,
    val reason: String,
    val timestamp: Long
)