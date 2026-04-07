package com.cc;

import com.cc.resource.Animation;

import java.util.Vector;

/**
 * 场景实体基类：持有所属路径节点(au)、显示名称(e)、动画帧(Frame1)、朝向(h)及屏幕坐标(j/k/l/m)，
 * 提供像素坐标计算辅助方法，由 {@link bl} 等具体实体继承。
 */
public abstract class SceneEntity {
   public au d;
   public String name;
   public Vector f = new Vector();
   public Animation frame1;
   public byte h = 3;
   short[] i;
   public short j = -1;
   public short k = -1;
   public short l = -1;
   public short m = -1;

   public final short m() {
      return (short)(this.k + 16);
   }

   public final short n() {
      return this.frame1 == null ? 0 : (short)(this.k - (this.frame1.h() - 16));
   }

   public final short o() {
      return this.frame1 == null ? 0 : (short)(this.j + 8 - this.frame1.g() / 2);
   }

   public final short p() {
      return this.frame1 == null ? 0 : this.frame1.g();
   }

   public final short q() {
      return this.frame1 == null ? 0 : this.frame1.h();
   }

   public final void r() {
      if (this.d != null) {
         this.d.e.addElement(new short[]{this.j, this.k});
      }

   }
}
