package com.cc.net

interface NetProvider {
    fun createHttp(): GameHttp
    fun createWebSocket(): GameWebSocket
}

object Net {
    lateinit var provider: NetProvider

    fun http(): GameHttp = provider.createHttp()
    fun webSocket(): GameWebSocket = provider.createWebSocket()
}
