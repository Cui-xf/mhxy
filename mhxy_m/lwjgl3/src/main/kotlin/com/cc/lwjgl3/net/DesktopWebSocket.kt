package com.cc.lwjgl3.net

import com.badlogic.gdx.Gdx
import com.cc.net.GameWebSocket
import java.net.URI
import java.net.http.HttpClient
import java.net.http.WebSocket
import java.util.concurrent.CompletionStage

class DesktopWebSocket : GameWebSocket() {
    private var ws: WebSocket? = null
    private val client = HttpClient.newBuilder().build()

    override fun connect(url: String) {
        client.newWebSocketBuilder()
            .buildAsync(URI.create(url), Listener())
            .exceptionally { err ->
                Gdx.app.postRunnable { onError?.invoke(err.cause ?: err) }
                null
            }
    }

    override fun sendRaw(message: String) {
        ws?.sendText(message, true)
    }

    override fun close(code: Int, reason: String) {
        ws?.sendClose(code, reason)
    }

    private inner class Listener : WebSocket.Listener {
        private val textBuffer = StringBuilder()

        override fun onOpen(webSocket: WebSocket) {
            ws = webSocket
            webSocket.request(1)
        }

        override fun onText(webSocket: WebSocket, data: CharSequence, last: Boolean): CompletionStage<*>? {
            textBuffer.append(data)
            if (last) {
                val msg = textBuffer.toString()
                textBuffer.clear()
                Gdx.app.postRunnable { onRawMessage(msg) }
            }
            webSocket.request(1)
            return null
        }

        override fun onClose(webSocket: WebSocket, statusCode: Int, reason: String): CompletionStage<*>? {
            Gdx.app.postRunnable { onClose?.invoke(statusCode, reason) }
            return null
        }

        override fun onError(webSocket: WebSocket, error: Throwable) {
            Gdx.app.postRunnable { onError?.invoke(error) }
        }
    }
}
