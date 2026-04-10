package com.cc.screens

import com.badlogic.gdx.Gdx
import com.badlogic.gdx.Input
import com.badlogic.gdx.graphics.Color
import com.badlogic.gdx.graphics.Texture
import com.badlogic.gdx.math.Rectangle
import com.cc.FontManager.SMALL_FONT
import com.cc.MhxyGame
import com.cc.render.drawImage
import com.cc.render.drawString
import com.cc.screens.AbstractScreen.Companion.VIRTUAL_H
import com.cc.screens.AbstractScreen.Companion.VIRTUAL_W
import com.cc.screens.base.BaseBackGround

class TitleScreen : AbstractScreen() {
    private val backGround = BaseBackGround
    private val menuItem = autoDispose { Texture(Gdx.files.classpath("assets/menuItem.png")) }
    private val menuButtons = listOf(
        MenuButton("登陆游戏", 0),
        MenuButton("注册游戏", 1),
        MenuButton("修改密码", 2),
    )
    private var selectedIndex = 0

    override fun update(delta: Float) {
        handleInput()
        backGround.update(delta)
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
        batch.drawString(SMALL_FONT, button.text, Color.valueOf("#052035"), textX - 1, textY - 1)
        batch.drawString(SMALL_FONT, button.text, Color.valueOf("#052035"), textX, textY - 1)
        batch.drawString(SMALL_FONT, button.text, Color.valueOf("#052035"), textX - 1, textY)
        batch.drawString(SMALL_FONT, button.text, Color.valueOf("#052035"), textX + 1, textY)
        batch.drawString(SMALL_FONT, button.text, Color.valueOf("#052035"), textX, textY + 1)
        batch.drawString(SMALL_FONT, button.text, Color.valueOf("#052035"), textX + 1, textY + 1)
        batch.drawString(SMALL_FONT, button.text, Color.WHITE, textX, textY)
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
        if (Gdx.input.justTouched()) {
            menuButtons.forEachIndexed { index, button ->
                if (button.rect.contains(touchX, touchY)) {
                    selectedIndex = index
                    enterScreen(selectedIndex)
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
        rect = Rectangle(topX - menuItemW / 2, VIRTUAL_H - topY - menuItemH, menuItemW, menuItemH)
    }

    companion object {
        // mainPageTop_Y = (320 - logoTitle.h(64) - menuItem.h(24)*7) / 3 = 29
        // 菜单区起始 Y = mainPageTop_Y*2 + logoTitle.h = 122
        private const val menuStartY = 122f
        private const val menuItemH = 24f
        private const val menuItemW = 32f
    }
}
