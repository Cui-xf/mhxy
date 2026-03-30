package defpackage;

/* loaded from: /var/folders/v7/k_cf95q978x1_d3dh120r_f40000gn/T/jadx-8105993946875401281/classes.dex */
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
