package com.unity3d.player;

/* loaded from: classes4.dex */
class T implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ U f4356a;

    T(U u) {
        this.f4356a = u;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f4356a.a();
        this.f4356a.f4357a.resume();
    }
}
