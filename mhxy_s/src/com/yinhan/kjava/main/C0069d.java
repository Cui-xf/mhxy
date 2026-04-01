package com.yinhan.kjava.main;

import javax.microedition.lcdui.ChoiceGroup;
import javax.microedition.lcdui.Item;
import javax.microedition.lcdui.ItemStateListener;

/* renamed from: com.yinhan.kjava.main.d */
/* loaded from: /var/folders/v7/k_cf95q978x1_d3dh120r_f40000gn/T/jadx-4234804660425969496/classes.dex */
final class C0069d implements ItemStateListener {

    /* renamed from: a */
    private final RunnableC0066a f2228a;

    C0069d(RunnableC0066a runnableC0066a) {
        this.f2228a = runnableC0066a;
    }

    public final void itemStateChanged(Item item) {
        if (item.equals(RunnableC0066a.m1392a(this.f2228a))) {
            int selectedIndex = ((ChoiceGroup) item).getSelectedIndex();
            RunnableC0066a.m1394a(this.f2228a, RunnableC0066a.m1393a(this.f2228a, selectedIndex));
            this.f2228a.f2129aD.setTitle(selectedIndex == 1 ? "登录当乐通行证" : "登录一哥哥通行证");
            this.f2228a.f2129aD.delete(1);
            this.f2228a.f2129aD.insert(1, RunnableC0066a.m1403b(this.f2228a));
        }
    }
}
