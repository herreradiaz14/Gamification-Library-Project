package com.example.gamificationlibrary.ui.organism

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import com.example.gamificationlibrary.leaderboard.data.LeaderboardEntry
import com.example.gamificationlibrary.ui.molecules.LeaderboardCard

@Composable
fun LeaderboardList(entries: List<LeaderboardEntry>) {
    LazyColumn {
        item {
            LeaderboardCard(entries = entries)
        }
    }
}