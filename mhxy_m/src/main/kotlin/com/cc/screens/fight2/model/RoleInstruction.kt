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

interface TargetableAction {
    var target: List<Role>
}

interface SkillEffectAction : TargetableAction {
    fun getSkillId(): Int?
}

sealed class RoleAction(val type: RoleActionType) {
    class Attack : RoleAction(RoleActionType.ATTACK), SkillEffectAction {
        override lateinit var target: List<Role>
        var skillId1: Int? = null
        override fun getSkillId(): Int? {
            return skillId1
        }
    }

    object Defend : RoleAction(RoleActionType.DEFEND)

    class Magic : RoleAction(RoleActionType.MAGIC), SkillEffectAction {
        override lateinit var target: List<Role>
        lateinit var skill: Skill
        override fun getSkillId(): Int {
            return skill.id
        }
    }

    class Item : RoleAction(RoleActionType.ITEM), SkillEffectAction {
        override lateinit var target: List<Role>
        lateinit var item: String
        override fun getSkillId(): Int {
            return 0
        }
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

