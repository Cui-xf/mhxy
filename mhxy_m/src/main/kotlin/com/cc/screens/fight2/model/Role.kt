package com.cc.screens.fight2.model

data class Role(
    val index: Int,               // 战场位置 0-5
    val side: Side,
    val type: Type,
    val name: String,
    val appearId: Int,         // 外观ID（用于拼动画资源名）
    var hp: Int,
    var mp: Int,
    val maxHp: Int,
    val maxMp: Int,
) {
    val isAlive get() = hp > 0
}

enum class Side { PLAYER, ENEMY }
enum class Type { ROLE, PET }
