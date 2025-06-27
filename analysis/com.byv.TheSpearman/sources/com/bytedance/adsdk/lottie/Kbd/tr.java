package com.bytedance.adsdk.lottie.Kbd;

import android.util.JsonReader;
import java.io.IOException;

/* compiled from: RepeaterParser.java */
/* loaded from: classes2.dex */
class tr {
    static com.bytedance.adsdk.lottie.Td.mZx.tsL EYQ(JsonReader jsonReader, com.bytedance.adsdk.lottie.IPb iPb) throws IOException {
        boolean zNextBoolean = false;
        String strNextString = null;
        com.bytedance.adsdk.lottie.Td.EYQ.mZx mzxEYQ = null;
        com.bytedance.adsdk.lottie.Td.EYQ.mZx mzxEYQ2 = null;
        com.bytedance.adsdk.lottie.Td.EYQ.tsL tslEYQ = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "c":
                    mzxEYQ = Pm.EYQ(jsonReader, iPb, false);
                    break;
                case "o":
                    mzxEYQ2 = Pm.EYQ(jsonReader, iPb, false);
                    break;
                case "hd":
                    zNextBoolean = jsonReader.nextBoolean();
                    break;
                case "nm":
                    strNextString = jsonReader.nextString();
                    break;
                case "tr":
                    tslEYQ = Td.EYQ(jsonReader, iPb);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        return new com.bytedance.adsdk.lottie.Td.mZx.tsL(strNextString, mzxEYQ, mzxEYQ2, tslEYQ, zNextBoolean);
    }
}
