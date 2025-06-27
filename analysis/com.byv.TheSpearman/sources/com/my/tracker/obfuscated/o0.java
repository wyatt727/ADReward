package com.my.tracker.obfuscated;

import android.content.Context;
import android.os.Build;

/* loaded from: classes4.dex */
public final class o0 {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f4245a;
    public static final boolean b;

    static {
        int i = Build.VERSION.SDK_INT;
        f4245a = i <= 30;
        b = i <= 30 && !Build.MODEL.equals("Pixel 5");
    }

    public static boolean a() {
        if (Build.VERSION.SDK_INT >= 23) {
            return false;
        }
        String str = Build.MANUFACTURER;
        return "Xiaomi".equalsIgnoreCase(str) || "Meizu".equalsIgnoreCase(str);
    }

    public static boolean a(String str, Context context) {
        return context.checkCallingOrSelfPermission(str) == 0;
    }
}
