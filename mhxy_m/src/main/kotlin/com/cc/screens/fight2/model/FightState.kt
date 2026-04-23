package com.cc.screens.fight2.model

import kotlin.reflect.KClass

sealed interface Action

//返回
object Back : Action
object SkillButton : Action
data class SelectSkill(val skill: Skill) : Action
data class SelectTarget(val target: Role) : Action
data class PlaybackAnimation(val instructions: List<FightInstruction>) : Action
object AnimationDone : Action


sealed class FightState(
    register: FightState.() -> Unit,
) {
    @PublishedApi
    internal val handlers = mutableMapOf<KClass<*>, (Action, FightModel) -> FightState>()

    init {
        register()
    }

    @Suppress("UNCHECKED_CAST")
    internal inline fun <reified T : Action> r(noinline handler: (T, FightModel) -> FightState) {
        handlers[T::class] = handler as (Action, FightModel) -> FightState
    }

    @Suppress("UNCHECKED_CAST")
    internal inline fun <reified T : Action> r(noinline handler: (T) -> FightState) {
        handlers[T::class] = { action, _ -> handler(action as T) }
    }

    fun on(action: Action, fightModel: FightModel): FightState {
        return handlers[action::class]?.invoke(action, fightModel) ?: this
    }
}

// 等待玩家选择行动
object WaitAction : FightState({
    r<SkillButton> { WaitSelectSkill }
})

//等待选择技能
object WaitSelectSkill : FightState({
    r<Back> { WaitAction }
    r<SelectSkill> { WaitSelectTarget(it.skill) }
})

//选择目标
data class WaitSelectTarget(
    val skill: Skill
) : FightState({
    r<Back> { WaitSelectSkill }
    r<SelectTarget> { action, model ->
        model.fightInstruction += FightInstruction(model.self, SkillCasting(skill, listOf(action.target)))
        if (model.fightInstruction.size >= 2) {
            WaitSync("等待中...")
        } else {
            WaitAction
        }
    }
}) {
    /** 单体技能当前选中的角色，null 表示尚未初始化 */
    var selectedTarget: Role? = null
}

//等待Server同步
data class WaitSync(val tips: String) : FightState({
    r<PlaybackAnimation> { action, _ ->
        Animating(AnimationDriver(action.instructions))
    }
})

data class Animating(val driver: AnimationDriver) : FightState({
    r<AnimationDone> { WaitAction }
})

//
//SELECT_SKILL,       // 玩家选技能（弹出技能列表）
//SELECT_TARGET,      // 玩家选择目标
//SELECT_PET_SKILL,   // 宠物选技能
//SELECT_PET_TARGET,  // 宠物选目标
//ANIMATING,          // 双方动画播放中
//ROUND_RESULT,       // 显示回合结算数字
//ENEMY_TURN,         // 敌方自动行动
//BATTLE_END,         // 战斗结束