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

class WindowPanel(
    assetLoader: AssetLoader,
    var title: String = "",
    var bottomText: String = "",
    block: UIContainer.() -> Unit,
) : UIContainer(assetLoader, block) {
    private val lu by resource(PUBLIC_ASSET, "rpg/publicUI/lu.pic", TextureRegion::class)
    private val ld by resource(PUBLIC_ASSET, "rpg/publicUI/ld.pic", TextureRegion::class)
    private val rd by resource(PUBLIC_ASSET, "rpg/publicUI/rd.pic", TextureRegion::class)
    private val titleImage by resource(PUBLIC_ASSET, "rpg/publicUI/title.pic", TextureRegion::class)
    private val closeImage by resource(PUBLIC_ASSET, "rpg/publicUI/close.pic", TextureRegion::class)
    private val bottomImage by resource(PUBLIC_ASSET, "rpg/publicUI/button1.pic", TextureRegion::class)

    override fun renderSelf(batch: SpriteBatch, sr: ShapeRenderer, cx: Float, cy: Float, cw: Float, ch: Float) {
        sr.begin(ShapeType.Filled)
        //整体背景
        sr.drawRect(2780801.toColor(), cx, cy, cw, ch, Align.LEFT)
        //标题下边框
        sr.drawRect(Color.valueOf("#0067AC"), cx, cy + 28f, cw - 1, 4f, Align.LEFT)
        sr.end()
        sr.begin(ShapeType.Line)
        //标题下边框高亮
        sr.drawLine(Color.valueOf("#ABEDE4"), cx + 1.5f, cy + 29f, cx + cw - 2, cy + 29f)
        sr.end()
        //标题和背景图片
        titleImage(batch, cx, cy, cw, ch)
        sr.begin(ShapeType.Filled)
        //外边框（用填充矩形拼出边框线，避免 Line 模式角点缺失）
        sr.drawRectBorder(Color.valueOf("#005187"), cx, cy, cw, ch, Align.LEFT)
        sr.drawRectBorder(Color.valueOf("#005187"), cx + 4, cy + 4, cw - 8, ch - 8, Align.LEFT)
        sr.drawRectBorder(Color.valueOf("#1197AE"), cx + 1, cy + 1, cw - 2, ch - 2, Align.LEFT)
        sr.drawRectBorder(Color.valueOf("#1197AE"), cx + 3, cy + 3, cw - 6, ch - 6, Align.LEFT)
        sr.drawRectBorder(Color.valueOf("#95D9E2"), cx + 2, cy + 2, cw - 4, ch - 4, Align.LEFT)
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
            title,
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
            bottomText,
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