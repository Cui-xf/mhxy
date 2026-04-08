package com.cc.ui

import com.badlogic.gdx.graphics.g2d.SpriteBatch
import com.badlogic.gdx.graphics.glutils.ShapeRenderer
import com.cc.FontManager

/**
 * 公共 HUD —— 跨场景共享的玩家基本信息面板（虚拟坐标 240×320）
 *
 * ShapeRenderer 由调用方传入，避免重复创建。
 * 调用顺序：
 *   1. renderBars(shapeRenderer)  —— 在 GL_BLEND 开启、shapeRenderer 未 begin 时调用
 *   2. renderText(batch)          —— 在 batch.begin/end 内调用
 */
class HudOverlay(
    val mapW: Float = 240f,
    val hudH: Float = 24f
) {
    var playerName: String = "玩家一号"
    var level : Int = 12
    var hp    : Int = 320;  val maxHp: Int = 500
    var mp    : Int = 180;  val maxMp: Int = 300
    var gold  : Int = 8800

    private val nameFont = FontManager.createFont(7)
    private val statFont = FontManager.createFont(6)

    fun renderBars(shapeRenderer: ShapeRenderer) {
        shapeRenderer.begin(ShapeRenderer.ShapeType.Filled)

        shapeRenderer.setColor(0f, 0f, 0f, 0.82f)
        shapeRenderer.rect(0f, 0f, mapW, hudH)

        val barX = 48f;  val barW = 80f;  val barH = 4f

        shapeRenderer.setColor(0.3f, 0f, 0f, 1f)
        shapeRenderer.rect(barX, 15f, barW, barH)
        shapeRenderer.setColor(0.85f, 0.15f, 0.15f, 1f)
        shapeRenderer.rect(barX, 15f, barW * (hp.toFloat() / maxHp), barH)

        shapeRenderer.setColor(0f, 0f, 0.35f, 1f)
        shapeRenderer.rect(barX, 9f, barW, barH)
        shapeRenderer.setColor(0.2f, 0.45f, 0.95f, 1f)
        shapeRenderer.rect(barX, 9f, barW * (mp.toFloat() / maxMp), barH)

        shapeRenderer.end()
    }

    fun renderText(batch: SpriteBatch) {
        nameFont.draw(batch, "$playerName Lv.$level", 3f, 20f)
        statFont.draw(batch, "HP $hp/$maxHp", 50f, 14f)
        statFont.draw(batch, "MP $mp/$maxMp", 50f,  8f)
        statFont.draw(batch, "金币:$gold",    136f, 20f)
    }

    fun dispose() {
        nameFont.dispose()
        statFont.dispose()
    }
}
