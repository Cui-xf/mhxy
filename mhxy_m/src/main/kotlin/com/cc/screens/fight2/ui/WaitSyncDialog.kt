package com.cc.screens.fight2.ui

import com.badlogic.gdx.Gdx
import com.badlogic.gdx.graphics.Color
import com.badlogic.gdx.graphics.GL20
import com.badlogic.gdx.graphics.g2d.SpriteBatch
import com.badlogic.gdx.graphics.g2d.TextureRegion
import com.badlogic.gdx.graphics.glutils.ShapeRenderer
import com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType
import com.cc.FontManager.MEDIA_FONT
import com.cc.asset.AssetLoader
import com.cc.asset.AssetManagerFactory.PUBLIC_ASSET
import com.cc.render.*
import com.cc.screens.AbstractScreen.Companion.VIRTUAL_H
import com.cc.screens.AbstractScreen.Companion.VIRTUAL_W
import com.cc.screens.fight2.model.FightModel
import com.cc.screens.fight2.model.WaitSync
import com.cc.ui.component.UIComponent

class WaitSyncDialog(assetLoader: AssetLoader, private val fightModel: FightModel) : UIComponent(assetLoader) {

    private val lu by resource(PUBLIC_ASSET, "rpg/publicUI/lu0.pic", TextureRegion::class)
    private val ld by resource(PUBLIC_ASSET, "rpg/publicUI/ld0.pic", TextureRegion::class)
    private val ru by resource(PUBLIC_ASSET, "rpg/publicUI/ru0.pic", TextureRegion::class)
    private val rd by resource(PUBLIC_ASSET, "rpg/publicUI/rd0.pic", TextureRegion::class)

    // 弹窗尺寸（与原版 font2_w*10 x font2_h*lines+20 对应，固定单行文字）
    private val W = 100f
    private val H = 36f

    private val borders = listOf(
        Pair(1, Color.valueOf("#005187")),
        Pair(1, Color.valueOf("#1197AE")),
        Pair(1, Color.valueOf("#95D9E2")),
        Pair(1, Color.valueOf("#1197AE")),
        Pair(1, Color.valueOf("#005187")),
    )

    override fun render(
        batch: SpriteBatch,
        sr: ShapeRenderer,
        cx: Float,
        cy: Float,
        cw: Float,
        ch: Float,
        delta: Float
    ) {
        val state = fightModel.state
        if (state !is WaitSync) return

        val bx = (VIRTUAL_W - W) / 2f
        val by = (VIRTUAL_H - H) / 2f

        // 半透明背景（原版 color=1009050, alpha=180）
        Gdx.gl.glEnable(GL20.GL_BLEND)
        Gdx.gl.glBlendFunc(GL20.GL_SRC_ALPHA, GL20.GL_ONE_MINUS_SRC_ALPHA)
        sr.begin(ShapeType.Filled)
        val bg = 1009050.toColor().apply { a = 180f / 255f }
        sr.drawRect(bg, bx, by, W, H, Align.LEFT_TOP)
        sr.end()
        Gdx.gl.glDisable(GL20.GL_BLEND)

        // 5层边框
        sr.drawRectBorder(bx, by, W, H, borders, align = Align.LEFT_TOP)

        // 四角装饰图
        batch.begin()
        batch.drawImage(lu, bx, by, align = Align.LEFT_TOP)
        batch.drawImage(ld, bx, by + H - ld.regionHeight, align = Align.LEFT_TOP)
        batch.drawImage(ru, bx + W - ru.regionWidth, by, align = Align.LEFT_TOP)
        batch.drawImage(rd, bx + W - rd.regionWidth, by + H - rd.regionHeight, align = Align.LEFT_TOP)

        // 居中文字：白色主色，黑色描边（原版 color1=16777215 白，color2=0 黑）
        batch.wordArtString(
            MEDIA_FONT,
            state.tips,
            Color.BLACK,
            Color.WHITE,
            bx + W / 2f,
            by + (H - MEDIA_FONT.capHeight) / 2f,
            Align.CENTER_TOP
        )
        batch.end()
    }
}
