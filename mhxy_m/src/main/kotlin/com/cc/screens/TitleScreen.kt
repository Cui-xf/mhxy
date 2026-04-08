package com.cc.screens

import com.badlogic.gdx.Gdx
import com.badlogic.gdx.Input
import com.badlogic.gdx.Screen
import com.badlogic.gdx.assets.AssetManager
import com.badlogic.gdx.graphics.GL20
import com.badlogic.gdx.graphics.Texture
import com.badlogic.gdx.graphics.g2d.SpriteBatch
import com.badlogic.gdx.graphics.glutils.ShapeRenderer
import com.cc.FontManager
import com.cc.MhxyGame
import kotlin.math.sin

class TitleScreen(
    private val game: MhxyGame,
    private val assets: AssetManager
) : Screen {

    private val batch = SpriteBatch()
    private val shapeRenderer = ShapeRenderer()
    private val titleFont = FontManager.createFont(48)
    private val btnFont = FontManager.createFont(32)
    private val hintFont = FontManager.createFont(20)

    private val bgTexture: Texture = assets.get("title_bg.jpg", Texture::class.java)

    // 开始按钮：竖屏 600x800，水平居中
    private val btnW = 240f
    private val btnH = 60f
    private val btnX = (600f - btnW) / 2f
    private val btnY = 280f

    private var blinkTimer = 0f

    override fun show() {}

    override fun render(delta: Float) {
        blinkTimer += delta
        val btnAlpha = (0.65f + 0.35f * sin(blinkTimer * 3.0).toFloat()).coerceIn(0f, 1f)

        Gdx.gl.glClearColor(0f, 0f, 0f, 1f)
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT)

        // 背景铺满竖屏
        batch.begin()
        batch.setColor(1f, 1f, 1f, 1f)
        batch.draw(bgTexture, 0f, 0f, 600f, 800f)
        batch.end()

        // 半透明遮罩
        Gdx.gl.glEnable(GL20.GL_BLEND)
        shapeRenderer.begin(ShapeRenderer.ShapeType.Filled)
        shapeRenderer.setColor(0f, 0f, 0f, 0.45f)
        shapeRenderer.rect(0f, 0f, 600f, 800f)
        // 按钮
        shapeRenderer.setColor(0.1f, 0.45f, 0.9f, btnAlpha)
        shapeRenderer.rect(btnX, btnY, btnW, btnH)
        shapeRenderer.end()
        Gdx.gl.glDisable(GL20.GL_BLEND)

        // 文字
        batch.begin()
        titleFont.draw(batch, "梦幻西游", 160f, 660f)
        btnFont.draw(batch, "开始游戏", btnX + 44f, btnY + 44f)
        hintFont.draw(batch, "点击按钮或按 Enter 开始", 160f, 220f)
        hintFont.draw(batch, "按 D 查看资源类型Demo", 170f, 180f)
        batch.end()

        if (Gdx.input.isKeyJustPressed(Input.Keys.D)) {
            game.setScreen(ResourceDemoScreen(game, assets))
            dispose()
            return
        }

        val mx = Gdx.input.x.toFloat()
        val my = (Gdx.graphics.height - Gdx.input.y).toFloat()
        val hovering = mx in btnX..(btnX + btnW) && my in btnY..(btnY + btnH)

        if ((hovering && Gdx.input.justTouched()) || Gdx.input.isKeyJustPressed(Input.Keys.ENTER)) {
            // 通过 SceneLoadingScreen 加载场景1专属资源再进入
            game.setScreen(SceneLoadingScreen(
                game = game,
                sharedAssets = assets,
                sceneAssetLoader = { am ->
                    am.load("game_bg.jpg", Texture::class.java)
                    am.load("door.jpg", Texture::class.java)
                },
                nextScreen = { sceneAssets ->
                    GameScreen(game, assets, sceneAssets)
                }
            ))
            dispose()
        }
    }

    override fun resize(width: Int, height: Int) {}
    override fun pause() {}
    override fun resume() {}
    override fun hide() {}

    override fun dispose() {
        batch.dispose()
        shapeRenderer.dispose()
        titleFont.dispose()
        btnFont.dispose()
        hintFont.dispose()
    }
}
