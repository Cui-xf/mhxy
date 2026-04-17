package com.cc.screens.game

import com.badlogic.gdx.graphics.Color
import com.badlogic.gdx.graphics.Pixmap
import com.badlogic.gdx.graphics.Texture
import com.badlogic.gdx.graphics.g2d.SpriteBatch
import com.badlogic.gdx.graphics.glutils.ShapeRenderer
import com.cc.FontManager
import com.cc.asset.AssetLoader
import com.cc.render.drawRect
import com.cc.render.drawString
import com.cc.screens.AbstractScreen.Companion.VIRTUAL_H
import com.cc.ui.component.UIComponent

class MiniMap(
    assetLoader: AssetLoader,
    private val map: ScreenMap,
    private val gameScreen: GameScreen
) : UIComponent(assetLoader) {
    // 小地图
    private val miniScale = 4f                      // 缩放比，对应原始 fenBianLv=8
    private val miniLeft = 2f                       // 小地图左上角 x
    private val miniTop = 2f + 12f                  // 小地图左上角 y（留出字体高度）
    private lateinit var miniMapTex: Texture         // 碰撞底图纹理（初始化一次）

    override fun render(
        batch: SpriteBatch,
        sr: ShapeRenderer,
        cx: Float,
        cy: Float,
        cw: Float,
        ch: Float,
        delta: Float
    ) {
        val miniW = (map.mapW / miniScale).toInt()
        val miniH = (map.mapH / miniScale).toInt()

        if (!::miniMapTex.isInitialized) {
            val pixmap = Pixmap(miniW, miniH, Pixmap.Format.RGBA8888)
            // 背景：深灰绿（原始 0x818181 偏绿）
            pixmap.setColor(Color.valueOf("81a881ff"))
            pixmap.fill()
            // 碰撞格：深绿色小点
            pixmap.setColor(Color.valueOf("055605ff"))
            for (col in map.collisionBit.indices) {
                for (row in map.collisionBit[col].indices) {
                    if (map.collisionBit[col][row]) {
                        val px = (col * map.collisionW / miniScale).toInt().coerceIn(0, miniW - 1)
                        val py = (row * map.collisionH / miniScale).toInt().coerceIn(0, miniH - 1)
                        pixmap.drawPixel(px, py)
                    }
                }
            }
            miniMapTex = Texture(pixmap)
            pixmap.dispose()
        }

        // 画小地图底图
        batch.begin()
        batch.draw(miniMapTex, miniLeft, VIRTUAL_H - miniTop - miniH)
        batch.end()

        val npcColor = Color.valueOf("d4aaebff")
        sr.begin(ShapeRenderer.ShapeType.Filled)

        // NPC 紫色小点
        for (n in gameScreen.npc) {
            sr.drawRect(npcColor, miniLeft + n.mapX / miniScale, miniTop + n.mapY / miniScale, 2f, 2f)
        }

        // 玩家红点
        sr.drawRect(
            Color.RED,
            miniLeft + gameScreen.player.roleMapX / miniScale,
            miniTop + gameScreen.player.roleMapY / miniScale,
            2f,
            2f
        )

        sr.end()

        // 坐标文字：格子坐标 j/16, k/16，在小地图下方
        batch.begin()
        batch.drawString(
            FontManager.SMALL_FONT,
            "${(gameScreen.player.roleMapX / 16).toInt()},${(gameScreen.player.roleMapY / 16).toInt()}",
            Color.WHITE,
            miniLeft,
            miniTop + miniH + 2f,
            com.cc.render.Align.LEFT_TOP
        )
        batch.end()
    }

    override fun dispose() {
        miniMapTex.dispose()
    }
}