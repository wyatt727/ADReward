package com.mbridge.msdk.foundation.same.report;

/* compiled from: MBBatchReportManager.java */
/* loaded from: classes4.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private static volatile e f2929a;
    private final boolean b = false;

    private e() {
    }

    public static synchronized e a() {
        if (f2929a == null) {
            f2929a = new e();
        }
        return f2929a;
    }

    public final synchronized boolean b() {
        return false;
    }

    public final synchronized void a(String str) {
    }
}
