package com.cc

infix fun Int.ceilDiv(divisor: Int): Int {
    return (this + divisor - 1) / divisor
}
