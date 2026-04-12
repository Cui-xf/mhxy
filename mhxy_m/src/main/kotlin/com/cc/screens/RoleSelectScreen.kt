//package com.cc.screens
//
//import com.badlogic.gdx.graphics.Color
//import com.badlogic.gdx.graphics.g2d.TextureRegion
//import com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType
//import com.cc.FontManager.MEDIA_FONT
//import com.cc.asset.AssetManagerFactory.PUBLIC_ASSET
//import com.cc.asset.RpgAnimation
//import com.cc.render.*
//import com.cc.screens.base.BaseBackGround
//
//class RoleSelectScreen : AbstractScreen() {
//    private val backGround = BaseBackGround
//    private val shapeRenderer = autoDispose { createShapeRenderer() }
//
//    private val titleImage by resource(PUBLIC_ASSET, "rpg/publicUI/title.rt", TextureRegion::class)
//    private val closeImage by resource(PUBLIC_ASSET, "rpg/publicUI/close.rt", TextureRegion::class)
//
//    private val lu by resource(PUBLIC_ASSET, "rpg/publicUI/lu.rt", TextureRegion::class)
//    private val ld by resource(PUBLIC_ASSET, "rpg/publicUI/ld.rt", TextureRegion::class)
//    private val rd by resource(PUBLIC_ASSET, "rpg/publicUI/rd.rt", TextureRegion::class)
//    private val button1 by resource(PUBLIC_ASSET, "rpg/publicUI/button1.rt", TextureRegion::class)
//
//    private val roleAnimation by resource(PUBLIC_ASSET, "rpg/role/f31111", RpgAnimation::class)
//
//    // 窗口全屏：X=0, Y=0, W=240, H=320
//    private val winW = VIRTUAL_W * 0.95f
//    private val winH = VIRTUAL_H * 0.95f
//    private val winX = (VIRTUAL_W - winW) / 2
//    private val winY = (VIRTUAL_H - winH) / 2
//    private val roleBox = 55f
//    private val gapW = (winW - roleBox * 2) / 3
//
//    private var timer = 0f
//
//    override fun update(delta: Float) {
//        timer += delta
//
//        backGround.update(delta)
//
//        batch.begin()
//        //标题
//        drawTitleImage()
//        batch.end()
//        //边框
//        border()
//        batch.begin()
//        //角上装饰
//        cornerDecoration()
//        batch.end()
//        //角色框背景
//        roleBoxBackground()
//        roleBoxBackground2()
//
//        roleBox(0)
//
//        roleSelectedAnimation()
//    }
//
//    private fun roleSelectedAnimation() {
//        val x = winX + 8 + gapW + roleBox / 2
//        val y = winY + 93
//        batch.begin()
//        val keyFrame = roleAnimation.getKeyFrame(timer, true)
//        batch.drawAnimation(keyFrame, x, y)
//        //pngUtil.roleSelectedAnimation(graphics, (Animation) this.roleFrame_1[i], (int[]) null, 0, 0, this.actorList[i][0] + 40 + 6, this.actorList[i][1] + 45 + 1, 20, 0);
//        batch.end()
//    }
//
//    //4个角色框
//    private fun roleBox(row: Int) {
//        repeat(2) { type ->
//            if (type == 0) {
//                shapeRenderer.begin(ShapeType.Filled)
//            } else {
//                shapeRenderer.begin(ShapeType.Line)
//            }
//            for (i in 0 until 2) {
//                for (j in 0 until 2) {
//                    val x = winX + gapW + (gapW + roleBox) * i
//                    val y = winY + 35 + roleBox * j
//                    if (type == 0) {
//                        shapeRenderer.drawRect(409969.toColor(), x, y, roleBox, roleBox, align = Align.LEFT)
//                        shapeRenderer.drawRect(
//                            if (i == row && j == row) 6597852.toColor() else 5018307.toColor(),
//                            x + 3,
//                            y + 3,
//                            roleBox - 6,
//                            roleBox - 6,
//                            align = Align.LEFT
//                        )
//                    } else {
//                        shapeRenderer.drawRect(
//                            if (i == row && j == row) 16775125.toColor() else 3775208.toColor(),
//                            x + 1,
//                            y + 1,
//                            roleBox - 2,
//                            roleBox - 2,
//                            align = Align.LEFT
//                        )
//                    }
//                }
//            }
//            shapeRenderer.end()
//        }
//
//    }
//
//    //角色框背景
//    private fun roleBoxBackground() {
//        //            LoadingPage.fillRect(graphics, this.mixedUi.X + 5, this.mixedUi.Y + 32, this.mixedUi.W - 11, this.mixedUi.setR((this.bB << 1) + 6), 1);
//        val x = winX + 5
//        val y = winY + 32
//        val w = winW - 10
//        val h = 55 * 2 + 6f
//        shapeRenderer.begin(ShapeType.Filled)
//        shapeRenderer.drawRect(6732228.toColor(), x, y, w, h, align = Align.LEFT)
//        shapeRenderer.end()
//        shapeRenderer.begin(ShapeType.Line)
//        shapeRenderer.drawRect(26540.toColor(), x, y, w, h, align = Align.LEFT)
//        shapeRenderer.drawRect(26540.toColor(), x + 2, y + 2, w - 4, h - 4, align = Align.LEFT)
//        shapeRenderer.drawRect(11267556.toColor(), x + 1, y + 1, w - 2, h - 2, align = Align.LEFT)
//        shapeRenderer.end()
//    }
//
//    private fun roleBoxBackground2() {
//        val x = winX + 5
//        val y = winY + 32 + 55 * 2 + 6f
//        val w = winW - 10
//        val h = 126f
//        shapeRenderer.begin(ShapeType.Filled)
//        shapeRenderer.drawRect(6732228.toColor(), x, y, w, h, align = Align.LEFT)
//        shapeRenderer.end()
//        shapeRenderer.begin(ShapeType.Line)
//        shapeRenderer.drawRect(26540.toColor(), x, y, w, h, align = Align.LEFT)
//        shapeRenderer.drawRect(26540.toColor(), x + 2, y + 2, w - 4, h - 4, align = Align.LEFT)
//        shapeRenderer.drawRect(11267556.toColor(), x + 1, y + 1, w - 2, h - 2, align = Align.LEFT)
//        shapeRenderer.end()
//        batch.begin()
//        batch.drawString(MEDIA_FONT, "昵称：欧阳娜娜", 2176196.toColor(), x + 4, y + 8, align = Align.LEFT)
//        batch.drawString(
//            MEDIA_FONT,
//            "等级：6",
//            2176196.toColor(),
//            x + 4,
//            y + 8 + MEDIA_FONT.lineHeight,
//            align = Align.LEFT
//        )
//        batch.end()
//    }
//
//    private fun border() {
//        shapeRenderer.begin(ShapeType.Filled)
//        //底部横线边框
//        shapeRenderer.drawRect(Color.valueOf("#0067AC"), winX, winY + 28f, winW - 1, 4f, align = Align.LEFT)
//        shapeRenderer.end()
//        shapeRenderer.begin(ShapeType.Line)
//        //底部横线
//        shapeRenderer.drawLine(Color.valueOf("#ABEDE4"), winX + 1.5f, winY + 29f, winX + winW - 2, winY + 29f)
//        //外边框
//        shapeRenderer.drawRect(Color.valueOf("#005187"), winX, winY, winW, winH, align = Align.LEFT)
//        shapeRenderer.drawRect(Color.valueOf("#1197AE"), winX + 1, winY + 1, winW - 2, winH - 2, align = Align.LEFT)
//        shapeRenderer.drawRect(Color.valueOf("#95D9E2"), winX + 2, winY + 2, winW - 4, winH - 4, align = Align.LEFT)
//        shapeRenderer.drawRect(Color.valueOf("#1197AE"), winX + 3, winY + 3, winW - 6, winH - 6, align = Align.LEFT)
//        shapeRenderer.drawRect(Color.valueOf("#005187"), winX + 4, winY + 4, winW - 8, winH - 8, align = Align.LEFT)
//        shapeRenderer.end()
//    }
//
//    private fun cornerDecoration() {
//        batch.drawImage(lu, winX, winY, align = Align.LEFT)
//        batch.drawImage(ld, winX, winY + winH - ld.regionHeight, align = Align.LEFT)
//        batch.drawImage(rd, winX + winW - rd.regionWidth, winY + winH - rd.regionHeight, align = Align.LEFT)
//    }
//
//    private fun drawTitleImage() {
//        val x = winX
//        val y = winY + 4
//        val imgW = titleImage.regionWidth
//        var t = 0
//        // 绘制完整的图片
//        for (i in 0 until (winW.toInt() - imgW) step imgW) {
//            t = i
//            batch.drawImage(titleImage, x + i, y, align = Align.LEFT)
//        }
//        // 绘制最后不足一张的部分（裁剪，不拉伸）
//        if (t < winW) {
//            val textureRegion = TextureRegion(titleImage, 0, 0, winW.toInt() - t, titleImage.regionHeight)
//            batch.drawImage(textureRegion, x + t, y, align = Align.LEFT)
//        }
//        //关闭按钮
//        batch.drawImage(closeImage, x + winW - 5 - closeImage.regionWidth, y, align = Align.LEFT)
//        //文字
//        batch.wordArtString(
//            MEDIA_FONT,
//            "角色列表",
//            Color.valueOf("#000000"),
//            Color.valueOf("#FFFED5"),
//            x + winW / 2,
//            y + (titleImage.regionHeight - MEDIA_FONT.capHeight) / 2
//        )
//        batch.drawImage(button1, 6f, 284f, 228f, button1.regionHeight.toFloat() + 1, align = Align.LEFT)
//        batch.wordArtString(
//            MEDIA_FONT,
//            "进入游戏",
//            0.toColor(),
//            16776917.toColor(),
//            16f,
//            283f + 8.5f,
//            align = Align.LEFT
//        )
//    }
//
//    override fun dispose() {
//        shapeRenderer.dispose()
//        super.dispose()
//    }
//}