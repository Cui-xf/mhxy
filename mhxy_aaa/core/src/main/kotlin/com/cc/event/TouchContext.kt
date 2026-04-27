package com.cc.event

import com.badlogic.gdx.math.Rectangle

object TouchContext {
    var touchX: Float = 0f
    var touchY: Float = 0f
    var justTouched: Boolean = false

    // ── Z-Index 栈：活跃 overlay 压入自己的 z，关闭时弹出 ──
    private val zStack = mutableListOf<Int>()

    /** 当前阈值：只有 z >= currentZ 的组件才能响应点击 */
    private val currentZ: Int get() = zStack.lastOrNull() ?: 0

    /** overlay 打开时调用，将自己的 z 压栈 */
    fun pushZ(z: Int) {
        zStack.add(z)
    }

    /** overlay 关闭时调用，从栈中移除对应 z */
    fun popZ(z: Int) {
        val idx = zStack.lastIndexOf(z)
        if (idx >= 0) zStack.removeAt(idx)
    }

    /** 切换 Screen 时调用，清空所有状态，避免残留 z 阻塞新场景 */
    fun reset() {
        zStack.clear()
        defaultZ = 0
        justTouched = false
    }

    // ── withZ 作用域：块内所有 inTouch(z 未显式传入) 使用指定 z ──
    @PublishedApi internal var defaultZ: Int = 0

    /**
     * 在此块内调用的 inTouch(z = defaultZ) 将使用 [z] 而非 0。
     * 支持嵌套：退出块后恢复上一层的 defaultZ。
     */
    inline fun <T> withZ(z: Int, block: () -> T): T {
        val prev = defaultZ
        defaultZ = z
        try {
            return block()
        } finally {
            defaultZ = prev
        }
    }

    operator fun component1() = touchX
    operator fun component2() = touchY
    operator fun component3() = justTouched

    /**
     * 检测点击。
     * @param z 调用者的 z-index，默认使用当前 withZ 作用域的值（无作用域则为 0）。
     *          低于栈顶阈值时直接返回 false。
     */
    fun inTouch(x: Float, y: Float, width: Float, height: Float,
                z: Int = defaultZ, clear: Boolean = true) =
        inTouch(Rectangle(x, y, width, height), z, clear)

    fun inTouch(rect: Rectangle, z: Int = defaultZ, clear: Boolean = true): Boolean {
        if (z < currentZ) return false
        val hit = justTouched && rect.contains(touchX, touchY)
        if (hit && clear) justTouched = false
        return hit
    }
}
