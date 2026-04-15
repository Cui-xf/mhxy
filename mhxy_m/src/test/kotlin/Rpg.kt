import com.badlogic.gdx.math.Rectangle
import com.cc.asset.*
import java.io.*

fun main() {

    val file = "/Users/cxf/temp/mhxy/mhxy_s/res/cartoon.rpg"
//    val file = "/Users/cxf/temp/mhxy/mhxy_s/res/role/0.rpg"
//    val file = "/Users/cxf/temp/mhxy/mhxy_s/res/map/843096143.rpg"
    val names = listOf("cartoon","skill")
    for (name in names) {
        val num = type1("/Users/cxf/temp/mhxy/mhxy_s/res/${name}.rpg")
        val ruleAsset = parseRuleAsset(File("/Users/cxf/temp/mhxy/mhxy_s/res/${name}.rule").readBytes())
        if (num == ruleAsset.rules.size) {
            println("数量匹配成功:${num}")
        } else {
            println("数量匹配失败:文件解析 = $num rule解析 = ${ruleAsset.rules.size}")
        }
    }
}

fun type1(file: String): Int {
    var num = 0
    val parse1 = parse1(file)
    if (parse1 != null) {
        println("parse1 解析成功")
        for (arrays in parse1) {
            println("parse1=================")
            tryPic(arrays)?.let { num++ }
            tryAnim(arrays[0])?.let { num++ }
            tryTileMap(arrays[0])?.let { num++ }
        }
    } else {
        println("parse1 解析失败")
    }
    val parse2 = parse2(file)
    if (parse2 != null) {
        println("parse2 解析成功")
        println("parse2=================")
        tryPic(parse2)?.let { num++ }
        tryAnim(parse2[0])?.let { num++ }
        tryTileMap(parse2[0])?.let { num++ }
    } else {
        println("parse2 解析失败")
    }
    return num
}

fun parse1(file: String): List<Array<ByteArray>>? {
    try {
        val list = mutableListOf<Array<ByteArray>>()
        DataInputStream(FileInputStream(file)).use { dis ->
            dis.skipBytes(24)  // 跳过魔法前缀
            while (dis.available() > 0) {
                val type = dis.readByte().toInt()
                val n = dis.readByte()
                val data = Array(n.toInt()) {
                    val size = dis.readInt()
                    ByteArray(size).also { dis.readFully(it) }
                }
                list += data
            }
        }
        return list
    } catch (e: Exception) {
        e.printStackTrace()
        return null
    }
}

fun parse2(file: String): Array<ByteArray>? {
    try {
        return DataInputStream(FileInputStream(file)).use { dis ->
            dis.readShort()
            dis.readByte()
            val num = dis.readByte()
            Array(num.toInt()) {
                val size = dis.readInt()
                ByteArray(size).also { dis.readFully(it) }
            }
        }
    } catch (e: Throwable) {
        e.printStackTrace()
        return null
    }
}

fun tryPic(data: Array<ByteArray>): Pair<List<Rectangle>, ByteArray>? {
    try {
        val metaDis = DataInputStream(ByteArrayInputStream(data[1]))
        val w = metaDis.readInt()
        val h = metaDis.readInt()
        val regionList = parseRegionList(data[0], w, h)

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
        val png = out.toByteArray()
        println("尝试解码图片成功")
        return Pair(regionList, png)
    } catch (e: Throwable) {
        println("尝试解码图片失败")
        return null
    }
}

fun tryAnim(data: ByteArray): Pair<Float, Array<Array<RpgFrame>>>? {
    return try {
        buildAnimation(data).also {
            println("尝试解码动画成功")
        }
    } catch (e: Throwable) {
        println("尝试解码动画失败")
        null
    }
}

fun tryTileMap(data: ByteArray): RpgTileMapMate? {
    try {
        return buildMapMate(data).also {
            println("尝试解码地图成功")
        }
    } catch (e: Throwable) {
        println("尝试解码地图失败")
        return null
    }
}
