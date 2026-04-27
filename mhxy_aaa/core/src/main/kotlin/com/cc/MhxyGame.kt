package com.cc

import com.cc.screens.LogoScreen
import ktx.app.KtxGame
import ktx.app.KtxScreen
import ktx.async.KtxAsync

object MhxyGame : KtxGame<KtxScreen>(clearScreen = true) {
    private var pendingScreen: KtxScreen? = null

    override fun create() {
        KtxAsync.initiate()
        FontManager.init()
        addScreen(LogoScreen())
        setScreen<LogoScreen>()
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