## 🎮 Gamification Library for Android

A modular, Kotlin-based gamification engine designed for educational and interactive apps.

## 📦 Overview

The Gamification Library provides reusable, modular components to easily integrate game-like mechanics into Android applications.
It is designed with Kotlin, follows SOLID, and is built on a component-based architecture to ensure flexibility, extensibility, and high maintainability.

This library is currently used in an English-learning mobile app for children, supporting categories such as Listening, Speaking, Reading, and Writing.

## ✨ Features

✔ Points System
Add, deduct, and query points with full transaction tracking.

✔ Levels System
Automatic level progression based on thresholds and XP rules.

✔ Badges / Achievements
Unlock medals based on custom conditions.

✔ Leaderboard
Maintain and sort player rankings locally or remotely.

✔ Unified Event Bus
Components communicate through clean, decoupled events.

✔ Storage Layer (Room-ready)
Abstracted storage interface (IGamificationStorage) for any database implementation.

✔ UI Components (Jetpack Compose)
Optional UI helpers for quick integration.

## 🧱 Architecture

The library is divided into independent modules:

com.example.gamificationlibrary
│
├── core
│   │
│   ├── EventBus
│   ├── GamificationEngine
│   └── events
│
├── points
│   │
│   ├── PointsManager
│   ├── PointsData
│   └── PointTransaction
│
├── levels
│   │
│   ├── LevelManager
│   ├── LevelConfig
│   └── LevelData
│
├── badges
│   │
│   ├── BadgeManager
│   ├── Badge
│   └── BadgeRules
│
├── leaderboard
│   │
│   ├── LeaderboardManager
│   └── LeaderboardEntry
│
├── storage
│   │
│   ├── IGamificationStorage
│   ├── StorageModule
│   └── room
│       │
│       └── (optional implementation)
│
└── ui
│
├── PointsView
├── LevelProgressBar
└── BadgeListView




## 📥 Installation
1. Add the dependency

If published through Maven Central / JitPack:

Gradle (Kotlin DSL)
repositories {
mavenCentral()
// or jitpack: maven("https://jitpack.io")
}

dependencies {
implementation("com.yourpackage:gamification:1.0.0")
}
If you prefer to use it as a local module:

/your-project
/app
/gamification-library   <--- include this folder

settings.gradle.kts:
include(":gamification-library")

# 🚀 Quick Start
Initialize the Gamification Engine
val gamification = GamificationEngine(
storage = MyRoomGamificationStorage(),  // Your implementation
)

## 🟡 Points System
Add / Deduct Points
gamification.points.addPoints(userId = "user1", amount = 10)
gamification.points.deductPoints("user1", 5)

gamification.points.addPoints(userId = "user1", amount = 10)
gamification.points.deductPoints("user1", 5)

Observe Events
EventBus.subscribe(PointEvents.PointsChanged::class) { event ->
println("New points: ${event.newTotal}")
}

## 🔵 Levels System
val config = LevelConfig(
levelThresholds = listOf(0, 50, 120, 250)
)

gamification.levels.initialize("user1", config)
gamification.levels.addExperience("user1", 20)

## 🟢 Badges
gamification.badges.registerBadge(
Badge(
id = "first_win",
title = "First Correct Answer",
description = "Earned after completing the first correct challenge",
)
)

gamification.badges.unlockBadge("user1", "first_win")

## 🔴 Leaderboard
gamification.leaderboard.updateScore("user1", 250)
val top = gamification.leaderboard.getTop(10)

## 💾 Storage Layer

You must implement:

interface IGamificationStorage {
suspend fun savePoints(userId: String, points: Int)
suspend fun getPoints(userId: String): Int

    suspend fun saveLevel(userId: String, level: Int, xp: Int)
    suspend fun getLevel(userId: String): LevelData?

    // badges
    suspend fun saveBadge(userId: String, badgeId: String)
    suspend fun getBadges(userId: String): List<String>

    // leaderboard
    suspend fun saveScore(userId: String, score: Int)
    suspend fun getScores(): List<LeaderboardEntry>
}


A Room example implementation is provided under:
storage/room/

🖼 Optional UI Components (Compose)
@Composable
fun PointsView(points: Int) { … }

@Composable
fun LevelProgressBar(level: Int, progress: Float) { … }

## ⚙️ Configuration

Create a central configuration file in your app:

object GamificationConfig {
const val DEFAULT_POINTS_ON_SUCCESS = 5
const val LEVEL_UP_MULTIPLIER = 1.3f
}


## 📄 License

This library is released under the MIT License.
You are free to use it in commercial and open-source projects.

## 🙌 Acknowledgments

This library was originally developed as part of an educational mobile app for children, with the goal of improving engagement and learning through well-designed gamification mechanics.


## 📚 [Documentation](index.md)

The complete automatically generated documentation is available here:

## Packages

| Name |
|---|
| [com.example.gamificationlibrary.badges](gamificationlibrary/com.example.gamificationlibrary.badges/index.md) |
| [com.example.gamificationlibrary.badges.conditions](gamificationlibrary/com.example.gamificationlibrary.badges.conditions/index.md) |
| [com.example.gamificationlibrary.badges.data](gamificationlibrary/com.example.gamificationlibrary.badges.data/index.md) |
| [com.example.gamificationlibrary.core](gamificationlibrary/com.example.gamificationlibrary.core/index.md) |
| [com.example.gamificationlibrary.core.data](gamificationlibrary/com.example.gamificationlibrary.core.data/index.md) |
| [com.example.gamificationlibrary.leaderboard](gamificationlibrary/com.example.gamificationlibrary.leaderboard/index.md) |
| [com.example.gamificationlibrary.leaderboard.data](gamificationlibrary/com.example.gamificationlibrary.leaderboard.data/index.md) |
| [com.example.gamificationlibrary.levels](gamificationlibrary/com.example.gamificationlibrary.levels/index.md) |
| [com.example.gamificationlibrary.levels.data](gamificationlibrary/com.example.gamificationlibrary.levels.data/index.md) |
| [com.example.gamificationlibrary.points](gamificationlibrary/com.example.gamificationlibrary.points/index.md) |
| [com.example.gamificationlibrary.points.data](gamificationlibrary/com.example.gamificationlibrary.points.data/index.md) |
| [com.example.gamificationlibrary.storage](gamificationlibrary/com.example.gamificationlibrary.storage/index.md) |
| [com.example.gamificationlibrary.storage.inmemory](gamificationlibrary/com.example.gamificationlibrary.storage.inmemory/index.md) |
| [com.example.gamificationlibrary.ui.atoms](gamificationlibrary/com.example.gamificationlibrary.ui.atoms/index.md) |
| [com.example.gamificationlibrary.ui.molecules](gamificationlibrary/com.example.gamificationlibrary.ui.molecules/index.md) |
| [com.example.gamificationlibrary.ui.organism](gamificationlibrary/com.example.gamificationlibrary.ui.organism/index.md) |
