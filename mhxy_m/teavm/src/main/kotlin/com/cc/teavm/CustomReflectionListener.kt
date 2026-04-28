package com.cc.teavm

import com.github.xpenatan.gdx.teavm.backends.shared.config.reflection.DefaultReflectionListener

class CustomReflectionListener : DefaultReflectionListener() {
    init {
        addClassOrPackage("com.cc.common.dto.**")
    }
}
