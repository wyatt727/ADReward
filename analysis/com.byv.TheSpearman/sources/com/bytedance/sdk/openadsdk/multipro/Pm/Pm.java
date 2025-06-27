package com.bytedance.sdk.openadsdk.multipro.Pm;

import android.content.SharedPreferences;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.sdk.component.mZx;
import com.bytedance.sdk.openadsdk.core.QQ;
import com.bytedance.sdk.openadsdk.core.hu;

/* compiled from: TTSaveHelper.java */
/* loaded from: classes2.dex */
public class Pm {
    private static boolean EYQ() {
        return hu.EYQ() == null;
    }

    private static String mZx(String str) {
        return TextUtils.isEmpty(str) ? "tt_sp" : str;
    }

    public static void EYQ(String str, String str2, Boolean bool) {
        if (EYQ()) {
            return;
        }
        if (com.bytedance.sdk.openadsdk.multipro.mZx.Td()) {
            EYQ.EYQ(mZx(str), str2, bool);
        } else {
            EYQ(mZx(str), str2, bool);
        }
    }

    public static void EYQ(String str, String str2, Long l) {
        if (EYQ()) {
            return;
        }
        if (com.bytedance.sdk.openadsdk.multipro.mZx.Td()) {
            EYQ.EYQ(mZx(str), str2, l);
        } else {
            EYQ(mZx(str), str2, l);
        }
    }

    public static void EYQ(String str, String str2, String str3) {
        if (EYQ()) {
            return;
        }
        if (com.bytedance.sdk.openadsdk.multipro.mZx.Td()) {
            EYQ.EYQ(mZx(str), str2, str3);
        } else {
            EYQ(mZx(str), str2, str3);
        }
    }

    public static void EYQ(String str, String str2, Integer num) {
        if (EYQ()) {
            return;
        }
        if (com.bytedance.sdk.openadsdk.multipro.mZx.Td()) {
            EYQ.EYQ(mZx(str), str2, num);
        } else {
            EYQ(mZx(str), str2, num);
        }
    }

    public static int EYQ(String str, String str2, int i) {
        if (EYQ()) {
            return i;
        }
        if (com.bytedance.sdk.openadsdk.multipro.mZx.Td()) {
            return EYQ.EYQ(mZx(str), str2, i);
        }
        return EYQ.EYQ(hu.EYQ(), mZx(str), str2, i);
    }

    public static boolean EYQ(String str, String str2, boolean z) {
        if (EYQ()) {
            return z;
        }
        if (com.bytedance.sdk.openadsdk.multipro.mZx.Td()) {
            return EYQ.EYQ(mZx(str), str2, z);
        }
        return EYQ.EYQ(hu.EYQ(), mZx(str), str2, z);
    }

    public static long EYQ(String str, String str2, long j) {
        if (EYQ()) {
            return j;
        }
        if (com.bytedance.sdk.openadsdk.multipro.mZx.Td()) {
            return EYQ.EYQ(mZx(str), str2, j);
        }
        return EYQ.EYQ(hu.EYQ(), mZx(str), str2, j);
    }

    public static String mZx(String str, String str2, String str3) {
        if (EYQ()) {
            return str3;
        }
        if (com.bytedance.sdk.openadsdk.multipro.mZx.Td()) {
            return EYQ.mZx(mZx(str), str2, str3);
        }
        return EYQ.EYQ(hu.EYQ(), mZx(str), str2, str3);
    }

    public static void EYQ(String str, String str2) {
        if (EYQ()) {
            return;
        }
        try {
            if (com.bytedance.sdk.openadsdk.multipro.mZx.Td()) {
                EYQ.mZx(mZx(str), str2);
            } else {
                mZx.mZx(hu.EYQ(), mZx(str), str2);
            }
        } catch (Throwable unused) {
        }
    }

    public static void EYQ(String str) {
        if (EYQ()) {
            return;
        }
        if (com.bytedance.sdk.openadsdk.multipro.mZx.Td()) {
            EYQ.EYQ(mZx(str));
        } else {
            mZx.mZx(hu.EYQ(), mZx(str));
        }
    }

    private static <T> void EYQ(String str, String str2, T t) {
        String strEYQ = EYQ.EYQ(str, str2);
        if (Build.VERSION.SDK_INT >= 19 && QQ.Kbd(strEYQ)) {
            mZx.Td tdMZx = com.bytedance.sdk.component.mZx.EYQ(hu.EYQ(), mZx(strEYQ)).mZx();
            mZx.EYQ(tdMZx, str2, (Object) t);
            tdMZx.apply();
        } else {
            SharedPreferences sharedPreferencesEYQ = mZx.EYQ(hu.EYQ(), mZx(strEYQ));
            if (sharedPreferencesEYQ == null) {
                return;
            }
            SharedPreferences.Editor editorEdit = sharedPreferencesEYQ.edit();
            mZx.EYQ(editorEdit, str2, t);
            editorEdit.apply();
        }
    }
}
