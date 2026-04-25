package render

import com.badlogic.gdx.graphics.g2d.SpriteBatch
import com.badlogic.gdx.graphics.g2d.TextureRegion
import com.badlogic.gdx.graphics.glutils.ShapeRenderer
import com.cc.asset.AssetManagerFactory.PUBLIC_ASSET
import com.cc.asset.RpgAnimation
import com.cc.render.drawAnimation
import com.cc.render.drawImage
import com.cc.screens.AbstractScreen
import com.cc.screens.fight.model.SKILLS
import com.cc.ui.component.ScrollPanel
import com.cc.ui.component.UIComponent


object SkillTest : AbstractScreen() {
    val anim = SKILLS.map {
        resource(PUBLIC_ASSET, "rpg/skill/${it.resId}.anim", RpgAnimation::class)
    }

    val pic = SKILLS.map {
        resource(PUBLIC_ASSET, "rpg/icon/${it.icon}.pic", TextureRegion::class)
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
        for ((anim, pic) in anim.zip(pic)) {
            val frame = anim.value.getKeyFrame(timer, true)
            dY += 80f
            batch.drawAnimation(frame, VIRTUAL_W / 4, cy + dY + 100)

            batch.drawImage(pic.value, VIRTUAL_W / 4 * 3, cy + dY + 100)
        }
        batch.end()
        dY = 0f
    }
}


