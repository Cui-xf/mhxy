package com.cc.asset

import com.badlogic.gdx.assets.AssetManager
import com.badlogic.gdx.utils.Disposable
import kotlin.reflect.KClass

val CommonAssetLoader = AssetLoader()

class AssetLoader : Disposable {
    private val loadResMap = mutableMapOf<String, AssetManager>()

    fun <T> load(assetManager: AssetManager, name: String, type: Class<T>) {
        assetManager.load(name, type)
        loadResMap[name] = assetManager
    }

    fun update() {
        for (manager in loadResMap.values.distinct()) {
            manager.update()
        }
    }

    fun isFinished(): Boolean {
        if (loadResMap.isEmpty()) {
            return true
        }
        return loadResMap.values.distinct().all { it.isFinished }
    }

    fun <T> get(assetManager: AssetManager, name: String, type: Class<T>): T {
        return assetManager.get<T>(name, type)
    }

    fun <T : Any> resource(assetManager: AssetManager, name: String, type: KClass<T>): Lazy<T> {
        this.load(assetManager, name, type.java)
        return lazy {
            this.get(assetManager, name, type.java)
        }
    }

    override fun dispose() {
        loadResMap.forEach { (name, manager) ->
            manager.unload(name)
        }
    }
}
