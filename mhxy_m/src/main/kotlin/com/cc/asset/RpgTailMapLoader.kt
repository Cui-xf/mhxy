package com.cc.asset

import com.badlogic.gdx.assets.AssetDescriptor
import com.badlogic.gdx.assets.AssetLoaderParameters
import com.badlogic.gdx.assets.AssetManager
import com.badlogic.gdx.assets.loaders.AsynchronousAssetLoader
import com.badlogic.gdx.assets.loaders.FileHandleResolver
import com.badlogic.gdx.files.FileHandle
import com.badlogic.gdx.utils.Array


class RpgTailMapLoader(resolver: FileHandleResolver) :
    AsynchronousAssetLoader<TailMap, AssetLoaderParameters<TailMap>>(resolver) {
    override fun loadAsync(
        p0: AssetManager?,
        p1: String?,
        p2: FileHandle?,
        p3: AssetLoaderParameters<TailMap>?
    ) {
        TODO("Not yet implemented")
    }

    override fun loadSync(
        p0: AssetManager?,
        p1: String?,
        p2: FileHandle?,
        p3: AssetLoaderParameters<TailMap>?
    ): TailMap? {
        TODO("Not yet implemented")
    }

    override fun getDependencies(
        p0: String?,
        p1: FileHandle?,
        p2: AssetLoaderParameters<TailMap>?
    ): Array<AssetDescriptor<*>?>? {
        TODO("Not yet implemented")
    }
}

class TailMap