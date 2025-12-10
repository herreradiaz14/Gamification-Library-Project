package com.example.gamificationlibrary.badges

import com.example.gamificationlibrary.badges.data.Badge
import com.example.gamificationlibrary.badges.data.BadgeRarity
import com.example.gamificationlibrary.badges.data.UserBadgesData
import com.example.gamificationlibrary.core.GamificationEvent
import com.example.gamificationlibrary.core.data.UserGamificationData
import com.example.gamificationlibrary.levels.data.UserLevelData
import com.example.gamificationlibrary.points.data.PointTransaction
import com.example.gamificationlibrary.points.data.UserPointsData
import com.example.gamificationlibrary.storage.IGamificationStorage
import org.junit.Assert.*
import org.junit.Before
import org.junit.Test
import org.mockito.ArgumentMatchers.anyString
import org.mockito.Mockito.*
import org.mockito.kotlin.argumentCaptor

class BadgeManagerTest {
    private lateinit var mockStorage: IGamificationStorage
    private lateinit var badgeManager: BadgeManager
    private val testUserId = "user123"
    private var publishedEvents = mutableListOf<GamificationEvent>()

    // Test badge definitions
    private val testBadges = listOf(
        Badge(
            id = "first_steps",
            name = "First Steps",
            description = "Earned for completing your first task",
            iconResId = 1,
            rarity = BadgeRarity.COMMON,
            condition = object : BadgeCondition {
                override fun isMet(userData: UserGamificationData): Boolean {
                    return userData.pointsData.transactions.isNotEmpty()
                }
            }
        ),
        Badge(
            id = "level_up",
            name = "Level Up!",
            description = "Reach level 5",
            iconResId = 2,
            rarity = BadgeRarity.EPIC,
            condition = object : BadgeCondition {
                override fun isMet(userData: UserGamificationData): Boolean {
                    return userData.levelData.currentLevel >= 5
                }
            }
        ),
        Badge(
            id = "point_master",
            name = "Point Master",
            description = "Earn 1000 points",
            iconResId = 3,
            rarity = BadgeRarity.LEGENDARY,
            condition = object : BadgeCondition {
                override fun isMet(userData: UserGamificationData): Boolean {
                    return userData.pointsData.totalPoints >= 1000
                }
            }
        )
    )

