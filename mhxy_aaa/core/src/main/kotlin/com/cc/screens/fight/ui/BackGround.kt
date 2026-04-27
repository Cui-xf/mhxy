package com.cc.screens.fight.ui

import com.badlogic.gdx.Gdx
import com.badlogic.gdx.graphics.Color
import com.badlogic.gdx.graphics.GL20
import com.badlogic.gdx.graphics.Texture
import com.badlogic.gdx.graphics.g2d.SpriteBatch
import com.badlogic.gdx.graphics.g2d.TextureRegion
import com.badlogic.gdx.graphics.glutils.ShapeRenderer
import com.cc.asset.AssetLoader
import com.cc.render.Align
import com.cc.render.drawImage
import com.cc.screens.AbstractScreen
import com.cc.ui.component.UIComponent

class BackGround(
    assetLoader: AssetLoader,
    private val mapBg: TextureRegion
) : UIComponent(assetLoader) {
    private val fightBg by resource("fightBG.png", Texture::class)

    override fun render(
        batch: SpriteBatch,
        sr: ShapeRenderer,
        cx: Float,
        cy: Float,
        cw: Float,
        ch: Float,
        delta: Float
    ) {
        batch.begin()
        batch.drawImage(mapBg, 0f, 0f, align = Align.LEFT_TOP)
        batch.drawImage(
            fightBg,
            AbstractScreen.VIRTUAL_W / 2,
            (AbstractScreen.VIRTUAL_H - fightBg.height) / 2,
            align = Align.CENTER_TOP
        )
        batch.end()

        Gdx.gl.glEnable(GL20.GL_BLEND)
        Gdx.gl.glBlendFunc(GL20.GL_SRC_ALPHA, GL20.GL_ONE_MINUS_SRC_ALPHA)
        sr.begin(ShapeRenderer.ShapeType.Filled)
        sr.color = Color(0f, 0f, 0f, 0.6f)
        sr.rect(0f, 0f, AbstractScreen.VIRTUAL_W, AbstractScreen.VIRTUAL_H)
        sr.end()
        Gdx.gl.glDisable(GL20.GL_BLEND)
    }

    override fun dispose() {
        mapBg.texture.dispose()
        fightBg.dispose()
    }
}