package com.cc.screens.base

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
import com.cc.screens.fight.model.SKILLS
import com.cc.screens.fight.model.Skill
import com.cc.ui.component.*

class SkillWindow(
    assetLoader: AssetLoader,
    title: String,
) : UIComponent(assetLoader) {
    companion object {
        private const val BORDER = 10f
    }

    private val res = loadRes()

    private val skillTab = SkillTab(assetLoader, res)  // res: Map<Int, Lazy<TextureRegion>>
    private val window = WindowPanel(assetLoader, title, null) {
        add(TabGroup(assetLoader, listOf("技能")) {
            add(ScrollPanel(assetLoader) {
                add(skillTab)
            })
        })
    }.onEvent<Close> {
        emit(it)
    }.onEvent<Skill> {
        emit(ClickSkill(it))
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
        window.render(batch, sr, cx + BORDER, cy + BORDER, cw - BORDER * 2, ch - BORDER * 3 - 2, delta)
    }

    private fun loadRes(): Map<String, Lazy<TextureRegion>> {
        return SKILLS.associate { skill ->
            skill.resId to resource(PUBLIC_ASSET, "rpg/icon/${skill.icon}.pic", TextureRegion::class)
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
    private val res: Map<String, Lazy<TextureRegion>>,
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

            val icon = res[skill.resId]!!.value
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

data class ClickSkill(val skill: Skill)