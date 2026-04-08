package com.cc.screens

import com.badlogic.gdx.Gdx
import com.badlogic.gdx.Input
import com.badlogic.gdx.Screen
import com.badlogic.gdx.assets.AssetManager
import com.badlogic.gdx.graphics.GL20
import com.badlogic.gdx.graphics.Texture
import com.badlogic.gdx.graphics.g2d.Animation
import com.badlogic.gdx.graphics.g2d.SpriteBatch
import com.badlogic.gdx.graphics.g2d.TextureRegion
import com.badlogic.gdx.graphics.glutils.ShapeRenderer
import com.badlogic.gdx.math.Rectangle
import com.cc.FontManager
import com.cc.MhxyGame
import com.cc.ui.HudOverlay
import com.cc.ui.MapOverlay
import com.badlogic.gdx.utils.Array as GdxArray

/**
 * 场景一
 *
 * 演示要点：
 *  1. HudOverlay  —— 公共 HUD（玩家信息），跨场景共享同一实例，状态连续
 *  2. MapOverlay  —— 按 M 弹出地图，地图数据由本场景定义（场景私有）
 *  3. 静态图片    —— TextureRegion 包裹整张 Texture
 *  4. 帧动画      —— walk_strip 切割 + Animation 驱动玩家行走动画
 *  5. 图集切片    —— ui_atlas 手动 TextureRegion 裁剪，用作场景角落 UI 图标
 */
