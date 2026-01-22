//[gamificationlibrary](../../index.md)/[com.example.gamificationlibrary.ui.molecules](index.md)/[BadgeCard](-badge-card.md)

# BadgeCard

[androidJvm]\

@[Composable](https://developer.android.com/reference/kotlin/androidx/compose/runtime/Composable.html)

fun [BadgeCard](-badge-card.md)(badge: [Badge](../com.example.gamificationlibrary.badges.data/-badge/index.md), modifier: [Modifier](https://developer.android.com/reference/kotlin/androidx/compose/ui/Modifier.html) = Modifier, backgroundColor: [Color](https://developer.android.com/reference/kotlin/androidx/compose/ui/graphics/Color.html) = Color(0xFFF5F5F5), titleColor: [Color](https://developer.android.com/reference/kotlin/androidx/compose/ui/graphics/Color.html) = Color.Black, descriptionColor: [Color](https://developer.android.com/reference/kotlin/androidx/compose/ui/graphics/Color.html) = Color.Gray, footerColor: [Color](https://developer.android.com/reference/kotlin/androidx/compose/ui/graphics/Color.html) = Color.DarkGray, iconTint: [Color](https://developer.android.com/reference/kotlin/androidx/compose/ui/graphics/Color.html)? = null, cornerRadius: [Dp](https://developer.android.com/reference/kotlin/androidx/compose/ui/unit/Dp.html) = 12.dp, elevation: [Dp](https://developer.android.com/reference/kotlin/androidx/compose/ui/unit/Dp.html) = 4.dp, iconSize: [Dp](https://developer.android.com/reference/kotlin/androidx/compose/ui/unit/Dp.html) = 64.dp, titleFontSize: [TextUnit](https://developer.android.com/reference/kotlin/androidx/compose/ui/unit/TextUnit.html) = 18.sp, descriptionFontSize: [TextUnit](https://developer.android.com/reference/kotlin/androidx/compose/ui/unit/TextUnit.html) = 14.sp, titleFontWeight: [FontWeight](https://developer.android.com/reference/kotlin/androidx/compose/ui/text/font/FontWeight.html) = FontWeight.Bold, contentPadding: [Dp](https://developer.android.com/reference/kotlin/androidx/compose/ui/unit/Dp.html) = 16.dp, spacingBetween: [Dp](https://developer.android.com/reference/kotlin/androidx/compose/ui/unit/Dp.html) = 8.dp, footerText: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin/-string/index.html)? = null)

A molecular Composable for displaying a single badge with its icon, name, and description.

#### Parameters

androidJvm

| | |
|---|---|
| badge | The [Badge](../com.example.gamificationlibrary.badges.data/-badge/index.md) data to display. |
| modifier | Modifier to be applied externally. |
| backgroundColor | The background color of the card. |
| titleColor | The color for the badge name. |
| descriptionColor | The color for the badge description. |
| footerColor | The color for the optional footer text. |
| iconTint | The tint color for the badge icon (defaults to badge rarity color). |
| cornerRadius | The corner radius of the card. |
| elevation | The shadow elevation of the card. |
| iconSize | The size of the badge icon. |
| titleFontSize | Font size for the badge name. |
| descriptionFontSize | Font size for the badge description. |
| titleFontWeight | Font weight for the badge title. |
| contentPadding | Internal padding inside the card. |
| spacingBetween | Space between elements. |
| footerText | Optional footer text (e.g., &quot;Unlock at 100 points&quot;). |
