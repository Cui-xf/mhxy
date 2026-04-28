package com.cc.screens.game.world

import com.badlogic.gdx.Gdx
import com.badlogic.gdx.graphics.GL20
import com.badlogic.gdx.graphics.Pixmap
import com.badlogic.gdx.graphics.Texture
import com.badlogic.gdx.graphics.g2d.SpriteBatch
import com.badlogic.gdx.graphics.g2d.TextureRegion
import com.badlogic.gdx.graphics.glutils.FrameBuffer
import com.badlogic.gdx.graphics.glutils.ShapeRenderer
import com.cc.asset.AssetLoader
import com.cc.screens.AbstractScreen.Companion.VIRTUAL_H
import com.cc.screens.AbstractScreen.Companion.VIRTUAL_W
import com.cc.screens.AbstractScreen.Companion.viewport
import com.cc.ui.component.UIComponent

class GameWorld(assetLoader: AssetLoader) : UIComponent(assetLoader) {
    val screenMap = ScreenMap(assetLoader)
    val npc = listOf(Npc(assetLoader, screenMap))
    private val monsters = mutableListOf(
        Monster(assetLoader, 1, screenMap, Player, 300f, 300f),
        Monster(assetLoader, 2, screenMap, Player, 500f, 200f),
        Monster(assetLoader, 3, screenMap, Player, 150f, 450f),
    ).also {
        it.forEach { monster ->
            monster.onEvent<Int> { fightId ->
                inFight = fightId
            }
        }
    }

    private val player = Player.also { it.map = screenMap }

    private var inFight: Int? = null

    override fun render(
        batch: SpriteBatch,
        sr: ShapeRenderer,
        cx: Float, cy: Float, cw: Float, ch: Float, delta: Float
    ) {
        inFight?.let {
            inFight = null
            emit(FightStarter(it, captureMapSnapshot(batch, sr)))
            return
        }

        screenMap.render(batch, sr, cx, cy, cw, ch, delta)
        player.render(batch, sr, cx, cy, cw, ch, delta)
        for (npc in npc) {
            npc.render(batch, sr, cx, cy, cw, ch, delta)
        }
        for (monster in monsters) {
            monster.render(batch, sr, cx, cy, cw, ch, delta)
        }
    }

    /** 用 FrameBuffer 渲染当前地图帧，拷贝为普通 Texture 后立即 dispose FBO */
    private fun captureMapSnapshot(batch: SpriteBatch, sr: ShapeRenderer): TextureRegion {
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

data class FightStarter(
    val id: Int,
    val mapSnapshot: TextureRegion,
)