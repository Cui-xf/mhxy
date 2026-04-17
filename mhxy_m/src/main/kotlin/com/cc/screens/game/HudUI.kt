package com.cc.screens.game

import com.badlogic.gdx.graphics.Color.valueOf
import com.badlogic.gdx.graphics.g2d.SpriteBatch
import com.badlogic.gdx.graphics.g2d.TextureRegion
import com.badlogic.gdx.graphics.glutils.ShapeRenderer
import com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType
import com.cc.asset.AssetManagerFactory.PUBLIC_ASSET
import com.cc.asset.CommonAssetLoader
import com.cc.render.Align
import com.cc.render.drawImage
import com.cc.render.drawRect
import com.cc.screens.AbstractScreen.Companion.VIRTUAL_W
import com.cc.ui.component.UIComponent


object HudUI : UIComponent(CommonAssetLoader) {
    lateinit var screenMap: ScreenMap

    // HUD 资源（publicUI）
    private val board by resource(PUBLIC_ASSET, "rpg/publicUI/board.pic", TextureRegion::class) // board 底板
    private val board_ by resource(PUBLIC_ASSET, "rpg/publicUI/board_.pic", TextureRegion::class)    // board+ 战斗回血底板

    //头像 {{"jm", "jf"}, {"fm", "ff"}, {"lm", "lf"}};
    private val avatar by resource(PUBLIC_ASSET, "rpg/publicUI/jm.pic", TextureRegion::class)      // 角色头像 jm

    //等级
    private val lvl by resource(PUBLIC_ASSET, "rpg/publicUI/lvl.pic", TextureRegion::class) // 数字精灵（用不到整体，占位加载用）

    // 模拟 GlobalStatus 数据（待接入服务器后替换）
    private var currentHealth = 80
    private var totalHealth = 100
    private var totalMana = 60
    private var currentMana = 100   // 原始公式 totalMana*30/currentMana，分母是 currentMana
    private var expLevel = 1        // 0=full, 1=2/3, 2=1/3

    //等级
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
        // var2 = defaultWidth - 67 = 240 - 67 = 173
        val x = VIRTUAL_W - 67f
        // board 底板（62×30），左上角 (x, 5)
        batch.begin()
        batch.drawImage(board, x, 5f, align = Align.LEFT_TOP)
        // 角色头像（20×24），左上角 (x+37, 8)
        batch.drawImage(avatar, x + 37f, 8f, align = Align.LEFT_TOP)
        // 背包格数：数字精灵 index 1~10 对应数字 0~9
        // 从 lvlPic 里按 region index 切出各数字
        drawLevel(batch, x)
        batch.end()
        // 血条（3行渐变红线），右端 x+32=205，y=7/8/9
        sr.begin(ShapeType.Filled)
        val hpLen = if (totalHealth > 0) (currentHealth * 30 / totalHealth).toFloat() else 0f
        sr.drawRect(valueOf("fb5b67ff"), x + 32f - hpLen, 7f, hpLen, 1f, Align.LEFT_TOP)
        sr.drawRect(valueOf("ff1628ff"), x + 32f - hpLen, 8f, hpLen, 1f, Align.LEFT_TOP)
        sr.drawRect(valueOf("b30204ff"), x + 32f - hpLen, 9f, hpLen, 1f, Align.LEFT_TOP)
        // 蓝条（3行渐变蓝线），右端 x+32，y=13/14/15
        val mpLen = if (currentMana > 0) (totalMana * 30 / currentMana).toFloat() else 0f
        sr.drawRect(valueOf("1d8eeeff"), x + 32f - mpLen, 13f, mpLen, 1f, Align.LEFT_TOP)
        sr.drawRect(valueOf("0d73d2ff"), x + 32f - mpLen, 14f, mpLen, 1f, Align.LEFT_TOP)
        sr.drawRect(valueOf("005299ff"), x + 32f - mpLen, 15f, mpLen, 1f, Align.LEFT_TOP)
        // 经验条（3行渐变棕线），右端 x+32，y=19/20/21
        val expLen = when (expLevel) {
            0 -> 30f; 1 -> 20f; 2 -> 10f; else -> 0f
        }
        sr.drawRect(valueOf("e1ffaaff"), x + 32f - expLen, 19f, expLen, 1f, Align.LEFT_TOP)
        sr.drawRect(valueOf("a5ea2bff"), x + 32f - expLen, 20f, expLen, 1f, Align.LEFT_TOP)
        sr.drawRect(valueOf("6eaa05ff"), x + 32f - expLen, 21f, expLen, 1f, Align.LEFT_TOP)
        // 战斗回血图标 br（board+, 16×10）
        if (hasBattleRegen) {
            val bgColor = if (frameCounter % 8L / 4L == 0L) valueOf("f3e88cff") else valueOf("f36f17ff")
            sr.drawRect(
                bgColor,
                x + 2f,
                24f,
                (board_.regionWidth - 2).toFloat(),
                board_.regionHeight.toFloat(),
                Align.LEFT_TOP
            )
        }
        sr.end()
        // board+ 图标叠在色块上
        if (hasBattleRegen) {
            batch.begin()
            batch.drawImage(board_, x, 24f, align = Align.LEFT_TOP)
            batch.end()
        }
    }

    private fun drawLevel(batch: SpriteBatch, x: Float) {
        // lvl 精灵：index 1~10 = 数字 0~9，每个 5×7，在 png 中 x=(index-1)*5, y=0
        // 位置参考原始代码：1位数 x+23，2位数 x+20/x+25，3位数 x+18/x+23/x+28，y=25
        val n = level
        when {
            n < 10 -> {
                drawDigit(batch, n % 10, x + 23f, 25f)
            }

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

    // lvl png 宽50px：index 1~10 对应数字 0~9，每格 5×7，从 x=(digit)*5 处取
    private fun drawDigit(batch: SpriteBatch, digit: Int, px: Float, py: Float) {
        val region = TextureRegion(lvl.texture, digit * 5, 0, 5, 7)
        batch.drawImage(region, px, py, align = Align.LEFT_TOP)
    }
}