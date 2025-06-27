package com.bytedance.adsdk.lottie.Kbd;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;

/* compiled from: ScaleXYParser.java */
/* loaded from: classes2.dex */
public class FtN implements XPd<com.bytedance.adsdk.lottie.VwS.Td> {
    public static final FtN EYQ = new FtN();

    private FtN() {
    }

    @Override // com.bytedance.adsdk.lottie.Kbd.XPd
    /* renamed from: EYQ, reason: merged with bridge method [inline-methods] */
    public com.bytedance.adsdk.lottie.VwS.Td mZx(JsonReader jsonReader, float f) throws IOException {
        boolean z = jsonReader.peek() == JsonToken.BEGIN_ARRAY;
        if (z) {
            jsonReader.beginArray();
        }
        float fNextDouble = (float) jsonReader.nextDouble();
        float fNextDouble2 = (float) jsonReader.nextDouble();
        while (jsonReader.hasNext()) {
            jsonReader.skipValue();
        }
        if (z) {
            jsonReader.endArray();
        }
        return new com.bytedance.adsdk.lottie.VwS.Td((fNextDouble / 100.0f) * f, (fNextDouble2 / 100.0f) * f);
    }
}
