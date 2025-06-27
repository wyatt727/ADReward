package com.bytedance.sdk.openadsdk.utils;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: MemoryUtils.java */
/* loaded from: classes2.dex */
public class nWX {
    public static final long EYQ = EYQ(0.05f);

    public static long EYQ(float f) {
        return Double.valueOf(f * Runtime.getRuntime().maxMemory()).longValue();
    }

    public static boolean EYQ(long j, String str) {
        if (!com.bytedance.sdk.openadsdk.core.hu.Pm().pi() || Runtime.getRuntime().maxMemory() - (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) >= j) {
            return true;
        }
        mZx(j, str);
        return false;
    }

    private static void mZx(final long j, final String str) {
        xt.mZx(new com.bytedance.sdk.component.VwS.QQ("isMemoryEnough") { // from class: com.bytedance.sdk.openadsdk.utils.nWX.1
            @Override // java.lang.Runnable
            public void run() throws JSONException {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("scene", str);
                    jSONObject.put("mem_size", j);
                    com.bytedance.sdk.openadsdk.tp.Td.EYQ().EYQ("dynamic_mem_not_enough", jSONObject);
                } catch (Exception e) {
                    com.bytedance.sdk.component.utils.pi.EYQ("MemoryUtils", "run: ", e);
                }
            }
        }, 5);
    }

    public static int EYQ() {
        try {
            int iMaxMemory = (int) (Runtime.getRuntime().maxMemory() / 33554432);
            if (iMaxMemory <= 2) {
                return 2;
            }
            if (iMaxMemory >= 5) {
                return 5;
            }
            return iMaxMemory;
        } catch (Throwable unused) {
            return 2;
        }
    }
}
