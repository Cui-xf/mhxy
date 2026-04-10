package com.cc;

import com.yinhan.kjava.main.MainCanvas;

import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;

// 可滚动文本面板：既能显示普通自动换行文本，也能显示 TextRender 富文本内容。
public final class TextPanel extends BaseUi {
    // 滚动模式：0/1 按行循环，2 按页翻动。
    private byte gunDongMoShi = 1;
    // 当前高亮或光标所在的行下标。
    private int h = 0;
    // 当前可见内容的起始行。
    public int a = 0;
    //高亮
    private boolean gaoLiang = false;
    // 文本区域矩形。
    public int textX;
    public int textY;
    public int textW;
    public int textH;
    private Font font;
    // 普通文本模式下的原始文本与换行结果。
    private String puTongText;
    private String[] huanHangWenBen;
    // 总行数、每页可显示行数、滚动条滑块高度。
    private int lines;
    private int pageLines;
    private int gunDongH;
    // 是否启用 TextRender 富文本模式。
    private boolean fuWenBen = false;
    private String fwbText;
    private FWBRender fwbRender;
    private String zhiBiaoFu = "\t";
    private int wenBenColor = 2176196;
    // 滚动条上下按钮的命中区域。
    private int[][] gundongQuYu = new int[2][4];
    public boolean f = false;
    // 输入映射模式。
    private byte shuRuMoShi;
    // 单行高度。
    private int lineH;

    public TextPanel() {
        this.changeGunDongMoShi((byte) 1);
    }

    // 设置文本显示区域。
    public void setTextRect(int var1, int var2, int var3, int var4) {
        this.textX = var1;
        this.textY = var2;
        this.textW = var3;
        this.textH = var4;
    }

    // 处理上下翻动，并根据滚动模式修正起始行与当前行。
    public final void onClick(int var1) {
        if (this.fuWenBen) {
            if (this.fwbText != null && this.fwbText.length() != 0) {
                this.fwbRender = new FWBRender(this.fwbText, (short) (this.textW - 8 - MainCanvas.up.w));
                this.lines = this.fwbRender.getLines();
            } else {
                this.lines = 0;
                this.fwbRender = null;
            }
        } else {
            if (this.puTongText != null && this.puTongText.length() != 0) {
                this.huanHangWenBen = LoadingPage.parseText(this.puTongText, this.font, this.textW - 8 - MainCanvas.up.w, this.zhiBiaoFu);
                int color = LoadingPage.parseColor(this.huanHangWenBen[0]);
                this.wenBenColor = color != -1 ? color : 2176196;
                if (this.wenBenColor != 2176196) {
                    this.huanHangWenBen[0] = this.huanHangWenBen[0].substring(3);
                }
            } else {
                this.huanHangWenBen = null;
            }
            this.lines = this.huanHangWenBen == null ? 0 : this.huanHangWenBen.length;
        }


        this.pageLines = (this.textH - 6) / this.lineH;
        if (this.lines > this.pageLines) {
            this.gunDongH = Math.max(this.pageLines * (this.textH - 16) / this.lines, 6);
        } else {
            this.gunDongH = 0;
        }

        if (this.shuRuMoShi == 0 && (var1 == 1 || var1 == 514) || this.shuRuMoShi == 1 && var1 == 515) {
            TextPanel var3 = this;
            if (this.gunDongMoShi == 0) {
                if (this.h == 0) {
                    this.a = this.lines % this.pageLines == 0 ? this.lines - this.pageLines : this.lines - this.lines % this.pageLines;
                }

                for (this.h = this.h == 0 ? this.lines - 1 : this.h - 1; var3.a > 0 && var3.gunDongH != 0 && var3.h - var3.a + 1 < var3.pageLines; --var3.a) {
                }
            } else if (this.gunDongMoShi == 1) {
                if (this.h <= this.pageLines - 1) {
                    this.a = this.lines % this.pageLines == 0 ? this.lines - this.pageLines : this.lines - this.lines % this.pageLines;
                }

                for (this.h = this.h <= this.pageLines - 1 ? this.lines - 1 : this.h - 1; var3.a > 0 && var3.gunDongH != 0 && var3.h - var3.a + 1 < var3.pageLines; --var3.a) {
                }
            } else if (this.gunDongMoShi == 2 && this.lines > this.pageLines) {
                if (this.a == 0) {
                    this.a = this.lines - this.pageLines;
                    this.h = this.lines - 1;
                } else {
                    this.a = this.a - this.pageLines <= 0 ? 0 : this.a - this.pageLines;
                    if (this.a == 0) {
                        this.h = this.pageLines - 1;
                    } else {
                        this.h = this.a + this.pageLines - 1;
                    }
                }
            }
        } else if (this.shuRuMoShi == 0 && (var1 == 4 || var1 == 520) || this.shuRuMoShi == 1 && var1 == 521) {
            TextPanel var2 = this;
            if (this.gunDongMoShi == 0) {
                if (this.h == this.lines - 1) {
                    this.a = 0;
                }

                for (this.h = this.h == this.lines - 1 ? 0 : this.h + 1; var2.a < var2.h && var2.gunDongH != 0 && var2.h - var2.a + 1 > var2.pageLines; ++var2.a) {
                }
            } else if (this.gunDongMoShi == 1) {
                if (this.h == this.lines - 1) {
                    this.a = 0;
                }

                for (this.h = this.h == this.lines - 1 ? this.pageLines - 1 : (this.h <= this.pageLines - 1 ? this.pageLines : this.h + 1); var2.a < var2.h && var2.gunDongH != 0 && var2.h - var2.a + 1 > var2.pageLines; ++var2.a) {
                }
            } else if (this.gunDongMoShi == 2 && this.lines > this.pageLines) {
                if (this.a == this.lines - this.pageLines) {
                    this.a = 0;
                    this.h = this.pageLines - 1;
                } else {
                    this.a = this.a + this.pageLines >= this.lines - this.pageLines ? this.lines - this.pageLines : this.a + this.pageLines;
                    if (this.a == this.lines - this.pageLines) {
                        this.h = this.lines - 1;
                    } else {
                        this.h = this.a + this.pageLines - 1;
                    }
                }
            }
        }

        while (this.h > this.lines - 1) {
            --this.h;
            --this.a;
        }

        while (this.a > 0 && this.gunDongH != 0 && this.h - this.a + 1 < this.pageLines) {
            --this.a;
        }

        while (this.a < this.h && this.gunDongH != 0 && this.h - this.a + 1 > this.pageLines) {
            ++this.a;
        }

        if (this.gunDongH == 0 && this.a != 0) {
            this.a = 0;
        }

    }

