package com.cc.asset

fun main() {
    println(hashKey("hudie", 2))
}


fun hashKey(name: String, type: Int): Int {
    val name = when (type) {
        0 -> name + "p"
        2 -> name + "s"
        3 -> name + "m"
        else -> name
    }

    var hash = 0
    for (c in name.toCharArray()) hash = hash * 31 + c.code
    return hash
}

fun parseResourceName(name: String): Pair<String, String> {
    val lastIndex = name.lastIndexOf("/")
    if (lastIndex != -1) {
        return Pair(name.substring(0, lastIndex), name.substring(lastIndex + 1))
    } else {
        throw RuntimeException("无效的资源名称")
    }
}