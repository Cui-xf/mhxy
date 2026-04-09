package com.cc.render

import com.badlogic.gdx.graphics.Color
import com.badlogic.gdx.graphics.Texture
import com.badlogic.gdx.graphics.g2d.BitmapFont
import com.badlogic.gdx.graphics.g2d.GlyphLayout
import com.badlogic.gdx.graphics.g2d.SpriteBatch
import com.badlogic.gdx.graphics.glutils.ShapeRenderer
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

/**
 * 原始 PngUtil.i[] 变换表：transformFlag(0-7) → J2ME drawRegion transform。
 * 映射到 libGDX 的 (flipX, flipY, rotation) 三元组：
 *   J2ME: 0=无, 1=rot90CW, 2=rot180, 3=rot270CW(=rot90CCW),
 *         4=flipH, 5=flipH+rot90CW, 6=flipV(=rot180+flipH), 7=flipH+rot270CW
 * i[] = {0,5,3,6,2,7,1,4}，即 transformFlag=0 → J2ME_0，transformFlag=1 → J2ME_5，…
 */
private val TRANSFORM_TABLE = arrayOf(
    // flipX,  flipY,  rotation
    Triple(false, false, 0f),    // flag=0 → J2ME 0 = 无变换
    Triple(true, false, 90f),   // flag=1 → J2ME 5 = flipH + rot90CW
    Triple(false, false, 180f),  // flag=2 → J2ME 3 = rot270CW = rot90CCW = 180+rot90CW → rot180
    Triple(true, false, 270f),  // flag=3 → J2ME 6 = flipV = flipH+rot180
    Triple(false, false, 90f),   // flag=4 → J2ME 2 = rot180
    Triple(true, false, 270f),  // flag=5 → J2ME 7 = flipH + rot270CW
    Triple(false, false, 270f),  // flag=6 → J2ME 1 = rot90CW
    Triple(true, false, 0f),    // flag=7 → J2ME 4 = flipH
)

/**
 * 推进并绘制一个帧动画。
 * originX/originY 为动画锚点（原始坐标系，左上角为原点，向下为 y+）。
 */
fun SpriteBatch.drawAnimation(anim: AnimationFrame, originX: Float, originY: Float) {
    anim.advance(System.currentTimeMillis())
    for (piece in anim.currentPieces()) {
        drawPiece(piece, originX, originY)
    }
}

private fun SpriteBatch.drawPiece(piece: SpritePiece, originX: Float, originY: Float) {
    val sf = piece.spriteFrame ?: return
    val slice = sf.getSlice(piece.imageSliceIndex) ?: return

    // 屏幕左上角 = libGDX 的 (0, VIRTUAL_H)
    // 原始坐标 (px, py) → libGDX y = VIRTUAL_H - py - sliceH
    val px = originX + piece.transformX
    val py = originY + piece.transformY

    val sw = slice.w.toFloat()
    val sh = slice.h.toFloat()

    val (flipX, flipY, rotation) = TRANSFORM_TABLE[piece.transformFlag.toInt() and 0x07]

    // libGDX draw with region + flip + rotation
    // 旋转原点取切片中心
    draw(
        sf.texture,
        px, VIRTUAL_H - py - sh,   // libGDX 左下角坐标
        sw / 2, sh / 2,             // 旋转原点（相对左下角）
        sw, sh,
        1f, 1f,
        rotation,
        slice.x.toInt(), slice.y.toInt(),
        slice.w.toInt(), slice.h.toInt(),
        flipX, flipY
    )
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