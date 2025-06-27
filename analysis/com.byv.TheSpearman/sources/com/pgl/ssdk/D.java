package com.pgl.ssdk;

import android.content.Context;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.lang.reflect.Method;

/* loaded from: classes4.dex */
public class D {

    /* renamed from: a, reason: collision with root package name */
    private static double f4287a = -1.0d;

    public static String a(Context context) {
        int i;
        double d = f4287a;
        double dDoubleValue = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        if (d >= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            i = (int) d;
        } else {
            try {
                Class<?> cls = Class.forName("com.android.internal.os.PowerProfile");
                Object objNewInstance = cls.getConstructor(Context.class).newInstance(context);
                Method declaredMethod = cls.getDeclaredMethod("getAveragePower", String.class);
                declaredMethod.setAccessible(true);
                dDoubleValue = ((Double) declaredMethod.invoke(objNewInstance, "battery.capacity")).doubleValue();
            } catch (Throwable unused) {
            }
            f4287a = dDoubleValue;
            i = (int) dDoubleValue;
        }
        return Integer.toString(i);
    }
}
