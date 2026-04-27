package com.cc.ui.component

import com.badlogic.gdx.graphics.g2d.SpriteBatch
import com.badlogic.gdx.graphics.glutils.ShapeRenderer
import com.badlogic.gdx.math.Rectangle
import com.cc.FontManager.SMALL_FONT
import com.cc.asset.AssetLoader
import com.cc.event.TouchContext
import com.cc.render.*

class TabGroup(
    assetLoader: AssetLoader,
    private val labels: List<String>,
    /** 固定总高度（含tab栏+内容+border），为null则填满父容器 */
    private val fixedHeight: Float? = null,
    block: UIContainer.() -> Unit,
) : UIContainer(assetLoader, block) {

    private var selectedIndex: Int = 0
    private val tabBarHeight: Float = 18f
    private val tabSize = 5
    private val borders = listOf(
        Pair(1, 26540.toColor()),
        Pair(1, 11267556.toColor()),
        Pair(1, 26540.toColor()),
    )

    override fun renderChildren(
        batch: SpriteBatch,
        sr: ShapeRenderer,
        cx: Float,
        cy: Float,
        cw: Float,
        ch: Float,
        delta: Float
    ) {
        val h = fixedHeight ?: ch
        val (top, bottom, left, right) = border()
        for ((index, child) in children.withIndex()) {
            if (index == selectedIndex) {
                child.render(batch, sr, cx + left, cy + top, cw - left - right, h - top - bottom, delta)
            }
        }
    }

    override fun renderSelf(batch: SpriteBatch, sr: ShapeRenderer, cx: Float, cy: Float, cw: Float, ch: Float) {
        val h = fixedHeight ?: ch
        val tabW = (cw + tabSize - 1) / tabSize //共用间隙
        // 先处理触摸
        for (i in labels.indices) {
            val tabX = cx + i * (tabW - 1) //共用间隙
            if (TouchContext.inTouch(tabX, cy, tabW, tabBarHeight)) {
                if (selectedIndex != i) {
                    selectedIndex = i
                    emit(TabChange(i))
                }
            }
        }
        // 先绘制未选中的tab
        for ((i, label) in labels.withIndex()) {
            if (selectedIndex == i) continue
            val tabX = cx + i * (tabW - 1)
            sr.surround(Rectangle(tabX, cy, tabW, tabBarHeight).toPath(), borders, 4562087.toColor())
            val textX = tabX + tabW / 2f
            val textY = cy + (tabBarHeight - SMALL_FONT.capHeight) / 2f
            batch.begin()
            batch.drawString(SMALL_FONT, label, 5426130.toColor(), textX, textY, Align.CENTER_TOP)
            batch.end()
        }
        // 再绘制选中的tab（覆盖在未选中tab之上）
        val contentTop = cy + tabBarHeight - borders.size
        for ((i, label) in labels.withIndex()) {
            if (selectedIndex != i) continue
            val tabX = cx + i * (tabW - 1)
            val path = listOf(
                Pair(tabX, contentTop),
                Pair(cx, contentTop),
                Pair(cx, cy + h),
                Pair(cx + cw, cy + h),
                Pair(cx + cw, contentTop),
                Pair(tabX + tabW, contentTop),
                Pair(tabX + tabW, cy),
                Pair(tabX, cy),
            )
            sr.surround(path, borders, 6014420.toColor())
            val textX = tabX + tabW / 2f
            val textY = cy + (tabBarHeight - SMALL_FONT.capHeight) / 2f
            batch.begin()
            batch.drawString(SMALL_FONT, label, 16449445.toColor(), textX, textY, Align.CENTER_TOP)
            batch.end()
        }
    }

    override fun border(): Border = Border(tabBarHeight, 3f, 3f, 3f)
}

data class TabChange(val index: Int)
