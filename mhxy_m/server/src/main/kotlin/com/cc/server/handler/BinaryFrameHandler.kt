package com.cc.server.handler

import io.netty.channel.ChannelHandlerContext
import io.netty.channel.SimpleChannelInboundHandler
import io.netty.handler.codec.http.websocketx.BinaryWebSocketFrame

class BinaryFrameHandler : SimpleChannelInboundHandler<BinaryWebSocketFrame>() {
    override fun channelRead0(ctx: ChannelHandlerContext, msg: BinaryWebSocketFrame) {
        val buf = msg.content()
        println("[WS] binary frame received, bytes=${buf.readableBytes()}")
        // TODO: 处理二进制帧
    }

    override fun exceptionCaught(ctx: ChannelHandlerContext, cause: Throwable) {
        println("[WS] binary error: ${cause.message}")
        ctx.close()
    }
}
