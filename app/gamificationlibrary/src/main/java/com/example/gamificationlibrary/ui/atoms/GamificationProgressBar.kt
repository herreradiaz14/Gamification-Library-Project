package com.example.gamificationlibrary.ui.atoms

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

/**
 * A reusable Composable for displaying a progress bar within the gamification UI.
 *
 * @param progress The current progress value, between 0.0f and 1.0f.
 * @param modifier Modifier to be applied to the ProgressBar.
 * @param progressColor The color of the progress indicator.
 * @param backgroundColor The background color of the progress bar track.
 * @param height The height of the progress bar.
 * @param cornerRadius The corner radius for the progress bar.
 */
@Composable
fun GamificationProgressBar(
    progress: Float,
    modifier: Modifier = Modifier,
    progressColor: Color = Color(0xFF4CAF50), // Example green
    backgroundColor: Color = Color.LightGray,
    height: Dp = 8.dp,
    cornerRadius: Dp = 4.dp
) {
    Box(
        modifier = modifier
            .clip(RoundedCornerShape(cornerRadius))
            .background(backgroundColor)
            .height(height)
            .fillMaxWidth() // Fill width by default, but can be overridden by modifier
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth(progress.coerceIn(0f, 1f)) // Ensure progress is between 0 and 1
                .height(height)
                .clip(RoundedCornerShape(cornerRadius))
                .background(progressColor)
        )
    }
}

@Preview
@Composable
private fun PreviewGamificationProgressBar() {
    GamificationProgressBar(progress = 0.75f)
}