package com.bytedance.sdk.openadsdk.component.reward;

import android.text.TextUtils;

/* compiled from: SpCache.java */
/* loaded from: classes2.dex */
class pi {
    private final String EYQ;

    pi(String str) {
        this.EYQ = TextUtils.isEmpty(str) ? "" : str;
    }

    private String Kbd(String str) {
        if (TextUtils.isEmpty(str)) {
            str = "0";
        }
        return this.EYQ + "_cache_" + str;
    }

    String EYQ(String str) {
        try {
            return com.bytedance.sdk.openadsdk.multipro.Pm.Pm.mZx(Kbd(str), "material_data", null);
        } catch (Throwable unused) {
            return null;
        }
    }

    long mZx(String str) {
        try {
            return com.bytedance.sdk.openadsdk.multipro.Pm.Pm.EYQ(Kbd(str), "create_time", 0L);
        } catch (Throwable unused) {
            return 0L;
        }
    }

    boolean Td(String str) {
        try {
            return com.bytedance.sdk.openadsdk.multipro.Pm.Pm.EYQ(Kbd(str), "has_played", true);
        } catch (Throwable unused) {
            return true;
        }
    }

    void EYQ(String str, String str2) {
        try {
            com.bytedance.sdk.openadsdk.multipro.Pm.Pm.EYQ(Kbd(str), "has_played", Boolean.FALSE);
            com.bytedance.sdk.openadsdk.multipro.Pm.Pm.EYQ(Kbd(str), "create_time", Long.valueOf(System.currentTimeMillis()));
            com.bytedance.sdk.openadsdk.multipro.Pm.Pm.EYQ(Kbd(str), "material_data", str2);
        } catch (Throwable unused) {
        }
    }

    void Pm(String str) {
        try {
            com.bytedance.sdk.openadsdk.multipro.Pm.Pm.EYQ(Kbd(str));
        } catch (Throwable unused) {
        }
    }
}
