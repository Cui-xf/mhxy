package com.cc.server.handler

import com.cc.server.handler.cmd.CmdDispatcher
import io.netty.channel.ChannelHandlerContext
import io.netty.channel.SimpleChannelInboundHandler
import io.netty.handler.codec.http.websocketx.TextWebSocketFrame

class TextFrameHandler : SimpleChannelInboundHandler<TextWebSocketFrame>() {
    override fun channelRead0(ctx: ChannelHandlerContext, msg: TextWebSocketFrame) {
        val text = msg.text()
        CmdDispatcher.dispatch(ctx, text)
    }

    override fun exceptionCaught(ctx: ChannelHandlerContext, cause: Throwable) {
        cause.printStackTrace()
        println("[WS] error: ${cause.message}")
        ctx.close()
    }
}
