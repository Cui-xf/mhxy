package com.cc.screens.fight.ui

import com.badlogic.gdx.graphics.g2d.SpriteBatch
import com.badlogic.gdx.graphics.glutils.ShapeRenderer
import com.cc.asset.AssetLoader
import com.cc.screens.base.ClickItem
import com.cc.screens.base.ItemWindow
import com.cc.screens.fight.model.Back
import com.cc.screens.fight.model.FightModel
import com.cc.screens.fight.model.SelectItem
import com.cc.screens.fight.model.WaitSelectItem
import com.cc.ui.component.Close
import com.cc.ui.component.UIComponent

class FightItemList(assetLoader: AssetLoader, private val fightModel: FightModel) : UIComponent(assetLoader) {
    private val itemWindow = ItemWindow(assetLoader, "战斗使用")
        .onEvent<Close> {
            emit(Back)
        }.onEvent<ClickItem> {
            emit(SelectItem(it.item))
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
        if (fightModel.state !is WaitSelectItem) return
        itemWindow.render(batch, sr, cx, cy, cw, ch, delta)
    }
}