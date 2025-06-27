package com.bytedance.adsdk.lottie.Kbd;

import android.util.JsonReader;
import java.io.IOException;

/* compiled from: RoundedCornersParser.java */
/* loaded from: classes2.dex */
public class Tnp {
    static com.bytedance.adsdk.lottie.Td.mZx.pi EYQ(JsonReader jsonReader, com.bytedance.adsdk.lottie.IPb iPb) throws IOException {
        boolean zNextBoolean = false;
        String strNextString = null;
        com.bytedance.adsdk.lottie.Td.EYQ.mZx mzxEYQ = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "r":
                    mzxEYQ = Pm.EYQ(jsonReader, iPb, true);
                    break;
                case "hd":
                    zNextBoolean = jsonReader.nextBoolean();
                    break;
                case "nm":
                    strNextString = jsonReader.nextString();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        if (zNextBoolean) {
            return null;
        }
        return new com.bytedance.adsdk.lottie.Td.mZx.pi(strNextString, mzxEYQ);
    }
}
