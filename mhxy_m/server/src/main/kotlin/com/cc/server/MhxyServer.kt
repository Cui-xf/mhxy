package com.cc.server

import com.cc.server.handler.BinaryFrameHandler
import com.cc.server.handler.ConnectionHandler
import com.cc.server.handler.TextFrameHandler
import io.netty.bootstrap.ServerBootstrap
import io.netty.channel.ChannelInitializer
import io.netty.channel.MultiThreadIoEventLoopGroup
import io.netty.channel.nio.NioIoHandler
import io.netty.channel.socket.SocketChannel
import io.netty.channel.socket.nio.NioServerSocketChannel
import io.netty.handler.codec.http.HttpObjectAggregator
import io.netty.handler.codec.http.HttpServerCodec
import io.netty.handler.codec.http.websocketx.WebSocketServerProtocolHandler

const val WS_PORT = 20009

fun main() {
    val boss = MultiThreadIoEventLoopGroup(1, NioIoHandler.newFactory())
    val worker = MultiThreadIoEventLoopGroup(NioIoHandler.newFactory())

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
                        ConnectionHandler(),
                        TextFrameHandler(),
                        BinaryFrameHandler()
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

