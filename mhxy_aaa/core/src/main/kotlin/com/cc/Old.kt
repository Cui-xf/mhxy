//package com.cc
//
//import com.badlogic.gdx.Game
//import com.badlogic.gdx.Screen
//import com.cc.asset.AssetManagerFactory
//import com.cc.screens.LogoScreen
//
//object MhxyGame : Game() {
//    private var pendingScreen: Screen? = null
//
//    override fun create() {
//        setScreen(LogoScreen())
//    }
//
//    override fun render() {
//        pendingScreen?.let {
//            pendingScreen = null
//            val last = super.screen
//            super.setScreen(it)
//            last?.dispose()
//        }
//        super.render()
//    }
//
//    override fun setScreen(screen: Screen) {
//        pendingScreen = screen
//    }
//
//    override fun dispose() {
//        screen?.dispose()
//        FontManager.dispose()
//        AssetManagerFactory.dispose()
//    }
//}
