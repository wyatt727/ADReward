package com.bytedance.adsdk.lottie.Kbd;

import android.util.JsonReader;
import java.io.IOException;

/* compiled from: AnimatableTextPropertiesParser.java */
/* loaded from: classes2.dex */
public class mZx {
    public static com.bytedance.adsdk.lottie.Td.EYQ.MxO EYQ(JsonReader jsonReader, com.bytedance.adsdk.lottie.IPb iPb) throws IOException {
        jsonReader.beginObject();
        com.bytedance.adsdk.lottie.Td.EYQ.MxO mxOMZx = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            if (strNextName.equals("a")) {
                mxOMZx = mZx(jsonReader, iPb);
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return mxOMZx == null ? new com.bytedance.adsdk.lottie.Td.EYQ.MxO(null, null, null, null) : mxOMZx;
    }

    private static com.bytedance.adsdk.lottie.Td.EYQ.MxO mZx(JsonReader jsonReader, com.bytedance.adsdk.lottie.IPb iPb) throws IOException {
        jsonReader.beginObject();
        com.bytedance.adsdk.lottie.Td.EYQ.EYQ eyqVwS = null;
        com.bytedance.adsdk.lottie.Td.EYQ.EYQ eyqVwS2 = null;
        com.bytedance.adsdk.lottie.Td.EYQ.mZx mzxEYQ = null;
        com.bytedance.adsdk.lottie.Td.EYQ.mZx mzxEYQ2 = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "t":
                    mzxEYQ2 = Pm.EYQ(jsonReader, iPb);
                    break;
                case "fc":
                    eyqVwS = Pm.VwS(jsonReader, iPb);
                    break;
                case "sc":
                    eyqVwS2 = Pm.VwS(jsonReader, iPb);
                    break;
                case "sw":
                    mzxEYQ = Pm.EYQ(jsonReader, iPb);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return new com.bytedance.adsdk.lottie.Td.EYQ.MxO(eyqVwS, eyqVwS2, mzxEYQ, mzxEYQ2);
    }
}
