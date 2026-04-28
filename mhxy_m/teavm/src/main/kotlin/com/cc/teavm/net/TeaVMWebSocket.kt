package com.cc.teavm.net

import com.cc.net.GameWebSocket

class TeaVMWebSocket : GameWebSocket() {
    private var ws: JsWebSocket? = null

    override fun connect(url: String) {
        ws = JsWebSocket.create(url).apply {
            setOnMessage { event -> onRawMessage(event.data) }
            setOnClose { event -> onClose?.invoke(event.code, event.reason) }
            setOnError { onError?.invoke(RuntimeException("WebSocket error")) }
        }
    }

    override fun sendRaw(message: String) {
        ws?.send(message)
    }

    override fun close(code: Int, reason: String) {
        ws?.close(code, reason)
    }
}
