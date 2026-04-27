package com.cc

import com.badlogic.gdx.graphics.Texture
import com.badlogic.gdx.graphics.g2d.SpriteBatch
import com.cc.screens.LogoScreen
import ktx.app.KtxGame
import ktx.app.KtxScreen
import ktx.app.clearScreen
import ktx.assets.disposeSafely
import ktx.assets.toInternalFile
import ktx.async.KtxAsync
import ktx.graphics.use

object MhxyGame : KtxGame<KtxScreen>(clearScreen = true) {
    private var pendingScreen: KtxScreen? = null

    override fun create() {
        KtxAsync.initiate()
        FontManager.init()
        addScreen(LogoScreen())
//        addScreen(FirstScreen())
        setScreen<LogoScreen>()
//        setScreen<FirstScreen>()
    }

    override fun render() {
        pendingScreen?.let {
            pendingScreen = null
            val last = super.currentScreen as KtxScreen
            super.setScreen(it.javaClass)
            super.removeScreen(last.javaClass)
            last.dispose()
        }
        super.render()
    }

    fun setScreen(screen: KtxScreen) {
        addScreen(screen.javaClass, screen)
        pendingScreen = screen
    }
}

class FirstScreen : KtxScreen {
    private val image =
        Texture("logo.png".toInternalFile(), true).apply {
            setFilter(
                Texture.TextureFilter.Linear,
                Texture.TextureFilter.Linear
            )
        }
    private val batch = SpriteBatch()

    override fun render(delta: Float) {
        clearScreen(red = 0.7f, green = 0.7f, blue = 0.7f)
        batch.use {
            it.draw(image, 100f, 160f)
        }
    }

    override fun dispose() {
        image.disposeSafely()
        batch.disposeSafely()
    }
}
