package com.pgl.ssdk;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public class O {

    /* renamed from: a, reason: collision with root package name */
    private static final Map f4296a;

    static {
        HashMap map = new HashMap();
        f4296a = map;
        map.put(Boolean.class, Boolean.TYPE);
        map.put(Byte.class, Byte.TYPE);
        map.put(Character.class, Character.TYPE);
        map.put(Short.class, Short.TYPE);
        map.put(Integer.class, Integer.TYPE);
        map.put(Float.class, Float.TYPE);
        map.put(Long.class, Long.TYPE);
        map.put(Double.class, Double.TYPE);
        Class cls = Boolean.TYPE;
        map.put(cls, cls);
        Class cls2 = Byte.TYPE;
        map.put(cls2, cls2);
        Class cls3 = Character.TYPE;
        map.put(cls3, cls3);
        Class cls4 = Short.TYPE;
        map.put(cls4, cls4);
        Class cls5 = Integer.TYPE;
        map.put(cls5, cls5);
        Class cls6 = Float.TYPE;
        map.put(cls6, cls6);
        Class cls7 = Long.TYPE;
        map.put(cls7, cls7);
        Class cls8 = Double.TYPE;
        map.put(cls8, cls8);
    }

    public static void a(Class cls, String str, Object... objArr) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Class[] clsArr;
        Object[] objArr2;
        if (objArr == null || objArr.length <= 0) {
            clsArr = null;
        } else {
            clsArr = new Class[objArr.length];
            for (int i = 0; i < objArr.length; i++) {
                Object obj = objArr[i];
                if (obj == null || !(obj instanceof N)) {
                    clsArr[i] = obj == null ? null : obj.getClass();
                } else {
                    clsArr[i] = ((N) obj).f4295a;
                }
            }
        }
        Method methodA = a(cls, str, clsArr);
        if (objArr == null || objArr.length <= 0) {
            objArr2 = null;
        } else {
            objArr2 = new Object[objArr.length];
            for (int i2 = 0; i2 < objArr.length; i2++) {
                Object obj2 = objArr[i2];
                if (obj2 == null || !(obj2 instanceof N)) {
                    objArr2[i2] = obj2;
                } else {
                    objArr2[i2] = ((N) obj2).b;
                }
            }
        }
        methodA.invoke(null, objArr2);
    }

    public static void a(String str, String str2, Object... objArr) {
        try {
            a(Class.forName(str), str2, objArr);
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.reflect.Method a(java.lang.Class r11, java.lang.String r12, java.lang.Class... r13) throws java.lang.NoSuchMethodException, java.lang.SecurityException {
        /*
            java.lang.reflect.Method[] r0 = r11.getDeclaredMethods()
            java.lang.String r1 = "Method name must not be null."
            java.util.Objects.requireNonNull(r12, r1)
            int r1 = r0.length
            r2 = 0
            r3 = r2
        Lc:
            r4 = 1
            if (r3 >= r1) goto L69
            r5 = r0[r3]
            java.lang.String r6 = r5.getName()
            boolean r6 = r6.equals(r12)
            if (r6 == 0) goto L66
            java.lang.Class[] r6 = r5.getParameterTypes()
            if (r6 != 0) goto L27
            if (r13 == 0) goto L61
            int r6 = r13.length
            if (r6 != 0) goto L63
            goto L61
        L27:
            if (r13 != 0) goto L2d
            int r6 = r6.length
            if (r6 != 0) goto L63
            goto L61
        L2d:
            int r7 = r6.length
            int r8 = r13.length
            if (r7 != r8) goto L63
            r7 = r2
        L32:
            int r8 = r6.length
            if (r7 >= r8) goto L61
            r8 = r6[r7]
            r9 = r13[r7]
            boolean r8 = r8.isAssignableFrom(r9)
            if (r8 != 0) goto L5e
            java.util.Map r8 = com.pgl.ssdk.O.f4296a
            r9 = r6[r7]
            boolean r9 = r8.containsKey(r9)
            if (r9 == 0) goto L63
            r9 = r6[r7]
            java.lang.Object r9 = r8.get(r9)
            java.lang.Class r9 = (java.lang.Class) r9
            r10 = r13[r7]
            java.lang.Object r8 = r8.get(r10)
            boolean r8 = r9.equals(r8)
            if (r8 != 0) goto L5e
            goto L63
        L5e:
            int r7 = r7 + 1
            goto L32
        L61:
            r6 = r4
            goto L64
        L63:
            r6 = r2
        L64:
            if (r6 != 0) goto L6a
        L66:
            int r3 = r3 + 1
            goto Lc
        L69:
            r5 = 0
        L6a:
            if (r5 != 0) goto L81
            java.lang.Class r0 = r11.getSuperclass()
            if (r0 == 0) goto L7b
            java.lang.Class r11 = r11.getSuperclass()
            java.lang.reflect.Method r11 = a(r11, r12, r13)
            return r11
        L7b:
            java.lang.NoSuchMethodException r11 = new java.lang.NoSuchMethodException
            r11.<init>()
            throw r11
        L81:
            r5.setAccessible(r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pgl.ssdk.O.a(java.lang.Class, java.lang.String, java.lang.Class[]):java.lang.reflect.Method");
    }
}
