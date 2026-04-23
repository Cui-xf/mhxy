package com.cc.screens.fight2.model

import kotlin.random.Random


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

//模拟服务器装配指令
fun FightModel.installInstruction(skill: Skill, target: Role): Boolean {
    val target = when (skill.target) {
        SkillTarget.SINGLE_ENEMY, SkillTarget.SINGLE_ALLY -> listOf(target)
        SkillTarget.ALL_ENEMIES, SkillTarget.ALL_ALLIES -> {
            val role = if (target.side == Side.PLAYER) {
                players
            } else {
                enemy
            }
            val other = role.first { it.index != target.index }
            listOf(target, other)
        }
    }
    val result = target.map {
        Result(Field.HP, -Random.nextInt(30, 50) * skill.power)
    }

    fightInstruction += SkillCasting(self, skill, target, result)
    if (fightInstruction.size >= 1) {
        fightInstruction += FightFinish
        return true
    } else {
        return false
    }
}
