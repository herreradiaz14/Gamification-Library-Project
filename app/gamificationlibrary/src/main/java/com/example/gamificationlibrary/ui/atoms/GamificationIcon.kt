package com.example.gamificationlibrary.ui.atoms

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star // Example default icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource // For Android resource IDs
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

/**
 * A reusable Composable for displaying icons within the gamification UI.
 * It can accept either a Painter (for drawable resources) or an ImageVector (for Material Icons).
 *
 * @param painter The painter to draw (e.g., from `painterResource`).
 * @param imageVector The image vector to draw (e.g., `Icons.Default.Star`).
 * @param contentDescription A localized description of the content for accessibility.
 * @param modifier Modifier to be applied to the Image.
 * @param tintColor The tint color to apply to the icon.
 * @param size The size of the icon.
 */
@Composable
fun GamificationIcon(
    painter: Painter? = null,
    imageVector: ImageVector? = null,
    contentDescription: String?,
    modifier: Modifier = Modifier,
    tintColor: Color = Color.Unspecified,
    size: Dp = 24.dp
) {
    Image(
        painter = painter ?: run {
            requireNotNull(imageVector) { "Either painter or imageVector must be provided." }
            null
        },
        imageVector = imageVector ?: Icons.Default.Star, // Fallback if no painter, use default Star
        contentDescription = contentDescription,
        modifier = modifier.size(size),
        colorFilter = if (tintColor != Color.Unspecified) ColorFilter.tint(tintColor) else null
    )
}

@Preview
@Composable
private fun PreviewGamificationIcon() {
    GamificationIcon(imageVector = Icons.Default.Star, contentDescription = "Star Icon", tintColor = Color.Yellow, size = 48.dp)
}