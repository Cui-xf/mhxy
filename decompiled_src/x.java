/*
 * Decompiled with CFR 0.152.
 */
final class x
implements Runnable {
    private boolean a;
    private final av b;

    public x(av av2) {
        this.b = av2;
        this.a = true;
        new Thread(this).start();
    }

    public final void a() {
        this.a = false;
    }

    public final void run() {
        while (this.a) {
            if (this.b.g != null) {
                this.b.g.b();
            }
            av.a(15);
        }
    }
}