    // 命中检测：只处理滚动条上下按钮。
    public int hintCheck(int x, int y) {
        if (this.hintCheck(x, y, 0)) {
            return this.shuRuMoShi == 0 ? 1 : 515;
        } else if (this.hintCheck(x, y, 1)) {
            return this.shuRuMoShi == 0 ? 4 : 521;
        } else {
            return 0;
        }
    }

    // 缓存滚动条上下按钮的点击区域。
    private void setGundongQuYu(int var1, int var2, int var3, int var4, int var5, int var6) {
        this.gundongQuYu[0][0] = var1;
        this.gundongQuYu[0][1] = var2;
        this.gundongQuYu[0][2] = var5;
        this.gundongQuYu[0][3] = var6;
        this.gundongQuYu[1][0] = var3;
        this.gundongQuYu[1][1] = var4;
        this.gundongQuYu[1][2] = var5;
        this.gundongQuYu[1][3] = var6;
    }

    // 判断坐标是否命中滚动条按钮。
    private boolean hintCheck(int x, int y, int mode) {
        if (mode == 0) {
            return x >= this.gundongQuYu[0][0] && x <= this.gundongQuYu[0][0] + this.gundongQuYu[0][2] && y >= this.gundongQuYu[0][1] && y <= this.gundongQuYu[0][1] + this.gundongQuYu[0][3];
        } else if (mode == 1) {
            return x >= this.gundongQuYu[1][0] && x <= this.gundongQuYu[1][0] + this.gundongQuYu[1][2] && y >= this.gundongQuYu[1][1] && y <= this.gundongQuYu[1][1] + this.gundongQuYu[1][3];
        }
        return false;
    }

    // 装载 TextRender 富文本内容。
    public void setFWBText(String text, Font font, byte gunDongMoShi) {
        this.lineH = font.getHeight();
        this.h = 0;
        this.a = 0;
        this.font = font;
        this.fwbText = text;
        this.fwbRender = null;
        this.changeGunDongMoShi(gunDongMoShi);
        this.shuRuMoShi = 0;
        this.fuWenBen = true;
        this.zhiBiaoFu = "\t";
        this.puTongText = null;
        this.huanHangWenBen = null;
    }

