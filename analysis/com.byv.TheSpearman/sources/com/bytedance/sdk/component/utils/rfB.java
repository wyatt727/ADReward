package com.bytedance.sdk.component.utils;

import android.content.Context;
import android.text.TextUtils;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* compiled from: X2CUtils.java */
/* loaded from: classes2.dex */
public class rfB {
    public static final Class<?>[] EYQ;
    private static final HashMap<Class<?>, Class<?>> Td;
    private static Map<String, Method> mZx = new HashMap();

    static {
        HashMap<Class<?>, Class<?>> map = new HashMap<>();
        Td = map;
        map.put(Boolean.TYPE, Boolean.class);
        map.put(Byte.TYPE, Byte.class);
        map.put(Character.TYPE, Character.class);
        map.put(Short.TYPE, Short.class);
        map.put(Integer.TYPE, Integer.class);
        map.put(Long.TYPE, Long.class);
        map.put(Double.TYPE, Double.class);
        map.put(Float.TYPE, Float.class);
        map.put(Void.TYPE, Void.class);
        EYQ = new Class[0];
    }

    public static int EYQ(Context context, float f) {
        return (int) ((f * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    private static String mZx(Class<?> cls, String str, Class<?>... clsArr) {
        StringBuilder sb = new StringBuilder();
        sb.append(cls.toString());
        sb.append("#");
        sb.append(str);
        sb.append("#");
        sb.append(cls.getClassLoader() != null ? Integer.valueOf(cls.getClassLoader().hashCode()) : "");
        if (clsArr != null && clsArr.length > 0) {
            for (Class<?> cls2 : clsArr) {
                sb.append(cls2.toString());
                sb.append("#");
            }
        } else {
            sb.append(Void.class.toString());
        }
        return sb.toString();
    }

    public static Method EYQ(Class<?> cls, String str, Class<?>... clsArr) throws NoSuchMethodException, SecurityException {
        Method declaredMethod;
        String strMZx = mZx(cls, str, clsArr);
        synchronized (mZx) {
            declaredMethod = mZx.get(strMZx);
        }
        if (declaredMethod != null) {
            if (!declaredMethod.isAccessible()) {
                declaredMethod.setAccessible(true);
            }
            return declaredMethod;
        }
        while (cls != null) {
            try {
                declaredMethod = cls.getDeclaredMethod(str, clsArr);
            } catch (NoSuchMethodException unused) {
            }
            if (declaredMethod == null) {
                try {
                    for (Method method : cls.getDeclaredMethods()) {
                        if (method != null && TextUtils.equals(method.getName(), str)) {
                            Class<?>[] parameterTypes = method.getParameterTypes();
                            if (clsArr != null && parameterTypes != null && clsArr.length == parameterTypes.length) {
                                boolean z = true;
                                for (int i = 0; i < clsArr.length; i++) {
                                    if (!EYQ(clsArr[i], parameterTypes[i])) {
                                        z = false;
                                    }
                                }
                                if (z) {
                                    declaredMethod = method;
                                }
                            }
                        }
                    }
                } catch (Throwable unused2) {
                }
            }
            if (declaredMethod != null) {
                declaredMethod.setAccessible(true);
                synchronized (mZx) {
                    mZx.put(strMZx, declaredMethod);
                }
                return declaredMethod;
            }
            cls = cls.getSuperclass();
        }
        return null;
    }

    public static boolean EYQ(Class<?> cls, Class<?> cls2) {
        if (cls2 == null) {
            return false;
        }
        if (cls == null) {
            return !cls2.isPrimitive();
        }
        if (cls.isPrimitive() && !cls2.isPrimitive()) {
            cls = Td.get(cls);
        }
        if (cls2.isPrimitive() && !cls.isPrimitive()) {
            cls2 = Td.get(cls2);
        }
        return cls2.isAssignableFrom(cls);
    }

    public static Object EYQ(Object obj, String str, Object... objArr) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        return EYQ(obj, str, objArr, EYQ(objArr));
    }

    public static Object EYQ(Object obj, String str, Object[] objArr, Class<?>[] clsArr) throws IllegalAccessException, NoSuchMethodException, SecurityException, InvocationTargetException {
        Method methodEYQ = EYQ(obj.getClass(), str, clsArr);
        if (methodEYQ != null) {
            return methodEYQ.invoke(obj, objArr);
        }
        throw new NoSuchMethodException(str);
    }

    public static Class<?>[] EYQ(Object... objArr) {
        if (objArr != null && objArr.length != 0) {
            Class<?>[] clsArr = new Class[objArr.length];
            for (int i = 0; i < objArr.length; i++) {
                clsArr[i] = objArr[i] == null ? null : objArr[i].getClass();
            }
            return clsArr;
        }
        return EYQ;
    }
}
