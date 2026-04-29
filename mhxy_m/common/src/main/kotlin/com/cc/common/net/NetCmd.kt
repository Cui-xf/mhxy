package com.cc.common.net

import java.util.concurrent.atomic.AtomicLong
import kotlin.reflect.KClass

sealed interface NetCmd {
    companion object {
        private val IdGenerator = AtomicLong(0)
        val cmdMap: Map<Int, KClass<out NetCmd>> = NetCmd::class.sealedSubclasses
            .associateBy { it.simpleName!!.hashCode() }

        inline fun <reified T : NetCmd> String.decode(toCmd: (String, KClass<out NetCmd>) -> T): Triple<Long, Int, T>? {
            val first = indexOf('|')
            val second = indexOf('|', first + 1)
            val reqId = substring(0, first).toLong()
            val cmdCode = substring(first + 1, second).toInt()
            val json = substring(second + 1)
            val klass = cmdMap[cmdCode]
            return klass?.let {
                Triple(reqId, cmdCode, toCmd(json, it))
            }
        }

        fun genReqId(): Long {
            return IdGenerator.incrementAndGet()
        }
    }

    fun encode(reqId: Long, toJson: (NetCmd) -> String): String {
        return "${reqId}|${code()}|${toJson(this)}"
    }

    fun code() = this.javaClass.simpleName.hashCode()
}

data class Handshake(val time: Long = 0) : NetCmd
data class Ticket(val ping: Long = 0) : NetCmd
data class EnterFight(val monsterId: Int = 0) : NetCmd