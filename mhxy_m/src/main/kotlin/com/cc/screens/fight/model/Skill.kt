package com.cc.screens.fight.model

enum class SkillTarget { SINGLE_ENEMY, ALL_ENEMIES, SINGLE_ALLY, ALL_ALLIES }

data class Skill(
    val resId: String,
    val name: String,
    val icon: Int,
    val level: Int,
    val mpCost: Int,
    val target: SkillTarget,
    /** 伤害/治疗基数（相对普攻倍率，治疗为负表示回血） */
    val power: Float,
    /** 是否有技能特效动画（id >= 10） */
    val hasAnim: Boolean = true,
)

val SKILLS = listOf(
//Skill: id=1 name=普通攻击 iconId=1000 animId=1
//Skill: id=10 name=宠物捕捉 iconId=3103 animId=10
    Skill("12", "剧毒龙炎", 3115, 2, 20, SkillTarget.ALL_ENEMIES, 1.8f),
    Skill("28", "宁心诀", 3104, 2, 18, SkillTarget.SINGLE_ALLY, 1.6f),
//    Skill("13", "凝冰术", 3101, 2, 25, SkillTarget.ALL_ENEMIES, 1.2f),
//    Skill("14", "甘霖咒", 3122, 2, 35, SkillTarget.ALL_ENEMIES, 1.0f),
//    Skill("16", "龙抬头", 2007, 2, 15, SkillTarget.SINGLE_ALLY, -1.5f),  // 治疗
//    Skill("20", "玉龙诀", 3108, 2, 30, SkillTarget.ALL_ALLIES, -1.0f),  // 群治
//    Skill("21", "飞龙在天", 3105, 2, 28, SkillTarget.ALL_ENEMIES, 1.4f),
//    Skill("22", "散雷诀", 3121, 2, 28, SkillTarget.ALL_ENEMIES, 1.4f),
//    Skill("23", "青龙护体", 3105, 2, 28, SkillTarget.ALL_ENEMIES, 1.4f),
//
//    Skill("24", "挥戈退日", 3114, 2, 20, SkillTarget.SINGLE_ENEMY, 1.8f),
//    Skill("25", "回马枪", 3109, 2, 18, SkillTarget.SINGLE_ENEMY, 1.6f),
//    Skill("26", "奋力一击", 3118, 2, 25, SkillTarget.ALL_ENEMIES, 1.2f),
//    Skill("27", "火攻术", 3111, 2, 35, SkillTarget.ALL_ENEMIES, 1.0f),
//    Skill("28", "乱中取胜", 3121, 2, 15, SkillTarget.SINGLE_ALLY, -1.5f),  // 治疗
//    Skill("29", "破阵枪法", 3119, 2, 30, SkillTarget.ALL_ALLIES, -1.0f),  // 群治
//    Skill("30", "铁布衫", 3112, 2, 28, SkillTarget.ALL_ENEMIES, 1.4f),
//    Skill("31", "金刚诀", 3107, 2, 28, SkillTarget.ALL_ENEMIES, 1.4f),
//    Skill("32", "战甲精炼", 3122, 2, 28, SkillTarget.ALL_ENEMIES, 1.4f),
)
