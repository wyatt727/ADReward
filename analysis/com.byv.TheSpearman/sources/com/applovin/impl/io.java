package com.applovin.impl;

import com.google.android.exoplayer2.util.TimestampAdjuster;

/* loaded from: classes.dex */
public final class io {

    /* renamed from: a, reason: collision with root package name */
    private long f541a;
    private long b;
    private long c;
    private final ThreadLocal d = new ThreadLocal();

    public synchronized long a(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        if (this.b == -9223372036854775807L) {
            long jLongValue = this.f541a;
            if (jLongValue == TimestampAdjuster.MODE_SHARED) {
                jLongValue = ((Long) a1.a((Long) this.d.get())).longValue();
            }
            this.b = jLongValue - j;
            notifyAll();
        }
        this.c = j;
        return j + this.b;
    }

    public synchronized long b(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j2 = this.c;
        if (j2 != -9223372036854775807L) {
            long jE = e(j2);
            long j3 = (4294967296L + jE) / 8589934592L;
            long j4 = ((j3 - 1) * 8589934592L) + j;
            j += j3 * 8589934592L;
            if (Math.abs(j4 - jE) < Math.abs(j - jE)) {
                j = j4;
            }
        }
        return a(c(j));
    }

    public io(long j) {
        d(j);
    }

    public synchronized long c() {
        return this.b;
    }

    public synchronized void d(long j) {
        this.f541a = j;
        this.b = j == Long.MAX_VALUE ? 0L : -9223372036854775807L;
        this.c = -9223372036854775807L;
    }

    public static long e(long j) {
        return (j * 90000) / 1000000;
    }

    public synchronized long b() {
        long jA;
        long j = this.c;
        if (j != -9223372036854775807L) {
            jA = j + this.b;
        } else {
            jA = a();
        }
        return jA;
    }

    public synchronized long a() {
        long j;
        j = this.f541a;
        if (j == Long.MAX_VALUE || j == TimestampAdjuster.MODE_SHARED) {
            j = -9223372036854775807L;
        }
        return j;
    }

    public static long c(long j) {
        return (j * 1000000) / 90000;
    }
}
