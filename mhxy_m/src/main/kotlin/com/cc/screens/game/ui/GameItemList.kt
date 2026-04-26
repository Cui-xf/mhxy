package com.cc.screens.game.ui

import com.badlogic.gdx.graphics.g2d.SpriteBatch
import com.badlogic.gdx.graphics.glutils.ShapeRenderer
import com.cc.asset.AssetLoader
import com.cc.screens.base.ItemWindow
import com.cc.ui.component.Close
import com.cc.ui.component.UIComponent

class GameItemList(assetLoader: AssetLoader) : UIComponent(assetLoader) {
    private var visible = false

    private val itemWindow = ItemWindow(assetLoader, "背包")
        .onEvent<Close> {
            visible = false
        }

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
        itemWindow.render(batch, sr, cx, cy, cw, ch, delta)
    }

    fun toggle() {
        visible = !visible
    }
}