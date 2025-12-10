package com.example.gamificationlibrary.levels

import com.example.gamificationlibrary.badges.data.UserBadgesData
import com.example.gamificationlibrary.core.GamificationEvent
import com.example.gamificationlibrary.levels.data.LevelDefinition
import com.example.gamificationlibrary.levels.data.UserLevelData
import com.example.gamificationlibrary.storage.IGamificationStorage
import com.example.gamificationlibrary.core.data.UserGamificationData
import com.example.gamificationlibrary.points.data.UserPointsData
import org.junit.Assert.*
import org.junit.Before
import org.junit.Test
import org.mockito.ArgumentMatchers.anyString
import org.mockito.Mockito.*

class LevelManagerTest {
    private lateinit var mockStorage: IGamificationStorage
    private lateinit var levelManager: LevelManager
    private val testUserId = "user123"
    private var publishedEvents = mutableListOf<GamificationEvent>()

    // Sample level definitions for testing
    private val testLevels = listOf(
        LevelDefinition(level = 1, name = "Beginner", pointsRequired = 0),
        LevelDefinition(level = 2, name = "Novice", pointsRequired = 100),
        LevelDefinition(level = 3, name = "Intermediate", pointsRequired = 300),
        LevelDefinition(level = 4, name = "Advanced", pointsRequired = 600),
        LevelDefinition(level = 5, name = "Expert", pointsRequired = 1000)
    )

    @Before
    fun setUp() {
        mockStorage = mock(IGamificationStorage::class.java)
        publishedEvents = mutableListOf()
        levelManager = LevelManager(
            storage = mockStorage,
            levelDefinitions = testLevels,
            onEventPublished = { event -> publishedEvents.add(event) }
        )

        // Default mock behavior
        `when`(mockStorage.loadUserGamificationData(anyString()))
            .thenReturn(
                UserGamificationData(
                    entityId = testUserId,
                    pointsData = UserPointsData(0, emptyList()),
                    levelData = UserLevelData(1, 0f),
                    badgesData = UserBadgesData(emptyList())
                )
            )
    }

    @Test
    fun `getCurrentLevel returns correct level`() {
        // Given
        `when`(mockStorage.loadUserGamificationData(testUserId))
            .thenReturn(
                UserGamificationData(
                    entityId = testUserId,
                    pointsData = UserPointsData(350, emptyList()),
                    levelData = UserLevelData(3, 0.5f), // Current level is 3
                    badgesData = UserBadgesData(emptyList())
                )
            )

        // When
        val level = levelManager.getCurrentLevel(testUserId)

        // Then
        assertEquals(3, level)
    }

    @Test
    fun `getLevelProgress returns correct progress`() {
        // Given: User is at level 3 (300 points) with 350 points, so 50/300 to next level
        `when`(mockStorage.loadUserGamificationData(testUserId))
            .thenReturn(
                UserGamificationData(
                    entityId = testUserId,
                    pointsData = UserPointsData(350, emptyList()),
                    levelData = UserLevelData(3, 0.16666667f), // 50/300 = ~0.1667
                    badgesData = UserBadgesData(emptyList())
                )
            )

        // When
        val progress = levelManager.getLevelProgress(testUserId)

        // Then
        assertEquals(0.16666667f, progress)
    }

    @Test
    fun `getNextLevelThreshold returns correct threshold`() {
        // When/Then
        assertEquals(
            100,
            levelManager.getNextLevelThreshold(1)
        ) // Next level after 1 is 2, which requires 100 points
        assertEquals(300, levelManager.getNextLevelThreshold(2))
        assertEquals(600, levelManager.getNextLevelThreshold(3))
        assertEquals(1000, levelManager.getNextLevelThreshold(4))
        assertEquals(-1, levelManager.getNextLevelThreshold(5)) // No level after 5
    }

    @Test
    fun `checkLevelUp when multiple levels are skipped`() {
        // Given: User has 700 points, which skips from level 1 to 4
        `when`(mockStorage.loadUserGamificationData(testUserId))
            .thenReturn(
                UserGamificationData(
                    entityId = testUserId,
                    pointsData = UserPointsData(700, emptyList()),
                    levelData = UserLevelData(1, 0f),
                    badgesData = UserBadgesData(emptyList())
                )
            )

        // When
        val newLevel = levelManager.checkLevelUp(testUserId)

        // Then: Should level up directly to level 4 (600 points)
        assertEquals(4, newLevel)

        // Verify event was published with the new level
        assertEquals(1, publishedEvents.size)
        val event = publishedEvents[0] as GamificationEvent.LevelUp
        assertEquals(4, event.newLevel)
    }
}
//    @Test
//    fun `checkLevelUp when at max level does not level up`() {
//        // Given: User is at max level (5) with 2000 points
//        `when`(mockStorage.loadUserGamificationData(testUserId))
//            .thenReturn(
//                UserGamificationData(
//                    entityId = testUserId,
//                    pointsData = UserPointsData(2000, emptyList()),
//                    levelData = UserLevelData(5, 1.0f), // Max level
//                    badgesData = UserBadgesData(emptyList())
//                )
//            )
//
//        // When
//        val newLevel = levelManager.checkLevelUp(testUserId)
//
//        // Then: Should stay at max level
//        assertEquals(5, newLevel)
//        verify(mockStorage).saveUserGamificationData(any())
//        assertTrue(publishedEvents.isEmpty())
//    }
//
//    @Test
//    fun `checkLevelUp when points reach next level threshold`() {
//        // Given: User has 100 points, which is the threshold for level 2
//        `when`(mockStorage.loadUserGamificationData(testUserId))
//            .thenReturn(
//                UserGamificationData(
//                    entityId = testUserId,
//                    pointsData = UserPointsData(100, emptyList()),
//                    levelData = UserLevelData(1, 0f), // Current level is 1
//                    badgesData = UserBadgesData(emptyList())
//                )
//            )
//
//        // When
//        val newLevel = levelManager.checkLevelUp(testUserId)
//
//        // Then: Should level up to 2
//        assertEquals(2, newLevel)
//        verify(mockStorage).saveUserGamificationData(any())
//
//        // Verify event was published
//        assertEquals(1, publishedEvents.size)
//        val event = publishedEvents[0] as GamificationEvent.LevelUp
//        assertEquals(testUserId, event.entityId)
//        assertEquals(2, event.newLevel)
//    }
//
//    @Test
//    fun `checkLevelUp when points not enough for next level`() {
//        // Given: User has 50 points, not enough for level 2 (needs 100)
//        `when`(mockStorage.loadUserGamificationData(testUserId))
//            .thenReturn(
//                UserGamificationData(
//                    entityId = testUserId,
//                    pointsData = UserPointsData(50, emptyList()),
//                    levelData = UserLevelData(1, 0f),
//                    badgesData = UserBadgesData(emptyList())
//                )
//            )
//
//        // When
//        val newLevel = levelManager.checkLevelUp(testUserId)
//
//        // Then: Should stay at level 1 but update progress
//        assertEquals(1, newLevel)
//        verify(mockStorage).saveUserGamificationData(any())
//        assertTrue(publishedEvents.isEmpty())
//    }
