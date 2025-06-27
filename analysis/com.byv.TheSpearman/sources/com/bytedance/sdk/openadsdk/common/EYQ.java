package com.bytedance.sdk.openadsdk.common;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.hu;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.MxO;
import com.bytedance.sdk.openadsdk.utils.FH;

/* compiled from: AppInfo.java */
/* loaded from: classes2.dex */
public class EYQ {
    private static String EYQ;

    public static String EYQ() {
        return "open_news";
    }

    public static String Td() {
        return BuildConfig.VERSION_NAME;
    }

    public static String mZx() {
        return "1371";
    }

    public static String Pm() {
        return FH.VwS();
    }

    public static String Kbd() {
        return com.bytedance.sdk.openadsdk.core.QQ.mZx().Kbd();
    }

    public static String IPb() {
        return hu.VwS(com.bytedance.sdk.openadsdk.core.hu.EYQ());
    }

    public static String EYQ(Context context) {
        return MxO.EYQ(context);
    }

    public static String VwS() {
        if (!TextUtils.isEmpty(EYQ)) {
            return EYQ;
        }
        String strEYQ = com.bytedance.sdk.openadsdk.core.QQ.EYQ("sdk_app_sha1", 259200000L);
        EYQ = strEYQ;
        if (EYQ(strEYQ)) {
            return EYQ;
        }
        String strEYQ2 = com.bytedance.sdk.component.utils.Td.EYQ(com.bytedance.sdk.openadsdk.core.hu.EYQ());
        EYQ = strEYQ2;
        if (EYQ(strEYQ2)) {
            String upperCase = EYQ.toUpperCase();
            EYQ = upperCase;
            com.bytedance.sdk.openadsdk.core.QQ.EYQ("sdk_app_sha1", upperCase);
            return EYQ;
        }
        return "";
    }

    private static boolean EYQ(String str) {
        String[] strArrSplit;
        if (TextUtils.isEmpty(str) || (strArrSplit = str.split(":")) == null || strArrSplit.length < 20) {
            return false;
        }
        for (String str2 : strArrSplit) {
            if (!"00".equals(str2)) {
                return true;
            }
        }
        return false;
    }
}
