//[gamificationlibrary](../../index.md)/[com.example.gamificationlibrary.core](index.md)

# Package-level declarations

## Types

| Name | Summary |
|---|---|
| [GamifiableEntity](-gamifiable-entity/index.md) | [androidJvm]<br>interface [GamifiableEntity](-gamifiable-entity/index.md)<br>Interface representing an entity that can be gamified within the system. Any object that interacts with gamification mechanics (e.g., User, Task) should implement this interface to provide a unique identifier. |
| [GamificationEngine](-gamification-engine/index.md) | [androidJvm]<br>class [GamificationEngine](-gamification-engine/index.md)(pointsManager: [PointsManager](../com.example.gamificationlibrary.points/-points-manager/index.md), badgeManager: [BadgeManager](../com.example.gamificationlibrary.badges/-badge-manager/index.md), levelManager: [LevelManager](../com.example.gamificationlibrary.levels/-level-manager/index.md))<br>The central orchestrator for processing gamification events and updating the state of various gamification components. It acts as a bridge between application actions and gamification logic. |
| [GamificationEvent](-gamification-event/index.md) | [androidJvm]<br>sealed class [GamificationEvent](-gamification-event/index.md)<br>Sealed class representing various events that can trigger gamification logic. Extend this sealed class to define specific events like points earned, tasks completed, badges unlocked, etc. |
