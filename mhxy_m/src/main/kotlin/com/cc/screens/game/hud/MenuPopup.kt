package com.cc.screens.game.hud

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

class MenuPopup(assetLoader: AssetLoader) : UIComponent(assetLoader) {

    /** 叶子菜单项点击事件（无子菜单的项被点击） */
    data class MenuItemClick(val id: String)

    private val lu by resource(PUBLIC_ASSET, "rpg/publicUI/lu0.pic", TextureRegion::class)
    private val ld by resource(PUBLIC_ASSET, "rpg/publicUI/ld0.pic", TextureRegion::class)
    private val rd by resource(PUBLIC_ASSET, "rpg/publicUI/rd0.pic", TextureRegion::class)
    private val ru by resource(PUBLIC_ASSET, "rpg/publicUI/ru0.pic", TextureRegion::class)


    private var visible = false

    private data class Item(
        val id: String,
        val label: String,
        val children: List<Item> = emptyList(),
    )

    /** 一级菜单定义 */
    private val rootItems = listOf(
        Item(
            "character", "人物", listOf(
                Item("character_attr", "属性"),
                Item("character_skill", "技能"),
                Item("character_effect", "特效"),
                Item("character_equip", "装备"),
                Item("character_point", "配点"),
                Item("character_title", "称号"),
                Item("character_achieve", "成就"),
                Item("character_active", "活跃"),
            )
        ),
        Item(
            "shop", "商城", listOf(
                Item("shop_bean_city", "豆城"),
                Item("shop_warehouse", "仓库"),
                Item("shop_recharge", "充值"),
                Item("shop_exchange", "换豆"),
                Item("shop_balance", "余额"),
                Item("shop_desc", "说明"),
            )
        ),
        Item("item", "道具"),
        Item("task", "任务"),
        Item(
            "guild", "帮派", listOf(
                Item("guild_enter", "进入"),
                Item("guild_view", "查看"),
                Item("guild_invite", "邀请"),
                Item("guild_manage", "任免"),
                Item("guild_quit", "弃帮"),
            )
        ),
        Item("house", "住宅"),
        Item("mount", "坐骑"),
        Item("pet", "宠物"),
        Item(
            "function", "功能", listOf(
                Item("function_enchant", "附魔"),
                Item("function_star", "升星"),
                Item("function_refine", "洗练"),
                Item("function_teleport", "传送"),
                Item("function_compose", "合成"),
            )
        ),
        Item(
            "social", "社交", listOf(
                Item("social_friend", "好友"),
                Item("social_chat", "聊天"),
                Item("social_nearby", "周围"),
            )
        ),
        Item(
            "system", "系统", listOf(
                Item("system_setting", "设置"),
                Item("system_help", "帮助"),
                Item("system_auto", "自动"),
                Item("system_detach", "脱离"),
                Item("system_role", "角色"),
                Item("system_quit", "退出"),
            )
        ),
    )

    // 当前显示的列表：null = 一级，非 null = 该项的子菜单
    private var subItems: List<Item>? = null
    private var selectedId: String = rootItems.first().id

    private val currentItems get() = subItems ?: rootItems

    companion object {
        const val Z = 100
        private const val COLS = 3
        private const val PANEL_W = 155f
        private const val PANEL_H = 140f
        private val PANEL_X get() = (VIRTUAL_W - PANEL_W) / 2f
        private val PANEL_Y get() = (VIRTUAL_H - PANEL_H) / 2f - 20f
        private const val PAD = 5f
        private val COLOR_LINE = Color.valueOf("#35AEBF")
        private val COLOR_BG = Color.valueOf("#1B7A9966")
        private val COLOR_SEL = Color.valueOf("#0E5A73AA")
        private val COLOR_TEXT = Color.WHITE
        private val COLOR_TEXT_OUTLINE = Color.BLACK
    }

    fun show() {
        if (!visible) {
            visible = true
            subItems = null
            selectedId = rootItems.first().id
            TouchContext.pushZ(Z)
        }
    }

    fun hide() {
        if (visible) {
            visible = false
            subItems = null
            TouchContext.popZ(Z)
        }
    }

    fun toggle() {
        if (visible) hide() else show()
    }

