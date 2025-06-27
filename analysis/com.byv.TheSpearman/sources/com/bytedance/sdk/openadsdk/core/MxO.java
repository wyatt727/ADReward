package com.bytedance.sdk.openadsdk.core;

import android.content.Context;
import android.os.Build;
import android.os.LocaleList;
import android.text.TextUtils;
import java.util.Locale;

/* compiled from: IdUtils.java */
/* loaded from: classes2.dex */
public class MxO {
    private static String EYQ;
    private static boolean Kbd;
    private static String Pm;
    private static String Td;
    private static String mZx;

    private static Context Pm(Context context) {
        return context == null ? hu.EYQ() : context;
    }

    public static String EYQ(Context context) {
        if (!TextUtils.isEmpty(EYQ)) {
            return EYQ;
        }
        IPb(context);
        return EYQ;
    }

    public static String mZx(Context context) {
        if (Td == null && !Kbd) {
            synchronized (MxO.class) {
                if (!Kbd) {
                    Kbd(context);
                }
            }
        }
        return Td;
    }

    public static String Td(Context context) {
        if (TextUtils.isEmpty(Pm) && !Kbd) {
            synchronized (MxO.class) {
                if (!Kbd) {
                    Kbd(context);
                }
            }
        }
        return Pm;
    }

    public static void EYQ(Context context, String str) {
        if (!TextUtils.isEmpty(str) && !str.equals(EYQ)) {
            Td.EYQ(context).EYQ("did", str);
            EYQ = str;
        }
        if (TextUtils.isEmpty(EYQ)) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.Kbd.Td.mZx(EYQ);
        tp.EYQ(EYQ);
    }

    private static void Kbd(Context context) {
        Context contextPm;
        if (Kbd || (contextPm = Pm(context)) == null) {
            return;
        }
        mZx = mZx();
        Td = String.valueOf(Build.TIME);
        Pm = Td.EYQ(contextPm).mZx("uuid", (String) null);
        Kbd = true;
    }

    private static void IPb(Context context) {
        Context contextPm = Pm(context);
        if (contextPm == null) {
            return;
        }
        EYQ = Td.EYQ(contextPm).mZx("did", (String) null);
    }

    private static String mZx() {
        StringBuilder sb = new StringBuilder();
        try {
            if (com.bytedance.sdk.openadsdk.utils.WU.Kbd()) {
                sb.append("MIUI-");
            } else if (com.bytedance.sdk.openadsdk.utils.WU.mZx()) {
                sb.append("FLYME-");
            } else {
                String strNWX = com.bytedance.sdk.openadsdk.utils.WU.nWX();
                if (com.bytedance.sdk.openadsdk.utils.WU.EYQ(strNWX)) {
                    sb.append("EMUI-");
                }
                if (!TextUtils.isEmpty(strNWX)) {
                    sb.append(strNWX);
                    sb.append("-");
                }
            }
            sb.append(Build.VERSION.INCREMENTAL);
        } catch (Exception unused) {
        }
        return sb.toString();
    }

    public static String EYQ() {
        Locale locale;
        try {
            if (Build.VERSION.SDK_INT >= 24) {
                locale = LocaleList.getDefault().get(0);
            } else {
                locale = Locale.getDefault();
            }
            String language = locale != null ? locale.getLanguage() : "";
            if (locale == null || !"zh".equals(language)) {
                return language;
            }
            String string = locale.toString();
            if (locale.toString().length() >= 5) {
                string = string.substring(0, 5);
            }
            return Locale.SIMPLIFIED_CHINESE.toString().equals(string) ? "zh" : "zh-Hant";
        } catch (Throwable unused) {
            return "";
        }
    }
}
