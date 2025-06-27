package com.bytedance.sdk.openadsdk.utils;

import android.os.SystemClock;

/* compiled from: TimeStamp.java */
/* loaded from: classes2.dex */
public class Nvm {
    public long EYQ;
    private long mZx;

    private Nvm(boolean z) {
        if (z) {
            Pm();
        }
    }

    public static Nvm EYQ() {
        return new Nvm(true);
    }

    public static Nvm mZx() {
        return new Nvm(false);
    }

    public long Td() {
        return SystemClock.elapsedRealtime() - this.mZx;
    }

    public long EYQ(Nvm nvm) {
        return Math.abs(nvm.mZx - this.mZx);
    }

    public void Pm() {
        this.EYQ = System.currentTimeMillis();
        this.mZx = SystemClock.elapsedRealtime();
    }

    public boolean Kbd() {
        return this.mZx > 0;
    }

    public String toString() {
        return String.valueOf(this.EYQ);
    }
}
