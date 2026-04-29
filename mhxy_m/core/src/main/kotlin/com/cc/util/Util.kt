package com.cc.util

import com.badlogic.gdx.utils.Json
import com.badlogic.gdx.utils.JsonWriter

infix fun Int.ceilDiv(divisor: Int): Int {
    return (this + divisor - 1) / divisor
}

fun parseResourceName(name: String): Pair<String, String> {
    val lastIndex = name.lastIndexOf("/")
    if (lastIndex != -1) {
        return Pair(name.substring(0, lastIndex), name.substring(lastIndex + 1))
    } else {
        throw RuntimeException("无效的资源名称")
    }
}

val JSON = Json(JsonWriter.OutputType.json)