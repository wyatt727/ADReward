package com.applovin.impl;

/* loaded from: classes.dex */
final class aq {
    private static final long[] d = {128, 64, 32, 16, 8, 4, 2, 1};

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f277a = new byte[8];
    private int b;
    private int c;

    public void b() {
        this.b = 0;
        this.c = 0;
    }

    public static long a(byte[] bArr, int i, boolean z) {
        long j = bArr[0] & 255;
        if (z) {
            j &= ~d[i - 1];
        }
        for (int i2 = 1; i2 < i; i2++) {
            j = (j << 8) | (bArr[i2] & 255);
        }
        return j;
    }

    public int a() {
        return this.c;
    }

    public static int a(int i) {
        long j;
        int i2 = 0;
        do {
            long[] jArr = d;
            if (i2 >= jArr.length) {
                return -1;
            }
            j = jArr[i2] & i;
            i2++;
        } while (j == 0);
        return i2;
    }

    public long a(j8 j8Var, boolean z, boolean z2, int i) {
        if (this.b == 0) {
            if (!j8Var.a(this.f277a, 0, 1, z)) {
                return -1L;
            }
            int iA = a(this.f277a[0] & 255);
            this.c = iA;
            if (iA != -1) {
                this.b = 1;
            } else {
                throw new IllegalStateException("No valid varint length mask found");
            }
        }
        int i2 = this.c;
        if (i2 > i) {
            this.b = 0;
            return -2L;
        }
        if (i2 != 1) {
            j8Var.d(this.f277a, 1, i2 - 1);
        }
        this.b = 0;
        return a(this.f277a, this.c, z2);
    }
}
