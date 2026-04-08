package com.cc.ui

import com.badlogic.gdx.graphics.Color
import com.badlogic.gdx.graphics.g2d.SpriteBatch
import com.badlogic.gdx.graphics.glutils.ShapeRenderer
import com.cc.FontManager

/**
 * 公共 HUD —— 跨场景共享的玩家基本信息面板
 *
 * 放在屏幕底部（y=0 ~ hudH），显示：
 *   名字 / 等级 / HP 血条 / MP 蓝条 / 金币
 *
 * 用法：
 *   1. 在 GameScreen 里持有一个 HudOverlay 实例
 *   2. render() 里先用 shapeRenderer 画背景和条，再用 batch 画文字
 *   3. 场景切换时把同一个 HudOverlay 传给下一个场景，状态自然延续
 */
class HudOverlay(
    val mapW: Float = 600f,
    val hudH: Float = 60f
) {
    // 玩家数据（外部可直接修改）
    var playerName: String = "玩家一号"
    var level: Int = 12
    var hp: Int = 320
    val maxHp: Int = 500
    var mp: Int = 180
    val maxMp: Int = 300
    var gold: Int = 8800

    private val nameFont  = FontManager.createFont(18, Color.WHITE)
    private val statFont  = FontManager.createFont(16, Color.WHITE)
    private val shapeRenderer = ShapeRenderer()

    /** 画背景 + 血条/蓝条（需要 GL_BLEND 开启） */
    fun renderBars() {
        shapeRenderer.begin(ShapeRenderer.ShapeType.Filled)

        // 底栏背景
        shapeRenderer.setColor(0f, 0f, 0f, 0.82f)
        shapeRenderer.rect(0f, 0f, mapW, hudH)

        val barX = 120f
        val barW = 200f
        val barH = 10f

        // HP 底色
        shapeRenderer.setColor(0.3f, 0f, 0f, 1f)
        shapeRenderer.rect(barX, 38f, barW, barH)
        // HP 前景
        shapeRenderer.setColor(0.85f, 0.15f, 0.15f, 1f)
        shapeRenderer.rect(barX, 38f, barW * (hp.toFloat() / maxHp), barH)

        // MP 底色
        shapeRenderer.setColor(0f, 0f, 0.35f, 1f)
        shapeRenderer.rect(barX, 22f, barW, barH)
        // MP 前景
        shapeRenderer.setColor(0.2f, 0.45f, 0.95f, 1f)
        shapeRenderer.rect(barX, 22f, barW * (mp.toFloat() / maxMp), barH)

        shapeRenderer.end()
    }

    /** 画文字（在 batch.begin/end 内调用） */
    fun renderText(batch: SpriteBatch) {
        nameFont.draw(batch, "$playerName  Lv.$level", 8f, 50f)
        statFont.draw(batch, "HP $hp/$maxHp", 122f, 36f)
        statFont.draw(batch, "MP $mp/$maxMp", 122f, 20f)
        statFont.draw(batch, "金币: $gold", 340f, 50f)
    }

    fun dispose() {
        nameFont.dispose()
        statFont.dispose()
        shapeRenderer.dispose()
    }
}
