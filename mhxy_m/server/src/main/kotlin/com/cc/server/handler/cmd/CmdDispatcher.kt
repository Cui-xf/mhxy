package com.cc.server.handler.cmd

import com.cc.common.net.NetCmd
import com.cc.common.net.NetCmd.Companion.decode
import com.cc.server.util.JSON
import io.netty.channel.ChannelHandlerContext
import io.netty.handler.codec.http.websocketx.TextWebSocketFrame
import kotlin.reflect.KClass

object CmdDispatcher {
    // KClass -> handler（rawtype，注册和查找时统一用 KClass<*>）
    @Suppress("UNCHECKED_CAST")
    private val handlers = mutableMapOf<KClass<out NetCmd>, CmdHandler<out NetCmd>>()


    @Suppress("UNCHECKED_CAST")
    fun <T : NetCmd> register(klass: KClass<T>, handler: CmdHandler<T>) {
        handlers[klass] = handler
    }

    @Suppress("UNCHECKED_CAST")
    fun dispatch(ctx: ChannelHandlerContext, payload: String) {
        println("payload : $payload")
        val (reqId, code, cmd) = payload.decode { json, klass ->
            JSON.fromJson(json, klass.java)
        } ?: run {
            println("未知消息:${payload}")
            return
        }
        val klass = cmd::class
        val handler = handlers[klass] as? CmdHandler<NetCmd> ?: run {
            println("缺少对应 handler code=$code type=${klass.simpleName}")
            return
        }
        handler.handle(cmd)?.let { ctx.send(reqId, it) }
    }
}

fun ChannelHandlerContext.send(reqId: Long, cmd: NetCmd) {
    this.writeAndFlush(TextWebSocketFrame(cmd.encode(reqId) {
        JSON.toJson(it)
    }))
}

