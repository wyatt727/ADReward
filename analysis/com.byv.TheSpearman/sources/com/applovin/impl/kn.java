package com.applovin.impl;

/* loaded from: classes.dex */
public class kn extends xl {
    private final Runnable h;

    public kn(com.applovin.impl.sdk.k kVar, String str, Runnable runnable) {
        this(kVar, false, str, runnable);
    }

    @Override // java.lang.Runnable
    public void run() {
        this.h.run();
    }

    public kn(com.applovin.impl.sdk.k kVar, boolean z, String str, Runnable runnable) {
        super("TaskRunnable:" + str, kVar, z);
        this.h = runnable;
    }
}
