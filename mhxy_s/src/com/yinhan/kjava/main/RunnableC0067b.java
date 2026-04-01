package com.yinhan.kjava.main;

/* renamed from: com.yinhan.kjava.main.b */
/* loaded from: /var/folders/v7/k_cf95q978x1_d3dh120r_f40000gn/T/jadx-4234804660425969496/classes.dex */
final class RunnableC0067b implements Runnable {

    /* renamed from: a */
    private byte f2223a;

    /* renamed from: b */
    private final RunnableC0066a f2224b;

    public RunnableC0067b(RunnableC0066a runnableC0066a, byte b) {
        this.f2224b = runnableC0066a;
        this.f2223a = b;
        new Thread(this).start();
    }

     // java.lang.Runnable
    public final void run() throws Throwable {
        if (this.f2223a != RunnableC0066a.f2088aB) {
            RunnableC0066a.m1407c(this.f2224b);
            return;
        }
        while (true) {
            if (this.f2224b.f2216j != 1 && !this.f2224b.f2221p) {
                return;
            }
            try {
                this.f2224b.m1439b();
                Thread.sleep(30L);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
