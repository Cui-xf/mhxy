package defpackage;

/* loaded from: java版梦回西游3区251011.jar:x.class */
final class x implements Runnable {
    private boolean a = true;
    private final av b;

    public x(av avVar) {
        this.b = avVar;
        new Thread(this).start();
    }

    public final void a() {
        this.a = false;
    }

    @Override // java.lang.Runnable
    public final void run() throws InterruptedException {
        while (this.a) {
            if (this.b.g != null) {
                this.b.g.b();
            }
            av.a(15);
        }
    }
}
