package com.cc.screens.game

import com.badlogic.gdx.Gdx
import com.badlogic.gdx.Input
import com.badlogic.gdx.graphics.g2d.SpriteBatch
import com.badlogic.gdx.graphics.glutils.ShapeRenderer
import com.cc.asset.AssetLoader
import com.cc.asset.AssetManagerFactory.PUBLIC_ASSET
import com.cc.asset.RpgAnimation
import com.cc.render.drawAnimation
import com.cc.ui.component.UIComponent

class Player(assetLoader: AssetLoader, private val map: ScreenMap) : UIComponent(assetLoader) {
    // 朝右动画（向右/向下移动），方向后缀0；格式：{gender}{job}{variant}{dirSuffix}
    private val animRight by resource(PUBLIC_ASSET, "rpg/role/3101.anim", RpgAnimation::class)
//    private val animRight by resource(PUBLIC_ASSET, "rpg/role/171_-401711000.anim", RpgAnimation::class)
//    private val animRight by resource(PUBLIC_ASSET, "rpg/role/170_-2091168342.anim", RpgAnimation::class)

    // 朝左动画（向左/向上移动），方向后缀1
    private val animLeft by resource(PUBLIC_ASSET, "rpg/role/3100.anim", RpgAnimation::class)
//    private val animLeft by resource(PUBLIC_ASSET, "rpg/role/182_-401711961.anim", RpgAnimation::class)
//    private val animLeft by resource(PUBLIC_ASSET, "rpg/role/183_-2091168373.anim", RpgAnimation::class)


    private var animTime = 0f

    //朝左
    private var facingLeft = false
    private val speed = 80f
    var roleMapX = 100f
    var roleMapY = 100f

    override fun render(
        batch: SpriteBatch,
        sr: ShapeRenderer,
        cx: Float,
        cy: Float,
        cw: Float,
        ch: Float,
        delta: Float
    ) {
        val (dx, dy) = handleInput(delta)
        val moving = dx != 0f || dy != 0f
        animTime += delta * 0.5f
        if (moving) {
            animTime += delta
            // 更新朝向：左/上朝左，右/下朝右
            facingLeft = when {
                dx < 0f -> true
                dx > 0f -> false
                dy < 0f -> true
                else -> false
            }
            val (newX, newY) = map.collisionMove(roleMapX, dx, roleMapY, dy)
            roleMapX = newX
            roleMapY = newY
        } else {
            animTime = 0f
        }

        val screenX = roleMapX - map.camX
        val screenY = roleMapY - map.camY

        val anim = if (facingLeft) animLeft else animRight
        val frames = anim.getKeyFrame(animTime, true)

        batch.begin()
        batch.drawAnimation(frames, screenX, screenY)
        batch.end()
    }

    private fun handleInput(delta: Float): Pair<Float, Float> {
        // 处理移动输入
        val dx = when {
            Gdx.input.isKeyPressed(Input.Keys.RIGHT) || Gdx.input.isKeyPressed(Input.Keys.D) -> speed * delta
            Gdx.input.isKeyPressed(Input.Keys.LEFT) || Gdx.input.isKeyPressed(Input.Keys.A) -> -speed * delta
            else -> 0f
        }
        val dy = when {
            Gdx.input.isKeyPressed(Input.Keys.DOWN) || Gdx.input.isKeyPressed(Input.Keys.S) -> speed * delta
            Gdx.input.isKeyPressed(Input.Keys.UP) || Gdx.input.isKeyPressed(Input.Keys.W) -> -speed * delta
            else -> 0f
        }
        return Pair(dx, dy)
    }
}