package com.cc.screens.game

import com.badlogic.gdx.Gdx
import com.badlogic.gdx.Input
import com.badlogic.gdx.graphics.g2d.SpriteBatch
import com.badlogic.gdx.graphics.glutils.ShapeRenderer
import com.cc.asset.AssetLoader
import com.cc.asset.AssetManagerFactory
import com.cc.asset.TileMap
import com.cc.render.drawAnimation
import com.cc.render.drawFrame
import com.cc.screens.AbstractScreen.Companion.VIRTUAL_H
import com.cc.screens.AbstractScreen.Companion.VIRTUAL_W
import com.cc.ui.component.UIComponent

class TileMapUI(assetLoader: AssetLoader) : UIComponent(assetLoader) {
    private var index = 1
    private val list = listOf(
        resource(AssetManagerFactory.PUBLIC_ASSET, "rpg/map/1", TileMap::class),
        resource(AssetManagerFactory.PUBLIC_ASSET, "rpg/map/2", TileMap::class),
        resource(AssetManagerFactory.PUBLIC_ASSET, "rpg/map/3", TileMap::class),
        resource(AssetManagerFactory.PUBLIC_ASSET, "rpg/map/4", TileMap::class),
        resource(AssetManagerFactory.PUBLIC_ASSET, "rpg/map/5", TileMap::class),
    )
    private lateinit var map: TileMap
    var currentMap: TileMap? = null
        private set
    private var animTime = 0f

    override fun render(
        batch: SpriteBatch,
        sr: ShapeRenderer,
        cx: Float,
        cy: Float,
        cw: Float,
        ch: Float,
        delta: Float
    ) {
        map = list[index].value
        currentMap = map
        animTime += delta
        renderMap(batch)
        if (Gdx.input.isKeyJustPressed(Input.Keys.ANY_KEY)) {
//            index++
        }
    }

    // 外部可设置摄像机坐标（地图绝对坐标的左上角偏移），null 时默认居中
    var camX: Float = 0f
    var camY: Float = 0f

    private fun renderMap(batch: SpriteBatch) {
        batch.begin()
        renderMapBlock(batch, camX, camY)
        renderFixedObj(batch, camX, camY)
        renderMoveObj(batch, camX, camY)
        renderAnimationObj(batch, camX, camY)
        batch.end()
    }

    private fun renderMapBlock(batch: SpriteBatch, camX: Float, camY: Float) {
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
    private fun renderFixedObj(batch: SpriteBatch, camX: Float, camY: Float) {
        for (frame in map.fixedObj) {
            batch.drawFrame(frame, -camX, -camY)
        }
    }

    private fun renderMoveObj(batch: SpriteBatch, camX: Float, camY: Float) {
//        for (frame in map.moveObj) {
//            batch.drawFrame(frame, -camX, -camY)
//        }
    }

    // animationObj：x/y 是地图绝对坐标，drawAnimation 内部 originX + frame.transX 是各 sprite 帧内偏移
    private fun renderAnimationObj(batch: SpriteBatch, camX: Float, camY: Float) {
//        for (anim in map.locationAnimations) {
//            val frames = anim.animation.getKeyFrame(animTime, true) ?: continue
//            batch.drawAnimation(frames, anim.x - camX, anim.y - camY)
//        }
    }
}