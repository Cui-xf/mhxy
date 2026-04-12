package com.cc.screens

import com.badlogic.gdx.Gdx
import com.badlogic.gdx.graphics.Color
import com.badlogic.gdx.graphics.Texture
import com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType
import com.badlogic.gdx.math.Rectangle
import com.cc.FontManager.SMALL_FONT
import com.cc.MhxyGame
import com.cc.asset.AssetManagerFactory.PUBLIC_ASSET
import com.cc.render.*
import kotlin.random.Random


class LoadingScreen : AbstractScreen() {
    private val tips = listOf(
        "系统菜单内可进行动态NPC和小地图等设置",
        "按“3”键可打开角色物品栏",
        "按“1”键可查看周围玩家",
        "按“0”键可打开宠物栏",
        "按“7”键可打开地图",
        "按“9”键可打开社交栏",
        "按“*”键可打开聊天栏",
        "按“#”键可打开任务栏"
    )
    private val progressBarImage = autoDispose { Texture(Gdx.files.classpath("assets/loading.png")) }
    private val shapeRenderer = autoDispose { createShapeRenderer() }

    private val progressBar = Rectangle((VIRTUAL_W - 100) / 2, (VIRTUAL_H / 3 * 2) + 20, 100f, 3f)
    private val textRender: TextRender
    private var progress = 0

    init {
        val line = TextRender.Line(listOf(tips[Random.nextInt(tips.size)]), listOf(null))
        textRender = TextRender(listOf(line))

        // 只加载公共资源，场景专属资源由各场景自己加载
        PUBLIC_ASSET.load("title_bg.jpg", Texture::class.java)
        PUBLIC_ASSET.load("player.jpg", Texture::class.java)
    }

    override fun update(delta: Float) {
        progress = if (progress >= 100) 100 else progress + 10
        PUBLIC_ASSET.update()
        batch.begin()
        //顶部文字
        textRender.drawText(batch, SMALL_FONT, VIRTUAL_W / 2, 30f, Align.CENTER_TOP)
        // 进度条背景图
        batch.drawImage(progressBarImage, progressBar.x - 5, progressBar.y - 4.5f, align = Align.LEFT)
        batch.drawString(
            SMALL_FONT,
            "正在载入资源...",
            Color.WHITE,
            VIRTUAL_W / 2,
            VIRTUAL_H / 2
        )
        batch.drawString(
            SMALL_FONT,
            "${progress}%",
            Color.valueOf("#DCA248"),
            VIRTUAL_W / 2,
            progressBar.y + 10,
        ) // 百分比数字
        batch.end()
        shapeRenderer.begin(ShapeType.Filled)
        shapeRenderer.drawRect(
            Color.valueOf("#F9F872"),
            progressBar.x,
            progressBar.y,
            (progress * 100 / 100).toFloat(),
            progressBar.height,
            Align.LEFT
        )
        shapeRenderer.drawRect(
            Color.valueOf("#dca248"),
            progressBar.x,
            progressBar.y + 1,
            (progress * 100 / 100).toFloat(),
            progressBar.height - 1,
            Align.LEFT
        )
        shapeRenderer.end()
        if (PUBLIC_ASSET.isFinished && progress >= 100) {
//            MhxyGame.setScreen(TitleScreen())
            MhxyGame.setScreen(RoleSelectScreen())
        }
    }
}
