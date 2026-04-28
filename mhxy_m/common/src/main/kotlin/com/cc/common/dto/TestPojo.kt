package com.cc.common.dto

import kotlinx.serialization.Serializable

@Serializable
data class TestPojo(var name: String = "") {

    @Serializable
    data class SubPojo(var name: String = "")
}

@Serializable
data class TestPojo2(var name: String = "")