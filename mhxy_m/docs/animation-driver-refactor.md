# AnimationDriver 重构方案：可配置 Phase 管线

## 1. 问题分析

当前 `AnimationDriver` 将所有指令的播放流程硬编码为一条固定流水线：

```
MOVE_TO_TARGET → ATTACK → SKILL_EFFECT → MOVE_BACK → HIT
```

实际上不同指令的差异体现在两个维度：

| 维度 | 说明 |
|---|---|
| **流程不同** | 攻击走完整流程；防御可能只有一个环节；逃跑只播个动画 |
| **同名环节行为不同** | 同样是 SKILL_EFFECT，普攻/法术/道具的表现逻辑可能不一样 |

随着指令类型增多，`driveAnim()` 里的 `when` 分支会不断膨胀，且各环节内部也要按 action 类型做 `if/when` 判断，导致逻辑交织。

## 2. 设计思路

核心：**将"流程编排"从 AnimationDriver 中抽离，让每种指令自己定义要经历哪些阶段，以及每个阶段的具体行为。**

```
AnimationDriver 不再硬编码流程
    ↓
根据 RoleAction 类型，生成一个 PhaseHandler 列表
    ↓
AnimationDriver 只负责按顺序驱动 PhaseHandler
```

## 3. 接口定义

### 3.1 PhaseHandler

```kotlin
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
```

### 3.2 PhaseHandler 与 SkillEffect 组件的交互

`SkillEffectHandler` 需要挂起等待外部回调（SkillEffect 组件播完动画后通知）。做法：

```kotlin
class SkillEffectHandler(
    val skillId: Int,
    val targets: List<Role>,
) : PhaseHandler {
    var done = false
        private set

    /** SkillEffect 组件播完后调用此方法 */
    fun markDone() { done = true }

    override fun update(delta: Float, instr: RoleInstruction): Boolean = done
}
```

`SkillEffect` 组件不再调用 `driver.onSkillEffectDone()`，而是找到当前阶段的 `SkillEffectHandler` 并调用 `markDone()`：

```kotlin
// SkillEffect.render() 中
val handler = driver.currentHandler as? SkillEffectHandler ?: return
// ... 播放动画 ...
if (timer >= anim.animationDuration) {
    handler.markDone()
}
```

## 4. 具体 Handler 实现

### 4.1 移动到目标 (MoveToTargetHandler)

仅对近战攻击(Attack)有效，法术不需要移动。

```kotlin
class MoveToTargetHandler : PhaseHandler {
    private var srcStartX = 0f
    private var srcStartY = 0f
    private var srcEndX = 0f
    private var srcEndY = 0f
    private var timer = 0f

    override fun onEnter(instr: RoleInstruction) {
        val src = instr.src
        val target = (instr.action as RoleAction.TargetableAction).target[0]
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
```

### 4.2 攻击动画 (AttackAnimHandler)

播放攻击动画，结束后切 IDLE。

```kotlin
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
```

### 4.3 技能特效 (SkillEffectHandler)

挂起等待 SkillEffect 组件回调，见 3.2。

### 4.4 返回原位 (MoveBackHandler)

与 MoveToTargetHandler 配对，将角色移回原始位置。

```kotlin
class MoveBackHandler(
    private val startX: Float, // 从 MoveToTargetHandler 传入
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
```

### 4.5 受击 (HitHandler)

播放受击动画 + 应用伤害数值。

```kotlin
class HitHandler : PhaseHandler {
    private var timer = 0f
    private var applied = false

    override fun onEnter(instr: RoleInstruction) {
        val targets = (instr.action as RoleAction.TargetableAction).target
        targets.forEach { it.animState = RoleAnimState.HIT }
        timer = 0f
        applied = false
    }

    override fun update(delta: Float, instr: RoleInstruction): Boolean {
        timer += delta
        if (!applied) {
            applied = true
            val targets = (instr.action as RoleAction.TargetableAction).target
            targets.zip(instr.result!!).forEach { (role, result) ->
                when (result.field) {
                    Field.HP -> role.hp = (role.hp + result.value.toInt()).coerceIn(0, role.maxHp)
                    Field.MP -> role.mp = (role.mp + result.value.toInt()).coerceIn(0, role.maxMp)
                }
            }
        }
        return timer >= HIT_DURATION
    }

    override fun onExit(instr: RoleInstruction) {
        val targets = (instr.action as RoleAction.TargetableAction).target
        targets.forEach { it.animState = RoleAnimState.IDLE }
    }
}
```

### 4.6 防御 (DefendHandler)

原地播放防御姿态，持续一小段时间即可。

