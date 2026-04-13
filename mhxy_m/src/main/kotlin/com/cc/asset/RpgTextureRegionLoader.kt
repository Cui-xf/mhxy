package com.cc.asset

import com.badlogic.gdx.assets.AssetDescriptor
import com.badlogic.gdx.assets.AssetLoaderParameters
import com.badlogic.gdx.assets.AssetManager
import com.badlogic.gdx.assets.loaders.AsynchronousAssetLoader
import com.badlogic.gdx.assets.loaders.FileHandleResolver
import com.badlogic.gdx.files.FileHandle
import com.badlogic.gdx.graphics.g2d.TextureRegion


class RpgTextureRegionLoader(resolver: FileHandleResolver) :
    AsynchronousAssetLoader<TextureRegion, AssetLoaderParameters<TextureRegion>>(resolver) {
    private var rpgTextureRegion: RpgTextureRegion? = null

    override fun loadAsync(
        assetManager: AssetManager,
        name: String, //rpg/public/bg.rt
        f: FileHandle,
        param: AssetLoaderParameters<TextureRegion>?
    ) {
        val (file, name) = parseResourceName(name)
        val key = hashKey(name.removeSuffix(".rt") + "p")
        val ruleAsset = assetManager.get<RuleAsset>("${file}.rule")
        val dataProvider = SingleDataProvider(this, ruleAsset, file)
        rpgTextureRegion = buildRpgTextureRegion(-1, key, dataProvider)
    }


    override fun loadSync(
        assetManager: AssetManager,
        name: String,
        file: FileHandle,
        param: AssetLoaderParameters<TextureRegion>?
    ): TextureRegion {
        val textureRegion = rpgTextureRegion?.toTextureRegion(null) ?: throw RuntimeException(name)
        rpgTextureRegion = null
        return textureRegion
    }

    override fun getDependencies(
        name: String,
        file: FileHandle,
        param: AssetLoaderParameters<TextureRegion>?
    ): com.badlogic.gdx.utils.Array<AssetDescriptor<*>?>? {
        val (fileName) = parseResourceName(name)
        return com.badlogic.gdx.utils.Array.with(RuleAssetDescriptor("${fileName}.rule"))
    }
}
