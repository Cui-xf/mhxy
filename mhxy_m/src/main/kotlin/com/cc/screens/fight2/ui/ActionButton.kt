package com.cc.screens.fight2.ui

import com.badlogic.gdx.graphics.g2d.SpriteBatch
import com.badlogic.gdx.graphics.g2d.TextureRegion
import com.badlogic.gdx.graphics.glutils.ShapeRenderer
import com.badlogic.gdx.math.Rectangle
import com.cc.asset.AssetLoader
import com.cc.asset.AssetManagerFactory.PUBLIC_ASSET
import com.cc.event.TouchContext
import com.cc.render.Align
import com.cc.render.drawImage
import com.cc.screens.AbstractScreen.Companion.VIRTUAL_H
import com.cc.screens.fight2.model.FightModel
import com.cc.screens.fight2.model.SkillButton
import com.cc.screens.fight2.model.Type
import com.cc.screens.fight2.model.WaitAction
import com.cc.ui.component.UIComponent

class ActionButton(assetLoader: AssetLoader, private val fightModel: FightModel) : UIComponent(assetLoader) {
    //   每个按钮 26×16，index 1=攻击 2=防御 3=技能 4=道具 5=逃跑
    private val fightMenuPic by resource(PUBLIC_ASSET, "rpg/publicUI/49_983005409.pic", TextureRegion::class)
    private val BTN_X = 0f
    private val BTN_Y0 = VIRTUAL_H - 102f   // = 218f
    private val BNT_W = 26
    private val BTN_H = 16
    private val buttons by lazy {
        Action.entries.mapIndexed { it, action ->
            // 从全条纹理里切出第 i 个按钮（x = i*26, y=0, w=26, h=16）
            Button(TextureRegion(fightMenuPic, it * BNT_W, 0, BNT_W, BTN_H), action)
        }
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
        val role = (fightModel.state as? WaitAction)?.role ?: return
        val visibleButtons = when (role.type) {
            Type.ROLE -> buttons
            Type.PET -> buttons.filter { it.action == Action.ATTACK || it.action == Action.DEFEND || it.action == Action.MAGIC }
        }
        // 从下往上顺排：第0个在最底部，依次叠上去
        val rects = visibleButtons.mapIndexed { i, _ ->
            Rectangle(BTN_X, BTN_Y0 + i * BTN_H, BNT_W.toFloat(), BTN_H.toFloat())
        }
        batch.begin()
        for ((button, rect) in visibleButtons.zip(rects)) {
            batch.drawImage(button.textureRegion, rect.x, rect.y, align = Align.LEFT_TOP)
        }
        batch.end()


        visibleButtons.zip(rects).firstOrNull { (_, rect) -> TouchContext.inTouch(rect) }?.also { (it, _) ->
            fightModel.tipText = it.action.label
            when (it.action) {
                Action.ATTACK -> emit(SkillButton(role))
                Action.DEFEND -> emit(SkillButton(role))
                Action.MAGIC -> emit(SkillButton(role))
                Action.ITEM -> emit(SkillButton(role))
                Action.ESCAPE -> emit(SkillButton(role))
            }
        }
    }
}

private enum class Action(val label: String) {
    ATTACK("攻击"),
    DEFEND("防御"),
    MAGIC("法术"),
    ITEM("道具"),
    ESCAPE("逃跑"),
}

private class Button(
    val textureRegion: TextureRegion,
    val action: Action,
)