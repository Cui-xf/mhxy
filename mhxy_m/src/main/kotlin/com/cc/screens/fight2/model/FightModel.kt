package com.cc.screens.fight2.model


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
    val fightInstruction = mutableListOf<RoleInstruction>()

    var tempInstruction: RoleInstruction? = null

    var tipText: String = ""
}

//模拟服务器装配指令
fun FightModel.installInstruction(): FightState {
    return if (tempInstruction?.src == self) {
        addInstruction()
        if (pet != null) {
            WaitAction(pet)
        } else {
            WaitSync()
        }
    } else if (tempInstruction?.src == pet) {
        addInstruction()
        WaitSync()
    } else {
        throw RuntimeException("无效指令")
    }
}

private fun FightModel.addInstruction() {
//    val skill = (tempInstruction?.action as? RoleAction.Magic)?.skill
//    if (skill != null) {
//        val target = when (skill.target) {
//            SkillTarget.SINGLE_ENEMY, SkillTarget.SINGLE_ALLY -> null
//            SkillTarget.ALL_ENEMIES, SkillTarget.ALL_ALLIES -> {
//                val role = if (target.side == Side.ALLY) {
//                    ally
//                } else {
//                    enemy
//                }
//                val other = role.first { it.index != target.index }
//                listOf(target, other)
//            }
//        }
//        val result = target.map {
//            Result(Field.HP, -Random.nextInt(30, 50) * skill.power)
//        }
//    }
    fightInstruction += tempInstruction!!
    tempInstruction = null
}
