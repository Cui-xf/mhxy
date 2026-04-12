package com.cc.asset

import com.badlogic.gdx.assets.AssetManager
import com.badlogic.gdx.assets.loaders.resolvers.ClasspathFileHandleResolver
import com.badlogic.gdx.assets.loaders.resolvers.PrefixFileHandleResolver
import com.badlogic.gdx.graphics.Texture
import com.badlogic.gdx.graphics.g2d.TextureRegion
import com.badlogic.gdx.utils.Disposable

object AssetManagerFactory : Disposable {
    val PUBLIC_ASSET = create().also {
        it.setLoader(RuleAsset::class.java, ".rule", RuleAssetLoader(it.fileHandleResolver))
        it.setLoader(RpgAnimation::class.java, RpgAnimationLoader(it.fileHandleResolver))
        it.setLoader(TextureRegion::class.java, ".rt", RpgTextureRegionLoader(it.fileHandleResolver))
    }

    fun create(): AssetManager = AssetManager(PrefixFileHandleResolver(ClasspathFileHandleResolver(), "assets/"))

    override fun dispose() {
        PUBLIC_ASSET.dispose()
    }
}