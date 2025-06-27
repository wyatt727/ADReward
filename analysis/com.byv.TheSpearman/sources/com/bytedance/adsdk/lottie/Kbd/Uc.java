package com.bytedance.adsdk.lottie.Kbd;

import android.util.JsonReader;
import java.io.IOException;

/* compiled from: IntegerParser.java */
/* loaded from: classes2.dex */
public class Uc implements XPd<Integer> {
    public static final Uc EYQ = new Uc();

    private Uc() {
    }

    @Override // com.bytedance.adsdk.lottie.Kbd.XPd
    /* renamed from: EYQ, reason: merged with bridge method [inline-methods] */
    public Integer mZx(JsonReader jsonReader, float f) throws IOException {
        return Integer.valueOf(Math.round(hYh.mZx(jsonReader) * f));
    }
}
