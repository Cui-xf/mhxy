package com.cc.screens.game

import com.badlogic.gdx.Gdx
import com.badlogic.gdx.Input
import com.badlogic.gdx.graphics.g2d.SpriteBatch
import com.badlogic.gdx.graphics.glutils.ShapeRenderer
import com.cc.asset.AssetManagerFactory.PUBLIC_ASSET
import com.cc.asset.CommonAssetLoader
import com.cc.asset.RpgAnimation
import com.cc.asset.role.buildRoleResId
import com.cc.render.drawAnimation
import com.cc.screens.fight.model.*
import com.cc.ui.component.UIComponent

object Player : UIComponent(CommonAssetLoader) {
    lateinit var map: ScreenMap

    private val rightIdle by resource(
        PUBLIC_ASSET,
        buildRoleResId(RoleJob.FCS, RoleGender.Girl, Appearance.Default, Ride.Tiger, Dir.Right, RoleAnimState.Idle),
        RpgAnimation::class
    )

    private val rightMove by resource(
        PUBLIC_ASSET,
        buildRoleResId(RoleJob.FCS, RoleGender.Girl, Appearance.Default, Ride.Tiger, Dir.Right, RoleAnimState.Move),
        RpgAnimation::class
    )

    private val leftIdle by resource(
        PUBLIC_ASSET,
        buildRoleResId(RoleJob.FCS, RoleGender.Girl, Appearance.Default, Ride.Tiger, Dir.Left, RoleAnimState.Idle),
        RpgAnimation::class
    )

    private val leftMove by resource(
        PUBLIC_ASSET,
        buildRoleResId(RoleJob.FCS, RoleGender.Girl, Appearance.Default, Ride.Tiger, Dir.Left, RoleAnimState.Move),
        RpgAnimation::class
    )


    private var animTime = 0f

    //朝左
    private var facingLeft = false
    private val speed = 80f
    var roleMapX = 300f
    var roleMapY = 500f

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
        animTime += delta
        if (moving) {
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
        }

        val screenX = roleMapX - map.camX
        val screenY = roleMapY - map.camY

        val anim = if (facingLeft) {
            if (moving) leftMove else leftIdle
        } else {
            if (moving) rightMove else rightIdle
        }
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