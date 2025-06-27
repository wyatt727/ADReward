package com.applovin.impl;

import com.applovin.impl.l0;

/* loaded from: classes.dex */
public class dm extends xl {
    private final a h;

    public interface a {
        void a(l0.a aVar);
    }

    public dm(com.applovin.impl.sdk.k kVar, a aVar) {
        super("TaskCollectAdvertisingId", kVar, true);
        this.h = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        l0.a aVarF;
        if (this.f1179a.y() != null) {
            aVarF = this.f1179a.z().d();
        } else {
            aVarF = this.f1179a.x().f();
        }
        this.h.a(aVarF);
    }
}
