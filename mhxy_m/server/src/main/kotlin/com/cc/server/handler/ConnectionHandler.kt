package com.cc.server.handler

import com.cc.common.net.NetCmd
import com.cc.common.net.Ticket
import com.cc.server.handler.cmd.send
import io.netty.channel.ChannelHandlerContext
import io.netty.channel.ChannelInboundHandlerAdapter
import io.netty.handler.codec.http.websocketx.WebSocketServerProtocolHandler
import java.util.concurrent.TimeUnit


class ConnectionHandler : ChannelInboundHandlerAdapter() {
    override fun userEventTriggered(ctx: ChannelHandlerContext, evt: Any) {
        if (evt is WebSocketServerProtocolHandler.HandshakeComplete) {
            println("[WS] client connected: ${ctx.channel().remoteAddress()}")
            ctx.executor().scheduleAtFixedRate({
                if (ctx.channel().isActive) {
                    ctx.send(NetCmd.genReqId(), Ticket(System.currentTimeMillis()))
                }
            }, 5, 3, TimeUnit.SECONDS)
        }
        super.userEventTriggered(ctx, evt)
    }

    override fun channelInactive(ctx: ChannelHandlerContext) {
        println("[WS] client disconnected: ${ctx.channel().remoteAddress()}")
        super.channelInactive(ctx)
    }
}
