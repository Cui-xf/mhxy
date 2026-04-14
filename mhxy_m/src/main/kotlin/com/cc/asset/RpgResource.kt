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
                it.toFrame(picMap)
            }.toList()
        }.toTypedArray()
        return RpgAnimation(frameDuration, frames)
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

class RpgTileMapMate(
    val mapW: Int,
    val mapH: Int,
    val blockW: Int,
    val blockH: Int,

    //碰撞格
    val collisionW: Int,
    val collisionH: Int,

    //图块行列
    val row: Int,
    val column: Int,

    //地面图块网格：j[col][row]，每格一个 SpritePiece，null 表示空格
    val mapBlock: Array<Array<RpgFrame?>>,

    //碰撞图：i[col][row] == 1 表示该格不可通行
    val collisionBit: Array<Array<Boolean>>,
    val fixedObj: Array<RpgFrame>,
    val moveObj: Array<RpgFrame>,
)

class RpgTileMap(
    private val mate: RpgTileMapMate,
    private val picMap: Map<Short, RpgTextureRegion>,
    private val animMap: Map<Short, RpgAnimationRes>,
) {
    fun toTileMap(): TileMap {
        val mapBlock = mate.mapBlock.map { row ->
            row.map { block ->
                block?.toFrame(picMap)
            }
        }
        val fixedObj = mate.fixedObj.map { it.toFrame(picMap) }
        val moveObj = mate.moveObj.filter { it.type.toInt() == 0 }.map { it.toFrame(picMap) }
        val animationObj = mate.moveObj.filter { it.type.toInt() == 2 }.map { frame ->
            TransAnimation(
                frame.transX.toInt(),
                frame.transY.toInt(),
                animMap[frame.resId]!!.toRpgAnimation()
            )
        }
        return TileMap(
            mate.mapW,
            mate.mapH,
            mate.blockW,
            mate.blockH,
            mate.collisionW,
            mate.collisionH,
            mate.row,
            mate.column,
            mapBlock,
            mate.collisionBit,
            fixedObj,
            moveObj,
            animationObj,
        )
    }
}

//====================
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

fun RpgFrame.toFrame(picMap: Map<Short, RpgTextureRegion>): Frame {
    val (flipX, flipY, rotation) = TRANSFORM_TABLE[this.transFlag.toInt()]
    val textureRegion = picMap[this.resId]!!.toTextureRegion(this.index.toInt())
    return Frame(this.transX.toInt(), this.transY.toInt(), flipX, flipY, rotation, textureRegion)
}