package com.cc.screens.fight

import com.badlogic.gdx.Gdx
import com.badlogic.gdx.graphics.Color
import com.badlogic.gdx.graphics.GL20
import com.badlogic.gdx.graphics.Texture
import com.badlogic.gdx.graphics.g2d.TextureRegion
import com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType
import com.cc.FontManager
import com.cc.MhxyGame
import com.cc.asset.AssetManagerFactory.PUBLIC_ASSET
import com.cc.asset.RpgAnimation
import com.cc.asset.loadPic
import com.cc.asset.toTextureRegion
import com.cc.event.TouchContext
import com.cc.render.*
import com.cc.screens.AbstractScreen
import com.cc.screens.game.Player

/**
 * 战斗场景 - 参照原Java版 FightModel + GameSceneController(currentSceneModeId==1/25) 实现
 *
 * 坐标系：左上角 (0,0)，x 向右，y 向下，虚拟分辨率 240×320
 *
 * 布局（对应截图）：
 *  - 背景：fightBG.png (175×128) 居中铺屏
 *  - 敌方：ZhanDouZuoBiao1 + offset 计算的6个位置（实际取1个敌人演示）
 *  - 我方：ZhanDouZuoBiao2[0] 位置（底部中央，脚下蓝色光圈）
 *  - 左侧：5个行动按钮（攻击/防御/技能/道具/逃跑），y 从 defaultHigh-102=218 开始，每格16px
 *  - 底部中央：当前选中行动的名称（黄色文字）
 *  - 右上角：伤害类型文字（物理/冰/火/雷）
 *  - 底部：技能快捷栏（10格 17×17，深色背景条）
 *  - 右下角：返回按钮
 */
