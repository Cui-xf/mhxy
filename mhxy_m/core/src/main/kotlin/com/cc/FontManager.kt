package com.cc

import com.badlogic.gdx.graphics.Color
import com.badlogic.gdx.graphics.Texture
import com.badlogic.gdx.graphics.g2d.BitmapFont
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator
import com.badlogic.gdx.utils.Disposable
import ktx.assets.toInternalFile

object FontManager : Disposable {
    val SMALL_FONT: BitmapFont by lazy { createFont(12) }
    val MEDIA_FONT: BitmapFont by lazy { createFont(14) }

    private var generator: FreeTypeFontGenerator? = null
    private var extraChars: String = ""

    // 在游戏启动时调用一次，加载 assets/font_chars.txt
    fun init() {
        val file = "font_chars.txt".toInternalFile()
        if (file.exists()) {
            extraChars = file.readString("UTF-8")
        }
    }

    private fun createFont(size: Int, color: Color = Color.WHITE): BitmapFont {
        if (generator == null) {
            generator = FreeTypeFontGenerator("arial_unicode.ttf".toInternalFile())
        }
        val param = FreeTypeFontGenerator.FreeTypeFontParameter().apply {
            this.size = size
            this.color = color
            genMipMaps = true
            minFilter = Texture.TextureFilter.Nearest
            magFilter = Texture.TextureFilter.Nearest
            hinting = FreeTypeFontGenerator.Hinting.Full
            characters = FreeTypeFontGenerator.DEFAULT_CHARS + extraChars
        }
        return generator!!.generateFont(param)
    }

    override fun dispose() {
        SMALL_FONT.dispose()
        MEDIA_FONT.dispose()
        generator?.dispose()
        generator = null
    }
}
