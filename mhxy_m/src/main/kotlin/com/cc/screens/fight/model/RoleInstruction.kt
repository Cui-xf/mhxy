package com.cc.screens.fight.model

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
    fun getResId(): String?
}

sealed class RoleAction(val type: RoleActionType) {
    class Attack : RoleAction(RoleActionType.ATTACK), SkillEffectAction {
        override lateinit var target: List<Role>
        var skillId: Int? = null
        override fun getResId(): String? {
            return null
        }
    }

    object Defend : RoleAction(RoleActionType.DEFEND)

    class Magic : RoleAction(RoleActionType.MAGIC), SkillEffectAction {
        override lateinit var target: List<Role>
        lateinit var skill: Skill
        override fun getResId(): String {
            return skill.resId
        }
    }

    class Item : RoleAction(RoleActionType.ITEM), SkillEffectAction {
        override lateinit var target: List<Role>
        lateinit var item: String
        override fun getResId(): String? {
            return null
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

