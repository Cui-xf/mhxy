package com.cc

import com.badlogic.gdx.Game
import com.badlogic.gdx.Screen
import com.cc.asset.AssetManagerFactory
import com.cc.net.Net
import com.cc.net.connectSuspend
import com.cc.screens.LogoScreen

object MhxyGame : Game() {
    private var pendingScreen: Screen? = null

    override fun create() {
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
        val ws = Net.webSocket()
        ws.onMessage = { msg -> println("[WS] received: $msg") }
        ws.onClose = { code, reason -> println("[WS] closed: $code $reason") }
        ws.onError = { err -> println("[WS] error: ${err.message}") }
        try {
            ws.connectSuspend("ws://127.0.0.1:20009")
            println("[WS] connected to ws://127.0.0.1:20009")
        } catch (e: Exception) {
            println("[WS] connect failed: ${e.message}")
        }
    }

    override fun dispose() {
        screen?.dispose()
        FontManager.dispose()
        AssetManagerFactory.dispose()
    }
}
