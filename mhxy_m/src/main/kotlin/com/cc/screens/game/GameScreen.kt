package com.cc.screens.game

import com.badlogic.gdx.Gdx
import com.badlogic.gdx.graphics.GL20
import com.badlogic.gdx.graphics.Pixmap
import com.badlogic.gdx.graphics.Texture
import com.badlogic.gdx.graphics.g2d.TextureRegion
import com.badlogic.gdx.graphics.glutils.FrameBuffer
import com.cc.MhxyGame
import com.cc.screens.AbstractScreen
import com.cc.screens.fight.FightScreen

class GameScreen : AbstractScreen() {
    private val screenMap = ScreenMap(this.assetLoader)
    val player = Player.also { it.map = screenMap }
    private val hud = HudUI.also { it.screenMap = this.screenMap }
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

    override fun init() {
        screenMap.collisionMove(player.roleMapX, 0f, player.roleMapY, 0f)
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
        MhxyGame.setScreen(FightScreen(captureMapSnapshot()))
    }

    /** 用 FrameBuffer 渲染当前地图帧，拷贝为普通 Texture 后立即 dispose FBO */
    private fun captureMapSnapshot(): TextureRegion {
        val w = VIRTUAL_W.toInt()
        val h = VIRTUAL_H.toInt()
        val fb = FrameBuffer(Pixmap.Format.RGBA8888, w, h, false)
        fb.begin()
        Gdx.gl.glClearColor(0f, 0f, 0f, 1f)
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT)
        batch.projectionMatrix = viewport.camera.combined
        screenMap.render(batch, sr, 0f, 0f, VIRTUAL_W, VIRTUAL_H, 0f)
        val pm = Pixmap.createFromFrameBuffer(0, 0, w, h)
        fb.end()
        fb.dispose()
        viewport.apply()
        val tex = TextureRegion(Texture(pm))
        tex.flip(false, true)
        pm.dispose()
        return tex
    }
}
