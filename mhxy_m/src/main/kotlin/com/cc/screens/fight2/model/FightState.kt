package com.cc.screens.fight2.model

import kotlin.reflect.KClass

sealed interface Action
object SkillButton : Action
data class SelectSkill(val skill: String) : Action

sealed class FightState(
    register: FightState.() -> Unit,
) {
    @PublishedApi
    internal val handlers = mutableMapOf<KClass<*>, (Action) -> FightState>()

    init {
        register()
    }

    @Suppress("UNCHECKED_CAST")
    internal inline fun <reified T : Action> r(noinline handler: (T) -> FightState) {
        handlers[T::class] = handler as (Action) -> FightState
    }

    fun on(action: Action): FightState {
        return handlers[action::class]?.invoke(action) ?: this
    }
}

// 等待玩家选择行动
object WaitAction : FightState({
    r<SkillButton> { WaitSelectSkill }
})

//等待选择技能
object WaitSelectSkill : FightState({
    r<SelectSkill> { WaitSelectTarget(it.skill) }
})

data class WaitSelectTarget(
    private val action: String
) : FightState({})

//
//SELECT_SKILL,       // 玩家选技能（弹出技能列表）
//SELECT_TARGET,      // 玩家选择目标
//SELECT_PET_SKILL,   // 宠物选技能
//SELECT_PET_TARGET,  // 宠物选目标
//ANIMATING,          // 双方动画播放中
//ROUND_RESULT,       // 显示回合结算数字
//ENEMY_TURN,         // 敌方自动行动
//BATTLE_END,         // 战斗结束