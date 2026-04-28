package com.cc.common.dto

data class TestPojo(var name: String = "") {

    data class SubPojo(var name: String = "")
}

data class TestPojo2(var name: String = "")
