package com.bytedance.adsdk.lottie.Kbd;

import android.util.JsonReader;
import java.io.IOException;

/* compiled from: DropShadowEffectParser.java */
/* loaded from: classes2.dex */
public class MxO {
    private com.bytedance.adsdk.lottie.Td.EYQ.EYQ EYQ;
    private com.bytedance.adsdk.lottie.Td.EYQ.mZx Kbd;
    private com.bytedance.adsdk.lottie.Td.EYQ.mZx Pm;
    private com.bytedance.adsdk.lottie.Td.EYQ.mZx Td;
    private com.bytedance.adsdk.lottie.Td.EYQ.mZx mZx;

    tp EYQ(JsonReader jsonReader, com.bytedance.adsdk.lottie.IPb iPb) throws IOException {
        com.bytedance.adsdk.lottie.Td.EYQ.mZx mzx;
        com.bytedance.adsdk.lottie.Td.EYQ.mZx mzx2;
        com.bytedance.adsdk.lottie.Td.EYQ.mZx mzx3;
        com.bytedance.adsdk.lottie.Td.EYQ.mZx mzx4;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            if (strNextName.equals("ef")) {
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    mZx(jsonReader, iPb);
                }
                jsonReader.endArray();
            } else {
                jsonReader.skipValue();
            }
        }
        com.bytedance.adsdk.lottie.Td.EYQ.EYQ eyq = this.EYQ;
        if (eyq == null || (mzx = this.mZx) == null || (mzx2 = this.Td) == null || (mzx3 = this.Pm) == null || (mzx4 = this.Kbd) == null) {
            return null;
        }
        return new tp(eyq, mzx, mzx2, mzx3, mzx4);
    }

    private void mZx(JsonReader jsonReader, com.bytedance.adsdk.lottie.IPb iPb) throws IOException {
        jsonReader.beginObject();
        String strNextString = "";
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            if (strNextName.equals("v")) {
                strNextString.hashCode();
                switch (strNextString) {
                    case "Distance":
                        this.Pm = Pm.EYQ(jsonReader, iPb);
                        break;
                    case "Opacity":
                        this.mZx = Pm.EYQ(jsonReader, iPb, false);
                        break;
                    case "Direction":
                        this.Td = Pm.EYQ(jsonReader, iPb, false);
                        break;
                    case "Shadow Color":
                        this.EYQ = Pm.VwS(jsonReader, iPb);
                        break;
                    case "Softness":
                        this.Kbd = Pm.EYQ(jsonReader, iPb);
                        break;
                    default:
                        jsonReader.skipValue();
                        break;
                }
            } else if (strNextName.equals("nm")) {
                strNextString = jsonReader.nextString();
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
    }
}
