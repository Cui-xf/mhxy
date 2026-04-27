package com.cc.screens.game.hud

import com.badlogic.gdx.graphics.Color
import com.badlogic.gdx.graphics.g2d.SpriteBatch
import com.badlogic.gdx.graphics.glutils.ShapeRenderer
import com.cc.FontManager.SMALL_FONT
import com.cc.asset.AssetLoader
import com.cc.event.TouchContext
import com.cc.render.Align
import com.cc.render.drawString
import com.cc.ui.component.Close
import com.cc.ui.component.TabGroup
import com.cc.ui.component.UIComponent
import com.cc.ui.component.WindowPanel

class CharacterAttrUI(assetLoader: AssetLoader) : UIComponent(assetLoader) {

    companion object {
        const val Z = 200
        private const val BORDER = 10f
    }

    private var visible = false

    private val tabLabels = listOf("状态", "属性", "修炼", "声望", "加成")

    private val window = WindowPanel(assetLoader, "人物属性-战力106") {
        add(TabGroup(assetLoader, tabLabels) {
            add(StatusTab(assetLoader))
            add(AttrTab(assetLoader))
            add(XiulianTab(assetLoader))
            add(ReputationTab(assetLoader))
            add(BonusTab(assetLoader))
        })
    }.onEvent<Close> { hide() }

    override fun render(
        batch: SpriteBatch, sr: ShapeRenderer,
        cx: Float, cy: Float, cw: Float, ch: Float, delta: Float
    ) {
        if (!visible) return
        TouchContext.withZ(Z) {
            window.render(batch, sr, cx + BORDER, cy + BORDER, cw - 2 * BORDER, ch - BORDER * 3 - 2, delta)
        }
    }

    fun show() {
        if (!visible) {
            visible = true; TouchContext.pushZ(Z)
        }
    }

    fun hide() {
        if (visible) {
            visible = false; TouchContext.popZ(Z)
        }
    }

    fun toggle() {
        if (visible) hide() else show()
    }

    // ── 状态 Tab ──────────────────────────────────────────
    private class StatusTab(assetLoader: AssetLoader) : UIComponent(assetLoader) {
        private val textColor = Color.valueOf("#4169CF")
        private val lineH get() = SMALL_FONT.lineHeight

        override fun render(
            batch: SpriteBatch, sr: ShapeRenderer,
            cx: Float, cy: Float, cw: Float, ch: Float, delta: Float
        ) {
            val lines = listOf(
                "昵称：欧阳娜娜",
                "门派：龙宫",
                "级别：8",
                "称号：",
                "配偶：",
                "师傅：",
                "帮派：",
                "职务：",
                "功勋：0",
                "经验：15140/20400",
                "修炼：0<关闭>",
            )
            batch.begin()
            for ((i, line) in lines.withIndex()) {
                batch.drawString(SMALL_FONT, line, textColor, cx + 4f, cy + 4f + i * lineH, Align.LEFT_TOP)
            }
            batch.end()
        }
    }

    // ── 属性 Tab ──────────────────────────────────────────
    private class AttrTab(assetLoader: AssetLoader) : UIComponent(assetLoader) {
        private val textColor = Color.valueOf("#4169CF")
        private val lineH get() = SMALL_FONT.lineHeight

        override fun render(
            batch: SpriteBatch, sr: ShapeRenderer,
            cx: Float, cy: Float, cw: Float, ch: Float, delta: Float
        ) {
            val lines = listOf(
                "生命:80/100",
                "内力:80/100",
                "物攻:20",
                "法伤:30",
                "法攻:20",
                "物防:20",
                "速度:20",
                "冰抗:20",
                "火炕:20",
                "雷抗:20",
            )
            batch.begin()
            for ((i, line) in lines.withIndex()) {
                batch.drawString(SMALL_FONT, line, textColor, cx + 4f, cy + 4f + i * lineH, Align.LEFT_TOP)
            }
            batch.end()
        }
    }

    // ── 修炼 Tab ──────────────────────────────────────────
    private class XiulianTab(assetLoader: AssetLoader) : UIComponent(assetLoader) {
        override fun render(
            batch: SpriteBatch, sr: ShapeRenderer,
            cx: Float, cy: Float, cw: Float, ch: Float, delta: Float
        ) {
        }
    }

    // ── 声望 Tab ──────────────────────────────────────────
    private class ReputationTab(assetLoader: AssetLoader) : UIComponent(assetLoader) {
        override fun render(
            batch: SpriteBatch, sr: ShapeRenderer,
            cx: Float, cy: Float, cw: Float, ch: Float, delta: Float
        ) {
        }
    }

    // ── 加成 Tab ──────────────────────────────────────────
    private class BonusTab(assetLoader: AssetLoader) : UIComponent(assetLoader) {
        override fun render(
            batch: SpriteBatch, sr: ShapeRenderer,
            cx: Float, cy: Float, cw: Float, ch: Float, delta: Float
        ) {
        }
    }
}
