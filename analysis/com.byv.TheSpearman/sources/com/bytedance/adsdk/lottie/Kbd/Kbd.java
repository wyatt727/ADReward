package com.bytedance.adsdk.lottie.Kbd;

import android.util.JsonReader;
import java.io.IOException;

/* compiled from: BlurEffectParser.java */
/* loaded from: classes2.dex */
class Kbd {
    static com.bytedance.adsdk.lottie.Td.mZx.EYQ EYQ(JsonReader jsonReader, com.bytedance.adsdk.lottie.IPb iPb) throws IOException {
        com.bytedance.adsdk.lottie.Td.mZx.EYQ eyq = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            if (strNextName.equals("ef")) {
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    com.bytedance.adsdk.lottie.Td.mZx.EYQ eyqMZx = mZx(jsonReader, iPb);
                    if (eyqMZx != null) {
                        eyq = eyqMZx;
                    }
                }
                jsonReader.endArray();
            } else {
                jsonReader.skipValue();
            }
        }
        return eyq;
    }

    private static com.bytedance.adsdk.lottie.Td.mZx.EYQ mZx(JsonReader jsonReader, com.bytedance.adsdk.lottie.IPb iPb) throws IOException {
        jsonReader.beginObject();
        com.bytedance.adsdk.lottie.Td.mZx.EYQ eyq = null;
        while (true) {
            boolean z = false;
            while (jsonReader.hasNext()) {
                String strNextName = jsonReader.nextName();
                strNextName.hashCode();
                if (strNextName.equals("v")) {
                    if (z) {
                        eyq = new com.bytedance.adsdk.lottie.Td.mZx.EYQ(Pm.EYQ(jsonReader, iPb));
                    } else {
                        jsonReader.skipValue();
                    }
                } else if (strNextName.equals("ty")) {
                    if (jsonReader.nextInt() == 0) {
                        z = true;
                    }
                } else {
                    jsonReader.skipValue();
                }
            }
            jsonReader.endObject();
            return eyq;
        }
    }
}
