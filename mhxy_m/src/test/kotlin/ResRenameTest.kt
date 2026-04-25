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
        buildResId(RoleJob.LG, RoleGender.Boy, Appearance.Default, Ride.Phenix, Dir.Left, Act.Move),
        buildResId(RoleJob.LG, RoleGender.Boy, Appearance.Default, Ride.Phenix, Dir.Left, Act.Idle),
        buildResId(RoleJob.LG, RoleGender.Boy, Appearance.Default, Ride.Phenix, Dir.Right, Act.Move),
        buildResId(RoleJob.LG, RoleGender.Boy, Appearance.Default, Ride.Phenix, Dir.Right, Act.Idle),

        buildResId(RoleJob.LG, RoleGender.Girl, Appearance.Default, Ride.Phenix, Dir.Left, Act.Move),
        buildResId(RoleJob.LG, RoleGender.Girl, Appearance.Default, Ride.Phenix, Dir.Left, Act.Idle),
        buildResId(RoleJob.LG, RoleGender.Girl, Appearance.Default, Ride.Phenix, Dir.Right, Act.Move),
        buildResId(RoleJob.LG, RoleGender.Girl, Appearance.Default, Ride.Phenix, Dir.Right, Act.Idle),

        buildResId(RoleJob.JJF, RoleGender.Boy, Appearance.Default, Ride.Phenix, Dir.Left, Act.Move),
        buildResId(RoleJob.JJF, RoleGender.Boy, Appearance.Default, Ride.Phenix, Dir.Left, Act.Idle),
        buildResId(RoleJob.JJF, RoleGender.Boy, Appearance.Default, Ride.Phenix, Dir.Right, Act.Move),
        buildResId(RoleJob.JJF, RoleGender.Boy, Appearance.Default, Ride.Phenix, Dir.Right, Act.Idle),

        buildResId(RoleJob.JJF, RoleGender.Girl, Appearance.Default, Ride.Phenix, Dir.Left, Act.Move),
        buildResId(RoleJob.JJF, RoleGender.Girl, Appearance.Default, Ride.Phenix, Dir.Left, Act.Idle),
        buildResId(RoleJob.JJF, RoleGender.Girl, Appearance.Default, Ride.Phenix, Dir.Right, Act.Move),
        buildResId(RoleJob.JJF, RoleGender.Girl, Appearance.Default, Ride.Phenix, Dir.Right, Act.Idle),

        buildResId(RoleJob.FCS, RoleGender.Boy, Appearance.Default, Ride.Phenix, Dir.Left, Act.Move),
        buildResId(RoleJob.FCS, RoleGender.Boy, Appearance.Default, Ride.Phenix, Dir.Left, Act.Idle),
        buildResId(RoleJob.FCS, RoleGender.Boy, Appearance.Default, Ride.Phenix, Dir.Right, Act.Move),
        buildResId(RoleJob.FCS, RoleGender.Boy, Appearance.Default, Ride.Phenix, Dir.Right, Act.Idle),

        buildResId(RoleJob.FCS, RoleGender.Girl, Appearance.Default, Ride.Phenix, Dir.Left, Act.Move),
        buildResId(RoleJob.FCS, RoleGender.Girl, Appearance.Default, Ride.Phenix, Dir.Left, Act.Idle),
        buildResId(RoleJob.FCS, RoleGender.Girl, Appearance.Default, Ride.Phenix, Dir.Right, Act.Move),
        buildResId(RoleJob.FCS, RoleGender.Girl, Appearance.Default, Ride.Phenix, Dir.Right, Act.Idle),
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
    IronWolf,//铁狼
    Turtle, //乌龟
    Phenix,//凤凰
}

enum class Act { Idle, Move, Attack }