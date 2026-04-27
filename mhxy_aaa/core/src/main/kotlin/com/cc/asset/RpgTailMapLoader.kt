package com.cc.asset

import com.badlogic.gdx.assets.AssetDescriptor
import com.badlogic.gdx.assets.AssetLoaderParameters
import com.badlogic.gdx.assets.AssetManager
import com.badlogic.gdx.assets.loaders.AsynchronousAssetLoader
import com.badlogic.gdx.assets.loaders.FileHandleResolver
import com.badlogic.gdx.files.FileHandle
import com.badlogic.gdx.graphics.Pixmap
import com.badlogic.gdx.graphics.g2d.Animation
import com.badlogic.gdx.utils.Disposable
import com.badlogic.gdx.utils.JsonReader
import com.badlogic.gdx.utils.JsonValue
import com.cc.parseResourceName


class RpgTailMapLoader(resolver: FileHandleResolver) :
    AsynchronousAssetLoader<TileMap, AssetLoaderParameters<TileMap>>(resolver) {
    private var mate: TileMapMate? = null
    private var animMap = mutableMapOf<String, Anim>()
    private val picMap = mutableMapOf<String, Pair<Pic, Pixmap>>()

    override fun loadAsync(
        p0: AssetManager,
        p1: String,
        p2: FileHandle,
        p3: AssetLoaderParameters<TileMap>?
    ) {
        val (dir, name) = parseResourceName(p1)
        val mate = loadMate(dir, name)
        val mapBlock = mate.mapBlock.flatMap { it.toList() }.filterNotNull()
        val fixedObj = mate.fixedObj
        mate.moveObj.forEach {
            if (animMap[it.anim] == null) {
                animMap[it.anim] = loadAnim(dir, it.anim)
            }
        }
        val animPic = animMap.values.flatMap { anim -> anim.frames.flatMap { it.toList() } }
        (mapBlock + fixedObj + animPic).forEach {
            if (picMap[it.pic] == null) {
                val pic = loadPic(dir, it.pic)
                picMap[it.pic] = pic
            }
        }
        this.mate = mate
    }


    override fun loadSync(
        p0: AssetManager,
        p1: String,
        p2: FileHandle,
        p3: AssetLoaderParameters<TileMap>?
    ): TileMap {
        return mate?.toTileMap(picMap, animMap)
            ?.also {
                mate = null
                animMap.clear()
                picMap.clear()
            } ?: throw RuntimeException("资源加载失败:${p1}")
    }

    override fun getDependencies(
        p0: String,
        p1: FileHandle,
        p2: AssetLoaderParameters<TileMap>?
    ): com.badlogic.gdx.utils.Array<AssetDescriptor<*>>? {
        return null
    }
}

fun loadMate(dir: String, name: String): TileMapMate {
    val fileName = "${dir}/${name}"
    val json = ClassLoader.getSystemResourceAsStream(fileName)
        ?.bufferedReader()?.readText()
        ?: throw RuntimeException("找不到资源: $fileName")
    return JsonReader().parse(json).toTileMapMate()
}

fun JsonValue.toTileMapMate(): TileMapMate {
    val mapBlock = mutableListOf<List<PicTransIdx?>>()
    var row = get("mapBlock").child
    while (row != null) {
        val cols = mutableListOf<PicTransIdx?>()
        var col = row.child
        while (col != null) {
            cols.add(if (col.isNull) null else col.toPicTransIdx())
            col = col.next
        }
        mapBlock.add(cols)
        row = row.next
    }

    val collisionBit = mutableListOf<List<Boolean>>()
    var cRow = get("collisionBit").child
    while (cRow != null) {
        val cols = mutableListOf<Boolean>()
        var col = cRow.child
        while (col != null) {
            cols.add(col.asBoolean())
            col = col.next
        }
        collisionBit.add(cols)
        cRow = cRow.next
    }

    val fixedObj = mutableListOf<PicTransIdx>()
    var fItem = get("fixedObj").child
    while (fItem != null) {
        fixedObj.add(fItem.toPicTransIdx())
        fItem = fItem.next
    }

    val moveObj = mutableListOf<LocationAnim>()
    var mItem = get("moveObj").child
    while (mItem != null) {
        moveObj.add(mItem.toLocationAnim())
        mItem = mItem.next
    }

    return TileMapMate(
        mapW = getInt("mapW"),
        mapH = getInt("mapH"),
        blockW = getInt("blockW"),
        blockH = getInt("blockH"),
        collisionW = getInt("collisionW"),
        collisionH = getInt("collisionH"),
        row = getInt("row"),
        column = getInt("column"),
        mapBlock = mapBlock,
        collisionBit = collisionBit,
        fixedObj = fixedObj,
        moveObj = moveObj
    )
}

fun JsonValue.toLocationAnim(): LocationAnim {
    val frames = mutableListOf<Location>()
    var item = get("frames").child
    while (item != null) {
        frames.add(item.toLocation())
        item = item.next
    }
    return LocationAnim(
        duration = getFloat("duration"),
        frames = frames,
        anim = getString("anim")
    )
}

fun JsonValue.toLocation(): Location {
    return Location(getInt("x"), getInt("y"))
}

fun TileMapMate.toTileMap(picMap: MutableMap<String, Pair<Pic, Pixmap>>, animMap: MutableMap<String, Anim>): TileMap {
    val mapBlock = mapBlock.map { list ->
        list.map {
            it?.toFrame(picMap)
        }
    }
    val fixedObj = fixedObj.map { it.toFrame(picMap) }

    val moveObj = moveObj.map {
        it.toLocationAnimation(picMap, animMap)
    }
    return TileMap(
        mapW,
        mapH,
        blockW,
        blockH,
        collisionW,
        collisionH,
        row,
        column,
        mapBlock,
        collisionBit,
        fixedObj,
        moveObj
    )
}

fun LocationAnim.toLocationAnimation(
    picMap: MutableMap<String, Pair<Pic, Pixmap>>,
    animMap: MutableMap<String, Anim>
): LocationAnimation {
    val rpgAnimation = animMap[anim]!!.toRpgAnimation(picMap)
    return LocationAnimation(duration, frames.toTypedArray(), rpgAnimation)
}

data class TileMapMate(
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
    val mapBlock: List<List<PicTransIdx?>>,

    //碰撞图：i[col][row] == 1 表示该格不可通行
    val collisionBit: List<List<Boolean>>,
    val fixedObj: List<PicTransIdx>,
    val moveObj: List<LocationAnim>,
)

data class LocationAnim(
    val duration: Float,
    val frames: List<Location>,
    val anim: String
)

data class Location(
    val x: Int,
    val y: Int
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
    val collisionBit: List<List<Boolean>>,
    val fixedObj: List<Frame>,
    val locationAnimation: List<LocationAnimation>,
)

class LocationAnimation(
    duration: Float,
    frames: Array<Location>,
    val animation: RpgAnimation,
) : Animation<Location>(duration, *frames), Disposable {
    override fun dispose() {
        animation.dispose()
    }
}