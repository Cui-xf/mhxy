package com.cc.server.handler.cmd

import com.cc.common.net.NetCmd
import com.cc.common.net.NetCmd.Companion.deCode
import com.cc.server.util.JSON
import io.netty.channel.ChannelHandlerContext
import io.netty.handler.codec.http.websocketx.TextWebSocketFrame

object CmdDispatcher {
    private val handlers = mutableMapOf<Int, CmdHandler>()

    fun dispatch(ctx: ChannelHandlerContext, reqId: String, payload: String) {
        val (code, cmd) = payload.deCode()
        val handler = handlers[code]
        if (handler == null) {
            println("缺少对应handler code=${code} cmd=$cmd")
            return
        }
        handler.handle(null)?.let {
            ctx.send(it)
        }
    }
}

fun ChannelHandlerContext.send(cmd: NetCmd) {
    this.writeAndFlush(TextWebSocketFrame(NetCmd.encode(cmd, JSON.toJson(cmd))))

}

