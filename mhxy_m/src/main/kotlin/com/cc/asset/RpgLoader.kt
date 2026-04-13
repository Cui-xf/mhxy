package com.cc.asset

import com.badlogic.gdx.assets.loaders.AssetLoader
import com.badlogic.gdx.files.FileHandle
import com.badlogic.gdx.graphics.Pixmap
import com.badlogic.gdx.math.Rectangle
import java.io.ByteArrayInputStream
import java.io.ByteArrayOutputStream
import java.io.DataInputStream

//==========================
fun buildRpgTextureRegion(id: Short, key: Int?, dataProvider: DataProvider): RpgTextureRegion {
    val data = if (key == null) {
        dataProvider.get(id)
    } else {
        dataProvider.get(key)
    }
    val metaDis = DataInputStream(ByteArrayInputStream(data[1]))
    val w = metaDis.readInt()
    val h = metaDis.readInt()
    val regionList = parseRegionList(data[0], w, h)
    val pixmap = parsePixmap(data)
    return RpgTextureRegion(id, pixmap, regionList)
}

// PNG 格式常量（与原游戏一致）
private val PNG_HEADER = byteArrayOf(-119, 80, 78, 71, 13, 10, 26, 10)
private val PNG_IEND = byteArrayOf(0, 0, 0, 0, 73, 69, 78, 68, -82, 66, 96, -126)
private val PNG_CHUNKS = arrayOf("sBIT", "IHDR", "PLTE", "tRNS", "IDAT")

private fun parsePixmap(data: Array<ByteArray>): Pixmap {
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
    return Pixmap(out.toByteArray(), 0, out.size())
}

private fun parseRegionList(data0: ByteArray, w: Int, h: Int): List<Rectangle> {
    return if (data0.size > 4) {
        // data[0] 头2字节为 flags，从第3字节读切片
        DataInputStream(ByteArrayInputStream(data0, 2, data0.size - 2)).use { sliceDis ->
            val count = sliceDis.readByte().toInt() and 0xFF
            if (count == 0) {
                listOf(Rectangle(0f, 0f, w.toFloat(), h.toFloat()))
            } else {
                val regionList = mutableListOf<Rectangle>()
                repeat(count) {
                    regionList += Rectangle(
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
        listOf(Rectangle(0f, 0f, w.toFloat(), h.toFloat()))
    }
}

//==========================
fun buildRpgAnimationRes(id: Short, key: Int, dataProvider: DataProvider): RpgAnimationRes {
    val (frameDuration, data) = buildAnimation(dataProvider.get(key)[0])

    val picMap = mutableMapOf<Short, RpgTextureRegion>()
    data.flatMap { it.toList() }
        .map { it.resId }
        .distinct()
        .forEach { id ->
            val textureRegion = buildRpgTextureRegion(id, null, dataProvider)
            picMap[textureRegion.id] = textureRegion
        }
    return RpgAnimationRes(id, picMap, frameDuration, data)
}

private fun buildAnimation(data: ByteArray): Pair<Float, Array<Array<RpgFrame>>> {
    return DataInputStream(ByteArrayInputStream(data)).use { dis ->
        val packetNum = dis.readByte().toInt()
        // 跳过包围盒 x,y,w,h
        dis.readShort()
        dis.readShort()
        dis.readShort()
        dis.readShort()
        val data = Array(packetNum) {
            Array(dis.readByte().toInt()) {
                val id = dis.readShort()
                val type = dis.readByte()
                val transX = dis.readShort()
                val transY = dis.readShort()
                val index = dis.readShort()
                val transFlag = dis.readByte()
                RpgFrame(id, type, transX, transY, index, transFlag)
            }
        }
        val frameDuration = dis.readShort().toFloat() / 1000
        Pair(frameDuration, data)
    }
}

//==========================
fun hashKey(name: String): Int {
    var hash = 0
    for (c in name.toCharArray()) hash = hash * 31 + c.code
    return hash
}

fun parseResourceName(name: String): Pair<String, String> {
    val lastIndex = name.lastIndexOf("/")
    if (lastIndex != -1) {
        return Pair(name.substring(0, lastIndex), name.substring(lastIndex + 1))
    } else {
        throw RuntimeException("无效的资源名称")
    }
}

interface DataProvider {
    fun get(key: Int): Array<ByteArray>

    fun get(id: Short): Array<ByteArray>


    fun readRpgFileData(file: FileHandle) =
        DataInputStream(ByteArrayInputStream(file.readBytes())).use { dis ->
            dis.readShort()
            dis.readByte()
            val num = dis.readByte()
            Array(num.toInt()) {
                val size = dis.readInt()
                ByteArray(size).also { dis.readFully(it) }
            }
        }
}

class DirDataProvider(
    private val assetLoader: AssetLoader<*, *>,
    private val ruleAsset: RuleAsset,
    private val dir: String,
) : DataProvider {
    override fun get(key: Int): Array<ByteArray> {
        val rule = ruleAsset.getRuleByKey(key)!!
        val file = assetLoader.resolve("${dir}/${rule.id}.rpg")
        return readRpgFileData(file)
    }

    override fun get(id: Short): Array<ByteArray> {
        val file = assetLoader.resolve("${dir}/${id}.rpg")
        return readRpgFileData(file)
    }
}

class SingleDataProvider(
    assetLoader: AssetLoader<*, *>,
    ruleAsset: RuleAsset,
    file: String,
) : DataProvider {
    private val dataCache = mutableMapOf<Rule, Array<ByteArray>>()

    init {
        DataInputStream(ByteArrayInputStream(assetLoader.resolve("${file}.rpg").readBytes())).use { dis ->
            dis.skipBytes(24)  // 跳过魔法前缀
            for (rule in ruleAsset.rules) {
                val type = dis.readByte().toInt()
                val n = dis.readByte()
                val data = Array(n.toInt()) {
                    val size = dis.readInt()
                    ByteArray(size).also { dis.readFully(it) }
                }
                dataCache[rule] = data
            }
        }
    }

    override fun get(key: Int): Array<ByteArray> {
        dataCache.forEach { (rule, data) ->
            if (rule.key == key) {
                return data
            }
        }
        throw RuntimeException("资源不存在,key=${key}")
    }

    override fun get(id: Short): Array<ByteArray> {
        dataCache.forEach { (rule, data) ->
            if (rule.id == id) {
                return data
            }
        }
        throw RuntimeException("资源不存在,id=${id}")
    }
}