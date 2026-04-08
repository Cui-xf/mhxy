package com.cc.screens

import com.badlogic.gdx.Gdx
import com.badlogic.gdx.Screen
import com.badlogic.gdx.assets.AssetManager
import com.badlogic.gdx.graphics.GL20
import com.badlogic.gdx.graphics.Texture
import com.badlogic.gdx.graphics.g2d.SpriteBatch
import com.badlogic.gdx.graphics.glutils.ShapeRenderer
import com.cc.AssetManagerFactory
import com.cc.FontManager
import com.cc.MhxyGame

class LoadingScreen(private val game: MhxyGame) : Screen {

    private val batch = SpriteBatch()
    private val shapeRenderer = ShapeRenderer()
    private val font = FontManager.createFont(28)

    val assets = AssetManagerFactory.create()

    init {
        // 只加载公共资源，场景专属资源由各场景自己加载
        assets.load("title_bg.jpg", Texture::class.java)
        assets.load("player.jpg", Texture::class.java)
    }

    private var dotTimer = 0f
    private var dotCount = 0

    override fun show() {}

    override fun render(delta: Float) {
        assets.update()
        val progress = assets.progress

        dotTimer += delta
        if (dotTimer >= 0.4f) {
            dotTimer = 0f
            dotCount = (dotCount + 1) % 4
        }

        Gdx.gl.glClearColor(0.05f, 0.05f, 0.12f, 1f)
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT)

        // 进度条：竖屏居中，y=360
        val barX = 80f
        val barY = 360f
        val barW = 440f
        val barH = 28f

        shapeRenderer.begin(ShapeRenderer.ShapeType.Filled)
        shapeRenderer.setColor(0.2f, 0.2f, 0.35f, 1f)
        shapeRenderer.rect(barX, barY, barW, barH)
        shapeRenderer.setColor(0.2f, 0.7f, 1f, 1f)
        shapeRenderer.rect(barX, barY, barW * progress, barH)
        shapeRenderer.end()

        val dots = ".".repeat(dotCount)
        batch.begin()
        font.draw(batch, "梦幻西游", 215f, 560f)
        font.draw(batch, "资源加载中$dots  ${(progress * 100).toInt()}%", barX, barY - 12f)
        batch.end()

        if (assets.isFinished) {
            game.setScreen(TitleScreen(game, assets))
        }
    }

    override fun resize(width: Int, height: Int) {}
    override fun pause() {}
    override fun resume() {}
    override fun hide() {}

    override fun dispose() {
        batch.dispose()
        shapeRenderer.dispose()
        font.dispose()
    }
}
