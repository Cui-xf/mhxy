package com.cc.screens.fight2.model

data class FightInstruction(
    val src: Role,
    val command: Command
)

sealed interface Command

data class SkillCasting(
    val skill: Skill,
    val target: List<Role>,
    val result: List<Result>
) : Command

data class Result(
    val field: Field,
    val value: Float,
)

enum class Field {
    HP, MP
}