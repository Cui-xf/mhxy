package com.cc.screens.base

import com.badlogic.gdx.Gdx
import com.badlogic.gdx.graphics.Texture
import com.badlogic.gdx.graphics.g2d.SpriteBatch
import com.badlogic.gdx.graphics.glutils.ShapeRenderer
import com.cc.asset.AssetManagerFactory.PUBLIC_ASSET
import com.cc.asset.CommonAssetLoader
import com.cc.asset.RpgAnimation
import com.cc.render.Align
import com.cc.render.drawAnimation
import com.cc.render.drawImage
import com.cc.screens.AbstractScreen.Companion.VIRTUAL_H
import com.cc.screens.AbstractScreen.Companion.VIRTUAL_W
import com.cc.ui.component.UIComponent
import kotlin.random.Random

object BaseBackGround : UIComponent(CommonAssetLoader) {
    private val menuBG = Texture(Gdx.files.classpath("assets/menuBG.png"))
    private val logoTitle = Texture(Gdx.files.classpath("assets/logoTitle_B.png"))
    private val light0 = Texture(Gdx.files.classpath("assets/light_0.png"))
    private val light1 = Texture(Gdx.files.classpath("assets/light_1.png"))

    private val hudie by resource(PUBLIC_ASSET, "rpg/cartoon/hudie.anim", RpgAnimation::class)
    private val hudie2 by resource(PUBLIC_ASSET, "rpg/cartoon/hudie_2.anim", RpgAnimation::class)

    // 原始绘制坐标：defaultWidth-100, defaultHigh-100，屏幕 240×320 → (140, 220)
    private val ANIM_X = VIRTUAL_W - 100f
    private val ANIM_Y = VIRTUAL_H - 100f

    // 粒子 X 锚点（均匀分布，对应原始 mainPageButton_Y）
    private val particleAnchors = FloatArray(8) { i -> VIRTUAL_W / 9f * (i + 1) }

    // 粒子状态：[x, y, dx, dy, type]，共 8 个
    private val particles = Array(8) { newParticle() }
    private var running = true
    private var timer = 0f   // 动画累计时间（移动时推进）
    override fun render(
        batch: SpriteBatch,
        sr: ShapeRenderer,
        cx: Float,
        cy: Float,
        cw: Float,
        ch: Float,
        delta: Float
    ) {
        if (!CommonAssetLoader.isFinished()) {
            CommonAssetLoader.update()
            return
        }

        if (running) {
            timer += delta
        }
        batch.begin()
        batch.drawImage(menuBG, VIRTUAL_W / 2, 0f)
        batch.drawImage(logoTitle, VIRTUAL_W / 2, 29f)
        batch.drawAnimation(hudie.getKeyFrame(timer, true), ANIM_X, ANIM_Y)
        batch.drawAnimation(hudie2.getKeyFrame(timer, true), ANIM_X, ANIM_Y)
        drawLightParticles(batch, delta)
        batch.end()
    }

    fun pause() {
        running = false
    }

    fun resume() {
        running = true
    }

    private fun drawLightParticles(batch: SpriteBatch, timer: Float) {
        val counter = (timer * 60).toInt()
        for (p in particles) {
            if (running) {
                if (p[0] in 0f..VIRTUAL_W && p[1] >= 0) {
                    if (counter and 1 == 0) {
                        p[0] += if (Random.nextInt(10, 41) % 2 == 0) -p[2] else p[2]
                        p[1] -= p[3]
                    }
                } else {
                    val np = newParticle()
                    np.copyInto(p)
                }
            }
            val tex = if (p[4] == 0f) light0 else light1
            batch.drawImage(tex, p[0], p[1], align = Align.LEFT)
        }
    }

    private fun newParticle(): FloatArray {
        return floatArrayOf(
            particleAnchors[Random.nextInt(8)],          // x
            VIRTUAL_H + Random.nextInt(1, 201).toFloat(), // y（屏幕下方）
            1f,                                            // dx
            1f,                                            // dy
            (Random.nextInt(1, 101) % 2).toFloat()        // type: 0=light0, 1=light1
        )
    }

    override fun dispose() {
        menuBG.dispose()
        logoTitle.dispose()
        light0.dispose()
        light1.dispose()
    }
}