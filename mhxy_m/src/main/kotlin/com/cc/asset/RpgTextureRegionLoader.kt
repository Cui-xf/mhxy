package com.cc.asset

import com.badlogic.gdx.assets.AssetDescriptor
import com.badlogic.gdx.assets.AssetLoaderParameters
import com.badlogic.gdx.assets.AssetManager
import com.badlogic.gdx.assets.loaders.AsynchronousAssetLoader
import com.badlogic.gdx.assets.loaders.FileHandleResolver
import com.badlogic.gdx.files.FileHandle
import com.badlogic.gdx.graphics.g2d.TextureRegion
import kotlinx.serialization.Serializable


class RpgTextureRegionLoader(resolver: FileHandleResolver) :
    AsynchronousAssetLoader<TextureRegion, AssetLoaderParameters<TextureRegion>>(resolver) {
    private var pic: Pic? = null

    override fun loadAsync(
        assetManager: AssetManager,
        name: String, //rpg/public/bg.rt
        f: FileHandle,
        param: AssetLoaderParameters<TextureRegion>?
    ) {
//        val (file, name) = parseResourceName(name)
//        val key = hashKey(name.removeSuffix(".rt") + "p")
//        val ruleAsset = assetManager.get<RuleAsset>("${file}.rule")
//        val dataProvider = SingleDataProvider(this, ruleAsset, file)
//        rpgTextureRegion = buildRpgTextureRegion(-1, key, dataProvider)
    }


    override fun loadSync(
        assetManager: AssetManager,
        name: String,
        file: FileHandle,
        param: AssetLoaderParameters<TextureRegion>?
    ): TextureRegion {
//        val textureRegion = rpgTextureRegion?.toTextureRegion(null) ?: throw RuntimeException(name)
//        rpgTextureRegion = null
//        return textureRegion
        TODO()
    }

    override fun getDependencies(
        name: String,
        file: FileHandle,
        param: AssetLoaderParameters<TextureRegion>?
    ): com.badlogic.gdx.utils.Array<AssetDescriptor<*>?>? {
        return null
    }
}

@Serializable
data class Pic(val png: String, val region: List<Rect>)

@Serializable
data class Rect(val x: Float, val y: Float, val w: Float, val h: Float)

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