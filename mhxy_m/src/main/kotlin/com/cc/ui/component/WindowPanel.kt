package com.cc.ui.component

import com.badlogic.gdx.graphics.Color
import com.badlogic.gdx.graphics.g2d.SpriteBatch
import com.badlogic.gdx.graphics.g2d.TextureRegion
import com.badlogic.gdx.graphics.glutils.ShapeRenderer
import com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType
import com.cc.FontManager.MEDIA_FONT
import com.cc.asset.AssetLoader
import com.cc.asset.AssetManagerFactory.PUBLIC_ASSET
import com.cc.render.*

class WindowPanel(assetLoader: AssetLoader, block: UIContainer.() -> Unit) : UIContainer(assetLoader, block) {
    private val lu by resource(PUBLIC_ASSET, "rpg/publicUI/lu.rt", TextureRegion::class)
    private val ld by resource(PUBLIC_ASSET, "rpg/publicUI/ld.rt", TextureRegion::class)
    private val rd by resource(PUBLIC_ASSET, "rpg/publicUI/rd.rt", TextureRegion::class)
    private val titleImage by resource(PUBLIC_ASSET, "rpg/publicUI/title.rt", TextureRegion::class)
    private val closeImage by resource(PUBLIC_ASSET, "rpg/publicUI/close.rt", TextureRegion::class)
    private val bottomImage by resource(PUBLIC_ASSET, "rpg/publicUI/button1.rt", TextureRegion::class)

    override fun renderSelf(batch: SpriteBatch, sr: ShapeRenderer, cx: Float, cy: Float, cw: Float, ch: Float) {
        //标题和背景
        titleImage(batch, cx, cy, cw, ch)
        //标题下边框
        sr.begin(ShapeType.Filled)
        sr.drawRect(Color.valueOf("#0067AC"), cx, cy + 28f, cw - 1, 4f, Align.LEFT)
        sr.end()
        sr.begin(ShapeType.Line)
        sr.drawLine(Color.valueOf("#ABEDE4"), cx + 1.5f, cy + 29f, cx + cw - 2, cy + 29f)
        //外边框
        sr.drawRect(Color.valueOf("#005187"), cx, cy, cw, ch, Align.LEFT)
        sr.drawRect(Color.valueOf("#1197AE"), cx + 1, cy + 1, cw - 2, ch - 2, Align.LEFT)
        sr.drawRect(Color.valueOf("#95D9E2"), cx + 2, cy + 2, cw - 4, ch - 4, Align.LEFT)
        sr.drawRect(Color.valueOf("#1197AE"), cx + 3, cy + 3, cw - 6, ch - 6, Align.LEFT)
        sr.drawRect(Color.valueOf("#005187"), cx + 4, cy + 4, cw - 8, ch - 8, Align.LEFT)
        sr.end()

        //四角装饰图（在边框之上）
        batch.begin()
        batch.drawImage(lu, cx, cy, align = Align.LEFT)
        batch.drawImage(ld, cx, cy + ch - ld.regionHeight, align = Align.LEFT)
        batch.drawImage(rd, cx + cw - rd.regionWidth, cy + ch - rd.regionHeight, align = Align.LEFT)
        batch.end()
    }

    private fun titleImage(batch: SpriteBatch, cx: Float, cy: Float, cw: Float, ch: Float) {
        batch.begin()
        // 平铺标题图
        val imgW = titleImage.regionWidth
        var t = 0
        for (i in 0 until (cw.toInt() - imgW) step imgW) {
            t = i
            batch.drawImage(titleImage, cx + i, cy + 4, align = Align.LEFT)
        }
        if (t < cw) {
            val partial = TextureRegion(titleImage, 0, 0, cw.toInt() - t, titleImage.regionHeight)
            batch.drawImage(partial, cx + t, cy + 4, align = Align.LEFT)
        }

        // 关闭按钮
        batch.drawImage(closeImage, cx + cw - 5 - closeImage.regionWidth, cy + 4, align = Align.LEFT)

        // 居中标题文字
        batch.wordArtString(
            MEDIA_FONT,
            "角色列表",
            Color.valueOf("#000000"),
            Color.valueOf("#FFFED5"),
            cx + cw / 2,
            cy + 4 + (titleImage.regionHeight - MEDIA_FONT.capHeight) / 2
        )
        //底部图片
        batch.drawImage(
            bottomImage,
            cx,
            cy + ch - 4 - bottomImage.regionHeight,
            cw,
            bottomImage.regionHeight.toFloat() + 1,
            Align.LEFT
        )
        //底部文字
        batch.wordArtString(
            MEDIA_FONT,
            "进入游戏",
            0.toColor(),
            16776917.toColor(),
            cx + 10f,
            cy + ch - 10.5f - MEDIA_FONT.capHeight,
            Align.LEFT
        )
        batch.end()
    }

    override fun border(): Border {
        return Border(31f, 29f, 4f, 5f)
    }
}