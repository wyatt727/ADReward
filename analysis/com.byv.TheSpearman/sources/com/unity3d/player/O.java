package com.unity3d.player;

/* loaded from: classes4.dex */
class O implements K {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ P f4346a;

    O(P p) {
        this.f4346a = p;
    }

    public void a(int i) {
        this.f4346a.h.e.lock();
        U u = this.f4346a.h;
        u.g = i;
        if (i == 3 && u.i) {
            u.runOnUiThread(new N(this));
        }
        if (i != 0) {
            this.f4346a.h.d.release();
        }
        this.f4346a.h.e.unlock();
    }
}
