package com.cc.server.handler.cmd

import com.cc.common.net.NetCmd
import com.cc.common.net.NetCmd.Companion.deCode
import com.cc.server.util.JSON
import io.netty.channel.ChannelHandlerContext
import io.netty.handler.codec.http.websocketx.TextWebSocketFrame
import kotlin.reflect.KClass

object CmdDispatcher {
    // code -> NetCmd 子类
    private val codeToClass: Map<Int, KClass<out NetCmd>> = buildCodeMap()

    // KClass -> handler（rawtype，注册和查找时统一用 KClass<*>）
    @Suppress("UNCHECKED_CAST")
    private val handlers = mutableMapOf<KClass<out NetCmd>, CmdHandler<out NetCmd>>()

    private fun buildCodeMap(): Map<Int, KClass<out NetCmd>> {
        return NetCmd::class.sealedSubclasses
            .also { subs -> require(subs.isNotEmpty()) { "NetCmd 没有密封子类" } }
            .associateBy { klass ->
                val instance = klass.objectInstance
                    ?: klass.constructors.firstOrNull { it.parameters.all { p -> p.isOptional } }
                        ?.callBy(emptyMap())
                    ?: error("无法获取 ${klass.simpleName} 的 code，需提供无参构造或 object")
                instance.code
            }
    }

    @Suppress("UNCHECKED_CAST")
    fun <T : NetCmd> register(klass: KClass<T>, handler: CmdHandler<T>) {
        handlers[klass] = handler
    }

    @Suppress("UNCHECKED_CAST")
    fun dispatch(ctx: ChannelHandlerContext, reqId: String, payload: String) {
        val (code, json) = payload.deCode()
        val klass = codeToClass[code]
        if (klass == null) {
            println("未知 code=$code")
            return
        }
        val cmd = JSON.fromJson(json, klass.java)
        val handler = handlers[klass] as? CmdHandler<NetCmd>
        if (handler == null) {
            println("缺少对应 handler code=$code type=${klass.simpleName}")
            return
        }
        handler.handle(cmd)?.let { ctx.send(reqId, it) }
    }
}

fun ChannelHandlerContext.send(reqId: String, cmd: NetCmd) {
    this.writeAndFlush(TextWebSocketFrame("${reqId}|${NetCmd.encode(cmd, JSON.toJson(cmd))}"))
}

