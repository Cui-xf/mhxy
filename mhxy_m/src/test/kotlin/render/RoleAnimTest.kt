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

        "ride_151_-110029281.anim",
        "ride_150_884057747.anim",
        "ride_131_-110029250.anim",
        "ride_132_884058708.anim",

        "ride_152_-109999490.anim",
        "ride_153_884981268.anim",
        "ride_106_-109999459.anim",
        "ride_105_884982229.anim",


        "ride_146_-111876323.anim",
        "ride_147_826799445.anim",
        "ride_136_-111876292.anim",
        "ride_135_826800406.anim",


        "ride_148_-111846532.anim",
        "ride_149_827722966.anim",
        "ride_134_-111846501.anim",
        "ride_133_827723927.anim",

        "ride_142_-110952802.anim",
        "ride_143_855428596.anim",
        "ride_140_-110952771.anim",
        "ride_139_855429557.anim",


        "ride_145_-110923011.anim",
        "ride_144_856352117.anim",
        "ride_137_-110922980.anim",
        "ride_138_856353078.anim",
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


