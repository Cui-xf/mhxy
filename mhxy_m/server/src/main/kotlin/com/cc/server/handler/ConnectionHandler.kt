package com.cc.server.handler

import io.netty.channel.ChannelHandlerContext
import io.netty.channel.ChannelInboundHandlerAdapter
import io.netty.handler.codec.http.websocketx.TextWebSocketFrame
import io.netty.handler.codec.http.websocketx.WebSocketServerProtocolHandler

class ConnectionHandler : ChannelInboundHandlerAdapter() {
    override fun userEventTriggered(ctx: ChannelHandlerContext, evt: Any) {
        if (evt is WebSocketServerProtocolHandler.HandshakeComplete) {
            println("[WS] client connected: ${ctx.channel().remoteAddress()}")
            ctx.writeAndFlush(TextWebSocketFrame("hello from server"))
        }
        super.userEventTriggered(ctx, evt)
    }

    override fun channelInactive(ctx: ChannelHandlerContext) {
        println("[WS] client disconnected: ${ctx.channel().remoteAddress()}")
        super.channelInactive(ctx)
    }
}
