package com.cc.screens.fight2

import com.badlogic.gdx.graphics.g2d.SpriteBatch
import com.badlogic.gdx.graphics.g2d.TextureRegion
import com.badlogic.gdx.graphics.glutils.ShapeRenderer
import com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType
import com.cc.asset.AssetLoader
import com.cc.asset.AssetManagerFactory.PUBLIC_ASSET
import com.cc.render.Align
import com.cc.render.drawImage
import com.cc.render.drawRectBorder
import com.cc.render.toColor
import com.cc.screens.AbstractScreen.Companion.VIRTUAL_H
import com.cc.screens.fight2.model.FightModel
import com.cc.ui.component.UIComponent

class QuickBar(assetLoader: AssetLoader, fightModel: FightModel) : UIComponent(assetLoader) {
    //聊天和自动
    private val fighticon by resource(PUBLIC_ASSET, "rpg/ui/fighticon.pic", TextureRegion::class)

    //技能栏底图
    private val goods by resource(PUBLIC_ASSET, "rpg/publicUI/goods.pic", TextureRegion::class)

    //数字
    private val num by resource(PUBLIC_ASSET, "rpg/publicUI/num.pic", TextureRegion::class)

    //icon
    private val slotIcon by resource(PUBLIC_ASSET, "rpg/icon/1110.pic", TextureRegion::class)

    private val SKILL_BAR_Y = VIRTUAL_H - 22f     // = 298f
    private val SKILL_SLOT_W = 17f
    private val SKILL_BAR_SLOTS = 10

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
        for (i in 0 until SKILL_BAR_SLOTS) {
            val slotX = i * SKILL_SLOT_W + 2f
            batch.drawImage(goods, slotX, SKILL_BAR_Y + 2f, align = Align.LEFT_TOP)
            if (i < 2) {
                batch.drawImage(slotIcon, slotX + 1f, SKILL_BAR_Y + 3f, align = Align.LEFT_TOP)
            }
            if (i < 8) {
                // num.pic 帧 index = i+1（数字1-8），每帧 3×5，x = (i+1)*3
                val numRegion = TextureRegion(num.texture, (i + 1) * 3, 0, 3, 5)
                batch.drawImage(numRegion, slotX, SKILL_BAR_Y + 3f, align = Align.LEFT_TOP)
            } else {
                // 第9格(i=8)：fighticon 帧0（左半16px=聊天），第10格(i=9)：帧2（右半16px=自动）
                val iconX = if (i == 8) 0 else 16
                val fighticonRegion =
                    TextureRegion(fighticon.texture, fighticon.regionX + iconX, fighticon.regionY, 16, 16)
                batch.drawImage(fighticonRegion, slotX + 1f, SKILL_BAR_Y + 3f, align = Align.LEFT_TOP)
            }
        }
        batch.end()

        val totalW = SKILL_BAR_SLOTS * SKILL_SLOT_W + 4f
        val totalH = 21f
        sr.begin(ShapeType.Filled)
        sr.drawRectBorder(15975.toColor(), 0f, SKILL_BAR_Y, totalW, totalH, Align.LEFT_TOP)           // 外边框
        sr.drawRectBorder(
            11267556.toColor(),
            0f + 1f,
            SKILL_BAR_Y + 1f,
            totalW - 2f,
            totalH - 2f,
            Align.LEFT_TOP
        ) // 内边框
        sr.end()
    }
}