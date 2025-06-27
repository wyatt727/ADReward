package com.bytedance.sdk.openadsdk.multipro.Pm;

import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.sdk.component.Kbd.EYQ.IPb;
import com.bytedance.sdk.component.utils.pi;
import com.bytedance.sdk.openadsdk.core.QQ;
import com.bytedance.sdk.openadsdk.core.hu;
import com.json.i5;
import java.util.HashSet;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: SPMultiHelper.java */
/* loaded from: classes2.dex */
public class EYQ {
    public static HashSet<String> EYQ = new HashSet<String>() { // from class: com.bytedance.sdk.openadsdk.multipro.Pm.EYQ.1
        {
            add("did");
            add("app_id");
            add("global_coppa");
            add("tt_gdpr");
            add("global_ccpa");
            add("keywords");
            add("extra_data");
            add(i5.w0);
            add("sdk_app_sha1");
            add("uuid");
            add("android_system_ua");
            add("sdk_local_web_ua");
            add("sdk_local_rom_info");
        }
    };

    public static boolean EYQ() {
        if (hu.EYQ() != null) {
            return true;
        }
        pi.mZx("The context of SPHelper is null, please initialize sdk in main process");
        return false;
    }

    private static IPb mZx() {
        try {
            if (EYQ()) {
                return com.bytedance.sdk.openadsdk.multipro.EYQ.EYQ.EYQ(hu.EYQ());
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Context Td() {
        return hu.EYQ();
    }

    private static String Pm() {
        return com.bytedance.sdk.openadsdk.multipro.Pm.mZx + "/t_sp/";
    }

    private static String mZx(String str) {
        return TextUtils.isEmpty(str) ? "" : "?sp_file_name=".concat(String.valueOf(str));
    }

    public static synchronized void EYQ(String str, String str2, Boolean bool) {
        if (EYQ()) {
            try {
                if (!com.bytedance.sdk.openadsdk.multipro.mZx.Td()) {
                    mZx.EYQ(Td(), str, str2, bool);
                    return;
                }
                IPb iPbMZx = mZx();
                if (iPbMZx != null) {
                    Uri uri = Uri.parse(Pm() + "boolean/" + str2 + mZx(str));
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("value", bool);
                    iPbMZx.EYQ(uri, contentValues, null, null);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public static synchronized void EYQ(String str, String str2, String str3) {
        if (EYQ()) {
            try {
                if (!com.bytedance.sdk.openadsdk.multipro.mZx.Td()) {
                    mZx.EYQ(Td(), str, str2, str3);
                    return;
                }
                IPb iPbMZx = mZx();
                if (iPbMZx != null) {
                    Uri uri = Uri.parse(Pm() + "string/" + str2 + mZx(str));
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("value", str3);
                    iPbMZx.EYQ(uri, contentValues, null, null);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public static synchronized void EYQ(String str, String str2, Integer num) {
        if (EYQ()) {
            try {
                if (!com.bytedance.sdk.openadsdk.multipro.mZx.Td()) {
                    mZx.EYQ(Td(), str, str2, num);
                    return;
                }
                IPb iPbMZx = mZx();
                if (iPbMZx != null) {
                    Uri uri = Uri.parse(Pm() + "int/" + str2 + mZx(str));
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("value", num);
                    iPbMZx.EYQ(uri, contentValues, null, null);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public static synchronized void EYQ(String str, String str2, Long l) {
        if (EYQ()) {
            try {
                if (!com.bytedance.sdk.openadsdk.multipro.mZx.Td()) {
                    mZx.EYQ(Td(), str, str2, l);
                    return;
                }
                IPb iPbMZx = mZx();
                if (iPbMZx != null) {
                    Uri uri = Uri.parse(Pm() + "long/" + str2 + mZx(str));
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("value", l);
                    iPbMZx.EYQ(uri, contentValues, null, null);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public static synchronized void EYQ(String str, String str2, Float f) {
        if (EYQ()) {
            try {
                if (!com.bytedance.sdk.openadsdk.multipro.mZx.Td()) {
                    mZx.EYQ(Td(), str, str2, f);
                    return;
                }
                IPb iPbMZx = mZx();
                if (iPbMZx != null) {
                    Uri uri = Uri.parse(Pm() + "float/" + str2 + mZx(str));
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("value", f);
                    iPbMZx.EYQ(uri, contentValues, null, null);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public static String mZx(String str, String str2, String str3) {
        if (!EYQ()) {
            return str3;
        }
        if (!com.bytedance.sdk.openadsdk.multipro.mZx.Td()) {
            return EYQ(Td(), str, str2, str3);
        }
        IPb iPbMZx = mZx();
        if (iPbMZx != null) {
            String strEYQ = iPbMZx.EYQ(Uri.parse(Pm() + "string/" + str2 + mZx(str)));
            if (strEYQ != null && !strEYQ.equals(AbstractJsonLexerKt.NULL)) {
                return strEYQ;
            }
        }
        return str3;
    }

    protected static String EYQ(Context context, String str, String str2, String str3) {
        String strEYQ = EYQ(str, str2);
        if (Build.VERSION.SDK_INT >= 19 && QQ.Kbd(strEYQ)) {
            return com.bytedance.sdk.component.mZx.EYQ(context, strEYQ).EYQ(str2, str3);
        }
        SharedPreferences sharedPreferencesEYQ = mZx.EYQ(context, strEYQ);
        return sharedPreferencesEYQ == null ? str3 : sharedPreferencesEYQ.getString(str2, str3);
    }

    public static String EYQ(String str, String str2) {
        return EYQ.contains(str2) ? "pag_sp_bad_par" : str;
    }

    public static int EYQ(String str, String str2, int i) {
        if (!EYQ()) {
            return i;
        }
        if (!com.bytedance.sdk.openadsdk.multipro.mZx.Td()) {
            return EYQ(Td(), str, str2, i);
        }
        IPb iPbMZx = mZx();
        if (iPbMZx != null) {
            String strEYQ = iPbMZx.EYQ(Uri.parse(Pm() + "int/" + str2 + mZx(str)));
            if (strEYQ != null && !strEYQ.equals(AbstractJsonLexerKt.NULL)) {
                return Integer.parseInt(strEYQ);
            }
        }
        return i;
    }

    protected static int EYQ(Context context, String str, String str2, int i) {
        String strEYQ = EYQ(str, str2);
        if (Build.VERSION.SDK_INT >= 19 && QQ.Kbd(strEYQ)) {
            return com.bytedance.sdk.component.mZx.EYQ(context, strEYQ).EYQ(str2, i);
        }
        SharedPreferences sharedPreferencesEYQ = mZx.EYQ(context, strEYQ);
        return sharedPreferencesEYQ == null ? i : sharedPreferencesEYQ.getInt(str2, i);
    }

    protected static float EYQ(Context context, String str, String str2, float f) {
        String strEYQ = EYQ(str, str2);
        if (Build.VERSION.SDK_INT >= 19 && QQ.Kbd(strEYQ)) {
            return com.bytedance.sdk.component.mZx.EYQ(context, strEYQ).EYQ(str2, f);
        }
        SharedPreferences sharedPreferencesEYQ = mZx.EYQ(context, strEYQ);
        return sharedPreferencesEYQ == null ? f : sharedPreferencesEYQ.getFloat(str2, f);
    }

    public static boolean EYQ(String str, String str2, boolean z) {
        if (!EYQ()) {
            return z;
        }
        if (!com.bytedance.sdk.openadsdk.multipro.mZx.Td()) {
            return EYQ(Td(), str, str2, z);
        }
        IPb iPbMZx = mZx();
        if (iPbMZx != null) {
            String strEYQ = iPbMZx.EYQ(Uri.parse(Pm() + "boolean/" + str2 + mZx(str)));
            if (strEYQ != null && !strEYQ.equals(AbstractJsonLexerKt.NULL)) {
                return Boolean.parseBoolean(strEYQ);
            }
        }
        return z;
    }

    protected static boolean EYQ(Context context, String str, String str2, boolean z) {
        String strEYQ = EYQ(str, str2);
        if (Build.VERSION.SDK_INT >= 19 && QQ.Kbd(strEYQ)) {
            return com.bytedance.sdk.component.mZx.EYQ(context, strEYQ).EYQ(str2, z);
        }
        SharedPreferences sharedPreferencesEYQ = mZx.EYQ(context, strEYQ);
        return sharedPreferencesEYQ == null ? z : sharedPreferencesEYQ.getBoolean(str2, z);
    }

    public static long EYQ(String str, String str2, long j) {
        if (!EYQ()) {
            return j;
        }
        if (!com.bytedance.sdk.openadsdk.multipro.mZx.Td()) {
            return EYQ(Td(), str, str2, j);
        }
        IPb iPbMZx = mZx();
        if (iPbMZx != null) {
            String strEYQ = iPbMZx.EYQ(Uri.parse(Pm() + "long/" + str2 + mZx(str)));
            if (strEYQ != null && !strEYQ.equals(AbstractJsonLexerKt.NULL)) {
                return Long.parseLong(strEYQ);
            }
        }
        return j;
    }

    protected static long EYQ(Context context, String str, String str2, long j) {
        String strEYQ = EYQ(str, str2);
        if (Build.VERSION.SDK_INT >= 19 && QQ.Kbd(strEYQ)) {
            return com.bytedance.sdk.component.mZx.EYQ(context, strEYQ).EYQ(str2, j);
        }
        SharedPreferences sharedPreferencesEYQ = mZx.EYQ(context, strEYQ);
        return sharedPreferencesEYQ == null ? j : sharedPreferencesEYQ.getLong(str2, j);
    }

    public static void mZx(String str, String str2) {
        if (EYQ()) {
            try {
                if (!com.bytedance.sdk.openadsdk.multipro.mZx.Td()) {
                    mZx.mZx(Td(), str, str2);
                    return;
                }
                IPb iPbMZx = mZx();
                if (iPbMZx != null) {
                    iPbMZx.EYQ(Uri.parse(Pm() + "long/" + str2 + mZx(str)), null, null);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public static void EYQ(String str) {
        if (EYQ()) {
            try {
                if (!com.bytedance.sdk.openadsdk.multipro.mZx.Td()) {
                    mZx.mZx(Td(), str);
                    return;
                }
                IPb iPbMZx = mZx();
                if (iPbMZx != null) {
                    iPbMZx.EYQ(Uri.parse(Pm() + "clean" + mZx(str)), null, null);
                }
            } catch (Throwable unused) {
            }
        }
    }
}
