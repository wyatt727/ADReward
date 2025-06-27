package com.applovin.impl;

import com.applovin.exoplayer2.common.base.Preconditions;

/* loaded from: classes.dex */
public abstract class nc {
    public static int a(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static int a(long j, long j2) {
        if (j < j2) {
            return -1;
        }
        return j > j2 ? 1 : 0;
    }

    public static long a(long... jArr) {
        Preconditions.checkArgument(jArr.length > 0);
        long j = jArr[0];
        for (int i = 1; i < jArr.length; i++) {
            long j2 = jArr[i];
            if (j2 > j) {
                j = j2;
            }
        }
        return j;
    }
}
