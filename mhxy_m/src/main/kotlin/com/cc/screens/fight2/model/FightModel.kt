package com.cc.screens.fight2.model


class FightModel {
    val players = listOf(
        Role(0, Side.PLAYER, Type.PET, "p1", 0, 80, 60, 100, 100),
        Role(1, Side.PLAYER, Type.PET, "p1", 0, 80, 60, 100, 100),
        Role(2, Side.PLAYER, Type.PET, "p1", 0, 80, 60, 100, 100),
        Role(3, Side.PLAYER, Type.ROLE, "p1", 0, 80, 60, 100, 100),
        Role(4, Side.PLAYER, Type.ROLE, "p1", 0, 80, 60, 100, 100),
        Role(5, Side.PLAYER, Type.ROLE, "p1", 0, 80, 60, 100, 100),
    )
    val enemy = listOf(
        Role(3, Side.ENEMY, Type.PET, "p1", 0, 80, 60, 100, 100),
        Role(5, Side.ENEMY, Type.PET, "p1", 0, 80, 60, 100, 100),
    )

    val self: Role = players.random()
    var state: FightState = WaitAction

    val fightInstruction = mutableListOf<FightInstruction>()
}

