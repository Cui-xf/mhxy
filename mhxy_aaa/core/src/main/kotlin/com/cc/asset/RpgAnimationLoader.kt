package com.cc.asset

import com.badlogic.gdx.assets.AssetDescriptor
import com.badlogic.gdx.assets.AssetLoaderParameters
import com.badlogic.gdx.assets.AssetManager
import com.badlogic.gdx.assets.loaders.AsynchronousAssetLoader
import com.badlogic.gdx.assets.loaders.FileHandleResolver
import com.badlogic.gdx.files.FileHandle
import com.badlogic.gdx.graphics.Pixmap
import com.badlogic.gdx.graphics.g2d.Animation
import com.badlogic.gdx.graphics.g2d.TextureRegion
import com.badlogic.gdx.utils.Disposable
import com.badlogic.gdx.utils.JsonReader
import com.badlogic.gdx.utils.JsonValue
import com.cc.parseResourceName


class RpgAnimationLoader(resolver: FileHandleResolver) :
    AsynchronousAssetLoader<RpgAnimation, AssetLoaderParameters<RpgAnimation>>(resolver) {
    private var anim: Anim? = null
    private val picMap = mutableMapOf<String, Pair<Pic, Pixmap>>()

    override fun loadAsync(
        assetManager: AssetManager,
        name: String,
        file: FileHandle,
        param: AssetLoaderParameters<RpgAnimation>?
    ) {
        val (dir, name) = parseResourceName(name)
        val loadAnim = loadAnim(dir, name)
        loadAnim.frames.flatMap { it.toList() }
            .forEach {
                if (picMap[it.pic] == null) {
                    val pic = loadPic(dir, it.pic)
                    picMap[it.pic] = pic
                }
            }
        anim = loadAnim
    }

    override fun loadSync(
        assetManager: AssetManager,
        name: String,
        file: FileHandle,
        param: AssetLoaderParameters<RpgAnimation>?
    ): RpgAnimation {
        return anim?.toRpgAnimation(picMap)
            ?.also {
                anim = null
                picMap.clear()
            } ?: throw RuntimeException("资源加载失败:${name}")
    }

    override fun getDependencies(
        name: String,
        file: FileHandle,
        param: AssetLoaderParameters<RpgAnimation>?
    ): com.badlogic.gdx.utils.Array<AssetDescriptor<*>?>? {
        return null
    }
}

fun loadAnim(dir: String, anim: String): Anim {
    val fileName = "${dir}/${anim}"
    val json = ClassLoader.getSystemResourceAsStream(fileName)
        ?.bufferedReader()?.readText()
        ?: throw RuntimeException("找不到资源: $fileName")
    return JsonReader().parse(json).toAnim()
}

fun JsonValue.toAnim(): Anim {
    val duration = getFloat("duration")
    val frames = mutableListOf<List<PicTransIdx>>()
    var frameItem = get("frames").child
    while (frameItem != null) {
        val list = mutableListOf<PicTransIdx>()
        var picItem = frameItem.child
        while (picItem != null) {
            list.add(picItem.toPicTransIdx())
            picItem = picItem.next
        }
        frames.add(list)
        frameItem = frameItem.next
    }
    return Anim(duration, frames)
}

fun JsonValue.toPicTransIdx(): PicTransIdx {
    return PicTransIdx(
        pic = getString("pic"),
        index = getInt("index"),
        transX = getInt("transX"),
        transY = getInt("transY"),
        flipX = getBoolean("flipX"),
        flipY = getBoolean("flipY"),
        rotation = getFloat("rotation")
    )
}

fun Anim.toRpgAnimation(picMap: Map<String, Pair<Pic, Pixmap>>): RpgAnimation {
    val array = frames.map { list ->
        list.map { transIdx -> transIdx.toFrame(picMap) }
    }.toTypedArray()
    return RpgAnimation(duration, array)
}

fun PicTransIdx.toFrame(picMap: Map<String, Pair<Pic, Pixmap>>): Frame {
    val (picFile, index, transX, transY, flipX, flipY, rotation) = this
    val (pic, png) = picMap[picFile]!!
    val textureRegion = pic.toTextureRegion(index, png)
    return Frame(transX, transY, flipX, flipY, rotation, textureRegion)
}

data class Anim(
    val duration: Float,
    val frames: List<List<PicTransIdx>>,
)

data class PicTransIdx(
    val pic: String,
    val index: Int,
    val transX: Int, //x平移
    val transY: Int, //y平移
    val flipX: Boolean, //水平翻转
    val flipY: Boolean, //竖直翻转
    val rotation: Float,  //旋转
)

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
