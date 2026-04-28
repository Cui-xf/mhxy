package com.cc.teavm.net

import com.cc.net.GameHttp
import com.cc.net.HttpResponse

class TeaVMHttp : GameHttp {

    override fun get(url: String, headers: Map<String, String>, onResult: (Result<HttpResponse>) -> Unit) {
        val headerObj = toJsHeaders(headers)
        val options = JsFetch.createOptions("GET", null, headerObj)
        doFetch(url, options, onResult)
    }

    override fun post(
        url: String,
        body: String,
        headers: Map<String, String>,
        onResult: (Result<HttpResponse>) -> Unit
    ) {
        val headerObj = toJsHeaders(headers)
        val options = JsFetch.createOptions("POST", body, headerObj)
        doFetch(url, options, onResult)
    }

    private fun doFetch(url: String, options: org.teavm.jso.JSObject, onResult: (Result<HttpResponse>) -> Unit) {
        JsFetch.fetch(url, options).then(
            { response ->
                val status = response.status
                response.text().then(
                    { text ->
                        onResult(Result.success(HttpResponse(status, text.value())))
                    },
                    {
                        onResult(Result.failure(RuntimeException("Failed to read response body")))
                    }
                )
            },
            {
                onResult(Result.failure(RuntimeException("Fetch failed")))
            }
        )
    }

    private fun toJsHeaders(headers: Map<String, String>): org.teavm.jso.JSObject? {
        if (headers.isEmpty()) return null
        val obj = JsFetch.createObject()
        headers.forEach { (k, v) -> JsFetch.setProperty(obj, k, v) }
        return obj
    }
}
