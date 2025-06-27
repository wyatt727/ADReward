package com.bytedance.adsdk.lottie;

import java.util.Arrays;

/* compiled from: LottieResult.java */
/* loaded from: classes2.dex */
public final class MxO<V> {
    private final V EYQ;
    private final Throwable mZx;

    public MxO(V v) {
        this.EYQ = v;
        this.mZx = null;
    }

    public MxO(Throwable th) {
        this.mZx = th;
        this.EYQ = null;
    }

    public V EYQ() {
        return this.EYQ;
    }

    public Throwable mZx() {
        return this.mZx;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MxO)) {
            return false;
        }
        MxO mxO = (MxO) obj;
        if (EYQ() != null && EYQ().equals(mxO.EYQ())) {
            return true;
        }
        if (mZx() == null || mxO.mZx() == null) {
            return false;
        }
        return mZx().toString().equals(mZx().toString());
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{EYQ(), mZx()});
    }
}
