package render

import Act
import Appearance
import buildResId
import com.badlogic.gdx.graphics.g2d.SpriteBatch
import com.badlogic.gdx.graphics.glutils.ShapeRenderer
import com.cc.asset.AssetManagerFactory.PUBLIC_ASSET
import com.cc.asset.RpgAnimation
import com.cc.render.drawAnimation
import com.cc.screens.AbstractScreen
import com.cc.ui.component.ScrollPanel
import com.cc.ui.component.UIComponent


object RoleAnimTest : AbstractScreen() {
    val map = listOf(
        "ride_89_-2033939862.anim",
        "ride_88_1372371880.anim",
        "ride_96_-2033939831.anim",
        "ride_97_1372372841.anim",

        "ride_90_-2033910071.anim",
        "ride_91_1373295401.anim",
        "ride_95_1373296362.anim",
        "ride_94_-2033910040.anim",
        ).map {
        resource(PUBLIC_ASSET, "rpg/role/${it}", RpgAnimation::class)
    }


    private val sc = ScrollPanel(this.assetLoader) {
        add(object : UIComponent(assetLoader) {
            override fun render(
                batch: SpriteBatch,
                sr: ShapeRenderer,
                cx: Float,
                cy: Float,
                cw: Float,
                ch: Float,
                delta: Float
            ) {
                anim(delta, cy)
            }

            override fun preferredHeight(width: Float): Float {
                return 2500f
            }
        })
    }

    private var timer = 0f
    private var dY = 0f
    override fun update(delta: Float) {
        sc.render(batch, sr, 0f, 0f, VIRTUAL_W, VIRTUAL_H, delta)
    }

    private fun anim(delta: Float, cy: Float) {
        timer += delta
        batch.begin()
        for (lazy in map) {
            val frame = lazy.value.getKeyFrame(timer, true)
            dY += frame[0].textureRegion.texture.height * 1.3f
            batch.drawAnimation(frame, VIRTUAL_W / 2, cy + dY)
        }
        batch.end()
        dY = 0f
    }
}


