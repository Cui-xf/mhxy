package com.yinhan.kjava.main;

/* loaded from: java版梦回西游3区251011.jar:com/yinhan/kjava/main/b.class */
final class b implements Runnable {
    private byte a;
    private final a b;

    public b(a aVar, byte b) {
        this.b = aVar;
        this.a = b;
        new Thread(this).start();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Throwable] */
    @Override // java.lang.Runnable
    public final void run() throws InterruptedException {
        if (this.a != a.aB) {
            a.c(this.b);
            return;
        }
        while (true) {
            short s = this.b.j;
            ?? r0 = s;
            if (s != 1) {
                boolean z = this.b.p;
                r0 = z;
                if (!z) {
                    return;
                }
            }
            try {
                this.b.b();
                r0 = 30;
                Thread.sleep(30L);
            } catch (Exception e) {
                r0.printStackTrace();
            }
        }
    }
}
