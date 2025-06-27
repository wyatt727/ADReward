package com.bytedance.adsdk.lottie.Kbd;

import android.util.JsonReader;
import com.bytedance.adsdk.lottie.Td.mZx.HX;
import java.io.IOException;

/* compiled from: MergePathsParser.java */
/* loaded from: classes2.dex */
class wBa {
    static com.bytedance.adsdk.lottie.Td.mZx.HX EYQ(JsonReader jsonReader) throws IOException {
        String strNextString = null;
        boolean zNextBoolean = false;
        HX.EYQ EYQ = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "hd":
                    zNextBoolean = jsonReader.nextBoolean();
                    break;
                case "mm":
                    EYQ = HX.EYQ.EYQ(jsonReader.nextInt());
                    break;
                case "nm":
                    strNextString = jsonReader.nextString();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        return new com.bytedance.adsdk.lottie.Td.mZx.HX(strNextString, EYQ, zNextBoolean);
    }
}
