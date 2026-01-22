//[gamificationlibrary](../../index.md)/[com.example.gamificationlibrary.ui.molecules](index.md)/[LevelProgress](-level-progress.md)

# LevelProgress

[androidJvm]\

@[Composable](https://developer.android.com/reference/kotlin/androidx/compose/runtime/Composable.html)

fun [LevelProgress](-level-progress.md)(currentLevel: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin/-int/index.html), levelName: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin/-string/index.html), progress: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin/-float/index.html), currentPoints: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin/-int/index.html), nextLevelPointsRequired: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin/-int/index.html), modifier: [Modifier](https://developer.android.com/reference/kotlin/androidx/compose/ui/Modifier.html) = Modifier, levelTextColor: [Color](https://developer.android.com/reference/kotlin/androidx/compose/ui/graphics/Color.html) = Color.Black, progressTextColor: [Color](https://developer.android.com/reference/kotlin/androidx/compose/ui/graphics/Color.html) = Color.Gray, progressBarBrush: [Brush](https://developer.android.com/reference/kotlin/androidx/compose/ui/graphics/Brush.html) = Brush.horizontalGradient(
        colors = listOf(Color(0xFF4CAF50), Color(0xFF2E7D32))
    ), progressBarBackgroundColor: [Color](https://developer.android.com/reference/kotlin/androidx/compose/ui/graphics/Color.html) = Color.LightGray, levelNameStyle: [TextStyle](https://developer.android.com/reference/kotlin/androidx/compose/ui/text/TextStyle.html) = LocalTextStyle. current, heightProgress: [Dp](https://developer.android.com/reference/kotlin/androidx/compose/ui/unit/Dp.html) = 12.dp)

A molecular Composable for displaying a user's current level and progress towards the next level.

#### Parameters

androidJvm

| | |
|---|---|
| currentLevel | The user's current level number. |
| levelName | The name of the current level. |
| progress | The progress towards the next level (0.0f to 1.0f). |
| nextLevelPointsRequired | The points needed to reach the next level. |
| currentPoints | The user's current total points. |
| modifier | Modifier to be applied to the column. |
| levelTextColor | The color of the level number and name. |
| progressTextColor | The color of the progress text (e.g., &quot;123/456 points&quot;). |
| progressBarBrush | The brush used for the progress bar (can be solid or gradient). |
| progressBarBackgroundColor | The background color of the progress bar track. |
| levelNameStyle | The text style for the level name. |
| heightProgress | The height of the progress bar. |
