package com.bytedance.adsdk.lottie.Td.mZx;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: ShapePath.java */
/* loaded from: classes2.dex */
public class UB implements Td {
    private final String EYQ;
    private final boolean Pm;
    private final com.bytedance.adsdk.lottie.Td.EYQ.QQ Td;
    private final int mZx;

    public UB(String str, int i, com.bytedance.adsdk.lottie.Td.EYQ.QQ qq, boolean z) {
        this.EYQ = str;
        this.mZx = i;
        this.Td = qq;
        this.Pm = z;
    }

    public String EYQ() {
        return this.EYQ;
    }

    public com.bytedance.adsdk.lottie.Td.EYQ.QQ mZx() {
        return this.Td;
    }

    @Override // com.bytedance.adsdk.lottie.Td.mZx.Td
    public com.bytedance.adsdk.lottie.EYQ.EYQ.Td EYQ(com.bytedance.adsdk.lottie.QQ qq, com.bytedance.adsdk.lottie.IPb iPb, com.bytedance.adsdk.lottie.Td.Td.EYQ eyq) {
        return new com.bytedance.adsdk.lottie.EYQ.EYQ.Uc(qq, eyq, this);
    }

    public boolean Td() {
        return this.Pm;
    }

    public String toString() {
        return "ShapePath{name=" + this.EYQ + ", index=" + this.mZx + AbstractJsonLexerKt.END_OBJ;
    }
}
