package com.bytedance.sdk.openadsdk.utils;

import android.text.TextUtils;

/* compiled from: ExternalSpUtils.java */
/* loaded from: classes2.dex */
public class QQ {
    public static void EYQ(String str) {
        EYQ("any_door_id", str);
    }

    public static String EYQ() {
        return mZx("any_door_id", null);
    }

    private static void EYQ(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            com.bytedance.sdk.openadsdk.multipro.Pm.Pm.EYQ((String) null, str, str2);
        } catch (Throwable unused) {
        }
    }

    private static String mZx(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            return com.bytedance.sdk.openadsdk.multipro.Pm.Pm.mZx(null, str, str2);
        } catch (Throwable unused) {
            return str2;
        }
    }
}
