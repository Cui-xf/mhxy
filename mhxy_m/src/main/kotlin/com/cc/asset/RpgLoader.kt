package com.cc.asset

import com.badlogic.gdx.files.FileHandle
import com.badlogic.gdx.graphics.Pixmap
import com.badlogic.gdx.math.Rectangle
import java.io.ByteArrayInputStream
import java.io.ByteArrayOutputStream
import java.io.DataInputStream

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

fun buildPixmap(id: Short, data: Array<ByteArray>): RpgTextureRegionComponent {
    val metaDis = DataInputStream(ByteArrayInputStream(data[1]))
    val w = metaDis.readInt()
    val h = metaDis.readInt()
    val regionList = parseRegionList(data[0], w, h)
    val pixmap = parsePixmap(data)
    return RpgTextureRegionComponent(id, pixmap, regionList)
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