class FightScreen(
    private val monsterId: Int = 1,
    player: Player,
    private val backGround: TextureRegion
) : AbstractScreen() {
    private val fightBgTexture = autoDispose { Texture(Gdx.files.classpath("assets/fightBG.png")) }

    private val playerAnim by resource(PUBLIC_ASSET, "rpg/role/241_1836956646.anim", RpgAnimation::class)
    private val enemyAnim by resource(PUBLIC_ASSET, "rpg/petfight/211_48761813.anim", RpgAnimation::class)
    private val rim by resource(PUBLIC_ASSET, "rpg/publicUI/rim.pic", TextureRegion::class)
    //技能栏底图
    private val goods by resource(PUBLIC_ASSET, "rpg/publicUI/goods.pic", TextureRegion::class)
    //数字
    private val num by resource(PUBLIC_ASSET, "rpg/publicUI/num.pic", TextureRegion::class)
    //icon
    private val slotIcon by resource(PUBLIC_ASSET, "rpg/icon/0_47714320.pic", TextureRegion::class)
    //聊天和自动
    private val fighticon by resource(PUBLIC_ASSET, "rpg/ui/fighticon.pic", TextureRegion::class)


    // ── 行动菜单按钮精灵（publicUI/49_983005409.pic，含6个region：0=全条，1-5=单按钮）──
    //   每个按钮 26×16，index 1=攻击 2=防御 3=技能 4=道具 5=逃跑
    private val fightMenuPic by resource(PUBLIC_ASSET, "rpg/publicUI/49_983005409.pic", TextureRegion::class)

    // ── 返回按钮（button_back.pic 37×20）────────────
    private val buttonBack by resource(PUBLIC_ASSET, "rpg/publicUI/button_back.pic", TextureRegion::class)

    // ── 战斗状态 ──────────────────────────────────────────────────
    /** 当前选中行动：0=攻击 1=防御 2=技能 3=道具 4=逃跑 */
    private var selectedAction = 0
    private val actionNames = arrayOf("攻击", "防御", "技能", "道具", "逃跑")
    private val damageTypes = arrayOf("物理", "冰", "火", "雷")
    private var selectedDamageType = 0

    /** 动画计时器 */
    private var animTime = 0f

    // 行动按钮区域（左侧5个，x=1，y 从 218 开始，每格16px高，宽26px）
    // 与Java: MainCanvas.pngUtil.a(var1, Z, null, var2+1, 0, 0, 1, defaultHigh-102+(var2<<4), 0, 0)
    private val ACTION_BTN_X = 0f
    private val ACTION_BTN_Y0 = 320f - 102f   // = 218f
    private val ACTION_BTN_H = 16f
    private val ACTION_BTN_W = 26f

    // 技能栏：y=defaultHigh-22=298，每格17×17，共10格，x从3开始
    private val SKILL_BAR_Y = 320f - 22f     // = 298f
    private val SKILL_SLOT_W = 17f
    private val SKILL_SLOT_H = 17f
    private val SKILL_BAR_SLOTS = 10

    // 返回按钮触摸区域（button_back.pic 37×20，右下角对齐）
    private val BACK_BTN_W = 37f
    private val BACK_BTN_H = 20f
    private val BACK_BTN_X = VIRTUAL_W - BACK_BTN_W
    private val BACK_BTN_Y = VIRTUAL_H - BACK_BTN_H

    // ── 演示用血量数据 ─────────────────────────────────────────────
    private val playerHp = 80f
    private val playerMaxHp = 100
    private val playerMp = 60f
    private val playerMaxMp = 100
    private val enemyHp = 70f
    private val enemyMaxHp = 100

    override fun update(delta: Float) {
        animTime += delta
        renderBattle(delta)
        handleInput()
    }

    // ── 输入处理 ──────────────────────────────────────────────────
    private fun handleInput() {
        if (!TouchContext.justTouched) return
        val tx = TouchContext.touchX
        val ty = TouchContext.touchY

        // 返回按钮
        if (tx >= BACK_BTN_X && tx <= BACK_BTN_X + BACK_BTN_W &&
            ty >= BACK_BTN_Y && ty <= BACK_BTN_Y + BACK_BTN_H
        ) {
            MhxyGame.setScreen(com.cc.screens.game.GameScreen())
            return
        }

        // 行动按钮（左侧5个）
        for (i in 0 until 5) {
            val btnY = ACTION_BTN_Y0 + i * ACTION_BTN_H
            if (tx >= ACTION_BTN_X && tx <= ACTION_BTN_X + ACTION_BTN_W &&
                ty >= btnY && ty <= btnY + ACTION_BTN_H
            ) {
                selectedAction = i
                return
            }
        }
    }

    // ── 渲染 ──────────────────────────────────────────────────────
    private fun renderBattle(delta: Float) {
        drawBackground()
        drawRole()
        drawActionButtons()
        drawActionLabel()
        drawDamageTypeLabel()
        drawSkillBar()
        drawReturnButton()
    }

    private fun drawBackground() {
        batch.begin()
        batch.drawImage(backGround, 0f, 0f, align = Align.LEFT_TOP)
        batch.drawImage(
            fightBgTexture,
            VIRTUAL_W / 2,
            (VIRTUAL_H - fightBgTexture.height) / 2,
            align = Align.CENTER_TOP
        )
        batch.end()

        Gdx.gl.glEnable(GL20.GL_BLEND)
        Gdx.gl.glBlendFunc(GL20.GL_SRC_ALPHA, GL20.GL_ONE_MINUS_SRC_ALPHA)
        sr.begin(ShapeType.Filled)
        sr.color = Color(0f, 0f, 0f, 0.6f)
        sr.rect(0f, 0f, VIRTUAL_W, VIRTUAL_H)
        sr.end()
        Gdx.gl.glDisable(GL20.GL_BLEND)
    }

    private fun drawRole() {
        //角色动画
        roleAnim()
        // 玩家选中光圈（蓝色椭圆）
        selectAperture()
        drawHp()
    }

    private fun drawHp() {
        val offY = -42
        sr.begin(ShapeType.Filled)
        for (i in 0 until 6) {
            val (eBarX, eBarY) = getPos(i, "enemy")
            drawBar(eBarX, eBarY + offY, enemyHp / enemyMaxHp, 16711680.toColor(), 10945027.toColor())

            val (pBarX, pBarY) = getPos(i, "player")
            drawBar(pBarX, pBarY + offY - 5, playerHp / playerMaxHp, 16711680.toColor(), 10945027.toColor())
            drawBar(pBarX, pBarY + offY, playerMp / playerMaxMp, 48127.toColor(), 230064.toColor())
        }
        sr.end()

        // rim 边框装饰
        batch.begin()
        for (i in 0 until 6) {
            val (eBarX, eBarY) = getPos(i, "enemy")
            batch.drawImage(rim, eBarX, eBarY + offY)

            val (pBarX, pBarY) = getPos(i, "player")
            batch.drawImage(rim, pBarX, pBarY + offY - 5)
            batch.drawImage(rim, pBarX, pBarY + offY)
        }
        batch.end()
    }

    private fun selectAperture() {
        sr.begin(ShapeType.Line)
        sr.color = Color.valueOf("4fc3f7ff")
        val (x, y) = getPos(4, "player")
        val w = 24f
        val h = 10f
        val cx = x - w / 2
        val cy = VIRTUAL_H - (y + h / 2)
        sr.ellipse(cx, cy, w, h)
        sr.end()
    }

    private fun roleAnim() {
        batch.begin()
        for (i in 0 until 6) {
            // 绘制一个敌方单位（位置 Q[0]）
            val ePos = getPos(i, "enemy")
            val eFrames = enemyAnim.getKeyFrame(animTime, true)
            batch.drawAnimation(eFrames, ePos.first, ePos.second)

            // 绘制玩家（位置 R[0]，脚下蓝色圈）
            val pPos = getPos(i, "player")
            val pFrames = playerAnim.getKeyFrame(animTime, true)
            batch.drawAnimation(pFrames, pPos.first, pPos.second)
        }
        batch.end()
    }

    private fun getPos(index: Int, type: String): Pair<Float, Float> {
        val dx = 38
        val dy = 24
        val (centerX, centerY) = if (type == "player") Pair(160f, 250f) else Pair(100f, 100f)
        return when (index) {
            0 -> Pair(centerX - dx * 2, centerY)
            1 -> Pair(centerX - dx * 1, centerY - dy * 1)
            2 -> Pair(centerX, centerY - dy * 2)
            3 -> Pair(centerX - dx * 1, centerY + dy * 1)
            4 -> Pair(centerX, centerY)
            5 -> Pair(centerX + dx * 1, centerY - dy * 1)
            else -> throw RuntimeException("无效的坐标")
        }
    }

    private fun drawBar(x: Float, y: Float, value: Float, color1: Color, color2: Color) {
        val w = 20f
        val fill = value * 19
        sr.drawRect(16777215.toColor(), x - w / 2 + 1f, y + 1f, w, 2f, Align.LEFT_TOP)
        sr.drawRect(color1, x - w / 2 + 1f, y + 1f, fill, 2f, Align.LEFT_TOP)
        sr.drawRect(color2, x - w / 2 + 1f, y + 2f, fill, 1f, Align.LEFT_TOP)
    }

    private fun drawActionButtons() {
        // 先画按钮图片（fightMenuPic 的 region 1-5），region index = i+1
        val fightMenuTex = fightMenuPic.texture
        // fightMenuPic 本身是 region[0]（全条），我们需要手动切出各按钮 region
        // region 布局：总宽130px，5个按钮每个26px，高16px
        val buttonH = 16f
        val buttonW = 26f

        batch.begin()
        for (i in 0 until 5) {
            val btnY = ACTION_BTN_Y0 + i * ACTION_BTN_H
            // 从全条纹理里切出第 i 个按钮（x = i*26, y=0, w=26, h=16）
            val srcX = fightMenuPic.regionX + i * 26
            val srcY = fightMenuPic.regionY
            val region = TextureRegion(fightMenuTex, srcX, srcY, 26, 16)
            batch.drawImage(region, ACTION_BTN_X, btnY, align = Align.LEFT_TOP)
        }
        batch.end()

        // 高亮当前选中按钮（红色边框）
        sr.begin(ShapeType.Filled)
        val selY = ACTION_BTN_Y0 + selectedAction * ACTION_BTN_H
        sr.drawRectBorder(Color.RED, ACTION_BTN_X, selY, buttonW, buttonH, Align.LEFT_TOP)
        sr.end()
    }

    private fun drawActionLabel() {
        val font = FontManager.SMALL_FONT
        val text = actionNames[selectedAction]
        val textY = VIRTUAL_H - 22f - font.lineHeight
        batch.begin()
        batch.wordArtString(font, text, Color.BLACK, Color.YELLOW, VIRTUAL_W / 2f, textY, Align.CENTER_TOP)
        batch.end()
    }

    private fun drawDamageTypeLabel() {
        val font = FontManager.SMALL_FONT
        val text = damageTypes[selectedDamageType]
        batch.begin()
        batch.wordArtString(font, text, Color.BLACK, Color.YELLOW, VIRTUAL_W - 25f, 5f, Align.CENTER_TOP)
        batch.end()
    }

    /** 层7：底部技能快捷栏（参照 FightModel.d() + GameSceneController.a(Graphics,int,int,int,int,int,int)） */
    private fun drawSkillBar() {
        // 参照 GameSceneController.a(Graphics,int,int,int,int,int,int)
        // var6 = SKILL_BAR_SLOTS, var2=0, var3=SKILL_BAR_Y
        val barX = 0f
        val barY = SKILL_BAR_Y
        val totalW = SKILL_BAR_SLOTS * 17f + 4f
        val totalH = 21f

        // 每个格子画 goods 底图，前两格画 icon，0-7格左上角画数字编号（1-8）
        // 参照 FightModel.d(Graphics): pngUtil.a(var1, MainCanvas.num, null, var2+1, 0,0, 3+ej[var2]*17, defaultHigh-19, 0,0)
        batch.begin()
        for (i in 0 until SKILL_BAR_SLOTS) {
            val slotX = barX + 2f + i * 17f
            batch.drawImage(goods, slotX, barY + 2f, align = Align.LEFT_TOP)
            if (i < 2) {
                batch.drawImage(slotIcon, slotX + 1f, barY + 3f, align = Align.LEFT_TOP)
            }
            if (i < 8) {
                // num.pic 帧 index = i+1（数字1-8），每帧 3×5，x = (i+1)*3
                val numRegion = TextureRegion(num.texture, (i + 1) * 3, 0, 3, 5)
                batch.drawImage(numRegion, slotX, barY + 3f, align = Align.LEFT_TOP)
            } else {
                // 第9格(i=8)：fighticon 帧0（左半16px=聊天），第10格(i=9)：帧2（右半16px=自动）
                val iconX = if (i == 8) 0 else 16
                val fighticonRegion =
                    TextureRegion(fighticon.texture, fighticon.regionX + iconX, fighticon.regionY, 16, 16)
                batch.drawImage(fighticonRegion, slotX + 1f, barY + 3f, align = Align.LEFT_TOP)
            }
        }
        batch.end()

        sr.begin(ShapeType.Filled)
        sr.drawRectBorder(15975.toColor(), barX, barY, totalW, totalH, Align.LEFT_TOP)           // 外边框
        sr.drawRectBorder(11267556.toColor(), barX + 1f, barY + 1f, totalW - 2f, totalH - 2f, Align.LEFT_TOP) // 内边框
        sr.end()
    }

    /** 层8：右下角"返回"按钮，参照 FightModel.a(PngUtil,Graphics):1497
     *  drawImage(button_back.image, defaultWidth-button_back.w, defaultHigh-button_back.h) */
    private fun drawReturnButton() {
        batch.begin()
        batch.drawImage(buttonBack, BACK_BTN_X, BACK_BTN_Y, align = Align.LEFT_TOP)
        batch.end()
    }

    override fun dispose() {
        super.dispose()
        backGround.texture.dispose()
    }
}
