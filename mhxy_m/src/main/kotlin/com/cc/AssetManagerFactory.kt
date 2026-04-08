package com.cc

import com.badlogic.gdx.assets.AssetManager
import com.badlogic.gdx.assets.loaders.resolvers.ClasspathFileHandleResolver
import com.badlogic.gdx.assets.loaders.resolvers.PrefixFileHandleResolver

object AssetManagerFactory {
    fun create(): AssetManager =
        AssetManager(PrefixFileHandleResolver(ClasspathFileHandleResolver(), "assets/"))
}
