package com.bytedance.adsdk.lottie.Kbd;

import android.util.JsonReader;
import android.util.JsonToken;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* compiled from: KeyframesParser.java */
/* loaded from: classes2.dex */
class WU {
    static <T> List<com.bytedance.adsdk.lottie.VwS.EYQ<T>> EYQ(JsonReader jsonReader, com.bytedance.adsdk.lottie.IPb iPb, float f, XPd<T> xPd, boolean z) throws IOException {
        ArrayList arrayList = new ArrayList();
        if (jsonReader.peek() == JsonToken.STRING) {
            iPb.EYQ("Lottie doesn't support expressions.");
            return arrayList;
        }
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            if (strNextName.equals(CampaignEx.JSON_KEY_AD_K)) {
                if (jsonReader.peek() == JsonToken.BEGIN_ARRAY) {
                    jsonReader.beginArray();
                    if (jsonReader.peek() == JsonToken.NUMBER) {
                        arrayList.add(zF.EYQ(jsonReader, iPb, f, xPd, false, z));
                    } else {
                        while (jsonReader.hasNext()) {
                            arrayList.add(zF.EYQ(jsonReader, iPb, f, xPd, true, z));
                        }
                    }
                    jsonReader.endArray();
                } else {
                    arrayList.add(zF.EYQ(jsonReader, iPb, f, xPd, false, z));
                }
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        EYQ(arrayList);
        return arrayList;
    }

    public static <T> void EYQ(List<? extends com.bytedance.adsdk.lottie.VwS.EYQ<T>> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        while (true) {
            i = size - 1;
            if (i2 >= i) {
                break;
            }
            com.bytedance.adsdk.lottie.VwS.EYQ<T> eyq = list.get(i2);
            i2++;
            com.bytedance.adsdk.lottie.VwS.EYQ<T> eyq2 = list.get(i2);
            eyq.VwS = Float.valueOf(eyq2.IPb);
            if (eyq.mZx == null && eyq2.EYQ != null) {
                eyq.mZx = eyq2.EYQ;
                if (eyq instanceof com.bytedance.adsdk.lottie.EYQ.mZx.HX) {
                    ((com.bytedance.adsdk.lottie.EYQ.mZx.HX) eyq).EYQ();
                }
            }
        }
        com.bytedance.adsdk.lottie.VwS.EYQ<T> eyq3 = list.get(i);
        if ((eyq3.EYQ == null || eyq3.mZx == null) && list.size() > 1) {
            list.remove(eyq3);
        }
    }
}
