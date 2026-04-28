package com.cc.test.handler.cmd

import io.netty.channel.ChannelHandlerContext
import java.io.DataInputStream

interface CmdHandler {
    val cmd: Int
    // dis: 已剥离 [0xAE][opcode:short] 头和 [0xAF] 尾的纯业务字段流
    fun handle(ctx: ChannelHandlerContext, dis: DataInputStream)
}
