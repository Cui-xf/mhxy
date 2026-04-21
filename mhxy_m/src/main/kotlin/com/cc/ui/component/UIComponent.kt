package com.cc.ui.component

import com.badlogic.gdx.assets.AssetManager
import com.badlogic.gdx.graphics.g2d.SpriteBatch
import com.badlogic.gdx.graphics.glutils.ShapeRenderer
import com.badlogic.gdx.utils.Disposable
import com.cc.asset.AssetLoader
import kotlin.reflect.KClass


abstract class UIComponent(private val assetLoader: AssetLoader) : Disposable {
    var parent: UIContainer? = null
    val listeners = mutableMapOf<KClass<*>, (Any) -> Unit>()

    abstract fun render(batch: SpriteBatch, sr: ShapeRenderer, cx: Float, cy: Float, cw: Float, ch: Float, delta: Float)

    @Suppress("UNCHECKED_CAST")
    inline fun <reified T : Any> onEvent(noinline handler: (T) -> Unit): UIComponent {
        listeners[T::class] = handler as (Any) -> Unit
        return this
    }

    fun emit(data: Any) {
        var handled = false
        listeners.forEach { (type, handler) ->
            if (type.isInstance(data)) {
                handler(data)
                handled = true
            }
        }
        if (!handled) {
            parent?.emit(data)
        }
    }

    protected fun <T : Any> resource(assetManager: AssetManager, name: String, type: KClass<T>): Lazy<T> =
        assetLoader.resource(assetManager, name, type)

    override fun dispose() {
    }
}
