package com.cc.server.util

import com.fasterxml.jackson.databind.DeserializationFeature
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import com.fasterxml.jackson.module.kotlin.readValue

object JSON {
    val mapper: ObjectMapper = jacksonObjectMapper().apply {
        configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)
    }

    fun toJson(obj: Any?): String = mapper.writeValueAsString(obj)

    fun toPrettyJson(obj: Any?): String =
        mapper.writerWithDefaultPrettyPrinter().writeValueAsString(obj)

    fun toBytes(obj: Any?): ByteArray = mapper.writeValueAsBytes(obj)

    inline fun <reified T> fromJson(json: String): T = mapper.readValue(json)

    inline fun <reified T> fromJson(bytes: ByteArray): T = mapper.readValue(bytes)

    fun <T> fromJson(json: String, clazz: Class<T>): T = mapper.readValue(json, clazz)

    fun <T> fromJson(bytes: ByteArray, clazz: Class<T>): T = mapper.readValue(bytes, clazz)
}
