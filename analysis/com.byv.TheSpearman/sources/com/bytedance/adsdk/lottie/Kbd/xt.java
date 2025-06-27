package com.bytedance.adsdk.lottie.Kbd;

import android.graphics.PointF;
import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;

/* compiled from: PointFParser.java */
/* loaded from: classes2.dex */
public class xt implements XPd<PointF> {
    public static final xt EYQ = new xt();

    private xt() {
    }

    @Override // com.bytedance.adsdk.lottie.Kbd.XPd
    /* renamed from: EYQ, reason: merged with bridge method [inline-methods] */
    public PointF mZx(JsonReader jsonReader, float f) throws IOException {
        JsonToken jsonTokenPeek = jsonReader.peek();
        if (jsonTokenPeek == JsonToken.BEGIN_ARRAY) {
            return hYh.mZx(jsonReader, f);
        }
        if (jsonTokenPeek == JsonToken.BEGIN_OBJECT) {
            return hYh.mZx(jsonReader, f);
        }
        if (jsonTokenPeek == JsonToken.NUMBER) {
            PointF pointF = new PointF(((float) jsonReader.nextDouble()) * f, ((float) jsonReader.nextDouble()) * f);
            while (jsonReader.hasNext()) {
                jsonReader.skipValue();
            }
            return pointF;
        }
        throw new IllegalArgumentException("Cannot convert json to point. Next token is ".concat(String.valueOf(jsonTokenPeek)));
    }
}
