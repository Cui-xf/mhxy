package com.cc.server.handler.cmd

import com.cc.common.net.NetCmd

interface CmdHandler<T : NetCmd> {
    fun handle(cmd: T): NetCmd?
}
