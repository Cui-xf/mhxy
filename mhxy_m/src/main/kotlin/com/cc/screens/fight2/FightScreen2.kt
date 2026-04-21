package com.cc.screens.fight2

import com.badlogic.gdx.graphics.g2d.TextureRegion
import com.cc.screens.AbstractScreen
import com.cc.screens.fight2.model.Action
import com.cc.screens.fight2.model.FightModel
import com.cc.screens.game.Player

class FightScreen2(
    private val monsterId: Int = 1,
    player: Player,
    backGround: TextureRegion
) : AbstractScreen() {
    private val fightModel = FightModel()
    val handler = ::handleAction
    private val component = listOf(
        autoDispose { BackGround(this.assetLoader, backGround) },
        autoDispose { FightRole(this.assetLoader, fightModel) },
        autoDispose { ActionButton(this.assetLoader, fightModel) },
        autoDispose { Tips(this.assetLoader, fightModel) },
        autoDispose { QuickBar(this.assetLoader, fightModel) },
        autoDispose { ReturnButton(this.assetLoader, fightModel, backGround) },
        autoDispose { SkillList(this.assetLoader, fightModel) },
    )

    init {
        component.forEach { it.onEvent<Action>(handler) }
    }

    override fun update(delta: Float) {
        for (component in component) {
            component.render(batch, sr, 0f, 0f, VIRTUAL_W, VIRTUAL_H, delta)
        }
    }

    private fun handleAction(action: Action) {
        fightModel.state = fightModel.state.on(action)
    }
}
