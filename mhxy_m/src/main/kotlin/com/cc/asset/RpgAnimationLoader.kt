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
import com.badlogic.gdx.utils.Array
import com.badlogic.gdx.utils.Disposable
import java.io.ByteArrayInputStream
import java.io.ByteArrayOutputStream
import java.io.DataInputStream

class RpgAnimationGroup(private val list: List<RpgPart>) : Disposable {

    override fun dispose() {
//        for (animation in animations) {
//            for (frame in animation.keyFrames) {
//                frame?.texture?.dispose()
//            }
//        }
    }

    fun getAnimation(): Animation<TextureRegion> {
        //todo cxf
    }
}

class RpgPart(val list: List<AnimationGroup>)

class AnimationGroup(val animation: Animation<TextureRegion>)

class TextureRegionGroup(val texture: Texture, val regionList: List<Rectangle>)

private val SKIP_SIZE = "版权归苏龙德所有".toByteArray(Charsets.UTF_8).size

class RpgAnimationLoader(resolver: FileHandleResolver) :
    AsynchronousAssetLoader<RpgAnimationGroup, AssetLoaderParameters<RpgAnimationGroup>>(resolver) {
    private lateinit var ruleName: String
    private val textureCache = mutableMapOf<Rule, TextureRegionGroup>()
    private val animationCache = mutableMapOf<Rule, TextureRegionGroup>()

    override fun loadAsync(
        manager: AssetManager,
        fileName: String,
        file: FileHandle,
        parameter: AssetLoaderParameters<RpgAnimationGroup>?
    ) {
        val rule = manager.get<RuleAsset>(ruleName)
        DataInputStream(ByteArrayInputStream(file.readBytes())).use { dis ->
            dis.read(ByteArray(SKIP_SIZE))  // 跳过魔法前缀
            for (rule in rule.rules) {
                val type = dis.readByte().toInt()
                val num = dis.readByte()
                val data = Array(num.toInt()) {
                    val size = dis.readInt()
                    ByteArray(size).also { dis.readFully(it) }
                }
                when (type) {
                    1 -> {
                        textureCache[rule] = buildSprite(data)
                    }

                    2 -> buildAnimation(data[0])
                    else -> throw RuntimeException("资源类型错误,不是RpgAnimation")
                }
            }

            // 回填每个 SpritePiece 的 spriteFrame 引用
            for (anim in animCache.values) {
                for (pieces in anim.spritePieces) {
                    for (piece in pieces) {
                        piece.spriteFrame = spriteCache[piece.spriteId]
                    }
                }
            }
        }

    }

    private fun buildSprite(data: kotlin.Array<ByteArray>): TextureRegionGroup {
        val metaDis = DataInputStream(ByteArrayInputStream(data[1]))
        val w = metaDis.readInt()
        val h = metaDis.readInt()
        val regionList = parseRegionList(data[0], w, h)
        val texture = parseTexture(data)
        return TextureRegionGroup(texture, regionList)
    }

    // PNG 格式常量（与原游戏一致）
    private val PNG_HEADER = byteArrayOf(-119, 80, 78, 71, 13, 10, 26, 10)
    private val PNG_IEND = byteArrayOf(0, 0, 0, 0, 73, 69, 78, 68, -82, 66, 96, -126)
    private val PNG_CHUNKS = arrayOf("sBIT", "IHDR", "PLTE", "tRNS", "IDAT")

    private fun parseTexture(data: kotlin.Array<ByteArray>): Texture {
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
        val pixmap = Pixmap(out.toByteArray(), 0, out.size())
        val texture = Texture(pixmap)
        pixmap.dispose()
        return texture
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

    private fun buildAnimation(data: ByteArray): AnimationGroup {
        DataInputStream(ByteArrayInputStream(data)).use { dis ->
            val num = dis.readByte().toInt()
            // 跳过包围盒 x,y,w,h
            dis.readShort()
            dis.readShort()
            dis.readShort()
            dis.readShort()
            val frames = Array(num) {
                val pieceCount = dis.readByte().toInt() and 0xFF
                Array(pieceCount) {
                    SpritePiece(
                        spriteId = dis.readShort(),
                        type = dis.readByte(),
                        transformX = dis.readShort(),
                        transformY = dis.readShort(),
                        imageSliceIndex = dis.readShort(),
                        transformFlag = dis.readByte()
                    )
                }
            }
            val frameInterval = dis.readShort()
            return AnimationFrame(frames, frameInterval)
        }
    }

    override fun loadSync(
        manager: AssetManager,
        fileName: String,
        file: FileHandle,
        parameter: AssetLoaderParameters<RpgAnimationGroup>?
    ): RpgAnimationGroup {
        return animation
    }


    override fun getDependencies(
        fileName: String,
        file: FileHandle,
        parameter: AssetLoaderParameters<RpgAnimationGroup>?
    ): Array<AssetDescriptor<*>>? {
        ruleName = fileName.replace(".rpg", ".rule")
        return Array.with(RuleAssetDescriptor(ruleName))
    }
}
