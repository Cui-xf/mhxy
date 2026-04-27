package com.cc

import com.cc.asset.AssetManagerFactory
import com.cc.net.Net
import com.cc.net.connectSuspend
import com.cc.screens.LogoScreen
import kotlinx.coroutines.launch
import ktx.app.KtxGame
import ktx.app.KtxScreen
import ktx.async.KtxAsync

object MhxyGame : KtxGame<KtxScreen>(clearScreen = true) {
    private var pendingScreen: KtxScreen? = null

    override fun create() {
        KtxAsync.initiate()
        FontManager.init()
        connectServer()
        addScreen(LogoScreen())
        setScreen<LogoScreen>()
    }

    private fun connectServer() {
        val ws = Net.webSocket()
        ws.onMessage = { msg -> println("[WS] received: $msg") }
        ws.onClose = { code, reason -> println("[WS] closed: $code $reason") }
        ws.onError = { err -> println("[WS] error: ${err.message}") }
        KtxAsync.launch {
            try {
                ws.connectSuspend("ws://127.0.0.1:20009")
                println("[WS] connected to ws://127.0.0.1:20009")
            } catch (e: Exception) {
                println("[WS] connect failed: ${e.message}")
            }
        }
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

    override fun dispose() {
        FontManager.dispose()
        AssetManagerFactory.dispose()
    }
}