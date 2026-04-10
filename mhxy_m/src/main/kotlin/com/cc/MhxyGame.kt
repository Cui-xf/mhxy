package com.cc

import com.badlogic.gdx.Game
import com.badlogic.gdx.Screen
import com.cc.asset.AssetManagerFactory
import com.cc.screens.LogoScreen

object MhxyGame : Game() {
    override fun create() {
        setScreen(LogoScreen())
    }

    override fun setScreen(screen: Screen) {
        val lastScreen = super.screen
        super.setScreen(screen)
        lastScreen?.dispose()
    }

    override fun dispose() {
        screen?.dispose()
        FontManager.dispose()
        AssetManagerFactory.dispose()
    }
}
