package com.cc.handler

import io.netty.buffer.ByteBuf
import io.netty.channel.ChannelHandlerContext
import io.netty.handler.codec.ByteToMessageDecoder

private const val HANDS1 = 0x5A.toByte()  // 90
private const val HANDS2 = 0x48.toByte()  // 72
private const val FRAME_HEADER = 0xAE.toByte()  // -82

/**
 * 传输层帧解码器，处理粘包/半包。
 *
 * 帧格式（来源：SocketReadLooper.doWrite）：
 *   首包：[0x5A][0x48][0xAE][len_hi][len_lo][payload[1]...payload[n]]
 *   后续：[0xAE][len_hi][len_lo][payload[1]...payload[n]]
 *
 * buffer[0]       = payload[0] = 0xAE
 * buffer[1..2]    = payload.length（大端序，即 len）
 * buffer[3..n+2]  = payload[1..n]
 *
 * len = payload.length，包含 0xAE 和 0xAF 在内的完整 payload 长度。
 * 完整帧在缓冲区中占 2(len字段) + len 字节（0xAE 计入 len）。
 *
 * 向下游传递：独立复制的纯业务字段 ByteBuf，内容为 [opcode(2B)][业务字段]，
 * 0xAE、len 字段、0xAF 均已剥除，下游无需再关心帧格式。
 */
class TCPFrameDecoder : ByteToMessageDecoder() {

    /** 握手魔数是否已剥离（每个连接只出现一次） */
    private var handshakeStripped = false

    override fun decode(ctx: ChannelHandlerContext, buf: ByteBuf, out: MutableList<Any>) {
        while (true) {
            // 剥离握手魔数，仅首包一次
            if (!handshakeStripped) {
                if (buf.readableBytes() < 2) return
                if (buf.getByte(buf.readerIndex()) == HANDS1 &&
                    buf.getByte(buf.readerIndex() + 1) == HANDS2
                ) {
                    buf.skipBytes(2)
                    println("[TCPFrameDecoder] handshake magic stripped")
                }
                // 无论有没有魔数都只尝试一次
                handshakeStripped = true
            }

            // 需要至少 3 字节才能读出帧头和 len：[0xAE][len_hi][len_lo]
            if (buf.readableBytes() < 3) return

            buf.markReaderIndex()

            //[0xAE][len_hi][len_lo][payload[1]...payload[n]]
            val frameHeader = buf.getByte(buf.readerIndex())
            if (frameHeader != FRAME_HEADER) {
                println("[TCPFrameDecoder] unexpected byte 0x${frameHeader.toInt().and(0xFF).toString(16)}, closing")
                ctx.close()
                return
            }

            // len = payload.length，含 0xAE 和 0xAF，完整帧 = 2(len字段) + len 字节
            val len = buf.getUnsignedShort(buf.readerIndex() + 1)
            if (buf.readableBytes() < 2 + len) {
                // 半包，等待更多数据
                buf.resetReaderIndex()
                return
            }

            // 跳过 0xAE(1) + len字段(2) = 3 字节，读纯业务字段，末尾 0xAF(1) 也跳过
            // 纯业务字段长度 = len - 1(0xAE) - 1(0xAF) = len - 2
            buf.skipBytes(3)
            val bodyLen = len - 2
            val body = ctx.alloc().buffer(bodyLen)
            buf.readBytes(body, bodyLen)
            buf.skipBytes(1)  // 跳过 0xAF
            out.add(body)
        }
    }

    override fun channelInactive(ctx: ChannelHandlerContext) {
        super.channelInactive(ctx)
    }
}

