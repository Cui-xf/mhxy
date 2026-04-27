@file:JvmName("TeaVMLauncher")

package com.cc.teavm

import com.github.xpenatan.gdx.teavm.backends.web.WebApplicationConfiguration
import com.github.xpenatan.gdx.teavm.backends.web.WebApplication
import com.cc.Mhxy

/** Launches the TeaVM/HTML application. */
fun main() {
    val config = WebApplicationConfiguration("canvas").apply {
        //// If width and height are each greater than 0, then the app will use a fixed size.
        //width = 640
        //height = 480
        //// If width and height are both 0, then the app will use all available space.
        width = 0
        height = 0
    }
    WebApplication(Mhxy(), config)
}