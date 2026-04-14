package com.cc.screens

import com.badlogic.gdx.graphics.g2d.SpriteBatch
import com.badlogic.gdx.graphics.glutils.ShapeRenderer
import com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType
import com.cc.FontManager.MEDIA_FONT
import com.cc.MhxyGame
import com.cc.asset.AssetLoader
import com.cc.asset.AssetManagerFactory.PUBLIC_ASSET
import com.cc.asset.RpgAnimation
import com.cc.event.TouchContext
import com.cc.render.*
import com.cc.screens.base.BaseBackGround
import com.cc.screens.game.GameScreen
import com.cc.ui.component.UIComponent
import com.cc.ui.component.WindowPanel

class RoleSelectScreen : AbstractScreen() {
    private val backGround = BaseBackGround
    private val windowW = VIRTUAL_W * 0.95f
    private val windowH = VIRTUAL_H * 0.95f
    private val windowX = (VIRTUAL_W - windowW) / 2
    private val windowY = (VIRTUAL_H - windowH) / 2

    private val roleList = listOf(
        RoleInfo("欧阳娜娜", 6, "rpg/role/f31112", "rpg/role/f31111"), null, null, null
    )
    private val rolePanel = RoleGridPanel(assetLoader, roleList)
    private val infoPanel = InfoPanel(assetLoader)
    private val window = WindowPanel(assetLoader) { add(rolePanel); add(infoPanel) }
    private var timer = 0f

    override fun show() {
        window.onEvent<Int> { updateSelectedRole(it) }
            .onEvent<String> { MhxyGame.setScreen(GameScreen()) }
        updateSelectedRole(0)
    }

    fun updateSelectedRole(index: Int) {
        val info = roleList.getOrNull(index)
        if (info != null) {
            window.title = "角色列表"
            window.bottomText = "进入游戏"
        } else {
            window.title = "创建角色"
            window.bottomText = "创建角色"
        }
        rolePanel.selectedIndex = index
        infoPanel.info = info
    }


    override fun update(delta: Float) {
        timer += delta
        backGround.render(batch, sr, 0f, 0f, VIRTUAL_W, VIRTUAL_H, delta)
        window.render(batch, sr, windowX, windowY, windowW, windowH, delta)
    }

    override fun dispose() {
        sr.dispose()
        super.dispose()
    }
}

class RoleGridPanel(
    assetLoader: AssetLoader,
    roleList: List<RoleInfo?>,
    var selectedIndex: Int = 0,
) : UIComponent(assetLoader) {
    companion object {
        private const val roleBox = 55f
        const val h = roleBox * 2 + 10f
    }

    private val animation = roleList.map {
        if (it != null) {
            Pair(
                resource(PUBLIC_ASSET, it.selectResId1, RpgAnimation::class),
                resource(PUBLIC_ASSET, it.idleResId2, RpgAnimation::class)
            )
        } else {
            null
        }
    }

    private var timer = 0f
    override fun render(
        batch: SpriteBatch,
        sr: ShapeRenderer,
        cx: Float,
        cy: Float,
        cw: Float,
        ch: Float,
        delta: Float
    ) {
        timer += delta
        fillBox(sr, cx, cy, cw, h)
        val cy = cy + 3
        val gapW = (cw - roleBox * 2) / 3
        animation.forEachIndexed { index, pair ->
            val row = index % 2
            val clo = index / 2
            val x = cx + gapW + (gapW + roleBox) * row
            val y = cy + roleBox * clo

            if (TouchContext.inTouch(x, y, roleBox, roleBox)) {
                if (selectedIndex == index) {
                    emit("enter:${index}")
                } else {
                    emit(index)
                    selectedIndex = index
                }
            }

            val selected = selectedIndex == index
            sr.begin(ShapeType.Filled)
            sr.drawRect(409969.toColor(), x, y, roleBox, roleBox, align = Align.LEFT)
            sr.drawRect(
                if (selected) 6597852.toColor() else 5018307.toColor(),
                x + 3,
                y + 3,
                roleBox - 6,
                roleBox - 6,
                align = Align.LEFT
            )
            sr.end()
            sr.begin(ShapeType.Line)
            sr.drawRect(
                if (selected) 16775125.toColor() else 3775208.toColor(),
                x + 1,
                y + 1,
                roleBox - 2,
                roleBox - 2,
                align = Align.LEFT
            )
            sr.end()
            if (pair != null) {
                val roleX = if (selected) {
                    x + roleBox / 2 + 8
                } else {
                    x + roleBox / 2 - 5
                }
                val roleY = if (selected) {
                    y + 58
                } else {
                    y + 45
                }
                batch.begin()
                val keyFrame = if (selected) {
                    pair.first.value.getKeyFrame(timer, true)
                } else {
                    pair.second.value.getKeyFrame(timer, true)
                }
                batch.drawAnimation(keyFrame, roleX, roleY)
                batch.end()
            }
        }
    }
}

class InfoPanel(assetLoader: AssetLoader, var info: RoleInfo? = null) : UIComponent(assetLoader) {
    override fun render(
        batch: SpriteBatch,
        sr: ShapeRenderer,
        cx: Float,
        cy: Float,
        cw: Float,
        ch: Float,
        delta: Float
    ) {
        val cy = cy + RoleGridPanel.h
        val ch = ch - RoleGridPanel.h
        fillBox(sr, cx, cy, cw, ch)
        if (info != null) {
            batch.begin()
            batch.drawString(
                MEDIA_FONT,
                "昵称：${info!!.nickName}",
                2176196.toColor(),
                cx + 4,
                cy + 8,
                align = Align.LEFT
            )
            batch.drawString(
                MEDIA_FONT,
                "等级：${info!!.level}",
                2176196.toColor(),
                cx + 4,
                cy + 8 + MEDIA_FONT.lineHeight,
                align = Align.LEFT
            )
            batch.end()
        }
    }
}

private fun fillBox(sr: ShapeRenderer, cx: Float, cy: Float, cw: Float, ch: Float) {
    sr.begin(ShapeType.Filled)
    sr.drawRect(6732228.toColor(), cx, cy, cw, ch, align = Align.LEFT)
    sr.end()
    sr.begin(ShapeType.Line)
    sr.drawRect(26540.toColor(), cx, cy, cw, ch, align = Align.LEFT)
    sr.drawRect(11267556.toColor(), cx + 1, cy + 1, cw - 2, ch - 2, align = Align.LEFT)
    sr.drawRect(26540.toColor(), cx + 2, cy + 2, cw - 4, ch - 4, align = Align.LEFT)
    sr.end()
}

data class RoleInfo(
    val nickName: String,
    val level: Int,
    val selectResId1: String,
    val idleResId2: String,
)