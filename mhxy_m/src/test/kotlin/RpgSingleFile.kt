import com.cc.asset.Anim
import com.cc.asset.Pic
import kotlinx.serialization.json.Json
import java.io.DataInputStream
import java.io.File
import java.io.FileInputStream

//val srcRoot = "/Users/cxf/temp/mhxy/mhxy_s/res"
val srcRoot = "E:\\WORK\\mhxy\\mhxy_s\\res"
//val destRoot = "/Users/cxf/temp/mhxy/mhxy_m/src/main/resources"
val destRoot = "E:\\WORK\\mhxy\\mhxy_m\\src\\main\\resources"
val outDir = "${destRoot}/assets/rpg"
fun main() {
//    single()
//    dir()
//    map()
    nameTrans()
}

private fun single() {
    val names = listOf("cartoon", "publicUI", "skill", "ui")
    for (name in names) {
        val ruleAsset = parseRuleAsset(File("${srcRoot}/${name}.rule").readBytes())
        val parse = parse("${srcRoot}/${name}.rpg")
        for ((index, rule) in ruleAsset.rules.withIndex()) {
            val (type, data) = parse[index]
            tryPic(data, "${rule.id}_${rule.key}.png")?.let {
                savePic(rule, name, it)
            }
            tryAnim(data[0], ruleAsset)?.let {
                saveAnim(rule, name, it)
            }
        }
    }
}

private fun parse(file: String): List<Pair<Byte, Array<ByteArray>>> {
    val list = mutableListOf<Pair<Byte, Array<ByteArray>>>()
    DataInputStream(FileInputStream(file)).use { dis ->
        dis.skipBytes(24)  // 跳过魔法前缀
        while (dis.available() > 0) {
            val type = dis.readByte()
            val n = dis.readByte()
            val data = Array(n.toInt()) {
                val size = dis.readInt()
                ByteArray(size).also { dis.readFully(it) }
            }
            list += Pair(type, data)
        }
    }
    return list
}

fun savePic(rule: Rule, name: String, pair: Pair<Pic, ByteArray>) {
    val (pic, png) = pair
    val fileName = "${rule.id}_${rule.key}"
    File("${outDir}/${name}/${fileName}.png").recreate().writeBytes(png)
    File("${outDir}/${name}/${fileName}.pic").recreate().writeText(myJson.encodeToString(pic))
}

fun saveAnim(rule: Rule, name: String, anim: Anim) {
    val fileName = "${rule.id}_${rule.key}"
    File("${outDir}/${name}/${fileName}.anim").recreate().writeText(myJson.encodeToString(anim))
}

fun tryPic(data: Array<ByteArray>, pngName: String): Pair<Pic, ByteArray>? {
    try {
        val pair = buildRpgTextureRegion(data, pngName)
        println("尝试解码图片成功")
        return pair
    } catch (e: Throwable) {
        println("尝试解码图片失败")
        return null
    }
}

fun tryAnim(data: ByteArray, ruleAsset: RuleAsset): Anim? {
    return try {
        buildAnimation(data, ruleAsset).also {
            println("尝试解码动画成功")
        }
    } catch (e: Throwable) {
        println("尝试解码动画失败")
        null
    }
}

fun File.recreate() = apply { parentFile?.mkdirs(); if (exists()) delete(); createNewFile() }

val myJson = Json {
    prettyPrint = true
}