    @Before
    fun setUp() {
        mockStorage = mock(IGamificationStorage::class.java)
        publishedEvents = mutableListOf()
        badgeManager = BadgeManager(
            storage = mockStorage,
            badgeDefinitions = testBadges,
            onEventPublished = { event -> publishedEvents.add(event) }
        )

        // Default mock behavior - user with no badges
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
    fun `getEarnedBadges returns list of user's badges`() {
        // Given: User has one badge
        val userBadge = testBadges[0]
        `when`(mockStorage.loadUserGamificationData(testUserId))
            .thenReturn(
                UserGamificationData(
                    entityId = testUserId,
                    pointsData = UserPointsData(0, emptyList()),
                    levelData = UserLevelData(1, 0f),
                    badgesData = UserBadgesData(listOf(userBadge))
                )
            )

        // When
        val result = badgeManager.getEarnedBadges(testUserId)

        // Then
        assertEquals(1, result.size)
        assertEquals(userBadge.id, result[0].id)
    }

    @Test
    fun `checkBadgeConditions awards badge when condition is met`() {
        // Given: User has 1 transaction (condition for first_steps badge)
        val initialData = UserGamificationData(
            entityId = testUserId,
            pointsData = UserPointsData(10, listOf(createTestTransaction(10, "Test"))),
            levelData = UserLevelData(1, 0f),
            badgesData = UserBadgesData(emptyList())
        )

        `when`(mockStorage.loadUserGamificationData(testUserId)).thenReturn(initialData)

        // When
        badgeManager.checkBadgeConditions(testUserId)

        // Then: Should award the first_steps badge
        val argumentCaptor = argumentCaptor<UserGamificationData>()
        verify(mockStorage).saveUserGamificationData(argumentCaptor.capture())

        // Verify the saved data contains the new badge
        val savedData = argumentCaptor.firstValue
        assertEquals(1, savedData.badgesData.earnedBadges.size)
        assertEquals("first_steps", savedData.badgesData.earnedBadges[0].id)

        // Verify the event was published
        assertEquals(1, publishedEvents.size)
        val event = publishedEvents[0] as GamificationEvent.BadgeUnlocked
        assertEquals(testUserId, event.entityId)
        assertEquals("first_steps", event.badgeId)
    }

    @Test
    fun `checkBadgeConditions checks all badge conditions`() {
        // Given: User meets conditions for multiple badges
        val userData = UserGamificationData(
            entityId = testUserId,
            pointsData = UserPointsData(
                1500,
                listOf(createTestTransaction(1500, "Lots of points"))
            ),
            levelData = UserLevelData(7, 0.5f), // Level 7 > 5
            badgesData = UserBadgesData(emptyList())
        )

        `when`(mockStorage.loadUserGamificationData(testUserId)).thenReturn(userData)

        // When
        badgeManager.checkBadgeConditions(testUserId)

        // Then: Should award all three badges
        val argumentCaptor = argumentCaptor<UserGamificationData>()
        verify(mockStorage, times(3)).saveUserGamificationData(argumentCaptor.capture())

        // Verify all three badges were awarded
        val savedData = argumentCaptor.allValues
        assertEquals(3, savedData.size)

        val awardedBadgeIds = publishedEvents
            .filterIsInstance<GamificationEvent.BadgeUnlocked>()
            .map { it.badgeId }
            .toSet()

        assertEquals(3, awardedBadgeIds.size)
        assertTrue("first_steps" in awardedBadgeIds)
        assertTrue("level_up" in awardedBadgeIds)
        assertTrue("point_master" in awardedBadgeIds)
    }

    private fun createTestTransaction(amount: Int, reason: String) =
        PointTransaction(amount, reason, System.currentTimeMillis())
}
//    @Test
//    fun `checkBadgeConditions does not award badge when already earned`() {
//        // Given: User has the first_steps badge already
//        val firstBadge = testBadges[0]
//        `when`(mockStorage.loadUserGamificationData(testUserId))
//            .thenReturn(
//                UserGamificationData(
//                    entityId = testUserId,
//                    pointsData = UserPointsData(10, listOf(createTestTransaction(10, "Test"))),
//                    levelData = UserLevelData(1, 0f),
//                    badgesData = UserBadgesData(listOf(firstBadge))
//                )
//            )
//
//        // When
//        badgeManager.checkBadgeConditions(testUserId)
//
//        // Then: Should not save or publish any events
//        verify(mockStorage, never()).saveUserGamificationData(any())
//        assertTrue(publishedEvents.isEmpty())
//    }
//
//    @Test
//    fun `awardBadge adds badge to user when not already earned`() {
//        // Given: User has no badges initially
//        val badgeToAward = testBadges[0]
//
//        // When
//        val result = badgeManager.awardBadge(testUserId, badgeToAward.id)
//
//        // Then: Should return true and save the badge
//        assertTrue(result)
//        verify(mockStorage).saveUserGamificationData(any())
//
//        // Verify event was published
//        assertEquals(1, publishedEvents.size)
//        val event = publishedEvents[0] as GamificationEvent.BadgeUnlocked
//        assertEquals(testUserId, event.entityId)
//        assertEquals(badgeToAward.id, event.badgeId)
//    }
//
//    @Test
//    fun `awardBadge returns false when badge already earned`() {
//        // Given: User already has the badge
//        val badgeToAward = testBadges[0]
//        `when`(mockStorage.loadUserGamificationData(testUserId))
//            .thenReturn(
//                UserGamificationData(
//                    entityId = testUserId,
//                    pointsData = UserPointsData(0, emptyList()),
//                    levelData = UserLevelData(1, 0f),
//                    badgesData = UserBadgesData(listOf(badgeToAward))
//                )
//            )
//
//        // When
//        val result = badgeManager.awardBadge(testUserId, badgeToAward.id)
//
//        // Then: Should return false and not save anything
//        assertFalse(result)
//        verify(mockStorage, never()).saveUserGamificationData(any())
//        assertTrue(publishedEvents.isEmpty())
//    }
//
//    @Test(expected = IllegalArgumentException::class)
//    fun `awardBadge throws exception for unknown badge ID`() {
//        // When/Then
//        badgeManager.awardBadge(testUserId, "nonexistent_badge")
//    }

