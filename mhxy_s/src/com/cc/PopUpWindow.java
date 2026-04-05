package com.cc;

import javax.microedition.lcdui.Graphics;
import java.util.Vector;

/**
 * 弹窗容器（单例），是整个弹窗面板系统的根组件。
 * <p>
 * 负责：
 * - 绘制弹窗背景、标题栏（带标题文字）、多层边框、四角装饰图、关闭按钮
 * - 管理子组件列表（af/ay/bi/u），在 d() 中按固定规则自动分配各子组件的位置和高度
 * - 将触摸事件分发给命中的子组件，右上角区域返回关闭动作码（536870912）
 * <p>
 * 布局规则（d() 方法）：
 * af（输入区）占顶部，u（按钮栏）占底部，
 * ay（列表）和 bi（文本）平分剩余空间（ay:bi ≈ 4:3）；若只有其中一个则独占剩余空间。
 */
public final class PopUpWindow extends UIComponent {
    /**
     * 弹窗边框颜色数组（由外向内 5 层渐变色）
     */
    private int[] bianKuangColor = new int[]{20871, 1152942, 9820642, 20871, 1152942};
    /**
     * 标题文字内容
     */
    private String title;
    /**
     * 标题文字绘制 X 坐标（居中计算）
     */
    private int titleX;
    /**
     * 标题文字绘制 Y 坐标
     */
    private int titleY;
    /**
     * 是否绘制背景填充色
     */
    private boolean needBackground = true;
    /**
     * 标题栏背景图（横向平铺）
     */
    public static Frame0 backImage;
    /**
     * 关闭按钮图标（右上角）
     */
    public static Frame0 closeButton;
    /**
     * 左上角装饰图
     */
    public static Frame0 zhuangShi1;
    /**
     * 左下角装饰图
     */
    public static Frame0 zhuangShi2;
    /**
     * 右下角装饰图
     */
    public static Frame0 zhuangShi3;
    /**
     * af 子组件在 u 列表中的索引（-1 表示不存在）
     */
    private int topIndex;
    /**
     * ay 子组件在 u 列表中的索引（-1 表示不存在）
     */
    private int listIndex;
    /**
     * bi 子组件在 u 列表中的索引（-1 表示不存在）
     */
    private int FwbIndex;
    /**
     * u 子组件在 u 列表中的索引（-1 表示不存在）
     */
    private int bottomIndex;
    /**
     * 子组件列表（af 插入头部，其余追加尾部）
     */
    private Vector child = new Vector();
    /**
     * 单例实例
     */
    private static PopUpWindow self = null;

    public static PopUpWindow getInst() {
        if (self == null) {
            self = new PopUpWindow();
        }

        return self;
    }

    public void refresh() {
    }

    public void setTitle(String var1) {
        this.title = var1;
    }

    public void addChild(UIComponent c) {
        if (c instanceof TopUIComponent) {
            this.child.insertElementAt(c, 0);
        } else {
            this.child.addElement(c);
        }
    }

    public void destroy() {
        for (int i = 0; i < this.child.size(); ++i) {
            ((UIComponent) this.child.elementAt(i)).destroy();
        }
        this.child.removeAllElements();
    }

