package com.bytedance.adsdk.lottie.Td.mZx;

import android.graphics.PointF;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: RectangleShape.java */
/* loaded from: classes2.dex */
public class MxO implements Td {
    private final String EYQ;
    private final boolean Kbd;
    private final com.bytedance.adsdk.lottie.Td.EYQ.mZx Pm;
    private final com.bytedance.adsdk.lottie.Td.EYQ.pi<PointF, PointF> Td;
    private final com.bytedance.adsdk.lottie.Td.EYQ.pi<PointF, PointF> mZx;

    public MxO(String str, com.bytedance.adsdk.lottie.Td.EYQ.pi<PointF, PointF> piVar, com.bytedance.adsdk.lottie.Td.EYQ.pi<PointF, PointF> piVar2, com.bytedance.adsdk.lottie.Td.EYQ.mZx mzx, boolean z) {
        this.EYQ = str;
        this.mZx = piVar;
        this.Td = piVar2;
        this.Pm = mzx;
        this.Kbd = z;
    }

    public String EYQ() {
        return this.EYQ;
    }

    public com.bytedance.adsdk.lottie.Td.EYQ.mZx mZx() {
        return this.Pm;
    }

    public com.bytedance.adsdk.lottie.Td.EYQ.pi<PointF, PointF> Td() {
        return this.Td;
    }

    public com.bytedance.adsdk.lottie.Td.EYQ.pi<PointF, PointF> Pm() {
        return this.mZx;
    }

    public boolean Kbd() {
        return this.Kbd;
    }

    @Override // com.bytedance.adsdk.lottie.Td.mZx.Td
    public com.bytedance.adsdk.lottie.EYQ.EYQ.Td EYQ(com.bytedance.adsdk.lottie.QQ qq, com.bytedance.adsdk.lottie.IPb iPb, com.bytedance.adsdk.lottie.Td.Td.EYQ eyq) {
        return new com.bytedance.adsdk.lottie.EYQ.EYQ.KO(qq, eyq, this);
    }

    public String toString() {
        return "RectangleShape{position=" + this.mZx + ", size=" + this.Td + AbstractJsonLexerKt.END_OBJ;
    }
}
