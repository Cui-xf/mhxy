package com.cc.render

import com.badlogic.gdx.graphics.Color
import com.badlogic.gdx.graphics.g2d.BitmapFont
import com.badlogic.gdx.graphics.g2d.GlyphLayout
import com.badlogic.gdx.graphics.g2d.SpriteBatch

class TextRender(private val lines: List<Line>) {

    enum class Align { LEFT, CENTER }

    data class Line(val segments: List<String>, val colors: List<Int>)

    private val layout: GlyphLayout = GlyphLayout()

    /**
     * 绘制文本。
     * @param x  LEFT 模式下为左边界 x；CENTER 模式下为水平中心 x
     * @param y  文字顶部的 y（libGDX y 轴朝上，对应原 J2ME anchor=TOP）
     */
    fun drawText(batch: SpriteBatch, font: BitmapFont, x: Float, y: Float, align: Align = Align.LEFT) {
        lines.forEachIndexed { i, line ->
            // 计算该行总宽，用于居中
            val lineW = if (align == Align.CENTER) {
                line.segments.sumOf { seg -> layout.setText(font, seg).let { layout.width.toDouble() } }.toFloat()
            } else 0f

            val startX = if (align == Align.CENTER) x - lineW / 2f else x
            var offsetX = 0f
            line.segments.forEachIndexed { j, seg ->
                val color = line.colors[j].takeIf { it != -1 } ?: 15138723
                font.setColor(
                    (color shr 16 and 0xFF) / 255f,
                    (color shr 8 and 0xFF) / 255f,
                    (color and 0xFF) / 255f,
                    1f
                )
                font.draw(batch, seg, startX + offsetX, y - i * font.lineHeight)
                layout.setText(font, seg)
                offsetX += layout.width
            }
        }
        font.color = Color.WHITE
    }
}
