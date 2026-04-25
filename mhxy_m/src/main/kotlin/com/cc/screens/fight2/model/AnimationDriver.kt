package com.cc.screens.fight2.model


private const val MOVE_DURATION = 0.3f
private const val ATTACK_DURATION = 0.5f
private const val HIT_DURATION = 0.4f
private const val DEFEND_DURATION = 0.5f
private const val ATTACK_OFFSET = 20f

// ─── PhaseHandler 接口 ───────────────────────────────────────────────

/**
 * 单个阶段的处理器。
 * 每个 PhaseHandler 实例只服务于一条指令的一个阶段。
 */
interface PhaseHandler {
    /** 阶段开始时调用一次（初始化坐标、设置动画状态等） */
    fun onEnter(instr: RoleInstruction) {}

    /**
     * 每帧调用。
     * @return true 表示此阶段完成，Driver 应推进到下一阶段
     */
    fun update(delta: Float, instr: RoleInstruction): Boolean

    /** 阶段结束时调用一次（清理状态等） */
    fun onExit(instr: RoleInstruction) {}
}

// ─── 具体 Handler 实现 ──────────────────────────────────────────────

/** 移动到目标前方（仅近战攻击使用） */
class MoveToTargetHandler : PhaseHandler {
    private var srcStartX = 0f
    private var srcStartY = 0f
    private var srcEndX = 0f
    private var srcEndY = 0f
    private var timer = 0f

    override fun onEnter(instr: RoleInstruction) {
        val src = instr.src
        val target = (instr.action as TargetableAction).target[0]
        srcStartX = src.posX
        srcStartY = src.posY
        val signX = if (target.posX > src.posX) 1f else -1f
        srcEndX = target.posX - signX * ATTACK_OFFSET
        srcEndY = target.posY
        timer = 0f
    }

    override fun update(delta: Float, instr: RoleInstruction): Boolean {
        timer += delta
        val t = (timer / MOVE_DURATION).coerceIn(0f, 1f)
        instr.src.posX = lerp(srcStartX, srcEndX, t)
        instr.src.posY = lerp(srcStartY, srcEndY, t)
        return timer >= MOVE_DURATION
    }
}

/** 播放攻击/施法动画 */
class AttackAnimHandler : PhaseHandler {
    private var timer = 0f

    override fun onEnter(instr: RoleInstruction) {
        instr.src.animState = RoleAnimState.ATTACKING
        timer = 0f
    }

    override fun update(delta: Float, instr: RoleInstruction): Boolean {
        timer += delta
        return timer >= ATTACK_DURATION
    }

    override fun onExit(instr: RoleInstruction) {
        instr.src.animState = RoleAnimState.IDLE
    }
}

/** 挂起等待 SkillEffect 组件播放完毕后回调 */
class SkillEffectHandler(
    val skillId: Int,
    val targets: List<Role>,
) : PhaseHandler {
    var done = false
        private set
    var timer = 0f
        private set

    /** SkillEffect 组件播完后调用此方法 */
    fun markDone() {
        done = true
    }

    override fun update(delta: Float, instr: RoleInstruction): Boolean {
        timer += delta
        return done
    }
}

/** 将角色移回原始位置（与 MoveToTargetHandler 配对） */
class MoveBackHandler(
    private val startX: Float,
    private val startY: Float,
) : PhaseHandler {
    private var fromX = 0f
    private var fromY = 0f
    private var timer = 0f

    override fun onEnter(instr: RoleInstruction) {
        fromX = instr.src.posX
        fromY = instr.src.posY
        timer = 0f
    }

    override fun update(delta: Float, instr: RoleInstruction): Boolean {
        timer += delta
        val t = (timer / MOVE_DURATION).coerceIn(0f, 1f)
        instr.src.posX = lerp(fromX, startX, t)
        instr.src.posY = lerp(fromY, startY, t)
        if (timer >= MOVE_DURATION) {
            instr.src.posX = startX
            instr.src.posY = startY
        }
        return timer >= MOVE_DURATION
    }
}

