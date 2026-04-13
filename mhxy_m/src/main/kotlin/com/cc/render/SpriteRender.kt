package com.cc.render

import com.badlogic.gdx.graphics.Color
import com.badlogic.gdx.graphics.Texture
import com.badlogic.gdx.graphics.g2d.BitmapFont
import com.badlogic.gdx.graphics.g2d.GlyphLayout
import com.badlogic.gdx.graphics.g2d.SpriteBatch
import com.badlogic.gdx.graphics.g2d.TextureRegion
import com.badlogic.gdx.graphics.glutils.ShapeRenderer
import com.cc.asset.Frame
import com.cc.screens.AbstractScreen.Companion.VIRTUAL_H

private val layout: GlyphLayout = GlyphLayout()

/**
 * 文字的基准是第一个字的左上角
 */
fun SpriteBatch.drawString(
    font: BitmapFont,
    str: String,
    color: Color,
    x: Float,
    y: Float,
    align: Align = Align.CENTER_TOP
) {
    font.color = color
    val x = if (align == Align.CENTER_TOP) {
        x - (layout.setText(font, str).let { layout.width }) / 2
    } else {
        x
    }
    val y = VIRTUAL_H - y
    font.draw(this, str, x, y)
}

fun SpriteBatch.wordArtString(
    font: BitmapFont,
    str: String,
    color1: Color,
    color2: Color,
    x: Float,
    y: Float,
    align: Align = Align.CENTER_TOP
) {
    drawString(font, str, color1, x - 1f, y - 1f, align)
    drawString(font, str, color1, x, y - 1f, align)
    drawString(font, str, color1, x - 1f, y, align)
    drawString(font, str, color1, x + 1f, y, align)
    drawString(font, str, color1, x, y + 1f, align)
    drawString(font, str, color1, x + 1f, y + 1f, align)
    drawString(font, str, color2, x, y, align)
}

/**
 * 图片的基准是左下角
 */
fun SpriteBatch.drawImage(
    texture: Texture,
    x: Float,
    y: Float,
    w: Float = -1f,
    h: Float = -1f,
    align: Align = Align.CENTER_TOP
) {
    val x = if (align == Align.CENTER_TOP) {
        x - texture.width / 2
    } else {
        x
    }
    val y = VIRTUAL_H - y - texture.height
    val w = if (w == -1f) texture.width.toFloat() else w
    val h = if (h == -1f) texture.height.toFloat() else h
    this.draw(texture, x, y, w, h)
}

fun SpriteBatch.drawImage(
    region: TextureRegion,
    x: Float,
    y: Float,
    w: Float = -1f,
    h: Float = -1f,
    align: Align = Align.CENTER_TOP
) {
    val drawX = if (align == Align.CENTER_TOP) x - region.regionWidth / 2 else x
    val rw = if (w == -1f) region.regionWidth.toFloat() else w
    val rh = if (h == -1f) region.regionHeight.toFloat() else h
    val drawY = VIRTUAL_H - y - region.regionHeight
    this.draw(region, drawX, drawY, rw, rh)
}

fun ShapeRenderer.drawRect(
    color: Color,
    x: Float,
    y: Float,
    w: Float,
    h: Float,
    align: Align = Align.CENTER_TOP
) {
    val x = if (align == Align.CENTER_TOP) {
        x - w / 2
    } else {
        x
    }
    val y = VIRTUAL_H - y - h
    this.color = color
    this.rect(x, y, w, h)
}

/** 用4条填充矩形（1px）绘制空心矩形边框，避免 ShapeType.Line 的角点缺失问题。
 *  必须在 ShapeType.Filled 的 begin/end 块内调用。*/
fun ShapeRenderer.drawRectBorder(
    color: Color,
    x: Float,
    y: Float,
    w: Float,
    h: Float,
    align: Align = Align.CENTER_TOP
) {
    val lx = if (align == Align.CENTER_TOP) x - w / 2 else x
    val ly = VIRTUAL_H - y - h
    this.color = color
    this.rect(lx, ly, w, 1f)           // 底边
    this.rect(lx, ly + h - 1f, w, 1f)  // 顶边
    this.rect(lx, ly, 1f, h)           // 左边
    this.rect(lx + w - 1f, ly, 1f, h)  // 右边
}

fun ShapeRenderer.drawLine(
    color: Color,
    x: Float,
    y: Float,
    x2: Float,
    y2: Float
) {
    val y = VIRTUAL_H - y
    val y2 = VIRTUAL_H - y2
    this.color = color
    this.line(x, y, x2, y2)
}


/**
 * 推进并绘制一个帧动画。
 * originX/originY 为动画锚点（原始坐标系，左上角为原点，向下为 y+）。
 */
fun SpriteBatch.drawAnimation(frames: List<Frame>, originX: Float, originY: Float) {
    for (frame in frames) {
        val textureRegion = frame.textureRegion
        // 屏幕左上角 = libGDX 的 (0, VIRTUAL_H)
        // 原始坐标 (px, py) → libGDX y = VIRTUAL_H - py - sliceH
        val px = originX + frame.transX
        val py = originY + frame.transY

        val sw = textureRegion.regionWidth.toFloat()
        val sh = textureRegion.regionHeight.toFloat()

        // 旋转原点取切片中心
        this.draw(
            textureRegion,
            px,
            VIRTUAL_H - py - sh,   // libGDX 左下角坐标
            sw / 2, // 旋转原点（相对左下角）
            sh / 2,
            sw,
            sh,
            1f,
            1f,
            frame.rotation
        )
    }
}

fun Int.toColor(): Color = Color.valueOf((this and 0xFFFFFF).toString(16).padStart(6, '0').uppercase())
