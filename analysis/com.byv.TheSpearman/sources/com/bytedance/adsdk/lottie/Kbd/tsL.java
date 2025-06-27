package com.bytedance.adsdk.lottie.Kbd;

import android.util.JsonReader;
import java.io.IOException;

/* compiled from: FloatParser.java */
/* loaded from: classes2.dex */
public class tsL implements XPd<Float> {
    public static final tsL EYQ = new tsL();

    private tsL() {
    }

    @Override // com.bytedance.adsdk.lottie.Kbd.XPd
    /* renamed from: EYQ, reason: merged with bridge method [inline-methods] */
    public Float mZx(JsonReader jsonReader, float f) throws IOException {
        return Float.valueOf(hYh.mZx(jsonReader) * f);
    }
}
