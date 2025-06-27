package com.applovin.impl;

import com.google.android.exoplayer2.DefaultLoadControl;

/* loaded from: classes.dex */
public class d6 implements gc {

    /* renamed from: a, reason: collision with root package name */
    private final p5 f352a;
    private final long b;
    private final long c;
    private final long d;
    private final long e;
    private final int f;
    private final boolean g;
    private final long h;
    private final boolean i;
    private int j;
    private boolean k;

    public d6() {
        this(new p5(true, 65536), 50000, 50000, 2500, 5000, -1, false, 0, false);
    }

    @Override // com.applovin.impl.gc
    public void f() {
        a(false);
    }

    @Override // com.applovin.impl.gc
    public void c() {
        a(true);
    }

    @Override // com.applovin.impl.gc
    public void e() {
        a(true);
    }

    @Override // com.applovin.impl.gc
    public n0 b() {
        return this.f352a;
    }

    @Override // com.applovin.impl.gc
    public long d() {
        return this.h;
    }

    private static void a(int i, int i2, String str, String str2) {
        a1.a(i >= i2, str + " cannot be less than " + str2);
    }

    protected d6(p5 p5Var, int i, int i2, int i3, int i4, int i5, boolean z, int i6, boolean z2) {
        a(i3, 0, "bufferForPlaybackMs", "0");
        a(i4, 0, "bufferForPlaybackAfterRebufferMs", "0");
        a(i, i3, "minBufferMs", "bufferForPlaybackMs");
        a(i, i4, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        a(i2, i, "maxBufferMs", "minBufferMs");
        a(i6, 0, "backBufferDurationMs", "0");
        this.f352a = p5Var;
        this.b = r2.a(i);
        this.c = r2.a(i2);
        this.d = r2.a(i3);
        this.e = r2.a(i4);
        this.f = i5;
        this.j = i5 == -1 ? 13107200 : i5;
        this.g = z;
        this.h = r2.a(i6);
        this.i = z2;
    }

    protected int a(li[] liVarArr, f8[] f8VarArr) {
        int iA = 0;
        for (int i = 0; i < liVarArr.length; i++) {
            if (f8VarArr[i] != null) {
                iA += a(liVarArr[i].e());
            }
        }
        return Math.max(13107200, iA);
    }

    private static int a(int i) {
        switch (i) {
            case -2:
                return 0;
            case -1:
            default:
                throw new IllegalArgumentException();
            case 0:
                return DefaultLoadControl.DEFAULT_MUXED_BUFFER_SIZE;
            case 1:
                return 13107200;
            case 2:
                return DefaultLoadControl.DEFAULT_VIDEO_BUFFER_SIZE;
            case 3:
            case 4:
            case 5:
            case 6:
                return 131072;
        }
    }

    @Override // com.applovin.impl.gc
    public void a(li[] liVarArr, qo qoVar, f8[] f8VarArr) {
        int iA = this.f;
        if (iA == -1) {
            iA = a(liVarArr, f8VarArr);
        }
        this.j = iA;
        this.f352a.a(iA);
    }

    private void a(boolean z) {
        int i = this.f;
        if (i == -1) {
            i = 13107200;
        }
        this.j = i;
        this.k = false;
        if (z) {
            this.f352a.e();
        }
    }

    @Override // com.applovin.impl.gc
    public boolean a() {
        return this.i;
    }

    @Override // com.applovin.impl.gc
    public boolean a(long j, long j2, float f) {
        boolean z = true;
        boolean z2 = this.f352a.d() >= this.j;
        long jMin = this.b;
        if (f > 1.0f) {
            jMin = Math.min(yp.a(jMin, f), this.c);
        }
        if (j2 < Math.max(jMin, 500000L)) {
            if (!this.g && z2) {
                z = false;
            }
            this.k = z;
            if (!z && j2 < 500000) {
                kc.d("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j2 >= this.c || z2) {
            this.k = false;
        }
        return this.k;
    }

    @Override // com.applovin.impl.gc
    public boolean a(long j, float f, boolean z, long j2) {
        long jB = yp.b(j, f);
        long jMin = z ? this.e : this.d;
        if (j2 != -9223372036854775807L) {
            jMin = Math.min(j2 / 2, jMin);
        }
        return jMin <= 0 || jB >= jMin || (!this.g && this.f352a.d() >= this.j);
    }
}
