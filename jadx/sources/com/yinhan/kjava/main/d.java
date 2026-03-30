package com.yinhan.kjava.main;

import javax.microedition.lcdui.ChoiceGroup;
import javax.microedition.lcdui.Item;
import javax.microedition.lcdui.ItemStateListener;

/* loaded from: /var/folders/v7/k_cf95q978x1_d3dh120r_f40000gn/T/jadx-8105993946875401281/classes.dex */
final class d implements ItemStateListener {
    private final a a;

    d(a aVar) {
        this.a = aVar;
    }

    public final void itemStateChanged(Item item) {
        if (item.equals(a.a(this.a))) {
            int selectedIndex = ((ChoiceGroup) item).getSelectedIndex();
            a.a(this.a, a.a(this.a, selectedIndex));
            this.a.aD.setTitle(selectedIndex == 1 ? "登录当乐通行证" : "登录一哥哥通行证");
            this.a.aD.delete(1);
            this.a.aD.insert(1, a.b(this.a));
        }
    }
}
