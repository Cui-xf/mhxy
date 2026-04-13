//package com.cc.screens
//
//import com.badlogic.gdx.Gdx
//import com.badlogic.gdx.Screen
//import com.badlogic.gdx.assets.AssetManager
//import com.badlogic.gdx.graphics.GL20
//import com.badlogic.gdx.graphics.g2d.SpriteBatch
//import com.badlogic.gdx.graphics.glutils.ShapeRenderer
//import com.cc.asset.AssetManagerFactory
//import com.cc.FontManager
//import com.cc.MhxyGame
//
///**
// * 场景间过渡加载屏。
// * @param sharedAssets 公共资源（player 等），不由本屏释放
// * @param sceneAssetLoader 回调：往新建的 AssetManager 里注册场景专属资源
// * @param nextScreen 加载完成后构建目标 Screen 的工厂
// */
//class SceneLoadingScreen(
//    private val game: MhxyGame,
//    private val sharedAssets: AssetManager,
//    private val sceneAssetLoader: (AssetManager) -> Unit,
//    private val nextScreen: (AssetManager) -> Screen
//) : Screen {
//
//    private val batch = SpriteBatch()
//    private val shapeRenderer = ShapeRenderer()
//    private val font =FontManager.SMALL_FONT
//
//    private val sceneAssets = AssetManagerFactory.create()
//
//    init {
//        sceneAssetLoader(sceneAssets)
//    }
//
//    private var dotTimer = 0f
//    private var dotCount = 0
//
//    override fun show() {}
//
//    override fun render(delta: Float) {
//        sceneAssets.update()
//        val progress = sceneAssets.progress
//
//        dotTimer += delta
//        if (dotTimer >= 0.4f) {
//            dotTimer = 0f
//            dotCount = (dotCount + 1) % 4
//        }
//
//        Gdx.gl.glClearColor(0f, 0f, 0f, 1f)
//        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT)
//
//        val barX = 80f
//        val barY = 390f
//        val barW = 440f
//        val barH = 24f
//
//        shapeRenderer.begin(ShapeRenderer.ShapeType.Filled)
//        shapeRenderer.setColor(0.15f, 0.15f, 0.25f, 1f)
//        shapeRenderer.rect(barX, barY, barW, barH)
//        shapeRenderer.setColor(0.3f, 0.8f, 0.5f, 1f)
//        shapeRenderer.rect(barX, barY, barW * progress, barH)
//        shapeRenderer.end()
//
//        val dots = ".".repeat(dotCount)
//        batch.begin()
//        font.draw(batch, "场景加载中$dots  ${(progress * 100).toInt()}%", barX, barY - 10f)
//        batch.end()
//
//        if (sceneAssets.isFinished) {
//            game.setScreen(nextScreen(sceneAssets))
//            dispose()
//        }
//    }
//
//    override fun resize(width: Int, height: Int) {}
//    override fun pause() {}
//    override fun resume() {}
//    override fun hide() {}
//
//    override fun dispose() {
//        batch.dispose()
//        shapeRenderer.dispose()
//        font.dispose()
//        // sceneAssets 交给 nextScreen 管理，不在这里释放
//    }
//}
