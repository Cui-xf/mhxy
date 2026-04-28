import com.cc.asset.*
import com.cc.util.ceilDiv
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
                listOf(Rect(0, 0, w, h))
            } else {
                val regionList = mutableListOf<Rect>()
                repeat(count) {
                    regionList += Rect(
                        sliceDis.readShort().toInt(),
                        sliceDis.readShort().toInt(),
                        sliceDis.readShort().toInt(),
                        sliceDis.readShort().toInt()
                    )
                }
                regionList
            }
        }
    } else {
        listOf(Rect(0, 0, w, h))
    }
}

//==========================
fun buildAnimation(data: ByteArray, ruleAsset: RuleAsset): Anim {
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
        Anim(frameDuration, data)
    }
}

// PngUtil.i[] = {0,5,3,6,2,7,1,4}：将 transformFlag(0-7) 映射到 J2ME TRANS 常量
// J2ME TRANS: 0=NONE, 1=MIRROR_ROT180(垂直翻转), 2=MIRROR(水平翻转),
//             3=ROT180, 4=MIRROR_ROT270, 5=ROT90(顺时针90°),
//             6=ROT270(顺时针270°), 7=MIRROR_ROT90
// libGDX rotation 逆时针为正，J2ME ROT90(顺时针90°) → libGDX rotation = 270f
private val TRANSFORM_TABLE = arrayOf(
    // flipX,  flipY,  rotation(libGDX逆时针)
    Triple(false, false, 0f),    // flag=0 → TRANS_NONE
    Triple(false, false, 270f),  // flag=1 → TRANS_ROT90   (顺时针90°  = 逆时针270°)
    Triple(false, false, 180f),  // flag=2 → TRANS_ROT180
    Triple(false, false, 90f),   // flag=3 → TRANS_ROT270  (顺时针270° = 逆时针90°)
    Triple(true,  false, 0f),    // flag=4 → TRANS_MIRROR  (水平翻转)
    Triple(true,  false, 270f),  // flag=5 → TRANS_MIRROR_ROT90
    Triple(true,  false, 180f),  // flag=6 → TRANS_MIRROR_ROT180 (垂直翻转 = 水平翻转+180°)
    Triple(true,  false, 90f),   // flag=7 → TRANS_MIRROR_ROT270
)

private fun buildFrame(dis: DataInputStream, ruleAsset: RuleAsset): PicTransIdx {
    val id = dis.readShort()
    val type = dis.readByte()
    val transX = dis.readShort()
    val transY = dis.readShort()
    val index = dis.readShort()
    val transFlag = dis.readByte()

    val (flipX, flipY, rotation) = TRANSFORM_TABLE[transFlag.toInt()]
    val rule = ruleAsset.getRuleById(id)!!
    val pic = "${rule.id}_${rule.key}.pic"
    return PicTransIdx(pic, index.toInt(), transX.toInt(), transY.toInt(), flipX, flipY, rotation)
}

//==========================
fun buildMapMate(data: ByteArray, ruleAsset: RuleAsset): TileMapMate {
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
            }.toMutableList()
        }.toMutableList()
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

        val fixedObj = mutableListOf<PicTransIdx>()
        val fixedObjCount = dis.readShort().toInt()
        fixedObj.addAll(Array(fixedObjCount) {
            buildFrame(dis, ruleAsset)
        }.toList())

        val moveObjCount = dis.readShort().toInt()
        fixedObj.addAll(Array(moveObjCount) {
            buildFrame(dis, ruleAsset)
        }.toList())

        TileMapMate(
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
            emptyList()
        )
    }
}