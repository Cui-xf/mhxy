package com.cc.screens

import com.badlogic.gdx.Gdx
import com.badlogic.gdx.graphics.Texture
import com.cc.MhxyGame

class LogoScreen : AbstractScreen() {
    private val logo = Texture(Gdx.files.classpath("assets/logo.png"))

    private var frameCounter: Float = 260f

    override fun update(delta: Float) {
        frameCounter += delta * 5 * 50f

        val alpha = (1 - (515f - frameCounter).coerceAtLeast(0f) / 255f).coerceIn(0f, 1f)

        // logo 居中绘制
        val logoW = logo.width.toFloat()
        val logoH = logo.height.toFloat()
        val x = (VIRTUAL_W - logoW) / 2f
        val y = (VIRTUAL_H - logoH) / 2f

        batch.begin()
        batch.setColor(1f, 1f, 1f, alpha)
        batch.draw(logo, x, y, logoW, logoH)
        batch.end()

        if (frameCounter >= 515f) {
            MhxyGame.setScreen(LoadingScreen())
            dispose()
        }
    }

    override fun dispose() {
        logo.dispose()
    }
}
