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
    var animState: RoleAnimState
    var posX: Float
    var posY: Float

    init {
        val (x, y) = getPos()
        posX = x
        posY = y
        animState = RoleAnimState.IDLE
    }
}

enum class Side { PLAYER, ENEMY }
enum class Type { ROLE, PET }
enum class RoleAnimState { IDLE, ATTACKING, HIT }


private fun Role.getPos(): Pair<Float, Float> {
    val dx = 38
    val dy = 24
    val (centerX, centerY) = if (this.side == Side.PLAYER) Pair(160f, 250f) else Pair(100f, 100f)
    return when (index) {
        0 -> Pair(centerX - dx * 2, centerY)
        1 -> Pair(centerX - dx * 1, centerY - dy * 1)
        2 -> Pair(centerX, centerY - dy * 2)
        3 -> Pair(centerX - dx * 1, centerY + dy * 1)
        4 -> Pair(centerX, centerY)
        5 -> Pair(centerX + dx * 1, centerY - dy * 1)
        else -> throw RuntimeException("无效的坐标")
    }
}