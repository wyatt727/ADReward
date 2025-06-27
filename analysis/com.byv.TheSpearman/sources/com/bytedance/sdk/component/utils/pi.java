package com.bytedance.sdk.component.utils;

import android.text.TextUtils;
import android.util.Log;
import com.json.t2;

/* compiled from: Logger.java */
/* loaded from: classes2.dex */
public class pi {
    private static boolean EYQ = false;
    private static String Pm = "";
    private static com.bytedance.sdk.component.EYQ Td = null;
    private static int mZx = 4;

    public static void EYQ(String str) {
        Pm = str;
    }

    public static void EYQ(int i) {
        mZx = i;
    }

    public static boolean EYQ() {
        return mZx <= 3;
    }

    public static void mZx() {
        EYQ = true;
        EYQ(3);
    }

    public static void Td() {
        EYQ = false;
        EYQ(7);
    }

    public static boolean Pm() {
        return EYQ;
    }

    public static void mZx(String str) {
        if (EYQ) {
            EYQ("Logger", str);
        }
    }

    public static void EYQ(String str, String str2) {
        if (Td != null) {
            Td(str);
        }
        if (EYQ && str2 != null && mZx <= 6) {
            Log.e(Td(str), str2);
        }
    }

    public static void EYQ(String str, String str2, String str3, Throwable th) {
        if (EYQ) {
            EYQ(mZx(str, str2), str3, th);
        }
    }

    public static void EYQ(String str, String str2, Throwable th) {
        if (Td != null) {
            Td(str);
        }
        if (EYQ) {
            if (!(str2 == null && th == null) && mZx <= 6) {
                Log.e(Td(str), str2, th);
            }
        }
    }

    public static void EYQ(String str, Object... objArr) {
        if (Td != null) {
            Td(str);
            EYQ(objArr);
        }
        if (EYQ && objArr != null && mZx <= 6) {
            Log.e(Td(str), EYQ(objArr));
        }
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

    public static String Td(String str) {
        if (TextUtils.isEmpty(Pm)) {
            return str;
        }
        return EYQ(t2.i.d + Pm + "]-[" + str + t2.i.e);
    }

    public static String mZx(String str, String str2) {
        if (TextUtils.isEmpty(Pm)) {
            return str;
        }
        return EYQ(str2 + "]-[" + str);
    }
}
