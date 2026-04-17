package com.cc.screens.game

import com.badlogic.gdx.Gdx
import com.badlogic.gdx.Input
import com.badlogic.gdx.graphics.g2d.SpriteBatch
import com.badlogic.gdx.graphics.glutils.ShapeRenderer
import com.cc.asset.AssetLoader
import com.cc.asset.AssetManagerFactory
import com.cc.asset.TileMap
import com.cc.render.drawFrame
import com.cc.screens.AbstractScreen.Companion.VIRTUAL_H
import com.cc.screens.AbstractScreen.Companion.VIRTUAL_W
import com.cc.ui.component.UIComponent

class ScreenMap(assetLoader: AssetLoader) : UIComponent(assetLoader) {
    var camX: Float = 0f
    var camY: Float = 0f
    val mapW get() = map.mapW
    val mapH get() = map.mapH
    val collisionBit get() = map.collisionBit
    val collisionW get() = map.collisionW
    val collisionH get() = map.collisionH

    private var index = 1
    private val list = listOf(
        resource(AssetManagerFactory.PUBLIC_ASSET, "rpg/map/0_1.tmap", TileMap::class),
        resource(AssetManagerFactory.PUBLIC_ASSET, "rpg/map/0_4.tmap", TileMap::class),
        resource(AssetManagerFactory.PUBLIC_ASSET, "rpg/map/0_14.tmap", TileMap::class),
        resource(AssetManagerFactory.PUBLIC_ASSET, "rpg/map/0_20.tmap", TileMap::class),
        resource(AssetManagerFactory.PUBLIC_ASSET, "rpg/map/0_78.tmap", TileMap::class),
    )
    private lateinit var map: TileMap
    private var animTime = 0f

    // 纯碰撞计算，不更新相机，供怪物等非主角实体使用
    fun collisionCheck(x: Float, dx: Float, y: Float, dy: Float): Pair<Float, Float> {
        val tX = (x + dx).coerceIn(0f, map.mapW.toFloat())
        val colX = (tX / map.collisionW).toInt().coerceIn(0, map.collisionBit.size - 1)
        val rowX = (y / map.collisionH).toInt().coerceIn(0, map.collisionBit[0].size - 1)
        val newX = if (map.collisionBit[colX][rowX]) x else tX

        val tY = (y + dy).coerceIn(0f, map.mapH.toFloat())
        val colY = (newX / map.collisionW).toInt().coerceIn(0, map.collisionBit.size - 1)
        val rowY = (tY / map.collisionH).toInt().coerceIn(0, map.collisionBit[0].size - 1)
        val newY = if (map.collisionBit[colY][rowY]) y else tY

        return Pair(newX, newY)
    }

    // 碰撞移动，同时更新相机（仅主角调用）
    fun collisionMove(x: Float, dx: Float, y: Float, dy: Float): Pair<Float, Float> {
        val (newX, newY) = collisionCheck(x, dx, y, dy)

        camX = (newX - VIRTUAL_W / 2f).coerceIn(0f, (map.mapW - VIRTUAL_W).coerceAtLeast(0f))
        camY = (newY - VIRTUAL_H / 2f).coerceIn(0f, (map.mapH - VIRTUAL_H).coerceAtLeast(0f))

        return Pair(newX, newY)
    }

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
        animTime += delta
        renderMap(batch)
        if (Gdx.input.isKeyJustPressed(Input.Keys.ANY_KEY)) {
//            index++
        }
    }

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

fun ScreenMap.toScreen(x: Float, y: Float): Pair<Float, Float> {
    return Pair(x - camX, y - camY)
}