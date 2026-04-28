import com.cc.asset.role.buildRoleResId
import com.cc.screens.fight.model.*

val dir = "E:\\WORK\\mhxy\\mhxy_m\\src\\main\\resources\\assets\\rpg\\role"
fun main() {
    val res = listOf(
        "ride_184_-2091198164.anim",
        "ride_181_-402635482.anim",
        "ride_169_-2091198133.anim",
        "ride_172_-402634521.anim",


        "ride_183_-2091168373.anim",
        "ride_182_-401711961.anim",
        "ride_170_-2091168342.anim",
        "ride_171_-401711000.anim",


        "ride_185_-2093045206.anim",
        "ride_180_-459893784.anim",
        "ride_168_-2093045175.anim",
        "ride_173_-459892823.anim",


        "ride_186_-2093015415.anim",
        "ride_179_-458970263.anim",
        "ride_167_-2093015384.anim",
        "ride_174_-458969302.anim",


        "ride_188_-2092121685.anim",
        "ride_177_-431264633.anim",
        "ride_176_-2092121654.anim",
        "ride_165_-431263672.anim",


        "ride_187_-2092091894.anim",
        "ride_178_-430341112.anim",
        "ride_166_-2092091863.anim",
        "ride_175_-430340151.anim",
    )

    val list = listOf(
        buildRoleResId(RoleJob.LG, RoleGender.Boy, Appearance.Default, Ride.Phenix, Dir.Left, RoleAnimState.Move),
    )
    res.zip(list).forEach { (oldName, newName) ->
        val oldFile = java.io.File(dir, oldName)
        val newFile = java.io.File(dir, newName)
        if (oldFile.exists()) {
            val renameTo = oldFile.renameTo(newFile)
            println("renamed: $oldName -> $newName $renameTo")
        } else {
            println("not found: $oldName")
        }
    }
}
