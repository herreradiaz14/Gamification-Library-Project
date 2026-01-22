//[gamificationlibrary](../../index.md)/[com.example.gamificationlibrary.ui.atoms](index.md)/[GamificationIcon](-gamification-icon.md)

# GamificationIcon

[androidJvm]\

@[Composable](https://developer.android.com/reference/kotlin/androidx/compose/runtime/Composable.html)

fun [GamificationIcon](-gamification-icon.md)(painter: [Painter](https://developer.android.com/reference/kotlin/androidx/compose/ui/graphics/painter/Painter.html)? = null, imageVector: [ImageVector](https://developer.android.com/reference/kotlin/androidx/compose/ui/graphics/vector/ImageVector.html)? = null, contentDescription: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin/-string/index.html)?, modifier: [Modifier](https://developer.android.com/reference/kotlin/androidx/compose/ui/Modifier.html) = Modifier, tintColor: [Color](https://developer.android.com/reference/kotlin/androidx/compose/ui/graphics/Color.html) = Color.Unspecified, size: [Dp](https://developer.android.com/reference/kotlin/androidx/compose/ui/unit/Dp.html) = 24.dp)

A reusable Composable for displaying icons within the gamification UI. It can accept either a Painter (for drawable resources) or an ImageVector (for Material Icons).

#### Parameters

androidJvm

| | |
|---|---|
| painter | The painter to draw (e.g., from `painterResource`). |
| imageVector | The image vector to draw (e.g., `Icons.Default.Star`). |
| contentDescription | A localized description of the content for accessibility. |
| modifier | Modifier to be applied to the Image. |
| tintColor | The tint color to apply to the icon. |
| size | The size of the icon. |
