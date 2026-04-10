package com.cc.screens

import com.badlogic.gdx.graphics.Color
import com.badlogic.gdx.graphics.glutils.ShapeRenderer
import com.cc.FontManager.SMALL_FONT
import com.cc.render.Align
import com.cc.render.drawRect
import com.cc.render.drawString
import com.cc.screens.base.BaseBackGround

class RoleSelectScreen : AbstractScreen() {
    private val backGround = BaseBackGround
    private val shapeRenderer = createShapeRenderer()
//    private val titleImage = ;

    // 窗口全屏：X=0, Y=0, W=240, H=320
    private val winW = VIRTUAL_W * 0.95f
    private val winH = VIRTUAL_H * 0.95f
    private val winX = (VIRTUAL_W - winW) / 2
    private val winY = (VIRTUAL_H - winH) / 2

    // 每个角色格子的宽高（对应原始 bB=55）
    private val cellSize = 55f

    // 格子内容区：从窗口 Y+32 开始，高度 = bB*2+6 = 116
    private val cellAreaX = winX + 5f
    private val cellAreaY = winY + 32f
    private val cellAreaW = winW - 11f
    private val cellAreaH = cellSize * 2 + 6f   // 116

    // 格子间距
    // colSpacing = (W - bB*2 - 16) / 3 = (240 - 110 - 16) / 3 = 38
    // rowSpacing = (cellAreaH - bB*2 - 6) / 3 = 0
    private val colSpacing = (winW - cellSize * 2 - 16f) / 3f
    private val rowSpacing = (cellAreaH - cellSize * 2 - 6f) / 3f

    // 模拟角色数据（实际应来自 GlobalStatus）
    private val roleNames = arrayOf("剑客甲", "道士乙", null, null)

    private var selectRow = 0
    private var selectCol = 0


    // 标题栏高度约 16px（对应原始 title.h）
    private val titleH = 16f

    override fun update(delta: Float) {
        backGround.update(delta)

        shapeRenderer.begin(ShapeRenderer.ShapeType.Filled)
        drawWindow()
        drawCellArea()
        drawCells()
        shapeRenderer.end()

        batch.begin()
        drawWindowTitle()
        drawNicknames()
        batch.end()
    }

    /** 绘制窗口外框（多层边框，对应 MixedUi.draw 的边框逻辑） */
    private fun drawWindow() {
        // 深色背景
//        shapeRenderer.drawRect(Color.valueOf("#2A6E81"), winX, winY, winW, winH, Align.LEFT)
        // 外边框（近似原始多层 drawRect）
        shapeRenderer.color = Color.valueOf("#006600")
        shapeRenderer.rect(winX, VIRTUAL_H - winY - winH, winW - 1, winH - 1)
        shapeRenderer.color = Color.valueOf("#008800")
        shapeRenderer.rect(winX + 1f, VIRTUAL_H - winY - winH + 1f, winW - 3f, winH - 3f)
        shapeRenderer.color = Color.valueOf("#004400")
        shapeRenderer.rect(winX + 2f, VIRTUAL_H - winY - winH + 2f, winW - 5f, winH - 5f)

        // 标题栏背景
        shapeRenderer.drawRect(Color.valueOf("#336600"), winX, winY, winW, titleH + 6f, Align.LEFT)
    }

    /** 绘制角色格子区域背景（对应 fillRect color=1 → 0x66AC04 + 边框） */
    private fun drawCellArea() {
        // 填充色 0x66AC04
        shapeRenderer.drawRect(Color.valueOf("#66AC04"), cellAreaX, cellAreaY, cellAreaW, cellAreaH, Align.LEFT)
        // 边框
        shapeRenderer.color = Color.valueOf("#006800")
        shapeRenderer.rect(
            cellAreaX,
            VIRTUAL_H - cellAreaY - cellAreaH,
            cellAreaW,
            cellAreaH
        )
        shapeRenderer.color = Color.valueOf("#ACE000")
        shapeRenderer.rect(
            cellAreaX + 1f,
            VIRTUAL_H - cellAreaY - cellAreaH + 1f,
            cellAreaW - 2f,
            cellAreaH - 2f
        )
        shapeRenderer.color = Color.valueOf("#006800")
        shapeRenderer.rect(
            cellAreaX + 2f,
            VIRTUAL_H - cellAreaY - cellAreaH + 2f,
            cellAreaW - 4f,
            cellAreaH - 4f
        )
    }

    /** 绘制 2×2 角色格子（对应 LoadingPage.drawRect） */
    private fun drawCells() {
        for (row in 0..1) {
            for (col in 0..1) {
                val cx = winX + 8f + colSpacing + (colSpacing + cellSize) * col
                val cy = cellAreaY + 3f + rowSpacing + (rowSpacing + cellSize) * row
                val selected = (row == selectRow && col == selectCol)
                drawRoleCell(cx, cy, selected)
            }
        }
    }

    /** 单个角色格子（对应 LoadingPage.drawRect(null, x, y, bB, bB, selected)） */
    private fun drawRoleCell(x: Float, y: Float, selected: Boolean) {
        // 底色 0x063F31
        shapeRenderer.drawRect(Color.valueOf("#063F31"), x, y, cellSize, cellSize, Align.LEFT)
        // 内填充：选中高亮 0x64B41C，未选中 0x4CA527 (0x64B41C / 0x4CA527 近似)
        val innerColor = if (selected) Color.valueOf("#FF9B15") else Color.valueOf("#394B08")
        shapeRenderer.drawRect(innerColor, x + 3f, y + 3f, cellSize - 6f, cellSize - 6f, Align.LEFT)
        // 内边框：选中 0xFFD215，未选中 0x397C28
        val borderColor = if (selected) Color.valueOf("#FFD215") else Color.valueOf("#397C28")
        shapeRenderer.color = borderColor
        shapeRenderer.rect(
            x + 1f,
            VIRTUAL_H - y - cellSize + 1f,
            cellSize - 3f,
            cellSize - 3f
        )
    }

    /** 绘制窗口标题文字 */
    private fun drawWindowTitle() {
        batch.drawString(SMALL_FONT, "角色列表", Color.valueOf("#FFEC6A"), winX + winW / 2, winY + 3f)
    }

    /** 在对应格子中绘制角色昵称（若有角色） */
    private fun drawNicknames() {
        for (row in 0..1) {
            for (col in 0..1) {
                val idx = row * 2 + col
                val name = roleNames.getOrNull(idx) ?: continue
                val cx = winX + 8f + colSpacing + (colSpacing + cellSize) * col
                val cy = cellAreaY + 3f + rowSpacing + (rowSpacing + cellSize) * row
                // 昵称显示在格子底部
                val textX = cx + cellSize / 2
                val textY = cy + cellSize - 4f
                batch.drawString(SMALL_FONT, name, Color.WHITE, textX, textY)
            }
        }
    }

    override fun dispose() {
        shapeRenderer.dispose()
        super.dispose()
    }
}