package com.cc.screens

import com.cc.asset.AssetManagerFactory.PUBLIC_ASSET
import com.cc.asset.TileMap

class GameScreen : AbstractScreen() {
    private val map by resource(PUBLIC_ASSET, "rpg/map/4", TileMap::class)

    override fun update(delta: Float) {
        println(map)
    }
}