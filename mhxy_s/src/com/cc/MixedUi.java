package com.cc;

import com.yinhan.kjava.main.MainCanvas;

import javax.microedition.lcdui.Graphics;
import java.util.Vector;

// 复合窗口容器：负责统一绘制外框/标题，并按固定区域组合多个 al 子控件。
public final class MixedUi extends BaseUi {
    private int h = 16776917;
    // 窗口标题文本。
    private String title;
    // 是否绘制窗口底色。
    private boolean drawBackground = false;
    // 是否绘制左上角装饰图。
    private boolean k = true;
    // 窗口矩形区域。
    public int X = 0;
    public int Y = 0;
    public int W;
    public int H;
    // 子控件列表，实际会混合放入标题栏、列表、文本区、底部按钮栏等组件。
    private Vector child = new Vector();
    private int m;
    private int n;
    private int o;
    private int p;
    private int[] q = null;
    public int e = 0;
    public int f = 0;
    public int g = 0;
    private int r = 0;
    private int Y_5 = 0;
    private int topUiIndex = -1;
    private int gunDongIndex = -1;
    private int textPanelIndex = -1;
    private int buttonIndex = -1;
    private int bottomIndex = -1;
    private boolean y = false;

    // 控制是否绘制窗口背景色。
    public void setDrawBackground(boolean var1) {
        this.drawBackground = var1;
    }

    // 设置窗口标题，同时初始化标题右侧关闭按钮的点击区域缓存。
    public void setTitle(String var1) {
        this.title = var1;
        if (var1 == null) {
            this.q = null;
        } else {
            this.q = new int[4];
        }

        this.r = 0;
        this.Y_5 = 0;
    }

    public final int a() {
        return this.n + this.p + 3;
    }

    // 设置窗口自身位置，并预留标题栏占用的纵向空间。
    private void layout_1(int x, int y, int w, int h) {
        this.X = x;
        this.Y = y;
        this.W = w;
        this.H = h;
        this.Y_5 = this.Y + 5;
        if (this.title != null && MainCanvas.title != null) {
            h = MainCanvas.title.c;
            y = this.Y_5;
            this.m = x;
            this.n = y;
            this.o = w;
            this.p = h;
            this.Y_5 = this.Y_5 + this.p + 3;
        }

    }

    public int setR(int var1) {
        this.r = var1;
        return this.r;
    }

    // 标准布局：根据子控件类型自动分配标题栏、列表区、文本区、底栏的显示区域。
    public void layout(int x, int y, int w, int h) {
        this.layout_1(x, y, w, h);
        this.scanChild();
        if (this.topUiIndex != -1) {
            ((TopUi) this.child.elementAt(this.topUiIndex)).layout(this.X + 5, this.Y_5, this.W - 20, GlobalConfig.font2_h + 3);
            this.Y_5 += GlobalConfig.font2_h;
        }

        if (this.gunDongIndex != -1 && this.textPanelIndex == -1) {
            x = this.Y + this.H - this.Y_5 - 6 - (this.buttonIndex != -1 ? GlobalConfig.font2_h + 4 : 0) - (this.bottomIndex != -1 ? MainCanvas.button1.c : 0) - this.e;
            ((GunDongListUi) this.child.elementAt(this.gunDongIndex)).a(this.X + 5, this.Y_5 + this.e, this.W - 11, x - this.f);
            this.Y_5 += x;
        } else if (this.gunDongIndex == -1 && this.textPanelIndex != -1) {
            x = this.Y + this.H - this.Y_5 - 6 - (this.buttonIndex != -1 ? GlobalConfig.font2_h + 4 : 0) - (this.bottomIndex != -1 ? MainCanvas.button1.c : 0) - this.r;
            ((TextPanel) this.child.elementAt(this.textPanelIndex)).setTextRect(this.X + 5, this.Y_5 + this.r, this.W - 11, x - this.g);
            this.Y_5 += x;
        } else if (this.gunDongIndex != -1 && this.textPanelIndex != -1) {
            y = (x = this.Y + this.H - this.Y_5 - 6 - (this.buttonIndex != -1 ? GlobalConfig.font2_h + 4 : 0) - (this.bottomIndex != -1 ? MainCanvas.button1.c : 0) - this.e) / 2;
            this.Y_5 += this.e;
            ((GunDongListUi) this.child.elementAt(this.gunDongIndex)).a(this.X + 5, this.Y_5, this.W - 11, y);
            this.Y_5 += y;
            x -= y;
            ((TextPanel) this.child.elementAt(this.textPanelIndex)).setTextRect(this.X + 5, this.Y_5, this.W - 11, x);
        }

        if (this.buttonIndex != -1) {
            ButtonUi var10000 = (ButtonUi) this.child.elementAt(this.buttonIndex);
            int var10001 = this.X + 6;
            int var10002 = this.Y;
            int var10003 = this.W - 13;
            int var5 = this.H - 6;
        } else {
            if (this.bottomIndex != -1) {
                ((BottomUi) this.child.elementAt(this.bottomIndex)).a(this.X, this.Y, this.W, this.H - 5);
            }

        }
    }

