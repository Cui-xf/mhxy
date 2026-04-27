package com.cc.screens.base

import com.badlogic.gdx.graphics.Color
import com.badlogic.gdx.graphics.g2d.SpriteBatch
import com.badlogic.gdx.graphics.g2d.TextureRegion
import com.badlogic.gdx.graphics.glutils.ShapeRenderer
import com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType
import com.cc.FontManager.SMALL_FONT
import com.cc.asset.AssetLoader
import com.cc.asset.AssetManagerFactory.PUBLIC_ASSET
import com.cc.event.TouchContext
import com.cc.render.*
import com.cc.screens.fight.model.ItemData
import com.cc.ui.component.*


class ItemWindow(
    assetLoader: AssetLoader,
    title: String
) : UIComponent(assetLoader) {
    companion object {
        private const val BORDER = 10f
        private const val COLS = 8
        private const val ROWS = 4
        private const val SLOT_SIZE = 18f
    }

    private val pages: List<List<ItemData>> = listOf(
        listOf(
            ItemData(1, "麻布衣服", "rpg/icon/1000.pic", defense = "7-8", hp = 100, mp = 20),
            ItemData(2, "精铁剑", "rpg/icon/1001.pic", hp = 50),
        ),
        emptyList(),
        emptyList(),
        emptyList(),
        emptyList(),
    )

    private val goods by resource(PUBLIC_ASSET, "rpg/publicUI/goods.pic", TextureRegion::class)
    private val iconRes: Map<String, Lazy<TextureRegion>> = pages.flatten()
        .associate { item -> item.iconRes to resource(PUBLIC_ASSET, item.iconRes, TextureRegion::class) }

    val tabGroup = TabGroup(assetLoader, listOf("一", "二", "三", "四", "五"), fixedHeight = 124f) {
        for (pageIndex in 0..4) {
            add(ItemGrid(assetLoader, pages[pageIndex]))
        }
    }.onEvent<TabChange> {
        selectedItem = null
        selectedSlot = -1
    }

    private val descPanel = DescPanel(assetLoader, 124f)
    private val window = WindowPanel(assetLoader, title, null) {
        add(tabGroup)
        add(descPanel)
    }.onEvent<Close> {
        emit(it)
    }.onEvent<GridClick> { event ->
        event.item?.let {
            emit(ClickItem(it))
        }
    }


    private var selectedItem: ItemData? = null
    private var selectedSlot = -1

    override fun render(
        batch: SpriteBatch, sr: ShapeRenderer,
        cx: Float, cy: Float, cw: Float, ch: Float,
        delta: Float
    ) {
        window.render(batch, sr, cx + BORDER, cy + BORDER, cw - 2 * BORDER, ch - BORDER * 3 - 2, delta)
    }

    override fun dispose() {
        super.dispose()
        window.dispose()
    }

    // ── 描述面板组件 ─────────────────────────────────────────────

    inner class DescPanel(
        assetLoader: AssetLoader,
        private val offsetY: Float,
    ) : UIComponent(assetLoader) {

        private val descBorders = listOf(
            Pair(1, 26540.toColor()),
            Pair(1, 11267556.toColor()),
            Pair(1, 26540.toColor()),
        )

        override fun render(
            batch: SpriteBatch, sr: ShapeRenderer,
            cx: Float, cy: Float, cw: Float, ch: Float,
            delta: Float
        ) {
            // 自行偏移到 TabGroup 下方，高度取剩余空间
            val y = cy + offsetY
            val h = ch - offsetY

            // 背景 + 边框
            sr.begin(ShapeType.Filled)
            sr.drawRect(2780801.toColor(), cx, y, cw, h, Align.LEFT_TOP)
            sr.end()
            sr.drawRectBorder(cx, y, cw, h, descBorders, align = Align.LEFT_TOP)

            // 描述文字
            val selectedItem = this@ItemWindow.selectedItem ?: return
            val textX = cx + 6f
            val lineH = SMALL_FONT.lineHeight + 3f
            var textY = y + 6f
            batch.begin()
            batch.drawString(SMALL_FONT, selectedItem.name, Color.valueOf("#FFFF00"), textX, textY, Align.LEFT_TOP)
            textY += lineH
            selectedItem.defense?.let {
                batch.drawString(SMALL_FONT, "防御:$it", Color.valueOf("#FF8800"), textX, textY, Align.LEFT_TOP)
                textY += lineH
            }
            selectedItem.hp?.let {
                batch.drawString(SMALL_FONT, "生命:$it", Color.valueOf("#FF8800"), textX, textY, Align.LEFT_TOP)
                textY += lineH
            }
            selectedItem.mp?.let {
                batch.drawString(SMALL_FONT, "内力:$it", Color.valueOf("#FF8800"), textX, textY, Align.LEFT_TOP)
            }
            batch.end()
        }
    }

    // ── 单页格子 ─────────────────────────────────────────────────

    inner class ItemGrid(
        assetLoader: AssetLoader,
        private val items: List<ItemData>,
    ) : UIComponent(assetLoader) {
        override fun render(
            batch: SpriteBatch, sr: ShapeRenderer,
            cx: Float, cy: Float, cw: Float, ch: Float,
            delta: Float
        ) {
            var click: GridClick? = null
            val gap = (cw - COLS * SLOT_SIZE) / (COLS + 1)
            for (row in 0 until ROWS) {
                for (col in 0 until COLS) {
                    val slotIndex = row * COLS + col
                    val slotX = cx + gap + col * (SLOT_SIZE + gap)
                    val slotY = cy + gap + row * (SLOT_SIZE + gap)

                    batch.begin()
                    batch.drawImage(goods, slotX, slotY, align = Align.LEFT_TOP)
                    batch.end()

                    if (selectedSlot == slotIndex) {
                        // 四角黄色短线标记
                        val c = Color.valueOf("#FFFF00")
                        val l = 4f  // 角线长度
                        val x0 = slotX
                        val y0 = slotY
                        val x1 = slotX + SLOT_SIZE
                        val y1 = slotY + SLOT_SIZE
                        sr.begin(ShapeType.Line)
                        // 左上
                        sr.drawLine(c, x0, y0, x0 + l, y0)
                        sr.drawLine(c, x0, y0, x0, y0 + l)
                        // 右上
                        sr.drawLine(c, x1, y0, x1 - l, y0)
                        sr.drawLine(c, x1, y0, x1, y0 + l)
                        // 左下
                        sr.drawLine(c, x0, y1, x0 + l, y1)
                        sr.drawLine(c, x0, y1, x0, y1 - l)
                        // 右下
                        sr.drawLine(c, x1, y1, x1 - l, y1)
                        sr.drawLine(c, x1, y1, x1, y1 - l)
                        sr.end()
                    }

                    val item = items.getOrNull(slotIndex)
                    if (item != null) {
                        val icon = iconRes[item.iconRes]?.value
                        if (icon != null) {
                            batch.begin()
                            batch.drawImage(icon, slotX + 1f, slotY + 1f, align = Align.LEFT_TOP)
                            batch.end()
                        }
                    }

                    if (TouchContext.inTouch(slotX, slotY, SLOT_SIZE, SLOT_SIZE)) {
                        if (selectedSlot == slotIndex) {
                            click = GridClick(item)
                        } else {
                            selectedItem = item
                            selectedSlot = slotIndex
                        }
                    }
                }
            }

            if (click != null) {
                emit(click)
            }
        }
    }

    data class GridClick(val item: ItemData?)
}

data class ClickItem(val item: ItemData)
