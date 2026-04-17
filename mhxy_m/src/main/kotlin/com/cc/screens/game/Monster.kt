package com.cc.screens.game

import com.badlogic.gdx.graphics.Color
import com.badlogic.gdx.graphics.g2d.SpriteBatch
import com.badlogic.gdx.graphics.glutils.ShapeRenderer
import com.cc.asset.AssetLoader
import com.cc.asset.AssetManagerFactory.PUBLIC_ASSET
import com.cc.asset.RpgAnimation
import com.cc.render.drawAnimation
import com.cc.screens.AbstractScreen.Companion.VIRTUAL_H
import com.cc.ui.component.UIComponent
import kotlin.math.abs
import kotlin.math.sqrt
import kotlin.random.Random

class Monster(
    assetLoader: AssetLoader,
    private val screenMap: ScreenMap,
    startX: Float,
    startY: Float,
    private val player: Player
) : UIComponent(assetLoader) {

    // resName=0 默认怪物，资源 "701_0s".hashCode() = 1620484970，id=215
    private val anim by resource(PUBLIC_ASSET, "rpg/petfight/215_1620484970.anim", RpgAnimation::class)

    var mapX = startX
        private set
    var mapY = startY
        private set

    private var animTime = 0f
    private val speed = 0f

    // 随机游走：每隔一段时间换一次方向
    private var dirX = Random.nextFloat() * 2f - 1f
    private var dirY = Random.nextFloat() * 2f - 1f
    private var dirTimer = 0f
    private val dirInterval = 2f  // 每2秒换方向

    // 碰撞半径（像素）
    val collideRadius = 16f

    override fun render(
        batch: SpriteBatch,
        sr: ShapeRenderer,
        cx: Float,
        cy: Float,
        cw: Float,
        ch: Float,
        delta: Float
    ) {
        animTime += delta

        // 随机游走
        dirTimer += delta
        if (dirTimer >= dirInterval) {
            dirTimer = 0f
            dirX = Random.nextFloat() * 2f - 1f
            dirY = Random.nextFloat() * 2f - 1f
            // 归一化方向向量
            val len = sqrt(dirX * dirX + dirY * dirY).coerceAtLeast(0.001f)
            dirX /= len
            dirY /= len
        }

        val dx = dirX * speed * delta
        val dy = dirY * speed * delta
        val (newX, newY) = screenMap.collisionCheck(mapX, dx, mapY, dy)
        // 碰墙则立刻换方向
        if (abs(newX - mapX) < abs(dx) * 0.5f) dirX = -dirX
        if (abs(newY - mapY) < abs(dy) * 0.5f) dirY = -dirY
        mapX = newX
        mapY = newY

        val (screenX, screenY) = screenMap.toScreen(mapX, mapY)
        val frames = anim.getKeyFrame(animTime, true)

        batch.begin()
        batch.drawAnimation(frames, screenX, screenY)
        batch.end()

        drawDebugPlayer(sr)
    }

    fun drawDebugPlayer(sr: ShapeRenderer) {
        var (cx, cy) = screenMap.toScreen(mapX, mapY)
        cy = VIRTUAL_H - cy
        sr.begin(ShapeRenderer.ShapeType.Line)
        sr.color = Color.RED
        sr.circle(cx, cy, collideRadius)
        sr.line(cx - 3f, cy, cx + 3f, cy)
        sr.line(cx, cy - 3f, cx, cy + 3f)
        sr.end()

        var (px, py) = screenMap.toScreen(player.roleMapX, player.roleMapY)
        py = VIRTUAL_H - py
        sr.begin(ShapeRenderer.ShapeType.Line)
        sr.color = Color.GREEN
        sr.line(px - 6f, py, px + 6f, py)
        sr.line(px, py - 6f, px, py + 6f)
        sr.end()
    }

    fun collidesWith(playerX: Float, playerY: Float): Boolean {
        val dx = playerX - mapX
        val dy = playerY - mapY
        return sqrt(dx * dx + dy * dy) < collideRadius
    }
}
