package com.cc.event

import com.badlogic.gdx.math.Rectangle

object TouchContext {
    var touchX: Float = 0f
    var touchY: Float = 0f
    var justTouched: Boolean = false

    operator fun component1() = touchX
    operator fun component2() = touchY
    operator fun component3() = justTouched

    fun inTouch(x: Float, y: Float, width: Float, height: Float) = inTouch(Rectangle(x, y, width, height))

    fun inTouch(rect: Rectangle): Boolean {
        return justTouched && rect.contains(touchX, touchY)
    }
}