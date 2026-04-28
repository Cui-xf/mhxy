package com.cc.screens.game.hud

import com.badlogic.gdx.graphics.Color
import com.badlogic.gdx.graphics.g2d.SpriteBatch
import com.badlogic.gdx.graphics.g2d.TextureRegion
import com.badlogic.gdx.graphics.glutils.ShapeRenderer
import com.cc.asset.AssetManagerFactory
import com.cc.asset.CommonAssetLoader
import com.cc.render.Align
import com.cc.render.drawImage
import com.cc.render.drawRect
import com.cc.screens.AbstractScreen
import com.cc.ui.component.UIComponent

object PlayerStatus : UIComponent(CommonAssetLoader) {

    // HUD 资源（publicUI）
    private val board by resource(AssetManagerFactory.PUBLIC_ASSET, "rpg/publicUI/board.pic", TextureRegion::class)
    private val board_ by resource(AssetManagerFactory.PUBLIC_ASSET, "rpg/publicUI/board_.pic", TextureRegion::class)

    //头像 {{"jm", "jf"}, {"fm", "ff"}, {"lm", "lf"}};
    private val avatar by resource(AssetManagerFactory.PUBLIC_ASSET, "rpg/publicUI/jm.pic", TextureRegion::class)

    //等级
    private val lvl by resource(AssetManagerFactory.PUBLIC_ASSET, "rpg/publicUI/lvl.pic", TextureRegion::class)

    // 模拟 GlobalStatus 数据（待接入服务器后替换）
    private var currentHealth = 80
    private var totalHealth = 100
    private var totalMana = 60
    private var currentMana = 100
    private var expLevel = 1

    private var level = 136
    private var hasBattleRegen = true
    private var frameCounter = 0L

    override fun render(
        batch: SpriteBatch,
        sr: ShapeRenderer,
        cx: Float,
        cy: Float,
        cw: Float,
        ch: Float,
        delta: Float
    ) {
        frameCounter++
        val x = AbstractScreen.VIRTUAL_W - 67f
        batch.begin()
        batch.drawImage(board, x, 5f, align = Align.LEFT_TOP)
        batch.drawImage(avatar, x + 37f, 8f, align = Align.LEFT_TOP)
        drawLevel(batch, x)
        batch.end()
        sr.begin(ShapeRenderer.ShapeType.Filled)
        val hpLen = if (totalHealth > 0) (currentHealth * 30 / totalHealth).toFloat() else 0f
        sr.drawRect(Color.valueOf("fb5b67ff"), x + 32f - hpLen, 7f, hpLen, 1f, Align.LEFT_TOP)
        sr.drawRect(Color.valueOf("ff1628ff"), x + 32f - hpLen, 8f, hpLen, 1f, Align.LEFT_TOP)
        sr.drawRect(Color.valueOf("b30204ff"), x + 32f - hpLen, 9f, hpLen, 1f, Align.LEFT_TOP)
        val mpLen = if (currentMana > 0) (totalMana * 30 / currentMana).toFloat() else 0f
        sr.drawRect(Color.valueOf("1d8eeeff"), x + 32f - mpLen, 13f, mpLen, 1f, Align.LEFT_TOP)
        sr.drawRect(Color.valueOf("0d73d2ff"), x + 32f - mpLen, 14f, mpLen, 1f, Align.LEFT_TOP)
        sr.drawRect(Color.valueOf("005299ff"), x + 32f - mpLen, 15f, mpLen, 1f, Align.LEFT_TOP)
        val expLen = when (expLevel) {
            0 -> 30f; 1 -> 20f; 2 -> 10f; else -> 0f
        }
        sr.drawRect(Color.valueOf("e1ffaaff"), x + 32f - expLen, 19f, expLen, 1f, Align.LEFT_TOP)
        sr.drawRect(Color.valueOf("a5ea2bff"), x + 32f - expLen, 20f, expLen, 1f, Align.LEFT_TOP)
        sr.drawRect(Color.valueOf("6eaa05ff"), x + 32f - expLen, 21f, expLen, 1f, Align.LEFT_TOP)
        if (hasBattleRegen) {
            val bgColor = if (frameCounter % 8L / 4L == 0L) Color.valueOf("f3e88cff") else Color.valueOf("f36f17ff")
            sr.drawRect(
                bgColor,
                x + 2f, 24f,
                (board_.regionWidth - 2).toFloat(),
                board_.regionHeight.toFloat(),
                Align.LEFT_TOP
            )
        }
        sr.end()
        if (hasBattleRegen) {
            batch.begin()
            batch.drawImage(board_, x, 24f, align = Align.LEFT_TOP)
            batch.end()
        }
    }

    private fun drawLevel(batch: SpriteBatch, x: Float) {
        val n = level
        when {
            n < 10 -> drawDigit(batch, n % 10, x + 23f, 25f)
            n <= 99 -> {
                drawDigit(batch, n / 10, x + 20f, 25f)
                drawDigit(batch, n % 10, x + 25f, 25f)
            }
            else -> {
                drawDigit(batch, n / 100, x + 18f, 25f)
                drawDigit(batch, (n - n / 100 * 100) / 10, x + 23f, 25f)
                drawDigit(batch, n % 10, x + 28f, 25f)
            }
        }
    }

    private fun drawDigit(batch: SpriteBatch, digit: Int, px: Float, py: Float) {
        val region = TextureRegion(lvl.texture, digit * 5, 0, 5, 7)
        batch.drawImage(region, px, py, align = Align.LEFT_TOP)
    }
}