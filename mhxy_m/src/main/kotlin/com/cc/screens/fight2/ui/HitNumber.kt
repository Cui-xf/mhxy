package com.cc.screens.fight2.ui

import com.badlogic.gdx.graphics.g2d.SpriteBatch
import com.badlogic.gdx.graphics.g2d.TextureRegion
import com.badlogic.gdx.graphics.glutils.ShapeRenderer
import com.cc.asset.AssetLoader
import com.cc.asset.AssetManagerFactory.PUBLIC_ASSET
import com.cc.screens.fight2.model.Animating
import com.cc.screens.fight2.model.Field
import com.cc.screens.fight2.model.FightModel
import com.cc.screens.fight2.model.Result
import com.cc.ui.component.UIComponent

/**
 * 战斗命中数字显示组件
 *
 * fightnum.pic 图像布局（86x20）：
 *   行0（y=0,  h=10）：蓝色数字（MP 变化）
 *   行1（y=10, h=10）：白色数字（HP 变化）
 *   x=0,  w=8：负号 '-'
 *   x=8,  w=8：正号 '+'（或无符号占位）
 *   x=16+digit*7, w=7：数字 0-9
 */
class HitNumber(
    assetLoader: AssetLoader,
    private val fightModel: FightModel,
) : UIComponent(assetLoader) {

    // 加载整张 fightnum 图（86x20），后续手动切子区域
    private val fightnumRegion by resource(PUBLIC_ASSET, "rpg/ui/fightnum.pic", TextureRegion::class)

    // 最大向上漂移像素（对应 Java 版 f 最大 24）
    private val MAX_DRIFT = 24f
    // 漂移速度：60px/s，与 Java 版每帧+4（15fps）等效
    private val DRIFT_SPEED = 60f

    override fun render(
        batch: SpriteBatch,
        sr: ShapeRenderer,
        cx: Float,
        cy: Float,
        cw: Float,
        ch: Float,
        delta: Float,
    ) {
        val driver = (fightModel.state as? Animating ?: return).driver
        val (targets, results) = driver.hitRequest ?: return
        val drift = (driver.phaseTimer * DRIFT_SPEED).coerceAtMost(MAX_DRIFT)

        val tex = fightnumRegion.texture
        val baseRegionX = fightnumRegion.regionX
        val baseRegionY = fightnumRegion.regionY
        batch.begin()
        targets.forEachIndexed { i, role ->
            val result = results.getOrNull(i) ?: return@forEachIndexed
            drawNumber(batch, tex, baseRegionX, baseRegionY, result, role.posX, role.posY, drift)
        }
        batch.end()
    }

    /**
     * 在目标头部绘制数字，向上漂移 drift 像素
     * x/y 为角色锚点（左上原点坐标系）
     */
    private fun drawNumber(
        batch: SpriteBatch,
        tex: com.badlogic.gdx.graphics.Texture,
        baseRegionX: Int,
        baseRegionY: Int,
        result: Result,
        x: Float,
        y: Float,
        drift: Float,
    ) {
        val value = result.value.toInt()
        val absValue = if (value < 0) -value else value
        // HP变化用白色行（y=10），MP变化用蓝色行（y=0）
        val rowY = baseRegionY + if (result.field == Field.HP) 10 else 0

        // 计算数字位数（至少1位）
        var digitCount = 0
        var tmp = absValue
        do { tmp /= 10; digitCount++ } while (tmp > 0)

        // 居中偏移：与 Java 版一致 (digitCount+2)/2*7，即 (var9+2)/2*7
        val centerOffset = (digitCount + 2) / 2 * 7

        // 目标头顶上方作为起始 y，向上漂移
        val baseY = y - 50 - drift

        // 绘制符号位（x=0 负号，x=8 正号/空）
        val signSrcX = baseRegionX + if (value < 0) 0 else 8
        batch.draw(tex, x - centerOffset, toLibGdxY(baseY, 10f), 8f, 10f, signSrcX, rowY, 8, 10, false, false)

        // 从高位到低位绘制各数字
        var remaining = absValue
        for (i in digitCount - 1 downTo 0) {
            val pow = pow10(i)
            val digit = remaining / pow
            remaining %= pow
            val srcX = baseRegionX + 16 + digit * 7
            val digitDrawX = x - centerOffset + 8 + (digitCount - 1 - i) * 7
            batch.draw(tex, digitDrawX, toLibGdxY(baseY, 10f), 7f, 10f, srcX, rowY, 7, 10, false, false)
        }
    }

    private fun toLibGdxY(y: Float, h: Float): Float {
        return com.cc.screens.AbstractScreen.VIRTUAL_H - y - h
    }

    private fun pow10(n: Int): Int {
        var r = 1
        repeat(n) { r *= 10 }
        return r
    }
}
