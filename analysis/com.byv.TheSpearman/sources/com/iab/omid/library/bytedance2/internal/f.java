package com.iab.omid.library.bytedance2.internal;

import android.content.Context;

/* loaded from: classes4.dex */
public class f {
    private static f b = new f();

    /* renamed from: a, reason: collision with root package name */
    private Context f1493a;

    private f() {
    }

    public static f b() {
        return b;
    }

    public Context a() {
        return this.f1493a;
    }

    public void a(Context context) {
        this.f1493a = context != null ? context.getApplicationContext() : null;
    }
}
