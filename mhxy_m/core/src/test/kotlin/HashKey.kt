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
    "rpg/publicUI/num.pic",
    "rpg/publicUI/button_back.pic",
    "rpg/skill/27.anim",
    "rpg/skill/quit.anim",
    "rpg/skill/dead.anim",
    "rpg/skill/dead2.anim",
    "rpg/skill/defence.anim",
    "rpg/ui/trans.anim",
    "rpg/ui/leader.pic",
    "rpg/ui/member.pic",
    "rpg/ui/fighticon.pic",
    "rpg/ui/fightnum.pic",
    "rpg/ui/trans.anim",
    "rpg/ui/dialog.anim",
    "rpg/ui/?.anim",
    "rpg/ui/!.anim",
    "rpg/ui/mapnpc.anim",
    "rpg/publicUI/up.pic",
    "rpg/publicUI/down.pic",
    "rpg/publicUI/select.anim",
    "rpg/publicUI/button_ok.pic",
    "rpg/publicUI/trigon_u.pic",
    "rpg/publicUI/trigon_d.pic",
    "rpg/publicUI/trigon_l.pic",
    "rpg/publicUI/trigon_r.pic",
    "rpg/publicUI/rd0.pic",
    "rpg/publicUI/ru0.pic",
    "rpg/publicUI/lu0.pic",
    "rpg/publicUI/ld0.pic",
)

fun nameTrans(list2: List<String> = emptyList()) {
    for (string in (list)) {
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
//    val listOf = listOf(
//        "rpg/role/f241001.anim",
//        "rpg/role/f241002.anim",
//        "rpg/role/f241004.anim",
//        "rpg/role/f241011.anim",
//        "rpg/role/f241012.anim",
//        "rpg/role/f241014.anim",
//    )

    val listOf = listOf(
        "rpg/petfight/2111.anim",
        "rpg/petfight/2112.anim",
        "rpg/petfight/2113.anim",
        "rpg/petfight/2114.anim",
    )
    nameTrans(listOf)
}

