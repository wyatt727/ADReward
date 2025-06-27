package com.apm.insight.runtime;

import android.os.Handler;
import android.os.HandlerThread;

/* loaded from: classes.dex */
public class p {

    /* renamed from: a, reason: collision with root package name */
    private static volatile u f148a;
    private static volatile Handler b;

    public static HandlerThread a() {
        if (f148a == null) {
            synchronized (p.class) {
                if (f148a == null) {
                    f148a = new u("default_npth_thread");
                    f148a.b();
                }
            }
        }
        return f148a.c();
    }

    public static u b() {
        if (f148a == null) {
            a();
        }
        return f148a;
    }
}
