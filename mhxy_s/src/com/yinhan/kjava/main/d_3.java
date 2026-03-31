package com.yinhan.kjava.main;

import javax.microedition.lcdui.ChoiceGroup;
import javax.microedition.lcdui.Item;
import javax.microedition.lcdui.ItemStateListener;

final class d_3 implements ItemStateListener {
   private final MainCanvas a;

   d_3(MainCanvas var1) {
      this.a = var1;
   }

   public final void itemStateChanged(Item var1) {
      if (var1.equals(MainCanvas.a(this.a))) {
         int var2 = ((ChoiceGroup)var1).getSelectedIndex();
         MainCanvas.a(this.a, MainCanvas.a(this.a, var2));
         this.a.aD.setTitle(var2 == 1 ? "登录当乐通行证" : "登录一哥哥通行证");
         this.a.aD.delete(1);
         this.a.aD.insert(1, MainCanvas.b(this.a));
      }

   }
}
