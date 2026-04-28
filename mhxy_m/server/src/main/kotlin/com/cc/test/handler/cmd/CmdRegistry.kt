package com.cc.test.handler.cmd

import io.netty.channel.ChannelHandlerContext
import java.io.DataInputStream

object CmdRegistry {
    private val handlers = mutableMapOf<Int, CmdHandler>()

    fun register(handler: CmdHandler) {
        handlers[handler.cmd] = handler
    }

    fun dispatch(ctx: ChannelHandlerContext, cmd: Int, dis: DataInputStream) {
        val handler = handlers[cmd]
        if (handler == null) {
            val body = dis.readAllBytes()
            println(
                "No handler for cmd=0x${
                    cmd.toString(16).uppercase()
                } ($cmd) body: ${body.joinToString(" ") { "%02X".format(it) }}"
            )
            return
        }
        handler.handle(ctx, dis)
    }
}

fun registerCmd() {
    CmdRegistry.register(HandshakeHandler)
    CmdRegistry.register(EnterGameHandler)
}