package com.cc.screens.fight2

import com.badlogic.gdx.graphics.g2d.SpriteBatch
import com.badlogic.gdx.graphics.g2d.TextureRegion
import com.badlogic.gdx.graphics.glutils.ShapeRenderer
import com.badlogic.gdx.math.Rectangle
import com.cc.MhxyGame
import com.cc.asset.AssetLoader
import com.cc.asset.AssetManagerFactory.PUBLIC_ASSET
import com.cc.event.TouchContext
import com.cc.render.Align
import com.cc.render.drawImage
import com.cc.screens.AbstractScreen.Companion.VIRTUAL_H
import com.cc.screens.AbstractScreen.Companion.VIRTUAL_W
import com.cc.screens.fight.FightScreen
import com.cc.screens.fight2.model.FightModel
import com.cc.ui.component.UIComponent

class ReturnButton(assetLoader: AssetLoader, fightModel: FightModel, private val backGround: TextureRegion) :
    UIComponent(assetLoader) {
    private val buttonBack by resource(PUBLIC_ASSET, "rpg/publicUI/button_back.pic", TextureRegion::class)


    // 返回按钮触摸区域（button_back.pic 37×20，右下角对齐）
    private val BACK_BTN_W = 37f
    private val BACK_BTN_H = 20f
    private val rect = Rectangle(VIRTUAL_W - BACK_BTN_W, VIRTUAL_H - BACK_BTN_H, BACK_BTN_W, BACK_BTN_H)


    override fun render(
        batch: SpriteBatch,
        sr: ShapeRenderer,
        cx: Float,
        cy: Float,
        cw: Float,
        ch: Float,
        delta: Float
    ) {
        batch.begin()
        batch.drawImage(buttonBack, rect.x, rect.y, align = Align.LEFT_TOP)
        batch.end()

        if (TouchContext.inTouch(rect)) {
            MhxyGame.screen = FightScreen(backGround)
        }
    }
}