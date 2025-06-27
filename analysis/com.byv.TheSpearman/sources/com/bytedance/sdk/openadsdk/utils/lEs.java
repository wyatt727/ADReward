package com.bytedance.sdk.openadsdk.utils;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;

/* compiled from: TestHelperUtils.java */
/* loaded from: classes2.dex */
public class lEs {
    private static String EYQ;

    public static boolean Td() {
        return false;
    }

    public static boolean EYQ() {
        return com.bytedance.sdk.component.utils.pi.Pm() && com.bytedance.sdk.openadsdk.core.QQ.mZx().UB() && com.bytedance.sdk.openadsdk.core.QQ.mZx().Uc();
    }

    public static String EYQ(String str) {
        try {
            if (!EYQ()) {
                return str;
            }
            String strHYh = com.bytedance.sdk.openadsdk.core.QQ.mZx().hYh();
            if (TextUtils.isEmpty(strHYh)) {
                return str;
            }
            Log.d("TestHelperUtils", "AnyDoorId=".concat(String.valueOf(strHYh)));
            return Uri.parse(str).buildUpon().appendQueryParameter(mZx(), strHYh).appendQueryParameter("aid", "5001121").toString();
        } catch (Throwable unused) {
            return str;
        }
    }

    public static String mZx() {
        if (TextUtils.isEmpty(EYQ)) {
            EYQ = new String(Base64.decode("ZGV2aWNlX2lk", 0));
        }
        return EYQ;
    }
}
