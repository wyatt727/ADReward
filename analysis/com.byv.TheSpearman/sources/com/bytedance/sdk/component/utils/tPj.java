package com.bytedance.sdk.component.utils;

import android.text.TextUtils;
import java.lang.reflect.Method;

/* compiled from: TTReflectUtils.java */
/* loaded from: classes2.dex */
public class tPj {
    public static Method EYQ(String str, String str2, Class<?>... clsArr) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        try {
            Class<?> clsEYQ = EYQ(str);
            if (clsEYQ != null) {
                return clsEYQ.getMethod(str2, clsArr);
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Class<?> EYQ(String str) {
        try {
            try {
                try {
                    return Class.forName(str, true, EYQ());
                } catch (ClassNotFoundException unused) {
                    return Class.forName(str);
                }
            } catch (ClassNotFoundException unused2) {
                return null;
            }
        } catch (ClassNotFoundException unused3) {
            return Class.forName(str, true, tPj.class.getClassLoader());
        }
    }

    private static ClassLoader EYQ() {
        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
        return contextClassLoader == null ? tPj.class.getClassLoader() : contextClassLoader;
    }
}
