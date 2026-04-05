package com.cc;

import javax.microedition.lcdui.Graphics;

/**
 * UI 组件基类（弹窗面板系统）。
 *
 * 定义了所有弹窗子组件的公共接口：位置/尺寸、命中检测、布局刷新、渲染、销毁。
 *
 * 子类：
 *   y_1  — 弹窗容器（带标题栏、边框、关闭按钮，管理子组件的布局与渲染）
 *   af   — 空占位组件（用于在弹窗顶部撑开输入框等自定义区域）
 *   bi   — 多行文本滚动区（显示富文本内容，支持上下滚动）
 *   ay   — 列表选择区（可滚动的行列表，支持选中高亮）
 *   u    — 底部按钮栏（最多三个按钮：左/中/右，返回对应动作码）
 */
//public abstract class y_1 {
public abstract class UIComponent {
   /** 组件左边界 X 坐标 */
   protected int X;
   /** 组件顶边界 Y 坐标 */
   protected int Y;
   /** 组件宽度 */
   protected int W;
   /** 组件高度 */
   protected int H;

   /** 返回组件高度 */
   public final int getH() {
      return this.H;
   }

   /** 命中检测：点 (x, y) 是否在组件矩形范围内 */
   public final boolean inBox(int x, int y) {
      return x >= this.X && x <= this.X + this.W && y >= this.Y && y <= this.Y + this.H;
   }

   /** 设置组件的位置和尺寸（x, y, 宽, 高） */
   public final void setBox(int var1, int var2, int var3, int var4) {
      this.X = var1;
      this.Y = var2;
      this.W = var3;
      this.H = var4;
   }

   /** 布局刷新：根据当前尺寸重新计算内部排版（行高、可见行数、滚动条等） */
   public abstract void refresh();

   /** 销毁/清理：释放文本、数据引用 */
   public abstract void destroy();

   /** 处理按键/触摸动作（action 为动作码），更新滚动偏移或选中状态 */
   public abstract void onAction(int action);

   /** 触摸命中检测：返回该点对应的动作码（0=无响应） */
   public abstract int touchAction(int x, int y);

   /** 渲染组件到 Graphics */
   public abstract void draw(Graphics graphics);
}
