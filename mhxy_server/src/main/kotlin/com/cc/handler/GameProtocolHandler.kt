package com.cc.handler

import com.cc.handler.cmd.CmdRegistry
import io.netty.buffer.ByteBuf
import io.netty.buffer.ByteBufInputStream
import io.netty.channel.ChannelHandlerContext
import io.netty.channel.SimpleChannelInboundHandler
import java.io.DataInputStream

/**
 * 应用层 Payload 处理器
 *
 * 接收 TCPFrameDecoder 已剥除帧头（0xAE、len、0xAF）后的纯业务字段 ByteBuf，格式：
 *   [opcode: short(2B, 大端序)] [业务字段]
 *
 * 读取 opcode，将剩余业务字段包装为 DataInputStream 交给 CmdRegistry.dispatch。
 */
class GameProtocolHandler : SimpleChannelInboundHandler<ByteBuf>() {

    override fun channelActive(ctx: ChannelHandlerContext) {
        println("Client connected: ${ctx.channel().remoteAddress()}")
    }

    override fun channelInactive(ctx: ChannelHandlerContext) {
        println("Client disconnected: ${ctx.channel().remoteAddress()}")
    }

    override fun exceptionCaught(ctx: ChannelHandlerContext, cause: Throwable) {
        cause.printStackTrace()
        ctx.close()
    }

    override fun channelRead0(ctx: ChannelHandlerContext, buf: ByteBuf) {
        if (buf.readableBytes() < 2) {
            println("[GameProtocolHandler] body too short (${buf.readableBytes()} bytes), discarding")
            return
        }

        val opcode = buf.readShort().toInt()
        val dis = DataInputStream(ByteBufInputStream(buf))
        CmdRegistry.dispatch(ctx, opcode, dis)
    }
}