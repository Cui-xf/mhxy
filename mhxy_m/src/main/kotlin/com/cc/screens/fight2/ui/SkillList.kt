package com.cc.screens.fight2.ui

import com.badlogic.gdx.graphics.Color
import com.badlogic.gdx.graphics.Color.valueOf
import com.badlogic.gdx.graphics.g2d.SpriteBatch
import com.badlogic.gdx.graphics.g2d.TextureRegion
import com.badlogic.gdx.graphics.glutils.ShapeRenderer
import com.cc.FontManager.SMALL_FONT
import com.cc.asset.AssetLoader
import com.cc.asset.AssetManagerFactory.PUBLIC_ASSET
import com.cc.event.TouchContext
import com.cc.render.*
import com.cc.screens.fight2.model.*
import com.cc.ui.component.ScrollPanel
import com.cc.ui.component.TabGroup
import com.cc.ui.component.UIComponent
import com.cc.ui.component.WindowPanel

class SkillList(assetLoader: AssetLoader, private val fightModel: FightModel) : UIComponent(assetLoader) {
    private val res = loadRes()

    private val skillTab = SkillTab(assetLoader, res)  // res: Map<Int, Lazy<TextureRegion>>
    private val window = WindowPanel(assetLoader, "人物技能", null) {
        add(TabGroup(assetLoader, listOf("技能", "技能2")) {
            add(ScrollPanel(assetLoader) {
                add(skillTab)
            })
        })
    }

    init {
        window.onEvent<String> { if (it == "close") emit(Back) }
        window.onEvent<Skill> { emit(SelectSkill(it)) }
    }

    private val border = 10f

    override fun render(
        batch: SpriteBatch,
        sr: ShapeRenderer,
        cx: Float,
        cy: Float,
        cw: Float,
        ch: Float,
        delta: Float
    ) {
        if (fightModel.state !is WaitSelectSkill) return
        window.render(batch, sr, cx + border, cy + border, cw - border * 2, ch - border * 2, delta)
    }

    // 预加载所有技能图标，对应：
    //   GameSceneController.java:16677-16684  getIconFrame0(short var0)
    //     → MainCanvas.icon.getSpriteByNameFromCache(String.valueOf(var0))
    //   GameSceneController.java:16686-16706  b(short[] var0) → Image[]
    // 图标 ID 对应 GlobalStatus.skillCD2[]，此处简化用技能 id 直接对应
    // 用 Lazy 委托注册加载但延迟取值，首次渲染时 assetManager 已完成加载（AbstractScreen.java:37-40）
    private fun loadRes(): Map<Int, Lazy<TextureRegion>> {
        return SKILLS.associate { skill ->
            skill.id to resource(PUBLIC_ASSET, "rpg/icon/${skill.id}.pic", TextureRegion::class)
        }
    }

    override fun dispose() {
        super.dispose()
        skillTab.dispose()
        window.dispose()
    }
}

class SkillTab(
    assetLoader: AssetLoader,
    private val res: Map<Int, Lazy<TextureRegion>>,
) : UIComponent(assetLoader) {
    val skills = SKILLS
    private val rowHeight: Float = 16f + 2
    private var lastSelected = 0

    override fun preferredHeight(width: Float): Float = rowHeight * skills.size

    override fun render(
        batch: SpriteBatch,
        sr: ShapeRenderer,
        cx: Float,
        cy: Float,
        cw: Float,
        ch: Float,
        delta: Float
    ) {
        var select: Skill? = null
        for ((i, skill) in skills.withIndex()) {
            val rowX = cx + 2
            val rowY = cy + i * rowHeight
            val rowW = cw - 4
            val rowH = rowHeight

            if (TouchContext.inTouch(rowX, rowY, rowW, rowH)) {
                if (lastSelected == i) {
                    select = skill
                    break
                } else {
                    lastSelected = i
                }
            }


            // 选中高亮
            if (i == lastSelected) {
                sr.begin(ShapeRenderer.ShapeType.Filled)
                sr.drawRect(valueOf("#004F8C"), rowX, rowY, rowW, rowH, Align.LEFT_TOP)
                sr.end()
            }

            val icon = res[skill.id]!!.value
            val iconX = rowX + 1f
            val iconSize = icon.regionHeight.toFloat()
            val iconY = rowY + (rowH - iconSize) / 2f

            batch.begin()
            batch.drawImage(icon, iconX, iconY, align = Align.LEFT_TOP)
            batch.end()

            sr.drawRectBorder(
                iconX,
                iconY,
                iconSize,
                iconSize,
                listOf(Pair(1, 16515586.toColor())),
                align = Align.LEFT_TOP
            )

            // 技能名称
            val nameColor = if (i == lastSelected) Color.WHITE else 2176196.toColor()
            val nameX = rowX + iconSize + 6f
            val nameY = rowY + (rowH - SMALL_FONT.capHeight) / 2f
            batch.begin()
            batch.drawString(SMALL_FONT, skill.name, nameColor, nameX, nameY, Align.LEFT_TOP)
            batch.end()

            val levelText = "${skill.level}级"
            val levelColor = if (i == lastSelected) Color.WHITE else 2176196.toColor()
            val levelX = rowX + rowW - 1
            batch.begin()
            batch.drawString(SMALL_FONT, levelText, levelColor, levelX, nameY, Align.RIGHT_TOP)
            batch.end()
        }

        if (select != null) {
            emit(select)
        }
    }
}
