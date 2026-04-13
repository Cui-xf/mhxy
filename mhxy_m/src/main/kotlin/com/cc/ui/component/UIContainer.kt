package com.cc.ui.component

import com.badlogic.gdx.graphics.g2d.SpriteBatch
import com.badlogic.gdx.graphics.glutils.ShapeRenderer
import com.cc.asset.AssetLoader

abstract class UIContainer(assetLoader: AssetLoader, block: UIContainer.() -> Unit) : UIComponent(assetLoader) {
    val children = mutableListOf<UIComponent>()

    init {
        block()
    }


    fun add(c: UIComponent) {
        c.parent = this
        children.add(c)
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
        renderSelf(batch, sr, cx, cy, cw, ch)
        val (top, bottom, left, right) = border()
        children.forEach { it.render(batch, sr, cx + left, cy + top, cw - left - right, ch - top - bottom, delta) }
    }

    abstract fun renderSelf(batch: SpriteBatch, sr: ShapeRenderer, cx: Float, cy: Float, cw: Float, ch: Float)

    open fun border(): Border = Border(0f, 0f, 0f, 0f)
}

data class Border(
    val top: Float,
    val bottom: Float,
    val left: Float,
    val right: Float,
)
