package com.cc.lwjgl3.net

import com.cc.net.GameHttp
import com.cc.net.GameWebSocket
import com.cc.net.NetProvider

class DesktopNetProvider : NetProvider {
    override fun createHttp(): GameHttp = DesktopHttp()
    override fun createWebSocket(): GameWebSocket = DesktopWebSocket()
}
