package com.cc.screens.fight2

import com.badlogic.gdx.graphics.Color
import com.badlogic.gdx.graphics.g2d.BitmapFont
import com.badlogic.gdx.graphics.g2d.GlyphLayout
import com.badlogic.gdx.graphics.g2d.SpriteBatch
import com.badlogic.gdx.graphics.g2d.TextureRegion
import com.badlogic.gdx.graphics.glutils.ShapeRenderer
import com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType
import com.cc.FontManager.SMALL_FONT
import com.cc.asset.AssetLoader
import com.cc.asset.AssetManagerFactory.PUBLIC_ASSET
import com.cc.render.*
import com.cc.screens.fight2.model.Back
import com.cc.screens.fight2.model.FightModel
import com.cc.screens.fight2.model.SKILLS
import com.cc.screens.fight2.model.WaitSelectSkill
import com.cc.ui.component.TabGroup
import com.cc.ui.component.UIComponent
import com.cc.ui.component.WindowPanel

class SkillList(assetLoader: AssetLoader, private val fightModel: FightModel) : UIComponent(assetLoader) {
    private val res = loadRes()

    private val skillTab = SkillTab(assetLoader, res)  // res: Map<Int, Lazy<TextureRegion>>
    private val window = WindowPanel(assetLoader, "人物技能", null) {
        // 标签名对应 GameSceneController.java:9669
        //   this.mainCanvasRef.topUi.a(new String[]{" 技能   ", "  心法  ", "  附魔  "});
        add(TabGroup(assetLoader, listOf("技能1", "技能2")) {
            add(skillTab)
            add(skillTab)
        })
    }

    init {
        window.onEvent<String> { if (it == "close") emit(Back) }
    }

    private val border = 10f

    override fun render(
        batch: SpriteBatch,
        sr: ShapeRenderer,
        cx: Float,
        cy: Float,
        cw: Float,
        ch: Float,
        delta: Float
    ) {
        if (fightModel.state != WaitSelectSkill) return
        window.render(batch, sr, cx + border, cy + border, cw - border * 2, ch - border * 2, delta)
    }

    // 预加载所有技能图标，对应：
    //   GameSceneController.java:16677-16684  getIconFrame0(short var0)
    //     → MainCanvas.icon.getSpriteByNameFromCache(String.valueOf(var0))
    //   GameSceneController.java:16686-16706  b(short[] var0) → Image[]
    // 图标 ID 对应 GlobalStatus.skillCD2[]，此处简化用技能 id 直接对应
    // 用 Lazy 委托注册加载但延迟取值，首次渲染时 assetManager 已完成加载（AbstractScreen.java:37-40）
    private fun loadRes(): Map<Int, Lazy<TextureRegion>> {
        return SKILLS.associate { skill ->
            skill.id to resource(PUBLIC_ASSET, "rpg/icon/${skill.id}.pic", TextureRegion::class)
        }
    }

    override fun dispose() {
        super.dispose()
        skillTab.dispose()
        window.dispose()
    }
}

/**
 * 技能列表 Tab 内容，对应 Java GunDongListUi.java 的列表绘制逻辑。
 *
 * 每行结构：[图标16px] [技能名称] ... [等级右对齐]
 *
 * - 行高：          GunDongListUi.java:75   this.i = GlobalConfig.font2_h
 * - 背景：          GunDongListUi.java:261  setColor(6014420); fillRect(a,b,c,d)
 * - 选中高亮：      GunDongListUi.java:276  setColor(9); fillRect(a+4, b+4+row*i, c-11, i)
 * - 图标：          GunDongListUi.java:286  drawImage(r[var6], a+4, b+4+row*i+(i-imgH)/2, LEFT_TOP)
 * - 图标边框：      GunDongListUi.java:289  setColor(16515586); drawRect(...)
 * - 技能名称：      GunDongListUi.java:317  color=选中白16777215/未选中2176196; drawString(a+6+A, b+4+row*i)
 * - 等级右对齐：    GunDongListUi.java:336  drawString(u[var6], a+c-16, b+4+row*i, RIGHT_TOP)
 * - 等级格式化：    GameSceneController.java:16723  var0[i] + "级"
 * - 滚动条轨道/滑块：GunDongListUi.java:366  j = g*(d-16)/h; LoadingPage.draw(a+c-2-up.w, b+3, d-5, j, e, h, g-z)
 */
