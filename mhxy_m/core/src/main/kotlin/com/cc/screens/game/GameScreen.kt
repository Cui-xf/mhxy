package com.cc.screens.game

import com.cc.MhxyGame
import com.cc.common.net.EnterFight
import com.cc.net.NetChannel
import com.cc.screens.AbstractScreen
import com.cc.screens.fight.FightScreen
import com.cc.screens.game.hud.GameHud
import com.cc.screens.game.world.FightStarter
import com.cc.screens.game.world.GameWorld
import com.cc.screens.game.world.Player

class GameScreen : AbstractScreen() {

    private val gameWorld = autoDispose { GameWorld(this.assetLoader) }

    private val gameHud = autoDispose { GameHud(this.assetLoader, gameWorld) }

    override fun init() {
        gameWorld.onEvent<FightStarter> {
            enterFight(it)
        }
        gameWorld.screenMap.collisionMove(Player.roleMapX, 0f, Player.roleMapY, 0f)
    }

    override fun update(delta: Float) {
        gameWorld.render(batch, sr, 0f, 0f, VIRTUAL_W, VIRTUAL_H, delta)
        gameHud.render(batch, sr, 0f, 0f, VIRTUAL_W, VIRTUAL_H, delta)
    }

    private fun enterFight(fightStarter: FightStarter) {
        NetChannel.send(EnterFight(fightStarter.id))
        MhxyGame.setScreen(FightScreen(fightStarter.mapSnapshot))
    }
}
