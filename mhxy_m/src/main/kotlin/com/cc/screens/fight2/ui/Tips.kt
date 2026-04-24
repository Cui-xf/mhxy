package com.cc.screens.fight2.ui

import com.badlogic.gdx.graphics.Color
import com.badlogic.gdx.graphics.g2d.SpriteBatch
import com.badlogic.gdx.graphics.glutils.ShapeRenderer
import com.cc.FontManager
import com.cc.asset.AssetLoader
import com.cc.render.Align
import com.cc.render.wordArtString
import com.cc.screens.AbstractScreen.Companion.VIRTUAL_H
import com.cc.screens.AbstractScreen.Companion.VIRTUAL_W
import com.cc.screens.fight2.model.FightModel
import com.cc.ui.component.UIComponent

class Tips(assetLoader: AssetLoader, private val fightModel: FightModel) : UIComponent(assetLoader) {
    private val damageTypes = arrayOf("物理", "冰", "火", "雷")
    private var selectedDamageType = 0

    override fun render(
        batch: SpriteBatch,
        sr: ShapeRenderer,
        cx: Float,
        cy: Float,
        cw: Float,
        ch: Float,
        delta: Float
    ) {
        val font = FontManager.SMALL_FONT
        val text = damageTypes[selectedDamageType]
        batch.begin()
        batch.wordArtString(font, text, Color.BLACK, Color.YELLOW, VIRTUAL_W - 25f, 5f, Align.CENTER_TOP)

        if (fightModel.tipText.isNotEmpty()) {
            val textY = VIRTUAL_H - 22f - font.lineHeight
            batch.wordArtString(
                font,
                fightModel.tipText,
                Color.BLACK,
                Color.YELLOW,
                VIRTUAL_W / 2f,
                textY,
                Align.CENTER_TOP
            )
        }
        batch.end()
    }
}