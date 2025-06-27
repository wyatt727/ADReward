package com.bytedance.sdk.openadsdk.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* compiled from: TempSPUtils.java */
/* loaded from: classes2.dex */
public class rfB {
    private static final Map<String, rfB> EYQ = new HashMap();
    private SharedPreferences mZx;

    public static rfB EYQ(String str, Context context) {
        if (TextUtils.isEmpty(str)) {
            str = "tt_ad_sdk_sp";
        }
        Map<String, rfB> map = EYQ;
        rfB rfb = map.get(str);
        if (rfb != null) {
            return rfb;
        }
        rfB rfb2 = new rfB(str, context);
        map.put(str, rfb2);
        return rfb2;
    }

    private rfB(String str, Context context) {
        if (context != null) {
            this.mZx = context.getSharedPreferences(str, 0);
        }
    }

    public String EYQ(String str, String str2) {
        try {
            return this.mZx.getString(str, str2);
        } catch (Throwable unused) {
            return str2;
        }
    }

    public void EYQ(String str) {
        try {
            this.mZx.edit().remove(str).apply();
        } catch (Throwable unused) {
        }
    }
}
