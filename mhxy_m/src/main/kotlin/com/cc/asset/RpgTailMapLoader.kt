package com.cc.asset

import com.badlogic.gdx.assets.AssetDescriptor
import com.badlogic.gdx.assets.AssetLoaderParameters
import com.badlogic.gdx.assets.AssetManager
import com.badlogic.gdx.assets.loaders.AsynchronousAssetLoader
import com.badlogic.gdx.assets.loaders.FileHandleResolver
import com.badlogic.gdx.files.FileHandle
import kotlinx.serialization.Serializable
import java.io.ByteArrayInputStream
import java.util.zip.GZIPInputStream


class RpgTailMapLoader(resolver: FileHandleResolver) :
    AsynchronousAssetLoader<TileMap, AssetLoaderParameters<TileMap>>(resolver) {
//    private var rpgTileMap: RpgTileMap? = null

    override fun loadAsync(
        p0: AssetManager,
        p1: String,
        p2: FileHandle,
        p3: AssetLoaderParameters<TileMap>?
    ) {
//        val (dir, mapId) = parseResourceName(p1)
////        val hashKey = hashKey("${1}m")
//        val ruleAsset = getRuleAsset()
//        val dataProvider = MapDataProvider(this)
//        val mate = getMate(mapId.toInt())
//        rpgTileMap = buildRpgTileMap(mate, dataProvider, ruleAsset)
        TODO()
    }


    override fun loadSync(
        p0: AssetManager,
        p1: String,
        p2: FileHandle,
        p3: AssetLoaderParameters<TileMap>?
    ): TileMap {
//        val tailMap = rpgTileMap?.toTileMap() ?: throw RuntimeException(p1)
//        rpgTileMap = null
//        return tailMap
        TODO()
    }

    override fun getDependencies(
        p0: String,
        p1: FileHandle,
        p2: AssetLoaderParameters<TileMap>?
    ): com.badlogic.gdx.utils.Array<AssetDescriptor<*>>? {
        return null
    }
}

@Serializable
data class TileMapT(
    val mapW: Int,
    val mapH: Int,
    val blockW: Int,
    val blockH: Int,

    //碰撞格
    val collisionW: Int,
    val collisionH: Int,

    //图块行列
    val row: Int,
    val column: Int,

    //地面图块网格：j[col][row]，每格一个 SpritePiece，null 表示空格
    val mapBlock: List<List<FrameT?>>,

    //碰撞图：i[col][row] == 1 表示该格不可通行
    val collisionBit: Array<Array<Boolean>>,
    val fixedObj: List<FrameT>,
    val moveObj: List<FrameT>,
)

class TileMap(
    val mapW: Int,
    val mapH: Int,
    val blockW: Int,
    val blockH: Int,

    //碰撞格
    val collisionW: Int,
    val collisionH: Int,

    //图块行列
    val row: Int,
    val column: Int,

    //地面图块网格：j[col][row]，每格一个 SpritePiece，null 表示空格
    val mapBlock: List<List<Frame?>>,

    //碰撞图：i[col][row] == 1 表示该格不可通行
    val collisionBit: Array<Array<Boolean>>,
    val fixedObj: List<Frame>,
    val moveObj: List<Frame>,
    val animationObj: List<TransAnimation>,
)

data class TransAnimation(
    val x: Int,
    val y: Int,
    val animation: RpgAnimation,
)