class SkillTab(
    assetLoader: AssetLoader,
    private val res: Map<Int, Lazy<TextureRegion>>,
) : UIComponent(assetLoader) {

    private val font: BitmapFont = SMALL_FONT
    private val glyphLayout = GlyphLayout()

    // 行高：GunDongListUi.java:75  this.i = GlobalConfig.font2_h（约14px）
    private val rowHeight: Float get() = font.capHeight + 6f

    // 图标固定尺寸 16×16，GunDongListUi.java:287  this.A = r[var6].getWidth()
    private val iconSize = 16f

    // 选中行（从 0）：GunDongListUi.java:16  private int f
    var selectedIndex = 0
        private set

    // 可见窗口起始行：GunDongListUi.java:15  private int e
    private var scrollOffset = 0

    // 背景色：GunDongListUi.java:261  setColor(6014420)
    private val bgColor = 6014420.toColor()

    // 选中高亮色：GunDongListUi.java:277  setColor(9) → LoadingPage.colors[9] = 0x4521FF
    // 原版效果近似深蓝 #004F8C
    private val selectedBgColor = Color.valueOf("#004F8C")

    // 普通文字色：GunDongListUi.java:317  2176196 = 0x213444 → 实际显示亮蓝
    private val normalTextColor = 2176196.toColor()

    // 图标边框色：GunDongListUi.java:290  16515586 = 0xFC1002（红色外框）
    private val iconBorderColor = 16515586.toColor()

    // 记录最近一帧的可见行数，供 scrollUp/scrollDown 使用
    private var lastVisibleRows = 7

    override fun render(
        batch: SpriteBatch,
        sr: ShapeRenderer,
        cx: Float,
        cy: Float,
        cw: Float,
        ch: Float,
        delta: Float
    ) {
        val skills = SKILLS
        val totalRows = skills.size

        // 可见行数：GunDongListUi.java:260  g = min(h+z, (d-8)/i)
        val visibleRows = ((ch - 8f) / rowHeight).toInt().coerceAtMost(totalRows)
        lastVisibleRows = visibleRows

        // ── 1. 背景 ────────────────────────────────────────────────────────
        // GunDongListUi.java:261-264
        //   setColor(6014420); fillRect(a, b, c, d)
        sr.begin(ShapeType.Filled)
        sr.drawRect(bgColor, cx, cy, cw, ch, Align.LEFT_TOP)
        sr.end()

        // ── 2. 逐行绘制 ────────────────────────────────────────────────────
        // GunDongListUi.java:274  for (var6 = e-z; var5 < g && var6 < h; ++var6)
        for (rowInView in 0 until visibleRows) {
            val dataIdx = scrollOffset + rowInView
            if (dataIdx >= totalRows) break
            val skill = skills[dataIdx]

            val rowY = cy + rowInView * rowHeight

            // 选中高亮：GunDongListUi.java:276-279
            //   if (f == var6+z) { setColor(9); fillRect(a+4, b+4+var5*i, c-11, i) }
            if (dataIdx == selectedIndex) {
                sr.begin(ShapeType.Filled)
                sr.drawRect(selectedBgColor, cx + 4f, rowY + 4f, cw - 11f, rowHeight, Align.LEFT_TOP)
                sr.end()
            }

            // 图标：GunDongListUi.java:286-293
            //   drawImage(r[var6], a+4, b+4+var5*i + (i-imgH)/2, LEFT_TOP=20)
            //   drawRect(a+4, b+4+var5*i+..., imgW, imgH) 边框色 16515586
            val icon = res[skill.id]?.value
            val iconX = cx + 4f
            val iconY = rowY + 4f + (rowHeight - iconSize) / 2f
            if (icon != null) {
                batch.begin()
                batch.drawImage(icon, iconX, iconY, iconSize, iconSize, Align.LEFT_TOP)
                batch.end()
                sr.begin(ShapeType.Filled)
                sr.drawRectBorder(iconBorderColor, iconX, iconY, iconSize, iconSize, Align.LEFT_TOP)
                sr.end()
            }

            // 技能名称：GunDongListUi.java:312-319
            //   color = 选中16777215(白), 未选中2176196
            //   drawString(s[var6], a+6+A, b+4+var5*i, LEFT_TOP=20)
            val nameColor = if (dataIdx == selectedIndex) Color.WHITE else normalTextColor
            val nameX = cx + 6f + iconSize           // a+6+A
            val textY = rowY + 4f
            batch.begin()
            batch.drawString(font, skill.name, nameColor, nameX, textY, Align.LEFT_TOP)
            batch.end()

            // 等级右对齐：GunDongListUi.java:334-336
            //   drawString(u[var6], a+c-16, b+4+var5*i, RIGHT_TOP=24)
            // 等级格式化：GameSceneController.java:16723  var0[i] + "级"
            // 战斗技能列表原版显示技能等级，此处用固定"1级"占位（等服务器数据下发后替换）
            val levelText = "1级"
            val levelColor = if (dataIdx == selectedIndex) Color.WHITE else normalTextColor
            glyphLayout.setText(font, levelText)
            // a+c-16 对应右侧 anchor RIGHT_TOP，在 libGDX 里手动算 x
            val levelX = cx + cw - 16f - glyphLayout.width
            batch.begin()
            batch.drawString(font, levelText, levelColor, levelX, textY, Align.LEFT_TOP)
            batch.end()
        }

        // ── 3. 滚动条 ──────────────────────────────────────────────────────
        // GunDongListUi.java:362-374
        //   j = g*(d-16)/h > 6 ? g*(d-16)/h : 6    （滑块高度）
        //   LoadingPage.draw(a+c-2-up.w, b+3, d-5, j, e, h, g)
        //   原版 up.w ≈ 6（上下箭头图宽）
        if (visibleRows in 1 until totalRows) {
            val trackH = ch - 8f   // d-5 ≈ ch-8
            // GunDongListUi.java:367  j = g*(d-16)/h，最小6
            val thumbH = (visibleRows * (ch - 16f) / totalRows).coerceAtLeast(6f)
            val thumbY = cy + 4f + scrollOffset.toFloat() / (totalRows - visibleRows) * (trackH - thumbH)
            val barX = cx + cw - 8f  // a+c-2-up.w

            sr.begin(ShapeType.Filled)
            sr.drawRect(Color.valueOf("#003F6E"), barX, cy + 4f, 6f, trackH, Align.LEFT_TOP)
            sr.drawRect(Color.valueOf("#4ABCDB"), barX, thumbY, 6f, thumbH, Align.LEFT_TOP)
            sr.end()
        }
    }

    // ── 按键滚动 ─────────────────────────────────────────────────────────────
    // GunDongListUi.java:193-218  onClick(int)

    /** 光标上移：GunDongListUi.java:204-213 */
    fun scrollUp() {
        val total = SKILLS.size
        selectedIndex = if (selectedIndex <= 0) total - 1 else selectedIndex - 1
        if (scrollOffset > 0 && scrollOffset > selectedIndex) scrollOffset--
        if (selectedIndex == total - 1) scrollOffset = (total - lastVisibleRows).coerceAtLeast(0)
    }

    /** 光标下移：GunDongListUi.java:196-202 */
    fun scrollDown() {
        val total = SKILLS.size
        selectedIndex = if (selectedIndex >= total - 1) 0 else selectedIndex + 1
        if (selectedIndex - scrollOffset + 1 > lastVisibleRows) scrollOffset++
        if (selectedIndex == 0) scrollOffset = 0
    }
}
