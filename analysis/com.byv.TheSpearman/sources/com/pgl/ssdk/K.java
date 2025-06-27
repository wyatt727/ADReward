package com.pgl.ssdk;

/* loaded from: classes4.dex */
class K implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ L f4292a;

    K(L l) {
        this.f4292a = l;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f4292a.a() || this.f4292a.j >= this.f4292a.i) {
            return;
        }
        L.c(this.f4292a);
        X xB = W.a().b();
        if (xB != null) {
            xB.post(this);
        }
    }
}
