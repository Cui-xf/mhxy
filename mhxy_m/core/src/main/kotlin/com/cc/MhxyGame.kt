package com.cc

import com.badlogic.gdx.Game
import com.badlogic.gdx.Screen
import com.cc.asset.AssetManagerFactory
import com.cc.net.NetChannel
import com.cc.screens.LogoScreen

object MhxyGame : Game() {
    private var pendingScreen: Screen? = null

    override fun create() {
        FontManager.init()
        connectServer()
        setScreen(LogoScreen())
    }

    private fun connectServer() {
        NetChannel.send("startUp").then {
            println("Connected server:${it}")
        }
    }

    override fun render() {
        pendingScreen?.let {
            pendingScreen = null
            val last = super.screen
            super.setScreen(it)
            last?.dispose()
        }
        super.render()
    }

    override fun setScreen(screen: Screen) {
        pendingScreen = screen
    }

    override fun dispose() {
        screen?.dispose()
        FontManager.dispose()
        AssetManagerFactory.dispose()
    }
}
