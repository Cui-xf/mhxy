package com.cc

import io.netty.bootstrap.ServerBootstrap
import io.netty.channel.*
import io.netty.channel.nio.NioEventLoopGroup
import io.netty.channel.socket.SocketChannel
import io.netty.channel.socket.nio.NioServerSocketChannel
import io.netty.handler.codec.http.HttpObjectAggregator
import io.netty.handler.codec.http.HttpServerCodec
import io.netty.handler.codec.http.websocketx.TextWebSocketFrame
import io.netty.handler.codec.http.websocketx.WebSocketServerProtocolHandler
import java.util.concurrent.TimeUnit

const val WS_PORT = 20009

fun main() {
    val boss = NioEventLoopGroup(1)
    val worker = NioEventLoopGroup()

    try {
        ServerBootstrap()
            .group(boss, worker)
            .channel(NioServerSocketChannel::class.java)
            .childHandler(object : ChannelInitializer<SocketChannel>() {
                override fun initChannel(ch: SocketChannel) {
                    ch.pipeline().addLast(
                        HttpServerCodec(),
                        HttpObjectAggregator(65536),
                        WebSocketServerProtocolHandler("/"),
                        WsDemoHandler()
                    )
                }
            })
            .bind(WS_PORT).sync()
            .channel().also { println("WebSocket server started on ws://127.0.0.1:$WS_PORT") }
            .closeFuture().sync()
    } finally {
        boss.shutdownGracefully()
        worker.shutdownGracefully()
    }
}

class WsDemoHandler : SimpleChannelInboundHandler<TextWebSocketFrame>() {
    private var tick = 0

    override fun userEventTriggered(ctx: ChannelHandlerContext, evt: Any) {
        if (evt is WebSocketServerProtocolHandler.HandshakeComplete) {
            println("[WS] client connected: ${ctx.channel().remoteAddress()}")
            ctx.writeAndFlush(TextWebSocketFrame("hello from server"))

            ctx.executor().scheduleAtFixedRate({
                if (ctx.channel().isActive) {
                    ctx.writeAndFlush(TextWebSocketFrame("tick ${++tick}"))
                }
            }, 3, 3, TimeUnit.SECONDS)
        }
        super.userEventTriggered(ctx, evt)
    }

    override fun channelRead0(ctx: ChannelHandlerContext, msg: TextWebSocketFrame) {
        println("[WS] received: ${msg.text()}")
        ctx.writeAndFlush(TextWebSocketFrame("echo: ${msg.text()}"))
    }

    override fun channelInactive(ctx: ChannelHandlerContext) {
        println("[WS] client disconnected: ${ctx.channel().remoteAddress()}")
        super.channelInactive(ctx)
    }

    override fun exceptionCaught(ctx: ChannelHandlerContext, cause: Throwable) {
        println("[WS] error: ${cause.message}")
        ctx.close()
    }
}
