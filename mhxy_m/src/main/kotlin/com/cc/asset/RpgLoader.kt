//package com.cc.asset
//
//import com.badlogic.gdx.graphics.Pixmap
//import com.badlogic.gdx.graphics.Texture
//import com.badlogic.gdx.utils.Disposable
//import java.io.ByteArrayInputStream
//import java.io.ByteArrayOutputStream
//import java.io.DataInputStream
//
//// ──────────────────────────────────────────────
//// 数据模型
//// ──────────────────────────────────────────────
//
///** 对应原始 ImageSlice：图集中一个子区域 */
//data class ImageSlice(val x: Short, val y: Short, val w: Short, val h: Short)
//
///** 对应原始 Sprite：一张 Texture + 切片列表 */
//class SpriteFrame(
//    val texture: Texture,
//    val w: Short,
//    val h: Short,
//    val slices: Array<ImageSlice>
//) {
//    fun getSlice(index: Short): ImageSlice? = slices.getOrNull(index.toInt())
//}
//
///** 对应原始 SpritePiece：动画一帧内的最小绘制单元 */
//class SpritePiece(
//    val spriteId: Short,
//    val type: Byte,              // 0=Sprite static, 2=Animation nested
//    val transformX: Short,
//    val transformY: Short,
//    val imageSliceIndex: Short,
//    val transformFlag: Byte      // 0-7，对应原始 i[] 变换表
//) {
//    var spriteFrame: SpriteFrame? = null  // boundCal 后回填
//}
//
///** 对应原始 Animation：多帧 × 多 SpritePiece，自带播放状态 */
//class AnimationFrame(
//    val spritePieces: Array<Array<SpritePiece>>,
//    val frameInterval: Short
//) {
//    var currentFrameIndex: Int = 0
//    var lastTs: Long = System.currentTimeMillis()
//
//    val frameCount: Int get() = spritePieces.size
//
//    fun advance(nowMs: Long) {
//        if (nowMs - lastTs - frameInterval > 0) {
//            currentFrameIndex = (currentFrameIndex + 1) % frameCount
//            lastTs = nowMs
//        }
//    }
//
//    fun currentPieces(): Array<SpritePiece> = spritePieces[currentFrameIndex]
//}
//
//// ──────────────────────────────────────────────
//// rule / rpg 解析器
//// ──────────────────────────────────────────────
//
//private data class FrameInfo(val key: Int, val id: Short)
//
///**
// * 解析并持有一个 .rule / .rpg 资源包（从 classpath 读取）。
// *
// * 用法：
// *   val loader = RpgLoader("cartoon")
// *   loader.load()
// *   val anim = loader.getAnimationByName("hudie")
// */
//class RpgLoader(private val name: String) : Disposable {
//
//    private val frameInfos = mutableListOf<FrameInfo>()
//    private val spriteCache = mutableMapOf<Short, SpriteFrame>()
//    private val animCache   = mutableMapOf<Int, AnimationFrame>()
//
//    fun load() {
//        loadRpg()
//    }
//
//    // ── rule ──────────────────────────────────────
//    // 格式：short count, 每条 (int key, short id)
//
//
//
//    // ── rpg ──────────────────────────────────────
//    // 格式：skip(魔法前缀) + [type(byte) + len(byte) + len×(size(int)+data(byte[size]))]
//
//
//
//
//
//    // ── Sprite 构建 ───────────────────────────────
//    // data[0]: short flags + byte sliceCount + sliceCount×(short x,y,w,h)
//    // data[1]: int w + int h
//    // data[2..]: PNG chunk 裸数据（含末尾4字节CRC）
//
//    private fun buildSprite(data: Array<ByteArray>): SpriteFrame {
//        val metaDis = DataInputStream(ByteArrayInputStream(data[1]))
//        val w = metaDis.readInt().toShort()
//        val h = metaDis.readInt().toShort()
//
//        val slices: Array<ImageSlice> = if (data[0].size > 4) {
//            // data[0] 头2字节为 flags，从第3字节读切片
//            val sliceDis = DataInputStream(ByteArrayInputStream(data[0], 2, data[0].size - 2))
//            val count = sliceDis.readByte().toInt() and 0xFF
//            if (count == 0) {
//                arrayOf(ImageSlice(0, 0, w, h))
//            } else {
//                Array(count) {
//                    ImageSlice(
//                        sliceDis.readShort(), sliceDis.readShort(),
//                        sliceDis.readShort(), sliceDis.readShort()
//                    )
//                }
//            }
//        } else {
//            arrayOf(ImageSlice(0, 0, w, h))
//        }
//
//        val pngBytes = assemblePng(data)
//        val pixmap = Pixmap(pngBytes, 0, pngBytes.size)
//        val texture = Texture(pixmap)
//        pixmap.dispose()
//
//        return SpriteFrame(texture, w, h, slices)
//    }
//
//    // PNG 格式常量（与原游戏一致）
//    private val PNG_HEADER = byteArrayOf(-119, 80, 78, 71, 13, 10, 26, 10)
//    private val PNG_IEND   = byteArrayOf(0, 0, 0, 0, 73, 69, 78, 68, -82, 66, 96, -126)
//    private val PNG_CHUNKS = arrayOf("sBIT", "IHDR", "PLTE", "tRNS", "IDAT")
//
//    /** 将 rpg 中的裸 chunk data 重新组装成合法 PNG 字节流 */
//    private fun assemblePng(data: Array<ByteArray>): ByteArray {
//        val out = ByteArrayOutputStream()
//        out.write(PNG_HEADER)
//        for (i in 1 until data.size) {
//            if (data[i].size > 4) {
//                val chunkName = PNG_CHUNKS[if (i > 4) 4 else i]
//                out.write(wrapPngChunk(chunkName, data[i]))
//            }
//        }
//        out.write(PNG_IEND)
//        return out.toByteArray()
//    }
//
//    /**
//     * 将裸数据包装成 PNG chunk 格式：[4字节长度][4字节名称][数据][CRC已在data末尾]
//     * data 末尾已有4字节CRC，所以 content length = data.size - 4
//     */
//    private fun wrapPngChunk(name: String, data: ByteArray): ByteArray {
//        val contentLen = data.size - 4
//        val out = ByteArray(data.size + 8)
//        out[0] = (contentLen shr 24).toByte()
//        out[1] = (contentLen shr 16).toByte()
//        out[2] = (contentLen shr 8).toByte()
//        out[3] = contentLen.toByte()
//        name.toByteArray().copyInto(out, 4)
//        data.copyInto(out, 8)
//        return out
//    }
//
//
//
//    // ── 查询接口 ──────────────────────────────────
//
//    /** 按资源名查找动画（name 不含后缀） */
//    fun getAnimationByName(name: String): AnimationFrame? =
//        animCache[hashKey((name + "s").toCharArray())]
//
//    override fun dispose() {
//        spriteCache.values.forEach { it.texture.dispose() }
//        spriteCache.clear()
//        animCache.clear()
//    }
//
//    companion object {
//        fun hashKey(name: CharArray): Int {
//            var hash = 0
//            for (c in name) hash = hash * 31 + c.code
//            return hash
//        }
//    }
//}
