package com.cc

import com.badlogic.gdx.Gdx
import com.badlogic.gdx.graphics.Color
import com.badlogic.gdx.graphics.g2d.BitmapFont
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator

object FontManager {

    private var generator: FreeTypeFontGenerator? = null

    fun createFont(size: Int, color: Color = Color.WHITE): BitmapFont {
        if (generator == null) {
            generator = FreeTypeFontGenerator(Gdx.files.classpath("assets/arial_unicode.ttf"))
        }
        val param = FreeTypeFontGenerator.FreeTypeFontParameter().apply {
            this.size = size
            this.color = color
            // 声明需要的中文字符范围 + 常用标点
            characters = FreeTypeFontGenerator.DEFAULT_CHARS +
                "梦幻西游加载中资源进入开始游戏返回主菜单村民商人守卫时间秒移动方向键WASD点击按钮或按Enter" +
                "：。，！？、—…·「」『』【】《》" +
                "仙人妖怪宝箱场景一二传送门按进地图关闭打开HP攻击防御玩家等级经验金币名帧动画静态图片集切片左右上下" +
                "帧图集分区域演示小号中大型怪物精英BOSS普通野外副本城镇"
            genMipMaps = true
            minFilter = com.badlogic.gdx.graphics.Texture.TextureFilter.Linear
            magFilter = com.badlogic.gdx.graphics.Texture.TextureFilter.Linear
        }
        return generator!!.generateFont(param)
    }

    fun dispose() {
        generator?.dispose()
        generator = null
    }
}
