package com.cc.screens.fight2.model

import kotlin.reflect.KClass

sealed interface Action

//返回
object Back : Action
data class SkillButton(val role: Role) : Action
data class SelectSkill(val skill: Skill) : Action
data class SelectTarget(val target: Role) : Action
data class PlaybackAnimation(val instructions: List<FightInstruction>) : Action
object AnimationDone : Action
object EndTheBattle : Action


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
data class WaitAction(val role: Role) : FightState({
    r<SkillButton> { WaitSelectSkill(it.role) }
})

//等待选择技能
data class WaitSelectSkill(val role: Role) : FightState({
    r<Back> { WaitAction(role) }
    r<SelectSkill> { WaitSelectTarget(role, it.skill) }
})

//选择目标
data class WaitSelectTarget(
    val src: Role,
    val skill: Skill
) : FightState({
    r<Back> { WaitSelectSkill(src) }
    r<SelectTarget> { action, model ->
        val nextRole = model.installInstruction(src, skill, action.target)
        if (nextRole == null) {
            WaitSync("等待中...")
        } else {
            WaitAction(nextRole)
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
    r<AnimationDone> { _, model ->
        WaitAction(model.self)
    }
})