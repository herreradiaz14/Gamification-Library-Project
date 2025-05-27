package com.example.gamificationlibrary.storage

import com.example.gamificationlibrary.core.data.UserGamificationData

/**
 * Interface defining the contract for storing and retrieving gamification data.
 * Implementations can be in-memory, SQLite, remote API, etc.
 */
interface IGamificationStorage {
    /**
     * Loads the complete gamification data for a specific entity.
     * If no data exists, it should return a default or initialized [UserGamificationData] object.
     *
     * @param entityId The ID of the gamifiable entity.
     * @return The [UserGamificationData] for the entity.
     */
    fun loadUserGamificationData(entityId: String): UserGamificationData

    /**
     * Saves the complete gamification data for a specific entity.
     *
     * @param data The [UserGamificationData] object to save.
     */
    fun saveUserGamificationData(data: UserGamificationData)

    /**
     * Resets all gamification data for a specific entity.
     *
     * @param entityId The ID of the gamifiable entity.
     */
    fun resetUserGamificationData(entityId: String)
}