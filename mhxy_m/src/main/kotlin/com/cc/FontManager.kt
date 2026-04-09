package com.cc

import com.badlogic.gdx.Gdx
import com.badlogic.gdx.graphics.Color
import com.badlogic.gdx.graphics.g2d.BitmapFont
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator

object FontManager {
    val SMALL_FONT: BitmapFont by lazy { createFont(12) }

    private var generator: FreeTypeFontGenerator? = null

    private fun createFont(size: Int, color: Color = Color.WHITE): BitmapFont {
        if (generator == null) {
            generator = FreeTypeFontGenerator(Gdx.files.classpath("assets/arial_unicode.ttf"))
        }
        val param = FreeTypeFontGenerator.FreeTypeFontParameter().apply {
            this.size = size
            this.color = color
            genMipMaps = true
            minFilter = com.badlogic.gdx.graphics.Texture.TextureFilter.Linear
            magFilter = com.badlogic.gdx.graphics.Texture.TextureFilter.Linear
            incremental = true
        }
        return generator!!.generateFont(param)
    }

    fun dispose() {
        SMALL_FONT.dispose()
        generator?.dispose()
        generator = null
    }
}
