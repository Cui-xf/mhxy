//package com.cc.asset
//
//import com.badlogic.gdx.assets.AssetDescriptor
//import com.badlogic.gdx.assets.AssetLoaderParameters
//import com.badlogic.gdx.assets.AssetManager
//import com.badlogic.gdx.assets.loaders.AsynchronousAssetLoader
//import com.badlogic.gdx.assets.loaders.FileHandleResolver
//import com.badlogic.gdx.files.FileHandle
//import com.cc.ceilDiv
//import java.io.ByteArrayInputStream
//import java.io.DataInputStream
//import java.util.*
//
//
//class RpgTailMapLoader(resolver: FileHandleResolver) :
//    AsynchronousAssetLoader<TileMap, AssetLoaderParameters<TileMap>>(resolver) {
//    override fun loadAsync(
//        p0: AssetManager,
//        p1: String,
//        p2: FileHandle,
//        p3: AssetLoaderParameters<TileMap>
//    ) {
//        TODO("Not yet implemented")
//        val (dir, mapId) = parseResourceName(p1)
//
//    }
//
//    private fun loadTileMap(dir: String, mapId: String): TileMap {
//        val hashKey = hashKey("${mapId}m")
//        val file = resolve("${dir}/${hashKey}.rpg")
//        val data = readRpgFileData(file)
//        DataInputStream(ByteArrayInputStream(data[0])).use { dis ->
//            //spriteIdHsl
//            val n = dis.readByte().toInt()
//            dis.skipBytes(n * 4 * 2)
//            val mapW = dis.readShort().toInt()
//            val mapH = dis.readShort().toInt()
//            val blockW = dis.readByte().toInt()
//            val blockH = dis.readByte().toInt()
//            val collisionW = dis.readByte().toInt()
//            val collisionH = dis.readByte().toInt()
//            val column = mapW ceilDiv blockW
//            val row = mapH ceilDiv blockH
//
//            val collisionCols: Int = mapW ceilDiv collisionW
//            val collisionRows: Int = mapH ceilDiv collisionH
//            val collisionBit = Array(collisionRows) {
//                Array(collisionCols) {
//                    false
//                }
//            }
//            val collisionCount = dis.readShort().toInt()
//            repeat(collisionCount) {
//                val i = dis.readShort().toInt()
//                collisionBit[i % collisionCols][i / collisionCols] = true
//            }
//
//            val mapBlock = Array(column) {
//                Array(row) {
//                    if (dis.readByte() >= 0) {
//                        val mapObj = MapObj()
//                        mapObj.build(dis, true)
//                        mapObj
//                    } else {
//                        null
//                    }
//                }
//            }
//
//
//            val fixedObjCount = dis.readShort().toInt()
//            val fixedObj = Array(fixedObjCount) {
////                    SpritePiece().build(dis, true)
//                MapObj()
//            }
//
//
//            val moveObjCount = dis.readShort().toInt()
//            val moveObj = Array(moveObjCount) {
//                //                    SpritePiece().build(dis, true)
//                MapObj()
//            }
//            return TileMap(
//                mapW,
//                mapH,
//                blockW,
//                blockH,
//                collisionW,
//                collisionH,
//                row,
//                column,
//                mapBlock,
//                collisionBit,
//                fixedObj,
//                moveObj
//            )
//        }
//    }
//
//    override fun loadSync(
//        p0: AssetManager,
//        p1: String,
//        p2: FileHandle,
//        p3: AssetLoaderParameters<TileMap>
//    ): TileMap? {
//        TODO("Not yet implemented")
//    }
//
//    override fun getDependencies(
//        p0: String,
//        p1: FileHandle,
//        p2: AssetLoaderParameters<TileMap>
//    ): Array<AssetDescriptor<*>> {
//        TODO("Not yet implemented")
//    }
//
//}
//
//
//class TileMap(
//    val mapW: Int,
//    val mapH: Int,
//    val blockW: Int,
//    val blockH: Int,
//
//    //碰撞格
//    val collisionW: Int,
//    val collisionH: Int,
//
//    //图块行列
//    val row: Int,
//    val column: Int,
//
//    //地面图块网格：j[col][row]，每格一个 SpritePiece，null 表示空格
//    val mapBlock: Array<Array<MapObj?>>,
//
//    //碰撞图：i[col][row] == 1 表示该格不可通行
//    val collisionBit: Array<Array<Boolean>>,
//    val fixedObj: Array<MapObj>,
//    val moveObj: Array<MapObj>,
//)
//
//class MapObj