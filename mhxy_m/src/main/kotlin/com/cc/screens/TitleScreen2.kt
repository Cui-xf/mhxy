package com.cc.screens

import com.badlogic.gdx.Gdx
import com.badlogic.gdx.graphics.Texture
import com.cc.asset.AssetManagerFactory.PUBLIC_ASSET
import com.cc.asset.RpgAnimationGroup
import com.cc.render.drawAnimation
import com.cc.render.drawImage

class TitleScreen2 : AbstractScreen() {
    private val menuBG = autoDispose { Texture(Gdx.files.classpath("assets/menuBG.png")) }
    private val logoTitle = autoDispose { Texture(Gdx.files.classpath("assets/logoTitle_B.png")) }
    private val cartoon = autoDispose { PUBLIC_ASSET.get<RpgAnimationGroup>("rpg/cartoon.rpg") }
    private val hudie = cartoon.getAnimationByName("hudie")
    private val hudie2 = cartoon.getAnimationByName("hudie_2")

    // 原始绘制坐标：defaultWidth-100, defaultHigh-100，屏幕 240×320 → (140, 220)
    private val ANIM_X = VIRTUAL_W - 100f
    private val ANIM_Y = VIRTUAL_H - 100f
    private var timer = 0f   // 动画累计时间（移动时推进）


    override fun update(delta: Float) {
        timer += delta

        batch.begin()
        batch.drawImage(menuBG, VIRTUAL_W / 2, 0f)
        batch.drawImage(logoTitle, VIRTUAL_W / 2, 0f)

        batch.drawAnimation(hudie.getKeyFrame(timer), ANIM_X, ANIM_Y)
        batch.drawAnimation(hudie2.getKeyFrame(timer), ANIM_X, ANIM_Y)
        batch.end()
    }
}
