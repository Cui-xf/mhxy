import java.io.File

//18_
//19_
//20_
//21_
//22_
//23_
val str = listOf(
    "25_1720722403.pic",
    "23_",
)

val ext = listOf<String>(
)
val file = "${destRoot}/assets/rpg/role"
fun main() {
    for (item in File(file).listFiles()) {
        if (ext.contains(item.name)) {
            continue
        }

        val readText = item.readText()
        if (str.all { readText.contains(it) }) {
            println("\"${item.name}\",")
        }
    }
}