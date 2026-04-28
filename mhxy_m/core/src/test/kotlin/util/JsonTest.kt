package util

import com.badlogic.gdx.utils.Json
import com.cc.common.dto.TestPojo


fun main() {
    val json = Json()
    val pojo = TestPojo("lalala")
    val toJson = json.toJson(pojo)
    println(toJson)
    val fromJson = json.fromJson(TestPojo::class.java, toJson)
    println(fromJson)
}