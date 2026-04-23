package com.cc.screens.fight2.model

enum class SkillTarget { SINGLE_ENEMY, ALL_ENEMIES, SINGLE_ALLY, ALL_ALLIES }

data class Skill(
    val id: Int,
    val name: String,
    val level: Int,
    val mpCost: Int,
    val target: SkillTarget,
    /** 伤害/治疗基数（相对普攻倍率，治疗为负表示回血） */
    val power: Float,
    /** 是否有技能特效动画（id >= 10） */
    val hasAnim: Boolean = true,
)

val SKILLS = listOf(
    Skill(1000, "火球术", 2, 20, SkillTarget.SINGLE_ENEMY, 1.8f),
    Skill(1001, "冰霜箭", 2, 18, SkillTarget.SINGLE_ENEMY, 1.6f),
    Skill(1002, "雷击", 2, 25, SkillTarget.ALL_ENEMIES, 1.2f),
    Skill(1003, "烈焰风暴", 2, 35, SkillTarget.ALL_ENEMIES, 1.0f),
    Skill(1004, "治愈术", 2, 15, SkillTarget.SINGLE_ALLY, -1.5f),  // 治疗
    Skill(1005, "群体治愈", 2, 30, SkillTarget.ALL_ALLIES, -1.0f),  // 群治
    Skill(1006, "圣光", 2, 28, SkillTarget.ALL_ENEMIES, 1.4f),
)
