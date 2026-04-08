package com.cc.ui

import com.badlogic.gdx.Gdx
import com.badlogic.gdx.Input
import com.badlogic.gdx.graphics.Color
import com.badlogic.gdx.graphics.g2d.SpriteBatch
import com.badlogic.gdx.graphics.glutils.ShapeRenderer
import com.cc.FontManager

/**
 * 按键弹出地图面板（虚拟坐标 240×320）—— 按 M 打开/关闭
 *
 * 每个场景创建自己的实例，传入场景专属数据。
 * ShapeRenderer 由调用方传入。
 * 调用顺序：
 *   1. handleInput()                           —— render 最开始
 *   2. renderPanel(shapeRenderer, nx, ny)      —— GL_BLEND 开启时
 *   3. renderText(batch)                       —— batch.begin/end 内
 */
class MapOverlay(
    val sceneName  : String,
    val mapMarkers : List<Triple<Float, Float, String>> = emptyList(),
    private val mapW: Float = 240f,
    private val mapH: Float = 296f
) {
    var isOpen: Boolean = false

    private val panelW = 128f;  private val panelH = 120f
    private val panelX = (mapW - panelW) / 2f
    private val panelY = (mapH - panelH) / 2f + 24f

    private val miniX = panelX + 8f;   private val miniY = panelY + 16f
    private val miniW = panelW - 16f;  private val miniH = panelH - 32f

    private val titleFont = FontManager.createFont(7, Color.YELLOW)
    private val labelFont = FontManager.createFont(6, Color.WHITE)

    fun handleInput() {
        if (Gdx.input.isKeyJustPressed(Input.Keys.M)) isOpen = !isOpen
    }

    fun renderPanel(shapeRenderer: ShapeRenderer, playerNormX: Float, playerNormY: Float) {
        if (!isOpen) return

        shapeRenderer.begin(ShapeRenderer.ShapeType.Filled)

        shapeRenderer.setColor(0f, 0f, 0f, 0.88f)
        shapeRenderer.rect(panelX, panelY, panelW, panelH)

        shapeRenderer.setColor(0.1f, 0.18f, 0.12f, 1f)
        shapeRenderer.rect(miniX, miniY, miniW, miniH)

        shapeRenderer.setColor(0.3f, 0.45f, 0.35f, 0.5f)
        for (i in 1..3) {
            shapeRenderer.rect(miniX + miniW * i / 4f, miniY, 1f, miniH)
            shapeRenderer.rect(miniX, miniY + miniH * i / 4f, miniW, 1f)
        }

        for ((nx, ny, _) in mapMarkers) {
            shapeRenderer.setColor(1f, 0.85f, 0.1f, 0.9f)
            shapeRenderer.circle(miniX + nx * miniW, miniY + ny * miniH, 2.5f)
        }

        shapeRenderer.setColor(0.2f, 1f, 0.3f, 1f)
        shapeRenderer.circle(miniX + playerNormX * miniW, miniY + playerNormY * miniH, 3f)

        shapeRenderer.end()

        shapeRenderer.begin(ShapeRenderer.ShapeType.Line)
        shapeRenderer.setColor(0.7f, 0.7f, 0.5f, 1f)
        shapeRenderer.rect(panelX, panelY, panelW, panelH)
        shapeRenderer.rect(miniX,  miniY,  miniW,  miniH)
        shapeRenderer.end()
    }

    fun renderText(batch: SpriteBatch) {
        if (!isOpen) return

        titleFont.draw(batch, "[ $sceneName 地图 ]", panelX + 16f, panelY + panelH - 3f)
        labelFont.draw(batch, "M关闭", panelX + panelW - 22f, panelY + panelH - 4f)

        for ((nx, ny, label) in mapMarkers) {
            labelFont.draw(batch, label, miniX + nx * miniW + 3f, miniY + ny * miniH + 3f)
        }

        labelFont.draw(batch, "●你  ●NPC", panelX + 4f, panelY + 8f)
    }

    fun dispose() {
        titleFont.dispose()
        labelFont.dispose()
    }
}
