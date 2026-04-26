package com.cc.screens.game.hud

import com.badlogic.gdx.graphics.g2d.SpriteBatch
import com.badlogic.gdx.graphics.glutils.ShapeRenderer
import com.cc.asset.AssetLoader
import com.cc.event.TouchContext
import com.cc.screens.base.ItemWindow
import com.cc.ui.component.Close
import com.cc.ui.component.UIComponent

class GameItemList(
    assetLoader: AssetLoader
) : UIComponent(assetLoader) {

    companion object {
        const val Z = 200
    }

    private var visible = false

    private val itemWindow = ItemWindow(assetLoader, "物品行囊")
        .onEvent<Close> { hide() }

    override fun render(
        batch: SpriteBatch,
        sr: ShapeRenderer,
        cx: Float,
        cy: Float,
        cw: Float,
        ch: Float,
        delta: Float
    ) {
        if (!visible) return
        TouchContext.withZ(Z) {
            itemWindow.render(batch, sr, cx, cy, cw, ch, delta)
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
}
