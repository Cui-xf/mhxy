package com.cc.screens.fight2.model

import kotlin.reflect.KClass

sealed interface Action

object Back : Action //返回
data class RoleActionButton(val roleActionType: RoleActionType) : Action
data class SelectSkill(val skill: Skill) : Action
data class SelectItem(val item: String) : Action
data class SelectTarget(val target: Role) : Action
data class PlaybackAnimation(val instructions: List<RoleInstruction>) : Action
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
    r<RoleActionButton> { action, model ->
        when (action.roleActionType) {
            RoleActionType.ATTACK -> {
                model.tempInstruction = RoleInstruction(role, RoleAction.Attack())
                WaitSelectTarget(this)
            }

            RoleActionType.DEFEND -> {
                model.tempInstruction = RoleInstruction(role, RoleAction.Defend)
                model.installInstruction()
            }

            RoleActionType.MAGIC -> {
                model.tempInstruction = RoleInstruction(role, RoleAction.Magic())
                WaitSelectSkill
            }

            RoleActionType.ITEM -> {
                model.tempInstruction = RoleInstruction(role, RoleAction.Item())
                WaitSelectItem
            }

            RoleActionType.ESCAPE -> {
                model.tempInstruction = RoleInstruction(role, RoleAction.Escape)
                model.installInstruction()
            }
        }
    }
})

//等待选择技能
object WaitSelectSkill : FightState({
    r<Back> { _, model -> WaitAction(model.tempInstruction!!.src) }
    r<SelectSkill> { action, model ->
        (model.tempInstruction?.action as? RoleAction.Magic)?.skill = action.skill
        WaitSelectTarget(this)
    }
})

//等待选择道具
object WaitSelectItem : FightState({
    r<Back> { _, model -> WaitAction(model.tempInstruction!!.src) }
    r<SelectItem> { action, model ->
        (model.tempInstruction?.action as? RoleAction.Item)?.item = action.item
        WaitSelectTarget(this)
    }
})

//选择目标
data class WaitSelectTarget(private val lastState: FightState) : FightState({
    r<Back> { lastState }
    r<SelectTarget> { action, model ->
        (model.tempInstruction?.action as? TargetableAction)?.target = listOf(action.target)
        model.installInstruction()
    }
}) {
    /** 单体技能当前选中的角色，null 表示尚未初始化 */
    var selectedTarget: Role? = null
}

//等待Server同步
data class WaitSync(val tips: String = "等待中...") : FightState({
    r<PlaybackAnimation> { action, _ ->
        Animating(AnimationDriver(action.instructions))
    }
})

data class Animating(val driver: AnimationDriver) : FightState({
    r<AnimationDone> { _, model ->
        WaitAction(model.self)
    }
})