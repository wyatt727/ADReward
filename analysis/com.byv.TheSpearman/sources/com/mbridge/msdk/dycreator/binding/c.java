package com.mbridge.msdk.dycreator.binding;

/* compiled from: ViewDataFactory.java */
/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private static volatile c f2652a;

    private c() {
    }

    public static c a() {
        if (f2652a == null) {
            synchronized (c.class) {
                if (f2652a == null) {
                    f2652a = new c();
                }
            }
        }
        return f2652a;
    }
}
