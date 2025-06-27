package com.bytedance.adsdk.lottie.Td.mZx;

import java.util.Arrays;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: ShapeGroup.java */
/* loaded from: classes2.dex */
public class hu implements Td {
    private final String EYQ;
    private final boolean Td;
    private final List<Td> mZx;

    public hu(String str, List<Td> list, boolean z) {
        this.EYQ = str;
        this.mZx = list;
        this.Td = z;
    }

    public String EYQ() {
        return this.EYQ;
    }

    public List<Td> mZx() {
        return this.mZx;
    }

    public boolean Td() {
        return this.Td;
    }

    @Override // com.bytedance.adsdk.lottie.Td.mZx.Td
    public com.bytedance.adsdk.lottie.EYQ.EYQ.Td EYQ(com.bytedance.adsdk.lottie.QQ qq, com.bytedance.adsdk.lottie.IPb iPb, com.bytedance.adsdk.lottie.Td.Td.EYQ eyq) {
        return new com.bytedance.adsdk.lottie.EYQ.EYQ.Pm(qq, eyq, this, iPb);
    }

    public String toString() {
        return "ShapeGroup{name='" + this.EYQ + "' Shapes: " + Arrays.toString(this.mZx.toArray()) + AbstractJsonLexerKt.END_OBJ;
    }
}
