package com.example.gamificationlibrary.ui.atoms

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp

/**
 * A reusable Composable for displaying text within the gamification UI.
 *
 * @param text The text to display.
 * @param modifier Modifier to be applied to the Text.
 * @param color The color of the text.
 * @param fontSize The size of the text.
 * @param fontWeight The font weight of the text.
 * @param fontFamily The font family of the text.
 * @param style The text style to apply.
 */
@Composable
fun GamificationText(
    text: String,
    modifier: Modifier = Modifier,
    color: Color = Color.Unspecified,
    fontSize: TextUnit = TextUnit.Unspecified,
    fontWeight: FontWeight? = null,
    fontFamily: FontFamily? = null,
    style: TextStyle = TextStyle.Default
) {
    Text(
        text = text,
        modifier = modifier,
        color = color,
        fontSize = fontSize,
        fontWeight = fontWeight,
        fontFamily = fontFamily,
        style = style
    )
}