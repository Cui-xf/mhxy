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
    val monsters = listOf(
        Monster(this.assetLoader, screenMap, 300f, 300f, player),
        Monster(this.assetLoader, screenMap, 500f, 200f, player),
        Monster(this.assetLoader, screenMap, 150f, 450f, player),
    )

    override fun update(delta: Float) {
        screenMap.render(batch, sr, 0f, 0f, VIRTUAL_W, VIRTUAL_H, delta)
        player.render(batch, sr, 0f, 0f, VIRTUAL_W, VIRTUAL_H, delta)
        for (npc in npc) {
            npc.render(batch, sr, 0f, 0f, VIRTUAL_W, VIRTUAL_H, delta)
        }
        for (monster in monsters) {
            monster.render(batch, sr, 0f, 0f, VIRTUAL_W, VIRTUAL_H, delta)
            if (monster.collidesWith(player.roleMapX, player.roleMapY)) {
                // TODO: 切换到战斗界面
                println("触发战斗！怪物位置=(${monster.mapX}, ${monster.mapY})")
            }
        }
//        miniMap.render(batch, sr, 0f, 0f, VIRTUAL_W, VIRTUAL_H, delta)
        hud.render(batch, sr, 0f, 0f, VIRTUAL_W, VIRTUAL_H, delta)
    }

}