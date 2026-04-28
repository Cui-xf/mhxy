package render

import com.badlogic.gdx.graphics.g2d.TextureRegion
import com.cc.asset.AssetManagerFactory.PUBLIC_ASSET
import com.cc.asset.RpgAnimation
import com.cc.render.*
import com.cc.screens.AbstractScreen
import nameTrans

object TestScreen2 : AbstractScreen() {
    override fun update(delta: Float) {
        val path = listOf(
            Pair(0f, 0f),   //顶点1
            Pair(0f, 50f),  //顶点2 和顶点1-4 在一条直线
            Pair(0f, 50f),  //顶点3 和顶点1-4 在一条直线
            Pair(0f, 100f), //顶点4
            Pair(100f, 100f),
            Pair(100f, 50f),
            Pair(50f, 50f),
            Pair(50f, 0f),
        )
        sr.surround(
            path, listOf(
                Pair(1, 26540.toColor()),
                Pair(1, 11267556.toColor()),
                Pair(1, 26540.toColor()),
            )
        )

//        val rect2 = Rectangle(0f, 110f, 100f, 100f)
//        sr.surround(rect2.toPath(), listOf(Pair(3, 26540.toColor())))
//        sr.surround(rect2.toPath(), listOf(Pair(2, 11267556.toColor())))
//        sr.surround(rect2.toPath(), listOf(Pair(1, 26540.toColor())))
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
