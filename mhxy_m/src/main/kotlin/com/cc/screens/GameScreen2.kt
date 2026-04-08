package com.cc.screens

import com.badlogic.gdx.Gdx
import com.badlogic.gdx.Input
import com.badlogic.gdx.Screen
import com.badlogic.gdx.assets.AssetManager
import com.badlogic.gdx.graphics.GL20
import com.badlogic.gdx.graphics.Texture
import com.badlogic.gdx.graphics.g2d.SpriteBatch
import com.badlogic.gdx.graphics.g2d.TextureRegion
import com.badlogic.gdx.graphics.glutils.ShapeRenderer
import com.cc.FontManager
import com.cc.MhxyGame
import com.cc.ui.HudOverlay
import com.cc.ui.MapOverlay

/**
 * 场景二
 *
 * 与 GameScreen 共享同一个 HudOverlay 实例 —— 血量/蓝量/金币等状态跨场景保持连续。
 * 按 M 打开的地图是场景二专属的数据（不同的 NPC 标记）。
 */
class GameScreen2(
    private val game: MhxyGame,
    private val sharedAssets: AssetManager,
    private val sceneAssets: AssetManager,
    /** 从场景一传入的公共 HUD，状态连续 */
    private val hud: HudOverlay = HudOverlay()
) : Screen {

    private val batch = SpriteBatch()
    private val shapeRenderer = ShapeRenderer()
    private val npcFont = FontManager.createFont(18)
    private val demoFont = FontManager.createFont(15)

    private val bgTexture: Texture = sceneAssets.get("scene2_bg.jpg", Texture::class.java)
    private val playerTexture: Texture = sharedAssets.get("player.jpg", Texture::class.java)
    private val playerRegion: TextureRegion = TextureRegion(playerTexture)  // 静态图片用法

    private val mapW = 600f
    private val mapH = 740f
    private val hudH = hud.hudH
    private val speed = 220f
    private val playerSize = 60f

    private var playerX = 270f
    private var playerY = 60f

    private val npcs = listOf(
        Triple(100f, 600f, "仙人"),
        Triple(420f, 380f, "妖怪"),
        Triple(200f, 200f, "宝箱")
    )

    // ── 场景二专属地图（NPC、标记与场景一不同）──────────────────────
    private val mapOverlay = MapOverlay(
        sceneName = "场景二：副本",
        mapMarkers = listOf(
            Triple(0.17f, 0.81f, "仙人"),
            Triple(0.70f, 0.51f, "妖怪"),
            Triple(0.33f, 0.27f, "宝箱")
        )
    )

    private var elapsedTime = 0f

    override fun show() {}

    override fun render(delta: Float) {
        elapsedTime += delta
        mapOverlay.handleInput()
        handleInput(delta)

        // 进入场景二后演示：HP 缓慢下降（模拟受伤）
        if (hud.hp > 0) hud.hp = (hud.hp - (delta * 8).toInt()).coerceAtLeast(0)

        Gdx.gl.glClearColor(0f, 0f, 0f, 1f)
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT)

        batch.begin()
        batch.setColor(1f, 1f, 1f, 1f)
        batch.draw(bgTexture, 0f, hudH, mapW, mapH)
        batch.end()

        Gdx.gl.glEnable(GL20.GL_BLEND)
        hud.renderBars(shapeRenderer)

        shapeRenderer.begin(ShapeRenderer.ShapeType.Filled)
        for ((nx, ny, _) in npcs) {
            shapeRenderer.setColor(0.8f, 0.2f, 0.9f, 0.9f)
            shapeRenderer.circle(nx + 20f, hudH + ny + 20f, 22f)
        }
        shapeRenderer.end()

        mapOverlay.renderPanel(
            shapeRenderer,
            playerNormX = playerX / mapW,
            playerNormY = playerY / mapH
        )
        Gdx.gl.glDisable(GL20.GL_BLEND)

        batch.begin()
        batch.setColor(1f, 1f, 1f, 1f)
        // 静态图片用法：直接用 TextureRegion 绘制玩家
        batch.draw(playerRegion, playerX, hudH + playerY, playerSize, playerSize)

        for ((nx, ny, label) in npcs) {
            npcFont.draw(batch, label, nx, hudH + ny + 58f)
        }

        hud.renderText(batch)
        mapOverlay.renderText(batch)

        demoFont.draw(batch, "WASD移动  M地图  ESC返回场景一", 10f, hudH + 14f)
        demoFont.draw(batch, "[场景二] HP持续下降中…返回场景一可看到血量延续", 10f, hudH + mapH - 10f)
        batch.end()

        if (Gdx.input.isKeyJustPressed(Input.Keys.ESCAPE)) {
            backToScene1()
        }
    }

    private fun backToScene1() {
        game.setScreen(
            SceneLoadingScreen(
            game = game,
            sharedAssets = sharedAssets,
            sceneAssetLoader = { am ->
                am.load("game_bg.jpg", Texture::class.java)
                am.load("door.jpg", Texture::class.java)
            },
            nextScreen = { sceneAssets1 ->
                // 把同一个 hud 实例传回场景一，血量状态连续
                GameScreen(game, sharedAssets, sceneAssets1, hud)
            }
        ))
        dispose()
    }

    private fun handleInput(delta: Float) {
        val dist = speed * delta
        if (Gdx.input.isKeyPressed(Input.Keys.W) || Gdx.input.isKeyPressed(Input.Keys.UP))
            playerY = (playerY + dist).coerceAtMost(mapH - playerSize)
        if (Gdx.input.isKeyPressed(Input.Keys.S) || Gdx.input.isKeyPressed(Input.Keys.DOWN))
            playerY = (playerY - dist).coerceAtLeast(0f)
        if (Gdx.input.isKeyPressed(Input.Keys.A) || Gdx.input.isKeyPressed(Input.Keys.LEFT))
            playerX = (playerX - dist).coerceAtLeast(0f)
        if (Gdx.input.isKeyPressed(Input.Keys.D) || Gdx.input.isKeyPressed(Input.Keys.RIGHT))
            playerX = (playerX + dist).coerceAtMost(mapW - playerSize)
    }

    override fun resize(width: Int, height: Int) {}
    override fun pause() {}
    override fun resume() {}
    override fun hide() {}

    override fun dispose() {
        batch.dispose()
        shapeRenderer.dispose()
        npcFont.dispose()
        demoFont.dispose()
        mapOverlay.dispose()
        sceneAssets.dispose()
        // hud 由外部管理，不在这里 dispose
    }
}
