package com.cc.screens

import com.badlogic.gdx.graphics.Texture
import com.cc.AssetManagerFactory.PUBLIC_ASSET
import com.cc.FontManager.SMALL_FONT
import com.cc.MhxyGame
import com.cc.render.TextRender
import kotlin.random.Random


class LoadingScreen : AbstractScreen() {
    companion object {
        val tips = listOf(
            "系统菜单内可进行动态NPC和小地图等设置",
            "按“3”键可打开角色物品栏",
            "按“1”键可查看周围玩家",
            "按“0”键可打开宠物栏",
            "按“7”键可打开地图",
            "按“9”键可打开社交栏",
            "按“*”键可打开聊天栏",
            "按“#”键可打开任务栏"
        )
    }


    private val shapeRenderer = createShapeRenderer()
    private val textRender: TextRender
    private var dotCount = 0

    init {
        val line = TextRender.Line(listOf(tips[Random.nextInt(tips.size)]), listOf(-1))
        textRender = TextRender(listOf(line))
    }

    override fun show() {
        // 只加载公共资源，场景专属资源由各场景自己加载
        PUBLIC_ASSET.load("title_bg.jpg", Texture::class.java)
        PUBLIC_ASSET.load("player.jpg", Texture::class.java)
    }

    override fun update(delta: Float) {
        dotCount++
        PUBLIC_ASSET.update()
        batch.begin()

        textRender.drawText(batch, SMALL_FONT, VIRTUAL_W / 2, VIRTUAL_H - 20f, TextRender.Align.CENTER)

        batch.end()
        if (PUBLIC_ASSET.isFinished && dotCount * delta > 10000) {
            MhxyGame.setScreen(TitleScreen())
        }
    }


    private fun drawImage() {
//        shapeRenderer.begin(ShapeRenderer.ShapeType.Filled)
//        shapeRenderer.setColor(0.2f, 0.2f, 0.35f, 1f)
//        shapeRenderer.rect(barX, barY, barW, barH)
//        shapeRenderer.setColor(0.2f, 0.7f, 1f, 1f)
//        shapeRenderer.rect(barX, barY, barW * progress, barH)
//        shapeRenderer.end()
    }
//
//    private fun aaa() {
//        val progress = PUBLIC_ASSET.progress
//        dotTimer += delta
//        if (dotTimer >= 0.4f) {
//            dotTimer = 0f
//            dotCount = (dotCount + 1) % 4
//        }
//    }

    override fun dispose() {
        batch.dispose()
        shapeRenderer.dispose()
//        font.dispose()
    }
}
