//[gamificationlibrary](../../../index.md)/[com.example.gamificationlibrary.points](../index.md)/[PointRule](index.md)

# PointRule

interface [PointRule](index.md)

Interface for defining rules that award points based on specific gamification events.

#### Inheritors

| |
|---|
| [TaskCompletionPointRule](../-task-completion-point-rule/index.md) |

## Functions

| Name | Summary |
|---|---|
| [evaluate](evaluate.md) | [androidJvm]<br>abstract fun [evaluate](evaluate.md)(event: [GamificationEvent](../../com.example.gamificationlibrary.core/-gamification-event/index.md)): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin/-int/index.html)<br>Evaluates if this rule applies to the given event and returns the points to be awarded. |
