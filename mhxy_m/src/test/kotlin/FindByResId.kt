import java.io.File

val str = listOf(
    "25_1720722403.pic",
)

val file = "${destRoot}/assets/rpg/role"
fun main() {
    for (item in File(file).listFiles()) {
        val readText = item.readText()
        if (str.all { readText.contains(it) }) {
            println("找到文件: ${item.name}")
        }
    }
}