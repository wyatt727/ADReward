package com.my.tracker.obfuscated;

import android.content.Context;
import android.text.TextUtils;

/* loaded from: classes4.dex */
public final class x0 {
    public static <T> T a(Context context, String str, Class<T> cls) {
        try {
            return cls.cast(context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.get(str));
        } catch (Throwable th) {
            z0.a("SystemUtils: exception when access to application info with key - " + str, th);
            return null;
        }
    }

    public static String a(String str) {
        String str2;
        try {
            str2 = (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class).invoke(null, str);
        } catch (Throwable th) {
            z0.a("SystemUtils: error occurred when getting value for property - " + str, th);
        }
        if (!TextUtils.isEmpty(str2)) {
            return str2;
        }
        z0.a("SystemUtils: value in system properties is null for " + str);
        return null;
    }
}
