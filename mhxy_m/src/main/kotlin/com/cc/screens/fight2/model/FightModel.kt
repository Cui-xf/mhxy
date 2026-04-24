package com.cc.screens.fight2.model

import kotlin.random.Random


class FightModel {
    val ally = listOf(
        Role(0, Side.ALLY, Type.PET, "p1", 0, 80, 60, 100, 100),
        Role(1, Side.ALLY, Type.PET, "p1", 0, 80, 60, 100, 100),
        Role(2, Side.ALLY, Type.PET, "p1", 0, 80, 60, 100, 100),
        Role(3, Side.ALLY, Type.ROLE, "p1", 0, 80, 60, 100, 100),
        Role(4, Side.ALLY, Type.ROLE, "p1", 0, 80, 60, 100, 100),
        Role(5, Side.ALLY, Type.ROLE, "p1", 0, 80, 60, 100, 100),
    )
    val enemy = listOf(
        Role(3, Side.ENEMY, Type.PET, "p1", 0, 80, 60, 100, 100),
        Role(5, Side.ENEMY, Type.PET, "p1", 0, 80, 60, 100, 100),
    )

    val self: Role = ally[5]
    val pet: Role? = ally[2]

    var state: FightState = WaitAction(self)
    val fightInstruction = mutableListOf<FightInstruction>()

    var tipText: String = ""
}

//模拟服务器装配指令
fun FightModel.installInstruction(src: Role, skill: Skill, target: Role): Role? {
    if (src == self) {
        addInstruction(skill, target, src)
        if (pet != null) {
            return pet
        }
    } else if (src == pet) {
        addInstruction(skill, target, src)
        return null
    } else {
        throw RuntimeException("无效指令")
    }
    return null
}

private fun FightModel.addInstruction(skill: Skill, target: Role, src: Role) {
    val target = when (skill.target) {
        SkillTarget.SINGLE_ENEMY, SkillTarget.SINGLE_ALLY -> listOf(target)
        SkillTarget.ALL_ENEMIES, SkillTarget.ALL_ALLIES -> {
            val role = if (target.side == Side.ALLY) {
                ally
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
    fightInstruction += SkillCasting(src, skill, target, result)
}
