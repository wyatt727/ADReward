package com.iab.omid.library.mmadbridge.internal;

import android.content.Context;

/* loaded from: classes4.dex */
public class g {
    private static g b = new g();

    /* renamed from: a, reason: collision with root package name */
    private Context f1591a;

    private g() {
    }

    public static g b() {
        return b;
    }

    public Context a() {
        return this.f1591a;
    }

    public void a(Context context) {
        this.f1591a = context != null ? context.getApplicationContext() : null;
    }
}
