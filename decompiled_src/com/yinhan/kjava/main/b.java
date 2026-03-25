/*
 * Decompiled with CFR 0.152.
 */
package com.yinhan.kjava.main;

import com.yinhan.kjava.main.a;

final class b
implements Runnable {
    private byte a;
    private final a b;

    public b(a a2, byte by2) {
        this.b = a2;
        this.a = by2;
        new Thread(this).start();
    }

    public final void run() {
        if (this.a == com.yinhan.kjava.main.a.aB) {
            while (this.b.j == 1 || this.b.p) {
                try {
                    this.b.b();
                    Thread.sleep(30L);
                }
                catch (Exception exception) {
                    Exception exception2 = exception;
                    exception.printStackTrace();
                }
            }
        } else {
            com.yinhan.kjava.main.a.c(this.b);
        }
    }
}

