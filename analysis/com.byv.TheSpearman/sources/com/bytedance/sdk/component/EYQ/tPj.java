package com.bytedance.sdk.component.EYQ;

import android.text.TextUtils;

/* compiled from: SerializeHelper.java */
/* loaded from: classes2.dex */
class tPj {
    private static boolean EYQ;

    static String EYQ() {
        return "";
    }

    static String EYQ(Throwable th) {
        StringBuilder sb = new StringBuilder("{\"code\":");
        sb.append(th instanceof Uc ? ((Uc) th).EYQ : 0);
        sb.append("}");
        return sb.toString();
    }

    static String EYQ(String str) {
        if (TextUtils.isEmpty(str)) {
            return "{\"code\":1}";
        }
        String strSubstring = EYQ ? str.substring(1, str.length() - 1) : "";
        String strConcat = "{\"code\":1,\"__data\":".concat(String.valueOf(str));
        if (!strSubstring.isEmpty()) {
            return strConcat + "," + strSubstring + "}";
        }
        return strConcat + "}";
    }

    static void EYQ(boolean z) {
        EYQ = z;
    }
}
