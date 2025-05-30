package com.example.gamificationlibrary.ui.molecules

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.gamificationlibrary.badges.data.Badge
import com.example.gamificationlibrary.badges.data.BadgeRarity
import com.example.gamificationlibrary.badges.conditions.PointsThresholdCondition // For preview example
import com.example.gamificationlibrary.ui.atoms.GamificationIcon
import com.example.gamificationlibrary.ui.atoms.GamificationText
import com.example.gamificationlibrary.R // Assuming R file exists for your library resources

/**
 * A molecular Composable for displaying a single badge with its icon, name, and description.
 *
 * @param badge The [Badge] data to display.
 * @param modifier Modifier to be applied to the card.
 * @param backgroundColor The background color of the card.
 * @param titleColor The color for the badge name.
 * @param descriptionColor The color for the badge description.
 * @param iconTint The tint color for the badge icon (defaults to badge rarity color).
 * @param cornerRadius The corner radius of the card.
 */
@Composable
fun BadgeCard(
    badge: Badge,
    modifier: Modifier = Modifier,
    backgroundColor: Color = Color(0xFFF5F5F5), // Light gray
    titleColor: Color = Color.Black,
    descriptionColor: Color = Color.Gray,
    iconTint: Color? = null, // Null means use default rarity color
    cornerRadius: Dp = 8.dp
) {
    // Determine icon tint based on rarity if not explicitly provided
    val effectiveIconTint = iconTint ?: when (badge.rarity) {
        BadgeRarity.COMMON -> Color(0xFFB0BEC5) // Light Blue Gray
        BadgeRarity.UNCOMMON -> Color(0xFF4CAF50) // Green
        BadgeRarity.RARE -> Color(0xFF2196F3) // Blue
        BadgeRarity.EPIC -> Color(0xFF9C27B0) // Purple
        BadgeRarity.LEGENDARY -> Color(0xFFE65100) // Deep Orange (Gold-like)
    }

    Column(
        modifier = modifier
            .clip(RoundedCornerShape(cornerRadius))
            .background(backgroundColor)
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Assuming your R.drawable.ic_default_badge exists for preview or default
        GamificationIcon(
            painter = painterResource(id = badge.iconResId),
            contentDescription = "${badge.name} Icon",
            tintColor = effectiveIconTint,
            size = 64.dp
        )
        Spacer(modifier = Modifier.height(8.dp))
        GamificationText(
            text = badge.name,
            color = titleColor,
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold
        )
        Spacer(modifier = Modifier.height(4.dp))
        GamificationText(
            text = badge.description,
            color = descriptionColor,
            fontSize = 14.sp
        )
    }
}

@Preview
@Composable
private fun PreviewBadgeCard() {
    // This preview requires a drawable resource in your project's R file
    // For a quick preview, you might need to create a dummy R.drawable.ic_default_badge
    // in your gamificationlibrary module's `res/drawable` folder, or use an ImageVector.
    // For this example, I'll assume R.drawable.ic_star is available.
    // If you don't have one, replace `R.drawable.ic_star` with a placeholder `0` for preview,
    // but the actual usage will need valid resource IDs.

    val sampleBadge = Badge(
        id = "sample_badge",
        name = "Sample Achiever",
        description = "This is a sample badge for demonstration.",
        iconResId = android.R.drawable.star_on, // Using a built-in Android drawable for easy preview
        rarity = BadgeRarity.EPIC,
        condition = PointsThresholdCondition(100) // Dummy condition for preview
    )

    BadgeCard(badge = sampleBadge)
}