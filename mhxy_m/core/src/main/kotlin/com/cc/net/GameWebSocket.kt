package com.cc.net

import com.badlogic.gdx.utils.TimeUtils
import com.cc.common.net.NetCmd
import com.cc.common.net.NetCmd.Companion.decode
import com.cc.util.JSON


abstract class GameWebSocket {
    companion object {
        private const val cleanPerResolves = 50
        private const val cleanIntervalMs = 30_000L
        private const val timeoutMs = 60_000L
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
        val (reqId, code, cmd) = raw.decode { json, klass ->
            JSON.fromJson(klass.java, json)
        } ?: run {
            onMessage?.invoke(raw)
            return
        }
        val promise = pending.remove(reqId)
        if (promise?.onSuccess != null) promise.resolve(cmd) else onMessage?.invoke(raw)

        cleanIfNeeded()
    }

    fun send(cmd: NetCmd): WsPromise {
        val reqId = NetCmd.genReqId()
        val promise = WsPromise()
        pending[reqId] = promise
        sendRaw(cmd.encode(reqId) {
            JSON.toJson(it)
        })
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
    var onSuccess: ((NetCmd) -> Unit)? = null

    internal fun resolve(response: NetCmd) {
        onSuccess?.invoke(response)
    }

    fun then(onSuccess: (NetCmd) -> Unit): WsPromise {
        this.onSuccess = onSuccess
        return this
    }
}
