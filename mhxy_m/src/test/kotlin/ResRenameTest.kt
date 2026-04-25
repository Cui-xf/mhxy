val dir = "E:\\WORK\\mhxy\\mhxy_m\\src\\main\\resources\\assets\\rpg\\role"
fun main() {
    val res = listOf(
        "f30011.anim",
        "f30012.anim",
        "f30111.anim",
        "f30112.anim",

        "f31011.anim",
        "f31012.anim",
        "f31111.anim",
        "f31112.anim",
    )

    val list = listOf(
        buildResId(RoleJob.LG, RoleGender.Boy, Appearance.Default, Ride.None, Dir.Up, Act.Idle),
        buildResId(RoleJob.LG, RoleGender.Boy, Appearance.Default, Ride.None, Dir.Up, Act.Attack),
        buildResId(RoleJob.LG, RoleGender.Boy, Appearance.Default, Ride.None, Dir.Down, Act.Idle),
        buildResId(RoleJob.LG, RoleGender.Boy, Appearance.Default, Ride.None, Dir.Down, Act.Attack),

        buildResId(RoleJob.LG, RoleGender.Girl, Appearance.Default, Ride.None, Dir.Up, Act.Idle),
        buildResId(RoleJob.LG, RoleGender.Girl, Appearance.Default, Ride.None, Dir.Up, Act.Attack),
        buildResId(RoleJob.LG, RoleGender.Girl, Appearance.Default, Ride.None, Dir.Down, Act.Idle),
        buildResId(RoleJob.LG, RoleGender.Girl, Appearance.Default, Ride.None, Dir.Down, Act.Attack),
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
    None, RedDragon, SomersaultCloud
}

enum class Act { Idle, Move, Attack }