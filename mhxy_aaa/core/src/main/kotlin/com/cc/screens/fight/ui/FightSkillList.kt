package com.cc.screens.fight.ui

import com.badlogic.gdx.graphics.g2d.SpriteBatch
import com.badlogic.gdx.graphics.glutils.ShapeRenderer
import com.cc.asset.AssetLoader
import com.cc.screens.base.ClickSkill
import com.cc.screens.base.SkillWindow
import com.cc.screens.fight.model.Back
import com.cc.screens.fight.model.FightModel
import com.cc.screens.fight.model.SelectSkill
import com.cc.screens.fight.model.WaitSelectSkill
import com.cc.ui.component.Close
import com.cc.ui.component.UIComponent

class FightSkillList(assetLoader: AssetLoader, private val fightModel: FightModel) : UIComponent(assetLoader) {
    private val skillWindow = SkillWindow(assetLoader, "人物技能")
        .onEvent<Close> {
            emit(Back)
        }.onEvent<ClickSkill> {
            emit(SelectSkill(it.skill))
        }

    override fun render(
        batch: SpriteBatch,
        sr: ShapeRenderer,
        cx: Float,
        cy: Float,
        cw: Float,
        ch: Float,
        delta: Float
    ) {
        if (fightModel.state !is WaitSelectSkill) return
        skillWindow.render(batch, sr, cx, cy, cw, ch, delta)
    }
}