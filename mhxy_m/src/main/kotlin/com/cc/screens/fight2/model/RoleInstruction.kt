package com.cc.screens.fight2.model

sealed interface Instruction

//结束
object FinishInstruction : Instruction

//角色指令
data class RoleInstruction(
    val src: Role,
    val action: RoleAction,
) : Instruction {
    var result: List<Result>? = null
}

enum class RoleActionType(val label: String) {
    ATTACK("攻击"),
    DEFEND("防御"),
    MAGIC("法术"),
    ITEM("道具"),
    ESCAPE("逃跑"),
}

sealed class RoleAction(val type: RoleActionType) {
    abstract class TargetableAction(type: RoleActionType) : RoleAction(type) {
        lateinit var target: List<Role>
    }

    class Attack : TargetableAction(RoleActionType.ATTACK) {
        var skillId: Int? = null
    }

    object Defend : RoleAction(RoleActionType.DEFEND)
    class Magic : TargetableAction(RoleActionType.MAGIC) {
        lateinit var skill: Skill
    }

    class Item : TargetableAction(RoleActionType.ITEM) {
        lateinit var item: String
    }

    object Escape : RoleAction(RoleActionType.ESCAPE)
}

data class Result(
    val field: Field,
    val value: Float,
)

enum class Field {
    HP, MP
}

