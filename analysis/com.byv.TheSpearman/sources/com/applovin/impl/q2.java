package com.applovin.impl;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
final class q2 {

    /* renamed from: a, reason: collision with root package name */
    private long f812a;
    private long b;
    private boolean c;

    q2() {
    }

    private long a(long j) {
        return this.f812a + Math.max(0L, ((this.b - 529) * 1000000) / j);
    }

    public long a(d9 d9Var) {
        return a(d9Var.A);
    }

    public void a() {
        this.f812a = 0L;
        this.b = 0L;
        this.c = false;
    }

    public long a(d9 d9Var, n5 n5Var) {
        if (this.b == 0) {
            this.f812a = n5Var.f;
        }
        if (this.c) {
            return n5Var.f;
        }
        ByteBuffer byteBuffer = (ByteBuffer) a1.a(n5Var.c);
        int i = 0;
        for (int i2 = 0; i2 < 4; i2++) {
            i = (i << 8) | (byteBuffer.get(i2) & 255);
        }
        int iD = of.d(i);
        if (iD == -1) {
            this.c = true;
            this.b = 0L;
            this.f812a = n5Var.f;
            kc.d("C2Mp3TimestampTracker", "MPEG audio header is invalid.");
            return n5Var.f;
        }
        long jA = a(d9Var.A);
        this.b += iD;
        return jA;
    }
}
