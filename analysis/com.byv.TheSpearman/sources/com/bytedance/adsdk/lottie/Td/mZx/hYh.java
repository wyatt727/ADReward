package com.bytedance.adsdk.lottie.Td.mZx;

import com.bytedance.adsdk.lottie.EYQ.EYQ.WU;

/* compiled from: ShapeTrimPath.java */
/* loaded from: classes2.dex */
public class hYh implements Td {
    private final String EYQ;
    private final boolean IPb;
    private final com.bytedance.adsdk.lottie.Td.EYQ.mZx Kbd;
    private final com.bytedance.adsdk.lottie.Td.EYQ.mZx Pm;
    private final com.bytedance.adsdk.lottie.Td.EYQ.mZx Td;
    private final EYQ mZx;

    /* compiled from: ShapeTrimPath.java */
    public enum EYQ {
        SIMULTANEOUSLY,
        INDIVIDUALLY;

        public static EYQ EYQ(int i) {
            if (i == 1) {
                return SIMULTANEOUSLY;
            }
            if (i == 2) {
                return INDIVIDUALLY;
            }
            throw new IllegalArgumentException("Unknown trim path type ".concat(String.valueOf(i)));
        }
    }

    public hYh(String str, EYQ eyq, com.bytedance.adsdk.lottie.Td.EYQ.mZx mzx, com.bytedance.adsdk.lottie.Td.EYQ.mZx mzx2, com.bytedance.adsdk.lottie.Td.EYQ.mZx mzx3, boolean z) {
        this.EYQ = str;
        this.mZx = eyq;
        this.Td = mzx;
        this.Pm = mzx2;
        this.Kbd = mzx3;
        this.IPb = z;
    }

    public String EYQ() {
        return this.EYQ;
    }

    public EYQ mZx() {
        return this.mZx;
    }

    public com.bytedance.adsdk.lottie.Td.EYQ.mZx Td() {
        return this.Pm;
    }

    public com.bytedance.adsdk.lottie.Td.EYQ.mZx Pm() {
        return this.Td;
    }

    public com.bytedance.adsdk.lottie.Td.EYQ.mZx Kbd() {
        return this.Kbd;
    }

    public boolean IPb() {
        return this.IPb;
    }

    @Override // com.bytedance.adsdk.lottie.Td.mZx.Td
    public com.bytedance.adsdk.lottie.EYQ.EYQ.Td EYQ(com.bytedance.adsdk.lottie.QQ qq, com.bytedance.adsdk.lottie.IPb iPb, com.bytedance.adsdk.lottie.Td.Td.EYQ eyq) {
        return new WU(eyq, this);
    }

    public String toString() {
        return "Trim Path: {start: " + this.Td + ", end: " + this.Pm + ", offset: " + this.Kbd + "}";
    }
}
