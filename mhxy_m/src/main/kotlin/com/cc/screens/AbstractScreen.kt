package com.cc.screens

import com.badlogic.gdx.Gdx
import com.badlogic.gdx.ScreenAdapter
import com.badlogic.gdx.graphics.g2d.SpriteBatch
import com.badlogic.gdx.math.Vector3
import com.badlogic.gdx.utils.viewport.FitViewport

abstract class AbstractScreen : ScreenAdapter() {
    companion object {
        const val VIRTUAL_W = 240f
        const val VIRTUAL_H = 320f
    }

    protected val viewport = FitViewport(VIRTUAL_W, VIRTUAL_H)
    protected val batch = SpriteBatch()

    // 每帧自动更新为逻辑坐标，子类直接用
    protected var touchX = 0f
    protected var touchY = 0f

    private val _touchVec = Vector3()

    final override fun render(delta: Float) {
        _touchVec.set(Gdx.input.x.toFloat(), Gdx.input.y.toFloat(), 0f)
        viewport.unproject(_touchVec)
        touchX = _touchVec.x
        touchY = _touchVec.y

        viewport.apply()
        batch.projectionMatrix = viewport.camera.combined

        Gdx.gl.glClearColor(0f, 0f, 0f, 1f)
        update(delta)
    }

    override fun resize(width: Int, height: Int) {
        viewport.update(width, height, true)
    }

    abstract fun update(delta: Float)
}
