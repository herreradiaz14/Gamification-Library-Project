package com.example.gamificationlibrary.ui.atoms

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.gamificationlibrary.leaderboard.data.LeaderboardEntry

@Composable
fun LeaderboardRow(entry: LeaderboardEntry, rank: Int) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(12.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(text = "#$rank", modifier = Modifier.width(40.dp))
        Text(text = entry.displayName, modifier = Modifier.weight(1f))
        Text(text = "${entry.score} pts", modifier = Modifier.width(80.dp))
    }
}