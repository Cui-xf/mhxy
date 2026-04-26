package com.cc.screens.fight.model

/** 道具数据 */
data class ItemData(
    val id: Int,
    val name: String,
    val iconRes: String,
    val defense: String? = null,
    val hp: Int? = null,
    val mp: Int? = null,
)