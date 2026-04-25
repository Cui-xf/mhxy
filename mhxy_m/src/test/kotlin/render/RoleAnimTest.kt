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
        "ride_110_-2062569013.anim",
        "ride_111_484868199.anim",
        "ride_126_-2062568982.anim",
        "ride_125_484869160.anim",

        "ride_109_-2062539222.anim",
        "ride_108_485791720.anim",
        "ride_128_-2062539191.anim",
        "ride_129_485792681.anim",

        "ride_115_-2064416055.anim",
        "ride_114_427609897.anim",
        "ride_121_-2064416024.anim",
        "ride_122_427610858.anim",

        "ride_113_-2064386264.anim",
        "ride_112_428533418.anim",
        "ride_123_-2064386233.anim",
        "ride_124_428534379.anim",



        "ride_107_-2063492534.anim",
        "ride_118_456239048.anim",
        "ride_130_-2063492503.anim",
        "ride_127_456240009.anim",


        "ride_116_-2063462743.anim",
        "ride_117_457162569.anim",
        "ride_120_-2063462712.anim",
        "ride_119_457163530.anim",

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


