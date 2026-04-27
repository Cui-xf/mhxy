//package render
//
//import com.badlogic.gdx.Game
//import com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application
//import com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration
//
//fun main() {
//    val config = Lwjgl3ApplicationConfiguration().apply {
//        setTitle("Demo")
////        setWindowedMode(480, 640)
//        setWindowedMode(240, 320)
//        setResizable(true)
//        setForegroundFPS(60)
//    }
//    try {
//        Lwjgl3Application(TestGame, config)
//    } catch (e: Exception) {
//        e.printStackTrace()
//    }
//}
//
//
//object TestGame : Game() {
//    override fun create() {
//        setScreen(SkillTest)
//    }
//}
//
