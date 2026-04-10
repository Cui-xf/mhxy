package com.cc.asset

import com.badlogic.gdx.assets.AssetManager
import com.badlogic.gdx.assets.loaders.resolvers.ClasspathFileHandleResolver
import com.badlogic.gdx.assets.loaders.resolvers.PrefixFileHandleResolver
import com.badlogic.gdx.utils.Disposable

object AssetManagerFactory : Disposable {
    val PUBLIC_ASSET = create().also {
        it.setLoader(RpgResource::class.java, ".rpg", RpgAnimationLoader(it.fileHandleResolver))
        it.setLoader(RuleAsset::class.java, ".rule", RuleAssetLoader(it.fileHandleResolver))
    }

    fun create(): AssetManager = AssetManager(PrefixFileHandleResolver(ClasspathFileHandleResolver(), "assets/"))

    override fun dispose() {
        PUBLIC_ASSET.dispose()
    }
}