package com.cc.screens.game.hud

import com.badlogic.gdx.graphics.Color
import com.badlogic.gdx.graphics.Pixmap
import com.badlogic.gdx.graphics.Texture
import com.badlogic.gdx.graphics.g2d.SpriteBatch
import com.badlogic.gdx.graphics.glutils.ShapeRenderer
import com.cc.FontManager.SMALL_FONT
import com.cc.asset.AssetLoader
import com.cc.asset.AssetManagerFactory.PUBLIC_ASSET
import com.cc.event.TouchContext
import com.cc.render.Align
import com.cc.render.drawImage
import com.cc.render.wordArtString
import com.cc.screens.AbstractScreen.Companion.VIRTUAL_W
import com.cc.ui.component.UIComponent

/** 右侧固定菜单栏，每个入口包含 icon + 名字 */
class SideMenu(assetLoader: AssetLoader) : UIComponent(assetLoader) {

    /** 菜单项点击事件 */
    data class MenuClick(val id: String)

    private val iconMapRaw by resource(PUBLIC_ASSET, "rpg/icon/36_1507487.png", Texture::class)
    private val iconBagRaw by resource(PUBLIC_ASSET, "rpg/icon/97_47686606.png", Texture::class)
    private val menu by resource(PUBLIC_ASSET, "rpg/icon/menu.png", Texture::class)

    private val iconMap by lazy { removeBlackBg(iconMapRaw) }
    private val iconBag by lazy { removeBlackBg(iconBagRaw) }

    private data class Entry(val id: String, val label: String, val icon: () -> Texture)

    private val entries by lazy {
        listOf(
            Entry("map", "地图", ::iconMap),
            Entry("bag", "背包", ::iconBag),
            Entry("menu", "菜单", ::menu),
        )
    }

    private fun removeBlackBg(tex: Texture): Texture {
        tex.textureData.prepare()
        val raw = tex.textureData.consumePixmap()
        val src = Pixmap(raw.width, raw.height, Pixmap.Format.RGBA8888)
        src.drawPixmap(raw, 0, 0)
        val dst = Pixmap(src.width, src.height, Pixmap.Format.RGBA8888)
        for (y in 0 until src.height) {
            for (x in 0 until src.width) {
                val pixel = src.getPixel(x, y)
                val r = (pixel ushr 24) and 0xFF
                val g = (pixel ushr 16) and 0xFF
                val b = (pixel ushr 8) and 0xFF
                if (r < 30 && g < 30 && b < 30) dst.drawPixel(x, y, 0)
                else dst.drawPixel(x, y, pixel)
            }
        }
        src.dispose()
        val result = Texture(dst)
        dst.dispose()
        return result
    }

    companion object {
        private const val ITEM_W = 26f
        private const val PADDING_TOP = 50f
        private const val PADDING_RIGHT = 2f
        private val TEXT_COLOR = Color.YELLOW
        private val TEXT_OUTLINE = Color.BLACK
    }

    override fun render(
        batch: SpriteBatch,
        sr: ShapeRenderer,
        cx: Float, cy: Float, cw: Float, ch: Float,
        delta: Float
    ) {
        val itemH = ITEM_W + SMALL_FONT.lineHeight
        val menuX = VIRTUAL_W - ITEM_W - PADDING_RIGHT
        val menuY = PADDING_TOP
        batch.begin()
        for ((i, entry) in entries.withIndex()) {
            val itemY = menuY + i * (itemH + 5)
            batch.drawImage(entry.icon(), menuX, itemY, ITEM_W, ITEM_W, align = Align.LEFT_TOP)
            val textX = menuX + ITEM_W / 2f
            val textY = itemY + 20
            batch.wordArtString(SMALL_FONT, entry.label, TEXT_OUTLINE, TEXT_COLOR, textX, textY, Align.CENTER_TOP)
        }
        batch.end()
        for ((i, entry) in entries.withIndex()) {
            val itemY = menuY + i * itemH
            if (TouchContext.inTouch(menuX, itemY, ITEM_W, itemH)) {
                emit(MenuClick(entry.id))
            }
        }
    }
}
