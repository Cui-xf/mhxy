val dir = "E:\\WORK\\mhxy\\mhxy_m\\src\\main\\resources\\assets\\rpg\\role"
fun main() {
    val res = listOf(
        "ride_89_-2033939862.anim",
        "ride_88_1372371880.anim",
        "ride_96_-2033939831.anim",
        "ride_97_1372372841.anim",

        "ride_90_-2033910071.anim",
        "ride_91_1373295401.anim",
        "ride_95_1373296362.anim",
        "ride_94_-2033910040.anim",
    )

    val list = listOf(
        buildResId(RoleJob.LG, RoleGender.Boy, Appearance.Default, Ride.RedWildebeest, Dir.Left, Act.Move),
        buildResId(RoleJob.LG, RoleGender.Boy, Appearance.Default, Ride.RedWildebeest, Dir.Left, Act.Idle),
        buildResId(RoleJob.LG, RoleGender.Boy, Appearance.Default, Ride.RedWildebeest, Dir.Right, Act.Move),
        buildResId(RoleJob.LG, RoleGender.Boy, Appearance.Default, Ride.RedWildebeest, Dir.Right, Act.Idle),

        buildResId(RoleJob.LG, RoleGender.Girl, Appearance.Default, Ride.RedWildebeest, Dir.Left, Act.Move),
        buildResId(RoleJob.LG, RoleGender.Girl, Appearance.Default, Ride.RedWildebeest, Dir.Left, Act.Idle),
        buildResId(RoleJob.LG, RoleGender.Girl, Appearance.Default, Ride.RedWildebeest, Dir.Right, Act.Move),
        buildResId(RoleJob.LG, RoleGender.Girl, Appearance.Default, Ride.RedWildebeest, Dir.Right, Act.Idle),
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

fun buildResId(
    job: RoleJob,
    gender: RoleGender,
    appearance: Appearance,
    ride: Ride,
    dir: Dir,
    act: Act
): String {
    return "${job}_${gender}_${appearance}_${ride}_${dir}_${act}.anim"
}

enum class RoleJob { JJF, FCS, LG }

enum class RoleGender { Boy, Girl }

enum class Appearance {
    Default
}

enum class Dir { Up, Down, Left, Right }

enum class Ride {
    None,   //无
    RedDragon,//红色龙
    SomersaultCloud,//筋斗云
    RedWildebeest,  //红色角马
}

enum class Act { Idle, Move, Attack }