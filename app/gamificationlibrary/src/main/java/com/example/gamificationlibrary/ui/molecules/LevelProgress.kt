package com.example.gamificationlibrary.ui.molecules

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.gamificationlibrary.ui.atoms.GamificationProgressBar
import com.example.gamificationlibrary.ui.atoms.GamificationText

/**
 * A molecular Composable for displaying a user's current level and progress towards the next level.
 *
 * @param currentLevel The user's current level number.
 * @param levelName The name of the current level.
 * @param progress The progress towards the next level (0.0f to 1.0f).
 * @param nextLevelPointsRequired The points needed to reach the next level.
 * @param currentPoints The user's current total points.
 * @param modifier Modifier to be applied to the column.
 * @param levelTextColor The color of the level number and name.
 * @param progressTextColor The color of the progress text (e.g., "123/456 points").
 * @param progressBarBrush The brush used for the progress bar (can be solid or gradient).
 * @param progressBarBackgroundColor The background color of the progress bar track.
 */
@Composable
fun LevelProgress(
    currentLevel: Int,
    levelName: String,
    progress: Float,
    currentPoints: Int,
    nextLevelPointsRequired: Int,
    modifier: Modifier = Modifier,
    levelTextColor: Color = Color.Black,
    progressTextColor: Color = Color.Gray,
    progressBarBrush: Brush = Brush.horizontalGradient(
        colors = listOf(Color(0xFF4CAF50), Color(0xFF2E7D32))
    ),
    progressBarBackgroundColor: Color = Color.LightGray
) {
    Column(
        modifier = modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        GamificationText(
            text = "Level $currentLevel: $levelName",
            color = levelTextColor,
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(8.dp))

        // 🔹 Usa la versión del ProgressBar que acepte Brush
        GamificationProgressBar(
            progress = progress,
            modifier = Modifier
                .fillMaxWidth()
                .height(12.dp),
            progressBrush = progressBarBrush,
            backgroundColor = progressBarBackgroundColor,
            cornerRadius = 6.dp
        )

        Spacer(modifier = Modifier.height(4.dp))

        GamificationText(
            text = "$currentPoints / $nextLevelPointsRequired Points",
            color = progressTextColor,
            fontSize = 14.sp
        )
    }
}

@Preview
@Composable
private fun PreviewLevelProgress() {
    LevelProgress(
        currentLevel = 3,
        levelName = "Adept",
        progress = 0.65f,
        currentPoints = 325,
        nextLevelPointsRequired = 500
    )
}
