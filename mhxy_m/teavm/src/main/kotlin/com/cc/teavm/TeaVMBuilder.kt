package com.cc.teavm

import com.github.xpenatan.gdx.teavm.backends.shared.config.AssetFileHandle
import com.github.xpenatan.gdx.teavm.backends.shared.config.compiler.TeaCompiler
import com.github.xpenatan.gdx.teavm.backends.web.config.backend.WebBackend
import org.teavm.tooling.TeaVMSourceFilePolicy
import org.teavm.tooling.sources.DirectorySourceFileProvider
import org.teavm.vm.TeaVMOptimizationLevel
import java.io.File

/**
 * TeaVM 构建入口，由 Gradle 的 JavaExec 任务在编译期调用（非浏览器运行时）。
 * 将 Kotlin/Java 代码通过 TeaVM 编译成 JS，输出到 build/dist。
 * 传入 "run" 参数时会额外启动 Jetty 服务器在 localhost:8080 预览。
 * 传入 "debug" 参数时关闭混淆、生成 source map，方便浏览器调试。
 */
object TeaVMBuilder {
    @JvmStatic
    fun main(arguments: Array<String>) {
        // 是否 debug 模式（关闭混淆、生成 source map）
        val debug = "debug" in arguments
        // 是否在构建完成后启动 Jetty 服务器
        val startJetty = "run" in arguments
        // Gradle processResources 输出目录，包含全部合并后的资源
        val assetsPath = arguments.firstOrNull { it.startsWith("--assets=") }
            ?.removePrefix("--assets=") ?: "../assets"

        // 配置 Web 后端：页面标题、画布尺寸、Jetty 端口
        val webBackend = WebBackend()
            .setHtmlTitle("mhxy_m")
            .setHtmlWidth(240)
            .setHtmlHeight(320)
            .setStartJettyAfterBuild(startJetty)
            .setJettyPort(8080)
//            .setWebAssembly(true) // 改用 WASM 输出替代 JS

        TeaCompiler(webBackend)
            // 打包 Gradle processResources 合并后的全部资源
            .addAssets(AssetFileHandle(assetsPath))
            // debug 用 SIMPLE 优化（保留可读性），release 用 ADVANCED（体积更小）
            .setOptimizationLevel(if (debug) TeaVMOptimizationLevel.SIMPLE else TeaVMOptimizationLevel.ADVANCED)
            // 浏览器端的运行入口
            .setMainClass("com.cc.teavm.TeaVMLauncher")
            // release 时混淆 JS，debug 时保留符号
            .setObfuscated(!debug)
            // debug 时生成 .teavmdbg 调试信息
            .setDebugInformationGenerated(debug)
            // debug 时生成 source map，浏览器可映射回 Kotlin 源码
            .setSourceMapsFileGenerated(debug)
            // debug 时将源码文件复制到输出目录，供 source map 使用
            .setSourceFilePolicy(if (debug) TeaVMSourceFilePolicy.COPY else TeaVMSourceFilePolicy.DO_NOTHING)
            // 提供 core 模块源码路径，用于 source map 映射
            .addSourceFileProvider(DirectorySourceFileProvider(File("../core/src/main/kotlin")))
            // 如需反射支持，在此注册对应类或包，例如：
            .addReflectionClass("com.cc.common.dto.**")
            .build(File("build/dist"))
    }
}