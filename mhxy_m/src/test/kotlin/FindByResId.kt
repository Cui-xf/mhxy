import java.io.File

val str = listOf(
    "27_-735923587.pic",
//    "22_-1325079790.pic",
)

val ext = listOf<String>(
    "ride_105_884982229.anim",
    "ride_106_-109999459.anim",
    "ride_152_-109999490.anim",
    "ride_153_884981268.anim",

    "ride_131_-110029250.anim",
    "ride_132_884058708.anim",
    "ride_150_884057747.anim",
    "ride_151_-110029281.anim",


    "ride_133_827723927.anim",
    "ride_134_-111846501.anim",
    "ride_148_-111846532.anim",
    "ride_149_827722966.anim",

    "ride_137_-110922980.anim",
    "ride_138_856353078.anim",
    "ride_144_856352117.anim",
    "ride_145_-110923011.anim",

    "ride_135_826800406.anim",
    "ride_136_-111876292.anim",
    "ride_146_-111876323.anim",
    "ride_147_826799445.anim",
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