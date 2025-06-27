package com.bytedance.sdk.component.utils;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import java.util.Locale;

/* compiled from: LanguageUtils.java */
/* loaded from: classes2.dex */
public class tp {
    private static Context EYQ;

    public static void EYQ(Context context, String str, String str2) {
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        try {
            Configuration configurationMZx = mZx(context, str, str2);
            if (Build.VERSION.SDK_INT >= 17) {
                EYQ = context.createConfigurationContext(configurationMZx);
            }
        } catch (Throwable th) {
            pi.mZx(th.getMessage());
        }
        zF.EYQ(EYQ);
    }

    private static Configuration mZx(Context context, String str, String str2) {
        Configuration configuration = new Configuration(context.getResources().getConfiguration());
        if (Build.VERSION.SDK_INT >= 17) {
            configuration.setLocale(new Locale(str, str2));
        }
        return configuration;
    }
}
