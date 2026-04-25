package com.cc.screens.fight.ui

import com.badlogic.gdx.graphics.g2d.SpriteBatch
import com.badlogic.gdx.graphics.glutils.ShapeRenderer
import com.cc.asset.AssetLoader
import com.cc.asset.AssetManagerFactory.PUBLIC_ASSET
import com.cc.asset.RpgAnimation
import com.cc.render.drawAnimation
import com.cc.screens.fight.model.Animating
import com.cc.screens.fight.model.FightModel
import com.cc.screens.fight.model.SKILLS
import com.cc.screens.fight.model.SkillEffectHandler
import com.cc.ui.component.UIComponent

/**
 * 技能特效渲染组件。
 *
 * 监听 AnimationDriver.currentHandler：
 *  - 当前阶段为 SkillEffectHandler 时在目标位置播放对应技能动画（不循环）
 *  - 动画播完后调用 handler.markDone() 通知驱动器继续
 */
class SkillEffect(
    assetLoader: AssetLoader,
    private val fightModel: FightModel,
) : UIComponent(assetLoader) {

    // 按技能 id 逐一注册，id >= 10 才有特效（参考旧版 FightScreen）
    private val anims: Map<String, Lazy<RpgAnimation>> = SKILLS.associate {
        it.resId to resource(PUBLIC_ASSET, "rpg/skill/${it.resId}.anim", RpgAnimation::class)
    }

    override fun render(
        batch: SpriteBatch,
        sr: ShapeRenderer,
        cx: Float,
        cy: Float,
        cw: Float,
        ch: Float,
        delta: Float
    ) {
        val driver = (fightModel.state as? Animating ?: return).driver
        val handler = driver.currentHandler as? SkillEffectHandler ?: return
        val timer = handler.timer

        val anim = anims[handler.resId]?.value
            ?: anims["10.anim"]!!.value  // 找不到对应特效时用 id=10 兜底
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
