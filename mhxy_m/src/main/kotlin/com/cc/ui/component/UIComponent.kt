package com.cc.ui.component

import com.badlogic.gdx.assets.AssetManager
import com.badlogic.gdx.graphics.g2d.SpriteBatch
import com.badlogic.gdx.graphics.glutils.ShapeRenderer
import com.cc.asset.AssetLoader
import kotlin.reflect.KClass


abstract class UIComponent(private val assetLoader: AssetLoader) {
    abstract fun render(batch: SpriteBatch, sr: ShapeRenderer, cx: Float, cy: Float, cw: Float, ch: Float, delta: Float)

    fun <T : Any> resource(assetManager: AssetManager, name: String, type: KClass<T>): Lazy<T> =
        assetLoader.resource(assetManager, name, type)
}
