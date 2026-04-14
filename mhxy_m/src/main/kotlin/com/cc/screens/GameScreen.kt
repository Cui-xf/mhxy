package com.cc.screens

import com.badlogic.gdx.Gdx
import com.badlogic.gdx.Input
import com.cc.asset.AssetManagerFactory.PUBLIC_ASSET
import com.cc.asset.TileMap
import com.cc.render.drawAnimation
import com.cc.render.drawFrame

class GameScreen : AbstractScreen() {
    private var animTime = 0f
    private var index = 0
    private val list = listOf(
        resource(PUBLIC_ASSET, "rpg/map/1", TileMap::class),
        resource(PUBLIC_ASSET, "rpg/map/2", TileMap::class),
        resource(PUBLIC_ASSET, "rpg/map/3", TileMap::class),
        resource(PUBLIC_ASSET, "rpg/map/4", TileMap::class),
        resource(PUBLIC_ASSET, "rpg/map/5", TileMap::class),
    )
    private lateinit var map: TileMap

    override fun update(delta: Float) {
        map = list[index].value
        animTime += delta
        renderMap()
        if (Gdx.input.isKeyJustPressed(Input.Keys.ANY_KEY)) {
            index++
        }
    }

    private fun renderMap() {
        val mapCenterX = map.mapW / 2f
        val mapCenterY = map.mapH / 2f
        val camX = mapCenterX - VIRTUAL_W / 2f
        val camY = mapCenterY - VIRTUAL_H / 2f

        batch.begin()
        renderMapBlock(camX, camY)
        renderFixedObj(camX, camY)
        renderMoveObj(camX, camY)
        renderAnimationObj(camX, camY)
        batch.end()
    }

    private fun renderMapBlock(camX: Float, camY: Float) {
        val blockW = map.blockW
        val blockH = map.blockH
        val colStart = (camX / blockW).toInt().coerceAtLeast(0)
        val colEnd = ((camX + VIRTUAL_W) / blockW).toInt().coerceAtMost(map.column - 1)
        val rowStart = (camY / blockH).toInt().coerceAtLeast(0)
        val rowEnd = ((camY + VIRTUAL_H) / blockH).toInt().coerceAtMost(map.row - 1)
        for (col in colStart..colEnd) {
            for (row in rowStart..rowEnd) {
                val frame = map.mapBlock[col][row] ?: continue
                batch.drawFrame(frame, col * blockW - camX, row * blockH - camY)
            }
        }
    }

    // fixedObj / moveObj(type==0)：transX/transY 是地图绝对坐标，drawFrame 内部会再加一次，所以基准传 (-camX, -camY)
    private fun renderFixedObj(camX: Float, camY: Float) {
        for (frame in map.fixedObj) {
            batch.drawFrame(frame, -camX, -camY)
        }
    }

    private fun renderMoveObj(camX: Float, camY: Float) {
        for (frame in map.moveObj) {
            batch.drawFrame(frame, -camX, -camY)
        }
    }

    // animationObj：x/y 是地图绝对坐标，drawAnimation 内部 originX + frame.transX 是各 sprite 帧内偏移
    private fun renderAnimationObj(camX: Float, camY: Float) {
        for (anim in map.animationObj) {
            val frames = anim.animation.getKeyFrame(animTime, true) ?: continue
            batch.drawAnimation(frames, anim.x - camX, anim.y - camY)
        }
    }
}
