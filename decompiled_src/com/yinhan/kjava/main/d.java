/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.ChoiceGroup
 *  javax.microedition.lcdui.Item
 *  javax.microedition.lcdui.ItemStateListener
 */
package com.yinhan.kjava.main;

import com.yinhan.kjava.main.a;
import javax.microedition.lcdui.ChoiceGroup;
import javax.microedition.lcdui.Item;
import javax.microedition.lcdui.ItemStateListener;

final class d
implements ItemStateListener {
    private final a a;

    d(a a2) {
        this.a = a2;
    }

    public final void itemStateChanged(Item item) {
        if (item.equals(com.yinhan.kjava.main.a.a(this.a))) {
            int n2 = ((ChoiceGroup)item).getSelectedIndex();
            com.yinhan.kjava.main.a.a(this.a, com.yinhan.kjava.main.a.a(this.a, n2));
            this.a.aD.setTitle(n2 == 1 ? "\u767b\u5f55\u5f53\u4e50\u901a\u884c\u8bc1" : "\u767b\u5f55\u4e00\u54e5\u54e5\u901a\u884c\u8bc1");
            this.a.aD.delete(1);
            this.a.aD.insert(1, (Item)com.yinhan.kjava.main.a.b(this.a));
        }
    }
}