    public void layout() {
        if (this.title != null) {
            this.titleX = super.X + (super.W - GlobalConfig.font2.stringWidth(this.title)) / 2;
            this.titleY = super.Y + 5;
        }

        this.topIndex = this.listIndex = this.FwbIndex = this.bottomIndex = -1;

        for (int i = 0; i < this.child.size(); ++i) {
            Object child = this.child.elementAt(i);
            if (child instanceof TopUIComponent) {
                this.topIndex = i;
            } else if (child instanceof GunDongListUIComponent) {
                this.listIndex = i;
            } else if (child instanceof FWBUIComponent) {
                this.FwbIndex = i;
            } else if (child instanceof BottomUIComponent) {
                this.bottomIndex = i;
            }
        }

        int var5 = super.X + 5;
        int var6 = super.Y + 31;
        int var8 = super.H - 25 - 10;
        if (this.topIndex != -1) {
            TopUIComponent top = (TopUIComponent) this.child.elementAt(this.topIndex);
            top.setBox(var5, var6, super.W - 10, 25);
            var6 += ((UIComponent) top).getH() - 3;
            var8 -= ((UIComponent) top).getH() - 3;
        }

        if (this.bottomIndex != -1) {
            BottomUIComponent var10;
            (var10 = (BottomUIComponent) this.child.elementAt(this.bottomIndex)).setBox(super.X + 5, super.Y + super.H - 30, super.W - 10, 26);
            var8 -= ((UIComponent) var10).getH();
        }

        if (this.listIndex != -1 && this.FwbIndex != -1) {
            GunDongListUIComponent var12;
            (var12 = (GunDongListUIComponent) this.child.elementAt(this.listIndex)).setBox(var5, var6, super.W - 10, (var8 << 2) / 7);
            var12.a(this.topIndex != -1);
            var6 += (var8 << 2) / 7;
            var8 -= ((UIComponent) var12).getH();
            FWBUIComponent var13;
            (var13 = (FWBUIComponent) this.child.elementAt(this.FwbIndex)).setBox(var5, var6, super.W - 10, var8);
            var13.a(this.topIndex != -1);
        } else if (this.listIndex != -1 || this.FwbIndex != -1) {
            UIComponent var11;
            (var11 = (UIComponent) this.child.elementAt(Math.max(this.listIndex, this.FwbIndex))).setBox(var5, var6, super.W - 10, var8);
            if (this.listIndex != -1) {
                ((GunDongListUIComponent) var11).a(this.topIndex != -1);
            } else {
                ((FWBUIComponent) var11).a(this.topIndex != -1);
            }
        }

        for (int var14 = 0; var14 < this.child.size(); ++var14) {
            ((UIComponent) this.child.elementAt(var14)).refresh();
        }

    }

    public void onAction(int action) {
        for (int var3 = 0; var3 < this.child.size(); ++var3) {
            ((UIComponent) this.child.elementAt(var3)).onAction(action);
        }

    }

    public int touchAction(int var1, int var2) {
        if (var1 > super.X + super.W - 30 && var1 < super.X + super.W - 5 && var2 > super.Y && var2 < super.Y + 30) {
            return 536870912;
        } else {
            int var3 = 0;

            for (int var4 = 0; var4 < this.child.size(); ++var4) {
                if ((var3 = ((UIComponent) this.child.elementAt(var4)).touchAction(var1, var2)) != 0) {
                    return var3;
                }
            }

            return 0;
        }
    }

    public void draw(Graphics graphics) {
        graphics.setClip(super.X, super.Y, super.W, super.H);
        if (this.needBackground) {
            graphics.setColor(2780801);
            graphics.fillRect(super.X, super.Y, super.W, super.H);
        }

        int var2 = super.W / backImage.b + (super.W % backImage.b != 0 ? 1 : 0);
        graphics.setClip(super.X, super.Y + 5, super.W, backImage.c);

        for (int var3 = 0; var3 < var2; ++var3) {
            graphics.drawImage(backImage.pngImage, super.X + var3 * backImage.b, super.Y + 5, 20);
        }

        graphics.setClip(super.X, super.Y, super.W, super.H);
        graphics.drawImage(closeButton.pngImage, super.X + super.W - closeButton.b - 5, super.Y + 6, 20);
        if (this.title != null) {
            LoadingPage.drawString(graphics, (String) this.title, (int) this.titleX, this.titleY + (backImage.c - GlobalConfig.font2_h) / 2, 0, 16776917, 0);
        }

        graphics.setColor(11267556);
        graphics.drawLine(super.X, super.Y + 6 + backImage.c, super.X + super.W - 1, super.Y + 6 + backImage.c);

        for (int var4 = 0; var4 < this.child.size(); ++var4) {
            ((UIComponent) this.child.elementAt(var4)).draw(graphics);
        }

        graphics.setClip(super.X, super.Y, super.W, super.H);

        for (int var5 = 0; var5 < this.bianKuangColor.length; ++var5) {
            graphics.setColor(this.bianKuangColor[var5]);
            graphics.drawRect(super.X + var5, super.Y + var5, super.W - var5 * 2 - 1, super.H - var5 * 2 - 1);
        }

        graphics.drawImage(zhuangShi1.pngImage, super.X, super.Y, 20);
        graphics.drawImage(zhuangShi2.pngImage, super.X, super.Y + super.H - zhuangShi2.c, 20);
        graphics.drawImage(zhuangShi3.pngImage, super.X + super.W - zhuangShi3.b, super.Y + super.H - zhuangShi3.c, 20);
    }
}
