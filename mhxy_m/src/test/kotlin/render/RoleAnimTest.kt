package render

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
        "ride_184_-2091198164.anim",
        "ride_181_-402635482.anim",
        "ride_169_-2091198133.anim",
        "ride_172_-402634521.anim",


        "ride_183_-2091168373.anim",
        "ride_182_-401711961.anim",
        "ride_170_-2091168342.anim",
        "ride_171_-401711000.anim",


        "ride_185_-2093045206.anim",
        "ride_180_-459893784.anim",
        "ride_168_-2093045175.anim",
        "ride_173_-459892823.anim",


        "ride_186_-2093015415.anim",
        "ride_179_-458970263.anim",
        "ride_167_-2093015384.anim",
        "ride_174_-458969302.anim",



        "ride_188_-2092121685.anim",
        "ride_177_-431264633.anim",
        "ride_176_-2092121654.anim",
        "ride_165_-431263672.anim",


        "ride_187_-2092091894.anim",
        "ride_178_-430341112.anim",
        "ride_166_-2092091863.anim",
        "ride_175_-430340151.anim",
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
            dY += 80f
            batch.drawAnimation(frame, VIRTUAL_W / 2, cy + dY + 100)
        }
        batch.end()
        dY = 0f
    }
}


