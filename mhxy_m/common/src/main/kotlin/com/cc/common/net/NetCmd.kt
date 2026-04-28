package com.cc.common.net

import java.util.concurrent.atomic.AtomicLong

sealed class NetCmd {
    companion object {
        val IdGenerator = AtomicLong(0)

        fun String.deCode(): Pair<String, String> {
            return Pair(this.substring(0, 3).toInt(), substring(3))
        }

        fun genReqId(): Long {
            return IdGenerator.incrementAndGet()
        }

        fun encode(cmd: NetCmd, json: String): String {
            return "${cmd.javaClass.simpleName}|${json}"
        }
    }
}

data class EnterFight(val monsterId: Int) : NetCmd()