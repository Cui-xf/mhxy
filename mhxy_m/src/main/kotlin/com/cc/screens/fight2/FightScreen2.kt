package com.cc.screens.fight2

import com.badlogic.gdx.graphics.g2d.TextureRegion
import com.badlogic.gdx.utils.Timer
import com.cc.screens.AbstractScreen
import com.cc.screens.fight2.model.*
import com.cc.screens.fight2.ui.*
import com.cc.screens.fight2.ui.SelectTarget
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
        autoDispose { SelectTarget(this.assetLoader, fightModel) },
        autoDispose { WaitSyncDialog(this.assetLoader, fightModel) },
        autoDispose { SkillEffect(this.assetLoader, fightModel) },
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
        val newState = fightModel.state.on(action, fightModel)
        fightModel.state = newState
        if (newState is WaitSync) {
            Timer.schedule(object : Timer.Task() {
                override fun run() {
                    handleAction(PlaybackAnimation(fightModel.fightInstruction.toList()))
                }
            }, 2f)
        }
    }
}
