package com.pgl.ssdk;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* loaded from: classes4.dex */
public final class P {

    /* renamed from: a, reason: collision with root package name */
    private static Method f4297a;
    private static Method b;
    private static Method c;

    static {
        try {
            f4297a = Class.class.getDeclaredMethod("forName", String.class);
            b = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, Class[].class);
            c = Class.class.getDeclaredMethod("getDeclaredField", String.class);
        } catch (NoSuchMethodException | NullPointerException unused) {
        }
    }

    public static Object a(Object obj, Class cls, String str, Object obj2) {
        Field field;
        try {
            if (a()) {
                try {
                    field = (Field) c.invoke(cls, str);
                    try {
                        field.setAccessible(true);
                    } catch (Throwable unused) {
                    }
                } catch (Throwable unused2) {
                }
            } else {
                field = null;
            }
            if (field == null) {
                return null;
            }
            field.setAccessible(true);
            return field.get(null);
        } catch (Throwable unused3) {
            return null;
        }
    }

    private static boolean a() {
        return (f4297a == null || b == null || c == null) ? false : true;
    }

    public static Object a(Object obj, Class cls, String str, Class[] clsArr, Object... objArr) {
        Method method;
        try {
            if (a()) {
                try {
                    method = (Method) b.invoke(cls, str, clsArr);
                    try {
                        method.setAccessible(true);
                    } catch (Throwable unused) {
                    }
                } catch (Throwable unused2) {
                }
            } else {
                method = null;
            }
            if (method != null) {
                return method.invoke(obj, objArr);
            }
            return null;
        } catch (Throwable unused3) {
            return null;
        }
    }
}
