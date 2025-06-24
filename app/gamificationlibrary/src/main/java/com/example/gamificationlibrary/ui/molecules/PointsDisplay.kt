package com.example.gamificationlibrary.ui.molecules

import androidx.compose.animation.core.animateIntAsState
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Star
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.gamificationlibrary.ui.atoms.GamificationIcon
import com.example.gamificationlibrary.ui.atoms.GamificationText

/**
 * A molecular Composable for displaying a user's total points, typically with an icon.
 * Designed following Atomic Design principles for maximum reusability and customization.
 *
 * @param points The number of points to display.
 * @param modifier Modifier to be applied to the Row.
 * @param textColor The color of the points text.
 * @param icon The default ImageVector to use as icon (e.g., a star).
 * @param iconContent An optional custom composable to replace the icon (overrides [icon] if provided).
 * @param iconTint The tint color of the points icon.
 * @param iconSize The size of the points icon.
 * @param spacing The horizontal space between icon and text.
 * @param textStyle The style of the points text (font size, weight, etc.).
 * @param prefix Text to show before the points value (e.g., "XP").
 * @param suffix Text to show after the points value (e.g., "pts").
 * @param iconPosition Whether the icon should be placed at the start or end of the row.
 * @param animatePoints Whether the points should animate smoothly when changing.
 * @param contentDescription Accessibility description for screen readers.
 */
@Composable
fun PointsDisplay(
    points: Int,
    modifier: Modifier = Modifier,
    textColor: Color = Color.Black,
    icon: ImageVector? = Icons.Outlined.Star,
    iconContent: (@Composable () -> Unit)? = null,
    iconTint: Color = Color(0xFFFDD835), // Gold-like color
    iconSize: Dp = 24.dp,
    spacing: Dp = 4.dp,
    textStyle: TextStyle = androidx.compose.material3.MaterialTheme.typography.bodyLarge.copy(
        fontSize = 24.sp
    ),
    prefix: String = "",
    suffix: String = " pts",
    iconPosition: IconPosition = IconPosition.Start,
    animatePoints: Boolean = true,
    contentDescription: String = "User points"
) {
    val animatedPoints by animateIntAsState(
        targetValue = points,
        label = "pointsAnimation"
    )

    Row(
        modifier = modifier,
        verticalAlignment = Alignment.CenterVertically
    ) {
        if (iconPosition == IconPosition.Start) {
            if (iconContent != null) {
                iconContent()
            } else if (icon != null) {
                GamificationIcon(
                    imageVector = icon,
                    contentDescription = contentDescription,
                    tintColor = iconTint,
                    size = iconSize
                )
            }
            Spacer(modifier = Modifier.width(spacing))
        }

        GamificationText(
            text = "$prefix${if (animatePoints) animatedPoints else points}$suffix",
            color = textColor,
            style = textStyle
        )

        if (iconPosition == IconPosition.End) {
            Spacer(modifier = Modifier.width(spacing))
            if (iconContent != null) {
                iconContent()
            } else if (icon != null) {
                GamificationIcon(
                    imageVector = icon,
                    contentDescription = contentDescription,
                    tintColor = iconTint,
                    size = iconSize
                )
            }
        }
    }
}

/**
 * Defines the position of the icon in [PointsDisplay].
 */
enum class IconPosition { Start, End }

@Preview(showBackground = true)
@Composable
private fun PreviewPointsDisplay() {
    PointsDisplay(
        points = 12345,
        prefix = "",
        suffix = " XP",
        iconPosition = IconPosition.Start
    )
}
