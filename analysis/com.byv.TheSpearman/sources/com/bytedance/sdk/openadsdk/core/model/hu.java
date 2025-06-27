package com.bytedance.sdk.openadsdk.core.model;

/* compiled from: LoadingInfo.java */
/* loaded from: classes2.dex */
public class hu {
    private long EYQ = 10000;
    private long mZx = 10000;
    private String Td = "";

    public long EYQ() {
        return this.EYQ;
    }

    public void EYQ(long j) {
        if (j <= 0) {
            this.EYQ = 10L;
        } else {
            this.EYQ = j;
        }
    }

    public long mZx() {
        return this.mZx;
    }

    public void mZx(long j) {
        if (j < 0) {
            this.mZx = 20L;
        } else {
            this.mZx = j;
        }
    }

    public String Td() {
        return this.Td;
    }

    public void EYQ(String str) {
        this.Td = str;
    }
}
