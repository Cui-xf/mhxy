package com.cc.screens.game

import com.cc.screens.AbstractScreen

class GameScreen : AbstractScreen() {
    private val screenMap = ScreenMap(this.assetLoader)
    private val hud = HudUI.also { it.screenMap = this.screenMap }
    val player = Player(this.assetLoader, screenMap)
    val npc = listOf(
        Npc(this.assetLoader, screenMap),
    )
    private val miniMap = MiniMap(this.assetLoader, screenMap, this)
    val monsters = mutableListOf(
        Monster(this.assetLoader, 1, screenMap, player, 300f, 300f),
        Monster(this.assetLoader, 2, screenMap, player, 500f, 200f),
        Monster(this.assetLoader, 3, screenMap, player, 150f, 450f),
    ).also {
        it.forEach { monster -> monster.onEvent<Int> { fightId -> enterFight(fightId) } }
    }

    override fun update(delta: Float) {
        screenMap.render(batch, sr, 0f, 0f, VIRTUAL_W, VIRTUAL_H, delta)
        player.render(batch, sr, 0f, 0f, VIRTUAL_W, VIRTUAL_H, delta)
        for (npc in npc) {
            npc.render(batch, sr, 0f, 0f, VIRTUAL_W, VIRTUAL_H, delta)
        }
        for (monster in monsters) {
            monster.render(batch, sr, 0f, 0f, VIRTUAL_W, VIRTUAL_H, delta)
        }
//        miniMap.render(batch, sr, 0f, 0f, VIRTUAL_W, VIRTUAL_H, delta)
        hud.render(batch, sr, 0f, 0f, VIRTUAL_W, VIRTUAL_H, delta)
    }

    private fun enterFight(id: Int) {
        println("Entering fight $id")
    }
}