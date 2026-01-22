//[gamificationlibrary](../../../index.md)/[com.example.gamificationlibrary.core](../index.md)/[GamificationEngine](index.md)

# GamificationEngine

class [GamificationEngine](index.md)(pointsManager: [PointsManager](../../com.example.gamificationlibrary.points/-points-manager/index.md), badgeManager: [BadgeManager](../../com.example.gamificationlibrary.badges/-badge-manager/index.md), levelManager: [LevelManager](../../com.example.gamificationlibrary.levels/-level-manager/index.md))

The central orchestrator for processing gamification events and updating the state of various gamification components. It acts as a bridge between application actions and gamification logic.

#### Parameters

androidJvm

| | |
|---|---|
| pointsManager | The manager responsible for points logic. |
| badgeManager | The manager responsible for badge logic. |
| levelManager | The manager responsible for level logic. // ... inject other managers as they are created |

## Constructors

| | |
|---|---|
| [GamificationEngine](-gamification-engine.md) | [androidJvm]<br>constructor(pointsManager: [PointsManager](../../com.example.gamificationlibrary.points/-points-manager/index.md), badgeManager: [BadgeManager](../../com.example.gamificationlibrary.badges/-badge-manager/index.md), levelManager: [LevelManager](../../com.example.gamificationlibrary.levels/-level-manager/index.md)) |

## Functions

| Name | Summary |
|---|---|
| [processEvent](process-event.md) | [androidJvm]<br>fun [processEvent](process-event.md)(event: [GamificationEvent](../-gamification-event/index.md))<br>Processes a gamification event, dispatching it to the relevant managers. |
