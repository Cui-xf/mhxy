package com.cc.screens.game.world

import com.badlogic.gdx.graphics.g2d.SpriteBatch
import com.badlogic.gdx.graphics.glutils.ShapeRenderer
import com.cc.asset.AssetLoader
import com.cc.asset.AssetManagerFactory.PUBLIC_ASSET
import com.cc.asset.RpgAnimation
import com.cc.render.drawAnimation
import com.cc.ui.component.UIComponent

class Npc(assetLoader: AssetLoader, private val screenMap: ScreenMap) : UIComponent(assetLoader) {
    // NPC 测试数据：resName=126，地图坐标 (c, d) 为脚底中心
    // 资源路径格式：rpg/petfight/{id}_{key}.anim
    private val npcAnim by resource(PUBLIC_ASSET, "rpg/petfight/211_48761813.anim", RpgAnimation::class)
    val mapX = 200f  // 地图绝对坐标 x（脚底中心）
    val mapY = 200f  // 地图绝对坐标 y（脚底）
    private var npcAnimTime = 0f

    override fun render(
        batch: SpriteBatch,
        sr: ShapeRenderer,
        cx: Float,
        cy: Float,
        cw: Float,
        ch: Float,
        delta: Float
    ) {
        npcAnimTime += delta
        val frames = npcAnim.getKeyFrame(npcAnimTime, true)
        val screenX = mapX - screenMap.camX
        val screenY = mapY - screenMap.camY
        batch.begin()
        batch.drawAnimation(frames, screenX, screenY)
        batch.end()
    }
}