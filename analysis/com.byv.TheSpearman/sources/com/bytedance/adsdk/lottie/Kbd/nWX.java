package com.bytedance.adsdk.lottie.Kbd;

import android.util.JsonReader;
import java.io.IOException;

/* compiled from: FontParser.java */
/* loaded from: classes2.dex */
class nWX {
    static com.bytedance.adsdk.lottie.Td.Td EYQ(JsonReader jsonReader) throws IOException {
        jsonReader.beginObject();
        String strNextString = null;
        String strNextString2 = null;
        float fNextDouble = 0.0f;
        String strNextString3 = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "fFamily":
                    strNextString = jsonReader.nextString();
                    break;
                case "ascent":
                    fNextDouble = (float) jsonReader.nextDouble();
                    break;
                case "fStyle":
                    strNextString2 = jsonReader.nextString();
                    break;
                case "fName":
                    strNextString3 = jsonReader.nextString();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return new com.bytedance.adsdk.lottie.Td.Td(strNextString, strNextString3, strNextString2, fNextDouble);
    }
}
