package com.cc.asset

import com.badlogic.gdx.assets.AssetDescriptor
import com.badlogic.gdx.assets.AssetLoaderParameters
import com.badlogic.gdx.assets.AssetManager
import com.badlogic.gdx.assets.loaders.AsynchronousAssetLoader
import com.badlogic.gdx.assets.loaders.FileHandleResolver
import com.badlogic.gdx.files.FileHandle
import com.badlogic.gdx.utils.Array
import java.io.ByteArrayInputStream
import java.io.DataInputStream

class RuleAsset(val rules: List<Rule>)
data class Rule(val key: Int, val id: Short)

class RuleAssetDescriptor(fileName: String) : AssetDescriptor<RuleAsset>(fileName, RuleAsset::class.java)
class RuleAssetLoader(resolver: FileHandleResolver) :
    AsynchronousAssetLoader<RuleAsset, AssetLoaderParameters<RuleAsset>>(resolver) {
    private lateinit var ruleAsset: RuleAsset

    override fun loadAsync(
        manager: AssetManager,
        fileName: String,
        file: FileHandle,
        parameter: AssetLoaderParameters<RuleAsset>?
    ) {
        ruleAsset = DataInputStream(ByteArrayInputStream(file.readBytes())).use { dis ->
            val count = dis.readShort().toInt()
            val rules = mutableListOf<Rule>()
            repeat(count) {
                rules += Rule(dis.readInt(), dis.readShort())
            }
            RuleAsset(rules)
        }
    }


    override fun loadSync(
        manager: AssetManager,
        fileName: String,
        file: FileHandle,
        parameter: AssetLoaderParameters<RuleAsset>?
    ): RuleAsset {
        return ruleAsset
    }


    override fun getDependencies(
        fileName: String?,
        file: FileHandle?,
        parameter: AssetLoaderParameters<RuleAsset>?
    ): Array<AssetDescriptor<*>>? {
        return null
    }
}

