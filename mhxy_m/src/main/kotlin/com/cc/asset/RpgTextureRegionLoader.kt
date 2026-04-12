package com.cc.asset

import com.badlogic.gdx.assets.AssetDescriptor
import com.badlogic.gdx.assets.AssetLoaderParameters
import com.badlogic.gdx.assets.AssetManager
import com.badlogic.gdx.assets.loaders.AsynchronousAssetLoader
import com.badlogic.gdx.assets.loaders.FileHandleResolver
import com.badlogic.gdx.files.FileHandle
import com.badlogic.gdx.graphics.Pixmap
import com.badlogic.gdx.graphics.Texture
import com.badlogic.gdx.graphics.g2d.TextureRegion
import com.badlogic.gdx.math.Rectangle
import java.io.ByteArrayInputStream
import java.io.DataInputStream


class RpgTextureRegionLoader(resolver: FileHandleResolver) :
    AsynchronousAssetLoader<TextureRegion, AssetLoaderParameters<TextureRegion>>(resolver) {
    private var textureRegionComponent: RpgTextureRegionComponent? = null

    override fun loadAsync(
        assetManager: AssetManager,
        name: String,
        f: FileHandle,
        param: AssetLoaderParameters<TextureRegion>?
    ) {
        val (file, name) = parseResourceName(name)
        val key = hashKey(name.removeSuffix(".rt")+"p")
        val ruleAsset = assetManager.get<RuleAsset>("${file}.rule")
        DataInputStream(ByteArrayInputStream(resolve("${file}.rpg").readBytes())).use { dis ->
            dis.skipBytes(24)  // 跳过魔法前缀
            for (rule in ruleAsset.rules) {
                val type = dis.readByte().toInt()
                val n = dis.readByte()
                val data = Array(n.toInt()) {
                    val size = dis.readInt()
                    ByteArray(size).also { dis.readFully(it) }
                }
                if (type == 0 && rule.key == key) {//静态图
                    textureRegionComponent = buildPixmap(rule.id, data)
                }
            }
        }
    }


    override fun loadSync(
        assetManager: AssetManager,
        name: String,
        file: FileHandle,
        param: AssetLoaderParameters<TextureRegion>?
    ): TextureRegion {
        val textureRegion = textureRegionComponent?.assemble(null) ?: throw RuntimeException(name)
        textureRegionComponent = null
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


class RpgTextureRegionComponent(
    val id: Short,
    private val pixmap: Pixmap,
    private val regionList: List<Rectangle>
) {
    fun assemble(index: Int?): TextureRegion {
        if (index != null && index < regionList.size) {
            val rect = regionList[index]
            return TextureRegion(
                Texture(pixmap),
                rect.x.toInt(),
                rect.y.toInt(),
                rect.width.toInt(),
                rect.height.toInt()
            )
        } else {
            return TextureRegion(Texture(pixmap))
        }
    }
}

