package com.cc.teavm.net

import com.cc.net.GameHttp
import com.cc.net.GameWebSocket
import com.cc.net.NetProvider

class TeaVMNetProvider : NetProvider {
    override fun createHttp(): GameHttp = TeaVMHttp()
    override fun createWebSocket(): GameWebSocket = TeaVMWebSocket()
}
