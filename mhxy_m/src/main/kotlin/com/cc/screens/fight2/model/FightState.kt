package com.cc.screens.fight2.model

import kotlin.reflect.KClass

sealed interface Action

//返回
object Back : Action
object SkillButton : Action
data class SelectSkill(val skill: Skill) : Action
data class SelectTarget(val target: Role) : Action


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

    internal inline fun <reified T : Action> r(state: FightState) {
        handlers[T::class] = { _, _ -> state }
    }

    fun on(action: Action, fightModel: FightModel): FightState {
        return handlers[action::class]?.invoke(action, fightModel) ?: this
    }
}

// 等待玩家选择行动
object WaitAction : FightState({
    r<SkillButton>(WaitSelectSkill)
})

//等待选择技能
object WaitSelectSkill : FightState({
    r<Back>(WaitAction)
    r<SelectSkill> { WaitSelectTarget(it.skill) }
})

//选择目标
data class WaitSelectTarget(
    val skill: Skill,
    /** 单体技能当前选中的角色，null 表示尚未初始化 */
    var selectedTarget: Role? = null
) : FightState({
    r<Back>(WaitSelectSkill)
    r<SelectTarget> { action, model ->
        model.actionList += "${skill.name}_${action.target.name}"
        if (model.actionList.size >= 2) {
            Animating
        } else {
            WaitAction
        }
    }
})

object Animating : FightState({})

//
//SELECT_SKILL,       // 玩家选技能（弹出技能列表）
//SELECT_TARGET,      // 玩家选择目标
//SELECT_PET_SKILL,   // 宠物选技能
//SELECT_PET_TARGET,  // 宠物选目标
//ANIMATING,          // 双方动画播放中
//ROUND_RESULT,       // 显示回合结算数字
//ENEMY_TURN,         // 敌方自动行动
//BATTLE_END,         // 战斗结束