package com.bytedance.adsdk.lottie.Td.mZx;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: MergePaths.java */
/* loaded from: classes2.dex */
public class HX implements Td {
    private final String EYQ;
    private final boolean Td;
    private final EYQ mZx;

    /* compiled from: MergePaths.java */
    public enum EYQ {
        MERGE,
        ADD,
        SUBTRACT,
        INTERSECT,
        EXCLUDE_INTERSECTIONS;

        public static EYQ EYQ(int i) {
            if (i == 1) {
                return MERGE;
            }
            if (i == 2) {
                return ADD;
            }
            if (i == 3) {
                return SUBTRACT;
            }
            if (i == 4) {
                return INTERSECT;
            }
            if (i == 5) {
                return EXCLUDE_INTERSECTIONS;
            }
            return MERGE;
        }
    }

    public HX(String str, EYQ eyq, boolean z) {
        this.EYQ = str;
        this.mZx = eyq;
        this.Td = z;
    }

    public String EYQ() {
        return this.EYQ;
    }

    public EYQ mZx() {
        return this.mZx;
    }

    public boolean Td() {
        return this.Td;
    }

    @Override // com.bytedance.adsdk.lottie.Td.mZx.Td
    public com.bytedance.adsdk.lottie.EYQ.EYQ.Td EYQ(com.bytedance.adsdk.lottie.QQ qq, com.bytedance.adsdk.lottie.IPb iPb, com.bytedance.adsdk.lottie.Td.Td.EYQ eyq) {
        if (qq.EYQ()) {
            return new com.bytedance.adsdk.lottie.EYQ.EYQ.tsL(this);
        }
        return null;
    }

    public String toString() {
        return "MergePaths{mode=" + this.mZx + AbstractJsonLexerKt.END_OBJ;
    }
}
