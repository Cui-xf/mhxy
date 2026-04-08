package com.cc.screens

import com.badlogic.gdx.Gdx
import com.badlogic.gdx.Input
import com.badlogic.gdx.Screen
import com.badlogic.gdx.graphics.GL20
import com.badlogic.gdx.graphics.Texture
import com.badlogic.gdx.graphics.g2d.Animation
import com.badlogic.gdx.utils.Array as GdxArray
import com.badlogic.gdx.graphics.g2d.SpriteBatch
import com.badlogic.gdx.graphics.g2d.TextureRegion
import com.cc.FontManager
import com.cc.MhxyGame

/**
 * 演示三种资源的用法：
 *   区域1（上）  —— 静态图片
 *   区域2（中）  —— 帧动画（基于时间序列切割 strip 图）
 *   区域3（下）  —— 图集切片（从一张图上按坐标截取）
 */
class ResourceDemoScreen(
    private val game: MhxyGame,
    private val sharedAssets: com.badlogic.gdx.assets.AssetManager
) : Screen {

    private val batch = SpriteBatch()
    private val font  = FontManager.SMALL_FONT

    // ─────────────────────────────────────────────
    // 1. 静态图片
    //    最简单的用法：Texture 直接对应一张完整图片。
    //    TextureRegion 可以指定只取其中一部分（这里取全部）。
    // ─────────────────────────────────────────────
    private val staticTexture = Texture(Gdx.files.classpath("assets/player.jpg"))
    // TextureRegion 包裹整张图，后续可统一用 TextureRegion 传递
    private val staticRegion  = TextureRegion(staticTexture)

    // ─────────────────────────────────────────────
    // 2. 帧动画
    //    walk_strip.jpg 是一张 512×128 的横向 strip，
    //    里面横排了 4 帧，每帧 128×128。
    //    步骤：
    //      a. 加载整张 Texture
    //      b. 用 TextureRegion.split() 按帧尺寸切割成二维数组
    //      c. 展平成一维数组交给 Animation
    //      d. 每帧 render 时用 animation.getKeyFrame(stateTime) 取当前帧
    // ─────────────────────────────────────────────
    private val walkStrip   = Texture(Gdx.files.classpath("assets/walk_strip.jpg"))

    private val walkFrames: Array<TextureRegion> = run {
        val frameW = walkStrip.width / 4      // 每帧宽度 = 总宽 / 帧数
        val frameH = walkStrip.height         // 每帧高度 = 图片高度（单行）
        // split 返回 Array<Array<TextureRegion>>，行×列
        val grid = TextureRegion.split(walkStrip, frameW, frameH)
        // 展平：取第 0 行的全部列
        grid[0]
    }

    // LOOP 表示循环播放；0.15f 是每帧持续秒数
    // LibGDX Animation 接受自己的 GdxArray，不是 Kotlin Array
    private val walkAnimation = Animation(0.15f, GdxArray(walkFrames)).also {
        it.playMode = Animation.PlayMode.LOOP
    }
    private var stateTime     = 0f   // 累计时间，用来驱动动画

    // ─────────────────────────────────────────────
    // 3. 图集切片（TextureRegion 手动裁剪）
    //    ui_atlas.jpg 是 256×256 的图，
    //    假设里面按 2×2 排列了 4 个 UI 元素，每个 128×128。
    //    用 TextureRegion(texture, x, y, w, h) 按像素坐标截取。
    //
    //    注意：LibGDX 的纹理坐标原点在左上角，
    //    但 SpriteBatch.draw 的坐标原点在左下角，框架内部会自动翻转。
    // ─────────────────────────────────────────────
    private val atlasTexture = Texture(Gdx.files.classpath("assets/ui_atlas.jpg"))

    // 截取 4 个切片，参数：(原图, 起始x, 起始y, 宽, 高)  —— 像素坐标，原点左上
    private val slices = arrayOf(
        TextureRegion(atlasTexture,   0,   0, 128, 128),  // 左上
        TextureRegion(atlasTexture, 128,   0, 128, 128),  // 右上
        TextureRegion(atlasTexture,   0, 128, 128, 128),  // 左下
        TextureRegion(atlasTexture, 128, 128, 128, 128)   // 右下
    )

    // ─────────────────────────────────────────────
    // render：每帧把三种资源分区域绘制到屏幕
    // 屏幕竖屏 600×800，分三个水平区域：
    //   静态图片  y: 540~740
    //   帧动画    y: 280~480
    //   图集切片  y:  20~260
    // ─────────────────────────────────────────────
    override fun render(delta: Float) {
        stateTime += delta  // 推进动画时间

        Gdx.gl.glClearColor(0.1f, 0.1f, 0.15f, 1f)
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT)

        batch.begin()

        // ── 区域1：静态图片 ──────────────────────────
        // draw(TextureRegion, x, y, width, height)
        batch.draw(staticRegion, 220f, 560f, 160f, 160f)
        font.draw(batch, "1. 静态图片 TextureRegion", 10f, 750f)

        // ── 区域2：帧动画 ────────────────────────────
        // getKeyFrame(stateTime) 根据当前累计时间返回对应帧的 TextureRegion
        val currentFrame: TextureRegion = walkAnimation.getKeyFrame(stateTime)
        batch.draw(currentFrame, 220f, 320f, 160f, 160f)
        font.draw(batch, "2. 帧动画 Animation  帧:${walkAnimation.getKeyFrameIndex(stateTime)+1}/4", 10f, 510f)

        // ── 区域3：图集切片 ──────────────────────────
        // 4个切片各自渲染，每个 120×120，横排
        val sliceY = 80f
        val labels = arrayOf("左上", "右上", "左下", "右下")
        slices.forEachIndexed { i, region ->
            batch.draw(region, 20f + i * 140f, sliceY, 120f, 120f)
        }
        font.draw(batch, "3. 图集切片 TextureRegion(x,y,w,h)", 10f, 270f)
        labels.forEachIndexed { i, label ->
            font.draw(batch, label, 30f + i * 140f, sliceY - 4f)
        }

        font.draw(batch, "ESC 返回", 10f, 20f)
        batch.end()

        if (Gdx.input.isKeyJustPressed(Input.Keys.ESCAPE)) {
            game.setScreen(TitleScreen())
            dispose()
        }
    }

    override fun show() {}
    override fun resize(width: Int, height: Int) {}
    override fun pause() {}
    override fun resume() {}
    override fun hide() {}

    override fun dispose() {
        batch.dispose()
        font.dispose()
        // Texture 需要手动释放，TextureRegion 只是视图，不持有 GPU 资源
        staticTexture.dispose()
        walkStrip.dispose()
        atlasTexture.dispose()
        // walkAnimation / slices / staticRegion 不需要 dispose，它们只是对 Texture 的引用
    }
}
