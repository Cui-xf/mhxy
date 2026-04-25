package com.cc.screens.fight.model

import kotlin.random.Random


class FightModel {
    val ally = listOf(
        Role(0, "p1", RoleJob.FCS, RoleGender.Boy, Appearance.Default, Side.ALLY, Type.PET, 80, 60, 100, 100),
        Role(1, "p1", RoleJob.FCS, RoleGender.Boy, Appearance.Default, Side.ALLY, Type.PET, 80, 60, 100, 100),
        Role(2, "p1", RoleJob.FCS, RoleGender.Boy, Appearance.Default, Side.ALLY, Type.PET, 80, 60, 100, 100),
        Role(3, "p1", RoleJob.FCS, RoleGender.Boy, Appearance.Default, Side.ALLY, Type.ROLE, 80, 60, 100, 100),
        Role(4, "p1", RoleJob.FCS, RoleGender.Boy, Appearance.Default, Side.ALLY, Type.ROLE, 80, 60, 100, 100),
        Role(5, "p1", RoleJob.LG, RoleGender.Girl, Appearance.Default, Side.ALLY, Type.ROLE, 80, 60, 100, 100),
    )
    val enemy = listOf(
        Role(3, "p1", RoleJob.FCS, RoleGender.Boy, Appearance.Default, Side.ENEMY, Type.ROLE, 80, 60, 100, 100),
        Role(5, "p1", RoleJob.FCS, RoleGender.Boy, Appearance.Default, Side.ENEMY, Type.ROLE, 80, 60, 100, 100),
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
        val action = RoleAction.Attack()
        action.target = listOf(ally[3])
        tempInstruction = RoleInstruction(enemy[0], action)
        tempInstruction?.result = listOf(Result(Field.HP, 10f))
        fightInstruction += tempInstruction!!
        tempInstruction = null
        WaitSync()
    } else {
        throw RuntimeException("无效指令")
    }
}

private fun FightModel.addInstruction() {
    (tempInstruction!!.action as? TargetableAction)?.target?.let {
        val result = it.map {
            Result(Field.HP, -Random.nextFloat() * 50)
        }
        tempInstruction!!.result = result
    }


    fightInstruction += tempInstruction!!
    tempInstruction = null
}
