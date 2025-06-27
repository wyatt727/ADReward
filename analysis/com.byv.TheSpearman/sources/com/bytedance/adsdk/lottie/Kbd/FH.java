package com.bytedance.adsdk.lottie.Kbd;

import android.graphics.PointF;
import android.util.JsonReader;
import java.io.IOException;

/* compiled from: RectangleShapeParser.java */
/* loaded from: classes2.dex */
class FH {
    static com.bytedance.adsdk.lottie.Td.mZx.MxO EYQ(JsonReader jsonReader, com.bytedance.adsdk.lottie.IPb iPb) throws IOException {
        boolean zNextBoolean = false;
        String strNextString = null;
        com.bytedance.adsdk.lottie.Td.EYQ.pi<PointF, PointF> piVarMZx = null;
        com.bytedance.adsdk.lottie.Td.EYQ.IPb iPbTd = null;
        com.bytedance.adsdk.lottie.Td.EYQ.mZx mzxEYQ = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "p":
                    piVarMZx = EYQ.mZx(jsonReader, iPb);
                    break;
                case "r":
                    mzxEYQ = Pm.EYQ(jsonReader, iPb);
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
        return new com.bytedance.adsdk.lottie.Td.mZx.MxO(strNextString, piVarMZx, iPbTd, mzxEYQ, zNextBoolean);
    }
}
