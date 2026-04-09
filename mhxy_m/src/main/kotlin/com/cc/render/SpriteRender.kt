package com.cc.render

import com.badlogic.gdx.graphics.Color
import com.badlogic.gdx.graphics.Texture
import com.badlogic.gdx.graphics.g2d.BitmapFont
import com.badlogic.gdx.graphics.g2d.GlyphLayout
import com.badlogic.gdx.graphics.g2d.SpriteBatch
import com.badlogic.gdx.graphics.glutils.ShapeRenderer
import com.cc.asset.FramePack
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

fun ShapeRenderer.drawRect(
    color: Color, x: Float,
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


/**
 * 推进并绘制一个帧动画。
 * originX/originY 为动画锚点（原始坐标系，左上角为原点，向下为 y+）。
 */
fun SpriteBatch.drawAnimation(pack: FramePack, originX: Float, originY: Float) {
    for (frame in pack.frames) {
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

