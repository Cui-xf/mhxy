package com.cc.screens

import com.badlogic.gdx.Gdx
import com.badlogic.gdx.Screen
import com.badlogic.gdx.graphics.GL20
import com.badlogic.gdx.graphics.Texture
import com.badlogic.gdx.graphics.g2d.SpriteBatch
import com.cc.MhxyGame

class LogoScreen(private val game: MhxyGame) : Screen {

    private val batch = SpriteBatch()
    private val logo = Texture( Gdx.files.classpath("assets/logo.jpg"))

    private var elapsed = 0f
    private val showDuration = 2.5f

    override fun show() {}

    override fun render(delta: Float) {
        elapsed += delta

        val alpha = when {
            elapsed < showDuration * 0.35f -> elapsed / (showDuration * 0.35f)
            elapsed < showDuration * 0.65f -> 1f
            else -> 1f - (elapsed - showDuration * 0.65f) / (showDuration * 0.35f)
        }.coerceIn(0f, 1f)

        Gdx.gl.glClearColor(0f, 0f, 0f, 1f)
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT)

        batch.begin()
        batch.setColor(1f, 1f, 1f, alpha)
        // 居中显示 logo，竖屏 600x800
        batch.draw(logo, 0f, 200f, 600f, 400f)
        batch.end()

        if (elapsed >= showDuration) {
            game.setScreen(LoadingScreen(game))
            dispose()
        }
    }

    override fun resize(width: Int, height: Int) {}
    override fun pause() {}
    override fun resume() {}
    override fun hide() {}

    override fun dispose() {
        batch.dispose()
        logo.dispose()
    }
}
