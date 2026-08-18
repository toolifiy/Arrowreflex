package com.example.model

data class ArrowMission(
    val id: String,
    val title: String,
    val desc: String,
    val xpReward: Int,
    val targetValue: Int,
    val checkProgress: (totalHits: Int, bestTimeMs: Long, skinsSize: Int, dotsSize: Int, coins: Int, gamesPlayed: Int, currentLevel: Int) -> Int
)

object ArrowMissionCatalog {
    val allMissions: List<ArrowMission> = listOf(
        ArrowMission(
            id = "mission_1",
            title = "First Touch",
            desc = "Hit the target successfully once in total.",
            xpReward = 50,
            targetValue = 1,
            checkProgress = { totalHits, _, _, _, _, _, _ -> totalHits.coerceAtMost(1) }
        ),
        ArrowMission(
            id = "mission_2",
            title = "Reflex Rookie",
            desc = "Reach 5 total hits across games.",
            xpReward = 100,
            targetValue = 5,
            checkProgress = { totalHits, _, _, _, _, _, _ -> totalHits.coerceAtMost(5) }
        ),
        ArrowMission(
            id = "mission_3",
            title = "Reflex Apprentice",
            desc = "Reach 15 total hits across games.",
            xpReward = 150,
            targetValue = 15,
            checkProgress = { totalHits, _, _, _, _, _, _ -> totalHits.coerceAtMost(15) }
        ),
        ArrowMission(
            id = "mission_4",
            title = "Reflex Journeyman",
            desc = "Reach 30 total hits across games.",
            xpReward = 200,
            targetValue = 30,
            checkProgress = { totalHits, _, _, _, _, _, _ -> totalHits.coerceAtMost(30) }
        ),
        ArrowMission(
            id = "mission_5",
            title = "Reflex Expert",
            desc = "Reach 60 total hits across games.",
            xpReward = 250,
            targetValue = 60,
            checkProgress = { totalHits, _, _, _, _, _, _ -> totalHits.coerceAtMost(60) }
        ),
        ArrowMission(
            id = "mission_6",
            title = "Reflex Champion",
            desc = "Reach 100 total hits across games.",
            xpReward = 350,
            targetValue = 100,
            checkProgress = { totalHits, _, _, _, _, _, _ -> totalHits.coerceAtMost(100) }
        ),
        ArrowMission(
            id = "mission_7",
            title = "Reflex Legend",
            desc = "Reach 200 total hits across games.",
            xpReward = 500,
            targetValue = 200,
            checkProgress = { totalHits, _, _, _, _, _, _ -> totalHits.coerceAtMost(200) }
        ),
        ArrowMission(
            id = "mission_8",
            title = "Under 500ms Club",
            desc = "Achieve a best reaction time of 500ms or lower.",
            xpReward = 100,
            targetValue = 1,
            checkProgress = { _, bestTimeMs, _, _, _, _, _ -> if (bestTimeMs in 1..500) 1 else 0 }
        ),
        ArrowMission(
            id = "mission_9",
            title = "Under 400ms Club",
            desc = "Achieve a best reaction time of 400ms or lower.",
            xpReward = 150,
            targetValue = 1,
            checkProgress = { _, bestTimeMs, _, _, _, _, _ -> if (bestTimeMs in 1..400) 1 else 0 }
        ),
        ArrowMission(
            id = "mission_10",
            title = "Under 350ms Club",
            desc = "Achieve a best reaction time of 350ms or lower.",
            xpReward = 200,
            targetValue = 1,
            checkProgress = { _, bestTimeMs, _, _, _, _, _ -> if (bestTimeMs in 1..350) 1 else 0 }
        ),
        ArrowMission(
            id = "mission_11",
            title = "Under 300ms Club",
            desc = "Achieve a best reaction time of 300ms or lower.",
            xpReward = 250,
            targetValue = 1,
            checkProgress = { _, bestTimeMs, _, _, _, _, _ -> if (bestTimeMs in 1..300) 1 else 0 }
        ),
        ArrowMission(
            id = "mission_12",
            title = "Under 250ms Club",
            desc = "Achieve a best reaction time of 250ms or lower.",
            xpReward = 350,
            targetValue = 1,
            checkProgress = { _, bestTimeMs, _, _, _, _, _ -> if (bestTimeMs in 1..250) 1 else 0 }
        ),
        ArrowMission(
            id = "mission_13",
            title = "Under 200ms Club",
            desc = "Achieve a best reaction time of 200ms or lower.",
            xpReward = 500,
            targetValue = 1,
            checkProgress = { _, bestTimeMs, _, _, _, _, _ -> if (bestTimeMs in 1..200) 1 else 0 }
        ),
        ArrowMission(
            id = "mission_14",
            title = "First Styling",
            desc = "Unlock 2 or more Arrow Skins in the shop.",
            xpReward = 150,
            targetValue = 2,
            checkProgress = { _, _, skinsSize, _, _, _, _ -> skinsSize.coerceAtMost(2) }
        ),
        ArrowMission(
            id = "mission_15",
            title = "Fashion Collector",
            desc = "Unlock 4 or more Arrow Skins in the shop.",
            xpReward = 300,
            targetValue = 4,
            checkProgress = { _, _, skinsSize, _, _, _, _ -> skinsSize.coerceAtMost(4) }
        ),
        ArrowMission(
            id = "mission_16",
            title = "Arrow Emperor",
            desc = "Unlock 6 or more Arrow Skins in the shop.",
            xpReward = 500,
            targetValue = 6,
            checkProgress = { _, _, skinsSize, _, _, _, _ -> skinsSize.coerceAtMost(6) }
        ),
        ArrowMission(
            id = "mission_17",
            title = "Dot Enthusiast",
            desc = "Unlock 2 or more Dot Skins in the shop.",
            xpReward = 150,
            targetValue = 2,
            checkProgress = { _, _, _, dotsSize, _, _, _ -> dotsSize.coerceAtMost(2) }
        ),
        ArrowMission(
            id = "mission_18",
            title = "Dot Specialist",
            desc = "Unlock 4 or more Dot Skins in the shop.",
            xpReward = 300,
            targetValue = 4,
            checkProgress = { _, _, _, dotsSize, _, _, _ -> dotsSize.coerceAtMost(4) }
        ),
        ArrowMission(
            id = "mission_19",
            title = "Dot Overlord",
            desc = "Unlock 6 or more Dot Skins in the shop.",
            xpReward = 500,
            targetValue = 6,
            checkProgress = { _, _, _, dotsSize, _, _, _ -> dotsSize.coerceAtMost(6) }
        ),
        ArrowMission(
            id = "mission_20",
            title = "Pocket Change",
            desc = "Hold at least 50 coins in your balance.",
            xpReward = 100,
            targetValue = 50,
            checkProgress = { _, _, _, _, coins, _, _ -> coins.coerceAtMost(50) }
        ),
        ArrowMission(
            id = "mission_21",
            title = "Coin Gatherer",
            desc = "Hold at least 150 coins in your balance.",
            xpReward = 150,
            targetValue = 150,
            checkProgress = { _, _, _, _, coins, _, _ -> coins.coerceAtMost(150) }
        ),
        ArrowMission(
            id = "mission_22",
            title = "Wealthy Tap",
            desc = "Hold at least 300 coins in your balance.",
            xpReward = 250,
            targetValue = 300,
            checkProgress = { _, _, _, _, coins, _, _ -> coins.coerceAtMost(300) }
        ),
        ArrowMission(
            id = "mission_23",
            title = "Gold Reserve",
            desc = "Hold at least 500 coins in your balance.",
            xpReward = 400,
            targetValue = 500,
            checkProgress = { _, _, _, _, coins, _, _ -> coins.coerceAtMost(500) }
        ),
        ArrowMission(
            id = "mission_24",
            title = "Apprentice Gamer",
            desc = "Start and play at least 3 games.",
            xpReward = 100,
            targetValue = 3,
            checkProgress = { _, _, _, _, _, gamesPlayed, _ -> gamesPlayed.coerceAtMost(3) }
        ),
        ArrowMission(
            id = "mission_25",
            title = "Persistent Player",
            desc = "Start and play at least 10 games.",
            xpReward = 200,
            targetValue = 10,
            checkProgress = { _, _, _, _, _, gamesPlayed, _ -> gamesPlayed.coerceAtMost(10) }
        ),
        ArrowMission(
            id = "mission_26",
            title = "Hardcore Arcade",
            desc = "Start and play at least 25 games.",
            xpReward = 350,
            targetValue = 25,
            checkProgress = { _, _, _, _, _, gamesPlayed, _ -> gamesPlayed.coerceAtMost(25) }
        ),
        ArrowMission(
            id = "mission_27",
            title = "Level Up!",
            desc = "Reach level 1 or higher.",
            xpReward = 150,
            targetValue = 1,
            checkProgress = { _, _, _, _, _, _, currentLevel -> currentLevel.coerceAtMost(1) }
        ),
        ArrowMission(
            id = "mission_28",
            title = "High Climber",
            desc = "Reach level 3 or higher.",
            xpReward = 250,
            targetValue = 3,
            checkProgress = { _, _, _, _, _, _, currentLevel -> currentLevel.coerceAtMost(3) }
        ),
        ArrowMission(
            id = "mission_29",
            title = "Elite Challenger",
            desc = "Reach level 5 or higher.",
            xpReward = 400,
            targetValue = 5,
            checkProgress = { _, _, _, _, _, _, currentLevel -> currentLevel.coerceAtMost(5) }
        ),
        ArrowMission(
            id = "mission_30",
            title = "Reflex God",
            desc = "Reach level 10 or higher.",
            xpReward = 800,
            targetValue = 10,
            checkProgress = { _, _, _, _, _, _, currentLevel -> currentLevel.coerceAtMost(10) }
        )
    )
}
