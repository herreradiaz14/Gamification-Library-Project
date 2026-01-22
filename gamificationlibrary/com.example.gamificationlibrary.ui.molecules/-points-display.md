//[gamificationlibrary](../../index.md)/[com.example.gamificationlibrary.ui.molecules](index.md)/[PointsDisplay](-points-display.md)

# PointsDisplay

[androidJvm]\

@[Composable](https://developer.android.com/reference/kotlin/androidx/compose/runtime/Composable.html)

fun [PointsDisplay](-points-display.md)(points: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin/-int/index.html), modifier: [Modifier](https://developer.android.com/reference/kotlin/androidx/compose/ui/Modifier.html) = Modifier, textColor: [Color](https://developer.android.com/reference/kotlin/androidx/compose/ui/graphics/Color.html) = Color.Black, icon: [ImageVector](https://developer.android.com/reference/kotlin/androidx/compose/ui/graphics/vector/ImageVector.html)? = Icons.Outlined.Star, iconContent: @[Composable](https://developer.android.com/reference/kotlin/androidx/compose/runtime/Composable.html)() -&gt; [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin/-unit/index.html)? = null, iconTint: [Color](https://developer.android.com/reference/kotlin/androidx/compose/ui/graphics/Color.html) = Color(0xFFFDD835), iconSize: [Dp](https://developer.android.com/reference/kotlin/androidx/compose/ui/unit/Dp.html) = 24.dp, spacing: [Dp](https://developer.android.com/reference/kotlin/androidx/compose/ui/unit/Dp.html) = 4.dp, textStyle: [TextStyle](https://developer.android.com/reference/kotlin/androidx/compose/ui/text/TextStyle.html) = androidx.compose.material3.MaterialTheme.typography.bodyLarge.copy(
        fontSize = 24.sp
    ), prefix: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin/-string/index.html) = &quot;&quot;, suffix: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin/-string/index.html) = &quot; pts&quot;, iconPosition: [IconPosition](-icon-position/index.md) = IconPosition.Start, animatePoints: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin/-boolean/index.html) = true, contentDescription: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin/-string/index.html) = &quot;User points&quot;)

A molecular Composable for displaying a user's total points, typically with an icon. Designed following Atomic Design principles for maximum reusability and customization.

#### Parameters

androidJvm

| | |
|---|---|
| points | The number of points to display. |
| modifier | Modifier to be applied to the Row. |
| textColor | The color of the points text. |
| icon | The default ImageVector to use as icon (e.g., a star). |
| iconContent | An optional custom composable to replace the icon (overrides [icon](-points-display.md) if provided). |
| iconTint | The tint color of the points icon. |
| iconSize | The size of the points icon. |
| spacing | The horizontal space between icon and text. |
| textStyle | The style of the points text (font size, weight, etc.). |
| prefix | Text to show before the points value (e.g., &quot;XP&quot;). |
| suffix | Text to show after the points value (e.g., &quot;pts&quot;). |
| iconPosition | Whether the icon should be placed at the start or end of the row. |
| animatePoints | Whether the points should animate smoothly when changing. |
| contentDescription | Accessibility description for screen readers. |
