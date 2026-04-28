package com.cc.render

import com.badlogic.gdx.graphics.Color
import com.badlogic.gdx.graphics.glutils.ShapeRenderer
import com.badlogic.gdx.math.Rectangle
import com.cc.screens.AbstractScreen.Companion.VIRTUAL_H
import kotlin.math.abs

fun ShapeRenderer.drawRectBorder(
    x: Float,
    y: Float,
    w: Float,
    h: Float,
    borders: List<Pair<Int, Color>>,
    fillColor: Color? = null,
    align: Align = Align.CENTER_TOP
) {
    val lx = if (align == Align.CENTER_TOP) x - w / 2 else x
    this.surround(
        Rectangle(lx, y, w, h).toPath(),
        borders,
        fillColor
    )
}

/**
 * 绘制封闭多边形的多层内缩边框并填充内部。
 * @param path 外部顶点（y轴朝下的坐标系）
 * @param borders 从外到内的边框层，每层为 Pair(宽度, 颜色)
 * @param fillColor 内部填充色，null则不填充
 */
fun ShapeRenderer.surround(
    path: List<Pair<Float, Float>>,
    borders: List<Pair<Int, Color>>,
    fillColor: Color? = null,
) {
    val cleaned = cleanPath(path)
    if (cleaned.size < 3) return
    val n = cleaned.size

    // path坐标y轴朝下，转换为屏幕坐标y轴朝上
    var outer = Array(n) { i -> Pair(cleaned[i].first, VIRTUAL_H - cleaned[i].second) }

    // 计算有向面积，判断绕序
    var signedArea2 = 0f
    for (i in 0 until n) {
        val cur = outer[i]
        val next = outer[(i + 1) % n]
        signedArea2 += cur.first * next.second - next.first * cur.second
    }
    val sign = if (signedArea2 >= 0) -1f else 1f

    begin(ShapeRenderer.ShapeType.Filled)

    for ((bw, bColor) in borders) {
        val w = bw.toFloat()
        val inner = inset(outer, n, sign, w)

        color = bColor
        for (i in 0 until n) {
            val j = (i + 1) % n
            triangle(
                outer[i].first,
                outer[i].second,
                outer[j].first,
                outer[j].second,
                inner[i].first,
                inner[i].second
            )
            triangle(
                outer[j].first,
                outer[j].second,
                inner[j].first,
                inner[j].second,
                inner[i].first,
                inner[i].second
            )
        }

        outer = inner
    }

    // 填充剩余内部
    if (fillColor != null) {
        setColor(fillColor)
        for (i in 1 until n - 1) {
            triangle(
                outer[0].first,
                outer[0].second,
                outer[i].first,
                outer[i].second,
                outer[i + 1].first,
                outer[i + 1].second
            )
        }
    }

    end()
}

/** 将多边形顶点沿内法线方向内缩 w 像素 */
private fun inset(pts: Array<Pair<Float, Float>>, n: Int, sign: Float, w: Float): Array<Pair<Float, Float>> {
    return Array(n) { i ->
        val prev = pts[(i - 1 + n) % n]
        val cur = pts[i]
        val next = pts[(i + 1) % n]

        val dx1 = cur.first - prev.first
        val dy1 = cur.second - prev.second
        val len1 = Math.sqrt((dx1 * dx1 + dy1 * dy1).toDouble()).toFloat()
        val nx1 = sign * dy1 / len1
        val ny1 = sign * -dx1 / len1

        val dx2 = next.first - cur.first
        val dy2 = next.second - cur.second
        val len2 = Math.sqrt((dx2 * dx2 + dy2 * dy2).toDouble()).toFloat()
        val nx2 = sign * dy2 / len2
        val ny2 = sign * -dx2 / len2

        val p1x = prev.first + nx1 * w
        val p1y = prev.second + ny1 * w
        val p2x = cur.first + nx2 * w
        val p2y = cur.second + ny2 * w

        val cross = dx1 * dy2 - dy1 * dx2
        if (Math.abs(cross) < 1e-6f) {
            Pair(cur.first + nx1 * w, cur.second + ny1 * w)
        } else {
            val t = ((p2x - p1x) * dy2 - (p2y - p1y) * dx2) / cross
            Pair(p1x + t * dx1, p1y + t * dy1)
        }
    }
}

/**
 * 去除路径中的重复点和共线点，保留实际拐点
 */
private fun cleanPath(path: List<Pair<Float, Float>>): List<Pair<Float, Float>> {
    // 先去除相邻重复点
    val deduped = mutableListOf<Pair<Float, Float>>()
    for (p in path) {
        if (deduped.isEmpty() || !(abs(p.first - deduped.last().first) < 1e-6f && abs(p.second - deduped.last().second) < 1e-6f)) {
            deduped.add(p)
        }
    }
    // 检查首尾重复
    if (deduped.size > 1) {
        val first = deduped.first()
        val last = deduped.last()
        if (Math.abs(first.first - last.first) < 1e-6f && Math.abs(first.second - last.second) < 1e-6f) {
            deduped.removeAt(deduped.size - 1)
        }
    }

    // 去除共线点：如果前一点、当前点、后一点三点共线，则当前点多余
    val result = mutableListOf<Pair<Float, Float>>()
    val m = deduped.size
    for (i in 0 until m) {
        val prev = deduped[(i - 1 + m) % m]
        val cur = deduped[i]
        val next = deduped[(i + 1) % m]
        val cross = (cur.first - prev.first) * (next.second - prev.second) -
                (cur.second - prev.second) * (next.first - prev.first)
        if (Math.abs(cross) > 1e-4f) {
            result.add(cur)
        }
    }
    return result
}

fun Rectangle.toPath(): List<Pair<Float, Float>> {
    return listOf(
        Pair(x, y),
        Pair(x + width, y),
        Pair(x + width, y + height),
        Pair(x, y + height),
    )
}