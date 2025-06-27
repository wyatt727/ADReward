package com.mbridge.msdk.foundation.same.net;

import android.net.TrafficStats;
import android.os.SystemClock;

/* compiled from: BandWideUtil.java */
/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static long f2861a;
    private static long b;
    private static long c;

    private a() {
    }

    public static a a() {
        return C0269a.f2862a;
    }

    public final synchronized void b() {
        if (c != 0 && b != 0) {
            long jElapsedRealtime = SystemClock.elapsedRealtime() - c;
            if (jElapsedRealtime != 0) {
                try {
                    if (TrafficStats.getTotalRxBytes() != -1) {
                        long totalRxBytes = ((TrafficStats.getTotalRxBytes() - b) * 1000) / jElapsedRealtime;
                        if (totalRxBytes == 0) {
                            f2861a = 1L;
                        } else {
                            f2861a = totalRxBytes;
                        }
                    } else {
                        f2861a = 0L;
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            c();
        }
    }

    public final synchronized void c() {
        b = 0L;
        c = 0L;
    }

    public final long d() {
        return f2861a;
    }

    public final synchronized void e() {
        if (c == 0) {
            c = SystemClock.elapsedRealtime();
            b = TrafficStats.getTotalRxBytes();
        }
    }

    /* compiled from: BandWideUtil.java */
    /* renamed from: com.mbridge.msdk.foundation.same.net.a$a, reason: collision with other inner class name */
    private static class C0269a {

        /* renamed from: a, reason: collision with root package name */
        private static a f2862a = new a();
    }
}
