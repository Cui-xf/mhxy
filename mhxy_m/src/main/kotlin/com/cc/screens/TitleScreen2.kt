package com.cc.screens

import com.badlogic.gdx.Gdx
import com.badlogic.gdx.graphics.Texture
import com.badlogic.gdx.graphics.g2d.Animation
import com.badlogic.gdx.graphics.g2d.TextureRegion
import com.cc.asset.AssetManagerFactory.PUBLIC_ASSET
import com.cc.asset.RpgAnimationGroup
import com.cc.render.drawImage

class TitleScreen2 : AbstractScreen() {
    private val menuBG = autoDispose { Texture(Gdx.files.classpath("assets/menuBG.png")) }
    private val logoTitle = autoDispose { Texture(Gdx.files.classpath("assets/logoTitle_B.png")) }
//    private val an = PUBLIC_ASSET.get<Animation<TextureRegion>>("rpg/cartoon.rpg")

//    private val cartoonLoader = RpgLoader("cartoon").also { it.load() }
//    private val hudie   = cartoonLoader.getAnimationByName("hudie")
//    private val hudie2  = cartoonLoader.getAnimationByName("hudie_2")

    // 原始绘制坐标：defaultWidth-100, defaultHigh-100，屏幕 240×320 → (140, 220)
    private val ANIM_X = VIRTUAL_W - 100f
    private val ANIM_Y = VIRTUAL_H - 100f

    init {
        PUBLIC_ASSET.load("rpg/cartoon.rpg", RpgAnimationGroup::class.java)
    }

    override fun update(delta: Float) {
        PUBLIC_ASSET.update()
        if (PUBLIC_ASSET.isFinished) {
            println(PUBLIC_ASSET.get<Animation<TextureRegion>>("rpg/cartoon.rpg"))
            batch.begin()
            batch.drawImage(menuBG, VIRTUAL_W / 2, 0f)
            batch.drawImage(logoTitle, VIRTUAL_W / 2, 0f)
//        hudie?.let  { batch.drawAnimation(it, ANIM_X, ANIM_Y) }
//        hudie2?.let { batch.drawAnimation(it, ANIM_X, ANIM_Y) }
            batch.end()
        }
    }

    override fun dispose() {
        super.dispose()
//        cartoonLoader.dispose()
    }
}
