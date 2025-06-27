package com.bytedance.sdk.component.widget.EYQ;

/* compiled from: BaseAdapterInstance.java */
/* loaded from: classes2.dex */
public class EYQ {
    private static volatile EYQ mZx;
    private volatile mZx EYQ;

    private EYQ() {
    }

    public static EYQ EYQ() {
        if (mZx == null) {
            synchronized (EYQ.class) {
                if (mZx == null) {
                    mZx = new EYQ();
                }
            }
        }
        return mZx;
    }

    public void EYQ(mZx mzx) {
        this.EYQ = mzx;
    }

    public mZx mZx() {
        return this.EYQ;
    }
}
