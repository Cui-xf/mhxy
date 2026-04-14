package com.cc.screens.game

import com.cc.asset.AssetManagerFactory
import com.cc.asset.RpgAnimation
import com.cc.render.drawAnimation
import com.cc.screens.AbstractScreen

class GameScreen : AbstractScreen() {
    private val tileMap = TileMapUI(this.assetLoader)

    // 主角待机动画，使用与角色选择界面相同的资源路径格式
    private val roleAnim by resource(AssetManagerFactory.PUBLIC_ASSET, "rpg/role/f31111", RpgAnimation::class)

    private var animTime = 0f

    // 主角在地图上的绝对坐标（地图中心）
    private var roleMapX = 100f
    private var roleMapY = 100f

    override fun update(delta: Float) {
        animTime += delta

        // 等地图加载完成后初始化主角位置到地图中心
        val map = tileMap.currentMap
        // 摄像机以主角为中心，限制在地图边界内
        if (map != null) {
            tileMap.camX = (roleMapX - VIRTUAL_W / 2f).coerceIn(0f, (map.mapW - VIRTUAL_W).coerceAtLeast(0f))
            tileMap.camY = (roleMapY - VIRTUAL_H / 2f).coerceIn(0f, (map.mapH - VIRTUAL_H).coerceAtLeast(0f))
        }

        tileMap.render(batch, sr, 0f, 0f, VIRTUAL_W, VIRTUAL_H, delta)

        if (map == null) return

        // 主角在屏幕上的位置 = 地图坐标 - 摄像机偏移
        val screenX = roleMapX - tileMap.camX
        val screenY = roleMapY - tileMap.camY

        val frames = roleAnim.getKeyFrame(animTime, true) ?: return
        batch.begin()
        batch.drawAnimation(frames, screenX, screenY)
        batch.end()
    }
}