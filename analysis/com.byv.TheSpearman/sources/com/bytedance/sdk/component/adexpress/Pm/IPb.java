package com.bytedance.sdk.component.adexpress.Pm;

import android.content.Context;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.bytedance.sdk.component.utils.zF;
import java.util.Locale;

/* compiled from: ScreenUtils.java */
/* loaded from: classes2.dex */
public class IPb {
    private static boolean EYQ;

    public static int EYQ(float f, float f2, float f3, float f4) {
        return (((int) ((f * 255.0f) + 0.5f)) << 24) | (((int) ((f2 * 255.0f) + 0.5f)) << 16) | (((int) ((f3 * 255.0f) + 0.5f)) << 8) | ((int) ((f4 * 255.0f) + 0.5f));
    }

    public static float EYQ(Context context, float f) {
        if (context == null) {
            context = com.bytedance.sdk.component.adexpress.EYQ.EYQ.EYQ.EYQ().Td().mZx();
        }
        return (f * Pm(context)) + 0.5f;
    }

    public static int mZx(Context context, float f) throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        if (context == null) {
            context = com.bytedance.sdk.component.adexpress.EYQ.EYQ.EYQ.EYQ().Td().mZx();
        }
        float fPm = Pm(context);
        if (fPm <= 0.0f) {
            fPm = 1.0f;
        }
        return (int) ((f / fPm) + 0.5f);
    }

    public static float Td(Context context, float f) {
        if (context == null) {
            context = com.bytedance.sdk.component.adexpress.EYQ.EYQ.EYQ.EYQ().Td().mZx();
        }
        return f * Pm(context);
    }

    private static float Pm(Context context) throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        try {
            if (EYQ) {
                context.getClassLoader().loadClass("android.util.DisplayMetrics").getDeclaredMethod("getDeviceDensity", new Class[0]).setAccessible(true);
                return ((Integer) r1.invoke(r0, new Object[0])).intValue() / 160.0f;
            }
        } catch (Exception unused) {
        }
        return context.getResources().getDisplayMetrics().density;
    }

    public static int EYQ(Context context) {
        if (context == null) {
            context = com.bytedance.sdk.component.adexpress.EYQ.EYQ.EYQ.EYQ().Td().mZx();
        }
        return context.getResources().getDisplayMetrics().widthPixels;
    }

    public static int mZx(Context context) {
        if (context == null) {
            context = com.bytedance.sdk.component.adexpress.EYQ.EYQ.EYQ.EYQ().Td().mZx();
        }
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        if (Build.VERSION.SDK_INT >= 17) {
            defaultDisplay.getRealMetrics(displayMetrics);
        } else {
            defaultDisplay.getMetrics(displayMetrics);
        }
        return displayMetrics.heightPixels;
    }

    public static String Td(Context context) {
        String language;
        Locale locale;
        try {
            if (Build.VERSION.SDK_INT >= 24) {
                locale = zF.mZx(context).getConfiguration().getLocales().get(0);
            } else {
                locale = Locale.getDefault();
            }
            language = locale.getLanguage();
            try {
                if (locale.getCountry().equals("TW")) {
                    language = "zhHant";
                }
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            language = "";
        }
        return EYQ(language);
    }

    private static String EYQ(String str) {
        str.hashCode();
        switch (str) {
            case "ar":
                return "aa";
            case "ja":
                return "japan";
            case "ko":
                return "korea";
            case "ms":
                return "my";
            case "zh":
                return "cn";
            default:
                return str;
        }
    }
}
