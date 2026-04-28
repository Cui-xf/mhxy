package com.cc.net

data class HttpResponse(val status: Int, val body: String)

interface GameHttp {
    fun get(url: String, headers: Map<String, String> = emptyMap(), onResult: (Result<HttpResponse>) -> Unit)
    fun post(url: String, body: String, headers: Map<String, String> = emptyMap(), onResult: (Result<HttpResponse>) -> Unit)
}

class HttpPromise(private val http: GameHttp, private val action: (GameHttp, (Result<HttpResponse>) -> Unit) -> Unit) {
    private var onSuccess: ((HttpResponse) -> Unit)? = null
    private var onError: ((Throwable) -> Unit)? = null

    init {
        action(http) { result ->
            result.onSuccess { onSuccess?.invoke(it) }
                .onFailure { onError?.invoke(it) }
        }
    }

    fun then(onSuccess: (HttpResponse) -> Unit): HttpPromise {
        this.onSuccess = onSuccess
        return this
    }

    fun catch(onError: (Throwable) -> Unit): HttpPromise {
        this.onError = onError
        return this
    }
}

fun GameHttp.get(url: String, headers: Map<String, String> = emptyMap()): HttpPromise =
    HttpPromise(this) { http, callback -> http.get(url, headers, callback) }

fun GameHttp.post(url: String, body: String, headers: Map<String, String> = emptyMap()): HttpPromise =
    HttpPromise(this) { http, callback -> http.post(url, body, headers, callback) }
