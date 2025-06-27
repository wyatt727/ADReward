package com.bytedance.adsdk.lottie.Td.mZx;

import android.graphics.Path;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: ShapeFill.java */
/* loaded from: classes2.dex */
public class KO implements Td {
    private final boolean EYQ;
    private final boolean IPb;
    private final com.bytedance.adsdk.lottie.Td.EYQ.Pm Kbd;
    private final com.bytedance.adsdk.lottie.Td.EYQ.EYQ Pm;
    private final String Td;
    private final Path.FillType mZx;

    public KO(String str, boolean z, Path.FillType fillType, com.bytedance.adsdk.lottie.Td.EYQ.EYQ eyq, com.bytedance.adsdk.lottie.Td.EYQ.Pm pm, boolean z2) {
        this.Td = str;
        this.EYQ = z;
        this.mZx = fillType;
        this.Pm = eyq;
        this.Kbd = pm;
        this.IPb = z2;
    }

    public String EYQ() {
        return this.Td;
    }

    public com.bytedance.adsdk.lottie.Td.EYQ.EYQ mZx() {
        return this.Pm;
    }

    public com.bytedance.adsdk.lottie.Td.EYQ.Pm Td() {
        return this.Kbd;
    }

    public Path.FillType Pm() {
        return this.mZx;
    }

    public boolean Kbd() {
        return this.IPb;
    }

    @Override // com.bytedance.adsdk.lottie.Td.mZx.Td
    public com.bytedance.adsdk.lottie.EYQ.EYQ.Td EYQ(com.bytedance.adsdk.lottie.QQ qq, com.bytedance.adsdk.lottie.IPb iPb, com.bytedance.adsdk.lottie.Td.Td.EYQ eyq) {
        return new com.bytedance.adsdk.lottie.EYQ.EYQ.VwS(qq, eyq, this);
    }

    public String toString() {
        return "ShapeFill{color=, fillEnabled=" + this.EYQ + AbstractJsonLexerKt.END_OBJ;
    }
}
