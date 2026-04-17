import java.io.File

val str = listOf(
    "94_51529459.pic",
)

val file = "${destRoot}/assets/rpg/petfight"
fun main() {
    for (item in File(file).listFiles()) {
        val readText = item.readText()
        if (str.all { readText.contains(it) }) {
            println("找到文件: ${item.name}")
        }
    }
}