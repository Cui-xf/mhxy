package com.cc;

import javax.microedition.lcdui.Graphics;

/**
 * 弹窗空占位组件。
 *
 * 所有方法均为空实现，不渲染任何内容，也不响应任何事件。
 * 作用是在弹窗容器（y_1）的顶部占据一块区域，
 * 供调用方在该区域内自行绘制自定义内容（如账号输入框、角色创建表单等）。
 * y_1 布局时会优先将 af 放在最顶部，其余组件排在其下方。
 */
//public final class af extends UIComponent {
public final class TopUIComponent extends UIComponent {
   public final void refresh() {
   }

   public final void onAction(int var1) {
   }

   public final void draw(Graphics graphics) {
   }

   public final int touchAction(int var1, int var2) {
      return 0;
   }

   public final void destroy() {
   }
}
