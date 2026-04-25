val dir = "E:\\WORK\\mhxy\\mhxy_m\\src\\main\\resources\\assets\\rpg\\role"
fun main() {
    val res = listOf(
        "ride_110_-2062569013.anim",
        "ride_111_484868199.anim",
        "ride_126_-2062568982.anim",
        "ride_125_484869160.anim",

        "ride_109_-2062539222.anim",
        "ride_108_485791720.anim",
        "ride_128_-2062539191.anim",
        "ride_129_485792681.anim",

        "ride_115_-2064416055.anim",
        "ride_114_427609897.anim",
        "ride_121_-2064416024.anim",
        "ride_122_427610858.anim",

        "ride_113_-2064386264.anim",
        "ride_112_428533418.anim",
        "ride_123_-2064386233.anim",
        "ride_124_428534379.anim",
        

        "ride_107_-2063492534.anim",
        "ride_118_456239048.anim",
        "ride_130_-2063492503.anim",
        "ride_127_456240009.anim",


        "ride_116_-2063462743.anim",
        "ride_117_457162569.anim",
        "ride_120_-2063462712.anim",
        "ride_119_457163530.anim",
    )

    val list = listOf(
        buildResId(RoleJob.LG, RoleGender.Boy, Appearance.Default, Ride.IronWolf, Dir.Left, Act.Move),
        buildResId(RoleJob.LG, RoleGender.Boy, Appearance.Default, Ride.IronWolf, Dir.Left, Act.Idle),
        buildResId(RoleJob.LG, RoleGender.Boy, Appearance.Default, Ride.IronWolf, Dir.Right, Act.Move),
        buildResId(RoleJob.LG, RoleGender.Boy, Appearance.Default, Ride.IronWolf, Dir.Right, Act.Idle),

        buildResId(RoleJob.LG, RoleGender.Girl, Appearance.Default, Ride.IronWolf, Dir.Left, Act.Move),
        buildResId(RoleJob.LG, RoleGender.Girl, Appearance.Default, Ride.IronWolf, Dir.Left, Act.Idle),
        buildResId(RoleJob.LG, RoleGender.Girl, Appearance.Default, Ride.IronWolf, Dir.Right, Act.Move),
        buildResId(RoleJob.LG, RoleGender.Girl, Appearance.Default, Ride.IronWolf, Dir.Right, Act.Idle),

        buildResId(RoleJob.JJF, RoleGender.Boy, Appearance.Default, Ride.IronWolf, Dir.Left, Act.Move),
        buildResId(RoleJob.JJF, RoleGender.Boy, Appearance.Default, Ride.IronWolf, Dir.Left, Act.Idle),
        buildResId(RoleJob.JJF, RoleGender.Boy, Appearance.Default, Ride.IronWolf, Dir.Right, Act.Move),
        buildResId(RoleJob.JJF, RoleGender.Boy, Appearance.Default, Ride.IronWolf, Dir.Right, Act.Idle),

        buildResId(RoleJob.JJF, RoleGender.Girl, Appearance.Default, Ride.IronWolf, Dir.Left, Act.Move),
        buildResId(RoleJob.JJF, RoleGender.Girl, Appearance.Default, Ride.IronWolf, Dir.Left, Act.Idle),
        buildResId(RoleJob.JJF, RoleGender.Girl, Appearance.Default, Ride.IronWolf, Dir.Right, Act.Move),
        buildResId(RoleJob.JJF, RoleGender.Girl, Appearance.Default, Ride.IronWolf, Dir.Right, Act.Idle),


        buildResId(RoleJob.FCS, RoleGender.Boy, Appearance.Default, Ride.IronWolf, Dir.Left, Act.Move),
        buildResId(RoleJob.FCS, RoleGender.Boy, Appearance.Default, Ride.IronWolf, Dir.Left, Act.Idle),
        buildResId(RoleJob.FCS, RoleGender.Boy, Appearance.Default, Ride.IronWolf, Dir.Right, Act.Move),
        buildResId(RoleJob.FCS, RoleGender.Boy, Appearance.Default, Ride.IronWolf, Dir.Right, Act.Idle),

        buildResId(RoleJob.FCS, RoleGender.Girl, Appearance.Default, Ride.IronWolf, Dir.Left, Act.Move),
        buildResId(RoleJob.FCS, RoleGender.Girl, Appearance.Default, Ride.IronWolf, Dir.Left, Act.Idle),
        buildResId(RoleJob.FCS, RoleGender.Girl, Appearance.Default, Ride.IronWolf, Dir.Right, Act.Move),
        buildResId(RoleJob.FCS, RoleGender.Girl, Appearance.Default, Ride.IronWolf, Dir.Right, Act.Idle),
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
}

enum class Act { Idle, Move, Attack }