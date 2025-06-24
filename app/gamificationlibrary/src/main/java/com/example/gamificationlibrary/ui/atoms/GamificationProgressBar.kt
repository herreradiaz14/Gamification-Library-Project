package com.example.gamificationlibrary.ui.atoms

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

/**
 * A reusable Composable for displaying a progress bar within the gamification UI.
 *
 * @param progress The current progress value, between 0.0f and 1.0f.
 * @param modifier Modifier to be applied to the ProgressBar.
 * @param progressBrush The brush (solid or gradient) for the progress indicator.
 * @param backgroundColor The background color of the progress bar track.
 * @param height The height of the progress bar.
 * @param cornerRadius The corner radius for the progress bar.
 */
@Composable
fun GamificationProgressBar(
    progress: Float,
    modifier: Modifier = Modifier,
    progressBrush: Brush = Brush.horizontalGradient(listOf(Color(0xFF4CAF50), Color(0xFF2E7D32))), // ✅ default gradient
    backgroundColor: Color = Color.LightGray,
    height: Dp = 8.dp,
    cornerRadius: Dp = 4.dp
) {
    Box(
        modifier = modifier
            .clip(RoundedCornerShape(cornerRadius))
            .background(backgroundColor)
            .height(height)
            .fillMaxWidth()
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth(progress.coerceIn(0f, 1f))
                .height(height)
                .clip(RoundedCornerShape(cornerRadius))
                .background(progressBrush)
        )
    }
}

@Preview
@Composable
private fun PreviewGamificationProgressBar() {
    GamificationProgressBar(
        progress = 0.75f
    )
}
