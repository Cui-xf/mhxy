package com.cc.screens.fight2.model

sealed interface FightInstruction

data class SkillCasting(
    val src: Role,
    val skill: Skill,
    val target: List<Role>,
    val result: List<Result>
) : FightInstruction

data class Result(
    val field: Field,
    val value: Float,
)

enum class Field {
    HP, MP
}