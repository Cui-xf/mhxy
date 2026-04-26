package com.cc.screens.game.ui

import com.badlogic.gdx.graphics.Color
import com.badlogic.gdx.graphics.g2d.SpriteBatch
import com.badlogic.gdx.graphics.g2d.TextureRegion
import com.badlogic.gdx.graphics.glutils.ShapeRenderer
import com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType
import com.cc.FontManager.MEDIA_FONT
import com.cc.asset.AssetLoader
import com.cc.asset.AssetManagerFactory.PUBLIC_ASSET
import com.cc.event.TouchContext
import com.cc.render.*
import com.cc.screens.AbstractScreen.Companion.VIRTUAL_H
import com.cc.screens.AbstractScreen.Companion.VIRTUAL_W
import com.cc.ui.component.UIComponent

/**
 * 主菜单弹出面板，3列4行共11个功能入口。
 * 点击某项后 emit [MenuItemClick]；点击空白区域不做处理（由外部决定关闭时机）。
 */
class MenuPopup(assetLoader: AssetLoader) : UIComponent(assetLoader) {

    /** 菜单项点击事件 */
    data class MenuItemClick(val id: String)

    // 四角装饰图
    private val lu by resource(PUBLIC_ASSET, "rpg/publicUI/lu.pic", TextureRegion::class)
    private val ld by resource(PUBLIC_ASSET, "rpg/publicUI/ld.pic", TextureRegion::class)
    private val rd by resource(PUBLIC_ASSET, "rpg/publicUI/rd.pic", TextureRegion::class)

    private var visible = false
    private var selectedId: String = "character"

    /** 11 个菜单项，按行优先排列（3列，最后一行只有2项）*/
    private val items = listOf(
        Item("character", "人物"),
        Item("shop",      "商城"),
        Item("item",      "道具"),
        Item("task",      "任务"),
        Item("guild",     "帮派"),
        Item("house",     "住宅"),
        Item("mount",     "坐骑"),
        Item("pet",       "宠物"),
        Item("function",  "功能"),
        Item("social",    "社交"),
        Item("system",    "系统"),
    )

    private data class Item(val id: String, val label: String)

    companion object {
        private const val COLS = 3
        private const val PANEL_W = 155f
        private const val PANEL_H = 140f
        // 面板左上角坐标（水平居中，垂直居中偏上）
        private val PANEL_X get() = (VIRTUAL_W - PANEL_W) / 2f
        private val PANEL_Y get() = (VIRTUAL_H - PANEL_H) / 2f - 20f

        // 内边距（border 之内）
        private const val PAD = 5f
        // 分隔线颜色
        private val COLOR_LINE = Color.valueOf("#35AEBF")
        // 背景色：半透明青蓝
        private val COLOR_BG = Color.valueOf("#1B7A9966")
        // 选中项背景色（更深）
        private val COLOR_SEL = Color.valueOf("#0E5A73AA")
        // 文字色
        private val COLOR_TEXT = Color.WHITE
        private val COLOR_TEXT_OUTLINE = Color.BLACK
    }

    fun toggle() {
        visible = !visible
    }

    fun show() { visible = true }
    fun hide() { visible = false }

    override fun render(
        batch: SpriteBatch,
        sr: ShapeRenderer,
        cx: Float, cy: Float, cw: Float, ch: Float,
        delta: Float
    ) {
        if (!visible) return

        val px = PANEL_X
        val py = PANEL_Y

        // 内容区尺寸（去掉两侧 PAD）
        val innerW = PANEL_W - PAD * 2
        val innerH = PANEL_H - PAD * 2

        val rows = (items.size + COLS - 1) / COLS
        val cellW = innerW / COLS
        val cellH = innerH / rows

        // ── 1. 背景 & 边框 ──────────────────────────────────────
        sr.begin(ShapeType.Filled)
        sr.drawRect(COLOR_BG, px, py, PANEL_W, PANEL_H, Align.LEFT_TOP)
        sr.end()

        // 边框（同 WindowPanel 风格：青色五层）
        val borders = listOf(
            Pair(1, Color.valueOf("#005187")),
            Pair(1, Color.valueOf("#1197AE")),
            Pair(1, Color.valueOf("#95D9E2")),
            Pair(1, Color.valueOf("#1197AE")),
            Pair(1, Color.valueOf("#005187")),
        )
        sr.drawRectBorder(px, py, PANEL_W, PANEL_H, borders, align = Align.LEFT_TOP)

        // ── 2. 选中项高亮 & 网格线 ──────────────────────────────
        sr.begin(ShapeType.Filled)
        for ((idx, item) in items.withIndex()) {
            val col = idx % COLS
            val row = idx / COLS
            val cellX = px + PAD + col * cellW
            val cellY = py + PAD + row * cellH
            if (item.id == selectedId) {
                sr.drawRect(COLOR_SEL, cellX, cellY, cellW, cellH, Align.LEFT_TOP)
            }
        }
        sr.end()

        // 分隔线
        sr.begin(ShapeType.Line)
        sr.color = COLOR_LINE
        // 竖线（COLS-1 条）
        for (c in 1 until COLS) {
            val lx = px + PAD + c * cellW
            val screenY1 = VIRTUAL_H - (py + PAD)
            val screenY2 = VIRTUAL_H - (py + PAD + innerH)
            sr.line(lx, screenY1, lx, screenY2)
        }
        // 横线（rows-1 条）
        for (r in 1 until rows) {
            val ly = py + PAD + r * cellH
            val screenY = VIRTUAL_H - ly
            sr.line(px + PAD, screenY, px + PAD + innerW, screenY)
        }
        sr.end()

        // ── 3. 文字 ─────────────────────────────────────────────
        batch.begin()
        for ((idx, item) in items.withIndex()) {
            val col = idx % COLS
            val row = idx / COLS
            val textX = px + PAD + col * cellW + cellW / 2f
            val textY = py + PAD + row * cellH + (cellH - MEDIA_FONT.capHeight) / 2f + MEDIA_FONT.capHeight
            batch.wordArtString(MEDIA_FONT, item.label, COLOR_TEXT_OUTLINE, COLOR_TEXT, textX, textY)
        }
        batch.end()

        // ── 4. 四角装饰 ─────────────────────────────────────────
        batch.begin()
        batch.drawImage(lu, px, py, align = Align.LEFT_TOP)
        batch.drawImage(ld, px, py + PANEL_H - ld.regionHeight, align = Align.LEFT_TOP)
        batch.drawImage(rd, px + PANEL_W - rd.regionWidth, py + PANEL_H - rd.regionHeight, align = Align.LEFT_TOP)
        batch.end()

        // ── 5. 点击检测 ─────────────────────────────────────────
        for ((idx, item) in items.withIndex()) {
            val col = idx % COLS
            val row = idx / COLS
            val cellX = px + PAD + col * cellW
            val cellY = py + PAD + row * cellH
            if (TouchContext.inTouch(cellX, cellY, cellW, cellH, clear = true)) {
                selectedId = item.id
                emit(MenuItemClick(item.id))
            }
        }
    }
}
