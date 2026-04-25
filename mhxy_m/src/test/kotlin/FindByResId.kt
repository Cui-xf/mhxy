import java.io.File

val str = listOf(
    "28_949649996.pic",
//    "22_-1325079790.pic",
)

val ext = listOf<String>(
    "ride_107_-2063492534.anim",
    "ride_118_456239048.anim",
    "ride_127_456240009.anim",
    "ride_130_-2063492503.anim",

    "ride_108_485791720.anim",
    "ride_109_-2062539222.anim",
    "ride_128_-2062539191.anim",
    "ride_129_485792681.anim",

    "ride_110_-2062569013.anim",
    "ride_111_484868199.anim",
    "ride_125_484869160.anim",
    "ride_126_-2062568982.anim",

    "ride_112_428533418.anim",
    "ride_113_-2064386264.anim",
    "ride_123_-2064386233.anim",
    "ride_124_428534379.anim",

    "ride_114_427609897.anim",
    "ride_115_-2064416055.anim",
    "ride_121_-2064416024.anim",
    "ride_122_427610858.anim",
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