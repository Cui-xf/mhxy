package com.cc.screens.fight2.model


/**
 * 战斗动画状态驱动器
 *
 * 播放流程（每条 FightInstruction）：
 *   MOVE_TO_TARGET → src 向 target 前方插值移动
 *   ATTACK         → src 播攻击动画
 *   SKILL_EFFECT   → 挂起，等 SkillEffect 组件调用 onSkillEffectDone()（无特效时自动跳过）
 *   MOVE_BACK      → src 插值返回原位
 *   HIT            → target 播受击动画
 * 全部指令播完后返回 AnimationDone。
 */
class AnimationDriver(
    private val instruction: List<FightInstruction>,
) {
    companion object {
        private val MOVE_DURATION = 0.3f
        private val ATTACK_DURATION = 0.5f
        private val HIT_DURATION = 0.4f
        private val ATTACK_OFFSET = 20f
    }

    private var instrIndex = 0
    private var phase = Phase.MOVE_TO_TARGET

    var phaseTimer = 0f
        private set

    private var srcStartX = 0f
    private var srcStartY = 0f
    private var srcEndX = 0f
    private var srcEndY = 0f

    /** SkillEffect 组件读取此字段决定播什么特效，null 表示当前无需播放 */
    var skillEffectRequest: SkillEffectRequest? = null
        private set

    /** SkillEffect 组件播放完毕后调用此方法，driver 继续推进 */
    fun onSkillEffectDone() {
        if (phase == Phase.SKILL_EFFECT) {
            skillEffectRequest = null
            phase = Phase.MOVE_BACK
            phaseTimer = 0f
        }
    }

    fun update(delta: Float): Action? {
        if (instrIndex >= instruction.size) {
            return AnimationDone
        }
        phaseTimer += delta

        val instr = instruction[instrIndex]
        val src = instr.src
        val target = (instr.command as? SkillCasting)?.target

        return when (phase) {
            Phase.MOVE_TO_TARGET -> {
                if (target != null) {
                    val major = target[0]
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
                    phase = Phase.ATTACK
                    phaseTimer = 0f
                }
                null
            }

            Phase.ATTACK -> {
                src.animState = RoleAnimState.ATTACKING
                if (phaseTimer >= ATTACK_DURATION) {
                    src.animState = RoleAnimState.IDLE
                    val cmd = instr.command
                    if (cmd is SkillCasting && cmd.skill.hasAnim && target != null) {
                        // 有技能特效，挂起等 SkillEffect 组件完成
                        skillEffectRequest = SkillEffectRequest(cmd.skill.id, target)
                        phase = Phase.SKILL_EFFECT
                        phaseTimer = 0f
                    } else {
                        phase = Phase.MOVE_BACK
                        phaseTimer = 0f
                    }
                }
                null
            }

            Phase.SKILL_EFFECT -> {
                //由主动方法驱动，这里不用被动驱动
                null
            }

            Phase.MOVE_BACK -> {
                val t = (phaseTimer / MOVE_DURATION).coerceIn(0f, 1f)
                src.posX = lerp(srcEndX, srcStartX, t)
                src.posY = lerp(srcEndY, srcStartY, t)
                if (phaseTimer >= MOVE_DURATION) {
                    src.posX = srcStartX
                    src.posY = srcStartY
                    phase = Phase.HIT
                    phaseTimer = 0f
                }
                null
            }

            Phase.HIT -> {
                target?.forEach { it.animState = RoleAnimState.HIT }
                if (phaseTimer >= HIT_DURATION) {
                    target?.forEach { it.animState = RoleAnimState.IDLE }
                    instrIndex++
                    phase = Phase.MOVE_TO_TARGET
                    phaseTimer = 0f
                    if (instrIndex >= instruction.size) {
                        return AnimationDone
                    }
                }
                null
            }
        }
    }

    private fun lerp(a: Float, b: Float, t: Float) = a + (b - a) * t
}

enum class Phase { MOVE_TO_TARGET, ATTACK, SKILL_EFFECT, MOVE_BACK, HIT }

data class SkillEffectRequest(
    val skillId: Int,
    val target: List<Role>,
)
