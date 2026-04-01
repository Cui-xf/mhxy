package p000;

/* renamed from: x */
/* loaded from: /var/folders/v7/k_cf95q978x1_d3dh120r_f40000gn/T/jadx-4234804660425969496/classes.dex */
final class RunnableC0092x implements Runnable {

    /* renamed from: a */
    private boolean f2567a = true;

    /* renamed from: b */
    private final C0022av f2568b;

    public RunnableC0092x(C0022av c0022av) {
        this.f2568b = c0022av;
        new Thread(this).start();
    }

    /* renamed from: a */
    public final void m1710a() {
        this.f2567a = false;
    }

    @Override // java.lang.Runnable
    public final void run() throws InterruptedException {
        while (this.f2567a) {
            if (this.f2568b.f451g != null) {
                this.f2568b.f451g.m580b();
            }
            C0022av.m591a(15);
        }
    }
}
