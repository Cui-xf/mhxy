import com.cc.asset.Anim
import kotlinx.serialization.json.Json
import java.io.File

fun main() {
    val file = "${destRoot}/assets/rpg/role"
    for (item in File(file).listFiles()) {
        if (item.extension != "anim") {
            continue
        }
        val anim = Json.decodeFromString<Anim>(item.readText())
        renamePic(anim)
    }
}

private fun renamePic(anim: Anim) {
    val map = anim.frames.flatten()
        .map { it.pic }
    for (name in map) {
        val pngName = name.removeSuffix(".pic") + ".png"
        rename(name, name + "_new")
        rename(pngName, pngName + "_new")
    }
}

private fun rename(old: String, newName: String) {
    File(file, old).renameTo(File(file, newName))
}