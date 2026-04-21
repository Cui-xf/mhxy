package com.cc.screens.fight

import com.badlogic.gdx.Gdx
import com.badlogic.gdx.graphics.Color
import com.badlogic.gdx.graphics.GL20
import com.badlogic.gdx.graphics.Texture
import com.badlogic.gdx.graphics.g2d.TextureRegion
import com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType
import com.cc.FontManager
import com.cc.MhxyGame
import com.cc.asset.AssetManagerFactory.PUBLIC_ASSET
import com.cc.asset.RpgAnimation
import com.cc.event.TouchContext
import com.cc.render.*
import com.cc.screens.AbstractScreen

/**
 * 战斗场景 - 参照原 Java 版 FightModel + GameSceneController 实现
 *
 * 坐标系：左上角 (0,0)，x 向右，y 向下，虚拟分辨率 240×320
 *
 * 资源命名规则（已由 resolve_fight_assets.py 还原）：
 *   role:     f{id}0{dir}{action}.anim   dir=1朝左; action 1=待机 2=攻击
 *   petfight: {id}{action}.anim          action 1=待机 2=攻击 3=受击
 *   skill:    {skillId}.anim             id>=10 才有特效
 */
class FightScreen(
    private val backGround: TextureRegion
) : AbstractScreen() {

    private val fightBgTexture = autoDispose { Texture(Gdx.files.classpath("assets/fightBG.png")) }

    // ── 角色动画（role 目录，f{id}0{dir}{action}.anim） ──────────────────────
    // id=30：我方角色外观；id=31：敌方角色外观
    private val roleIdleAnim by resource(PUBLIC_ASSET, "rpg/role/f30011.anim", RpgAnimation::class) // 我方待机
    private val roleAttackAnim by resource(PUBLIC_ASSET, "rpg/role/f30012.anim", RpgAnimation::class) // 我方攻击
    private val enemyIdleAnim by resource(PUBLIC_ASSET, "rpg/role/f31011.anim", RpgAnimation::class) // 敌方待机
    private val enemyAttackAnim by resource(PUBLIC_ASSET, "rpg/role/f31012.anim", RpgAnimation::class) // 敌方攻击

    // ── 宠物动画（petfight 目录，{id}{action}.anim） ─────────────────────────
    // 我方宠物 id=100/102/103；敌方宠物 id=104
    private val pet100IdleAnim by resource(PUBLIC_ASSET, "rpg/petfight/1001.anim", RpgAnimation::class)
    private val pet100AttackAnim by resource(PUBLIC_ASSET, "rpg/petfight/1002.anim", RpgAnimation::class)
    private val pet100HitAnim by resource(PUBLIC_ASSET, "rpg/petfight/1003.anim", RpgAnimation::class)
    private val pet102IdleAnim by resource(PUBLIC_ASSET, "rpg/petfight/1021.anim", RpgAnimation::class)
    private val pet102AttackAnim by resource(PUBLIC_ASSET, "rpg/petfight/1022.anim", RpgAnimation::class)
    private val pet102HitAnim by resource(PUBLIC_ASSET, "rpg/petfight/1023.anim", RpgAnimation::class)
    private val pet103IdleAnim by resource(PUBLIC_ASSET, "rpg/petfight/1031.anim", RpgAnimation::class)
    private val pet103AttackAnim by resource(PUBLIC_ASSET, "rpg/petfight/1032.anim", RpgAnimation::class)
    private val pet103HitAnim by resource(PUBLIC_ASSET, "rpg/petfight/1033.anim", RpgAnimation::class)
    private val pet104IdleAnim by resource(PUBLIC_ASSET, "rpg/petfight/1041.anim", RpgAnimation::class)
    private val pet104AttackAnim by resource(PUBLIC_ASSET, "rpg/petfight/1042.anim", RpgAnimation::class)
    private val pet104HitAnim by resource(PUBLIC_ASSET, "rpg/petfight/1043.anim", RpgAnimation::class)

    // ── 技能特效动画（skill 目录） ────────────────────────────────────────────
    private val skillAnim10 by resource(PUBLIC_ASSET, "rpg/skill/10.anim", RpgAnimation::class)
    private val skillAnim12 by resource(PUBLIC_ASSET, "rpg/skill/12.anim", RpgAnimation::class)
    private val skillAnim13 by resource(PUBLIC_ASSET, "rpg/skill/13.anim", RpgAnimation::class)
    private val skillAnim14 by resource(PUBLIC_ASSET, "rpg/skill/14.anim", RpgAnimation::class)
    private val skillAnim16 by resource(PUBLIC_ASSET, "rpg/skill/16.anim", RpgAnimation::class)
    private val skillAnim20 by resource(PUBLIC_ASSET, "rpg/skill/20.anim", RpgAnimation::class)
    private val skillAnim22 by resource(PUBLIC_ASSET, "rpg/skill/22.anim", RpgAnimation::class)
    private val deadAnim by resource(PUBLIC_ASSET, "rpg/skill/dead.anim", RpgAnimation::class)
    private val defenceAnim by resource(PUBLIC_ASSET, "rpg/skill/defence.anim", RpgAnimation::class)

    // ── UI 资源 ───────────────────────────────────────────────────────────────
    private val rim by resource(PUBLIC_ASSET, "rpg/publicUI/rim.pic", TextureRegion::class)
    private val goods by resource(PUBLIC_ASSET, "rpg/publicUI/goods.pic", TextureRegion::class)
    private val num by resource(PUBLIC_ASSET, "rpg/publicUI/num.pic", TextureRegion::class)
    private val slotIcon by resource(PUBLIC_ASSET, "rpg/icon/1606.pic", TextureRegion::class)
    private val fighticon by resource(PUBLIC_ASSET, "rpg/ui/fighticon.pic", TextureRegion::class)
    private val fightMenuPic by resource(PUBLIC_ASSET, "rpg/publicUI/49_983005409.pic", TextureRegion::class)
    private val buttonBack by resource(PUBLIC_ASSET, "rpg/publicUI/button_back.pic", TextureRegion::class)

    // ── 战斗数据模型 ──────────────────────────────────────────────────────────
    private val model = FightModel()

    // ── 动画计时器（单位：秒）─────────────────────────────────────────────────
    private var animTime = 0f

    // ── 布局常量（与原 Java 版对应） ─────────────────────────────────────────
    private val ACTION_BTN_X = 0f
    private val ACTION_BTN_Y0 = 320f - 102f   // = 218f
    private val ACTION_BTN_H = 16f
    private val ACTION_BTN_W = 26f

    private val SKILL_BAR_Y = 320f - 22f   // = 298f
    private val SKILL_SLOT_W = 17f
    private val SKILL_BAR_SLOTS = 10

    private val BACK_BTN_W = 37f
    private val BACK_BTN_H = 20f
    private val BACK_BTN_X = VIRTUAL_W - BACK_BTN_W
    private val BACK_BTN_Y = VIRTUAL_H - BACK_BTN_H

    // 战场6个位置坐标（对应 GlobalConfig.Q 我方 / GlobalConfig.R 敌方）
    private val PLAYER_POS = Array(6) { i -> playerPos(i) }
    private val ENEMY_POS = Array(6) { i -> enemyPos(i) }

    // ── 技能列表弹窗滚动 ──────────────────────────────────────────────────────
    private var skillListScroll = 0

    // ── 技能列表触摸区域 ──────────────────────────────────────────────────────
    private val SKILL_LIST_X = 30f
    private val SKILL_LIST_Y = 80f
    private val SKILL_LIST_W = 180f
    private val SKILL_LIST_ROW_H = 18f

    // ── 目标选择光标渲染计时 ──────────────────────────────────────────────────
    private var cursorBlink = 0f

    // ─────────────────────────────────────────────────────────────────────────

    override fun update(delta: Float) {
        animTime += delta
        cursorBlink += delta
        model.update(delta)
        handleInput()
        render()
    }

    // ── 输入处理 ──────────────────────────────────────────────────────────────

    private fun handleInput() {
        if (!TouchContext.justTouched) return
        val tx = TouchContext.touchX
        val ty = TouchContext.touchY

        // 返回按钮
        if (tx >= BACK_BTN_X && ty >= BACK_BTN_Y) {
            MhxyGame.setScreen(com.cc.screens.game.GameScreen())
            return
        }

        when (model.phase) {
            FightPhase.PLAYER_CHOOSE -> handleMenuInput(tx, ty)
            FightPhase.SELECT_TARGET -> handleTargetInput(tx, ty)
            FightPhase.SELECT_SKILL -> handleSkillListInput(tx, ty)
            FightPhase.BATTLE_END -> MhxyGame.setScreen(com.cc.screens.game.GameScreen())
            else -> {}
        }
    }

    private fun handleMenuInput(tx: Float, ty: Float) {
        for (i in 0 until 5) {
            val btnY = ACTION_BTN_Y0 + i * ACTION_BTN_H
            if (tx <= ACTION_BTN_X + ACTION_BTN_W && ty >= btnY && ty <= btnY + ACTION_BTN_H) {
                model.onMenuSelect(MenuAction.entries[i])
                return
            }
        }
        // 技能快捷栏直接触发技能
        for (i in 0 until SKILL_BAR_SLOTS) {
            val slotX = 2f + i * SKILL_SLOT_W
            if (tx >= slotX && tx <= slotX + SKILL_SLOT_W && ty >= SKILL_BAR_Y && ty <= SKILL_BAR_Y + 17f) {
                val skill = model.actingPlayer().skills.getOrNull(i) ?: return
                model.onMenuSelect(MenuAction.SKILL)
                if (model.phase == FightPhase.SELECT_SKILL) model.onSkillSelect(skill)
                return
            }
        }
    }

    private fun handleTargetInput(tx: Float, ty: Float) {
        // 取消
        if (tx >= BACK_BTN_X - 40f && tx < BACK_BTN_X && ty >= BACK_BTN_Y) {
            model.onCancel(); return
        }
        // 点击目标角色
        val targets = when {
            model.selectedMenu == MenuAction.ATTACK -> model.aliveEnemies()
            model.selectedSkill?.target == SkillTarget.SINGLE_ALLY -> model.alivePlayers()
            else -> model.aliveEnemies()
        }
        targets.forEachIndexed { idx, unit ->
            val pos = if (unit.side == UnitSide.ENEMY) ENEMY_POS[unit.id] else PLAYER_POS[unit.id]
            if (tx >= pos.first - 16 && tx <= pos.first + 16 && ty >= pos.second - 24 && ty <= pos.second + 8) {
                model.onTargetSelect(idx)
                model.onConfirm()
                // 收到行动后立即触发技能特效坐标
                startSkillAnimIfNeeded()
                return
            }
        }
        // 点击确认键（按钮区域外点击当前高亮目标）
        if (ty > ACTION_BTN_Y0 + 5 * ACTION_BTN_H) {
            model.onConfirm()
            startSkillAnimIfNeeded()
        }
    }

    private fun handleSkillListInput(tx: Float, ty: Float) {
        if (tx < SKILL_LIST_X || tx > SKILL_LIST_X + SKILL_LIST_W) {
            model.onCancel(); return
        }
        val skills = model.actingPlayer().skills
        skills.forEachIndexed { idx, skill ->
            val rowY = SKILL_LIST_Y + idx * SKILL_LIST_ROW_H
            if (ty >= rowY && ty <= rowY + SKILL_LIST_ROW_H) {
                model.onSkillSelect(skill)
                startSkillAnimIfNeeded()
                return
            }
        }
    }

    /** 若刚提交了技能行动，立即创建特效动画实例（传入目标屏幕坐标） */
    private fun startSkillAnimIfNeeded() {
        val skill = model.selectedSkill ?: return
        if (model.phase != FightPhase.ANIMATING) return
        val result = model.roundResults.firstOrNull() ?: return
        if (result.actionType != ActionType.SKILL) return
        val positions = result.targets.map { t ->
            if (t.side == UnitSide.ENEMY) ENEMY_POS[t.id] else PLAYER_POS[t.id]
        }
        model.createSkillAnim(skill, positions)
    }

    // ── 渲染总入口 ────────────────────────────────────────────────────────────

    private fun render() {
        drawBackground()
        drawAllUnits()
        drawHpBars()
        drawSkillAnimEffect()
        drawFloatNumbers()
        drawActionButtons()
        drawActionLabel()
        drawSkillBar()
        drawReturnButton()
        drawTargetCursor()
        drawSkillListPopup()
        drawBattleLog()
        drawBattleEndOverlay()
    }

    // ── 背景 ──────────────────────────────────────────────────────────────────

    private fun drawBackground() {
        batch.begin()
        batch.drawImage(backGround, 0f, 0f, align = Align.LEFT_TOP)
        batch.drawImage(
            fightBgTexture, VIRTUAL_W / 2, (VIRTUAL_H - fightBgTexture.height) / 2,
            align = Align.CENTER_TOP
        )
        batch.end()
        Gdx.gl.glEnable(GL20.GL_BLEND)
        Gdx.gl.glBlendFunc(GL20.GL_SRC_ALPHA, GL20.GL_ONE_MINUS_SRC_ALPHA)
        sr.begin(ShapeType.Filled)
        sr.color = Color(0f, 0f, 0f, 0.55f)
        sr.rect(0f, 0f, VIRTUAL_W, VIRTUAL_H)
        sr.end()
        Gdx.gl.glDisable(GL20.GL_BLEND)
    }

    // ── 绘制所有战斗单位 ──────────────────────────────────────────────────────

    private fun drawAllUnits() {
        batch.begin()
        model.enemyUnits.forEach { drawUnit(it) }
        model.playerUnits.forEach { drawUnit(it) }
        batch.end()
    }

    private fun drawUnit(unit: FightUnit) {
        if (unit.isDead) return
        val pos = if (unit.side == UnitSide.ENEMY) ENEMY_POS[unit.id] else PLAYER_POS[unit.id]
        val status = model.animState(unit)
        val anim = resolveAnim(unit, status.state)
        val frames = anim.getKeyFrame(animTime, true)
        batch.drawAnimation(frames, pos.first, pos.second)
    }

    /** 根据单位外观 ID 和动画状态选取对应 RpgAnimation */
    private fun resolveAnim(unit: FightUnit, state: UnitAnimState): RpgAnimation {
        return when (unit.type) {
            UnitType.ROLE -> when (unit.side) {
                UnitSide.PLAYER -> if (state == UnitAnimState.ATTACK) roleAttackAnim else deadAnim
                UnitSide.ENEMY -> if (state == UnitAnimState.ATTACK) enemyAttackAnim else enemyIdleAnim
            }

            UnitType.PET -> when (unit.appearId) {
                100 -> when (state) {
                    UnitAnimState.ATTACK -> pet100AttackAnim
                    UnitAnimState.HIT -> pet100HitAnim
                    else -> pet100IdleAnim
                }

                102 -> when (state) {
                    UnitAnimState.ATTACK -> pet102AttackAnim
                    UnitAnimState.HIT -> pet102HitAnim
                    else -> pet102IdleAnim
                }

                103 -> when (state) {
                    UnitAnimState.ATTACK -> pet103AttackAnim
                    UnitAnimState.HIT -> pet103HitAnim
                    else -> pet103IdleAnim
                }

                else -> when (state) {  // 104 及其他
                    UnitAnimState.ATTACK -> pet104AttackAnim
                    UnitAnimState.HIT -> pet104HitAnim
                    else -> pet104IdleAnim
                }
            }
        }
    }

    // ── HP/MP 血条 ────────────────────────────────────────────────────────────

    private fun drawHpBars() {
        val offY = -42
        sr.begin(ShapeType.Filled)
        model.enemyUnits.forEach { u ->
            if (u.isDead) return@forEach
            val (x, y) = ENEMY_POS[u.id]
            drawBar(x, y + offY, u.hp.toFloat() / u.maxHp, 16711680.toColor(), 10945027.toColor())
        }
        model.playerUnits.forEach { u ->
            if (u.isDead) return@forEach
            val (x, y) = PLAYER_POS[u.id]
            drawBar(x, y + offY - 5, u.hp.toFloat() / u.maxHp, 16711680.toColor(), 10945027.toColor())
            drawBar(x, y + offY, u.mp.toFloat() / u.maxMp, 48127.toColor(), 230064.toColor())
        }
        sr.end()
        batch.begin()
        model.enemyUnits.forEach { u ->
            if (u.isDead) return@forEach
            val (x, y) = ENEMY_POS[u.id]; batch.drawImage(rim, x, y + offY)
        }
        model.playerUnits.forEach { u ->
            if (u.isDead) return@forEach
            val (x, y) = PLAYER_POS[u.id]
            batch.drawImage(rim, x, y + offY - 5)
            batch.drawImage(rim, x, y + offY)
        }
        // 当前行动角色的选中光圈
        val actor = model.actingPlayer()
        if (actor.isAlive) drawSelectAperture(PLAYER_POS[actor.id])
        batch.end()
    }

    private fun drawSelectAperture(pos: Pair<Float, Float>) {
        sr.begin(ShapeType.Line)
        sr.color = Color.valueOf("4fc3f7ff")
        val cx = pos.first - 12f
        val cy = VIRTUAL_H - pos.second - 5f
        sr.ellipse(cx, cy, 24f, 10f)
        sr.end()
    }

    private fun drawBar(x: Float, y: Float, value: Float, color1: Color, color2: Color) {
        val w = 20f
        val fill = (value * 19f).coerceIn(0f, 19f)
        sr.drawRect(16777215.toColor(), x - w / 2 + 1f, y + 1f, w, 2f, Align.LEFT_TOP)
        sr.drawRect(color1, x - w / 2 + 1f, y + 1f, fill, 2f, Align.LEFT_TOP)
        sr.drawRect(color2, x - w / 2 + 1f, y + 2f, fill, 1f, Align.LEFT_TOP)
    }

    // ── 技能特效绘制（对应 Java FightModel f=5 / SkillAnim.a()） ─────────────

    private fun drawSkillAnimEffect() {
        val inst = model.skillAnimInst ?: return
        val anim = resolveSkillAnim(inst.skillId) ?: return
        val frames = anim.getKeyFrame(inst.timer, false)
        batch.begin()
        for ((x, y) in inst.targetPositions) {
            batch.drawAnimation(frames, x, y)
        }
        batch.end()
    }

    private fun resolveSkillAnim(id: Int): RpgAnimation? = when (id) {
        10 -> skillAnim10
        12 -> skillAnim12
        13 -> skillAnim13
        14 -> skillAnim14
        16 -> skillAnim16
        20 -> skillAnim20
        22 -> skillAnim22
        else -> skillAnim10  // 默认回退到 id=10
    }

    // ── 浮动伤害/治疗数字 ─────────────────────────────────────────────────────

    private fun drawFloatNumbers() {
        val font = FontManager.SMALL_FONT
        batch.begin()
        for (fn in model.floatNumbers) {
            val unit = (model.playerUnits + model.enemyUnits).firstOrNull {
                model.unitKey(it) == fn.targetKey
            } ?: continue
            val pos = if (unit.side == UnitSide.ENEMY) ENEMY_POS[unit.id] else PLAYER_POS[unit.id]
            val x = pos.first
            val y = pos.second - fn.offsetY - 30f
            val alpha = (fn.timer / 1.2f).coerceIn(0f, 1f)
            if (fn.value > 0) {
                // 治疗：绿色
                batch.wordArtString(
                    font, "+${fn.value}", Color(0f, 0f, 0f, alpha),
                    Color(0.2f, 1f, 0.2f, alpha), x, y
                )
            } else {
                // 伤害：白/红
                batch.wordArtString(
                    font, "${fn.value}", Color(0f, 0f, 0f, alpha),
                    Color(1f, 0.9f, 0.1f, alpha), x, y
                )
            }
        }
        batch.end()
    }

    // ── 行动菜单按钮（左侧5个） ───────────────────────────────────────────────

    private val menuLabels = arrayOf("攻击", "防御", "技能", "道具", "逃跑")
    private val selectedMenuIdx get() = model.selectedMenu.ordinal

    private fun drawActionButtons() {
        val fightMenuTex = fightMenuPic.texture
        batch.begin()
        for (i in 0 until 5) {
            val btnY = ACTION_BTN_Y0 + i * ACTION_BTN_H
            val srcX = fightMenuPic.regionX + i * 26
            val region = TextureRegion(fightMenuTex, srcX, fightMenuPic.regionY, 26, 16)
            batch.drawImage(region, ACTION_BTN_X, btnY, align = Align.LEFT_TOP)
        }
        batch.end()
        sr.begin(ShapeType.Filled)
        val selY = ACTION_BTN_Y0 + selectedMenuIdx * ACTION_BTN_H
        sr.drawRectBorder(Color.RED, ACTION_BTN_X, selY, ACTION_BTN_W, ACTION_BTN_H, Align.LEFT_TOP)
        sr.end()
    }

    private fun drawActionLabel() {
        if (model.phase == FightPhase.ANIMATING || model.phase == FightPhase.ROUND_RESULT) return
        val font = FontManager.SMALL_FONT
        val text = menuLabels[selectedMenuIdx]
        batch.begin()
        batch.wordArtString(
            font, text, Color.BLACK, Color.YELLOW,
            VIRTUAL_W / 2f, VIRTUAL_H - 22f - font.lineHeight
        )
        batch.end()
    }

    // ── 技能快捷栏（底部）────────────────────────────────────────────────────

    private fun drawSkillBar() {
        val barX = 0f;
        val barY = SKILL_BAR_Y
        batch.begin()
        for (i in 0 until SKILL_BAR_SLOTS) {
            val slotX = barX + 2f + i * 17f
            batch.drawImage(goods, slotX, barY + 2f, align = Align.LEFT_TOP)
            val skill = model.actingPlayer().skills.getOrNull(i)
            if (skill != null) {
                batch.drawImage(slotIcon, slotX + 1f, barY + 3f, align = Align.LEFT_TOP)
            }
            if (i < 8) {
                val numRegion = TextureRegion(num.texture, (i + 1) * 3, 0, 3, 5)
                batch.drawImage(numRegion, slotX, barY + 3f, align = Align.LEFT_TOP)
            } else {
                val iconX = if (i == 8) 0 else 16
                val fr = TextureRegion(fighticon.texture, fighticon.regionX + iconX, fighticon.regionY, 16, 16)
                batch.drawImage(fr, slotX + 1f, barY + 3f, align = Align.LEFT_TOP)
            }
        }
        batch.end()
        sr.begin(ShapeType.Filled)
        sr.drawRectBorder(15975.toColor(), barX, barY, SKILL_BAR_SLOTS * 17f + 4f, 21f, Align.LEFT_TOP)
        sr.drawRectBorder(11267556.toColor(), barX + 1f, barY + 1f, SKILL_BAR_SLOTS * 17f + 2f, 19f, Align.LEFT_TOP)
        sr.end()
    }

    // ── 目标选择光标（闪烁红框）──────────────────────────────────────────────

    private fun drawTargetCursor() {
        if (model.phase != FightPhase.SELECT_TARGET) return
        if ((cursorBlink * 4).toInt() % 2 == 0) return  // 每 0.25s 闪烁

        val targets = when {
            model.selectedMenu == MenuAction.ATTACK -> model.aliveEnemies()
            model.selectedSkill?.target == SkillTarget.SINGLE_ALLY -> model.alivePlayers()
            else -> model.aliveEnemies()
        }
        val target = targets.getOrNull(model.selectedTargetIdx) ?: return
        val pos = if (target.side == UnitSide.ENEMY) ENEMY_POS[target.id] else PLAYER_POS[target.id]
        sr.begin(ShapeType.Filled)
        sr.drawRectBorder(Color.RED, pos.first - 14f, pos.second - 28f, 28f, 32f, Align.LEFT_TOP)
        sr.end()

        // 显示目标名称
        val font = FontManager.SMALL_FONT
        batch.begin()
        batch.wordArtString(
            font, target.name, Color.BLACK, Color.YELLOW,
            VIRTUAL_W / 2f, VIRTUAL_H - 22f - font.lineHeight
        )
        batch.end()
    }

    // ── 技能列表弹窗 ──────────────────────────────────────────────────────────

    private fun drawSkillListPopup() {
        if (model.phase != FightPhase.SELECT_SKILL) return
        val skills = model.actingPlayer().skills
        val font = FontManager.SMALL_FONT
        val totalH = skills.size * SKILL_LIST_ROW_H + 10f

        // 背景框
        sr.begin(ShapeType.Filled)
        sr.color = Color(0f, 0f, 0.1f, 0.9f)
        sr.rect(
            SKILL_LIST_X, VIRTUAL_H - SKILL_LIST_Y - totalH,
            SKILL_LIST_W, totalH
        )
        sr.end()
        sr.begin(ShapeType.Filled)
        sr.drawRectBorder(Color.CYAN, SKILL_LIST_X, SKILL_LIST_Y, SKILL_LIST_W, totalH, Align.LEFT_TOP)
        sr.end()

        // 高亮当前选中行
        val selIdx = skills.indexOf(model.selectedSkill)
        if (selIdx >= 0) {
            val selY = SKILL_LIST_Y + selIdx * SKILL_LIST_ROW_H
            sr.begin(ShapeType.Filled)
            sr.drawRect(
                Color(0.2f, 0.4f, 0.8f, 0.6f), SKILL_LIST_X + 1f, selY + 1f,
                SKILL_LIST_W - 2f, SKILL_LIST_ROW_H - 2f, Align.LEFT_TOP
            )
            sr.end()
        }

        batch.begin()
        skills.forEachIndexed { idx, skill ->
            val rowY = SKILL_LIST_Y + idx * SKILL_LIST_ROW_H + 3f
            val mpColor = if (model.actingPlayer().mp >= skill.mpCost) Color.WHITE else Color.GRAY
            batch.wordArtString(
                font, "${skill.name}  MP:${skill.mpCost}", Color.BLACK, mpColor,
                SKILL_LIST_X + 4f, rowY, Align.LEFT_TOP
            )
        }
        batch.end()
    }

    // ── 战斗日志（底部滚动文字，对应 Java FightModel.e(graphics)） ─────────────

    private fun drawBattleLog() {
        if (model.phase == FightPhase.PLAYER_CHOOSE ||
            model.phase == FightPhase.SELECT_SKILL ||
            model.phase == FightPhase.BATTLE_END
        ) return
        val font = FontManager.SMALL_FONT
        val logs = model.battleLog.takeLast(3)
        batch.begin()
        logs.forEachIndexed { i, text ->
            val y = 60f + (logs.size - 1 - i) * (font.lineHeight + 2f)
            batch.wordArtString(
                font, text, Color.BLACK, Color(1f, 0.95f, 0.7f, 1f),
                VIRTUAL_W / 2f, y
            )
        }
        batch.end()
    }

    // ── 战斗结束覆盖层 ────────────────────────────────────────────────────────

    private fun drawBattleEndOverlay() {
        if (model.phase != FightPhase.BATTLE_END) return
        Gdx.gl.glEnable(GL20.GL_BLEND)
        Gdx.gl.glBlendFunc(GL20.GL_SRC_ALPHA, GL20.GL_ONE_MINUS_SRC_ALPHA)
        sr.begin(ShapeType.Filled)
        sr.color = Color(0f, 0f, 0f, 0.6f)
        sr.rect(40f, VIRTUAL_H - 145f, 160f, 50f)
        sr.end()
        Gdx.gl.glDisable(GL20.GL_BLEND)
        val font = FontManager.SMALL_FONT
        val text = if (model.battleResult == true) "战斗胜利！" else "战斗失败..."
        val color = if (model.battleResult == true) Color.YELLOW else Color.RED
        batch.begin()
        batch.wordArtString(font, text, Color.BLACK, color, VIRTUAL_W / 2f, VIRTUAL_H / 2f - 10f)
        batch.wordArtString(font, "点击返回", Color.BLACK, Color.WHITE, VIRTUAL_W / 2f, VIRTUAL_H / 2f + 8f)
        batch.end()
    }

    // ── 返回按钮 ──────────────────────────────────────────────────────────────

    private fun drawReturnButton() {
        batch.begin()
        batch.drawImage(buttonBack, BACK_BTN_X, BACK_BTN_Y, align = Align.LEFT_TOP)
        batch.end()
    }

    // ── 位置坐标计算（对应 Java GlobalConfig.Q/R + FightModel.a() 初始化） ───

    private fun playerPos(index: Int): Pair<Float, Float> {
        val cx = 160f;
        val cy = 250f;
        val dx = 38f;
        val dy = 24f
        return when (index) {
            0 -> Pair(cx - dx * 2, cy)
            1 -> Pair(cx - dx, cy - dy)
            2 -> Pair(cx, cy - dy * 2)
            3 -> Pair(cx - dx, cy + dy)
            4 -> Pair(cx, cy)
            5 -> Pair(cx + dx, cy - dy)
            else -> Pair(cx, cy)
        }
    }

    private fun enemyPos(index: Int): Pair<Float, Float> {
        val cx = 90f;
        val cy = 110f;
        val dx = 34f;
        val dy = 20f
        return when (index) {
            0 -> Pair(cx - dx, cy + dy)
            1 -> Pair(cx, cy)
            2 -> Pair(cx + dx, cy - dy)
            3 -> Pair(cx - dx, cy - dy)
            4 -> Pair(cx, cy + dy)
            5 -> Pair(cx + dx, cy)
            else -> Pair(cx, cy)
        }
    }

    override fun dispose() {
        super.dispose()
        backGround.texture.dispose()
    }
}
