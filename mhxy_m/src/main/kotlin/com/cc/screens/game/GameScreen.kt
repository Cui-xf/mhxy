package com.cc.screens.game

import com.cc.screens.AbstractScreen

class GameScreen : AbstractScreen() {
    private val screenMap = ScreenMap(this.assetLoader)
    val player = Player(this.assetLoader, screenMap)
    val npc = listOf(
        Npc(this.assetLoader, screenMap),
    )
    private val miniMap = MiniMap(this.assetLoader, screenMap, this)

    override fun update(delta: Float) {
        screenMap.render(batch, sr, 0f, 0f, VIRTUAL_W, VIRTUAL_H, delta)
        player.render(batch, sr, 0f, 0f, VIRTUAL_W, VIRTUAL_H, delta)
        for (npc in npc) {
            npc.render(batch, sr, 0f, 0f, VIRTUAL_W, VIRTUAL_H, delta)
        }
        miniMap.render(batch, sr, 0f, 0f, VIRTUAL_W, VIRTUAL_H, delta)
    }
}