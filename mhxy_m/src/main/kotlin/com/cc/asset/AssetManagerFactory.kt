package com.cc.asset

import com.badlogic.gdx.assets.AssetManager
import com.badlogic.gdx.assets.loaders.resolvers.ClasspathFileHandleResolver
import com.badlogic.gdx.assets.loaders.resolvers.PrefixFileHandleResolver

object AssetManagerFactory {
    val PUBLIC_ASSET = create().also {
        it.setLoader(RpgAnimationGroup::class.java, ".rpg", RpgAnimationLoader(it.fileHandleResolver))
        it.setLoader(RuleAsset::class.java, ".rule", RuleAssetLoader(it.fileHandleResolver))
    }

    fun create(): AssetManager = AssetManager(PrefixFileHandleResolver(ClasspathFileHandleResolver(), "assets/"))
}