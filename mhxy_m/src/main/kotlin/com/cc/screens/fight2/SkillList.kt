package com.cc.screens.fight2

import com.badlogic.gdx.graphics.g2d.SpriteBatch
import com.badlogic.gdx.graphics.glutils.ShapeRenderer
import com.cc.asset.AssetLoader
import com.cc.screens.fight2.model.FightModel
import com.cc.screens.fight2.model.WaitSelectSkill
import com.cc.ui.component.UIComponent
import com.cc.ui.component.WindowPanel

class SkillList(assetLoader: AssetLoader, private val fightModel: FightModel) : UIComponent(assetLoader) {
    private val window = WindowPanel(assetLoader, "人物技能", null) {
    }.also {
        it.onEvent<String> {
            if (it == "close") {
                println("close")
            }
        }
    }

    private val SKILL_LIST_X = 30f
    private val SKILL_LIST_Y = 80f
    private val SKILL_LIST_W = 180f
    private val SKILL_LIST_ROW_H = 18f

    override fun render(
        batch: SpriteBatch,
        sr: ShapeRenderer,
        cx: Float,
        cy: Float,
        cw: Float,
        ch: Float,
        delta: Float
    ) {
        if (fightModel.state != WaitSelectSkill) return
        window.render(batch, sr, cx + 10, cy + 10, cw - 20, ch - 20, delta)
    }
}