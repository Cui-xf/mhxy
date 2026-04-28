package com.cc.net

import com.badlogic.gdx.utils.TimeUtils
import java.util.concurrent.atomic.AtomicLong


abstract class GameWebSocket {
    companion object {
        private const val cleanPerResolves = 50
        private const val cleanIntervalMs = 30_000L
        private const val timeoutMs = 60_000L

        private val idGenerator = AtomicLong(0)
    }

    var onMessage: ((String) -> Unit)? = null
    var onClose: ((code: Int, reason: String) -> Unit)? = null
    var onError: ((Throwable) -> Unit)? = null


    private var resolveCount = 0
    private var lastCleanTime = 0L
    private val pending = LinkedHashMap<Long, WsPromise>()

    abstract fun connect(url: String)
    abstract fun sendRaw(message: String)
    abstract fun close(code: Int = 1000, reason: String = "")

    protected fun onRawMessage(raw: String) {
        val idx = raw.indexOf('|')
        val reqId = raw.substring(0, idx).toLong()
        val payload = raw.substring(idx + 1)
        val promise = pending.remove(reqId)
        if (promise?.onSuccess != null) promise.resolve(payload) else onMessage?.invoke(raw)
        cleanIfNeeded()
    }

    fun send(payload: String): WsPromise {
        val requestId = idGenerator.addAndGet(1)
        val promise = WsPromise()
        pending[requestId] = promise
        sendRaw("$requestId|$payload")
        cleanIfNeeded()
        return promise
    }

    private fun cleanIfNeeded() {
        val now = TimeUtils.millis()
        resolveCount++
        if (resolveCount < cleanPerResolves && now - lastCleanTime < cleanIntervalMs) return
        resolveCount = 0
        lastCleanTime = now
        val iter = pending.iterator()
        while (iter.hasNext()) {
            if (now - iter.next().value.createTime > timeoutMs) iter.remove()
        }
    }
}

class WsPromise {
    val createTime: Long = TimeUtils.millis()
    var onSuccess: ((String) -> Unit)? = null

    internal fun resolve(response: String) {
        onSuccess?.invoke(response)
    }

    fun then(onSuccess: (String) -> Unit): WsPromise {
        this.onSuccess = onSuccess
        return this
    }
}
