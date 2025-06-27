package com.iab.omid.library.corpmailru.b;

import android.content.Context;

/* loaded from: classes4.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private static d f1524a = new d();
    private Context b;

    private d() {
    }

    public static d a() {
        return f1524a;
    }

    public void a(Context context) {
        this.b = context != null ? context.getApplicationContext() : null;
    }

    public Context b() {
        return this.b;
    }
}
