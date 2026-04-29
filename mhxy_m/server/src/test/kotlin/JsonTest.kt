import com.cc.common.net.Ticket
import com.cc.server.util.JSON

fun main() {
    val ticket = Ticket(System.currentTimeMillis())
    val toJson = JSON.toJson(ticket)
    println(toJson)
}