    // 装载普通文本内容，并按宽度自动换行。
    public void setText(String var1, Font var2, byte gunDongMoShi) {
        this.lineH = var2.getHeight();
        this.h = 0;
        this.a = 0;
        this.font = var2;
        this.puTongText = var1;
        this.changeGunDongMoShi(gunDongMoShi);
        this.shuRuMoShi = 0;
        this.zhiBiaoFu = "\t";
        this.fuWenBen = false;
        this.fwbText = null;
        this.fwbRender = null;
    }

    // 绘制文本区域、滚动条以及可选的选中高亮。
    public void draw(Graphics graphics) {
        LoadingPage.fillRect(graphics, this.textX, this.textY, this.textW, this.textH, 1);
        if (this.f) {
            LoadingPage.draw(graphics);
        }

        if (!this.fuWenBen && this.huanHangWenBen != null) {
            for (int var3 = this.a; var3 < this.huanHangWenBen.length && var3 < this.a + this.pageLines; ++var3) {
                if (var3 == this.h && this.gaoLiang) {
                    LoadingPage.setColor(graphics, 9);
                    if (this.h >= this.pageLines) {
                        graphics.fillRect(this.textX + 4, this.textY + 4 + (this.pageLines - 1) * this.lineH, this.textW - MainCanvas.up.w - 8, this.lineH);
                    } else {
                        graphics.fillRect(this.textX + 4, this.textY + 4 + this.h * this.lineH, this.textW - MainCanvas.up.w - 8, this.lineH);
                    }
                }

                if (var3 == this.h && this.gunDongMoShi == 0) {
                    LoadingPage.drawString(graphics, this.huanHangWenBen[var3], this.textX + 4, this.textY + 4 + (var3 - this.a) * this.lineH, 20, 13500379);
                } else {
                    LoadingPage.drawString(graphics, this.huanHangWenBen[var3], this.textX + 4, this.textY + 4 + (var3 - this.a) * this.lineH, 20, this.wenBenColor);
                }
            }

            if (this.gunDongH > 0) {
                LoadingPage.draw(graphics, this.textX + this.textW - 2 - MainCanvas.up.w, this.textY + 3, this.textH - 5, this.gunDongH, this.a, this.lines, this.pageLines);
                this.setGundongQuYu(this.textX + this.textW - 2 - MainCanvas.up.w, this.textY + 3, this.textX + this.textW - 2 - MainCanvas.up.w, this.textY + 3 + this.textH - 5 - MainCanvas.down.h, MainCanvas.down.w, MainCanvas.down.h);
            }
        } else if (this.fuWenBen && this.fwbRender != null) {
            for (int var2 = this.a; var2 < this.fwbRender.getLines() && var2 < this.a + this.pageLines; ++var2) {
                this.fwbRender.drawLine(graphics, this.textX + 4, this.textY + 4 + (var2 - this.a) * this.lineH, var2, 0);
            }

            if (this.gunDongH > 0) {
                LoadingPage.draw(graphics, this.textX + this.textW - 2 - MainCanvas.up.w, this.textY + 3, this.textH - 5, this.gunDongH, this.a, this.lines, this.pageLines);
                this.setGundongQuYu(this.textX + this.textW - 2 - MainCanvas.up.w, this.textY + 3, this.textX + this.textW - 2 - MainCanvas.up.w, this.textY + 3 + this.textH - 5 - MainCanvas.down.h, MainCanvas.down.w, MainCanvas.down.h);
            }
        }

    }

    // 切换滚动模式；模式 1 会关闭行高亮。
    private void changeGunDongMoShi(byte var1) {
        this.gunDongMoShi = var1;
        if (var1 == 1) {
            this.gaoLiang = false;
        }

    }

    // 释放文本缓存。
    public void clear() {
        if (this.huanHangWenBen != null) {
            for (short var1 = 0; var1 < this.huanHangWenBen.length; ++var1) {
                this.huanHangWenBen[var1] = null;
            }

            this.huanHangWenBen = null;
        }

        this.fwbText = null;
        this.fwbRender = null;
    }

    // 切换输入映射模式。
    public void setShuRuMoShi(byte shuRuMoShi) {
        this.shuRuMoShi = shuRuMoShi;
    }
}
