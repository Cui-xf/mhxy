package com.cc.asset

import com.badlogic.gdx.assets.AssetDescriptor
import com.badlogic.gdx.assets.AssetLoaderParameters
import com.badlogic.gdx.assets.AssetManager
import com.badlogic.gdx.assets.loaders.AsynchronousAssetLoader
import com.badlogic.gdx.assets.loaders.FileHandleResolver
import com.badlogic.gdx.files.FileHandle
import com.badlogic.gdx.graphics.g2d.Animation
import com.badlogic.gdx.graphics.g2d.TextureRegion
import com.badlogic.gdx.utils.Disposable
import java.io.ByteArrayInputStream
import java.io.DataInputStream


class RpgAnimationLoader(resolver: FileHandleResolver) :
    AsynchronousAssetLoader<RpgAnimation, AssetLoaderParameters<RpgAnimation>>(resolver) {
    private var rpgAnimationComponent: RpgAnimationComponent? = null

    override fun loadAsync(
        assetManager: AssetManager,
        name: String,
        file: FileHandle,
        param: AssetLoaderParameters<RpgAnimation>?
    ) {
        val (fileName, name) = parseResourceName(name)
        val ruleAsset = assetManager.get<RuleAsset>("${fileName}.rule")
        rpgAnimationComponent = loadAnimation(ruleAsset, fileName, name)
    }

    private fun loadAnimation(ruleAsset: RuleAsset, file: String, name: String): RpgAnimationComponent? {
        val key = hashKey("${name}s")
        val component = RpgAnimationComponent()
        if (file.endsWith("icon") || file.endsWith("petfight") || file.endsWith("role")) {
            val rule = ruleAsset.getRuleByKey(key) ?: return null
            val fileHandle = resolve("${file}/${rule.id}.rpg")
            if (!fileHandle.exists()) return null
            DataInputStream(ByteArrayInputStream(fileHandle.readBytes())).use { dis ->
                val (frameDuration, data) = buildAnimation(readDirFileData(dis)[0])
                component.setData(rule, frameDuration, data)
                data.flatMap { it.toList() }
                    .map { it[0] as Short }
                    .distinct()
                    .forEach { id ->
                        loadPixmapFromFile("${file}/${id}.rpg", id)?.let { component.addPixmap(it) }
                    }
            }
            return component
        } else {
            DataInputStream(ByteArrayInputStream(resolve("${file}.rpg").readBytes())).use { dis ->
                dis.skipBytes(24)  // 跳过魔法前缀
                for (rule in ruleAsset.rules) {
                    val type = dis.readByte().toInt()
                    val n = dis.readByte()
                    val data = Array(n.toInt()) {
                        val size = dis.readInt()
                        ByteArray(size).also { dis.readFully(it) }
                    }
                    if (type == 0) {//静态图
                        component.addPixmap(buildPixmap(rule.id, data))
                    } else if (rule.key == key) { //动画
                        val (frameDuration, data) = buildAnimation(data[0])
                        component.setData(rule, frameDuration, data)
                    }
                }
            }
            return component
        }
    }

    private fun loadPixmapFromFile(file: String, id: Short): RpgTextureRegionComponent? {
        val file = resolve(file)
        if (!file.exists()) return null
        DataInputStream(ByteArrayInputStream(file.readBytes())).use { dis ->
            return buildPixmap(id, readDirFileData(dis))
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

    private fun buildAnimation(data: ByteArray): Pair<Float, Array<Array<Array<*>>>> {
        return DataInputStream(ByteArrayInputStream(data)).use { dis ->
            val packetNum = dis.readByte().toInt()
            // 跳过包围盒 x,y,w,h
            dis.readShort()
            dis.readShort()
            dis.readShort()
            dis.readShort()
            val data = Array(packetNum) {
                Array<Array<*>>(dis.readByte().toInt()) {
                    val id = dis.readShort()
                    //type
                    dis.readByte()
                    val transX = dis.readShort().toInt()
                    val transY = dis.readShort().toInt()
                    val index = dis.readShort().toInt()
                    val transFlag = dis.readByte().toInt()
                    val (flipX, flipY, rotation) = TRANSFORM_TABLE[transFlag]
                    arrayOf<Any>(id, index, transX, transY, flipX, flipY, rotation)
                }
            }
            val frameDuration = dis.readShort().toFloat() / 1000
            Pair(frameDuration, data)
        }
    }

    override fun loadSync(
        assetManager: AssetManager,
        name: String,
        file: FileHandle,
        param: AssetLoaderParameters<RpgAnimation>?
    ): RpgAnimation {
        val animation = rpgAnimationComponent?.assemble() ?: throw RuntimeException(name)
        rpgAnimationComponent = null
        return animation
    }

    override fun getDependencies(
        name: String,
        file: FileHandle,
        param: AssetLoaderParameters<RpgAnimation>?
    ): com.badlogic.gdx.utils.Array<AssetDescriptor<*>?>? {
        val (fileName) = parseResourceName(name)
        return com.badlogic.gdx.utils.Array.with(RuleAssetDescriptor("${fileName}.rule"))
    }
}

class RpgAnimationComponent {
    private val picMap = mutableMapOf<Short, RpgTextureRegionComponent>()
    private var rule: Rule? = null
    private var frameDuration: Float? = null
    private var data: Array<Array<Array<*>>>? = null


    fun addPixmap(pic: RpgTextureRegionComponent) {
        picMap[pic.id] = pic
    }

    fun setData(rule: Rule, frameDuration: Float, data: Array<Array<Array<*>>>) {
        this.rule = rule
        this.frameDuration = frameDuration
        this.data = data
    }

    fun assemble(): RpgAnimation? {
        if (rule == null || frameDuration == null || data == null) {
            return null
        }

        val frames = data!!.map { arr ->
            arr.map { frame ->
//                id, index, transX, transY, flipX, flipY, rotation
                val id = frame[0] as Short
                val index = frame[1] as Int
                val transX = frame[2] as Int
                val transY = frame[3] as Int
                val flipX = frame[4] as Boolean
                val flipY = frame[5] as Boolean
                val rotation = frame[6] as Float
                val textureRegion = picMap[id]?.assemble(index)
                if (textureRegion==null){
                    throw RuntimeException("aaa")
                }
                Frame(transX, transY, flipX, flipY, rotation, textureRegion)
            }.toList()
        }.toTypedArray()
        return RpgAnimation(frameDuration!!, frames)
    }
}

class RpgAnimation(frameDuration: Float, frames: Array<List<Frame>>) :
    Animation<List<Frame>>(frameDuration, *frames), Disposable {
    override fun dispose() {
        for (frames in keyFrames) {
            for (frame in frames) {
                frame.textureRegion.texture.dispose()
            }
        }
    }
}

data class Frame(
    val transX: Int, //x平移
    val transY: Int, //y平移
    val flipX: Boolean, //水平翻转
    val flipY: Boolean, //竖直翻转
    val rotation: Float,  //旋转
    val textureRegion: TextureRegion //图像切片
)
