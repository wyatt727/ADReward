package com.bytedance.adsdk.lottie.Kbd;

import android.graphics.Rect;
import android.util.JsonReader;
import android.util.LongSparseArray;
import android.util.SparseArray;
import com.bytedance.adsdk.lottie.Td.Td.Pm;
import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: LottieCompositionParser.java */
/* loaded from: classes2.dex */
public class NZ {
    /* JADX WARN: Failed to find 'out' block for switch in B:53:0x00f0. Please report as an issue. */
    public static com.bytedance.adsdk.lottie.IPb EYQ(JsonReader jsonReader) throws IOException {
        float f;
        char c;
        HashMap map;
        ArrayList arrayList;
        float fEYQ = com.bytedance.adsdk.lottie.IPb.IPb.EYQ();
        LongSparseArray<com.bytedance.adsdk.lottie.Td.Td.Pm> longSparseArray = new LongSparseArray<>();
        ArrayList arrayList2 = new ArrayList();
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        HashMap map4 = new HashMap();
        ArrayList arrayList3 = new ArrayList();
        SparseArray<com.bytedance.adsdk.lottie.Td.Pm> sparseArray = new SparseArray<>();
        com.bytedance.adsdk.lottie.IPb iPb = new com.bytedance.adsdk.lottie.IPb();
        jsonReader.beginObject();
        float fNextDouble = 0.0f;
        float fNextDouble2 = 0.0f;
        float fNextDouble3 = 0.0f;
        int iNextInt = 0;
        int iNextInt2 = 0;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            char c2 = 65535;
            switch (strNextName.hashCode()) {
                case -1408207997:
                    f = fNextDouble3;
                    if (strNextName.equals("assets")) {
                        c2 = 0;
                        break;
                    }
                    break;
                case -1109732030:
                    f = fNextDouble3;
                    if (strNextName.equals("layers")) {
                        c2 = 1;
                        break;
                    }
                    break;
                case 104:
                    f = fNextDouble3;
                    if (strNextName.equals(CmcdHeadersFactory.STREAMING_FORMAT_HLS)) {
                        c2 = 2;
                        break;
                    }
                    break;
                case 118:
                    f = fNextDouble3;
                    if (strNextName.equals("v")) {
                        c = 3;
                        c2 = c;
                        break;
                    }
                    break;
                case 119:
                    f = fNextDouble3;
                    if (strNextName.equals("w")) {
                        c = 4;
                        c2 = c;
                        break;
                    }
                    break;
                case 3276:
                    f = fNextDouble3;
                    if (strNextName.equals("fr")) {
                        c = 5;
                        c2 = c;
                        break;
                    }
                    break;
                case 3367:
                    f = fNextDouble3;
                    if (strNextName.equals("ip")) {
                        c = 6;
                        c2 = c;
                        break;
                    }
                    break;
                case 3553:
                    f = fNextDouble3;
                    if (strNextName.equals("op")) {
                        c = 7;
                        c2 = c;
                        break;
                    }
                    break;
                case 94623709:
                    f = fNextDouble3;
                    if (strNextName.equals("chars")) {
                        c = '\b';
                        c2 = c;
                        break;
                    }
                    break;
                case 97615364:
                    f = fNextDouble3;
                    if (strNextName.equals("fonts")) {
                        c = '\t';
                        c2 = c;
                        break;
                    }
                    break;
                case 839250809:
                    f = fNextDouble3;
                    if (strNextName.equals("markers")) {
                        c = '\n';
                        c2 = c;
                        break;
                    }
                    break;
                default:
                    f = fNextDouble3;
                    break;
            }
            switch (c2) {
                case 0:
                    map = map4;
                    arrayList = arrayList3;
                    EYQ(jsonReader, iPb, map2, map3);
                    map4 = map;
                    fNextDouble3 = f;
                    arrayList3 = arrayList;
                    break;
                case 1:
                    map = map4;
                    arrayList = arrayList3;
                    EYQ(jsonReader, iPb, arrayList2, longSparseArray);
                    map4 = map;
                    fNextDouble3 = f;
                    arrayList3 = arrayList;
                    break;
                case 2:
                    iNextInt2 = jsonReader.nextInt();
                    fNextDouble3 = f;
                    break;
                case 3:
                    map = map4;
                    arrayList = arrayList3;
                    String[] strArrSplit = jsonReader.nextString().split("\\.");
                    if (!com.bytedance.adsdk.lottie.IPb.IPb.EYQ(Integer.parseInt(strArrSplit[0]), Integer.parseInt(strArrSplit[1]), Integer.parseInt(strArrSplit[2]), 4, 4, 0)) {
                        iPb.EYQ("Lottie only supports bodymovin >= 4.4.0");
                    }
                    map4 = map;
                    fNextDouble3 = f;
                    arrayList3 = arrayList;
                    break;
                case 4:
                    iNextInt = jsonReader.nextInt();
                    fNextDouble3 = f;
                    break;
                case 5:
                    arrayList = arrayList3;
                    fNextDouble3 = (float) jsonReader.nextDouble();
                    map4 = map4;
                    arrayList3 = arrayList;
                    break;
                case 6:
                    fNextDouble = (float) jsonReader.nextDouble();
                    fNextDouble3 = f;
                    break;
                case 7:
                    fNextDouble2 = ((float) jsonReader.nextDouble()) - 0.01f;
                    fNextDouble3 = f;
                    break;
                case '\b':
                    EYQ(jsonReader, iPb, sparseArray);
                    map = map4;
                    arrayList = arrayList3;
                    map4 = map;
                    fNextDouble3 = f;
                    arrayList3 = arrayList;
                    break;
                case '\t':
                    EYQ(jsonReader, map4);
                    map = map4;
                    arrayList = arrayList3;
                    map4 = map;
                    fNextDouble3 = f;
                    arrayList3 = arrayList;
                    break;
                case '\n':
                    EYQ(jsonReader, arrayList3);
                    map = map4;
                    arrayList = arrayList3;
                    map4 = map;
                    fNextDouble3 = f;
                    arrayList3 = arrayList;
                    break;
                default:
                    jsonReader.skipValue();
                    map = map4;
                    arrayList = arrayList3;
                    map4 = map;
                    fNextDouble3 = f;
                    arrayList3 = arrayList;
                    break;
            }
        }
        jsonReader.endObject();
        iPb.EYQ(new Rect(0, 0, (int) (iNextInt * fEYQ), (int) (iNextInt2 * fEYQ)), fNextDouble, fNextDouble2, fNextDouble3, arrayList2, longSparseArray, map2, map3, sparseArray, map4, arrayList3);
        return iPb;
    }

    private static void EYQ(JsonReader jsonReader, com.bytedance.adsdk.lottie.IPb iPb, List<com.bytedance.adsdk.lottie.Td.Td.Pm> list, LongSparseArray<com.bytedance.adsdk.lottie.Td.Td.Pm> longSparseArray) throws IOException {
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            com.bytedance.adsdk.lottie.Td.Td.Pm pmEYQ = XN.EYQ(jsonReader, iPb);
            pmEYQ.MxO();
            Pm.EYQ eyq = Pm.EYQ.IMAGE;
            list.add(pmEYQ);
            longSparseArray.put(pmEYQ.Kbd(), pmEYQ);
        }
        jsonReader.endArray();
    }

    private static void EYQ(JsonReader jsonReader, com.bytedance.adsdk.lottie.IPb iPb, Map<String, List<com.bytedance.adsdk.lottie.Td.Td.Pm>> map, Map<String, com.bytedance.adsdk.lottie.HX> map2) throws IOException {
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            ArrayList arrayList = new ArrayList();
            LongSparseArray longSparseArray = new LongSparseArray();
            jsonReader.beginObject();
            int iNextInt = 0;
            int iNextInt2 = 0;
            String strNextString = null;
            String strNextString2 = null;
            String strNextString3 = null;
            while (jsonReader.hasNext()) {
                String strNextName = jsonReader.nextName();
                strNextName.hashCode();
                switch (strNextName) {
                    case "layers":
                        jsonReader.beginArray();
                        while (jsonReader.hasNext()) {
                            com.bytedance.adsdk.lottie.Td.Td.Pm pmEYQ = XN.EYQ(jsonReader, iPb);
                            longSparseArray.put(pmEYQ.Kbd(), pmEYQ);
                            arrayList.add(pmEYQ);
                        }
                        jsonReader.endArray();
                        break;
                    case "h":
                        iNextInt2 = jsonReader.nextInt();
                        break;
                    case "p":
                        strNextString2 = jsonReader.nextString();
                        break;
                    case "u":
                        strNextString3 = jsonReader.nextString();
                        break;
                    case "w":
                        iNextInt = jsonReader.nextInt();
                        break;
                    case "id":
                        strNextString = jsonReader.nextString();
                        break;
                    default:
                        jsonReader.skipValue();
                        break;
                }
            }
            jsonReader.endObject();
            if (strNextString2 != null) {
                com.bytedance.adsdk.lottie.HX hx = new com.bytedance.adsdk.lottie.HX(iNextInt, iNextInt2, strNextString, strNextString2, strNextString3);
                map2.put(hx.Td(), hx);
            } else {
                map.put(strNextString, arrayList);
            }
        }
        jsonReader.endArray();
    }

    private static void EYQ(JsonReader jsonReader, Map<String, com.bytedance.adsdk.lottie.Td.Td> map) throws IOException {
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            if (strNextName.equals("list")) {
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    com.bytedance.adsdk.lottie.Td.Td tdEYQ = nWX.EYQ(jsonReader);
                    map.put(tdEYQ.mZx(), tdEYQ);
                }
                jsonReader.endArray();
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
    }

    private static void EYQ(JsonReader jsonReader, com.bytedance.adsdk.lottie.IPb iPb, SparseArray<com.bytedance.adsdk.lottie.Td.Pm> sparseArray) throws IOException {
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            com.bytedance.adsdk.lottie.Td.Pm pmEYQ = pi.EYQ(jsonReader, iPb);
            sparseArray.put(pmEYQ.hashCode(), pmEYQ);
        }
        jsonReader.endArray();
    }

    private static void EYQ(JsonReader jsonReader, List<com.bytedance.adsdk.lottie.Td.IPb> list) throws IOException {
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            String strNextString = null;
            jsonReader.beginObject();
            float fNextDouble = 0.0f;
            float fNextDouble2 = 0.0f;
            while (jsonReader.hasNext()) {
                String strNextName = jsonReader.nextName();
                strNextName.hashCode();
                switch (strNextName) {
                    case "cm":
                        strNextString = jsonReader.nextString();
                        break;
                    case "dr":
                        fNextDouble2 = (float) jsonReader.nextDouble();
                        break;
                    case "tm":
                        fNextDouble = (float) jsonReader.nextDouble();
                        break;
                    default:
                        jsonReader.skipValue();
                        break;
                }
            }
            jsonReader.endObject();
            list.add(new com.bytedance.adsdk.lottie.Td.IPb(strNextString, fNextDouble, fNextDouble2));
        }
        jsonReader.endArray();
    }
}
