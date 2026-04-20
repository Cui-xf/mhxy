import com.badlogic.gdx.Game
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration
import com.badlogic.gdx.graphics.g2d.TextureRegion
import com.cc.asset.AssetManagerFactory.PUBLIC_ASSET
import com.cc.asset.RpgAnimation
import com.cc.render.Align
import com.cc.render.drawAnimation
import com.cc.render.drawImage
import com.cc.screens.AbstractScreen

fun main() {
    val config = Lwjgl3ApplicationConfiguration().apply {
        setTitle("Demo")
//        setWindowedMode(480, 640)
        setWindowedMode(240, 320)
        setResizable(true)
        setForegroundFPS(60)
    }
    try {
        Lwjgl3Application(TestGame, config)
    } catch (e: Exception) {
        e.printStackTrace()
    }
}

object TestScreen : AbstractScreen() {
    private val anim = listOf(
        "rpg/role/ride_200_1914870686.anim",
        "rpg/role/ride_199_-1462250572.anim",
        "rpg/role/ride_198_1913947165.anim",
        "rpg/role/ride_157_1886242496.anim",
    ).also {
//        nameTrans(it)
    }.map {
        resource(PUBLIC_ASSET, it, RpgAnimation::class)
    }

    private val pic = listOf(
        "rpg/ui/fightnum.pic",
    ).also {
        nameTrans(it)
    }.map {
        resource(PUBLIC_ASSET, it, TextureRegion::class)
    }


    private var timer = 0f
    private var dY = 0f
    override fun update(delta: Float) {
        anim(delta)
//        pic(delta)
    }

    private fun pic(delta: Float) {
        timer += delta
        batch.begin()
        for (lazy in pic) {
            batch.drawImage(lazy.value, 0f, dY, align = Align.LEFT_TOP)
            dY += lazy.value.regionHeight * 1.3f
        }
        batch.end()
        dY = 0f
    }

    private fun anim(delta: Float) {
        timer += delta
        batch.begin()
        for (lazy in anim) {
            val frame = lazy.value.getKeyFrame(timer, true)
            dY += frame[0].textureRegion.texture.height * 1.3f
            batch.drawAnimation(frame, VIRTUAL_W / 2, dY)
        }
        batch.end()
        dY = 0f
    }
}

object TestGame : Game() {
    override fun create() {
        setScreen(TestScreen)
    }
}

