package com.cc.teavm.net

import com.cc.net.GameWebSocket

class TeaVMWebSocket : GameWebSocket {
    private var ws: JsWebSocket? = null

    override var onOpen: (() -> Unit)? = null
    override var onMessage: ((String) -> Unit)? = null
    override var onClose: ((code: Int, reason: String) -> Unit)? = null
    override var onError: ((Throwable) -> Unit)? = null

    override fun connect(url: String) {
        ws = JsWebSocket.create(url).apply {
            setOnOpen { onOpen?.invoke() }
            setOnMessage { event -> onMessage?.invoke(event.data) }
            setOnClose { event -> onClose?.invoke(event.code, event.reason) }
            setOnError { onError?.invoke(RuntimeException("WebSocket error")) }
        }
    }

    override fun send(message: String) {
        ws?.send(message)
    }

    override fun close(code: Int, reason: String) {
        ws?.close(code, reason)
    }
}
