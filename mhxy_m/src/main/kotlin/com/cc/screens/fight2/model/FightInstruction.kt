package com.cc.screens.fight2.model

data class FightInstruction(
    val src: Role,
    val command: Command
)

sealed interface Command

data class SkillCasting(
    val skill: Skill,
    val target: Role,
) : Command