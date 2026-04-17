package com.cc.screens.game

import com.cc.screens.AbstractScreen

class GameScreen : AbstractScreen() {
    private val screenMap = ScreenMap(this.assetLoader)
    private val player = Player(this.assetLoader, screenMap)

    override fun update(delta: Float) {
        screenMap.render(batch, sr, 0f, 0f, VIRTUAL_W, VIRTUAL_H, delta)
        player.render(batch, sr, 0f, 0f, VIRTUAL_W, VIRTUAL_H, delta)
    }
}