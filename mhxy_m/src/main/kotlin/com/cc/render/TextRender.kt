package com.cc.render

import com.badlogic.gdx.graphics.Color
import com.badlogic.gdx.graphics.g2d.BitmapFont
import com.badlogic.gdx.graphics.g2d.GlyphLayout
import com.badlogic.gdx.graphics.g2d.SpriteBatch
import com.cc.screens.AbstractScreen.Companion.VIRTUAL_H

class TextRender(private val lines: List<Line>) {
    data class Line(val segments: List<String>, val colors: List<String?>)

    private val layout: GlyphLayout = GlyphLayout()

    /**
     * 绘制文本。
     */
    fun drawText(batch: SpriteBatch, font: BitmapFont, x: Float, y: Float, align: Align = Align.LEFT) {
        val y = VIRTUAL_H - y
        lines.forEachIndexed { i, line ->
            // 计算该行总宽，用于居中
            val lineW = if (align == Align.CENTER_TOP) {
                line.segments.sumOf { seg -> layout.setText(font, seg).let { layout.width.toDouble() } }.toFloat()
            } else 0f

            val startX = if (align == Align.CENTER_TOP) x - lineW / 2f else x
            var offsetX = 0f
            line.segments.forEachIndexed { j, seg ->
                val color = line.colors[j].takeIf { it != null } ?: "#E6FFA3"
                font.color = Color.valueOf(color)
                font.draw(batch, seg, startX + offsetX, y - i * font.lineHeight)
                layout.setText(font, seg)
                offsetX += layout.width
            }
        }
        font.color = Color.WHITE
    }
}

enum class Align { LEFT, CENTER_TOP }
