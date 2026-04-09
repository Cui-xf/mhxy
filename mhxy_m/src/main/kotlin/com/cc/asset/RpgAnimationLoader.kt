package com.cc.asset

import com.badlogic.gdx.assets.AssetDescriptor
import com.badlogic.gdx.assets.AssetLoaderParameters
import com.badlogic.gdx.assets.AssetManager
import com.badlogic.gdx.assets.loaders.AsynchronousAssetLoader
import com.badlogic.gdx.assets.loaders.FileHandleResolver
import com.badlogic.gdx.files.FileHandle
import com.badlogic.gdx.graphics.Pixmap
import com.badlogic.gdx.graphics.Texture
import com.badlogic.gdx.graphics.g2d.Animation
import com.badlogic.gdx.graphics.g2d.TextureRegion
import com.badlogic.gdx.math.Rectangle
import com.badlogic.gdx.utils.Disposable
import java.io.ByteArrayInputStream
import java.io.ByteArrayOutputStream
import java.io.DataInputStream

class RpgAnimationLoader(resolver: FileHandleResolver) :
    AsynchronousAssetLoader<RpgAnimationGroup, AssetLoaderParameters<RpgAnimationGroup>>(resolver) {
    private lateinit var ruleName: String
    private val textureCache = mutableMapOf<Short, PixmapGroup>()
    private lateinit var animationGroup: RpgAnimationGroup

    override fun loadAsync(
        manager: AssetManager,
        fileName: String,
        file: FileHandle,
        parameter: AssetLoaderParameters<RpgAnimationGroup>?
    ) {
        val rule = manager.get<RuleAsset>(ruleName)
        DataInputStream(ByteArrayInputStream(file.readBytes())).use { dis ->
            dis.skipBytes(24)  // 跳过魔法前缀
            val animationMap = mutableMapOf<Int, Animation<FramePack>>()
            for (rule in rule.rules) {
                val type = dis.readByte().toInt()
                val num = dis.readByte()
                val data = Array(num.toInt()) {
                    val size = dis.readInt()
                    ByteArray(size).also { dis.readFully(it) }
                }
                if (type == 0) {//静态图
                    textureCache[rule.id] = buildPixmapGroup(data)
                } else { //动画
                    animationMap[rule.key] = buildAnimation(data[0])
                }
            }
            animationGroup = RpgAnimationGroup(animationMap)
        }
    }

    private fun buildPixmapGroup(data: Array<ByteArray>): PixmapGroup {
        val metaDis = DataInputStream(ByteArrayInputStream(data[1]))
        val w = metaDis.readInt()
        val h = metaDis.readInt()
        val regionList = parseRegionList(data[0], w, h)
        val pixmap = parsePixmap(data)
        return PixmapGroup(pixmap, regionList)
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

    private fun buildAnimation(data: ByteArray): Animation<FramePack> {
        return DataInputStream(ByteArrayInputStream(data)).use { dis ->
            val packetNum = dis.readByte().toInt()
            // 跳过包围盒 x,y,w,h
            dis.readShort()
            dis.readShort()
            dis.readShort()
            dis.readShort()
            val packs = Array(packetNum) {
                val frames = mutableListOf<TransformFrame>()
                val frameNum = dis.readByte().toInt()
                repeat(frameNum) {
                    val id = dis.readShort()
                    //type
                    dis.readByte()
                    val transX = dis.readShort().toInt()
                    val transY = dis.readShort().toInt()
                    val index = dis.readShort().toInt()
                    val transFlag = dis.readByte().toInt()
                    val (flipX, flipY, rotation) = TRANSFORM_TABLE[transFlag]
                    frames += TransformFrame(id, index, transX, transY, flipX, flipY, rotation)
                }
                FramePack(frames)
            }
            val frameDuration = dis.readShort().toFloat() / 1000
            Animation(frameDuration, *packs)
        }
    }

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


    override fun loadSync(
        manager: AssetManager, fileName: String, file: FileHandle, parameter: AssetLoaderParameters<RpgAnimationGroup>?
    ): RpgAnimationGroup {
        animationGroup.animationMap.forEach { (_, animation) ->
            for (pack in animation.keyFrames) {
                for (frame in pack.frames) {
                    if (textureCache.containsKey(frame.id)) {
                        val group = textureCache[frame.id]!!
                        if (group.regionList.size > frame.index) {
                            val texture = Texture(group.pixmap)
                            val rect = group.regionList[frame.index]
                            frame.textureRegion = TextureRegion(
                                texture,
                                rect.x.toInt(),
                                rect.y.toInt(),
                                rect.width.toInt(),
                                rect.height.toInt()
                            )
                        }
                    }
                }
            }
        }
        textureCache.forEach { (_, group) ->
            group.pixmap.dispose()
        }

        return animationGroup
    }


    override fun getDependencies(
        fileName: String, file: FileHandle, parameter: AssetLoaderParameters<RpgAnimationGroup>?
    ): com.badlogic.gdx.utils.Array<AssetDescriptor<*>>? {
        ruleName = fileName.replace(".rpg", ".rule")
        return com.badlogic.gdx.utils.Array.with(RuleAssetDescriptor(ruleName))
    }
}

data class RpgAnimationGroup(val animationMap: Map<Int, Animation<FramePack>>) : Disposable {
    override fun dispose() {
        for (animation in animationMap.values) {
            for (pack in animation.keyFrames) {
                for (frame in pack.frames) {
                    frame.textureRegion.texture?.dispose()
                }
            }
        }
    }

    fun getAnimationByName(name: String): Animation<FramePack> {
        return animationMap[hashKey(name + "s")]!!
    }

    companion object {
        fun hashKey(name: String): Int {
            var hash = 0
            for (c in name.toCharArray()) hash = hash * 31 + c.code
            return hash
        }
    }
}

data class FramePack(val frames: List<TransformFrame>)

data class TransformFrame(
    val id: Short,
    val index: Int,
    val transX: Int, //x平移
    val transY: Int, //y平移
    val flipX: Boolean, //水平翻转
    val flipY: Boolean, //竖直翻转
    val rotation: Float,  //旋转
) {
    lateinit var textureRegion: TextureRegion //图像切片
}

data class PixmapGroup(val pixmap: Pixmap, val regionList: List<Rectangle>)
