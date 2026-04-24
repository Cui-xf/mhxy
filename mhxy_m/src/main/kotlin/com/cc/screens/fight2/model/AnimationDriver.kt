package com.cc.screens.fight2.model


/**
 * 战斗动画状态驱动器
 *
 * 播放流程（每条 Instruction）：
 *   MOVE_TO_TARGET → src 向 target 前方插值移动
 *   ATTACK         → src 播攻击动画
 *   SKILL_EFFECT   → 挂起，等 SkillEffect 组件调用 onSkillEffectDone()（无特效时自动跳过）
 *   MOVE_BACK      → src 插值返回原位
 *   HIT            → target 播受击动画
 * 全部指令播完后返回 AnimationDone。
 */
class AnimationDriver(
    private val instruction: List<Instruction>,
) {
    companion object {
        private val MOVE_DURATION = 0.3f
        private val ATTACK_DURATION = 0.5f
        private val HIT_DURATION = 0.4f
        private val ATTACK_OFFSET = 20f
    }

    private var instrIndex = 0
    var phase: Phase = Phase.MOVE_TO_TARGET()
        private set
    var phaseTimer = 0f
        private set

    private var srcStartX = 0f
    private var srcStartY = 0f
    private var srcEndX = 0f
    private var srcEndY = 0f

    /** SkillEffect 组件播放完毕后调用此方法，driver 继续推进 */
    fun onSkillEffectDone() {
        if (phase is Phase.SKILL_EFFECT) {
            phase = Phase.MOVE_BACK()
            phaseTimer = 0f
        }
    }

    fun update(delta: Float): Action? {
        if (instrIndex >= instruction.size) {
            return AnimationDone
        }
        return when (val instr = instruction[instrIndex]) {
            is FinishInstruction -> EndTheBattle
            is RoleInstruction -> driveAnim(delta, instr)
        }
    }

    private fun driveAnim(delta: Float, fightInstruction: RoleInstruction): Action? {
        phaseTimer += delta
        val src = fightInstruction.src
        val action = fightInstruction.action
        when (phase) {
            is Phase.MOVE_TO_TARGET -> {
                move(src, action, delta)
                return null
            }

            is Phase.ATTACK -> {
                attack(src, action)
                return null
            }

            is Phase.SKILL_EFFECT -> {
                return null //由主动方法驱动，这里不用被动驱动
            }

            is Phase.MOVE_BACK -> {
                back(src, action)
                return null
            }

            is Phase.HIT -> {
                return hit(fightInstruction, action, delta)
            }
        }
    }

    private fun hit(instr: RoleInstruction, action: RoleAction, delta: Float): Action? {
        val target = (action as RoleAction.TargetableAction).target
        target.forEach { it.animState = RoleAnimState.HIT }
        if (phaseTimer <= delta && target.isNotEmpty()) {
            // 将结果应用到角色属性
            target.zip(instr.result!!).forEach { (role, result) ->
                when (result.field) {
                    Field.HP -> role.hp = (role.hp + result.value.toInt()).coerceIn(0, role.maxHp)
                    Field.MP -> role.mp = (role.mp + result.value.toInt()).coerceIn(0, role.maxMp)
                }
            }
        }
        if (phaseTimer >= HIT_DURATION) {
            target.forEach { it.animState = RoleAnimState.IDLE }
            instrIndex++
            phase = Phase.MOVE_TO_TARGET()
            phaseTimer = 0f
            if (instrIndex >= instruction.size) {
                return AnimationDone
            }
        }
        return null
    }

    private fun back(src: Role, action: RoleAction) {
        if (action is RoleAction.Attack) {
            val t = (phaseTimer / MOVE_DURATION).coerceIn(0f, 1f)
            src.posX = lerp(srcEndX, srcStartX, t)
            src.posY = lerp(srcEndY, srcStartY, t)
            if (phaseTimer >= MOVE_DURATION) {
                src.posX = srcStartX
                src.posY = srcStartY
            }
        }
        if (phaseTimer >= MOVE_DURATION) {
            //todo cxf
//            phase = Phase.HIT()
            phaseTimer = 0f
        }
    }

    private fun attack(src: Role, action: RoleAction) {
        src.animState = RoleAnimState.ATTACKING
        if (phaseTimer >= ATTACK_DURATION) {
            src.animState = RoleAnimState.IDLE
            val skillId = when (action) {
                is RoleAction.Attack -> action.skillId
                is RoleAction.Magic -> action.skill.id
                else -> null
            }
            val target = (action as RoleAction.TargetableAction).target
            if (skillId != null && target.isNotEmpty()) {
                // 有技能特效，挂起等 SkillEffect 组件完成
                phase = Phase.SKILL_EFFECT(skillId, target)
                phaseTimer = 0f
            } else {
                phase = Phase.MOVE_BACK()
                phaseTimer = 0f
            }
        }
    }

    private fun move(src: Role, action: RoleAction, delta: Float) {
        if (action is RoleAction.Attack) {
            val major = action.target[0]
            if (phaseTimer <= delta) {
                val sx = src.posX
                val sy = src.posY
                val tx = major.posX
                val ty = major.posY

                val signX = if (tx > sx) 1f else -1f
                srcStartX = sx
                srcStartY = sy
                srcEndX = tx - signX * ATTACK_OFFSET
                srcEndY = ty
            }
            val t = (phaseTimer / MOVE_DURATION).coerceIn(0f, 1f)
            src.posX = lerp(srcStartX, srcEndX, t)
            src.posY = lerp(srcStartY, srcEndY, t)
        }
        if (phaseTimer >= MOVE_DURATION) {
            phase = Phase.ATTACK()
            phaseTimer = 0f
        }
    }

    private fun lerp(a: Float, b: Float, t: Float) = a + (b - a) * t
}

sealed interface Phase {
    class MOVE_TO_TARGET : Phase
    class ATTACK : Phase
    data class SKILL_EFFECT(
        val skillId: Int,
        val target: List<Role>,
    ) : Phase

    class MOVE_BACK : Phase
    data class HIT(
        val targets: List<Role>,
        val results: List<Result>,
    ) : Phase
}