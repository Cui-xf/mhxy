package com.cc.screens

import com.badlogic.gdx.Gdx
import com.badlogic.gdx.Input
import com.badlogic.gdx.graphics.Color
import com.badlogic.gdx.graphics.Texture
import com.badlogic.gdx.math.Rectangle
import com.cc.FontManager.SMALL_FONT
import com.cc.MhxyGame
import com.cc.event.TouchContext
import com.cc.render.drawImage
import com.cc.render.wordArtString
import com.cc.screens.AbstractScreen.Companion.VIRTUAL_W
import com.cc.screens.base.BaseBackGround

class TitleScreen : AbstractScreen() {
    private val backGround = BaseBackGround
    private val menuItem by resource("menuItem.png", Texture::class)
    private val menuButtons = listOf(
        MenuButton("登录游戏", 0),
        MenuButton("注册游戏", 1),
        MenuButton("修改密码", 2),
    )
    private var selectedIndex = 0

    override fun update(delta: Float) {
        handleInput()
        backGround.render(batch, sr, 0f, 0f, VIRTUAL_W, VIRTUAL_H, delta)
        batch.begin()
        menuButtons.forEachIndexed { index, button ->
            drawButton(button, index == selectedIndex)
        }
        batch.end()
    }

    private fun drawButton(button: MenuButton, selected: Boolean) {
        if (selected) {
            batch.drawImage(menuItem, button.topX, button.topY)
        }
        val textX = button.topX
        val textY = button.topY + (menuItem.height - SMALL_FONT.capHeight) / 2
        batch.wordArtString(SMALL_FONT, button.text, Color.valueOf("#052035"), Color.WHITE, textX, textY)
    }

    private fun handleInput() {
        // 键盘上下移动
        if (Gdx.input.isKeyJustPressed(Input.Keys.UP)) {
            selectedIndex = (selectedIndex - 1 + menuButtons.size) % menuButtons.size
        }
        if (Gdx.input.isKeyJustPressed(Input.Keys.DOWN)) {
            selectedIndex = (selectedIndex + 1) % menuButtons.size
        }
        // 键盘 Enter 确认
        if (Gdx.input.isKeyJustPressed(Input.Keys.ENTER)) {
            enterScreen(selectedIndex)
        }
        // 触屏点击

        menuButtons.forEachIndexed { index, button ->
            if (TouchContext.inTouch(button.rect)) {
                if (selectedIndex == index) {
                    enterScreen(selectedIndex)
                } else {
                    selectedIndex = index
                }
            }
        }
    }

    private fun enterScreen(index: Int) {
        when (index) {
            0 -> MhxyGame.setScreen(RoleSelectScreen())
        }
    }
}

private class MenuButton(val text: String, index: Int) {
    val rect: Rectangle
    val topX: Float = VIRTUAL_W / 2
    val topY: Float = menuStartY + index * menuItemH

    init {
        rect = Rectangle(topX - menuItemW / 2, topY, menuItemW, menuItemH)
    }

    companion object {
        // mainPageTop_Y = (320 - logoTitle.h(64) - menuItem.h(24)*7) / 3 = 29
        // 菜单区起始 Y = mainPageTop_Y*2 + logoTitle.h = 122
        private const val menuStartY = 122f
        private const val menuItemH = 24f
        private const val menuItemW = 32f
    }
}