    public final void a(int var1, int var2, int var3, int var4, int var5, int var6, boolean var7) {
        this.layout_1(var1, var2, var3, var4);
        this.scanChild();
        if (this.topUiIndex != -1) {
            ((TopUi) this.child.elementAt(this.topUiIndex)).layout(this.X + 5, this.Y_5, this.W - 20, GlobalConfig.font2_h + 3);
            this.Y_5 += GlobalConfig.font2_h;
        }

        if (this.gunDongIndex != -1 && this.textPanelIndex == -1) {
            var1 = this.Y + this.H - this.Y_5 - 6 - (this.buttonIndex != -1 ? GlobalConfig.font2_h + 4 : 0) - (this.bottomIndex != -1 ? MainCanvas.button1.c : 0) - this.e;
            ((GunDongListUi) this.child.elementAt(this.gunDongIndex)).a(this.X + 5, this.Y_5 + this.e, this.W - 11, var1 - this.f);
            this.Y_5 += var1;
        } else if (this.gunDongIndex == -1 && this.textPanelIndex != -1) {
            var1 = this.Y + this.H - this.Y_5 - 6 - (this.buttonIndex != -1 ? GlobalConfig.font2_h + 4 : 0) - (this.bottomIndex != -1 ? MainCanvas.button1.c : 0) - this.r;
            ((TextPanel) this.child.elementAt(this.textPanelIndex)).setTextRect(this.X + 5, this.Y_5 + this.r, this.W - 11, var1 - this.g);
            this.Y_5 += var1;
        } else if (this.gunDongIndex != -1 && this.textPanelIndex != -1) {
            var2 = (var1 = this.Y + this.H - this.Y_5 - 6 - (this.buttonIndex != -1 ? GlobalConfig.font2_h + 4 : 0) - (this.bottomIndex != -1 ? MainCanvas.button1.c : 0) - this.e) * var5 / var6;
            this.Y_5 += this.e;
            if (var7) {
                ((TextPanel) this.child.elementAt(this.textPanelIndex)).setTextRect(this.X + 5, this.Y_5, this.W - 11, var2);
                this.Y_5 += var2;
                var1 -= var2;
                ((GunDongListUi) this.child.elementAt(this.gunDongIndex)).a(this.X + 5, this.Y_5, this.W - 11, var1);
            } else {
                ((GunDongListUi) this.child.elementAt(this.gunDongIndex)).a(this.X + 5, this.Y_5, this.W - 11, var2);
                this.Y_5 += var2;
                var1 -= var2;
                ((TextPanel) this.child.elementAt(this.textPanelIndex)).setTextRect(this.X + 5, this.Y_5, this.W - 11, var1);
            }
        }

        if (this.buttonIndex != -1) {
            ButtonUi var10000 = (ButtonUi) this.child.elementAt(this.buttonIndex);
            int var10001 = this.X + 6;
            int var10002 = this.Y;
            int var10003 = this.W - 13;
            int var8 = this.H - 6;
        } else {
            if (this.bottomIndex != -1) {
                ((BottomUi) this.child.elementAt(this.bottomIndex)).a(this.X, this.Y, this.W, this.H - 5);
            }

        }
    }

    // 向窗口中注册一个子控件，绘制与输入都会继续向下分发。
    public void addChild(BaseUi var1) {
        this.child.addElement(var1);
    }

    // 清空窗口内容但保留对象实例，常用于重新组装弹窗。
    public void clean() {
        this.title = null;
        this.drawBackground = false;
        this.r = 0;
        this.e = 0;
        this.f = 0;
        this.g = 0;
        this.child.removeAllElements();
    }

    // 将指令继续分发给所有子控件。
    public void onClick(int var1) {
        for (int var2 = 0; var2 < this.child.size(); ++var2) {
            ((BaseUi) this.child.elementAt(var2)).onClick(var1);
        }

    }

    // 先检测标题栏关闭按钮，再交给子控件逐个做命中检测。
    public final int hintCheck(int var1, int var2) {
        if (this.q != null && var1 >= this.q[0] && var1 <= this.q[0] + this.q[2] && var2 >= this.q[1] && var2 <= this.q[1] + this.q[3]) {
            return 536870912;
        } else {
            for (int var3 = 0; var3 < this.child.size(); ++var3) {
                if (((BaseUi) this.child.elementAt(var3)).hintCheck(var1, var2) != 0) {
                    return ((BaseUi) this.child.elementAt(var3)).hintCheck(var1, var2);
                }
            }

            return 0;
        }
    }

