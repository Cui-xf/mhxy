package com.cc.screens.fight

import com.badlogic.gdx.graphics.g2d.TextureRegion
import com.badlogic.gdx.utils.Timer
import com.cc.MhxyGame
import com.cc.screens.AbstractScreen
import com.cc.screens.fight.model.*
import com.cc.screens.fight.ui.*
import com.cc.screens.fight.ui.SelectTarget
import com.cc.screens.game.GameScreen

class FightScreen(
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
        autoDispose { SelectTarget(this.assetLoader, fightModel) },
        autoDispose { WaitSyncDialog(this.assetLoader, fightModel) },
        autoDispose { SkillEffect(this.assetLoader, fightModel) },
        autoDispose { HitNumber(this.assetLoader, fightModel) },
    )

    init {
        component.forEach { it.onEvent<Action>(handler) }
    }

    override fun update(delta: Float) {
        fightModel.state.let { state ->
            if (state is Animating) {
                state.driver.update(delta)?.also { action ->
                    handleAction(action)
                }
            }
        }

        for (component in component) {
            component.render(batch, sr, 0f, 0f, VIRTUAL_W, VIRTUAL_H, delta)
        }
    }

    private fun handleAction(action: Action) {
        println("handleAction: $action")
        if (action is EndTheBattle) {
            MhxyGame.screen = GameScreen()
        }

        val newState = fightModel.state.on(action, fightModel)
        fightModel.state = newState
        if (newState is WaitSync) {
            Timer.schedule(object : Timer.Task() {
                override fun run() {
                    val list = fightModel.fightInstruction.toList()
                    fightModel.fightInstruction.clear()
                    handleAction(PlaybackAnimation(list))
                }
            }, 2f)
        }
    }
}
