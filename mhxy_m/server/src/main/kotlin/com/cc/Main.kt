package com.cc

import com.cc.handler.TCPFrameDecoder
import com.cc.handler.GameProtocolHandler
import com.cc.handler.cmd.registerCmd
import io.netty.bootstrap.ServerBootstrap
import io.netty.channel.ChannelInitializer
import io.netty.channel.nio.NioEventLoopGroup
import io.netty.channel.socket.SocketChannel
import io.netty.channel.socket.nio.NioServerSocketChannel

const val PORT = 20008

fun main() {
    registerCmd()
    val boss = NioEventLoopGroup(1)
    val worker = NioEventLoopGroup()

    try {
        ServerBootstrap()
            .group(boss, worker)
            .channel(NioServerSocketChannel::class.java)
            .childHandler(object : ChannelInitializer<SocketChannel>() {
                override fun initChannel(ch: SocketChannel) {
                    ch.pipeline().addLast(
                        TCPFrameDecoder(),
                        GameProtocolHandler()
                    )
                }
            })
            .bind(PORT).sync()
            .channel().also { println("Server started on port $PORT") }
            .closeFuture().sync()
    } finally {
        boss.shutdownGracefully()
        worker.shutdownGracefully()
    }
}

