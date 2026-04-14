package com.cc.screens.game

import com.badlogic.gdx.Gdx
import com.badlogic.gdx.Input
import com.cc.asset.AssetManagerFactory
import com.cc.asset.RpgAnimation
import com.cc.render.drawAnimation
import com.cc.screens.AbstractScreen

class GameScreen : AbstractScreen() {
    private val tileMap = TileMapUI(this.assetLoader)

    // 朝右动画（向右/向下移动），方向后缀0；格式：{gender}{job}{variant}{dirSuffix}
    private val animRight by resource(
        AssetManagerFactory.PUBLIC_ASSET,
        "rpg/role/3100",
        RpgAnimation::class
    )

    // 朝左动画（向左/向上移动），方向后缀1
    private val animLeft by resource(
        AssetManagerFactory.PUBLIC_ASSET,
        "rpg/role/3101",
        RpgAnimation::class
    )

    private var animTime = 0f
    private var facingLeft = false

    private val speed = 80f
    private var roleMapX = 100f
    private var roleMapY = 100f

    override fun update(delta: Float) {
        val map = tileMap.currentMap

        // 处理移动输入
        val dx = when {
            Gdx.input.isKeyPressed(Input.Keys.RIGHT) || Gdx.input.isKeyPressed(Input.Keys.D) -> speed * delta
            Gdx.input.isKeyPressed(Input.Keys.LEFT) || Gdx.input.isKeyPressed(Input.Keys.A) -> -speed * delta
            else -> 0f
        }
        val dy = when {
            Gdx.input.isKeyPressed(Input.Keys.DOWN) || Gdx.input.isKeyPressed(Input.Keys.S) -> speed * delta
            Gdx.input.isKeyPressed(Input.Keys.UP) || Gdx.input.isKeyPressed(Input.Keys.W) -> -speed * delta
            else -> 0f
        }

        val moving = dx != 0f || dy != 0f
        if (moving) {
            // 更新朝向：左/上朝左，右/下朝右
            facingLeft = when {
                dx < 0f -> true
                dx > 0f -> false
                dy < 0f -> true
                else -> false
            }
            animTime += delta

            // 碰撞检测：x/y 轴分开处理，允许沿墙滑动
            if (map != null) {
                val newX = (roleMapX + dx).coerceIn(0f, map.mapW.toFloat())
                val colX = (newX / map.collisionW).toInt().coerceIn(0, map.collisionBit.size - 1)
                val rowX = (roleMapY / map.collisionH).toInt().coerceIn(0, map.collisionBit[0].size - 1)
                if (!map.collisionBit[colX][rowX]) roleMapX = newX

                val newY = (roleMapY + dy).coerceIn(0f, map.mapH.toFloat())
                val colY = (roleMapX / map.collisionW).toInt().coerceIn(0, map.collisionBit.size - 1)
                val rowY = (newY / map.collisionH).toInt().coerceIn(0, map.collisionBit[0].size - 1)
                if (!map.collisionBit[colY][rowY]) roleMapY = newY
            } else {
                roleMapX += dx
                roleMapY += dy
            }
        } else {
            animTime = 0f
        }

        // 摄像机跟随主角，限制在地图边界内
        if (map != null) {
            tileMap.camX = (roleMapX - VIRTUAL_W / 2f).coerceIn(0f, (map.mapW - VIRTUAL_W).coerceAtLeast(0f))
            tileMap.camY = (roleMapY - VIRTUAL_H / 2f).coerceIn(0f, (map.mapH - VIRTUAL_H).coerceAtLeast(0f))
        }

        tileMap.render(batch, sr, 0f, 0f, VIRTUAL_W, VIRTUAL_H, delta)

        if (map == null) return

        val screenX = roleMapX - tileMap.camX
        val screenY = roleMapY - tileMap.camY

        val anim = if (facingLeft) animLeft else animRight
        val frames = anim.getKeyFrame(animTime, true) ?: return
        batch.begin()
        batch.drawAnimation(frames, screenX, screenY)
        batch.end()
    }
}