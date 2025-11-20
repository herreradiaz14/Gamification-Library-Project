package com.example.gamificationlibrary.ui.organism

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.gamificationlibrary.leaderboard.data.LeaderboardEntry
import com.example.gamificationlibrary.ui.molecules.LeaderboardCard

@Composable
fun LeaderboardList(entries: List<LeaderboardEntry>) {
    LeaderboardCard(entries = entries)
}

@Preview(showBackground = true)
@Composable
private fun PreviewLeaderboardList() {
    LeaderboardList(
        entries = listOf(
            LeaderboardEntry("user1", "Alice", 1500),
            LeaderboardEntry("user2", "Bob", 1200),
            LeaderboardEntry("user3", "Charlie", 900),
            LeaderboardEntry("user4", "Diana", 800),
            LeaderboardEntry("user5", "Ethan", 700)
        )
    )
}