package com.cc.screens

import com.badlogic.gdx.Gdx
import com.badlogic.gdx.ScreenAdapter
import com.badlogic.gdx.graphics.g2d.SpriteBatch

abstract class AbstractScreen : ScreenAdapter() {
    companion object {
        val SCREEN_W = Gdx.graphics.width.toFloat()
        val SCREEN_H = Gdx.graphics.height.toFloat()
    }

    protected val batch = SpriteBatch()

    final override fun render(delta: Float) {
        Gdx.gl.glClearColor(0f, 0f, 0f, 1f)
        update(delta)
    }

    abstract fun update(delta: Float)
}
