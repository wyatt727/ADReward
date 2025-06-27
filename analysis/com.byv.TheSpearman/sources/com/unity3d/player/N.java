package com.unity3d.player;

/* loaded from: classes4.dex */
class N implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ O f4343a;

    N(O o) {
        this.f4343a = o;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f4343a.f4346a.h.a();
        this.f4343a.f4346a.h.f4357a.resume();
    }
}
