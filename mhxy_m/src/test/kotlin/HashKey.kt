import com.cc.parseResourceName
import java.io.File

val list = listOf(
    "rpg/role/3100.anim",
    "rpg/role/3101.anim",
    "rpg/cartoon/hudie.anim",
    "rpg/cartoon/hudie_2.anim",
    "rpg/publicUI/lu.pic",
    "rpg/publicUI/ld.pic",
    "rpg/publicUI/rd.pic",
    "rpg/publicUI/title.pic",
    "rpg/publicUI/close.pic",
    "rpg/publicUI/button1.pic",
    "rpg/role/f31111.anim",
    "rpg/role/f31112.anim",
    "rpg/publicUI/board.pic",
    "rpg/publicUI/board_.pic",
    "rpg/publicUI/jm.pic",
    "rpg/publicUI/lvl.pic",
    "rpg/publicUI/rim.pic",
    "rpg/ui/fighticon.pic",
    "rpg/icon/-1000.pic",
    "rpg/publicUI/goods.pic",
)

fun nameTrans() {
    for (string in list) {
        val (dir, fullName) = parseResourceName(string)
        val split = fullName.split(".")
        val name = split[0]
        val ext = split[1]
        val hashKey = hashKey(name, ext)
        for (file in File("${destRoot}/assets/${dir}").listFiles()!!) {
            if (file.name.contains("$hashKey") && file.extension == ext) {
                val dist = "${file.parent}/${name}.${file.extension}"
                println(dist)
                file.renameTo(File(dist))
            }
        }
    }
}

fun hashKey(name: String, type: String): Int {
    val name = when (type) {
        "pic" -> name + "p"
        "anim" -> name + "s"
        "tmap" -> name + "m"
        else -> throw RuntimeException("未知的类型")
    }

    var hash = 0
    for (c in name.toCharArray()) hash = hash * 31 + c.code
    return hash
}

fun main() {
    nameTrans()
}

