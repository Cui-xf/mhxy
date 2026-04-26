package com.cc.screens.game.hud

import com.badlogic.gdx.graphics.g2d.SpriteBatch
import com.badlogic.gdx.graphics.glutils.ShapeRenderer
import com.cc.asset.AssetLoader
import com.cc.screens.game.world.GameWorld
import com.cc.screens.game.world.Player
import com.cc.ui.component.UIComponent

class GameHud(assetLoader: AssetLoader, gameWorld: GameWorld) : UIComponent(assetLoader) {
    private val miniMap = MiniMap(assetLoader, gameWorld.screenMap, Player, gameWorld.npc)
    private val playerStatus = PlayerStatus

    private val sideMenu = SideMenu(assetLoader)
        .onEvent<SideMenu.MenuClick> { click -> handleSideMenuClick(click) }

    private val menuPopup = MenuPopup(assetLoader)
    private val itemList = GameItemList(assetLoader)

    init {
        menuPopup.onEvent<MenuPopup.MenuItemClick> { click -> handleMenuItemClick(click) }
    }

    override fun render(
        batch: SpriteBatch,
        sr: ShapeRenderer,
        cx: Float, cy: Float, cw: Float, ch: Float, delta: Float
    ) {
        miniMap.render(batch, sr, cx, cy, cw, ch, delta)
        playerStatus.render(batch, sr, cx, cy, cw, ch, delta)
        sideMenu.render(batch, sr, cx, cy, cw, ch, delta)
        menuPopup.render(batch, sr, cx, cy, cw, ch, delta)

        itemList.render(batch, sr, cx, cy, cw, ch, delta)
    }

    private fun handleSideMenuClick(click: SideMenu.MenuClick) {
        when (click.id) {
            "menu" -> menuPopup.toggle()
            "bag" -> itemList.toggle()
            "map" -> miniMap.toggle()
        }
    }

    private fun handleMenuItemClick(click: MenuPopup.MenuItemClick) {
//        menuPopup.hide()
        when (click.id) {
            "item" -> {
                itemList.show()
            }
        }
    }
}
