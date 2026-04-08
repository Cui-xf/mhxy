package com.cc

import com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration

fun main() {
    val config = Lwjgl3ApplicationConfiguration().apply {
        setTitle("梦幻西游 Demo")
        setWindowedMode(240, 320)
        setResizable(false)
        setForegroundFPS(60)
    }
    Lwjgl3Application(MhxyGame, config)
}
