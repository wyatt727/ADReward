package com.bytedance.adsdk.lottie.Kbd;

import android.util.JsonReader;
import com.bytedance.adsdk.lottie.Td.mZx.hYh;
import java.io.IOException;

/* compiled from: ShapeTrimPathParser.java */
/* loaded from: classes2.dex */
class lRN {
    static com.bytedance.adsdk.lottie.Td.mZx.hYh EYQ(JsonReader jsonReader, com.bytedance.adsdk.lottie.IPb iPb) throws IOException {
        boolean zNextBoolean = false;
        String strNextString = null;
        hYh.EYQ EYQ = null;
        com.bytedance.adsdk.lottie.Td.EYQ.mZx mzxEYQ = null;
        com.bytedance.adsdk.lottie.Td.EYQ.mZx mzxEYQ2 = null;
        com.bytedance.adsdk.lottie.Td.EYQ.mZx mzxEYQ3 = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "e":
                    mzxEYQ2 = Pm.EYQ(jsonReader, iPb, false);
                    break;
                case "m":
                    EYQ = hYh.EYQ.EYQ(jsonReader.nextInt());
                    break;
                case "o":
                    mzxEYQ3 = Pm.EYQ(jsonReader, iPb, false);
                    break;
                case "s":
                    mzxEYQ = Pm.EYQ(jsonReader, iPb, false);
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
        return new com.bytedance.adsdk.lottie.Td.mZx.hYh(strNextString, EYQ, mzxEYQ, mzxEYQ2, mzxEYQ3, zNextBoolean);
    }
}
