package com.cc.common.net

sealed class NetCmd(val code: Int) {
    companion object {
        fun String.deCode(): Pair<Int, String> {
            return Pair(this.substring(0, 3).toInt(), substring(3))
        }

        fun encode(cmd: NetCmd, json: String): String {
            return "${cmd.code}${json}"
        }
    }
}

data class EnterFight(val monsterId: Int) : NetCmd(101)