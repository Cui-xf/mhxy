package com.cc.ui

import com.badlogic.gdx.Gdx
import com.badlogic.gdx.Input
import com.badlogic.gdx.graphics.Color
import com.badlogic.gdx.graphics.g2d.SpriteBatch
import com.badlogic.gdx.graphics.glutils.ShapeRenderer
import com.cc.FontManager

/**
 * 按键弹出地图面板 —— 按 M 打开/关闭
 *
 * 每个场景持有自己的 MapOverlay 实例，传入该场景专属的数据：
 *   - sceneName  : 场景名称
 *   - mapMarkers : 地图上的标记点列表（归一化坐标 0~1，附标签）
 *
 * 地图面板是一个半透明弹窗，显示在屏幕中央。
 * 玩家位置用小圆点实时标记。
 *
 * 用法：
 *   1. GameScreen 构造时创建 MapOverlay("场景一", markers)
 *   2. render() 里：
 *      a. handleInput() 处理 M 键
 *      b. 若 isOpen，先 renderPanel()（shapeRenderer），再 renderText(batch, px, py)
 */
class MapOverlay(
    val sceneName: String,
    /** 标记点：Triple(归一化x 0~1, 归一化y 0~1, 标签) */
    val mapMarkers: List<Triple<Float, Float, String>> = emptyList(),
    private val mapW: Float = 600f,
    private val mapH: Float = 740f
) {
    var isOpen: Boolean = false

    // 面板尺寸和位置（屏幕中央）
    private val panelW = 320f
    private val panelH = 300f
    private val panelX = (mapW - panelW) / 2f
    private val panelY = (mapH - panelH) / 2f + 60f   // +hudH 偏移

    // 迷你地图绘制区域（面板内留边距）
    private val miniX = panelX + 20f
    private val miniY = panelY + 40f
    private val miniW = panelW - 40f
    private val miniH = panelH - 80f

    private val titleFont  = FontManager.createFont(22, Color.YELLOW)
    private val labelFont  = FontManager.createFont(14, Color.WHITE)
    private val shapeRenderer = ShapeRenderer()

    /** 处理 M 键切换，放在 render() 最开始调用 */
    fun handleInput() {
        if (Gdx.input.isKeyJustPressed(Input.Keys.M)) {
            isOpen = !isOpen
        }
    }

    /** 画面板背景 + 格子 + 标记点 + 玩家点（需 GL_BLEND 开启） */
    fun renderPanel(playerNormX: Float, playerNormY: Float) {
        if (!isOpen) return

        shapeRenderer.begin(ShapeRenderer.ShapeType.Filled)

        // 半透明黑色背景
        shapeRenderer.setColor(0f, 0f, 0f, 0.88f)
        shapeRenderer.rect(panelX, panelY, panelW, panelH)

        // 迷你地图底色
        shapeRenderer.setColor(0.1f, 0.18f, 0.12f, 1f)
        shapeRenderer.rect(miniX, miniY, miniW, miniH)

        // 网格线（简单分 4×4）
        shapeRenderer.setColor(0.3f, 0.45f, 0.35f, 0.5f)
        for (i in 1..3) {
            val gx = miniX + miniW * i / 4f
            shapeRenderer.rect(gx, miniY, 1f, miniH)
            val gy = miniY + miniH * i / 4f
            shapeRenderer.rect(miniX, gy, miniW, 1f)
        }

        // 场景标记点（黄色圆）
        for ((nx, ny, _) in mapMarkers) {
            shapeRenderer.setColor(1f, 0.85f, 0.1f, 0.9f)
            shapeRenderer.circle(miniX + nx * miniW, miniY + ny * miniH, 6f)
        }

        // 玩家位置（绿色圆）
        shapeRenderer.setColor(0.2f, 1f, 0.3f, 1f)
        shapeRenderer.circle(
            miniX + playerNormX * miniW,
            miniY + playerNormY * miniH,
            7f
        )

        shapeRenderer.end()

        // 面板边框
        shapeRenderer.begin(ShapeRenderer.ShapeType.Line)
        shapeRenderer.setColor(0.7f, 0.7f, 0.5f, 1f)
        shapeRenderer.rect(panelX, panelY, panelW, panelH)
        shapeRenderer.rect(miniX, miniY, miniW, miniH)
        shapeRenderer.end()
    }

    /** 画文字标签（在 batch.begin/end 内调用） */
    fun renderText(batch: SpriteBatch) {
        if (!isOpen) return

        titleFont.draw(batch, "[ $sceneName 地图 ]", panelX + 60f, panelY + panelH - 8f)
        labelFont.draw(batch, "M 关闭", panelX + panelW - 56f, panelY + panelH - 10f)

        // 标记点标签
        for ((nx, ny, label) in mapMarkers) {
            labelFont.draw(
                batch, label,
                miniX + nx * miniW + 8f,
                miniY + ny * miniH + 6f
            )
        }

        // 绿点标签
        labelFont.draw(batch, "你", miniX + 2f, panelY + 20f)
        labelFont.draw(batch, "● 你在这里", panelX + 8f, panelY + 20f)
        labelFont.draw(batch, "● NPC/地标", panelX + 110f, panelY + 20f)
    }

    fun dispose() {
        titleFont.dispose()
        labelFont.dispose()
        shapeRenderer.dispose()
    }
}
