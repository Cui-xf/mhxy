package com.cc.screens.fight.model

data class Role(
    val index: Int,               // 战场位置 0-5
    val name: String,
    val job: RoleJob,
    val gender: RoleGender,
    val appearance: Appearance,
    val side: Side,
    val type: Type,         // 外观ID（用于拼动画资源名）
    var hp: Int,
    var mp: Int,
    val maxHp: Int,
    val maxMp: Int,
) {
    val isAlive get() = hp > 0
    val dir get() = if (side == Side.ALLY) Dir.Up else Dir.Down

    var animState: RoleAnimState
    var posX: Float
    var posY: Float

    init {
        val (x, y) = getPos()
        posX = x
        posY = y
        animState = RoleAnimState.Idle
    }
}

enum class Side { ALLY, ENEMY }
enum class Type { ROLE, PET }
enum class RoleAnimState { Idle, Move, Attack, Hit }
enum class RoleJob { JJF, FCS, LG }
enum class RoleGender { Boy, Girl }
enum class Appearance { Default }
enum class Dir { Up, Down, Left, Right }
enum class Ride {
    None,   //无
    RedDragon,//红色龙
    SomersaultCloud,//筋斗云
    RedWildebeest,  //红色角马
    Tiger,  //老虎
    IronWolf,//铁狼
    Turtle, //乌龟
    Phenix,//凤凰
}

private fun Role.getPos(): Pair<Float, Float> {
    val dx = 38
    val dy = 24
    val (centerX, centerY) = if (side == Side.ALLY) Pair(160f, 250f) else Pair(100f, 100f)
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