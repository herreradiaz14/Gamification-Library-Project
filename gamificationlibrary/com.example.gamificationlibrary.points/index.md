//[gamificationlibrary](../../index.md)/[com.example.gamificationlibrary.points](index.md)

# Package-level declarations

## Types

| Name | Summary |
|---|---|
| [PointRule](-point-rule/index.md) | [androidJvm]<br>interface [PointRule](-point-rule/index.md)<br>Interface for defining rules that award points based on specific gamification events. |
| [PointsManager](-points-manager/index.md) | [androidJvm]<br>class [PointsManager](-points-manager/index.md)(storage: [IGamificationStorage](../com.example.gamificationlibrary.storage/-i-gamification-storage/index.md), onEventPublished: ([GamificationEvent](../com.example.gamificationlibrary.core/-gamification-event/index.md)) -&gt; [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin/-unit/index.html))<br>Manages the accumulation, deduction, and retrieval of points for gamified entities. |
| [TaskCompletionPointRule](-task-completion-point-rule/index.md) | [androidJvm]<br>class [TaskCompletionPointRule](-task-completion-point-rule/index.md)(pointsPerTask: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin/-int/index.html)) : [PointRule](-point-rule/index.md) |