    override fun render(
        batch: SpriteBatch, sr: ShapeRenderer,
        cx: Float, cy: Float, cw: Float, ch: Float, delta: Float
    ) {
        if (!visible) return

        val px = PANEL_X
        val py = PANEL_Y
        val items = currentItems
        val rows = 4
        val innerW = PANEL_W - PAD * 2
        val innerH = PANEL_H - PAD * 2
        val cellW = innerW / COLS
        val cellH = innerH / rows

        // ── 1. 背景 & 边框 ──────────────────────────────────────
        sr.begin(ShapeType.Filled)
        sr.drawRect(COLOR_BG, px, py, PANEL_W, PANEL_H, Align.LEFT_TOP)
        sr.end()
        sr.drawRectBorder(
            px, py, PANEL_W, PANEL_H, listOf(
                Pair(1, Color.valueOf("#005187")),
                Pair(1, Color.valueOf("#1197AE")),
                Pair(1, Color.valueOf("#95D9E2")),
                Pair(1, Color.valueOf("#1197AE")),
                Pair(1, Color.valueOf("#005187")),
            ), align = Align.LEFT_TOP
        )

        // ── 2. 选中项高亮 ────────────────────────────────────────
        sr.begin(ShapeType.Filled)
        for ((idx, item) in items.withIndex()) {
            if (item.id == selectedId) {
                val cellX = px + PAD + (idx % COLS) * cellW
                val cellY = py + PAD + (idx / COLS) * cellH
                sr.drawRect(COLOR_SEL, cellX, cellY, cellW, cellH, Align.LEFT_TOP)
            }
        }
        sr.end()

        // ── 3. 分隔线 ────────────────────────────────────────────
        sr.begin(ShapeType.Line)
        sr.color = COLOR_LINE
        for (c in 1 until COLS) {
            val lx = px + PAD + c * cellW
            sr.line(lx, VIRTUAL_H - (py + PAD), lx, VIRTUAL_H - (py + PAD + innerH))
        }
        for (r in 1 until rows) {
            val screenY = VIRTUAL_H - (py + PAD + r * cellH)
            sr.line(px + PAD, screenY, px + PAD + innerW, screenY)
        }
        sr.end()

        // ── 4. 文字 ───────────────────
        batch.begin()
        for ((idx, item) in items.withIndex()) {
            val textX = px + PAD + (idx % COLS) * cellW + cellW / 2f
            val textY = py + PAD + (idx / COLS) * cellH + (cellH - MEDIA_FONT.capHeight) / 2f + MEDIA_FONT.capHeight -10
            val label = if (item.children.isNotEmpty()) item.label else item.label
            batch.wordArtString(MEDIA_FONT, label, COLOR_TEXT_OUTLINE, COLOR_TEXT, textX, textY)
        }
        batch.end()

        // ── 5. 四角装饰 ─────────────────────────────────────────
        batch.begin()
        batch.drawImage(lu, px, py, align = Align.LEFT_TOP)
        batch.drawImage(ld, px, py + PANEL_H - ld.regionHeight, align = Align.LEFT_TOP)
        batch.drawImage(rd, px + PANEL_W - rd.regionWidth, py + PANEL_H - rd.regionHeight, align = Align.LEFT_TOP)
        batch.drawImage(ru, px + PANEL_W - ru.regionWidth, py, align = Align.LEFT_TOP)
        batch.end()

        // ── 6. 点击检测 ─────────────────────────────────────────
        if (TouchContext.inTouch(cx, cy, cw, ch, z = Z, clear = false)) {
            val tx = TouchContext.touchX
            val ty = TouchContext.touchY
            val inPanel = tx >= px && tx <= px + PANEL_W && ty >= py && ty <= py + PANEL_H
            if (!inPanel) {
                TouchContext.inTouch(cx, cy, cw, ch, z = Z)  // 消费
                if (subItems != null) {
                    subItems = null
                    selectedId = rootItems.first().id
                } else {
                    hide()
                }
                return
            }
        }

        for ((idx, item) in items.withIndex()) {
            val cellX = px + PAD + (idx % COLS) * cellW
            val cellY = py + PAD + (idx / COLS) * cellH
            if (TouchContext.inTouch(cellX, cellY, cellW, cellH, z = Z)) {
                selectedId = item.id
                if (item.children.isNotEmpty()) {
                    subItems = item.children
                    selectedId = item.children.first().id
                } else {
                    emit(MenuItemClick(item.id))
                }
            }
        }
    }
}
