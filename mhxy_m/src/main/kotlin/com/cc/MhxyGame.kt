package com.cc

import com.badlogic.gdx.Game
import com.badlogic.gdx.Gdx
import com.badlogic.gdx.graphics.g2d.SpriteBatch
import com.cc.screens.LogoScreen

class MhxyGame : Game() {

    lateinit var batch: SpriteBatch

    override fun create() {
        batch = SpriteBatch()
        setScreen(LogoScreen(this))
    }

    override fun dispose() {
        batch.dispose()
        screen?.dispose()
    }
}
