//package com.cc.screens.fight
//
//import kotlin.random.Random
//
//// ── 技能定义 ──────────────────────────────────────────────────────────────────
//
//enum class SkillTarget { SINGLE_ENEMY, ALL_ENEMIES, SINGLE_ALLY, ALL_ALLIES }
//
//data class SkillDef(
//    val id: Int,
//    val name: String,
//    val mpCost: Int,
//    val target: SkillTarget,
//    /** 伤害/治疗基数（相对普攻倍率，治疗为负表示回血） */
//    val power: Float,
//    /** 是否有技能特效动画（id >= 10） */
//    val hasAnim: Boolean = true,
//)
//
//val SKILLS = listOf(
//    SkillDef(10, "火球术",   20, SkillTarget.SINGLE_ENEMY, 1.8f),
//    SkillDef(12, "冰霜箭",   18, SkillTarget.SINGLE_ENEMY, 1.6f),
//    SkillDef(13, "雷击",     25, SkillTarget.ALL_ENEMIES,  1.2f),
//    SkillDef(14, "烈焰风暴", 35, SkillTarget.ALL_ENEMIES,  1.0f),
//    SkillDef(16, "治愈术",   15, SkillTarget.SINGLE_ALLY, -1.5f),  // 治疗
//    SkillDef(20, "群体治愈", 30, SkillTarget.ALL_ALLIES,  -1.0f),  // 群治
//    SkillDef(22, "圣光",     28, SkillTarget.ALL_ENEMIES,  1.4f),
//)
//
//// ── 角色/宠物 数据 ────────────────────────────────────────────────────────────
//
//enum class UnitSide { PLAYER, ENEMY }
//enum class UnitType { ROLE, PET }
//
///** 对应 Java FightRoleData */
//data class FightUnit(
//    val id: Int,               // 战场位置 0-5
//    val side: UnitSide,
//    val type: UnitType,
//    val name: String,
//    val appearId: Int,         // 外观ID（用于拼动画资源名）
//    var hp: Int,
//    val maxHp: Int,
//    var mp: Int,
//    val maxMp: Int,
//    val atk: Int,              // 基础攻击力
//    val skills: List<SkillDef> = emptyList(),
//) {
//    val isAlive get() = hp > 0
//    val isDead  get() = hp <= 0
//}
//
//// ── 战斗动作（对应 Java ae/i 数据包） ─────────────────────────────────────────
//
//enum class ActionType {
//    NORMAL_ATTACK,   // 普通攻击
//    SKILL,           // 技能攻击/治疗
//    DEFEND,          // 防御
//    ESCAPE,          // 逃跑（演示用，本地直接失败）
//}
//
///** 单条行动结果，对应 Java ae[] */
//data class ActionResult(
//    val actor: FightUnit,
//    val actionType: ActionType,
//    val skill: SkillDef? = null,       // actionType==SKILL 时有值
//    val targets: List<FightUnit>,
//    /** targets[i] 对应的数值变化（正=伤害，负=治疗） */
//    val deltas: List<Int>,
//    val text: String,
//)
//
//// ── 战斗状态机 ────────────────────────────────────────────────────────────────
//
///** 对应 Java FightModel.f */
//enum class FightPhase {
//    PLAYER_CHOOSE,      // 等待玩家选择行动
//    SELECT_SKILL,       // 玩家选技能（弹出技能列表）
//    SELECT_TARGET,      // 玩家选择目标
//    SELECT_PET_SKILL,   // 宠物选技能
//    SELECT_PET_TARGET,  // 宠物选目标
//    ANIMATING,          // 双方动画播放中
//    ROUND_RESULT,       // 显示回合结算数字
//    ENEMY_TURN,         // 敌方自动行动
//    BattleEnd,         // 战斗结束
//}
//
//enum class MenuAction { ATTACK, DEFEND, SKILL, ITEM, ESCAPE }
//
///** 当前菜单光标，对应 Java FightModel.e */
//enum class TargetSide { ENEMY_SIDE, ALLY_SIDE }
//
//// ── 动画状态（对应 Java FightRoleData.k） ────────────────────────────────────
//
//enum class UnitAnimState { IDLE, ATTACK, HIT, DEAD }
//
///** 单个单位的运行时动画状态 */
//data class UnitAnimStatus(
//    var state: UnitAnimState = UnitAnimState.IDLE,
//    var stateTimer: Float = 0f,   // 当前状态已播放时长（秒）
//)
//
//// ── 技能特效（对应 Java SkillAnim） ──────────────────────────────────────────
//
///** 一个正在播放中的技能特效实例 */
//data class SkillAnimInst(
//    val skillId: Int,
//    /** 目标屏幕坐标列表（x, y），对应 Java framW/framH */
//    val targetPositions: List<Pair<Float, Float>>,
//    var timer: Float = 0f,
//    var finished: Boolean = false,
//)
//
//// ── 主战斗数据模型 ─────────────────────────────────────────────────────────────
//
//class FightModel {
//
//    // ── 初始化双方阵营（3人+3宠物 各6个单位）────────────────────────────────
//
//    val playerUnits: List<FightUnit> = listOf(
//        FightUnit(0, UnitSide.PLAYER, UnitType.ROLE, "玩家",  30, hp=120, maxHp=120, mp=80, maxMp=80, atk=28,
//            skills = listOf(SKILLS[0], SKILLS[2], SKILLS[5])),    // 火球、雷击、群治
//        FightUnit(1, UnitSide.PLAYER, UnitType.ROLE, "队友甲", 30, hp=100, maxHp=100, mp=60, maxMp=60, atk=22,
//            skills = listOf(SKILLS[1], SKILLS[4])),               // 冰霜、治愈
//        FightUnit(2, UnitSide.PLAYER, UnitType.ROLE, "队友乙", 30, hp=110, maxHp=110, mp=70, maxMp=70, atk=25,
//            skills = listOf(SKILLS[3], SKILLS[6])),               // 烈焰、圣光
//        FightUnit(3, UnitSide.PLAYER, UnitType.PET, "宠物·赤炎", 100, hp=80, maxHp=80,  mp=40, maxMp=40, atk=20,
//            skills = listOf(SKILLS[0])),
//        FightUnit(4, UnitSide.PLAYER, UnitType.PET, "宠物·玄冰", 102, hp=70, maxHp=70,  mp=50, maxMp=50, atk=18,
//            skills = listOf(SKILLS[1])),
//        FightUnit(5, UnitSide.PLAYER, UnitType.PET, "宠物·金雷", 103, hp=75, maxHp=75,  mp=45, maxMp=45, atk=22,
//            skills = listOf(SKILLS[2])),
//    )
//
//    val enemyUnits: List<FightUnit> = listOf(
//        FightUnit(0, UnitSide.ENEMY, UnitType.ROLE, "魔王",   31, hp=150, maxHp=150, mp=60, maxMp=60, atk=32,
//            skills = listOf(SKILLS[0], SKILLS[2])),
//        FightUnit(1, UnitSide.ENEMY, UnitType.ROLE, "术士",   31, hp=100, maxHp=100, mp=80, maxMp=80, atk=20,
//            skills = listOf(SKILLS[3])),
//        FightUnit(2, UnitSide.ENEMY, UnitType.ROLE, "战将",   31, hp=130, maxHp=130, mp=30, maxMp=30, atk=30),
//        FightUnit(3, UnitSide.ENEMY, UnitType.PET,  "魔犬",  104, hp=60,  maxHp=60,  mp=0,  maxMp=0,  atk=18),
//        FightUnit(4, UnitSide.ENEMY, UnitType.PET,  "飞鸦",  104, hp=55,  maxHp=55,  mp=0,  maxMp=0,  atk=16),
//        FightUnit(5, UnitSide.ENEMY, UnitType.PET,  "毒蛇",  104, hp=50,  maxHp=50,  mp=0,  maxMp=0,  atk=15),
//    )
//
//    // ── 状态 ──────────────────────────────────────────────────────────────────
//
//    var phase: FightPhase = FightPhase.PLAYER_CHOOSE
//    var selectedMenu: MenuAction = MenuAction.ATTACK
//    /** 当前操作的我方单位索引（对应 Java FightModel.h） */
//    var actingPlayerIdx: Int = 0
//    /** 当前选中目标索引（对应 Java FightModel.i/h） */
//    var selectedTargetIdx: Int = 0
//    var selectedSkill: SkillDef? = null
//
//    /** 当前回合所有行动结果队列（对应 Java v/w 队列） */
//    val roundResults: MutableList<ActionResult> = mutableListOf()
//    /** 当前正在展示的 ActionResult 索引 */
//    var currentResultIdx: Int = 0
//
//    /** 每个单位的动画状态（key = "side_id"） */
//    val animStates: Map<String, UnitAnimStatus> = buildMap {
//        playerUnits.forEach { put(unitKey(it), UnitAnimStatus()) }
//        enemyUnits.forEach  { put(unitKey(it), UnitAnimStatus()) }
//    }
//
//    /** 当前播放的技能特效（对应 Java skillAnim） */
//    var skillAnimInst: SkillAnimInst? = null
//
//    /** 浮动伤害数字列表（x,y,值,剩余显示时间） */
//    val floatNumbers: MutableList<FloatNumber> = mutableListOf()
//
//    /** 战斗日志 */
//    val battleLog: MutableList<String> = mutableListOf()
//
//    /** 战斗结果：null=进行中，true=我方胜，false=我方败 */
//    var battleResult: Boolean? = null
//
//    // ── 查询工具 ──────────────────────────────────────────────────────────────
//
//    fun unitKey(u: FightUnit) = "${u.side}_${u.id}"
//
//    fun animState(u: FightUnit) = animStates[unitKey(u)]!!
//
//    fun aliveEnemies() = enemyUnits.filter { it.isAlive }
//    fun alivePlayers() = playerUnits.filter { it.isAlive }
//    fun actingPlayer() = playerUnits[actingPlayerIdx]
//
//    // ── 玩家输入处理（对应 Java FightModel.a(int key)） ───────────────────────
//
//    fun onMenuSelect(action: MenuAction) {
//        if (phase != FightPhase.PLAYER_CHOOSE) return
//        selectedMenu = action
//        when (action) {
//            MenuAction.ATTACK  -> {
//                phase = FightPhase.SELECT_TARGET
//                selectedTargetIdx = 0
//            }
//            MenuAction.SKILL   -> {
//                if (actingPlayer().skills.isEmpty()) {
//                    battleLog.add("没有可用技能")
//                } else {
//                    phase = FightPhase.SELECT_SKILL
//                    selectedSkill = actingPlayer().skills.first()
//                }
//            }
//            MenuAction.DEFEND  -> commitAction(buildDefendAction())
//            MenuAction.ESCAPE  -> {
//                battleLog.add("无法逃跑！")
//            }
//            MenuAction.ITEM    -> battleLog.add("暂无道具")
//        }
//    }
//
//    fun onSkillSelect(skill: SkillDef) {
//        if (phase != FightPhase.SELECT_SKILL) return
//        val actor = actingPlayer()
//        if (actor.mp < skill.mpCost) {
//            battleLog.add("MP不足！")
//            return
//        }
//        selectedSkill = skill
//        when (skill.target) {
//            SkillTarget.SINGLE_ENEMY -> { phase = FightPhase.SELECT_TARGET; selectedTargetIdx = 0 }
//            SkillTarget.SINGLE_ALLY  -> { phase = FightPhase.SELECT_TARGET; selectedTargetIdx = 0 }
//            SkillTarget.ALL_ENEMIES,
//            SkillTarget.ALL_ALLIES   -> commitAction(buildSkillAction(actor, skill, emptyList()))
//        }
//    }
//
//    fun onTargetSelect(targetIdx: Int) {
//        if (phase != FightPhase.SELECT_TARGET) return
//        selectedTargetIdx = targetIdx
//    }
//
//    fun onConfirm() {
//        if (phase != FightPhase.SELECT_TARGET) return
//        val actor = actingPlayer()
//        when {
//            selectedMenu == MenuAction.ATTACK -> {
//                val target = aliveEnemies().getOrNull(selectedTargetIdx) ?: return
//                commitAction(buildNormalAttack(actor, target))
//            }
//            selectedMenu == MenuAction.SKILL  -> {
//                val skill = selectedSkill ?: return
//                val targets: List<FightUnit> = when (skill.target) {
//                    SkillTarget.SINGLE_ENEMY -> listOfNotNull(aliveEnemies().getOrNull(selectedTargetIdx))
//                    SkillTarget.SINGLE_ALLY  -> listOfNotNull(alivePlayers().getOrNull(selectedTargetIdx))
//                    else -> emptyList()
//                }
//                if (targets.isEmpty()) return
//                commitAction(buildSkillAction(actor, skill, targets))
//            }
//            else -> {}
//        }
//    }
//
//    fun onCancel() {
//        phase = when (phase) {
//            FightPhase.SELECT_TARGET -> if (selectedMenu == MenuAction.SKILL) FightPhase.SELECT_SKILL else FightPhase.PLAYER_CHOOSE
//            FightPhase.SELECT_SKILL  -> FightPhase.PLAYER_CHOOSE
//            else                     -> FightPhase.PLAYER_CHOOSE
//        }
//    }
//
//    // ── 构建行动 ──────────────────────────────────────────────────────────────
//
//    private fun buildNormalAttack(actor: FightUnit, target: FightUnit): ActionResult {
//        val dmg = calcDamage(actor.atk, 1.0f)
//        return ActionResult(actor, ActionType.NORMAL_ATTACK, null, listOf(target), listOf(dmg),
//            "${actor.name} 对 ${target.name} 发动普通攻击，造成 $dmg 点伤害")
//    }
//
//    private fun buildSkillAction(actor: FightUnit, skill: SkillDef, singleTargets: List<FightUnit>): ActionResult {
//        val targets: List<FightUnit> = when (skill.target) {
//            SkillTarget.ALL_ENEMIES  -> aliveEnemies()
//            SkillTarget.ALL_ALLIES   -> alivePlayers()
//            else                     -> singleTargets
//        }
//        val isHeal = skill.power < 0
//        val deltas = targets.map { t ->
//            if (isHeal) {
//                // 治疗：负数 delta 表示回血
//                -calcHeal(actor.atk, -skill.power)
//            } else {
//                calcDamage(actor.atk, skill.power)
//            }
//        }
//        val verb = if (isHeal) "治疗了" else "对"
//        val targetNames = targets.joinToString("、") { it.name }
//        val valStr = deltas.first().let { if (it < 0) "回复 ${-it}" else "造成 $it 伤害" }
//        return ActionResult(actor, ActionType.SKILL, skill, targets, deltas,
//            "${actor.name} 使用 ${skill.name}，$verb $targetNames，$valStr")
//    }
//
//    private fun buildDefendAction(): ActionResult {
//        val actor = actingPlayer()
//        return ActionResult(actor, ActionType.DEFEND, null, listOf(actor), listOf(0),
//            "${actor.name} 进入防御状态")
//    }
//
//    private fun calcDamage(atk: Int, power: Float): Int {
//        val base = (atk * power).toInt()
//        return (base * (0.85f + Random.nextFloat() * 0.3f)).toInt().coerceAtLeast(1)
//    }
//
//    private fun calcHeal(atk: Int, power: Float): Int {
//        val base = (atk * power * 1.2f).toInt()
//        return (base * (0.9f + Random.nextFloat() * 0.2f)).toInt().coerceAtLeast(1)
//    }
//
//    // ── 提交行动 → 触发动画阶段 ──────────────────────────────────────────────
//
//    private fun commitAction(result: ActionResult) {
//        roundResults.clear()
//        roundResults.add(result)
//        // 触发施法者攻击动画
//        animState(result.actor).apply { state = UnitAnimState.ATTACK; stateTimer = 0f }
//        phase = FightPhase.ANIMATING
//        currentResultIdx = 0
//    }
//
//    // ── 帧驱动（对应 Java FightModel.a(int) 的帧循环） ────────────────────────
//
//    // 各阶段动画时长（秒）
//    private val ATTACK_ANIM_DURATION = 0.6f
//    private val SKILL_ANIM_DURATION  = 0.8f
//    private val HIT_ANIM_DURATION    = 0.5f
//    private val NUMBER_FLOAT_DURATION = 1.2f
//
//    fun update(delta: Float) {
//        updateFloatNumbers(delta)
//        updateUnitAnimStates(delta)
//
//        when (phase) {
//            FightPhase.ANIMATING     -> updateAnimating(delta)
//            FightPhase.ROUND_RESULT  -> updateRoundResult(delta)
//            FightPhase.ENEMY_TURN    -> updateEnemyTurn()
//            else -> {}
//        }
//    }
//
//    private fun updateUnitAnimStates(delta: Float) {
//        for (status in animStates.values) {
//            if (status.state == UnitAnimState.IDLE) continue
//            status.stateTimer += delta
//            val duration = when (status.state) {
//                UnitAnimState.ATTACK -> ATTACK_ANIM_DURATION
//                UnitAnimState.HIT    -> HIT_ANIM_DURATION
//                else                 -> Float.MAX_VALUE
//            }
//            if (status.stateTimer >= duration) {
//                status.state = UnitAnimState.IDLE
//                status.stateTimer = 0f
//            }
//        }
//    }
//
//    /**
//     * ANIMATING 阶段：
//     *  - 等施法者攻击动画播完
//     *  - 若有技能特效则播特效（对应 Java f=5）
//     *  - 然后触发受击动画 + 应用数值 → 进入 ROUND_RESULT
//     */
//    private fun updateAnimating(delta: Float) {
//        val result = roundResults.getOrNull(currentResultIdx) ?: run {
//            enterEnemyTurn(); return
//        }
//        val actorStatus = animState(result.actor)
//
//        // 1. 施法者攻击动画还在播
//        if (actorStatus.state == UnitAnimState.ATTACK) return
//
//        // 2. 技能特效阶段
//        val inst = skillAnimInst
//        if (inst != null) {
//            inst.timer += delta
//            if (inst.timer < SKILL_ANIM_DURATION) return
//            inst.finished = true
//            skillAnimInst = null
//        }
//
//        // 3. 施法者动画播完 & 特效结束 → 应用数值，触发受击
//        applyResult(result)
//        phase = FightPhase.ROUND_RESULT
//    }
//
//    private fun applyResult(result: ActionResult) {
//        // 扣 MP
//        if (result.actionType == ActionType.SKILL) {
//            result.actor.mp = (result.actor.mp - (result.skill?.mpCost ?: 0)).coerceAtLeast(0)
//        }
//        // 应用每个目标的 delta
//        result.targets.zip(result.deltas).forEach { (target, delta) ->
//            if (delta > 0) {
//                // 伤害
//                target.hp = (target.hp - delta).coerceAtLeast(0)
//                animState(target).apply { state = UnitAnimState.HIT; stateTimer = 0f }
//                if (target.isDead) animState(target).state = UnitAnimState.DEAD
//                // 生成浮动伤害数字（由 FightScreen 根据位置转成屏幕坐标）
//                floatNumbers.add(FloatNumber(targetKey = unitKey(target), value = -delta,
//                    timer = NUMBER_FLOAT_DURATION))
//            } else {
//                // 治疗
//                target.hp = (target.hp - delta).coerceAtMost(target.maxHp)
//                floatNumbers.add(FloatNumber(targetKey = unitKey(target), value = -delta,
//                    timer = NUMBER_FLOAT_DURATION))
//            }
//        }
//        battleLog.add(result.text)
//    }
//
//    /** ROUND_RESULT：等受击动画 + 数字浮动完，再判断是否还有下一条结果或进入敌方回合 */
//    private fun updateRoundResult(delta: Float) {
//        val allHitDone = animStates.values.none { it.state == UnitAnimState.HIT }
//        val allNumDone = floatNumbers.isEmpty()
//        if (!allHitDone || !allNumDone) return
//
//        currentResultIdx++
//        if (currentResultIdx < roundResults.size) {
//            // 还有更多结果（多目标分条显示）
//            phase = FightPhase.ANIMATING
//        } else {
//            enterEnemyTurn()
//        }
//    }
//
//    // ── 敌方自动行动（简单 AI） ───────────────────────────────────────────────
//
//    private fun enterEnemyTurn() {
//        if (checkBattleEnd()) return
//        phase = FightPhase.ENEMY_TURN
//    }
//
//    private fun updateEnemyTurn() {
//        val enemies = aliveEnemies()
//        if (enemies.isEmpty()) { checkBattleEnd(); return }
//
//        roundResults.clear()
//        for (enemy in enemies) {
//            val action = decideEnemyAction(enemy) ?: continue
//            roundResults.add(action)
//            applyResult(action)
//        }
//
//        battleLog.add("── 敌方回合结束 ──")
//        if (checkBattleEnd()) return
//
//        // 推进到下一个存活我方角色
//        advanceActingPlayer()
//        phase = FightPhase.PLAYER_CHOOSE
//    }
//
//    private fun decideEnemyAction(enemy: FightUnit): ActionResult? {
//        val players = alivePlayers()
//        if (players.isEmpty()) return null
//
//        // 有技能且有MP时 30% 概率使用技能
//        val usableSkills = enemy.skills.filter { it.mpCost <= enemy.mp && it.power > 0 }
//        if (usableSkills.isNotEmpty() && Random.nextFloat() < 0.3f) {
//            val skill = usableSkills.random()
//            val targets: List<FightUnit> = when (skill.target) {
//                SkillTarget.ALL_ENEMIES  -> players          // 敌方视角的"enemies"=我方
//                SkillTarget.SINGLE_ENEMY -> listOf(players.random())
//                else                     -> emptyList()
//            }
//            if (targets.isNotEmpty()) return buildSkillAction(enemy, skill, targets)
//        }
//        // 普通攻击随机一个存活目标
//        val target = players.random()
//        return buildNormalAttack(enemy, target)
//    }
//
//    private fun advanceActingPlayer() {
//        val alive = playerUnits.indices.filter { playerUnits[it].isAlive }
//        if (alive.isEmpty()) return
//        val next = alive.firstOrNull { it > actingPlayerIdx } ?: alive.first()
//        actingPlayerIdx = next
//    }
//
//    // ── 战斗结束检测 ─────────────────────────────────────────────────────────
//
//    private fun checkBattleEnd(): Boolean {
//        return when {
//            aliveEnemies().isEmpty() -> {
//                battleResult = true
//                battleLog.add("战斗胜利！")
//                phase = FightPhase.BattleEnd
//                true
//            }
//            alivePlayers().isEmpty() -> {
//                battleResult = false
//                battleLog.add("战斗失败...")
//                phase = FightPhase.BattleEnd
//                true
//            }
//            else -> false
//        }
//    }
//
//    // ── 技能特效创建（对应 Java FightModel.o() 中 new SkillAnim(...)） ────────
//
//    /**
//     * 由 FightScreen 在施法者攻击动画开始时调用，传入目标的屏幕坐标。
//     * 只有技能 id >= 10 才创建（对应 Java 中 ae.e >= 10 的判断）。
//     */
//    fun createSkillAnim(skill: SkillDef, targetPositions: List<Pair<Float, Float>>) {
//        if (skill.id < 10) return
//        skillAnimInst = SkillAnimInst(skill.id, targetPositions)
//    }
//}
//
//// ── 浮动数字 ──────────────────────────────────────────────────────────────────
//
//data class FloatNumber(
//    val targetKey: String,
//    val value: Int,       // 正=治疗（绿），负=伤害（红/白）
//    var timer: Float,
//    var offsetY: Float = 0f,
//)
//
//private fun FightModel.updateFloatNumbers(delta: Float) {
//    val iter = floatNumbers.iterator()
//    while (iter.hasNext()) {
//        val n = iter.next()
//        n.timer -= delta
//        n.offsetY += delta * 20f
//        if (n.timer <= 0f) iter.remove()
//    }
//}
