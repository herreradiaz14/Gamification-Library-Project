//[gamificationlibrary](../../../index.md)/[com.example.gamificationlibrary.points](../index.md)/[PointRule](index.md)/[evaluate](evaluate.md)

# evaluate

[androidJvm]\
abstract fun [evaluate](evaluate.md)(event: [GamificationEvent](../../com.example.gamificationlibrary.core/-gamification-event/index.md)): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin/-int/index.html)

Evaluates if this rule applies to the given event and returns the points to be awarded.

#### Return

The number of points to award, or 0 if the rule does not apply or no points are awarded.

#### Parameters

androidJvm

| | |
|---|---|
| event | The gamification event to evaluate. |
