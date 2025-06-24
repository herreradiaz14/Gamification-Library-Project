package com.example.gamificationlibrary.leaderboard

import com.example.gamificationlibrary.core.data.UserGamificationData
import com.example.gamificationlibrary.leaderboard.data.LeaderboardCriteria
import com.example.gamificationlibrary.leaderboard.data.LeaderboardEntry
import com.example.gamificationlibrary.storage.IGamificationStorage

class LeaderboardManager(private val storage: IGamificationStorage) {

    /**
     * Builds and optionally persists a leaderboard sorted by the selected criteria.
     * Updates each user's leaderboard rank if [updateUserData] is true.
     */
    fun generateAndUpdateLeaderboard(
        criteria: LeaderboardCriteria = LeaderboardCriteria.TOTAL_POINTS,
        updateUserData: Boolean = true
    ): List<LeaderboardEntry> {
        val allUserData = loadAllGamificationData()

        val entries = allUserData.map {
            val score = when (criteria) {
                LeaderboardCriteria.TOTAL_POINTS -> it.pointsData.totalPoints
                LeaderboardCriteria.CURRENT_LEVEL -> it.levelData.currentLevel
                LeaderboardCriteria.CUSTOM -> customScore(it)
            }
            LeaderboardEntry(entityId = it.entityId, displayName = it.entityId, score = score)
        }.sortedByDescending { it.score }

        if (updateUserData) {
            entries.forEachIndexed { index, entry ->
                val data = storage.loadUserGamificationData(entry.entityId)
                storage.saveUserGamificationData(
                    data.copy(leaderboardRank = index + 1)
                )
            }
        }

        return entries
    }

    private fun customScore(data: UserGamificationData): Int {
        // Ejemplo: puntos + nivel * 10
        return data.pointsData.totalPoints + data.levelData.currentLevel * 10
    }

    /**
     * Load all users' gamification data. In this example, assumes InMemory supports it.
     * If not, this method should be adapted per storage implementation.
     */
    private fun loadAllGamificationData(): List<UserGamificationData> {
        if (storage is com.example.gamificationlibrary.storage.inmemory.InMemoryGamificationStorage) {
            return storage.getAllUsers()
        }
        throw UnsupportedOperationException("Bulk loading is not supported for this storage type")
    }
}
