package util

import com.cc.common.dto.TestPojo
import com.cc.util.JSON


fun main() {
    val pojo = TestPojo("lalala")
    val toJson = JSON.toJson(pojo)
    println(toJson)
    val fromJson = JSON.fromJson(TestPojo::class.java, toJson)
    println(fromJson)
}