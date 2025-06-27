package com.bytedance.adsdk.lottie.Kbd;

import android.graphics.Path;
import android.util.JsonReader;
import java.io.IOException;
import java.util.Collections;

/* compiled from: ShapeFillParser.java */
/* loaded from: classes2.dex */
class mN {
    static com.bytedance.adsdk.lottie.Td.mZx.KO EYQ(JsonReader jsonReader, com.bytedance.adsdk.lottie.IPb iPb) throws IOException {
        com.bytedance.adsdk.lottie.Td.EYQ.Pm pm = null;
        int iNextInt = 1;
        boolean zNextBoolean = false;
        boolean zNextBoolean2 = false;
        String strNextString = null;
        com.bytedance.adsdk.lottie.Td.EYQ.EYQ eyqVwS = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "fillEnabled":
                    zNextBoolean = jsonReader.nextBoolean();
                    break;
                case "c":
                    eyqVwS = Pm.VwS(jsonReader, iPb);
                    break;
                case "o":
                    pm = Pm.mZx(jsonReader, iPb);
                    break;
                case "r":
                    iNextInt = jsonReader.nextInt();
                    break;
                case "hd":
                    zNextBoolean2 = jsonReader.nextBoolean();
                    break;
                case "nm":
                    strNextString = jsonReader.nextString();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        if (pm == null) {
            pm = new com.bytedance.adsdk.lottie.Td.EYQ.Pm(Collections.singletonList(new com.bytedance.adsdk.lottie.VwS.EYQ(100)));
        }
        return new com.bytedance.adsdk.lottie.Td.mZx.KO(strNextString, zNextBoolean, iNextInt == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD, eyqVwS, pm, zNextBoolean2);
    }
}
