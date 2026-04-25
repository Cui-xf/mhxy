val dir = "E:\\WORK\\mhxy\\mhxy_m\\src\\main\\resources\\assets\\rpg\\role"
fun main() {
    val res = listOf(
        "1100.anim",
        "11004.anim",
        "1101.anim",
        "11014.anim",

        "ride_34_-1203922835.anim",
        "ride_35_-1978498811.anim",
        "ride_37_-1203921874.anim",
        "ride_36_-1978498780.anim",

        "ride_58_-2007127962.anim",
        "ride_33_-2091426516.anim",
        "ride_59_-2007127931.anim",
        "ride_60_-2091425555.anim",
    )

    val list = listOf(
        buildResId(RoleJob.JJF, RoleGender.Girl, Appearance.Default, Ride.None, Dir.Left, Act.Move),
        buildResId(RoleJob.JJF, RoleGender.Girl, Appearance.Default, Ride.None, Dir.Left, Act.Idle),
        buildResId(RoleJob.JJF, RoleGender.Girl, Appearance.Default, Ride.None, Dir.Right, Act.Move),
        buildResId(RoleJob.JJF, RoleGender.Girl, Appearance.Default, Ride.None, Dir.Right, Act.Idle),

        buildResId(RoleJob.JJF, RoleGender.Girl, Appearance.Default, Ride.RedDragon, Dir.Left, Act.Move),
        buildResId(RoleJob.JJF, RoleGender.Girl, Appearance.Default, Ride.RedDragon, Dir.Left, Act.Idle),
        buildResId(RoleJob.JJF, RoleGender.Girl, Appearance.Default, Ride.RedDragon, Dir.Right, Act.Move),
        buildResId(RoleJob.JJF, RoleGender.Girl, Appearance.Default, Ride.RedDragon, Dir.Right, Act.Idle),

        buildResId(RoleJob.JJF, RoleGender.Girl, Appearance.Default, Ride.SomersaultCloud, Dir.Left, Act.Move),
        buildResId(RoleJob.JJF, RoleGender.Girl, Appearance.Default, Ride.SomersaultCloud, Dir.Left, Act.Idle),
        buildResId(RoleJob.JJF, RoleGender.Girl, Appearance.Default, Ride.SomersaultCloud, Dir.Right, Act.Move),
        buildResId(RoleJob.JJF, RoleGender.Girl, Appearance.Default, Ride.SomersaultCloud, Dir.Right, Act.Idle),
    )
    res.zip(list).forEach { (oldName, newName) ->
        val oldFile = java.io.File(dir, oldName)
        val newFile = java.io.File(dir, newName)
        if (oldFile.exists()) {
            oldFile.renameTo(newFile)
            println("renamed: $oldName -> $newName")
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

enum class Act { Idle, Move }