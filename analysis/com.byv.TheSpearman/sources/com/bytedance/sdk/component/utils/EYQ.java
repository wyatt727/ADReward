package com.bytedance.sdk.component.utils;

import android.os.Build;
import android.text.TextUtils;
import java.security.SecureRandom;
import java.util.Random;
import org.json.JSONObject;

/* compiled from: AESUtils.java */
/* loaded from: classes2.dex */
public class EYQ {

    /* compiled from: AESUtils.java */
    /* renamed from: com.bytedance.sdk.component.utils.EYQ$EYQ, reason: collision with other inner class name */
    static class C0101EYQ {
        static final Random EYQ = EYQ.Td();
    }

    public static JSONObject EYQ(JSONObject jSONObject) {
        if (jSONObject == null) {
            return new JSONObject();
        }
        return EYQ(jSONObject.toString());
    }

    public static JSONObject EYQ(String str) {
        JSONObject jSONObject = new JSONObject();
        if (TextUtils.isEmpty(str)) {
            return jSONObject;
        }
        try {
            try {
                String strMZx = mZx(str);
                if (!TextUtils.isEmpty(strMZx)) {
                    jSONObject.put("message", strMZx);
                    jSONObject.put("cypher", 3);
                } else {
                    jSONObject.put("message", str);
                    jSONObject.put("cypher", 0);
                }
            } catch (Throwable th) {
                th.getMessage();
            }
        } catch (Throwable unused) {
            jSONObject.put("message", str);
            jSONObject.put("cypher", 0);
        }
        return jSONObject;
    }

    public static String mZx(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        String strEYQ = EYQ();
        String strEYQ2 = EYQ(strEYQ, 32);
        String strMZx = mZx();
        String strEYQ3 = null;
        if (strEYQ2 != null && strMZx != null) {
            strEYQ3 = com.bytedance.sdk.component.Td.EYQ.EYQ(str, strMZx, strEYQ2);
        }
        return 3 + strEYQ + strMZx + strEYQ3;
    }

    public static String Td(String str) {
        if (TextUtils.isEmpty(str) || str.length() < 49) {
            return str;
        }
        String strEYQ = EYQ(str.substring(1, 33), 32);
        String strSubstring = str.substring(33, 49);
        return (strSubstring == null || strEYQ == null) ? str : com.bytedance.sdk.component.Td.EYQ.mZx(str.substring(49), strSubstring, strEYQ);
    }

    public static String EYQ() {
        String strEYQ = EYQ(16);
        if (strEYQ == null || strEYQ.length() != 32) {
            return null;
        }
        return strEYQ;
    }

    public static String EYQ(String str, int i) {
        if (str == null || str.length() != i) {
            return null;
        }
        int i2 = i / 2;
        return str.substring(i2, i) + str.substring(0, i2);
    }

    public static String mZx() {
        String strEYQ = EYQ(8);
        if (strEYQ == null || strEYQ.length() != 16) {
            return null;
        }
        return strEYQ;
    }

    public static String EYQ(int i) {
        try {
            byte[] bArr = new byte[i];
            C0101EYQ.EYQ.nextBytes(bArr);
            return Kbd.EYQ(bArr);
        } catch (Exception unused) {
            return null;
        }
    }

    public static Random Td() {
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                return SecureRandom.getInstanceStrong();
            } catch (Throwable unused) {
                return new SecureRandom();
            }
        }
        return new SecureRandom();
    }
}
