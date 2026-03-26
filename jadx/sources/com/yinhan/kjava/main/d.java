package com.yinhan.kjava.main;

import javax.microedition.lcdui.ChoiceGroup;
import javax.microedition.lcdui.Item;
import javax.microedition.lcdui.ItemStateListener;

/* loaded from: java版梦回西游3区251011.jar:com/yinhan/kjava/main/d.class */
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
