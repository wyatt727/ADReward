package com.bytedance.adsdk.lottie.Kbd;

import android.graphics.PointF;
import android.util.JsonReader;
import android.util.JsonToken;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.IOException;

/* compiled from: AnimatableTransformParser.java */
/* loaded from: classes2.dex */
public class Td {
    public static com.bytedance.adsdk.lottie.Td.EYQ.tsL EYQ(JsonReader jsonReader, com.bytedance.adsdk.lottie.IPb iPb) throws IOException {
        boolean z = jsonReader.peek() == JsonToken.BEGIN_OBJECT;
        if (z) {
            jsonReader.beginObject();
        }
        com.bytedance.adsdk.lottie.Td.EYQ.mZx mzx = null;
        com.bytedance.adsdk.lottie.Td.EYQ.Kbd kbdEYQ = null;
        com.bytedance.adsdk.lottie.Td.EYQ.pi<PointF, PointF> piVarMZx = null;
        com.bytedance.adsdk.lottie.Td.EYQ.VwS vwSPm = null;
        com.bytedance.adsdk.lottie.Td.EYQ.mZx mzxEYQ = null;
        com.bytedance.adsdk.lottie.Td.EYQ.mZx mzxEYQ2 = null;
        com.bytedance.adsdk.lottie.Td.EYQ.Pm pmMZx = null;
        com.bytedance.adsdk.lottie.Td.EYQ.mZx mzxEYQ3 = null;
        com.bytedance.adsdk.lottie.Td.EYQ.mZx mzxEYQ4 = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "a":
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String strNextName2 = jsonReader.nextName();
                        strNextName2.hashCode();
                        if (strNextName2.equals(CampaignEx.JSON_KEY_AD_K)) {
                            kbdEYQ = EYQ.EYQ(jsonReader, iPb);
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    continue;
                case "o":
                    pmMZx = Pm.mZx(jsonReader, iPb);
                    continue;
                case "p":
                    piVarMZx = EYQ.mZx(jsonReader, iPb);
                    continue;
                case "r":
                    break;
                case "s":
                    vwSPm = Pm.Pm(jsonReader, iPb);
                    continue;
                case "eo":
                    mzxEYQ4 = Pm.EYQ(jsonReader, iPb, false);
                    continue;
                case "rz":
                    iPb.EYQ("Lottie doesn't support 3D layers.");
                    break;
                case "sa":
                    mzxEYQ2 = Pm.EYQ(jsonReader, iPb, false);
                    continue;
                case "sk":
                    mzxEYQ = Pm.EYQ(jsonReader, iPb, false);
                    continue;
                case "so":
                    mzxEYQ3 = Pm.EYQ(jsonReader, iPb, false);
                    continue;
                default:
                    jsonReader.skipValue();
                    continue;
            }
            com.bytedance.adsdk.lottie.Td.EYQ.mZx mzxEYQ5 = Pm.EYQ(jsonReader, iPb, false);
            if (mzxEYQ5.Td().isEmpty()) {
                mzxEYQ5.Td().add(new com.bytedance.adsdk.lottie.VwS.EYQ(iPb, Float.valueOf(0.0f), Float.valueOf(0.0f), null, 0.0f, Float.valueOf(iPb.VwS())));
            } else if (((com.bytedance.adsdk.lottie.VwS.EYQ) mzxEYQ5.Td().get(0)).EYQ == 0) {
                mzxEYQ5.Td().set(0, new com.bytedance.adsdk.lottie.VwS.EYQ(iPb, Float.valueOf(0.0f), Float.valueOf(0.0f), null, 0.0f, Float.valueOf(iPb.VwS())));
            }
            mzx = mzxEYQ5;
        }
        if (z) {
            jsonReader.endObject();
        }
        if (EYQ(kbdEYQ)) {
            kbdEYQ = null;
        }
        return new com.bytedance.adsdk.lottie.Td.EYQ.tsL(kbdEYQ, EYQ(piVarMZx) ? null : piVarMZx, EYQ(vwSPm) ? null : vwSPm, EYQ(mzx) ? null : mzx, pmMZx, mzxEYQ3, mzxEYQ4, mZx(mzxEYQ) ? null : mzxEYQ, Td(mzxEYQ2) ? null : mzxEYQ2);
    }

    private static boolean EYQ(com.bytedance.adsdk.lottie.Td.EYQ.Kbd kbd) {
        if (kbd != null) {
            return kbd.mZx() && kbd.Td().get(0).EYQ.equals(0.0f, 0.0f);
        }
        return true;
    }

    private static boolean EYQ(com.bytedance.adsdk.lottie.Td.EYQ.pi<PointF, PointF> piVar) {
        if (piVar != null) {
            return !(piVar instanceof com.bytedance.adsdk.lottie.Td.EYQ.HX) && piVar.mZx() && piVar.Td().get(0).EYQ.equals(0.0f, 0.0f);
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean EYQ(com.bytedance.adsdk.lottie.Td.EYQ.mZx mzx) {
        if (mzx != null) {
            return mzx.mZx() && ((Float) ((com.bytedance.adsdk.lottie.VwS.EYQ) mzx.Td().get(0)).EYQ).floatValue() == 0.0f;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean EYQ(com.bytedance.adsdk.lottie.Td.EYQ.VwS vwS) {
        if (vwS != null) {
            return vwS.mZx() && ((com.bytedance.adsdk.lottie.VwS.Td) ((com.bytedance.adsdk.lottie.VwS.EYQ) vwS.Td().get(0)).EYQ).mZx(1.0f, 1.0f);
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean mZx(com.bytedance.adsdk.lottie.Td.EYQ.mZx mzx) {
        if (mzx != null) {
            return mzx.mZx() && ((Float) ((com.bytedance.adsdk.lottie.VwS.EYQ) mzx.Td().get(0)).EYQ).floatValue() == 0.0f;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean Td(com.bytedance.adsdk.lottie.Td.EYQ.mZx mzx) {
        if (mzx != null) {
            return mzx.mZx() && ((Float) ((com.bytedance.adsdk.lottie.VwS.EYQ) mzx.Td().get(0)).EYQ).floatValue() == 0.0f;
        }
        return true;
    }
}
