package com.cc.ui.component

import com.badlogic.gdx.assets.AssetManager
import com.badlogic.gdx.graphics.g2d.SpriteBatch
import com.badlogic.gdx.graphics.glutils.ShapeRenderer
import com.cc.asset.AssetLoader
import kotlin.reflect.KClass


abstract class UIComponent(private val assetLoader: AssetLoader) {
    var parent: UIContainer? = null
    val listeners = mutableMapOf<KClass<*>, (Any) -> Unit>()

    abstract fun render(batch: SpriteBatch, sr: ShapeRenderer, cx: Float, cy: Float, cw: Float, ch: Float, delta: Float)

    open fun handleInput() {}

    @Suppress("UNCHECKED_CAST")
    inline fun <reified T : Any> onEvent(noinline handler: (T) -> Unit): UIComponent {
        listeners[T::class] = handler as (Any) -> Unit
        return this
    }

    fun emit(data: Any) {
        val handler = listeners[data::class]
        if (handler != null) {
            handler(data)
        } else {
            parent?.emit(data)
        }
    }

    protected fun <T : Any> resource(assetManager: AssetManager, name: String, type: KClass<T>): Lazy<T> =
        assetLoader.resource(assetManager, name, type)
}
