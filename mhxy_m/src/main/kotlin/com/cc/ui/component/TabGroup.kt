package com.cc.ui.component

import com.badlogic.gdx.graphics.Color
import com.badlogic.gdx.graphics.g2d.SpriteBatch
import com.badlogic.gdx.graphics.glutils.ShapeRenderer
import com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType
import com.cc.FontManager.SMALL_FONT
import com.cc.asset.AssetLoader
import com.cc.event.TouchContext
import com.cc.render.Align
import com.cc.render.drawRect
import com.cc.render.drawString
import com.cc.render.toColor
import com.cc.screens.AbstractScreen.Companion.VIRTUAL_H

class TabGroup(
    assetLoader: AssetLoader,
    private val labels: List<String>,
    block: UIContainer.() -> Unit,
) : UIContainer(assetLoader, block) {

    private var selectedIndex: Int = 0
    private val tabBarHeight: Float = SMALL_FONT.capHeight + 8f

    override fun render(
        batch: SpriteBatch,
        sr: ShapeRenderer,
        cx: Float,
        cy: Float,
        cw: Float,
        ch: Float,
        delta: Float
    ) {
        renderSelf(batch, sr, cx, cy, cw, ch)
        val (top, bottom, left, right) = border()
        for ((index, child) in children.withIndex()) {
            if (index == selectedIndex) {
                child.render(batch, sr, cx + left, cy + top, cw - left - right, ch - top - bottom, delta)
            }
        }
    }

    override fun renderSelf(batch: SpriteBatch, sr: ShapeRenderer, cx: Float, cy: Float, cw: Float, ch: Float) {
        val tabW = cw / 5
        for ((i, label) in labels.withIndex()) {
            val tabX = cx + i * tabW
            val tabY = cy

            if (TouchContext.inTouch(tabX, tabY, tabW, tabBarHeight)) {
                selectedIndex = i
            }
            if (selectedIndex == i) {
                drawRect(sr, tabX, tabY, tabW, tabBarHeight, 6014420.toColor(), "top")
                drawRect(sr, cx, cy + tabBarHeight, cw, ch - tabBarHeight, 6014420.toColor(), "bottom")
            } else {
                drawRect(sr, tabX, tabY, tabW, tabBarHeight, 4562087.toColor(), "top")
            }
            val textX = tabX + tabW / 2f
            val textY = tabY + (tabBarHeight - SMALL_FONT.capHeight) / 2f
            batch.begin()
            batch.drawString(SMALL_FONT, label, 16449445.toColor(), textX, textY, Align.CENTER_TOP)
            batch.end()
        }
    }

    fun drawRect(
        sr: ShapeRenderer,
        tabX: Float,
        tabY: Float,
        tabW: Float,
        tabH: Float,
        fillColor: Color,
        type: String
    ) {
        sr.begin(ShapeType.Filled)
        //填充
        sr.drawRect(fillColor, tabX, tabY, tabW, tabH, Align.LEFT_TOP)
        sr.b3(26540.toColor(), tabX, tabY, tabW, tabH, 0, type)
        sr.b3(11267556.toColor(), tabX, tabY, tabW, tabH, 1, type)
        sr.b3(26540.toColor(), tabX, tabY, tabW, tabH, 2, type)
        sr.end()
    }


    //不画底边
    fun ShapeRenderer.b3(color: Color, x: Float, y: Float, w: Float, h: Float, off: Int, type: String) {
        val x = x + off
        val y = y + off
        val w = w - 2 * off
        val h = h - 2 * off

        val ly = VIRTUAL_H - y - h
        this.color = color

        if (type.contains("bottom")) {
            this.rect(x, ly, w, 1f) // 底边
        }
        if (type.contains("top")) {
            this.rect(x, ly + h - 1f, w, 1f)  // 顶边
        }
        this.rect(x, ly, 1f, h)           // 左边
        this.rect(x + w - 1f, ly, 1f, h)  // 右边
    }

    override fun border(): Border = Border(tabBarHeight, 0f, 3f, 3f)
}
