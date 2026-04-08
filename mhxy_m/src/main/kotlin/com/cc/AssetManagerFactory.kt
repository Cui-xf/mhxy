package com.cc

import com.badlogic.gdx.assets.AssetManager
import com.badlogic.gdx.assets.loaders.resolvers.ClasspathFileHandleResolver
import com.badlogic.gdx.assets.loaders.resolvers.PrefixFileHandleResolver

object AssetManagerFactory {
    val PUBLIC_ASSET = create()

    fun create(): AssetManager =
        AssetManager(PrefixFileHandleResolver(ClasspathFileHandleResolver(), "assets/"))
}
