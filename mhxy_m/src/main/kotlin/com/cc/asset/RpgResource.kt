package com.cc.asset

import com.badlogic.gdx.graphics.Pixmap
import com.badlogic.gdx.graphics.Texture
import com.badlogic.gdx.graphics.g2d.TextureRegion
import com.badlogic.gdx.math.Rectangle

open class RpgResource(val id: Short, val type: Byte)

class RpgTextureRegion(
    id: Short,
    val pixmap: Pixmap,
    val regionList: List<Rectangle>
) : RpgResource(id, 0) {
    fun toTextureRegion(index: Int?): TextureRegion {
        if (index != null && index < regionList.size) {
            val rect = regionList[index]
            return TextureRegion(
                Texture(pixmap),
                rect.x.toInt(),
                rect.y.toInt(),
                rect.width.toInt(),
                rect.height.toInt()
            )
        } else {
            return TextureRegion(Texture(pixmap))
        }
    }
}

class RpgAnimationRes(
    id: Short,
    val picMap: Map<Short, RpgTextureRegion>,
    val frameDuration: Float,
    val frames: Array<Array<RpgFrame>>,
) : RpgResource(id, 3) {
    fun toRpgAnimation(): RpgAnimation {
        val frames = frames.map { arr ->
            arr.map {
                val (flipX, flipY, rotation) = TRANSFORM_TABLE[it.transFlag.toInt()]
                val textureRegion = picMap[it.resId]!!.toTextureRegion(it.index.toInt())
                Frame(it.transX.toInt(), it.transY.toInt(), flipX, flipY, rotation, textureRegion)
            }.toList()
        }.toTypedArray()
        return RpgAnimation(frameDuration, frames)
    }

    companion object {
        /**
         * 原始 PngUtil.i[] 变换表：transformFlag(0-7) → J2ME drawRegion transform。
         * 映射到 libGDX 的 (flipX, flipY, rotation) 三元组：
         *   J2ME: 0=无, 1=rot90CW, 2=rot180, 3=rot270CW(=rot90CCW),
         *         4=flipH, 5=flipH+rot90CW, 6=flipV(=rot180+flipH), 7=flipH+rot270CW
         * i[] = {0,5,3,6,2,7,1,4}，即 transformFlag=0 → J2ME_0，transformFlag=1 → J2ME_5，…
         */
        private val TRANSFORM_TABLE = arrayOf(
            // flipX,  flipY,  rotation
            Triple(false, false, 0f),    // flag=0 → J2ME 0 = 无变换
            Triple(true, false, 90f),   // flag=1 → J2ME 5 = flipH + rot90CW
            Triple(false, false, 180f),  // flag=2 → J2ME 3 = rot270CW = rot90CCW = 180+rot90CW → rot180
            Triple(true, false, 270f),  // flag=3 → J2ME 6 = flipV = flipH+rot180
            Triple(false, false, 90f),   // flag=4 → J2ME 2 = rot180
            Triple(true, false, 270f),  // flag=5 → J2ME 7 = flipH + rot270CW
            Triple(false, false, 270f),  // flag=6 → J2ME 1 = rot90CW
            Triple(true, false, 0f),    // flag=7 → J2ME 4 = flipH
        )
    }
}

class RpgFrame(
    val resId: Short,
    val type: Byte,
    val transX: Short, //x平移
    val transY: Short, //y平移
    val index: Short,
    val transFlag: Byte
)