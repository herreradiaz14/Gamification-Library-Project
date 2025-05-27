package com.example.gamificationlibrary.core

/**
 * Interface representing an entity that can be gamified within the system.
 * Any object that interacts with gamification mechanics (e.g., User, Task)
 * should implement this interface to provide a unique identifier.
 */
interface GamifiableEntity {
    /**
     * A unique identifier for the gamifiable entity.
     */
    val id: String
}