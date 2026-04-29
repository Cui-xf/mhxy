package com.cc

import com.badlogic.gdx.Game
import com.badlogic.gdx.Screen
import com.badlogic.gdx.utils.TimeUtils
import com.cc.asset.AssetManagerFactory
import com.cc.common.net.Handshake
import com.cc.common.net.Ticket
import com.cc.net.NetChannel
import com.cc.screens.LogoScreen
import kotlin.concurrent.thread

object MhxyGame : Game() {
    private var pendingScreen: Screen? = null

    override fun create() {
        FontManager.init()
        connectServer()
        setScreen(LogoScreen())
    }

    private fun connectServer() {
        NetChannel.send(Handshake(TimeUtils.millis())).then {
            println("Connected server:${it}")
        }
        thread {
            while (true) {
                NetChannel.send(Ticket(TimeUtils.millis())).then {
                    println("Connected server:${it}")
                }
                Thread.sleep(3000)
            }
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
