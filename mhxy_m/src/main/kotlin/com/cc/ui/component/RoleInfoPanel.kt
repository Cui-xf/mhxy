//package com.cc.ui.component
//
//import com.badlogic.gdx.graphics.g2d.BitmapFont
//import com.badlogic.gdx.graphics.g2d.SpriteBatch
//import com.badlogic.gdx.graphics.glutils.ShapeRenderer
//import com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType
//import com.cc.render.Align
//import com.cc.render.drawRect
//import com.cc.render.drawString
//import com.cc.render.toColor
//
///**
// * 角色信息区（昵称、等级），x/y 相对父组件。
// */
//class RoleInfoPanel(
//    x: Float, y: Float, w: Float, h: Float,
//    var font: BitmapFont,
//    var nickname: String = "",
//    var level: Int = 0,
//) : UIComponent(x, y, w, h,) {
//
//    override fun render(batch: SpriteBatch, sr: ShapeRenderer, ox: Float, oy: Float) {
//        val ax = ox + x
//        val ay = oy + y
//
//        // 1. 背景 + 边框
//        sr.begin(ShapeType.Filled)
//        sr.drawRect(6732228.toColor(), ax, ay, w, h, Align.LEFT)
//        sr.end()
//        sr.begin(ShapeType.Line)
//        sr.drawRect(26540.toColor(),    ax,     ay,     w,     h,     Align.LEFT)
//        sr.drawRect(26540.toColor(),    ax + 2, ay + 2, w - 4, h - 4, Align.LEFT)
//        sr.drawRect(11267556.toColor(), ax + 1, ay + 1, w - 2, h - 2, Align.LEFT)
//        sr.end()
//
//        // 2. 文字（在背景之上）
//        batch.begin()
//        batch.drawString(font, "昵称：$nickname", 2176196.toColor(), ax + 4, ay + 8, Align.LEFT)
//        batch.drawString(font, "等级：$level",   2176196.toColor(), ax + 4, ay + 8 + font.lineHeight, Align.LEFT)
//        batch.end()
//    }
//}
