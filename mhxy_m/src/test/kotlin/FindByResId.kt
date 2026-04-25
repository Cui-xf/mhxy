import java.io.File

val str = listOf(
    "29_-1803521419.pic",
    "19_-147189103.pic",
)

val file = "${destRoot}/assets/rpg/role"
fun main() {
    for (item in File(file).listFiles()) {
        val readText = item.readText()
        if (str.all { readText.contains(it) }) {
            println("\"${item.name}\",")
        }
    }
}