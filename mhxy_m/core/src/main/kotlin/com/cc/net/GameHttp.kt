package com.cc.net

import kotlinx.coroutines.suspendCancellableCoroutine
import kotlin.coroutines.resume
import kotlin.coroutines.resumeWithException

data class HttpResponse(val status: Int, val body: String)

interface GameHttp {
    fun get(url: String, headers: Map<String, String> = emptyMap(), onResult: (Result<HttpResponse>) -> Unit)
    fun post(url: String, body: String, headers: Map<String, String> = emptyMap(), onResult: (Result<HttpResponse>) -> Unit)
}

suspend fun GameHttp.suspendGet(url: String, headers: Map<String, String> = emptyMap()): HttpResponse =
    suspendCancellableCoroutine { cont ->
        get(url, headers) { result ->
            result.onSuccess { cont.resume(it) }
                .onFailure { cont.resumeWithException(it) }
        }
    }

suspend fun GameHttp.suspendPost(url: String, body: String, headers: Map<String, String> = emptyMap()): HttpResponse =
    suspendCancellableCoroutine { cont ->
        post(url, body, headers) { result ->
            result.onSuccess { cont.resume(it) }
                .onFailure { cont.resumeWithException(it) }
        }
    }
