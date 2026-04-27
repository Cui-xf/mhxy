@file:JvmName("Lwjgl3Launcher")

package com.cc.lwjgl3

import com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration
import com.cc.MhxyGame
import com.cc.lwjgl3.net.DesktopNetProvider
import com.cc.net.Net

/** Launches the desktop (LWJGL3) application. */
fun main() {
    if (StartupHelper.startNewJvmIfRequired()) {
        return
    }
    Net.provider = DesktopNetProvider()
    Lwjgl3Application(MhxyGame, Lwjgl3ApplicationConfiguration().apply {
        setTitle("mhxy_m")
        useVsync(true)
        setForegroundFPS(Lwjgl3ApplicationConfiguration.getDisplayMode().refreshRate + 1)
        setWindowedMode(240, 320)
//        setWindowIcon(*(arrayOf(128, 64, 32, 16).map { "libgdx$it.png" }.toTypedArray()))
//        setOpenGLEmulation(Lwjgl3ApplicationConfiguration.GLEmulation.ANGLE_GLES20, 0, 0)
    })
}