package com.cc.asset

import com.badlogic.gdx.assets.AssetDescriptor
import com.badlogic.gdx.assets.AssetLoaderParameters
import com.badlogic.gdx.assets.AssetManager
import com.badlogic.gdx.assets.loaders.AsynchronousAssetLoader
import com.badlogic.gdx.assets.loaders.FileHandleResolver
import com.badlogic.gdx.files.FileHandle
import com.badlogic.gdx.graphics.Pixmap
import com.badlogic.gdx.graphics.Texture
import com.badlogic.gdx.graphics.g2d.TextureRegion
import com.badlogic.gdx.utils.JsonReader
import com.badlogic.gdx.utils.JsonValue
import com.cc.parseResourceName


class RpgPicLoader(resolver: FileHandleResolver) :
    AsynchronousAssetLoader<TextureRegion, AssetLoaderParameters<TextureRegion>>(resolver) {
    private var pic: Pic? = null
    private var png: Pixmap? = null

    override fun loadAsync(
        assetManager: AssetManager,
        name: String,
        f: FileHandle,
        param: AssetLoaderParameters<TextureRegion>?
    ) {
        val (dir, name) = parseResourceName(name)
        val (first, second) = loadPic(dir, name)
        pic = first
        png = second
    }


    override fun loadSync(
        assetManager: AssetManager,
        name: String,
        file: FileHandle,
        param: AssetLoaderParameters<TextureRegion>?
    ): TextureRegion {
        return pic?.toTextureRegion(0, png!!)
            .also {
                pic = null
                png = null
            } ?: throw RuntimeException("资源加载失败:${name}")
    }

    override fun getDependencies(
        name: String,
        file: FileHandle,
        param: AssetLoaderParameters<TextureRegion>?
    ): com.badlogic.gdx.utils.Array<AssetDescriptor<*>?>? {
        return null
    }
}

fun loadPic(dir: String, name: String): Pair<Pic, Pixmap> {
    val fileName = "assets/${dir}/${name}"
    val json = ClassLoader.getSystemResourceAsStream(fileName)
        ?.bufferedReader()?.readText()
        ?: throw RuntimeException("找不到资源: $fileName")
    val pic = JsonReader().parse(json).toPic()
    val png = loadPng(dir, pic.png)
    return Pair(pic, png)
}

fun JsonValue.toPic(): Pic {
    val png = getString("png")
    val region = mutableListOf<Rect>()
    var item = get("region").child
    while (item != null) {
        region.add(item.toRect())
        item = item.next
    }
    return Pic(png, region)
}

fun JsonValue.toRect(): Rect {
    return Rect(getInt("x"), getInt("y"), getInt("w"), getInt("h"))
}

private fun loadPng(dir: String, name: String): Pixmap {
    val fileName = "assets/${dir}/${name}"
    val bytes = ClassLoader.getSystemResourceAsStream(fileName)
        ?.readBytes()
        ?: throw RuntimeException("找不到资源: $fileName")
    return Pixmap(bytes, 0, bytes.size)
}

fun Pic.toTextureRegion(index: Int = 0, png: Pixmap): TextureRegion {
    val (x, y, w, h) = region[index]
    return TextureRegion(Texture(png), x, y, w, h)
}

data class Pic(val png: String, val region: List<Rect>)

data class Rect(val x: Int, val y: Int, val w: Int, val h: Int)
