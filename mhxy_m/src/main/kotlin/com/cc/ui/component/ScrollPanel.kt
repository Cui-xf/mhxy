package com.cc.ui.component

import com.badlogic.gdx.Gdx
import com.badlogic.gdx.graphics.g2d.SpriteBatch
import com.badlogic.gdx.graphics.g2d.TextureRegion
import com.badlogic.gdx.graphics.glutils.ShapeRenderer
import com.badlogic.gdx.math.MathUtils
import com.badlogic.gdx.math.Rectangle
import com.badlogic.gdx.scenes.scene2d.utils.ScissorStack
import com.cc.asset.AssetLoader
import com.cc.asset.AssetManagerFactory.PUBLIC_ASSET
import com.cc.event.TouchContext
import com.cc.render.*
import com.cc.screens.AbstractScreen
import com.cc.screens.AbstractScreen.Companion.VIRTUAL_H

class ScrollPanel(
    assetLoader: AssetLoader,
    block: UIContainer.() -> Unit,
) : UIContainer(assetLoader, block) {
    private val up by resource(PUBLIC_ASSET, "rpg/publicUI/up.pic", TextureRegion::class)
    private val down by resource(PUBLIC_ASSET, "rpg/publicUI/down.pic", TextureRegion::class)
    private val thumbBorders = listOf(
        Pair(1, 150092.toColor()),
        Pair(2, 11267556.toColor()),
        Pair(1, 5555146.toColor()),
    )

    private val child get() = children.first()
    private var scrollY = 0f
    private var dragging = false
    private var scrolled = false
    private var lastTouchY = 0f
    private var pendingClick = false

    // 滚动条拖动状态
    private var draggingThumb = false
    private var lastThumbTouchY = 0f

    override fun renderSelf(batch: SpriteBatch, sr: ShapeRenderer, cx: Float, cy: Float, cw: Float, ch: Float) {
        val contentW = cw - border().right
        val contentH = child.preferredHeight(contentW)
        val maxScroll = (contentH - ch).coerceAtLeast(0f)

        if (contentH > ch) {
            val trackX = cx + cw - up.regionWidth
            val trackW = up.regionWidth.toFloat()
            val upH = up.regionHeight.toFloat()
            val downH = down.regionHeight.toFloat()
            val slideArea = ch - upH - downH
            val thumbH = (slideArea * ch / contentH).coerceAtLeast(6f)
            val scrollRatio = if (maxScroll > 0f) scrollY / maxScroll else 0f
            val thumbY = cy + upH + scrollRatio * (slideArea - thumbH)

            handleTouch(cx, cy, cw, ch, trackX, trackW, thumbY, thumbH, slideArea, maxScroll)
            scrollY = MathUtils.clamp(scrollY, 0f, maxScroll)
            drawScrollBar(batch, sr, trackX, cy, ch, contentH, maxScroll)
        } else {
            handleTouch(cx, cy, cw, ch, 0f, 0f, 0f, 0f, 0f, 0f)
            scrollY = MathUtils.clamp(scrollY, 0f, maxScroll)
        }
    }

    override fun renderChildren(
        batch: SpriteBatch,
        sr: ShapeRenderer,
        cx: Float,
        cy: Float,
        cw: Float,
        ch: Float,
        delta: Float,
    ) {
        val (top, bottom, left, right) = border()
        val innerX = cx + left
        val innerY = cy + top
        val innerW = cw - left - right
        val innerH = ch - top - bottom

        val clipArea = Rectangle(innerX, VIRTUAL_H - innerY - innerH, innerW, innerH)
        val scissorRect = Rectangle()
        val vp = AbstractScreen.viewport
        ScissorStack.calculateScissors(
            vp.camera, vp.screenX.toFloat(), vp.screenY.toFloat(),
            vp.screenWidth.toFloat(), vp.screenHeight.toFloat(),
            batch.transformMatrix, clipArea, scissorRect
        )

        val contentH = child.preferredHeight(innerW)

        batch.flush()
        if (ScissorStack.pushScissors(scissorRect)) {
            child.render(batch, sr, innerX, innerY - scrollY, innerW, contentH, delta)
            batch.flush()
            ScissorStack.popScissors()
        }
    }

    private fun drawScrollBar(
        batch: SpriteBatch,
        sr: ShapeRenderer,
        trackX: Float,
        trackY: Float,
        trackH: Float,
        contentH: Float,
        maxScroll: Float,
    ) {
        val trackW = up.regionWidth.toFloat()
        val upH = up.regionHeight.toFloat()
        val downH = down.regionHeight.toFloat()

        // 轨道背景
        sr.begin(ShapeRenderer.ShapeType.Filled)
        sr.drawRect(20871.toColor(), trackX + 4, trackY, 4f, trackH, Align.LEFT_TOP)
        sr.drawRect(1152942.toColor(), trackX + 5, trackY, 2f, trackH, Align.LEFT_TOP)
        sr.end()

        // 上下箭头
        batch.begin()
        batch.drawImage(up, trackX, trackY, align = Align.LEFT_TOP)
        batch.drawImage(down, trackX, trackY + trackH - downH, align = Align.LEFT_TOP)
        batch.end()

        // 滑块
        val slideArea = trackH - upH - downH
        val thumbH = (slideArea * trackH / contentH).coerceAtLeast(6f)
        val scrollRatio = if (maxScroll > 0f) scrollY / maxScroll else 0f
        val thumbY = trackY + upH + scrollRatio * (slideArea - thumbH)

        sr.drawRectBorder(trackX, thumbY, trackW, thumbH, thumbBorders, 1801628.toColor(), Align.LEFT_TOP)
    }

    private fun handleTouch(
        cx: Float, cy: Float, cw: Float, ch: Float,
        thumbX: Float, thumbW: Float, thumbY: Float, thumbH: Float,
        slideArea: Float, maxScroll: Float,
    ) {
        // 手指按下：判断落在滚动条滑块还是内容区
        if (TouchContext.inTouch(thumbX, thumbY, thumbW, thumbH)) {
            // 点击在滑块上，开始拖动滚动条
            draggingThumb = true
            lastThumbTouchY = TouchContext.touchY
            TouchContext.justTouched = false
        } else if (TouchContext.inTouch(cx, cy, cw, ch)) {
            dragging = true
            scrolled = false
            lastTouchY = TouchContext.touchY
        }

        // 滚动条滑块拖动
        if (draggingThumb) {
            val touched = Gdx.input.isTouched
            if (touched) {
                val deltaY = TouchContext.touchY - lastThumbTouchY
                if (deltaY != 0f && slideArea > 0f && maxScroll > 0f) {
                    // 滑块向下拖动(deltaY>0) → scrollY增加 → 显示下方内容
                    scrollY += deltaY * maxScroll / slideArea
                    lastThumbTouchY = TouchContext.touchY
                }
            } else {
                draggingThumb = false
            }
            TouchContext.justTouched = false
            return
        }

        // 内容区拖动
        if (dragging) {
            val touched = Gdx.input.isTouched
            if (touched) {
                val deltaY = TouchContext.touchY - lastTouchY
                if (deltaY != 0f) {
                    scrolled = true
                    scrollY -= deltaY
                    lastTouchY = TouchContext.touchY
                }
            } else {
                // 手指松开：没滚动过则补发点击
                if (!scrolled) pendingClick = true
                dragging = false
            }
        }

        // 拖拽中始终屏蔽 justTouched，由松开时的 pendingClick 决定是否补发
        if (dragging) {
            TouchContext.justTouched = false
        }
        if (pendingClick) {
            TouchContext.justTouched = true
            pendingClick = false
        }
    }

    override fun border(): Border = Border(0f, 0f, 0f, up.regionWidth.toFloat())
}
