val dir = "E:\\WORK\\mhxy\\mhxy_m\\src\\main\\resources\\assets\\rpg\\role"
fun main() {
    val res = listOf(
        "ride_189_-1461356842.anim",
        "ride_190_1942576316.anim",
        "ride_164_-1461356811.anim",
        "ride_163_1942577277.anim",


        "ride_191_-1461327051.anim",
        "ride_192_1943499837.anim",
        "ride_162_-1461327020.anim",
        "ride_161_1943500798.anim",


        "ride_197_-1462280363.anim",
        "ride_198_1913947165.anim",
        "ride_156_-1462280332.anim",
        "ride_155_1913948126.anim",


        "ride_199_-1462250572.anim",
        "ride_200_1914870686.anim",
        "ride_154_-1462250541.anim",
        "ride_141_1914871647.anim",


        "ride_193_-1463203884.anim",
        "ride_194_1885318014.anim",
        "ride_160_-1463203853.anim",
        "ride_159_1885318975.anim",

        "ride_195_-1463174093.anim",
        "ride_196_1886241535.anim",
        "ride_158_-1463174062.anim",
        "ride_157_1886242496.anim",
    )

    val list = listOf(
        buildResId(RoleJob.LG, RoleGender.Boy, Appearance.Default, Ride.Turtle, Dir.Left, Act.Move),
        buildResId(RoleJob.LG, RoleGender.Boy, Appearance.Default, Ride.Turtle, Dir.Left, Act.Idle),
        buildResId(RoleJob.LG, RoleGender.Boy, Appearance.Default, Ride.Turtle, Dir.Right, Act.Move),
        buildResId(RoleJob.LG, RoleGender.Boy, Appearance.Default, Ride.Turtle, Dir.Right, Act.Idle),

        buildResId(RoleJob.LG, RoleGender.Girl, Appearance.Default, Ride.Turtle, Dir.Left, Act.Move),
        buildResId(RoleJob.LG, RoleGender.Girl, Appearance.Default, Ride.Turtle, Dir.Left, Act.Idle),
        buildResId(RoleJob.LG, RoleGender.Girl, Appearance.Default, Ride.Turtle, Dir.Right, Act.Move),
        buildResId(RoleJob.LG, RoleGender.Girl, Appearance.Default, Ride.Turtle, Dir.Right, Act.Idle),

        buildResId(RoleJob.FCS, RoleGender.Boy, Appearance.Default, Ride.Turtle, Dir.Left, Act.Move),
        buildResId(RoleJob.FCS, RoleGender.Boy, Appearance.Default, Ride.Turtle, Dir.Left, Act.Idle),
        buildResId(RoleJob.FCS, RoleGender.Boy, Appearance.Default, Ride.Turtle, Dir.Right, Act.Move),
        buildResId(RoleJob.FCS, RoleGender.Boy, Appearance.Default, Ride.Turtle, Dir.Right, Act.Idle),

        buildResId(RoleJob.FCS, RoleGender.Girl, Appearance.Default, Ride.Turtle, Dir.Left, Act.Move),
        buildResId(RoleJob.FCS, RoleGender.Girl, Appearance.Default, Ride.Turtle, Dir.Left, Act.Idle),
        buildResId(RoleJob.FCS, RoleGender.Girl, Appearance.Default, Ride.Turtle, Dir.Right, Act.Move),
        buildResId(RoleJob.FCS, RoleGender.Girl, Appearance.Default, Ride.Turtle, Dir.Right, Act.Idle),

        buildResId(RoleJob.JJF, RoleGender.Boy, Appearance.Default, Ride.Turtle, Dir.Left, Act.Move),
        buildResId(RoleJob.JJF, RoleGender.Boy, Appearance.Default, Ride.Turtle, Dir.Left, Act.Idle),
        buildResId(RoleJob.JJF, RoleGender.Boy, Appearance.Default, Ride.Turtle, Dir.Right, Act.Move),
        buildResId(RoleJob.JJF, RoleGender.Boy, Appearance.Default, Ride.Turtle, Dir.Right, Act.Idle),

        buildResId(RoleJob.JJF, RoleGender.Girl, Appearance.Default, Ride.Turtle, Dir.Left, Act.Move),
        buildResId(RoleJob.JJF, RoleGender.Girl, Appearance.Default, Ride.Turtle, Dir.Left, Act.Idle),
        buildResId(RoleJob.JJF, RoleGender.Girl, Appearance.Default, Ride.Turtle, Dir.Right, Act.Move),
        buildResId(RoleJob.JJF, RoleGender.Girl, Appearance.Default, Ride.Turtle, Dir.Right, Act.Idle),
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
}

enum class Act { Idle, Move, Attack }