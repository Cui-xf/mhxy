package com.cc.screens.fight.ui

import com.badlogic.gdx.graphics.Color
import com.badlogic.gdx.graphics.g2d.SpriteBatch
import com.badlogic.gdx.graphics.g2d.TextureRegion
import com.badlogic.gdx.graphics.glutils.ShapeRenderer
import com.cc.asset.AssetLoader
import com.cc.asset.AssetManagerFactory
import com.cc.asset.Frame
import com.cc.asset.RpgAnimation
import com.cc.asset.role.buildRoleResId
import com.cc.render.*
import com.cc.screens.fight.model.*
import com.cc.ui.component.UIComponent

class FightRole(
    assetLoader: AssetLoader,
    private val fightModel: FightModel,
) : UIComponent(assetLoader) {
    private val res = loadRes()

    //血条装饰
    private val rim by resource(AssetManagerFactory.PUBLIC_ASSET, "rpg/publicUI/rim.pic", TextureRegion::class)

    // 攻击/受击动画
    //上方阵亡
    val enemyDead by resource(AssetManagerFactory.PUBLIC_ASSET, "rpg/skill/dead.anim", RpgAnimation::class)

    //下方阵亡
    val allyDead by resource(AssetManagerFactory.PUBLIC_ASSET, "rpg/skill/dead2.anim", RpgAnimation::class)

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
    }

    private fun roleAnim(batch: SpriteBatch) {
        batch.begin()
        fightModel.ally.forEach {
            it.getAnim(timer)?.let { frames -> batch.drawAnimation(frames, it.posX, it.posY) }
        }
        fightModel.enemy.forEach {
            it.getAnim(timer)?.let { frames -> batch.drawAnimation(frames, it.posX, it.posY) }
        }
        batch.end()
    }

    private fun Role.getAnim(timer: Float): List<Frame>? {
        return when {
            !this.isAlive -> (if (side == Side.ENEMY) enemyDead else allyDead).getKeyFrame(timer, true)
            this.animState == RoleAnimState.Attack -> res[Triple(
                this.side,
                this.index,
                this.animState
            )]!!.value.getKeyFrame(timer, true)

            this.animState == RoleAnimState.Hit -> res[Triple(
                this.side,
                this.index,
                RoleAnimState.Idle
            )]!!.value.getKeyFrame(timer, true)

            else -> res[Triple(
                this.side,
                this.index,
                this.animState
            )]!!.value.getKeyFrame(timer, true)
        }
    }


    private fun drawHp(batch: SpriteBatch, sr: ShapeRenderer) {
        val offY = -42
        sr.begin(ShapeRenderer.ShapeType.Filled)
        fightModel.ally.forEach {
            val pBarX = it.posX
            val pBarY = it.posY
            drawBar(sr, pBarX, pBarY + offY - 5, it.hp, it.maxHp, 16711680.toColor(), 10945027.toColor())
            drawBar(sr, pBarX, pBarY + offY, it.mp, it.maxMp, 48127.toColor(), 230064.toColor())
        }
        fightModel.enemy.forEach {
            drawBar(sr, it.posX, it.posY + offY, it.hp, it.maxHp, 16711680.toColor(), 10945027.toColor())
        }
        sr.end()

        // rim 边框装饰
        batch.begin()
        fightModel.ally.forEach {
            val pBarX = it.posX
            val pBarY = it.posY
            batch.drawImage(rim, pBarX, pBarY + offY - 5)
            batch.drawImage(rim, pBarX, pBarY + offY)
        }
        fightModel.enemy.forEach {
            batch.drawImage(rim, it.posX, it.posY + offY)
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

    private fun loadRes(): Map<Triple<Side, Int, RoleAnimState>, Lazy<RpgAnimation>> {
        val map = mutableMapOf<Triple<Side, Int, RoleAnimState>, Lazy<RpgAnimation>>()
        val stateList = listOf(RoleAnimState.Idle, RoleAnimState.Attack)
        for (role in (fightModel.ally + fightModel.enemy)) {
            for (state in stateList) {
                val resId = buildRoleResId(role.job, role.gender, role.appearance, Ride.None, role.dir, state)
                val resource = resource(AssetManagerFactory.PUBLIC_ASSET, resId, RpgAnimation::class)
                map[Triple(role.side, role.index, state)] = resource
            }
        }
        return map
    }

//        绘制self指示器
//        private fun selectAperture() {
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