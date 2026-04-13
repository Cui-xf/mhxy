package com.cc.asset

import com.badlogic.gdx.assets.AssetDescriptor
import com.badlogic.gdx.assets.AssetLoaderParameters
import com.badlogic.gdx.assets.AssetManager
import com.badlogic.gdx.assets.loaders.AsynchronousAssetLoader
import com.badlogic.gdx.assets.loaders.FileHandleResolver
import com.badlogic.gdx.files.FileHandle
import com.badlogic.gdx.utils.Array
import com.cc.resource.SpritePiece
import java.io.ByteArrayInputStream
import java.io.DataInputStream


class RpgTailMapLoader(resolver: FileHandleResolver) :
    AsynchronousAssetLoader<TileMap, AssetLoaderParameters<TileMap>>(resolver) {
    override fun loadAsync(
        p0: AssetManager,
        p1: String,
        p2: FileHandle,
        p3: AssetLoaderParameters<TileMap>
    ) {
        TODO("Not yet implemented")
        val (dir, mapId) = parseResourceName(p1)

    }

    private fun loadTileMap(dir: String, mapId: String): TileMap {
        val hashKey = hashKey("${mapId}m")
        val file = resolve("${dir}/${hashKey}.rpg")
        val data = readRpgFileData(file)
        val tileMap = TileMap()
        val dis = DataInputStream(ByteArrayInputStream(data[0]))

        tileMap.spriteIdHsl = kotlin.Array<ShortArray?>(dis.readByte()) { ShortArray(4) }
        for (i in tileMap.spriteIdHsl.indices) {
            tileMap.spriteIdHsl[i][0] = dis.readShort()
            tileMap.spriteIdHsl[i][1] = dis.readShort()
            tileMap.spriteIdHsl[i][2] = dis.readShort()
            tileMap.spriteIdHsl[i][3] = dis.readShort()
        }

        tileMap.mapW = dis.readShort()
        tileMap.mapH = dis.readShort()
        tileMap.blockW = dis.readByte()
        tileMap.blockH = dis.readByte()
        tileMap.collisionW = dis.readByte()
        tileMap.collisionH = dis.readByte()
        tileMap.column =
            (tileMap.mapW / tileMap.blockW + (if (tileMap.mapW % tileMap.blockW == 0) 0 else 1)).toByte()
        tileMap.row = (tileMap.mapH / tileMap.blockH + (if (tileMap.mapH % tileMap.blockH == 0) 0 else 1)).toByte()
        val collisionCols: Int =
            tileMap.mapW / tileMap.collisionW + (if (tileMap.mapW % tileMap.collisionW == 0) 0 else 1)
        val collisionRows: Int =
            tileMap.mapH / tileMap.collisionH + (if (tileMap.mapH % tileMap.collisionH == 0) 0 else 1)
        tileMap.collisionMap = Array<ByteArray?>(collisionCols) { ByteArray(collisionRows) }
        val collisionCount = dis.readShort()
        val collisionIds = ShortArray(collisionCount)
        for (i in 0..<collisionCount) {
            collisionIds[i] = dis.readShort()
            tileMap.collisionMap[collisionIds[i] % collisionCols][collisionIds[i] / collisionCols] = 1
        }

        tileMap.mapBlock =
            Array<kotlin.Array<SpritePiece?>?>(tileMap.column) { kotlin.arrayOfNulls<SpritePiece>(tileMap.row.toInt()) }
        for (col in tileMap.mapBlock.indices) {
            for (row in tileMap.mapBlock[col].indices) {
                if (dis.readByte() >= 0) {
                    tileMap.mapBlock[col][row] = SpritePiece()
                    tileMap.mapBlock[col][row].build(dis, true)
                }
            }
        }

        val fixedObjCount: Short
        if ((dis.readShort().also { fixedObjCount = it }) > 0) {
            tileMap.fixedObj = kotlin.arrayOfNulls<SpritePiece>(fixedObjCount.toInt())
            for (i in 0..<fixedObjCount) {
                tileMap.fixedObj[i] = SpritePiece()
                tileMap.fixedObj[i].build(dis, true)
            }
        }

        val animObjCount: Short
        if ((dis.readShort().also { animObjCount = it }) > 0) {
            tileMap.animationObj = kotlin.arrayOfNulls<SpritePiece>(animObjCount.toInt())
            for (i in 0..<animObjCount) {
                tileMap.animationObj[i] = SpritePiece()
                tileMap.animationObj[i].build(dis, true)
            }
        }
        return tileMap
    }

    override fun loadSync(
        p0: AssetManager,
        p1: String,
        p2: FileHandle,
        p3: AssetLoaderParameters<TileMap>
    ): TileMap? {
        TODO("Not yet implemented")
    }

    override fun getDependencies(
        p0: String,
        p1: FileHandle,
        p2: AssetLoaderParameters<TileMap>
    ): Array<AssetDescriptor<*>> {
        TODO("Not yet implemented")
    }

}


//游戏场景地图：图块网格 + 碰撞图 + 固定/动画对象
class TileMap {
    var mapW: Short = 0
    var mapH: Short = 0
    var blockW: Byte = 0
    var blockH: Byte = 0

    //碰撞格
    var collisionW: Byte = 0
    var collisionH: Byte = 0

    //图块行列
    var column: Byte = 0
    var row: Byte = 0

    //地面图块网格：j[col][row]，每格一个 SpritePiece，null 表示空格
    var mapBlock: Array<Array<MapObj>>? = null

    //碰撞图：i[col][row] == 1 表示该格不可通行
    var collisionMap: Array<ByteArray>? = null

    //场景固定对象列表（建筑、道具等静态元素，有绝对坐标 e/f）
    var fixedObj: Array<MapObj>? = null

    //场景动画对象列表（引用 Animation 的动态元素，有绝对坐标 e/f）
    var movingObject: Array<MapObj>? = null
}

class MapObj