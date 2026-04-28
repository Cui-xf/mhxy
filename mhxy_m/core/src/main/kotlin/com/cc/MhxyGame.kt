package com.cc

import com.badlogic.gdx.Game
import com.badlogic.gdx.Screen
import com.cc.asset.AssetManagerFactory
import com.cc.net.Net
import com.cc.screens.LogoScreen

object MhxyGame : Game() {
    private var pendingScreen: Screen? = null

    override fun create() {
        FontManager.init()
        connectServer()
        setScreen(LogoScreen())
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

    private fun connectServer() {
        val channel = Net.webSocket("ws://127.0.0.1:20009")
        channel.onMessage = { msg -> println("[WS] received: $msg") }
        channel.onClose = { code, reason -> println("[WS] closed: $code $reason") }
        channel.onError = { err -> println("[WS] error: ${err.message}") }
    }

    override fun dispose() {
        screen?.dispose()
        FontManager.dispose()
        AssetManagerFactory.dispose()
    }
}
