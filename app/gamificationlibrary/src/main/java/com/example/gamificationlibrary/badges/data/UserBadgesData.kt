package com.example.gamificationlibrary.badges.data

/**
 * Represents the badges-related data for a single user or gamifiable entity.
 *
 * @property earnedBadges A list of [Badge] objects that the user has currently earned.
 */
data class UserBadgesData(
    val earnedBadges: List<Badge> = emptyList()
)