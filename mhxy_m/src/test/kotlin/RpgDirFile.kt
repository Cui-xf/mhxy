import java.io.ByteArrayInputStream
import java.io.DataInputStream
import java.io.File

fun main() {
    val names = listOf("icon", "role", "petfight")
//    val names = listOf("icon")
    for (name in names) {
//        val ruleAsset = parseRuleAsset(File("/Users/cxf/temp/mhxy/mhxy_s/res/${name}.rule").readBytes())
        val ruleAsset = parseRuleAsset(File("E:\\WORK\\mhxy\\mhxy_s\\res/${name}.rule").readBytes())
        for (rule in ruleAsset.rules) {
//            val file = File("/Users/cxf/temp/mhxy/mhxy_s/res/${name}/${rule.id}.rpg")
            val file = File("E:\\WORK\\mhxy\\mhxy_s\\res/${name}/${rule.id}.rpg")
            val data = readRpgFileData(file.readBytes())
            tryPic(data, "${rule.id}_${rule.key}.png")?.let {
                savePic(rule, name, it)
            }
            tryAnim(data[0], ruleAsset)?.let {
                saveAnim(rule, name, it)
            }
        }
    }
}


fun readRpgFileData(data: ByteArray) =
    DataInputStream(ByteArrayInputStream(data)).use { dis ->
        dis.readShort()
        dis.readByte()
        val num = dis.readByte()
        Array(num.toInt()) {
            val size = dis.readInt()
            ByteArray(size).also { dis.readFully(it) }
        }
    }
