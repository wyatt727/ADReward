package com.mbridge.msdk.playercommon.exoplayer2.util;

import java.util.Arrays;

/* loaded from: classes4.dex */
public final class LongArray {
    private static final int DEFAULT_INITIAL_CAPACITY = 32;
    private int size;
    private long[] values;

    public LongArray() {
        this(32);
    }

    public LongArray(int i) {
        this.values = new long[i];
    }

    public final void add(long j) {
        int i = this.size;
        long[] jArr = this.values;
        if (i == jArr.length) {
            this.values = Arrays.copyOf(jArr, i * 2);
        }
        long[] jArr2 = this.values;
        int i2 = this.size;
        this.size = i2 + 1;
        jArr2[i2] = j;
    }

    public final long get(int i) {
        if (i < 0 || i >= this.size) {
            throw new IndexOutOfBoundsException("Invalid index " + i + ", size is " + this.size);
        }
        return this.values[i];
    }

    public final int size() {
        return this.size;
    }

    public final long[] toArray() {
        return Arrays.copyOf(this.values, this.size);
    }
}
