package com.cc.handler.util

import io.netty.buffer.ByteBuf
import io.netty.buffer.Unpooled
import io.netty.channel.ChannelHandlerContext
import java.io.ByteArrayOutputStream
import java.io.DataOutputStream

/**
 * 服务端响应包构建与发送工具。
 *
 * 响应包格式（来源：NetUtils.java:readSocket()）：
 *   [0x02] [opcode: short(2B)] [body_len: int(4B)] [body: body_len字节]
 */
object ResponseWriter {

    fun send(ctx: ChannelHandlerContext, opcode: Int, body: ByteArray) {
        val buf: ByteBuf = Unpooled.buffer(1 + 2 + 4 + body.size)
        buf.writeByte(0x02)
        buf.writeShort(opcode)
        buf.writeInt(body.size)
        buf.writeBytes(body)
        ctx.writeAndFlush(buf)
    }

    /** 构建 body 的 DSL，返回序列化后的字节数组 */
    fun buildBody(block: DataOutputStream.() -> Unit): ByteArray {
        val bos = ByteArrayOutputStream()
        DataOutputStream(bos).use { it.block() }
        return bos.toByteArray()
    }
}
