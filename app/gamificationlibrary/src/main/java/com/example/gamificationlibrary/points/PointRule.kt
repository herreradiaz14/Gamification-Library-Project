package com.example.gamificationlibrary.points

import com.example.gamificationlibrary.core.GamificationEvent

/**
 * Interface for defining rules that award points based on specific gamification events.
 */
interface PointRule {
    /**
     * Evaluates if this rule applies to the given event and returns the points to be awarded.
     *
     * @param event The gamification event to evaluate.
     * @return The number of points to award, or 0 if the rule does not apply or no points are awarded.
     */
    fun evaluate(event: GamificationEvent): Int
}

// Example implementation of a simple rule
class TaskCompletionPointRule(private val pointsPerTask: Int) : PointRule {
    override fun evaluate(event: GamificationEvent): Int {
        return if (event is GamificationEvent.TaskCompleted) {
            pointsPerTask
        } else {
            0
        }
    }
}