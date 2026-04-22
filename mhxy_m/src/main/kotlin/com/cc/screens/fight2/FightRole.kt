package com.cc.screens.fight2

import com.badlogic.gdx.graphics.Color
import com.badlogic.gdx.graphics.g2d.SpriteBatch
import com.badlogic.gdx.graphics.g2d.TextureRegion
import com.badlogic.gdx.graphics.glutils.ShapeRenderer
import com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType
import com.cc.asset.AssetLoader
import com.cc.asset.AssetManagerFactory.PUBLIC_ASSET
import com.cc.asset.Frame
import com.cc.asset.RpgAnimation
import com.cc.event.TouchContext
import com.cc.render.*
import com.cc.screens.fight2.model.*
import com.cc.ui.component.UIComponent

class FightRole(
    assetLoader: AssetLoader,
    private val fightModel: FightModel,
) : UIComponent(assetLoader) {
    private val res = loadRes()

    //血条装饰
    private val rim by resource(PUBLIC_ASSET, "rpg/publicUI/rim.pic", TextureRegion::class)

    //选择目标动画
    private val selectAnim by resource(PUBLIC_ASSET, "rpg/publicUI/select.anim", RpgAnimation::class)


    private var timer = 0f
    override fun render(
        batch: SpriteBatch,
        sr: ShapeRenderer,
        cx: Float,
        cy: Float,
        cw: Float,
        ch: Float,
        delta: Float
    ) {
        timer += delta

        //角色动画
        roleAnim(batch)
        drawHp(batch, sr)

        //选择目标
        val state = fightModel.state
        if (state is WaitSelectTarget) {
            selectTarget(batch, state)
        }
    }

    private fun roleAnim(batch: SpriteBatch) {
        batch.begin()
        fightModel.players.forEach {
            val (x, y) = it.getPos()
            batch.drawAnimation(it.getAnim(timer), x, y)
        }
        fightModel.enemy.forEach {
            val (x, y) = it.getPos()
            batch.drawAnimation(it.getAnim(timer), x, y)
        }
        batch.end()
    }

    private fun Role.getPos(): Pair<Float, Float> {
        val dx = 38
        val dy = 24
        val (centerX, centerY) = if (this.side == Side.PLAYER) Pair(160f, 250f) else Pair(100f, 100f)
        return when (index) {
            0 -> Pair(centerX - dx * 2, centerY)
            1 -> Pair(centerX - dx * 1, centerY - dy * 1)
            2 -> Pair(centerX, centerY - dy * 2)
            3 -> Pair(centerX - dx * 1, centerY + dy * 1)
            4 -> Pair(centerX, centerY)
            5 -> Pair(centerX + dx * 1, centerY - dy * 1)
            else -> throw RuntimeException("无效的坐标")
        }
    }

    private fun Role.getAnim(timer: Float): List<Frame> {
        return if (this.isAlive) {
            res[0].value.getKeyFrame(timer, true)
        } else {
            res[2].value.getKeyFrame(timer, true)
        }
    }


    private fun drawHp(batch: SpriteBatch, sr: ShapeRenderer) {
        val offY = -42
        sr.begin(ShapeType.Filled)
        fightModel.players.forEach {
            val (pBarX, pBarY) = it.getPos()
            drawBar(sr, pBarX, pBarY + offY - 5, it.hp, it.maxHp, 16711680.toColor(), 10945027.toColor())
            drawBar(sr, pBarX, pBarY + offY, it.mp, it.maxMp, 48127.toColor(), 230064.toColor())
        }
        fightModel.enemy.forEach {
            val (eBarX, eBarY) = it.getPos()
            drawBar(sr, eBarX, eBarY + offY, it.hp, it.maxHp, 16711680.toColor(), 10945027.toColor())
        }
        sr.end()

        // rim 边框装饰
        batch.begin()
        fightModel.players.forEach {
            val (pBarX, pBarY) = it.getPos()
            batch.drawImage(rim, pBarX, pBarY + offY - 5)
            batch.drawImage(rim, pBarX, pBarY + offY)
        }
        fightModel.enemy.forEach {
            val (eBarX, eBarY) = it.getPos()
            batch.drawImage(rim, eBarX, eBarY + offY)
        }
        batch.end()
    }

    private fun drawBar(sr: ShapeRenderer, x: Float, y: Float, cur: Int, max: Int, color1: Color, color2: Color) {
        val w = 20f
        val fill = cur * 19f / max
        sr.drawRect(16777215.toColor(), x - w / 2 + 1f, y + 1f, w, 2f, Align.LEFT_TOP)
        sr.drawRect(color1, x - w / 2 + 1f, y + 1f, fill, 2f, Align.LEFT_TOP)
        sr.drawRect(color2, x - w / 2 + 1f, y + 2f, fill, 1f, Align.LEFT_TOP)
    }

    private fun loadRes(): List<Lazy<RpgAnimation>> {
        val playerAnim = resource(PUBLIC_ASSET, "rpg/role/f30011.anim", RpgAnimation::class)
        val enemyAnim = resource(PUBLIC_ASSET, "rpg/role/f30011.anim", RpgAnimation::class)
        val dead = resource(PUBLIC_ASSET, "rpg/skill/dead.anim", RpgAnimation::class)
        val dead2 = resource(PUBLIC_ASSET, "rpg/skill/dead2.anim", RpgAnimation::class)
        return listOf(playerAnim, enemyAnim, dead, dead2)
    }

    private fun selectTarget(batch: SpriteBatch, state: WaitSelectTarget) {
        val skill = state.skill
        val candidates = when (skill.target) {
            SkillTarget.SINGLE_ENEMY, SkillTarget.ALL_ENEMIES -> fightModel.enemy
            SkillTarget.SINGLE_ALLY, SkillTarget.ALL_ALLIES -> fightModel.players
        }
        val aliveTargets = candidates.filter { it.isAlive }
        if (aliveTargets.isEmpty()) return

        val isSingle = skill.target == SkillTarget.SINGLE_ENEMY || skill.target == SkillTarget.SINGLE_ALLY

        // 单体：默认选中第一个存活角色
        if (isSingle && state.selectedTarget == null) {
            state.selectedTarget = aliveTargets.first()
        }

        // 播放选择动画：单体只在选中角色头上播放，群体在所有存活角色上播放
        val animOffY = -55f
        val animTargets = if (isSingle) listOf(state.selectedTarget!!) else aliveTargets
        batch.begin()
        for (role in animTargets) {
            val (x, y) = role.getPos()
            batch.drawAnimation(selectAnim.getKeyFrame(timer, true), x, y + animOffY)
        }
        batch.end()

        // 点击处理
        val touchW = 30f
        val touchH = 40f
        for (role in aliveTargets) {
            val (x, y) = role.getPos()
            if (TouchContext.inTouch(x - touchW / 2, y - touchH, touchW, touchH)) {
                if (isSingle) {
                    if (state.selectedTarget == role) {
                        // 再次点击同一个角色 → 确认选择
                        emit(SelectTarget(role))
                    } else {
                        // 首次点击 / 切换目标
                        state.selectedTarget = role
                    }
                } else {
                    // 群体技能：点击任意角色即确认
                    emit(SelectTarget(role))
                }
                break
            }
        }
    }

    //    private fun selectAperture() {
//        sr.begin(ShapeType.Line)
//        sr.color = Color.valueOf("4fc3f7ff")
//        val (x, y) = getPos(4, "player")
//        val w = 24f
//        val h = 10f
//        val cx = x - w / 2
//        val cy = VIRTUAL_H - (y + h / 2)
//        sr.ellipse(cx, cy, w, h)
//        sr.end()
//    }

}
