package com.unity3d.player;

/* loaded from: classes4.dex */
class S implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ U f4355a;

    S(U u) {
        this.f4355a = u;
    }

    @Override // java.lang.Runnable
    public void run() {
        U u = this.f4355a;
        M m = u.f;
        if (m != null) {
            u.f4357a.addViewToPlayer(m, true);
            U u2 = this.f4355a;
            u2.i = true;
            u2.f.requestFocus();
        }
    }
}