```kotlin
class DefendHandler : PhaseHandler {
    private var timer = 0f

    override fun update(delta: Float, instr: RoleInstruction): Boolean {
        timer += delta
        return timer >= DEFEND_DURATION
    }
}
```

## 5. 流程编排：工厂方法

根据指令类型组装不同的 Phase 流水线：

```kotlin
fun buildPhases(instr: RoleInstruction): List<PhaseHandler> {
    return when (val action = instr.action) {
        is RoleAction.Attack -> {
            val moveHandler = MoveToTargetHandler()
            listOfNotNull(
                moveHandler,
                AttackAnimHandler(),
                action.skillId?.let {
                    SkillEffectHandler(it, action.target)
                },
                MoveBackHandler(instr.src.posX, instr.src.posY),
                HitHandler(),
            )
        }
        is RoleAction.Magic -> listOfNotNull(
            AttackAnimHandler(),    // 原地施法动画（不移动）
            SkillEffectHandler(action.skill.id, action.target),
            HitHandler(),
        )
        is RoleAction.Defend -> listOf(
            DefendHandler(),
        )
        is RoleAction.Item -> listOf(
            AttackAnimHandler(),    // 使用道具动画
            HitHandler(),           // 显示治疗/恢复数字
        )
        is RoleAction.Escape -> listOf(
            // 未来可加 EscapeAnimHandler
        )
    }
}
```

**要点**：
- `listOfNotNull` 过滤掉 null，比如普攻没有 skillId 时跳过特效阶段
- 每种指令自由组合已有 Handler，无需修改 AnimationDriver
- 新增指令类型只需在此处加一个分支

## 6. AnimationDriver 改造

改造后只做顺序调度，不包含任何具体播放逻辑：

```kotlin
class AnimationDriver(
    private val instructions: List<Instruction>,
) {
    private var instrIndex = 0
    private var phases: List<PhaseHandler> = emptyList()
    private var phaseIndex = 0

    /** 暴露当前阶段的 Handler，供 SkillEffect 等外部组件交互 */
    val currentHandler: PhaseHandler? get() = phases.getOrNull(phaseIndex)

    fun update(delta: Float): Action? {
        if (instrIndex >= instructions.size) return AnimationDone

        return when (val instr = instructions[instrIndex]) {
            is FinishInstruction -> EndTheBattle
            is RoleInstruction -> drivePhases(delta, instr)
        }
    }

    private fun drivePhases(delta: Float, instr: RoleInstruction): Action? {
        // 首次进入该指令，构建 phase 列表
        if (phases.isEmpty()) {
            phases = buildPhases(instr)
            if (phases.isEmpty()) {
                // 该指令无任何阶段（如逃跑），直接跳过
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
        return if (instrIndex >= instructions.size) AnimationDone else null
    }
}
```

## 7. SkillEffect 组件适配

```kotlin
class SkillEffect(...) : UIComponent(assetLoader) {
    override fun render(..., delta: Float) {
        val driver = (fightModel.state as? Animating ?: return).driver
        val handler = driver.currentHandler as? SkillEffectHandler ?: return

        val anim = anims[handler.skillId - 990]?.value
            ?: anims[10]!!.value
        val frames = anim.getKeyFrame(timer, false)

        batch.begin()
        handler.targets.forEach {
            batch.drawAnimation(frames, it.posX, it.posY)
        }
        batch.end()

        if (timer >= anim.animationDuration) {
            handler.markDone()
        }
    }
}
```

## 8. Phase sealed interface 简化

重构后不再需要 `Phase` sealed interface 来标识当前阶段，因为 `currentHandler` 的类型本身就能表达当前处于哪个阶段。原有的 `Phase` 可以删除。

如果仍然需要在 UI 层判断当前阶段（例如渲染层根据阶段决定是否显示某些 UI），可以用 `is` 检查：

```kotlin
when (driver.currentHandler) {
    is SkillEffectHandler -> // 显示特效 UI
    is HitHandler -> // 显示伤害数字
    else -> {}
}
```

## 9. 对比

| 维度 | 改造前 | 改造后 |
|---|---|---|
| 新增指令类型 | 修改 `driveAnim` 所有 `when` 分支 | 在 `buildPhases` 加一个分支，组合已有 Handler |
| 同名环节不同行为 | 在环节内部按 action 类型 `if/when` | 直接用不同的 Handler 实现类 |
| 复用 | 逻辑散落在各 `when` 分支中 | Handler 天然可复用 |
| AnimationDriver 体积 | 随指令类型线性增长 | 固定不变，只做顺序调度 |
| SkillEffect 交互 | 通过 `driver.onSkillEffectDone()` | 通过 `handler.markDone()`，更清晰 |
