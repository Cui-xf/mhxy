package com.cc.net

import kotlinx.coroutines.channels.awaitClose
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.callbackFlow
import kotlinx.coroutines.suspendCancellableCoroutine
import kotlin.coroutines.resume
import kotlin.coroutines.resumeWithException

interface GameWebSocket {
    fun connect(url: String)
    fun send(message: String)
    fun close(code: Int = 1000, reason: String = "")

    var onOpen: (() -> Unit)?
    var onMessage: ((String) -> Unit)?
    var onClose: ((code: Int, reason: String) -> Unit)?
    var onError: ((Throwable) -> Unit)?
}

suspend fun GameWebSocket.connectSuspend(url: String): Unit =
    suspendCancellableCoroutine { cont ->
        val prevOpen = onOpen
        val prevError = onError
        onOpen = {
            onOpen = prevOpen
            onError = prevError
            cont.resume(Unit)
        }
        onError = {
            onOpen = prevOpen
            onError = prevError
            if (cont.isActive) cont.resumeWithException(it)
            else prevError?.invoke(it)
        }
        connect(url)
    }

fun GameWebSocket.messages(): Flow<String> = callbackFlow {
    onMessage = { trySend(it) }
    onClose = { _, _ -> close() }
    onError = { close(it) }
    awaitClose { this@messages.close() }
}
