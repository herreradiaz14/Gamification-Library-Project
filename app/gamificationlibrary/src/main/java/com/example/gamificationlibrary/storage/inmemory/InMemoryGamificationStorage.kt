package com.example.gamificationlibrary.storage.inmemory

import com.example.gamificationlibrary.badges.data.UserBadgesData
import com.example.gamificationlibrary.core.data.UserGamificationData
import com.example.gamificationlibrary.levels.data.UserLevelData
import com.example.gamificationlibrary.points.data.UserPointsData
import com.example.gamificationlibrary.storage.IGamificationStorage
import java.util.concurrent.ConcurrentHashMap

/**
 * An in-memory implementation of [IGamificationStorage] for testing or simple use cases.
 * Data stored here is not persistent across application restarts.
 */
class InMemoryGamificationStorage : IGamificationStorage {


    // Stores gamification data per entityId
    private val storage: ConcurrentHashMap<String, UserGamificationData> = ConcurrentHashMap()

    override fun loadUserGamificationData(entityId: String): UserGamificationData {
        // Return existing data or initialize with default empty data
        return storage.getOrPut(entityId) {
            UserGamificationData(
                entityId = entityId,
                pointsData = UserPointsData(),
                badgesData = UserBadgesData(),
                levelData = UserLevelData()
                // Initialize other data types here
            )
        }
    }

    override fun saveUserGamificationData(data: UserGamificationData) {
        storage[data.entityId] = data
    }

    override fun resetUserGamificationData(entityId: String) {
        storage.remove(entityId)
    }

    fun getAllUsers(): List<UserGamificationData> = storage.values.toList()
}