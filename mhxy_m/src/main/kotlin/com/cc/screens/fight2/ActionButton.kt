package com.cc.screens.fight2

import com.badlogic.gdx.graphics.Color
import com.badlogic.gdx.graphics.g2d.SpriteBatch
import com.badlogic.gdx.graphics.g2d.TextureRegion
import com.badlogic.gdx.graphics.glutils.ShapeRenderer
import com.badlogic.gdx.math.Rectangle
import com.cc.FontManager
import com.cc.asset.AssetLoader
import com.cc.asset.AssetManagerFactory.PUBLIC_ASSET
import com.cc.event.TouchContext
import com.cc.render.Align
import com.cc.render.drawImage
import com.cc.render.wordArtString
import com.cc.screens.AbstractScreen.Companion.VIRTUAL_H
import com.cc.screens.AbstractScreen.Companion.VIRTUAL_W
import com.cc.screens.fight2.model.FightModel
import com.cc.screens.fight2.model.SkillButton
import com.cc.ui.component.UIComponent

class ActionButton(assetLoader: AssetLoader, fightModel: FightModel) : UIComponent(assetLoader) {
    //   每个按钮 26×16，index 1=攻击 2=防御 3=技能 4=道具 5=逃跑
    private val fightMenuPic by resource(PUBLIC_ASSET, "rpg/publicUI/49_983005409.pic", TextureRegion::class)
    private val actionNames = arrayOf("攻击", "防御", "法术", "道具", "逃跑")

    private val BTN_X = 0f
    private val BTN_Y0 = VIRTUAL_H - 102f   // = 218f
    private val BNT_W = 26
    private val BTN_H = 16
    private val buttons by lazy {
        Array(5) {
            Button(
                // 从全条纹理里切出第 i 个按钮（x = i*26, y=0, w=26, h=16）
                TextureRegion(fightMenuPic, it * BNT_W, 0, BNT_W, BTN_H),
                actionNames[it],
                Rectangle(BTN_X, BTN_Y0 + it * BTN_H, BNT_W.toFloat(), BTN_H.toFloat())
            )
        }
    }

    private var tipText = ""

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
        for (button in buttons) {
            batch.drawImage(button.textureRegion, button.rect.x, button.rect.y, align = Align.LEFT_TOP)
        }
        batch.end()
        //todo del
        emit(SkillButton)
        buttons.firstOrNull { TouchContext.inTouch(it.rect) }?.also {
            tipText = it.text
            when (it.text) {
                "法术" -> emit(SkillButton)
            }
        }

        //操作文案
        val font = FontManager.SMALL_FONT
        val textY = VIRTUAL_H - 22f - font.lineHeight
        batch.begin()
        batch.wordArtString(font, tipText, Color.BLACK, Color.YELLOW, VIRTUAL_W / 2f, textY, Align.CENTER_TOP)
        batch.end()
    }
}

private class Button(
    val textureRegion: TextureRegion,
    val text: String,
    val rect: Rectangle,
)