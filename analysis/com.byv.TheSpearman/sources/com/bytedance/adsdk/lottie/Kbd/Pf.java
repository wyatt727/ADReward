package com.bytedance.adsdk.lottie.Kbd;

import android.util.JsonReader;
import java.io.IOException;

/* compiled from: ShapePathParser.java */
/* loaded from: classes2.dex */
class Pf {
    static com.bytedance.adsdk.lottie.Td.mZx.UB EYQ(JsonReader jsonReader, com.bytedance.adsdk.lottie.IPb iPb) throws IOException {
        String strNextString = null;
        com.bytedance.adsdk.lottie.Td.EYQ.QQ qqKbd = null;
        int iNextInt = 0;
        boolean zNextBoolean = false;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "hd":
                    zNextBoolean = jsonReader.nextBoolean();
                    break;
                case "ks":
                    qqKbd = Pm.Kbd(jsonReader, iPb);
                    break;
                case "nm":
                    strNextString = jsonReader.nextString();
                    break;
                case "ind":
                    iNextInt = jsonReader.nextInt();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        return new com.bytedance.adsdk.lottie.Td.mZx.UB(strNextString, iNextInt, qqKbd, zNextBoolean);
    }
}
