val dir = "E:\\WORK\\mhxy\\mhxy_m\\src\\main\\resources\\assets\\rpg\\role"
fun main() {
    val res = listOf(
        "3100.anim",
        "31004.anim",
        "3101.anim",
        "31014.anim",

        "ride_53_-1146664533.anim",
        "ride_52_-1976651769.anim",
        "ride_50_-1146663572.anim",
        "ride_51_-1976651738.anim",

        "ride_74_-2005280920.anim",
        "ride_73_-2034168214.anim",
        "ride_75_-2005280889.anim",
        "ride_76_-2034167253.anim",


        "3000.anim",
        "30004.anim",
        "3001.anim",
        "30014.anim",

        "ride_57_-1147588054.anim",
        "ride_56_-1976681560.anim",
        "ride_54_-1147587093.anim",
        "ride_55_-1976681529.anim",

        "ride_81_-2005310711.anim",
        "ride_82_-2035091735.anim",
        "ride_78_-2005310680.anim",
        "ride_77_-2035090774.anim",
    )

    val list = listOf(
        buildResId(RoleJob.LG, RoleGender.Girl, Appearance.Default, Ride.None, Dir.Left, Act.Move),
        buildResId(RoleJob.LG, RoleGender.Girl, Appearance.Default, Ride.None, Dir.Left, Act.Idle),
        buildResId(RoleJob.LG, RoleGender.Girl, Appearance.Default, Ride.None, Dir.Right, Act.Move),
        buildResId(RoleJob.LG, RoleGender.Girl, Appearance.Default, Ride.None, Dir.Right, Act.Idle),

        buildResId(RoleJob.LG, RoleGender.Girl, Appearance.Default, Ride.RedDragon, Dir.Left, Act.Move),
        buildResId(RoleJob.LG, RoleGender.Girl, Appearance.Default, Ride.RedDragon, Dir.Left, Act.Idle),
        buildResId(RoleJob.LG, RoleGender.Girl, Appearance.Default, Ride.RedDragon, Dir.Right, Act.Move),
        buildResId(RoleJob.LG, RoleGender.Girl, Appearance.Default, Ride.RedDragon, Dir.Right, Act.Idle),

        buildResId(RoleJob.LG, RoleGender.Girl, Appearance.Default, Ride.SomersaultCloud, Dir.Left, Act.Move),
        buildResId(RoleJob.LG, RoleGender.Girl, Appearance.Default, Ride.SomersaultCloud, Dir.Left, Act.Idle),
        buildResId(RoleJob.LG, RoleGender.Girl, Appearance.Default, Ride.SomersaultCloud, Dir.Right, Act.Move),
        buildResId(RoleJob.LG, RoleGender.Girl, Appearance.Default, Ride.SomersaultCloud, Dir.Right, Act.Idle),

        buildResId(RoleJob.LG, RoleGender.Boy, Appearance.Default, Ride.None, Dir.Left, Act.Move),
        buildResId(RoleJob.LG, RoleGender.Boy, Appearance.Default, Ride.None, Dir.Left, Act.Idle),
        buildResId(RoleJob.LG, RoleGender.Boy, Appearance.Default, Ride.None, Dir.Right, Act.Move),
        buildResId(RoleJob.LG, RoleGender.Boy, Appearance.Default, Ride.None, Dir.Right, Act.Idle),

        buildResId(RoleJob.LG, RoleGender.Boy, Appearance.Default, Ride.RedDragon, Dir.Left, Act.Move),
        buildResId(RoleJob.LG, RoleGender.Boy, Appearance.Default, Ride.RedDragon, Dir.Left, Act.Idle),
        buildResId(RoleJob.LG, RoleGender.Boy, Appearance.Default, Ride.RedDragon, Dir.Right, Act.Move),
        buildResId(RoleJob.LG, RoleGender.Boy, Appearance.Default, Ride.RedDragon, Dir.Right, Act.Idle),

        buildResId(RoleJob.LG, RoleGender.Boy, Appearance.Default, Ride.SomersaultCloud, Dir.Left, Act.Move),
        buildResId(RoleJob.LG, RoleGender.Boy, Appearance.Default, Ride.SomersaultCloud, Dir.Left, Act.Idle),
        buildResId(RoleJob.LG, RoleGender.Boy, Appearance.Default, Ride.SomersaultCloud, Dir.Right, Act.Move),
        buildResId(RoleJob.LG, RoleGender.Boy, Appearance.Default, Ride.SomersaultCloud, Dir.Right, Act.Idle),
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