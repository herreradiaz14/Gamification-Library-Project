package com.example.gamificationlibrary.ui.molecules

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.gamificationlibrary.badges.conditions.PointsThresholdCondition
import com.example.gamificationlibrary.badges.data.Badge
import com.example.gamificationlibrary.badges.data.BadgeRarity
import com.example.gamificationlibrary.ui.atoms.GamificationIcon
import com.example.gamificationlibrary.ui.atoms.GamificationText

/**
 * A molecular Composable for displaying a single badge with its icon, name, and description.
 *
 * @param badge The [Badge] data to display.
 * @param modifier Modifier to be applied externally.
 * @param backgroundColor The background color of the card.
 * @param titleColor The color for the badge name.
 * @param descriptionColor The color for the badge description.
 * @param footerColor The color for the optional footer text.
 * @param iconTint The tint color for the badge icon (defaults to badge rarity color).
 * @param cornerRadius The corner radius of the card.
 * @param elevation The shadow elevation of the card.
 * @param iconSize The size of the badge icon.
 * @param titleFontSize Font size for the badge name.
 * @param descriptionFontSize Font size for the badge description.
 * @param titleFontWeight Font weight for the badge title.
 * @param contentPadding Internal padding inside the card.
 * @param spacingBetween Space between elements.
 * @param footerText Optional footer text (e.g., "Unlock at 100 points").
 */
@Composable
fun BadgeCard(
    badge: Badge,
    modifier: Modifier = Modifier,
    backgroundColor: Color = Color(0xFFF5F5F5),
    titleColor: Color = Color.Black,
    descriptionColor: Color = Color.Gray,
    footerColor: Color = Color.DarkGray,
    iconTint: Color? = null,
    cornerRadius: Dp = 12.dp,
    elevation: Dp = 4.dp,
    iconSize: Dp = 64.dp,
    titleFontSize: TextUnit = 18.sp,           // ✅ TextUnit
    descriptionFontSize: TextUnit = 14.sp,     // ✅ TextUnit
    titleFontWeight: FontWeight = FontWeight.Bold,
    contentPadding: Dp = 16.dp,
    spacingBetween: Dp = 8.dp,
    footerText: String? = null
) {
    // Determine icon tint based on rarity if not explicitly provided
    val effectiveIconTint = iconTint ?: when (badge.rarity) {
        BadgeRarity.COMMON -> Color(0xFFB0BEC5) // Light Blue Gray
        BadgeRarity.UNCOMMON -> Color(0xFF4CAF50) // Green
        BadgeRarity.RARE -> Color(0xFF2196F3) // Blue
        BadgeRarity.EPIC -> Color(0xFF9C27B0) // Purple
        BadgeRarity.LEGENDARY -> Color(0xFFE65100) // Deep Orange
    }

    Card(
        modifier = modifier,
        colors = CardDefaults.cardColors(containerColor = backgroundColor),
        elevation = CardDefaults.cardElevation(defaultElevation = elevation),
        shape = RoundedCornerShape(cornerRadius)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(contentPadding),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            GamificationIcon(
                painter = painterResource(id = badge.iconResId),
                contentDescription = "${badge.name} Icon",
                tintColor = effectiveIconTint,
                size = iconSize
            )

            Spacer(modifier = Modifier.height(spacingBetween))

            GamificationText(
                text = badge.name,
                color = titleColor,
                fontSize = titleFontSize,
                fontWeight = titleFontWeight
            )

            Spacer(modifier = Modifier.height(spacingBetween / 2))

            GamificationText(
                text = badge.description,
                color = descriptionColor,
                fontSize = descriptionFontSize
            )

            // Footer text opcional (ej: "Unlock at 100 pts")
            footerText?.let {
                Spacer(modifier = Modifier.height(spacingBetween))
                GamificationText(
                    text = it,
                    color = footerColor,
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Medium
                )
            }
        }
    }
}

@Preview
@Composable
private fun PreviewBadgeCard() {
    val sampleBadge = Badge(
        id = "sample_badge",
        name = "Epic Explorer",
        description = "Unlocked by reaching 100 points.",
        iconResId = android.R.drawable.star_on,
        rarity = BadgeRarity.EPIC,
        condition = PointsThresholdCondition(100)
    )

    BadgeCard(
        badge = sampleBadge,
        footerText = "Requires 100 pts",
        backgroundColor = Color(0xFF121212),
        titleColor = Color.White,
        descriptionColor = Color.LightGray,
        iconTint = null, // usa color por rareza
        elevation = 8.dp,
        cornerRadius = 16.dp
    )
}
