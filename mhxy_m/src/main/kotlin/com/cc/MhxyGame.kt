package com.cc

import com.badlogic.gdx.Game
import com.badlogic.gdx.graphics.g2d.SpriteBatch
import com.cc.screens.LogoScreen

object MhxyGame : Game() {

    lateinit var batch: SpriteBatch

    override fun create() {
        batch = SpriteBatch()
        setScreen(LogoScreen())
    }

    override fun dispose() {
        batch.dispose()
        screen?.dispose()
        FontManager.dispose()
    }
}
