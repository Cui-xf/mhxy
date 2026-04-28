package com.cc.net

import com.cc.common.net.NetCmd
import com.cc.util.JSON

interface NetProvider {
    fun createHttp(): GameHttp
    fun createWebSocket(): GameWebSocket
}

object Net {
    lateinit var provider: NetProvider

    fun http(): GameHttp = provider.createHttp()
    fun webSocket() = provider.createWebSocket()
}

object NetChannel {
    private val ws = connectServer()

    fun send(cmd: NetCmd): WsPromise {
        return ws.send(NetCmd.encode(cmd, JSON.toJson(cmd)))
    }

    private fun connectServer(): GameWebSocket {
        val ws = Net.webSocket()
        ws.onMessage = { msg -> println("[WS] received: $msg") }
        ws.onClose = { code, reason -> println("[WS] closed: $code $reason") }
        ws.onError = { err -> println("[WS] error: ${err.message}") }
        ws.connect("ws://127.0.0.1:20009")
        return ws
    }
}

