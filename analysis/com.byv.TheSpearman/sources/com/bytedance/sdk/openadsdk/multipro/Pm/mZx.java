package com.bytedance.sdk.openadsdk.multipro.Pm;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.text.TextUtils;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bytedance.sdk.component.mZx;
import com.bytedance.sdk.component.utils.pi;
import com.bytedance.sdk.openadsdk.core.QQ;
import java.lang.ref.SoftReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: SPMultiHelperImpl.java */
/* loaded from: classes2.dex */
class mZx {
    private static SoftReference<ConcurrentHashMap<String, Map<String, Object>>> EYQ;

    public static SharedPreferences EYQ(Context context, String str) {
        if (context == null) {
            return null;
        }
        try {
            return context.getSharedPreferences(EYQ(str), 0);
        } catch (Throwable th) {
            pi.EYQ("SPMultiHelperImpl", "getSharedPreferences error ", th.getMessage());
            return null;
        }
    }

    private static String EYQ(String str) {
        return TextUtils.isEmpty(str) ? "sphelper_ttopenadsdk" : str;
    }

    private static Object EYQ(String str, String str2) {
        ConcurrentHashMap<String, Map<String, Object>> concurrentHashMap;
        Map<String, Object> map;
        SoftReference<ConcurrentHashMap<String, Map<String, Object>>> softReference = EYQ;
        if (softReference == null || (concurrentHashMap = softReference.get()) == null || (map = concurrentHashMap.get(EYQ(str))) == null) {
            return null;
        }
        return map.get(str2);
    }

    private static void EYQ(String str, String str2, Object obj) {
        SoftReference<ConcurrentHashMap<String, Map<String, Object>>> softReference = EYQ;
        if (softReference == null || softReference.get() == null) {
            EYQ = new SoftReference<>(new ConcurrentHashMap());
        }
        String strEYQ = EYQ(str);
        ConcurrentHashMap<String, Map<String, Object>> concurrentHashMap = EYQ.get();
        if (concurrentHashMap.get(strEYQ) == null) {
            concurrentHashMap.put(strEYQ, new HashMap());
        }
        concurrentHashMap.get(strEYQ).put(str2, obj);
    }

    private static void mZx(String str) {
        Map<String, Object> map;
        SoftReference<ConcurrentHashMap<String, Map<String, Object>>> softReference = EYQ;
        if (softReference == null || softReference.get() == null || (map = EYQ.get().get(EYQ(str))) == null) {
            return;
        }
        map.clear();
    }

