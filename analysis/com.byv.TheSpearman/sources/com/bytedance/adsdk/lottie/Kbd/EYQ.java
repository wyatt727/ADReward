package com.bytedance.adsdk.lottie.Kbd;

import android.graphics.PointF;
import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.util.ArrayList;

/* compiled from: AnimatablePathValueParser.java */
/* loaded from: classes2.dex */
public class EYQ {
    public static com.bytedance.adsdk.lottie.Td.EYQ.Kbd EYQ(JsonReader jsonReader, com.bytedance.adsdk.lottie.IPb iPb) throws IOException {
        ArrayList arrayList = new ArrayList();
        if (jsonReader.peek() == JsonToken.BEGIN_ARRAY) {
            jsonReader.beginArray();
            while (jsonReader.hasNext()) {
                arrayList.add(rfB.EYQ(jsonReader, iPb));
            }
            jsonReader.endArray();
            WU.EYQ(arrayList);
        } else {
            arrayList.add(new com.bytedance.adsdk.lottie.VwS.EYQ(hYh.mZx(jsonReader, com.bytedance.adsdk.lottie.IPb.IPb.EYQ())));
        }
        return new com.bytedance.adsdk.lottie.Td.EYQ.Kbd(arrayList);
    }

    static com.bytedance.adsdk.lottie.Td.EYQ.pi<PointF, PointF> mZx(JsonReader jsonReader, com.bytedance.adsdk.lottie.IPb iPb) throws IOException {
        jsonReader.beginObject();
        com.bytedance.adsdk.lottie.Td.EYQ.Kbd kbdEYQ = null;
        boolean z = false;
        com.bytedance.adsdk.lottie.Td.EYQ.mZx mzxEYQ = null;
        com.bytedance.adsdk.lottie.Td.EYQ.mZx mzxEYQ2 = null;
        while (jsonReader.peek() != JsonToken.END_OBJECT) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "k":
                    kbdEYQ = EYQ(jsonReader, iPb);
                    break;
                case "x":
                    if (jsonReader.peek() != JsonToken.STRING) {
                        mzxEYQ = Pm.EYQ(jsonReader, iPb);
                        break;
                    } else {
                        z = true;
                        jsonReader.skipValue();
                        break;
                    }
                case "y":
                    if (jsonReader.peek() != JsonToken.STRING) {
                        mzxEYQ2 = Pm.EYQ(jsonReader, iPb);
                        break;
                    } else {
                        z = true;
                        jsonReader.skipValue();
                        break;
                    }
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        if (z) {
            iPb.EYQ("Lottie doesn't support expressions.");
        }
        return kbdEYQ != null ? kbdEYQ : new com.bytedance.adsdk.lottie.Td.EYQ.HX(mzxEYQ, mzxEYQ2);
    }
}
