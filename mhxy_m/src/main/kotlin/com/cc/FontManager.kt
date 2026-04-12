package com.cc

import com.badlogic.gdx.Gdx
import com.badlogic.gdx.graphics.Color
import com.badlogic.gdx.graphics.Texture
import com.badlogic.gdx.graphics.g2d.BitmapFont
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator
import com.badlogic.gdx.utils.Disposable

object FontManager : Disposable {
    val SMALL_FONT: BitmapFont by lazy { createFont(12) }
    val MEDIA_FONT: BitmapFont by lazy { createFont(14) }

    private var generator: FreeTypeFontGenerator? = null

    private fun createFont(size: Int, color: Color = Color.WHITE): BitmapFont {
        if (generator == null) {
//            generator = FreeTypeFontGenerator(Gdx.files.classpath("assets/arial_unicode.ttf"))
            generator = FreeTypeFontGenerator(Gdx.files.absolute("C:/Windows/Fonts/simhei.ttf"))
        }
        val param = FreeTypeFontGenerator.FreeTypeFontParameter().apply {
            this.size = size
            this.color = color
            genMipMaps = true
            minFilter = Texture.TextureFilter.Nearest
            magFilter = Texture.TextureFilter.Nearest
            hinting = FreeTypeFontGenerator.Hinting.Full
            incremental = true
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
