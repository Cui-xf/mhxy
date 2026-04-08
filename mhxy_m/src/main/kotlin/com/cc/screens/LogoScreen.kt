package com.cc.screens

import com.badlogic.gdx.Gdx
import com.badlogic.gdx.graphics.Texture
import com.cc.MhxyGame

class LogoScreen : AbstractScreen() {
    private val logo = Texture(Gdx.files.classpath("assets/logo.png"))

    private var frameCounter: Float = 260f

    override fun show() {}

    override fun update(delta: Float) {
        frameCounter += delta * 5 * 60f

        val alpha = ((515f - frameCounter).coerceAtLeast(0f) / 255f).coerceIn(0f, 1f)

        // logo 居中绘制
        val logoW = logo.width.toFloat()
        val logoH = logo.height.toFloat()
        val x = (SCREEN_W - logoW) / 2f
        val y = (SCREEN_H - logoH) / 2f

        batch.begin()
        batch.setColor(1f, 1f, 1f, alpha)
        batch.draw(logo, x, y)
        batch.end()

        if (frameCounter >= 515f) {
            MhxyGame.setScreen(LoadingScreen(MhxyGame))
            dispose()
        }
    }

    override fun dispose() {
        super.dispose()
        logo.dispose()
    }
}
