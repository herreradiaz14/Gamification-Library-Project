package com.example.gamificationlibrary.ui.molecules

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.gamificationlibrary.leaderboard.data.LeaderboardEntry
import com.example.gamificationlibrary.ui.atoms.LeaderboardRow

@Composable
fun LeaderboardCard(
    entries: List<LeaderboardEntry>,
    modifier: Modifier = Modifier,
    title: String? = null,
    backgroundColor: Color = Color.White,
    contentColor: Color = Color.Black,
    cardElevation: Dp = 4.dp,
    cornerRadius: Dp = 12.dp,
    maxVisibleItems: Int? = null
) {
    Card(
        modifier = modifier
            .fillMaxWidth()
            .padding(16.dp),
        colors = CardDefaults.cardColors(containerColor = backgroundColor),
        elevation = CardDefaults.cardElevation(defaultElevation = cardElevation),
        shape = RoundedCornerShape(cornerRadius) // <-- uso de RoundedCornerShape
    ) {
        Column(
            modifier = Modifier
                .background(backgroundColor)
                .padding(16.dp)
        ) {
            title?.let {
                Text(
                    text = it,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    color = contentColor,
                    modifier = Modifier
                        .align(Alignment.CenterHorizontally)
                        .padding(bottom = 8.dp)
                )
            }

            LazyColumn(
                modifier = Modifier.fillMaxWidth(),
                verticalArrangement = Arrangement.spacedBy(4.dp)
            ) {
                val itemsToShow = maxVisibleItems?.let { entries.take(it) } ?: entries
                itemsIndexed(itemsToShow) { index, entry ->
                    LeaderboardRow(entry = entry, rank = index + 1)
                }
            }
        }
    }
}
