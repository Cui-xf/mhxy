package com.cc.screens.fight.ui

import com.badlogic.gdx.graphics.g2d.SpriteBatch
import com.badlogic.gdx.graphics.glutils.ShapeRenderer
import com.cc.asset.AssetLoader
import com.cc.asset.AssetManagerFactory.PUBLIC_ASSET
import com.cc.asset.RpgAnimation
import com.cc.event.TouchContext
import com.cc.render.drawAnimation
import com.cc.screens.fight.model.*
import com.cc.screens.fight.model.SelectTarget
import com.cc.ui.component.UIComponent

class SelectTarget(
    assetLoader: AssetLoader,
    private val fightModel: FightModel,
) : UIComponent(assetLoader) {
    //选择目标动画
    private val selectAnim by resource(PUBLIC_ASSET, "rpg/publicUI/select.anim", RpgAnimation::class)

    private var timer = 0f
    override fun render(
        batch: SpriteBatch,
        sr: ShapeRenderer,
        cx: Float,
        cy: Float,
        cw: Float,
        ch: Float,
        delta: Float
    ) {
        //选择目标
        val state = fightModel.state as? WaitSelectTarget ?: return
        timer += delta
        selectTarget(batch, state)
    }

    private fun selectTarget(batch: SpriteBatch, state: WaitSelectTarget) {
        val aliveTargets = getAliveTargets()
        if (aliveTargets.isEmpty()) return
        if (state.selectedTarget == null) {
            state.selectedTarget = aliveTargets.first()
        }

        state.selectedTarget?.let {
            val animOffY = -55f
            batch.begin()
            batch.drawAnimation(selectAnim.getKeyFrame(timer, true), it.posX, it.posY + animOffY)
            batch.end()
        }
        // 点击处理
        val touchW = 30f
        val touchH = 40f
        for (role in aliveTargets) {
            val x = role.posX
            val y = role.posY
            if (TouchContext.inTouch(x - touchW / 2, y - touchH, touchW, touchH)) {
                if (state.selectedTarget == role) {
                    // 再次点击同一个角色 → 确认选择
                    emit(SelectTarget(role))
                } else {
                    // 首次点击 / 切换目标
                    state.selectedTarget = role
                }
                break
            }
        }
    }

    private fun getAliveTargets(): List<Role> {
        val action = fightModel.tempInstruction?.action ?: return emptyList<Role>()
        when (action) {
            is RoleAction.Attack -> {
                return fightModel.enemy
            }

            is RoleAction.Item -> {
                return fightModel.ally
            }

            is RoleAction.Magic -> {
                val target = action.skill.target
                return if (target == SkillTarget.SINGLE_ENEMY || target == SkillTarget.ALL_ENEMIES) {
                    fightModel.enemy
                } else {
                    fightModel.ally
                }
            }

            RoleAction.Defend, RoleAction.Escape -> throw RuntimeException("UN SUPPORT")
        }
    }

}