/** 受击：播放受击动画 + 应用伤害/治疗数值 */
class HitHandler : PhaseHandler {
    var timer = 0f
        private set
    var targets: List<Role> = emptyList()
        private set
    var results: List<Result> = emptyList()
        private set
    private var applied = false

    override fun onEnter(instr: RoleInstruction) {
        targets = (instr.action as TargetableAction).target
        results = instr.result ?: emptyList()
        targets.forEach { it.animState = RoleAnimState.HIT }
        timer = 0f
        applied = false
    }

    override fun update(delta: Float, instr: RoleInstruction): Boolean {
        timer += delta
        if (!applied) {
            applied = true
            targets.zip(results).forEach { (role, result) ->
                when (result.field) {
                    Field.HP -> role.hp = (role.hp + result.value.toInt()).coerceIn(0, role.maxHp)
                    Field.MP -> role.mp = (role.mp + result.value.toInt()).coerceIn(0, role.maxMp)
                }
            }
        }
        return timer >= HIT_DURATION
    }

    override fun onExit(instr: RoleInstruction) {
        targets.forEach { it.animState = RoleAnimState.IDLE }
    }
}

/** 防御：原地播放防御姿态 */
class DefendHandler : PhaseHandler {
    private var timer = 0f

    override fun update(delta: Float, instr: RoleInstruction): Boolean {
        timer += delta
        return timer >= DEFEND_DURATION
    }
}

// ─── 流程编排：工厂方法 ────────────────────────────────────────────

fun buildPhases(instr: RoleInstruction): List<PhaseHandler> {
    return when (val action = instr.action) {
        is RoleAction.Attack -> listOfNotNull(
            MoveToTargetHandler(),
            AttackAnimHandler(),
            action.getSkillId()?.let { SkillEffectHandler(it, action.target) },
            MoveBackHandler(instr.src.posX, instr.src.posY),
            HitHandler(),
        )

        is RoleAction.Magic -> listOfNotNull(
            AttackAnimHandler(),
            SkillEffectHandler(action.getSkillId(), action.target),
            HitHandler(),
        )

        is RoleAction.Defend -> listOf(
            DefendHandler(),
        )

        is RoleAction.Item -> listOf(
            AttackAnimHandler(),
            SkillEffectHandler(action.getSkillId(), action.target),
            HitHandler(),
        )

        is RoleAction.Escape -> emptyList()
    }
}

// ─── AnimationDriver ───────────────────────────────────────────────

/**
 * 战斗动画状态驱动器
 *
 * 根据 RoleAction 类型生成 PhaseHandler 列表，按顺序驱动。
 * 全部指令播完后返回 AnimationDone。
 */
class AnimationDriver(
    private val instruction: List<Instruction>,
) {
    private var instrIndex = 0
    private var phases: List<PhaseHandler> = emptyList()
    private var phaseIndex = 0

    /** 暴露当前阶段的 Handler，供 SkillEffect 等外部组件交互 */
    val currentHandler: PhaseHandler? get() = phases.getOrNull(phaseIndex)

    fun update(delta: Float): Action? {
        if (instrIndex >= instruction.size) {
            return AnimationDone
        }
        return when (val instr = instruction[instrIndex]) {
            is FinishInstruction -> EndTheBattle
            is RoleInstruction -> drivePhases(delta, instr)
        }
    }

    private fun drivePhases(delta: Float, instr: RoleInstruction): Action? {
        if (phases.isEmpty()) {
            phases = buildPhases(instr)
            if (phases.isEmpty()) {
                return advanceInstruction()
            }
            phases[0].onEnter(instr)
        }

        val handler = phases[phaseIndex]
        val done = handler.update(delta, instr)

        if (done) {
            handler.onExit(instr)
            phaseIndex++
            if (phaseIndex >= phases.size) {
                return advanceInstruction()
            } else {
                phases[phaseIndex].onEnter(instr)
            }
        }
        return null
    }

    private fun advanceInstruction(): Action? {
        instrIndex++
        phases = emptyList()
        phaseIndex = 0
        return if (instrIndex >= instruction.size) AnimationDone else null
    }
}

private fun lerp(a: Float, b: Float, t: Float) = a + (b - a) * t
