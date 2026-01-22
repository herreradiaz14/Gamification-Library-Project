//[gamificationlibrary](../../index.md)/[com.example.gamificationlibrary.ui.atoms](index.md)/[GamificationProgressBar](-gamification-progress-bar.md)

# GamificationProgressBar

[androidJvm]\

@[Composable](https://developer.android.com/reference/kotlin/androidx/compose/runtime/Composable.html)

fun [GamificationProgressBar](-gamification-progress-bar.md)(progress: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin/-float/index.html), modifier: [Modifier](https://developer.android.com/reference/kotlin/androidx/compose/ui/Modifier.html) = Modifier, progressBrush: [Brush](https://developer.android.com/reference/kotlin/androidx/compose/ui/graphics/Brush.html) = Brush.horizontalGradient(listOf(Color(0xFF00b783), Color(0xFF00b783))), backgroundColor: [Color](https://developer.android.com/reference/kotlin/androidx/compose/ui/graphics/Color.html) = Color.LightGray, height: [Dp](https://developer.android.com/reference/kotlin/androidx/compose/ui/unit/Dp.html) = 8.dp, cornerRadius: [Dp](https://developer.android.com/reference/kotlin/androidx/compose/ui/unit/Dp.html) = 4.dp)

A reusable Composable for displaying a progress bar within the gamification UI.

#### Parameters

androidJvm

| | |
|---|---|
| progress | The current progress value, between 0.0f and 1.0f. |
| modifier | Modifier to be applied to the ProgressBar. |
| progressBrush | The brush (solid or gradient) for the progress indicator. |
| backgroundColor | The background color of the progress bar track. |
| height | The height of the progress bar. |
| cornerRadius | The corner radius for the progress bar. |
