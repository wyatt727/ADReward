package com.apm.insight.b;

import android.content.Context;

/* loaded from: classes.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    private static volatile g f20a;
    private static h c;
    private final b b;

    private g(Context context) {
        this.b = new b(context);
        h hVar = new h(0);
        c = hVar;
        hVar.b();
    }

    public static g a(Context context) {
        if (f20a == null) {
            synchronized (g.class) {
                if (f20a == null) {
                    f20a = new g(context);
                }
            }
        }
        return f20a;
    }

    public static h b() {
        return c;
    }

    public b a() {
        return this.b;
    }

    public void c() {
        this.b.a();
    }

    public void d() {
        this.b.b();
    }
}
