package com.bytedance.sdk.openadsdk.core.settings;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.hu;
import com.bytedance.sdk.openadsdk.utils.rfB;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: AdSlotSettings.java */
/* loaded from: classes2.dex */
public class mZx {
    private static final ConcurrentHashMap<String, EYQ> EYQ = new ConcurrentHashMap<>();

    public static void EYQ(boolean z) {
        String strEYQ;
        File fileMZx = mZx();
        if (!fileMZx.exists()) {
            if (com.bytedance.sdk.openadsdk.multipro.mZx.Td()) {
                strEYQ = com.bytedance.sdk.openadsdk.multipro.Pm.EYQ.mZx("tt_sdk_settings", "ad_slot_conf", null);
            } else {
                strEYQ = rfB.EYQ("tt_sdk_settings", hu.EYQ()).EYQ("ad_slot_conf", (String) null);
            }
            if (TextUtils.isEmpty(strEYQ)) {
                return;
            }
            try {
                HashMap<String, EYQ> mapMZx = mZx(new JSONArray(strEYQ));
                if (mapMZx.isEmpty()) {
                    return;
                }
                ConcurrentHashMap<String, EYQ> concurrentHashMap = EYQ;
                concurrentHashMap.clear();
                concurrentHashMap.putAll(mapMZx);
                return;
            } catch (Exception unused) {
                return;
            }
        }
        try {
            HashMap<String, EYQ> mapMZx2 = mZx(new JSONArray(new String(com.bytedance.sdk.component.utils.IPb.Pm(fileMZx))));
            if (mapMZx2.isEmpty()) {
                return;
            }
            for (Map.Entry<String, EYQ> entry : mapMZx2.entrySet()) {
                String key = entry.getKey();
                EYQ value = entry.getValue();
                if (value.FtN && !z) {
                    EYQ eyq = EYQ.get(key);
                    if (eyq != null) {
                        eyq.lRN = value.vD;
                    }
                } else {
                    EYQ.put(key, value);
                }
            }
        } catch (Exception unused2) {
        }
    }

    private static HashMap<String, EYQ> mZx(JSONArray jSONArray) {
        HashMap<String, EYQ> map = new HashMap<>();
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                EYQ EYQ2 = EYQ(jSONArray.getJSONObject(i));
                if (EYQ2 != null) {
                    map.put(EYQ2.EYQ, EYQ2);
                }
            } catch (Exception unused) {
            }
        }
        return map;
    }

    private static File mZx() {
        return new File(hu.EYQ().getFilesDir(), "tt_ads_conf");
    }

    private static EYQ EYQ(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        return new EYQ(jSONObject);
    }

    public static EYQ EYQ(String str) {
        EYQ eyq = EYQ.get(str);
        return eyq == null ? mZx(str) : eyq;
    }

    private static EYQ mZx(String str) {
        return new EYQ(str, 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b9 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void EYQ(org.json.JSONArray r5) throws java.lang.Throwable {
        /*
            if (r5 != 0) goto L3
            return
        L3:
            java.io.File r0 = mZx()
            java.io.File r1 = new java.io.File
            java.lang.String r2 = r0.getParent()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = r0.getName()
            r3.append(r4)
            java.lang.String r4 = ".tmp"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r1.<init>(r2, r3)
            r2 = 0
            boolean r3 = r1.exists()     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L62
            if (r3 == 0) goto L2f
            r1.delete()     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L62
        L2f:
            java.io.FileWriter r3 = new java.io.FileWriter     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L62
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L62
            java.lang.String r2 = r5.toString()     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L5d
            r3.write(r2)     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L5d
            r1.renameTo(r0)     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L5d
            java.lang.String r0 = "tt_sdk_settings"
            android.content.Context r2 = com.bytedance.sdk.openadsdk.core.hu.EYQ()     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L5d
            com.bytedance.sdk.openadsdk.utils.rfB r0 = com.bytedance.sdk.openadsdk.utils.rfB.EYQ(r0, r2)     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L5d
            java.lang.String r2 = "ad_slot_conf"
            r0.EYQ(r2)     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L5d
            boolean r0 = r1.exists()
            if (r0 == 0) goto L56
            r1.delete()
        L56:
            com.bytedance.sdk.openadsdk.utils.HX.EYQ(r3)
            goto L76
        L5a:
            r5 = move-exception
            r2 = r3
            goto Lba
        L5d:
            r0 = move-exception
            r2 = r3
            goto L63
        L60:
            r5 = move-exception
            goto Lba
        L62:
            r0 = move-exception
        L63:
            java.lang.String r3 = "SdkSettings.AdSlot"
            java.lang.String r4 = "saveAdSlotToLocal: "
            android.util.Log.e(r3, r4, r0)     // Catch: java.lang.Throwable -> L60
            boolean r0 = r1.exists()
            if (r0 == 0) goto L73
            r1.delete()
        L73:
            com.bytedance.sdk.openadsdk.utils.HX.EYQ(r2)
        L76:
            java.util.HashMap r5 = mZx(r5)
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto Lb9
            java.util.Set r5 = r5.entrySet()
            java.util.Iterator r5 = r5.iterator()
        L88:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto Lb9
            java.lang.Object r0 = r5.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.getValue()
            com.bytedance.sdk.openadsdk.core.settings.EYQ r0 = (com.bytedance.sdk.openadsdk.core.settings.EYQ) r0
            boolean r2 = r0.FtN
            if (r2 == 0) goto Lb3
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.bytedance.sdk.openadsdk.core.settings.EYQ> r2 = com.bytedance.sdk.openadsdk.core.settings.mZx.EYQ
            java.lang.Object r1 = r2.get(r1)
            com.bytedance.sdk.openadsdk.core.settings.EYQ r1 = (com.bytedance.sdk.openadsdk.core.settings.EYQ) r1
            if (r1 == 0) goto L88
            java.lang.String r0 = r0.vD
            r1.lRN = r0
            goto L88
        Lb3:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.bytedance.sdk.openadsdk.core.settings.EYQ> r2 = com.bytedance.sdk.openadsdk.core.settings.mZx.EYQ
            r2.put(r1, r0)
            goto L88
        Lb9:
            return
        Lba:
            boolean r0 = r1.exists()
            if (r0 == 0) goto Lc3
            r1.delete()
        Lc3:
            com.bytedance.sdk.openadsdk.utils.HX.EYQ(r2)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.settings.mZx.EYQ(org.json.JSONArray):void");
    }

    public static void EYQ() {
        File fileMZx = mZx();
        if (fileMZx.exists()) {
            fileMZx.delete();
        }
    }
}
