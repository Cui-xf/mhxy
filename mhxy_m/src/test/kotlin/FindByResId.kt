import java.io.File

val str = listOf(
    "24_-311472867.pic",
    "26_-1065726095.pic",
    "19_-147189103.pic",
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