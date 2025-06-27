package com.applovin.impl;

import android.os.Bundle;
import android.os.IBinder;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public abstract class l2 {

    /* renamed from: a, reason: collision with root package name */
    private static Method f615a;

    public static IBinder a(Bundle bundle, String str) {
        return yp.f1214a >= 18 ? bundle.getBinder(str) : b(bundle, str);
    }

    private static IBinder b(Bundle bundle, String str) throws NoSuchMethodException, SecurityException {
        Method method = f615a;
        if (method == null) {
            try {
                Method method2 = Bundle.class.getMethod("getIBinder", String.class);
                f615a = method2;
                method2.setAccessible(true);
                method = f615a;
            } catch (NoSuchMethodException e) {
                kc.b("BundleUtil", "Failed to retrieve getIBinder method", e);
                return null;
            }
        }
        try {
            return (IBinder) method.invoke(bundle, str);
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e2) {
            kc.b("BundleUtil", "Failed to invoke getIBinder via reflection", e2);
            return null;
        }
    }
}
