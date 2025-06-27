package com.bytedance.adsdk.lottie.Kbd;

import android.graphics.PointF;
import android.util.JsonReader;
import com.bytedance.adsdk.lottie.Td.mZx;
import java.io.IOException;

/* compiled from: DocumentDataParser.java */
/* loaded from: classes2.dex */
public class HX implements XPd<com.bytedance.adsdk.lottie.Td.mZx> {
    public static final HX EYQ = new HX();

    private HX() {
    }

    @Override // com.bytedance.adsdk.lottie.Kbd.XPd
    /* renamed from: EYQ, reason: merged with bridge method [inline-methods] */
    public com.bytedance.adsdk.lottie.Td.mZx mZx(JsonReader jsonReader, float f) throws IOException {
        mZx.EYQ eyq = mZx.EYQ.CENTER;
        jsonReader.beginObject();
        mZx.EYQ eyq2 = eyq;
        boolean zNextBoolean = true;
        int iNextInt = 0;
        int iEYQ = 0;
        int iEYQ2 = 0;
        float fNextDouble = 0.0f;
        float fNextDouble2 = 0.0f;
        float fNextDouble3 = 0.0f;
        float fNextDouble4 = 0.0f;
        String strNextString = null;
        String strNextString2 = null;
        PointF pointF = null;
        PointF pointF2 = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "f":
                    strNextString2 = jsonReader.nextString();
                    break;
                case "j":
                    int iNextInt2 = jsonReader.nextInt();
                    if (iNextInt2 > mZx.EYQ.CENTER.ordinal() || iNextInt2 < 0) {
                        eyq2 = mZx.EYQ.CENTER;
                        break;
                    } else {
                        eyq2 = mZx.EYQ.values()[iNextInt2];
                        break;
                    }
                case "s":
                    fNextDouble = (float) jsonReader.nextDouble();
                    break;
                case "t":
                    strNextString = jsonReader.nextString();
                    break;
                case "fc":
                    iEYQ = hYh.EYQ(jsonReader);
                    break;
                case "lh":
                    fNextDouble2 = (float) jsonReader.nextDouble();
                    break;
                case "ls":
                    fNextDouble3 = (float) jsonReader.nextDouble();
                    break;
                case "of":
                    zNextBoolean = jsonReader.nextBoolean();
                    break;
                case "ps":
                    jsonReader.beginArray();
                    PointF pointF3 = new PointF(((float) jsonReader.nextDouble()) * f, ((float) jsonReader.nextDouble()) * f);
                    jsonReader.endArray();
                    pointF = pointF3;
                    break;
                case "sc":
                    iEYQ2 = hYh.EYQ(jsonReader);
                    break;
                case "sw":
                    fNextDouble4 = (float) jsonReader.nextDouble();
                    break;
                case "sz":
                    jsonReader.beginArray();
                    PointF pointF4 = new PointF(((float) jsonReader.nextDouble()) * f, ((float) jsonReader.nextDouble()) * f);
                    jsonReader.endArray();
                    pointF2 = pointF4;
                    break;
                case "tr":
                    iNextInt = jsonReader.nextInt();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return new com.bytedance.adsdk.lottie.Td.mZx(strNextString, strNextString2, fNextDouble, eyq2, iNextInt, fNextDouble2, fNextDouble3, iEYQ, iEYQ2, fNextDouble4, zNextBoolean, pointF, pointF2);
    }
}