    static synchronized <T> void EYQ(Context context, String str, String str2, T t) {
        String strEYQ = EYQ.EYQ(str, str2);
        if (Build.VERSION.SDK_INT >= 19 && QQ.Kbd(strEYQ)) {
            com.bytedance.sdk.component.mZx mzxEYQ = com.bytedance.sdk.component.mZx.EYQ(context, strEYQ);
            if (t.equals(EYQ(strEYQ, str2))) {
                return;
            }
            mZx.Td tdMZx = mzxEYQ.mZx();
            EYQ(tdMZx, str2, (Object) t);
            tdMZx.apply();
            EYQ(strEYQ, str2, t);
            return;
        }
        SharedPreferences sharedPreferencesEYQ = EYQ(context, strEYQ);
        if (sharedPreferencesEYQ == null) {
            return;
        }
        if (t.equals(EYQ(strEYQ, str2))) {
            return;
        }
        SharedPreferences.Editor editorEdit = sharedPreferencesEYQ.edit();
        EYQ(editorEdit, str2, t);
        editorEdit.apply();
        EYQ(strEYQ, str2, t);
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected static <T> void EYQ(SharedPreferences.Editor editor, String str, T t) {
        if (t instanceof Integer) {
            editor.putInt(str, ((Integer) t).intValue());
        }
        if (t instanceof Long) {
            editor.putLong(str, ((Long) t).longValue());
        }
        if (t instanceof Float) {
            editor.putFloat(str, ((Float) t).floatValue());
        }
        if (t instanceof Boolean) {
            editor.putBoolean(str, ((Boolean) t).booleanValue());
        }
        if (t instanceof String) {
            editor.putString(str, (String) t);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected static <T> void EYQ(mZx.Td td, String str, T t) {
        if (t instanceof Integer) {
            td.putInt(str, ((Integer) t).intValue());
        }
        if (t instanceof Long) {
            td.putLong(str, ((Long) t).longValue());
        }
        if (t instanceof Float) {
            td.putFloat(str, ((Float) t).floatValue());
        }
        if (t instanceof Boolean) {
            td.putBoolean(str, ((Boolean) t).booleanValue());
        }
        if (t instanceof String) {
            td.putString(str, (String) t);
        }
    }

    static String EYQ(Context context, String str, String str2, String str3) {
        Object objEYQ = EYQ(str, str2);
        if (objEYQ != null) {
            return String.valueOf(objEYQ);
        }
        Object objMZx = mZx(context, str, str2, str3);
        EYQ(str, str2, objMZx);
        return String.valueOf(objMZx);
    }

    private static Object mZx(Context context, String str, String str2, String str3) {
        String strEYQ = EYQ(str);
        if (!EYQ(context, strEYQ, str2)) {
            return null;
        }
        if (str3.equalsIgnoreCase(TypedValues.Custom.S_STRING)) {
            return EYQ.EYQ(context, strEYQ, str2, (String) null);
        }
        if (str3.equalsIgnoreCase(TypedValues.Custom.S_BOOLEAN)) {
            return Boolean.valueOf(EYQ.EYQ(context, strEYQ, str2, false));
        }
        if (str3.equalsIgnoreCase("int")) {
            return Integer.valueOf(EYQ.EYQ(context, strEYQ, str2, 0));
        }
        if (str3.equalsIgnoreCase("long")) {
            return Long.valueOf(EYQ.EYQ(context, strEYQ, str2, 0L));
        }
        if (str3.equalsIgnoreCase(TypedValues.Custom.S_FLOAT)) {
            return Float.valueOf(EYQ.EYQ(context, strEYQ, str2, 0.0f));
        }
        if (str3.equalsIgnoreCase("string_set")) {
            return EYQ.EYQ(context, strEYQ, str2, (String) null);
        }
        return null;
    }

    static boolean EYQ(Context context, String str, String str2) {
        String strEYQ = EYQ.EYQ(str, str2);
        if (Build.VERSION.SDK_INT >= 19 && QQ.Kbd(strEYQ)) {
            return com.bytedance.sdk.component.mZx.EYQ(context, strEYQ).EYQ(str2);
        }
        SharedPreferences sharedPreferencesEYQ = EYQ(context, strEYQ);
        return sharedPreferencesEYQ != null && sharedPreferencesEYQ.contains(str2);
    }

    public static void mZx(Context context, String str, String str2) {
        try {
            String strEYQ = EYQ.EYQ(str, str2);
            if (Build.VERSION.SDK_INT >= 19 && QQ.Kbd(strEYQ)) {
                com.bytedance.sdk.component.mZx.EYQ(context, strEYQ).mZx().remove(str2).apply();
                return;
            }
            SharedPreferences sharedPreferencesEYQ = EYQ(context, strEYQ);
            if (sharedPreferencesEYQ == null) {
                return;
            }
            SharedPreferences.Editor editorEdit = sharedPreferencesEYQ.edit();
            editorEdit.remove(str2);
            editorEdit.apply();
            SoftReference<ConcurrentHashMap<String, Map<String, Object>>> softReference = EYQ;
            if (softReference == null || softReference.get() == null) {
                return;
            }
            Map<String, Object> map = EYQ.get().get(EYQ(strEYQ));
            if (map != null && map.size() != 0) {
                map.remove(str2);
            }
        } catch (Throwable unused) {
        }
    }

    static void mZx(Context context, String str) {
        if (Build.VERSION.SDK_INT >= 19 && QQ.Kbd(str)) {
            com.bytedance.sdk.component.mZx.EYQ(context, str).mZx().clear().apply();
            mZx(str);
            return;
        }
        SharedPreferences sharedPreferencesEYQ = EYQ(context, str);
        if (sharedPreferencesEYQ == null) {
            return;
        }
        SharedPreferences.Editor editorEdit = sharedPreferencesEYQ.edit();
        editorEdit.clear();
        editorEdit.apply();
        mZx(str);
    }

    static Map<String, ?> Td(Context context, String str) {
        SharedPreferences sharedPreferencesEYQ = EYQ(context, str);
        if (sharedPreferencesEYQ == null) {
            return null;
        }
        return sharedPreferencesEYQ.getAll();
    }
}
