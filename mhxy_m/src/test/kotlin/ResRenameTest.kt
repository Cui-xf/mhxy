val dir = "E:\\WORK\\mhxy\\mhxy_m\\src\\main\\resources\\assets\\rpg\\role"
fun main() {
    val res = listOf(

        "ride_151_-110029281.anim",
        "ride_150_884057747.anim",
        "ride_131_-110029250.anim",
        "ride_132_884058708.anim",

        "ride_152_-109999490.anim",
        "ride_153_884981268.anim",
        "ride_106_-109999459.anim",
        "ride_105_884982229.anim",


        "ride_146_-111876323.anim",
        "ride_147_826799445.anim",
        "ride_136_-111876292.anim",
        "ride_135_826800406.anim",


        "ride_148_-111846532.anim",
        "ride_149_827722966.anim",
        "ride_134_-111846501.anim",
        "ride_133_827723927.anim",

        "ride_142_-110952802.anim",
        "ride_143_855428596.anim",
        "ride_140_-110952771.anim",
        "ride_139_855429557.anim",


        "ride_145_-110923011.anim",
        "ride_144_856352117.anim",
        "ride_137_-110922980.anim",
        "ride_138_856353078.anim",
    )

    val list = listOf(
        buildResId(RoleJob.LG, RoleGender.Boy, Appearance.Default, Ride.Tiger, Dir.Left, Act.Move),
        buildResId(RoleJob.LG, RoleGender.Boy, Appearance.Default, Ride.Tiger, Dir.Left, Act.Idle),
        buildResId(RoleJob.LG, RoleGender.Boy, Appearance.Default, Ride.Tiger, Dir.Right, Act.Move),
        buildResId(RoleJob.LG, RoleGender.Boy, Appearance.Default, Ride.Tiger, Dir.Right, Act.Idle),

        buildResId(RoleJob.LG, RoleGender.Girl, Appearance.Default, Ride.Tiger, Dir.Left, Act.Move),
        buildResId(RoleJob.LG, RoleGender.Girl, Appearance.Default, Ride.Tiger, Dir.Left, Act.Idle),
        buildResId(RoleJob.LG, RoleGender.Girl, Appearance.Default, Ride.Tiger, Dir.Right, Act.Move),
        buildResId(RoleJob.LG, RoleGender.Girl, Appearance.Default, Ride.Tiger, Dir.Right, Act.Idle),

        buildResId(RoleJob.JJF, RoleGender.Boy, Appearance.Default, Ride.Tiger, Dir.Left, Act.Move),
        buildResId(RoleJob.JJF, RoleGender.Boy, Appearance.Default, Ride.Tiger, Dir.Left, Act.Idle),
        buildResId(RoleJob.JJF, RoleGender.Boy, Appearance.Default, Ride.Tiger, Dir.Right, Act.Move),
        buildResId(RoleJob.JJF, RoleGender.Boy, Appearance.Default, Ride.Tiger, Dir.Right, Act.Idle),

        buildResId(RoleJob.JJF, RoleGender.Girl, Appearance.Default, Ride.Tiger, Dir.Left, Act.Move),
        buildResId(RoleJob.JJF, RoleGender.Girl, Appearance.Default, Ride.Tiger, Dir.Left, Act.Idle),
        buildResId(RoleJob.JJF, RoleGender.Girl, Appearance.Default, Ride.Tiger, Dir.Right, Act.Move),
        buildResId(RoleJob.JJF, RoleGender.Girl, Appearance.Default, Ride.Tiger, Dir.Right, Act.Idle),


        buildResId(RoleJob.FCS, RoleGender.Boy, Appearance.Default, Ride.Tiger, Dir.Left, Act.Move),
        buildResId(RoleJob.FCS, RoleGender.Boy, Appearance.Default, Ride.Tiger, Dir.Left, Act.Idle),
        buildResId(RoleJob.FCS, RoleGender.Boy, Appearance.Default, Ride.Tiger, Dir.Right, Act.Move),
        buildResId(RoleJob.FCS, RoleGender.Boy, Appearance.Default, Ride.Tiger, Dir.Right, Act.Idle),
                           
        buildResId(RoleJob.FCS, RoleGender.Girl, Appearance.Default, Ride.Tiger, Dir.Left, Act.Move),
        buildResId(RoleJob.FCS, RoleGender.Girl, Appearance.Default, Ride.Tiger, Dir.Left, Act.Idle),
        buildResId(RoleJob.FCS, RoleGender.Girl, Appearance.Default, Ride.Tiger, Dir.Right, Act.Move),
        buildResId(RoleJob.FCS, RoleGender.Girl, Appearance.Default, Ride.Tiger, Dir.Right, Act.Idle),
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
    Tiger,  //老虎
}

enum class Act { Idle, Move, Attack }