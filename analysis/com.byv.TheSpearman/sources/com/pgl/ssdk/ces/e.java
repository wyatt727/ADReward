package com.pgl.ssdk.ces;

import com.pgl.ssdk.G;
import com.pgl.ssdk.H;

/* loaded from: classes4.dex */
class e implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ f f4308a;

    e(f fVar) {
        this.f4308a = fVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        H.a(this.f4308a.f4309a).a();
        G.a(this.f4308a.f4309a).a();
    }
}
