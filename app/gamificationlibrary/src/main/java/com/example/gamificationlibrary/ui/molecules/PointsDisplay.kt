package com.example.gamificationlibrary.ui.molecules

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MonetizationOn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.gamificationlibrary.ui.atoms.GamificationIcon
import com.example.gamificationlibrary.ui.atoms.GamificationText

/**
 * A molecular Composable for displaying a user's total points, typically with an icon.
 *
 * @param points The number of points to display.
 * @param modifier Modifier to be applied to the Row.
 * @param textColor The color of the points text.
 * @param iconTint The tint color of the points icon.
 * @param fontSize The font size of the points text.
 * @param iconSize The size of the points icon.
 */
@Composable
fun PointsDisplay(
    points: Int,
    modifier: Modifier = Modifier,
    textColor: Color = Color.Black,
    iconTint: Color = Color(0xFFFDD835), // Gold-like color
    fontSize: TextUnit = 24.sp,
    iconSize: Dp = 24.dp
) {
    Row(
        modifier = modifier,
        verticalAlignment = Alignment.CenterVertically
    ) {
        GamificationIcon(
            imageVector = Icons.Default.MonetizationOn,
            contentDescription = "Points Icon",
            tintColor = iconTint,
            size = iconSize
        )
        Spacer(modifier = Modifier.width(4.dp))
        GamificationText(
            text = "$points",
            color = textColor,
            fontSize = fontSize
        )
    }
}

@Preview
@Composable
private fun PreviewPointsDisplay() {
    PointsDisplay(points = 12345)
}