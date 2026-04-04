package com.cc;

// 抽象 UI 组件基类：统一约束“按键/指令处理、触摸命中检测、状态清理”三类能力。
public abstract class BaseUi {
   // 处理来自方向键、功能键或触摸映射后的指令码。
   public abstract void onClick(int var1);

   // 命中检测：命中后返回业务侧约定的指令码，未命中返回 0。
   public abstract int hintCheck(int var1, int var2);

   // 清理组件内部状态与引用，供窗口切换或内容重建时复用。
   public abstract void clear();
}
