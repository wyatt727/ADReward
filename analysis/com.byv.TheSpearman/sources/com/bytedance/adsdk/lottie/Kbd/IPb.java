package com.bytedance.adsdk.lottie.Kbd;

import android.graphics.PointF;
import android.util.JsonReader;
import java.io.IOException;

/* compiled from: CircleShapeParser.java */
/* loaded from: classes2.dex */
class IPb {
    static com.bytedance.adsdk.lottie.Td.mZx.mZx EYQ(JsonReader jsonReader, com.bytedance.adsdk.lottie.IPb iPb, int i) throws IOException {
        boolean z = i == 3;
        boolean zNextBoolean = false;
        String strNextString = null;
        com.bytedance.adsdk.lottie.Td.EYQ.pi<PointF, PointF> piVarMZx = null;
        com.bytedance.adsdk.lottie.Td.EYQ.IPb iPbTd = null;
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
                case "s":
                    iPbTd = Pm.Td(jsonReader, iPb);
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
        return new com.bytedance.adsdk.lottie.Td.mZx.mZx(strNextString, piVarMZx, iPbTd, z, zNextBoolean);
    }
}
