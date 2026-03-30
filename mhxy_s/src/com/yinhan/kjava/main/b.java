package com.yinhan.kjava.main;

/* loaded from: /var/folders/v7/k_cf95q978x1_d3dh120r_f40000gn/T/jadx-8105993946875401281/classes.dex */
final class b implements Runnable {
    private byte a;
    private final a b;

    public b(a aVar, byte b) {
        this.b = aVar;
        this.a = b;
        new Thread(this).start();
    }

    @Override // java.lang.Runnable
    public final void run() throws InterruptedException {
        if (this.a != a.aB) {
            a.c(this.b);
            return;
        }
        while (true) {
            if (this.b.j != 1 && !this.b.p) {
                return;
            }
            try {
                this.b.b();
                Thread.sleep(30L);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
