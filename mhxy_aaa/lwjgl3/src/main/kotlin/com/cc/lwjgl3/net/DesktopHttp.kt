package com.cc.lwjgl3.net

import com.badlogic.gdx.Gdx
import com.cc.net.GameHttp
import com.cc.net.HttpResponse
import java.net.URI
import java.net.http.HttpClient
import java.net.http.HttpRequest
import java.net.http.HttpRequest.BodyPublishers
import java.net.http.HttpResponse as JHttpResponse

class DesktopHttp : GameHttp {
    private val client = HttpClient.newBuilder().build()

    override fun get(url: String, headers: Map<String, String>, onResult: (Result<HttpResponse>) -> Unit) {
        val builder = HttpRequest.newBuilder(URI.create(url)).GET()
        headers.forEach { (k, v) -> builder.header(k, v) }
        send(builder.build(), onResult)
    }

    override fun post(
        url: String,
        body: String,
        headers: Map<String, String>,
        onResult: (Result<HttpResponse>) -> Unit
    ) {
        val builder = HttpRequest.newBuilder(URI.create(url))
            .POST(BodyPublishers.ofString(body))
        headers.forEach { (k, v) -> builder.header(k, v) }
        send(builder.build(), onResult)
    }

    private fun send(request: HttpRequest, onResult: (Result<HttpResponse>) -> Unit) {
        client.sendAsync(request, JHttpResponse.BodyHandlers.ofString())
            .thenAccept { resp ->
                val result = Result.success(HttpResponse(resp.statusCode(), resp.body()))
                Gdx.app.postRunnable { onResult(result) }
            }
            .exceptionally { err ->
                val result = Result.failure<HttpResponse>(err.cause ?: err)
                Gdx.app.postRunnable { onResult(result) }
                null
            }
    }
}
