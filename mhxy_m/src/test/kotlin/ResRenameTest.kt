val dir = "E:\\WORK\\mhxy\\mhxy_m\\src\\main\\resources\\assets\\rpg\\role"
fun main() {
    val res = listOf(
        "2100.anim",
        "21004.anim",
        "2101.anim",
        "21014.anim",

        "ride_45_-1175293684.anim",
        "ride_44_-1977575290.anim",
        "ride_42_-1175292723.anim",
        "ride_43_-1977575259.anim",


        "ride_66_-2006204441.anim",
        "ride_65_-2062797365.anim",
        "ride_67_-2006204410.anim",
        "ride_68_-2062796404.anim",


        "2000.anim",
        "20004.anim",
        "2001.anim",
        "20014.anim",

        "ride_49_-1176217205.anim",
        "ride_48_-1977605081.anim",
        "ride_46_-1176216244.anim",
        "ride_47_-1977605050.anim",

        "ride_70_-2006234232.anim",
        "ride_69_-2063720886.anim",
        "ride_71_-2006234201.anim",
        "ride_72_-2063719925.anim",
    )

    val list = listOf(
        buildResId(RoleJob.FCS, RoleGender.Boy, Appearance.Default, Ride.None, Dir.Left, Act.Move),
        buildResId(RoleJob.FCS, RoleGender.Boy, Appearance.Default, Ride.None, Dir.Left, Act.Idle),
        buildResId(RoleJob.FCS, RoleGender.Boy, Appearance.Default, Ride.None, Dir.Right, Act.Move),
        buildResId(RoleJob.FCS, RoleGender.Boy, Appearance.Default, Ride.None, Dir.Right, Act.Idle),

        buildResId(RoleJob.FCS, RoleGender.Boy, Appearance.Default, Ride.RedDragon, Dir.Left, Act.Move),
        buildResId(RoleJob.FCS, RoleGender.Boy, Appearance.Default, Ride.RedDragon, Dir.Left, Act.Idle),
        buildResId(RoleJob.FCS, RoleGender.Boy, Appearance.Default, Ride.RedDragon, Dir.Right, Act.Move),
        buildResId(RoleJob.FCS, RoleGender.Boy, Appearance.Default, Ride.RedDragon, Dir.Right, Act.Idle),

        buildResId(RoleJob.FCS, RoleGender.Boy, Appearance.Default, Ride.SomersaultCloud, Dir.Left, Act.Move),
        buildResId(RoleJob.FCS, RoleGender.Boy, Appearance.Default, Ride.SomersaultCloud, Dir.Left, Act.Idle),
        buildResId(RoleJob.FCS, RoleGender.Boy, Appearance.Default, Ride.SomersaultCloud, Dir.Right, Act.Move),
        buildResId(RoleJob.FCS, RoleGender.Boy, Appearance.Default, Ride.SomersaultCloud, Dir.Right, Act.Idle),

        buildResId(RoleJob.FCS, RoleGender.Girl, Appearance.Default, Ride.None, Dir.Left, Act.Move),
        buildResId(RoleJob.FCS, RoleGender.Girl, Appearance.Default, Ride.None, Dir.Left, Act.Idle),
        buildResId(RoleJob.FCS, RoleGender.Girl, Appearance.Default, Ride.None, Dir.Right, Act.Move),
        buildResId(RoleJob.FCS, RoleGender.Girl, Appearance.Default, Ride.None, Dir.Right, Act.Idle),

        buildResId(RoleJob.FCS, RoleGender.Girl, Appearance.Default, Ride.RedDragon, Dir.Left, Act.Move),
        buildResId(RoleJob.FCS, RoleGender.Girl, Appearance.Default, Ride.RedDragon, Dir.Left, Act.Idle),
        buildResId(RoleJob.FCS, RoleGender.Girl, Appearance.Default, Ride.RedDragon, Dir.Right, Act.Move),
        buildResId(RoleJob.FCS, RoleGender.Girl, Appearance.Default, Ride.RedDragon, Dir.Right, Act.Idle),

        buildResId(RoleJob.FCS, RoleGender.Girl, Appearance.Default, Ride.SomersaultCloud, Dir.Left, Act.Move),
        buildResId(RoleJob.FCS, RoleGender.Girl, Appearance.Default, Ride.SomersaultCloud, Dir.Left, Act.Idle),
        buildResId(RoleJob.FCS, RoleGender.Girl, Appearance.Default, Ride.SomersaultCloud, Dir.Right, Act.Move),
        buildResId(RoleJob.FCS, RoleGender.Girl, Appearance.Default, Ride.SomersaultCloud, Dir.Right, Act.Idle),
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