class GameScreen(
    private val game: MhxyGame,
    private val sharedAssets: AssetManager,   // 公共资源（player 等）
    private val sceneAssets: AssetManager,    // 场景1专属（game_bg、door）
    /** 公共 HUD，由外部传入以在场景间共享同一实例 */
    val hud: HudOverlay = HudOverlay()
) : Screen {

    private val batch = SpriteBatch()
    private val shapeRenderer = ShapeRenderer()
    private val npcFont = FontManager.createFont(18)
    private val tipFont = FontManager.createFont(20)
    private val demoFont = FontManager.createFont(15)

    // ── 场景背景 / 门 ──────────────────────────────────────────────
    private val bgTexture: Texture = sceneAssets.get("game_bg.jpg", Texture::class.java)
    private val doorTexture: Texture = sceneAssets.get("door.jpg", Texture::class.java)

    // ── 资源用法1：静态图片 ────────────────────────────────────────
    // TextureRegion 包裹整张 Texture；和直接用 Texture 效果一样，
    // 但 TextureRegion 可以只取局部，是统一的传递单元。
    private val playerTexture: Texture = sharedAssets.get("player.jpg", Texture::class.java)
    private val playerRegion: TextureRegion = TextureRegion(playerTexture)

    // ── 资源用法2：帧动画 ──────────────────────────────────────────
    // walk_strip.jpg = 512×128，横排 4 帧，每帧 128×128
    private val walkStrip: Texture = Texture(Gdx.files.classpath("assets/walk_strip.jpg"))
    private val walkAnimation: Animation<TextureRegion> = run {
        val fw = walkStrip.width / 4
        val fh = walkStrip.height
        val grid = TextureRegion.split(walkStrip, fw, fh)
        Animation(0.15f, GdxArray(grid[0])).also {
            it.playMode = Animation.PlayMode.LOOP
        }
    }
    private var stateTime = 0f   // 动画累计时间（移动时推进）

    // ── 资源用法3：图集切片 ────────────────────────────────────────
    // ui_atlas.jpg = 256×256，2×2 排列，每格 128×128
    // 截取左上角那一格用作场景右下角的"技能图标"展示
    private val atlasTexture: Texture = Texture(Gdx.files.classpath("assets/ui_atlas.jpg"))
    private val iconSlices: Array<TextureRegion> = arrayOf(
        TextureRegion(atlasTexture, 0, 0, 128, 128),
        TextureRegion(atlasTexture, 128, 0, 128, 128),
        TextureRegion(atlasTexture, 0, 128, 128, 128),
        TextureRegion(atlasTexture, 128, 128, 128, 128)
    )

    // ── 地图尺寸 ───────────────────────────────────────────────────
    private val mapW = 600f
    private val mapH = 740f
    private val hudH = hud.hudH
    private val speed = 220f
    private val playerSize = 60f

    private var playerX = 270f
    private var playerY = 100f
    private var isMoving = false

    // 门
    private val doorW = 64f;
    private val doorH = 96f
    private val doorX = 268f;
    private val doorY = mapH - doorH - 20f
    private val doorRect = Rectangle(doorX, doorY, doorW, doorH)
    private var nearDoor = false

    // NPC
    private val npcs = listOf(
        Triple(80f, 450f, "村民"),
        Triple(440f, 200f, "商人"),
        Triple(260f, 520f, "守卫")
    )

    // ── 按 M 弹出地图（场景一专属数据）────────────────────────────
    // 标记点坐标已归一化到 0~1（相对 mapW×mapH）
    private val mapOverlay = MapOverlay(
        sceneName = "场景一：村庄",
        mapMarkers = listOf(
            Triple(0.13f, 0.61f, "村民"),
            Triple(0.73f, 0.27f, "商人"),
            Triple(0.43f, 0.70f, "守卫"),
            Triple(0.45f, 0.93f, "传送门")
        )
    )

    private var elapsedTime = 0f

    // ── 是否显示资源演示说明 ────────────────────────────────────────
    private var showDemo = true   // 按 Tab 切换

    override fun show() {}

    override fun render(delta: Float) {
        elapsedTime += delta
        mapOverlay.handleInput()
        handleInput(delta)

        val playerRect = Rectangle(playerX, playerY, playerSize, playerSize)
        nearDoor = playerRect.overlaps(doorRect)

        // 推进动画时间（只在移动时）
        if (isMoving) stateTime += delta

        Gdx.gl.glClearColor(0f, 0f, 0f, 1f)
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT)

        // ── 1. 画场景背景 ───────────────────────────────────────────
        batch.begin()
        batch.setColor(1f, 1f, 1f, 1f)
        batch.draw(bgTexture, 0f, hudH, mapW, mapH)
        batch.end()

        // ── 2. ShapeRenderer：HUD 底栏 + NPC 圆圈 + 门高亮 ─────────
        Gdx.gl.glEnable(GL20.GL_BLEND)
        hud.renderBars(shapeRenderer)     // HUD 血条/蓝条（内部自己 begin/end）

        shapeRenderer.begin(ShapeRenderer.ShapeType.Filled)
        // NPC 圆圈
        for ((nx, ny, _) in npcs) {
            shapeRenderer.setColor(1f, 0.85f, 0.1f, 0.9f)
            shapeRenderer.circle(nx + 20f, hudH + ny + 20f, 22f)
        }
        // 门高亮
        shapeRenderer.setColor(if (nearDoor) 1f else 0.6f, 0.4f, 0f, 0.5f)
        shapeRenderer.rect(doorX - 4f, hudH + doorY - 4f, doorW + 8f, doorH + 8f)
        shapeRenderer.end()

        // 地图面板（带透明度，需在 BLEND 开启时）
        mapOverlay.renderPanel(
            shapeRenderer,
            playerNormX = playerX / mapW,
            playerNormY = playerY / mapH,
        )
        Gdx.gl.glDisable(GL20.GL_BLEND)

        // ── 3. SpriteBatch：门/玩家/NPC标签/HUD文字/演示说明 ────────
        batch.begin()

        // 门
        batch.setColor(1f, 1f, 1f, 1f)
        batch.draw(doorTexture, doorX, hudH + doorY, doorW, doorH)

        // 资源用法2：用动画帧绘制玩家（静止时取第0帧，移动时循环播放）
        val frame = if (isMoving) walkAnimation.getKeyFrame(stateTime)
        else walkFrames[0]
        batch.draw(frame, playerX, hudH + playerY, playerSize, playerSize)

        // NPC 标签
        for ((nx, ny, label) in npcs) {
            npcFont.draw(batch, label, nx, hudH + ny + 58f)
        }
        npcFont.draw(batch, "传送门", doorX - 4f, hudH + doorY + doorH + 20f)
        if (nearDoor) tipFont.draw(batch, "按 E 进入场景二", 170f, hudH + doorY - 20f)

        // 资源用法3：图集切片——右下角显示 4 个技能图标
        val iconY = hudH + 8f
        val iconSz = 44f
        for (i in iconSlices.indices) {
            batch.draw(iconSlices[i], mapW - (4 - i) * (iconSz + 4f), iconY, iconSz, iconSz)
        }

        // HUD 文字
        hud.renderText(batch)

        // 地图文字标签
        mapOverlay.renderText(batch)

        // 资源演示说明（按 Tab 切换）
        if (showDemo) {
            demoFont.draw(batch, "[Tab隐藏] 资源演示:", 10f, hudH + mapH - 10f)
            demoFont.draw(
                batch,
                "1.静态图->playerRegion  2.帧动画->走路切换帧  3.图集切片->右下角图标",
                10f,
                hudH + mapH - 28f
            )
        }
        demoFont.draw(
            batch,
            "WASD移动  M地图  ESC返回主菜单  Tab${if (showDemo) "隐藏" else "显示"}说明",
            10f,
            hudH + 14f
        )

        batch.end()

        // ── 按键逻辑 ─────────────────────────────────────────────────
        if (nearDoor && Gdx.input.isKeyJustPressed(Input.Keys.E)) {
            enterScene2()
        }
        if (Gdx.input.isKeyJustPressed(Input.Keys.ESCAPE)) {
            game.setScreen(TitleScreen(game, sharedAssets))
            dispose()
        }
        if (Gdx.input.isKeyJustPressed(Input.Keys.TAB)) {
            showDemo = !showDemo
        }
    }

    // walkFrames 快捷访问（避免重复调用 getKeyFrame）
    private val walkFrames: Array<TextureRegion> = run {
        val fw = walkStrip.width / 4
        val fh = walkStrip.height
        val grid = TextureRegion.split(walkStrip, fw, fh)
        grid[0]
    }

    private fun enterScene2() {
        game.setScreen(
            SceneLoadingScreen(
                game = game,
                sharedAssets = sharedAssets,
                sceneAssetLoader = { am -> am.load("scene2_bg.jpg", Texture::class.java) },
                nextScreen = { sceneAssets2 -> GameScreen2(game, sharedAssets, sceneAssets2, hud) }
            ))
        dispose()
    }

    private fun handleInput(delta: Float) {
        val dist = speed * delta
        isMoving = false
        if (Gdx.input.isKeyPressed(Input.Keys.W) || Gdx.input.isKeyPressed(Input.Keys.UP)) {
            playerY = (playerY + dist).coerceAtMost(mapH - playerSize); isMoving = true
        }
        if (Gdx.input.isKeyPressed(Input.Keys.S) || Gdx.input.isKeyPressed(Input.Keys.DOWN)) {
            playerY = (playerY - dist).coerceAtLeast(0f); isMoving = true
        }
        if (Gdx.input.isKeyPressed(Input.Keys.A) || Gdx.input.isKeyPressed(Input.Keys.LEFT)) {
            playerX = (playerX - dist).coerceAtLeast(0f); isMoving = true
        }
        if (Gdx.input.isKeyPressed(Input.Keys.D) || Gdx.input.isKeyPressed(Input.Keys.RIGHT)) {
            playerX = (playerX + dist).coerceAtMost(mapW - playerSize); isMoving = true
        }
    }

    override fun resize(width: Int, height: Int) {}
    override fun pause() {}
    override fun resume() {}
    override fun hide() {}

    override fun dispose() {
        batch.dispose()
        shapeRenderer.dispose()
        npcFont.dispose()
        tipFont.dispose()
        demoFont.dispose()
        walkStrip.dispose()
        atlasTexture.dispose()
        mapOverlay.dispose()
        // hud 由外部传入，生命周期由外部管理（不在这里 dispose）
        sceneAssets.dispose()
    }
}
