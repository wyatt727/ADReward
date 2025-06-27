package com.bytedance.adsdk.lottie.Kbd;

import android.graphics.PointF;
import android.util.JsonReader;
import com.bytedance.adsdk.lottie.Td.mZx.tp;
import java.io.IOException;

/* compiled from: PolystarShapeParser.java */
/* loaded from: classes2.dex */
class Nvm {
    static com.bytedance.adsdk.lottie.Td.mZx.tp EYQ(JsonReader jsonReader, com.bytedance.adsdk.lottie.IPb iPb, int i) throws IOException {
        boolean zNextBoolean = false;
        boolean z = i == 3;
        String strNextString = null;
        tp.EYQ EYQ = null;
        com.bytedance.adsdk.lottie.Td.EYQ.mZx mzxEYQ = null;
        com.bytedance.adsdk.lottie.Td.EYQ.pi<PointF, PointF> piVarMZx = null;
        com.bytedance.adsdk.lottie.Td.EYQ.mZx mzxEYQ2 = null;
        com.bytedance.adsdk.lottie.Td.EYQ.mZx mzxEYQ3 = null;
        com.bytedance.adsdk.lottie.Td.EYQ.mZx mzxEYQ4 = null;
        com.bytedance.adsdk.lottie.Td.EYQ.mZx mzxEYQ5 = null;
        com.bytedance.adsdk.lottie.Td.EYQ.mZx mzxEYQ6 = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "d":
                    if (jsonReader.nextInt() != 3) {
                        z = false;
                        break;
                    } else {
                        z = true;
                        break;
                    }
                case "p":
                    piVarMZx = EYQ.mZx(jsonReader, iPb);
                    break;
                case "r":
                    mzxEYQ2 = Pm.EYQ(jsonReader, iPb, false);
                    break;
                case "hd":
                    zNextBoolean = jsonReader.nextBoolean();
                    break;
                case "ir":
                    mzxEYQ3 = Pm.EYQ(jsonReader, iPb);
                    break;
                case "is":
                    mzxEYQ5 = Pm.EYQ(jsonReader, iPb, false);
                    break;
                case "nm":
                    strNextString = jsonReader.nextString();
                    break;
                case "or":
                    mzxEYQ4 = Pm.EYQ(jsonReader, iPb);
                    break;
                case "os":
                    mzxEYQ6 = Pm.EYQ(jsonReader, iPb, false);
                    break;
                case "pt":
                    mzxEYQ = Pm.EYQ(jsonReader, iPb, false);
                    break;
                case "sy":
                    EYQ = tp.EYQ.EYQ(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        return new com.bytedance.adsdk.lottie.Td.mZx.tp(strNextString, EYQ, mzxEYQ, piVarMZx, mzxEYQ2, mzxEYQ3, mzxEYQ4, mzxEYQ5, mzxEYQ6, zNextBoolean, z);
    }
}
