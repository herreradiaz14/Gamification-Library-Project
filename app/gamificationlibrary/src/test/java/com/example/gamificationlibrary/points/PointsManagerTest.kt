package com.example.gamificationlibrary.points

import com.example.gamificationlibrary.badges.data.UserBadgesData
import com.example.gamificationlibrary.core.GamificationEvent
import com.example.gamificationlibrary.points.data.UserPointsData
import com.example.gamificationlibrary.storage.IGamificationStorage
import com.example.gamificationlibrary.core.data.UserGamificationData
import com.example.gamificationlibrary.levels.data.UserLevelData
import org.junit.Assert.*
import org.junit.Before
import org.junit.Test
import org.mockito.ArgumentMatchers.anyString
import org.mockito.Mockito.*

class PointsManagerTest {
    private lateinit var mockStorage: IGamificationStorage
    private lateinit var pointsManager: PointsManager
    private val testUserId = "user123"
    private var publishedEvents = mutableListOf<GamificationEvent>()

    @Before
    fun setUp() {
        mockStorage = mock(IGamificationStorage::class.java)
        publishedEvents = mutableListOf()
        pointsManager = PointsManager(
            storage = mockStorage,
            onEventPublished = { event -> publishedEvents.add(event) }
        )

        // Setup default mock behavior
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

    @Test(expected = IllegalArgumentException::class)
    fun `addPoints with zero amount throws exception`() {
        pointsManager.addPoints(testUserId, 0, "Invalid points")
    }

    @Test
    fun `getPoints returns correct points for user`() {
        // Given
        val expectedPoints = 150
        `when`(mockStorage.loadUserGamificationData(testUserId))
            .thenReturn(
                UserGamificationData(
                    entityId = testUserId,
                    pointsData = UserPointsData(expectedPoints, emptyList()),
                    levelData = UserLevelData(1, 0f),
                    badgesData = UserBadgesData(emptyList())
                )
            )

        // When
        val result = pointsManager.getPoints(testUserId)

        // Then
        assertEquals(expectedPoints, result)
    }

    @Test
    fun `getPoints returns zero for non-existent user`() {
        // Given
        `when`(mockStorage.loadUserGamificationData("nonExistentUser"))
            .thenReturn(
                UserGamificationData(
                    entityId = "nonExistentUser",
                    pointsData = UserPointsData(0, emptyList()),
                    levelData = UserLevelData(1, 0f),
                    badgesData = UserBadgesData(emptyList())
                )
            )

        // When
        val result = pointsManager.getPoints("nonExistentUser")

        // Then
        assertEquals(0, result)
    }
}
//    @Test(expected = IllegalArgumentException::class)
//    fun `addPoints with negative amount throws exception`() {
//        pointsManager.addPoints(testUserId, -10, "Invalid negative points")
//    }
//
//    @Test
//    fun `deductPoints reduces total points when sufficient points are available`() {
//        // Given
//        `when`(mockStorage.loadUserGamificationData(anyString()))
//            .thenReturn(UserGamificationData(
//                entityId = testUserId,
//                pointsData = UserPointsData(100, emptyList()),
//                levelData = UserLevelData(1, 0f),
//                badgesData = UserBadgesData(emptyList())
//            ))
//
//        // When
//        val result = pointsManager.deductPoints(testUserId, 30, "Points deduction test")
//
//        // Then
//        assertEquals(70, result)
//        verify(mockStorage).saveUserGamificationData(any())
//    }
//
//    @Test(expected = IllegalStateException::class)
//    fun `deductPoints throws exception when insufficient points`() {
//        // Given
//        `when`(mockStorage.loadUserGamificationData(anyString()))
//            .thenReturn(UserGamificationData(
//                entityId = testUserId,
//                pointsData = UserPointsData(20, emptyList()),
//                levelData = UserLevelData(1, 0f),
//                badgesData = UserBadgesData(emptyList())
//            ))
//
//        // When/Then
//        pointsManager.deductPoints(testUserId, 30, "Insufficient points test")
//    }
//
//    @Test
//    fun `addPoints with positive amount increases total points`() {
//        // When
//        val result = pointsManager.addPoints(testUserId, 50, "Test points")
//
//        // Then
//        assertEquals(50, result)
//        verify(mockStorage).saveUserGamificationData(any())
//
//        // Verify event was published
//        assertEquals(1, publishedEvents.size)
//        val event = publishedEvents[0] as GamificationEvent.PointsEarned
//        assertEquals(testUserId, event.entityId)
//        assertEquals(50, event.amount)
//        assertEquals("Test points", event.reason)
//    }