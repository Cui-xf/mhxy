package com.cc.screens

import com.badlogic.gdx.Gdx
import com.badlogic.gdx.ScreenAdapter
import com.badlogic.gdx.assets.AssetManager
import com.badlogic.gdx.graphics.GL20
import com.badlogic.gdx.graphics.g2d.SpriteBatch
import com.badlogic.gdx.graphics.glutils.ShapeRenderer
import com.badlogic.gdx.math.Vector3
import com.badlogic.gdx.utils.Disposable
import com.badlogic.gdx.utils.viewport.FitViewport
import com.cc.asset.AssetLoader
import kotlin.reflect.KClass

abstract class AbstractScreen : ScreenAdapter() {
    companion object {
        const val VIRTUAL_W = 240f
        const val VIRTUAL_H = 320f
    }

    protected val viewport = FitViewport(VIRTUAL_W, VIRTUAL_H)
    protected val batch = SpriteBatch()
    protected val autoDispose = mutableSetOf<Disposable>()

    // 每帧自动更新为逻辑坐标，子类直接用
    protected var touchX = 0f
    protected var touchY = 0f
    private val _touchVec = Vector3()

    protected val assetLoader = AssetLoader()

    final override fun render(delta: Float) {
        Gdx.gl.glClearColor(0f, 0f, 0f, 1f)
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT)
        if (!assetLoader.isFinished()) {
            assetLoader.update()
            return
        }

        _touchVec.set(Gdx.input.x.toFloat(), Gdx.input.y.toFloat(), 0f)
        viewport.unproject(_touchVec)
        touchX = _touchVec.x
        touchY = _touchVec.y

        viewport.apply()
        batch.projectionMatrix = viewport.camera.combined

        update(delta)
    }

    override fun resize(width: Int, height: Int) {
        viewport.update(width, height, true)
    }

    abstract fun update(delta: Float)

    fun <T : Any> resource(assetManager: AssetManager, name: String, type: KClass<T>): Lazy<T> =
        assetLoader.resource(assetManager, name, type)

    /**
     * 创建一个自动同步 viewport camera 矩阵的 ShapeRenderer。
     * 子类用此方法替代直接 `ShapeRenderer()`，之后正常调用 `begin()` 即可。
     */
    protected fun createShapeRenderer(): ShapeRenderer = object : ShapeRenderer() {
        override fun begin(type: ShapeType) {
            projectionMatrix = viewport.camera.combined
            super.begin(type)
        }
    }

    protected inline fun <T : Disposable> autoDispose(block: () -> T): T {
        val element = block()
        autoDispose.add(element)
        return element
    }

    override fun dispose() {
        super.dispose()
        batch.dispose()
        for (disposable in autoDispose) {
            try {
                disposable.dispose()
            } catch (_: Exception) {
            }
        }
        assetLoader.dispose()
    }
}
