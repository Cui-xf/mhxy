import com.cc.asset.*
import com.cc.ceilDiv
import java.io.ByteArrayInputStream
import java.io.ByteArrayOutputStream
import java.io.DataInputStream

//==========================
fun buildRpgTextureRegion(data: Array<ByteArray>, pngName: String): Pair<Pic, ByteArray> {
    val metaDis = DataInputStream(ByteArrayInputStream(data[1]))
    val w = metaDis.readInt()
    val h = metaDis.readInt()
    val regionList = parseRegionList(data[0], w, h)
    val pic = Pic(pngName, regionList)
    val pixmap = parsePixmap(data)
    return Pair(pic, pixmap)
}

// PNG 格式常量（与原游戏一致）
val PNG_HEADER = byteArrayOf(-119, 80, 78, 71, 13, 10, 26, 10)
val PNG_IEND = byteArrayOf(0, 0, 0, 0, 73, 69, 78, 68, -82, 66, 96, -126)
val PNG_CHUNKS = arrayOf("sBIT", "IHDR", "PLTE", "tRNS", "IDAT")

fun parsePixmap(data: Array<ByteArray>): ByteArray {
    val out = ByteArrayOutputStream()
    out.write(PNG_HEADER)
    for (i in 1 until data.size) {
        if (data[i].size > 4) {
            val chunkName = PNG_CHUNKS[if (i > 4) 4 else i]
            val bytes = data[i]
            val contentLen = bytes.size - 4
            val arr = ByteArray(bytes.size + 8)
            arr[0] = (contentLen shr 24).toByte()
            arr[1] = (contentLen shr 16).toByte()
            arr[2] = (contentLen shr 8).toByte()
            arr[3] = contentLen.toByte()
            chunkName.toByteArray().copyInto(arr, 4)
            bytes.copyInto(arr, 8)
            out.write(arr)
        }
    }
    out.write(PNG_IEND)
    return out.toByteArray()
}

fun parseRegionList(data0: ByteArray, w: Int, h: Int): List<Rect> {
    return if (data0.size > 4) {
        // data[0] 头2字节为 flags，从第3字节读切片
        DataInputStream(ByteArrayInputStream(data0, 2, data0.size - 2)).use { sliceDis ->
            val count = sliceDis.readByte().toInt() and 0xFF
            if (count == 0) {
                listOf(Rect(0f, 0f, w.toFloat(), h.toFloat()))
            } else {
                val regionList = mutableListOf<Rect>()
                repeat(count) {
                    regionList += Rect(
                        sliceDis.readShort().toFloat(),
                        sliceDis.readShort().toFloat(),
                        sliceDis.readShort().toFloat(),
                        sliceDis.readShort().toFloat()
                    )
                }
                regionList
            }
        }
    } else {
        listOf(Rect(0f, 0f, w.toFloat(), h.toFloat()))
    }
}

//==========================
fun buildAnimation(data: ByteArray, ruleAsset: RuleAsset): AnimT {
    return DataInputStream(ByteArrayInputStream(data)).use { dis ->
        val packetNum = dis.readByte().toInt()
        // 跳过包围盒 x,y,w,h
        dis.readShort()
        dis.readShort()
        dis.readShort()
        dis.readShort()
        val data = Array(packetNum) {
            Array(dis.readByte().toInt()) {
                buildFrame(dis, ruleAsset)
            }.toList()
        }.toList()
        val frameDuration = dis.readShort().toFloat() / 1000
        AnimT(frameDuration, data)
    }
}

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

private fun buildFrame(dis: DataInputStream, ruleAsset: RuleAsset): FrameT {
    val id = dis.readShort()
    val type = dis.readByte()
    val transX = dis.readShort()
    val transY = dis.readShort()
    val index = dis.readShort()
    val transFlag = dis.readByte()

    val (flipX, flipY, rotation) = TRANSFORM_TABLE[transFlag.toInt()]
    val rule = ruleAsset.getRuleById(id)!!
    val pic = "${rule.id}_${rule.key}.pic"
    if (type.toInt() == 1) {
        println("type = 1 ,id = $id index = $index")
    }
    return FrameT(pic, index.toInt(), transX.toInt(), transY.toInt(), flipX, flipY, rotation)
}

//==========================
fun buildMapMate(data: ByteArray, ruleAsset: RuleAsset): TileMapT {
    return DataInputStream(ByteArrayInputStream(data)).use { dis ->
        //spriteIdHsl
        val n = dis.readByte().toInt()
        dis.skipBytes(n * 4 * 2)
        val mapW = dis.readShort().toInt()
        val mapH = dis.readShort().toInt()
        val blockW = dis.readByte().toInt()
        val blockH = dis.readByte().toInt()
        val collisionW = dis.readByte().toInt()
        val collisionH = dis.readByte().toInt()
        val column = mapW ceilDiv blockW
        val row = mapH ceilDiv blockH

        val collisionCols: Int = mapW ceilDiv collisionW
        val collisionRows: Int = mapH ceilDiv collisionH
        val collisionBit = Array(collisionCols) {
            Array(collisionRows) {
                false
            }
        }
        val collisionCount = dis.readShort().toInt()
        repeat(collisionCount) {
            val i = dis.readShort().toInt()
            collisionBit[i % collisionCols][i / collisionCols] = true
        }

        val mapBlock = Array(column) {
            Array(row) {
                if (dis.readByte() >= 0) {
                    buildFrame(dis, ruleAsset)
                } else {
                    null
                }
            }.toList()
        }.toList()

        val fixedObjCount = dis.readShort().toInt()
        val fixedObj = Array(fixedObjCount) {
            buildFrame(dis, ruleAsset)
        }.toList()

        val moveObjCount = dis.readShort().toInt()
        val moveObj = Array(moveObjCount) {
            buildFrame(dis, ruleAsset)
        }.toList()
        TileMapT(
            mapW,
            mapH,
            blockW,
            blockH,
            collisionW,
            collisionH,
            row,
            column,
            mapBlock,
            collisionBit,
            fixedObj,
            moveObj
        )
    }
}