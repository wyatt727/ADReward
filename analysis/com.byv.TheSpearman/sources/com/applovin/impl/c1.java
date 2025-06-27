package com.applovin.impl;

import android.content.Context;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public abstract class c1 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    protected final com.applovin.impl.sdk.k f308a;
    protected final String b;
    protected final com.applovin.impl.sdk.t c;
    protected final AtomicBoolean e = new AtomicBoolean();
    private final Context d = com.applovin.impl.sdk.k.k();

    public Context a() {
        return this.d;
    }

    public c1(String str, com.applovin.impl.sdk.k kVar) {
        this.b = str;
        this.f308a = kVar;
        this.c = kVar.L();
    }

    public void a(boolean z) {
        this.e.set(z);
    }
}
