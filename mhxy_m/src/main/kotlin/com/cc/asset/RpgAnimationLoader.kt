package com.cc.asset

import com.badlogic.gdx.assets.AssetDescriptor
import com.badlogic.gdx.assets.AssetLoaderParameters
import com.badlogic.gdx.assets.AssetManager
import com.badlogic.gdx.assets.loaders.AsynchronousAssetLoader
import com.badlogic.gdx.assets.loaders.FileHandleResolver
import com.badlogic.gdx.files.FileHandle
import com.badlogic.gdx.graphics.g2d.Animation
import com.badlogic.gdx.graphics.g2d.TextureRegion
import com.badlogic.gdx.utils.Disposable


class RpgAnimationLoader(resolver: FileHandleResolver) :
    AsynchronousAssetLoader<RpgAnimation, AssetLoaderParameters<RpgAnimation>>(resolver) {
    private var rpgAnimation: RpgAnimationRes? = null

    override fun loadAsync(
        assetManager: AssetManager,
        name: String, //rpg/role/xxx or rpg/carton/hudie
        file: FileHandle,
        param: AssetLoaderParameters<RpgAnimation>?
    ) {
        val (fileName, name) = parseResourceName(name)
        val ruleAsset = assetManager.get<RuleAsset>("${fileName}.rule")
        val key = hashKey("${name}s")
        val dirDataProvider =
            if (fileName.endsWith("icon") || fileName.endsWith("petfight") || fileName.endsWith("role")) {
                DirDataProvider(this, ruleAsset, fileName)
            } else {
                SingleDataProvider(this, ruleAsset, fileName)
            }
        rpgAnimation = buildRpgAnimationRes(-1, key, dirDataProvider)
    }

    override fun loadSync(
        assetManager: AssetManager,
        name: String,
        file: FileHandle,
        param: AssetLoaderParameters<RpgAnimation>?
    ): RpgAnimation {
        val animation = rpgAnimation?.toRpgAnimation() ?: throw RuntimeException(name)
        rpgAnimation = null
        return animation
    }

    override fun getDependencies(
        name: String,
        file: FileHandle,
        param: AssetLoaderParameters<RpgAnimation>?
    ): com.badlogic.gdx.utils.Array<AssetDescriptor<*>?>? {
        val (fileName) = parseResourceName(name)
        return com.badlogic.gdx.utils.Array.with(RuleAssetDescriptor("${fileName}.rule"))
    }
}

class RpgAnimation(frameDuration: Float, frames: Array<List<Frame>>) :
    Animation<List<Frame>>(frameDuration, *frames), Disposable {
    override fun dispose() {
        for (frames in keyFrames) {
            for (frame in frames) {
                frame.textureRegion.texture.dispose()
            }
        }
    }
}

data class Frame(
    val transX: Int, //x平移
    val transY: Int, //y平移
    val flipX: Boolean, //水平翻转
    val flipY: Boolean, //竖直翻转
    val rotation: Float,  //旋转
    val textureRegion: TextureRegion //图像切片
)
