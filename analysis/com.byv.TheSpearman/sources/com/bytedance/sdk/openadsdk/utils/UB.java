package com.bytedance.sdk.openadsdk.utils;

import android.text.TextUtils;
import android.util.Log;
import com.json.t2;

/* compiled from: PAGLogger.java */
/* loaded from: classes2.dex */
public class UB {
    private static boolean EYQ = false;

    public static void EYQ() {
        EYQ = true;
    }

    public static void mZx() {
        EYQ = false;
    }

    public static void EYQ(String str, String str2, Object... objArr) {
        EYQ(mZx(str, str2), objArr);
    }

    public static void EYQ(String str, String str2) {
        if (EYQ && str2 != null) {
            Log.d(EYQ(str), str2);
        }
    }

    public static void EYQ(String str, Object... objArr) {
        if (EYQ && objArr != null) {
            Log.d(EYQ(str), EYQ(objArr));
        }
    }

    public static void mZx(String str, String str2, Object... objArr) {
        mZx(mZx(str, str2), objArr);
    }

    public static void mZx(String str, Object... objArr) {
        if (EYQ && objArr != null) {
            Log.e(EYQ(str), EYQ(objArr));
        }
    }

    private static String EYQ(String str) {
        if (TextUtils.isEmpty("PangleSDK-5906")) {
            return str;
        }
        return EYQ("[PangleSDK-5906]-[" + str + t2.i.e);
    }

    private static String mZx(String str, String str2) {
        if (TextUtils.isEmpty("PangleSDK-5906")) {
            return str;
        }
        return EYQ(str2 + "]-[" + str);
    }

    private static String EYQ(Object... objArr) {
        if (objArr == null || objArr.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (Object obj : objArr) {
            if (obj != null) {
                sb.append(obj.toString());
            } else {
                sb.append(" null ");
            }
            sb.append(" ");
        }
        return sb.toString();
    }
}
