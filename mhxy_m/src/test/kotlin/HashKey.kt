import com.cc.parseResourceName
import java.io.File

private val root = "E:\\WORK\\mhxy\\mhxy_m\\src\\main\\resources"
fun main() {
    val list = listOf(
        "assets/rpg/role/3100.anim",
        "assets/rpg/role/3101.anim",
    )
    for (string in list) {
        val (dir, fullName) = parseResourceName(string)
        val split = fullName.split(".")
        val name = split[0]
        val ext = split[1]
        val hashKey = hashKey(name, ext)
        for (file in File("${root}/${dir}").listFiles()!!) {
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

