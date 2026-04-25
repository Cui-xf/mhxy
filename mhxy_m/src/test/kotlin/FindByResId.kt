import java.io.File

val str = listOf(
    "14_1240432655.pic",
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