package com.example.gamificationlibrary.badges.conditions

import com.example.gamificationlibrary.badges.BadgeCondition
import com.example.gamificationlibrary.core.data.UserGamificationData

/**
 * A [BadgeCondition] that is met when a user has completed a specified number of tasks.
 * This condition requires that task completion count is part of [UserGamificationData].
 *
 * @property taskCount The minimum number of tasks required to meet this condition.
 */
data class TaskCountCondition(val taskCount: Int) : BadgeCondition {
    override fun isMet(userData: UserGamificationData): Boolean {
        // TODO: This assumes you will add a `tasksCompleted` count or similar
        // to `UserGamificationData` or a new data type like `UserTaskData`.
        // For now, it's a placeholder. You'll need to modify UserGamificationData
        // and its sub-data classes to include task completion data.
        // Example: return userData.taskData.completedTaskCount >= taskCount
        return false // Placeholder until task tracking is implemented
    }
}