package com.bytedance.sdk.component.Kbd.EYQ.Pm.mZx;

/* compiled from: PolicyConfig.java */
/* loaded from: classes2.dex */
public class EYQ {
    private int EYQ;
    private int mZx;

    public int EYQ() {
        return this.EYQ;
    }

    public int mZx() {
        return this.mZx;
    }

    EYQ(int i, int i2, long j) {
        if (i2 < i) {
            throw new IllegalStateException("atMostBatchSendCount should meet a condition (atMostBatchSendCount >= maxCacheCount)");
        }
        this.EYQ = i;
        this.mZx = i2;
    }

    public static EYQ Td() {
        return new EYQ(1, 100, 172800000L);
    }

    public static EYQ Pm() {
        return new EYQ(1, 100, -1L);
    }

    public static EYQ Kbd() {
        return new EYQ(3, 100, 172800000L);
    }
}
