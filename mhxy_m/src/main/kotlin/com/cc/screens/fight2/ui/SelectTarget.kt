package com.cc.screens.fight2.ui

import com.badlogic.gdx.graphics.g2d.SpriteBatch
import com.badlogic.gdx.graphics.glutils.ShapeRenderer
import com.cc.asset.AssetLoader
import com.cc.asset.AssetManagerFactory.PUBLIC_ASSET
import com.cc.asset.RpgAnimation
import com.cc.event.TouchContext
import com.cc.render.drawAnimation
import com.cc.screens.fight2.model.*
import com.cc.screens.fight2.model.SelectTarget
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
        val skill = state.skill
        val candidates = when (skill.target) {
            SkillTarget.SINGLE_ENEMY, SkillTarget.ALL_ENEMIES -> fightModel.enemy
            SkillTarget.SINGLE_ALLY, SkillTarget.ALL_ALLIES -> fightModel.players
        }
        val aliveTargets = candidates.filter { it.isAlive }
        if (aliveTargets.isEmpty()) return

        val isSingle = skill.target == SkillTarget.SINGLE_ENEMY || skill.target == SkillTarget.SINGLE_ALLY

        // 单体：默认选中第一个存活角色
        if (isSingle && state.selectedTarget == null) {
            state.selectedTarget = aliveTargets.first()
        }

        // 播放选择动画：单体只在选中角色头上播放，群体在所有存活角色上播放
        val animOffY = -55f
        val animTargets = if (isSingle) listOf(state.selectedTarget!!) else aliveTargets
        batch.begin()
        for (role in animTargets) {
            val (x, y) = role.getPos()
            batch.drawAnimation(selectAnim.getKeyFrame(timer, true), x, y + animOffY)
        }
        batch.end()

        // 点击处理
        val touchW = 30f
        val touchH = 40f
        for (role in aliveTargets) {
            val (x, y) = role.getPos()
            if (TouchContext.inTouch(x - touchW / 2, y - touchH, touchW, touchH)) {
                if (isSingle) {
                    if (state.selectedTarget == role) {
                        // 再次点击同一个角色 → 确认选择
                        emit(SelectTarget(role))
                    } else {
                        // 首次点击 / 切换目标
                        state.selectedTarget = role
                    }
                } else {
                    // 群体技能：点击任意角色即确认
                    emit(SelectTarget(role))
                }
                break
            }
        }
    }

}