    // 扫描子控件列表，记录各类固定槽位在 Vector 中的下标，便于统一布局。
    private void scanChild() {
        this.topUiIndex = -1;
        this.gunDongIndex = -1;
        this.textPanelIndex = -1;
        this.buttonIndex = -1;
        this.bottomIndex = -1;

        for (int i = 0; i < this.child.size(); ++i) {
            Object child = this.child.elementAt(i);
            if (child instanceof TopUi) {
                this.topUiIndex = i;
            } else if (child instanceof GunDongListUi) {
                this.gunDongIndex = i;
            } else if (child instanceof TextPanel) {
                this.textPanelIndex = i;
            } else if (child instanceof ButtonUi) {
                this.buttonIndex = i;
            } else if (child instanceof BottomUi) {
                this.bottomIndex = i;
            }
        }
    }

    public final void b(boolean var1) {
        this.k = false;
    }

    // 绘制窗口装饰、标题栏以及所有子控件。
    public void draw(Graphics var1) {
        var1.setClip(this.X, this.Y, this.W, this.H);
        if (this.drawBackground) {
            var1.setColor(2780801);
            var1.fillRect(this.X, this.Y, this.W, this.H);
        }

        this.y = false;
        if (this.title != null && this.title != null) {
            LoadingPage.a(var1, MainCanvas.title.pngImage, MainCanvas.title.b, this.m, this.n, this.o, this.p);
            var1.drawImage(MainCanvas.close.pngImage, this.m + this.o - 5 - MainCanvas.close.b, this.n + 1, 20);
            int var10001 = this.m + this.o - 5 - MainCanvas.close.b;
            int var10002 = this.n + 1;
            short var8 = MainCanvas.close.c;
            short var7 = MainCanvas.close.b;
            int var6 = var10002;
            int var5 = var10001;
            if (this.q != null) {
                this.q[0] = var5;
                this.q[1] = var6;
                this.q[2] = var7;
                this.q[3] = var8;
            }

            int var2 = LoadingPage.parseColor(this.title) != -1 ? LoadingPage.parseColor(this.title) : this.h;
            String var10 = this.title;
            if (var2 != this.h) {
                if (LoadingPage.fwbColorMode == 2) {
                    var10 = this.title.substring(4, this.title.length());
                } else {
                    var10 = this.title.substring(3, this.title.length());
                }
            }

            LoadingPage.drawString(var1, (String) var10, (int) (this.m + this.o / 2), this.n + GlobalConfig.getCzjz(MainCanvas.title.c), 17, var2, 0);
            LoadingPage.a(var1, this.m, this.n + this.p, this.o);
        }

        for (int var9 = 0; var9 < this.child.size(); ++var9) {
            Object var3;
            if ((var3 = this.child.elementAt(var9)) instanceof TopUi) {
                ((TopUi) var3).a(var1);
                this.y = true;
            } else if (var3 instanceof GunDongListUi) {
                ((GunDongListUi) var3).a(var1);
                ((GunDongListUi) var3).a(this.y);
            } else if (var3 instanceof TextPanel) {
                ((TextPanel) var3).draw(var1);
                TextPanel var10000 = (TextPanel) var3;
                boolean var4 = this.y;
                var10000.f = var4;
            } else if (var3 instanceof ButtonUi) {
                ButtonUi var11 = (ButtonUi) var3;
            } else if (var3 instanceof BottomUi) {
                ((BottomUi) var3).a(var1);
            }
        }

        LoadingPage.setColor(var1, 2);
        var1.drawRect(this.X, this.Y, this.W - 1, this.H - 1);
        var1.drawRect(this.X + 4, this.Y + 4, this.W - 9, this.H - 9);
        LoadingPage.setColor(var1, 3);
        var1.drawRect(this.X + 1, this.Y + 1, this.W - 3, this.H - 3);
        var1.drawRect(this.X + 3, this.Y + 3, this.W - 7, this.H - 7);
        LoadingPage.setColor(var1, 4);
        var1.drawRect(this.X + 2, this.Y + 2, this.W - 5, this.H - 5);
        if (MainCanvas.lu.pngImage != null && this.k) {
            var1.drawImage(MainCanvas.lu.pngImage, this.X, this.Y, 20);
        }

        if (MainCanvas.ld.pngImage != null) {
            var1.drawImage(MainCanvas.ld.pngImage, this.X, this.Y + this.H - MainCanvas.ld.c, 20);
        }

        if (MainCanvas.rd.pngImage != null) {
            var1.drawImage(MainCanvas.rd.pngImage, this.X + this.W - MainCanvas.rd.b, this.Y + this.H - MainCanvas.rd.c, 20);
        }

        var1.setClip(this.X, this.Y, this.W, this.H);
    }

    // 释放窗口与全部子控件的状态。
    public final void clear() {
        this.title = null;
        this.drawBackground = false;
        this.r = 0;
        this.e = 0;
        this.f = 0;
        this.g = 0;
        this.k = true;

        for (int var1 = 0; var1 < this.child.size(); ++var1) {
            ((BaseUi) this.child.elementAt(var1)).clear();
        }

        this.child.removeAllElements();
    }
}
