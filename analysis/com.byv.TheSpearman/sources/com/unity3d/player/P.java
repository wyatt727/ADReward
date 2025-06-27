package com.unity3d.player;

/* loaded from: classes4.dex */
class P implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f4348a;
    final /* synthetic */ int b;
    final /* synthetic */ int c;
    final /* synthetic */ int d;
    final /* synthetic */ boolean e;
    final /* synthetic */ long f;
    final /* synthetic */ long g;
    final /* synthetic */ U h;

    P(U u, String str, int i, int i2, int i3, boolean z, long j, long j2) {
        this.h = u;
        this.f4348a = str;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = z;
        this.f = j;
        this.g = j2;
    }

    @Override // java.lang.Runnable
    public void run() {
        U u = this.h;
        if (u.f != null) {
            AbstractC1536u.Log(5, "Video already playing");
            U u2 = this.h;
            u2.g = 2;
            u2.d.release();
            return;
        }
        u.f = new M(this.h.b, this.f4348a, this.b, this.c, this.d, this.e, this.f, this.g, new O(this));
        U u3 = this.h;
        M m = u3.f;
        if (m != null) {
            u3.f4357a.addView(m);
        }
    }
}
