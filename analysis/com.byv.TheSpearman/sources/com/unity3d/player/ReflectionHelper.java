package com.unity3d.player;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.json.mediationsdk.logger.IronSourceError;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes4.dex */
final class ReflectionHelper {
    protected static boolean LOG = false;
    protected static final boolean LOGV = false;

    /* renamed from: a, reason: collision with root package name */
    private static b[] f4351a = new b[4096];
    private static long b = 0;
    private static long c = 0;
    private static boolean d = false;

    class a implements d {

        /* renamed from: a, reason: collision with root package name */
        private Runnable f4352a;
        private UnityPlayer b;
        private long c;
        private long d;
        private boolean e;
        final /* synthetic */ long f;

        a(long j, UnityPlayer unityPlayer, Class[] clsArr) {
            this.f = j;
            long j2 = ReflectionHelper.b;
            this.f4352a = new c(j2, j);
            this.b = unityPlayer;
            this.c = j2;
        }

        private Object a(Object obj, Method method, Object[] objArr) throws NoSuchMethodException, SecurityException {
            if (objArr == null) {
                try {
                    objArr = new Object[0];
                } catch (NoClassDefFoundError unused) {
                    AbstractC1536u.Log(6, String.format("Java interface default methods are only supported since Android Oreo", new Object[0]));
                    ReflectionHelper.nativeProxyLogJNIInvokeException(this.d);
                    return null;
                }
            }
            Class<?> declaringClass = method.getDeclaringClass();
            Constructor declaredConstructor = MethodHandles.Lookup.class.getDeclaredConstructor(Class.class, Integer.TYPE);
            declaredConstructor.setAccessible(true);
            return ((MethodHandles.Lookup) declaredConstructor.newInstance(declaringClass, 2)).in(declaringClass).unreflectSpecial(method, declaringClass).bindTo(obj).invokeWithArguments(objArr);
        }

        protected void finalize() throws Throwable {
            this.b.queueGLThreadEvent(this.f4352a);
            super.finalize();
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            long j;
            if (!ReflectionHelper.beginProxyCall(this.c)) {
                AbstractC1536u.Log(6, "Scripting proxy object was destroyed, because Unity player was unloaded.");
                return null;
            }
            try {
                this.d = 0L;
                this.e = false;
                Object objNativeProxyInvoke = ReflectionHelper.nativeProxyInvoke(this.f, method.getName(), objArr);
                if (!this.e) {
                    j = this.d;
                    if (j != 0) {
                    }
                    return objNativeProxyInvoke;
                }
                if ((method.getModifiers() & 1024) == 0) {
                    return a(obj, method, objArr);
                }
                j = this.d;
                ReflectionHelper.nativeProxyLogJNIInvokeException(j);
                return objNativeProxyInvoke;
            } finally {
                ReflectionHelper.endProxyCall();
            }
        }
    }

    private static class b {

        /* renamed from: a, reason: collision with root package name */
        private final Class f4353a;
        private final String b;
        private final String c;
        private final int d;
        public volatile Member e;

        b(Class cls, String str, String str2) {
            this.f4353a = cls;
            this.b = str;
            this.c = str2;
            this.d = ((((cls.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + str.hashCode()) * 31) + str2.hashCode();
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.d == bVar.d && this.c.equals(bVar.c) && this.b.equals(bVar.b) && this.f4353a.equals(bVar.f4353a);
        }

        public int hashCode() {
            return this.d;
        }
    }

    private static class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final long f4354a;
        final long b;

        public c(long j, long j2) {
            this.f4354a = j;
            this.b = j2;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (ReflectionHelper.beginProxyCall(this.f4354a)) {
                try {
                    ReflectionHelper.nativeProxyFinalize(this.b);
                } finally {
                    ReflectionHelper.endProxyCall();
                }
            }
        }
    }

    protected interface d extends InvocationHandler {
    }

    private static float a(Class cls, Class cls2) {
        if (cls.equals(cls2)) {
            return 1.0f;
        }
        if (cls.isPrimitive() || cls2.isPrimitive()) {
            return 0.0f;
        }
        try {
            if (cls.asSubclass(cls2) != null) {
                return 0.5f;
            }
        } catch (ClassCastException unused) {
        }
        try {
            return cls2.asSubclass(cls) != null ? 0.1f : 0.0f;
        } catch (ClassCastException unused2) {
            return 0.0f;
        }
    }

    private static float a(Class cls, Class[] clsArr, Class[] clsArr2) {
        if (clsArr2.length == 0) {
            return 0.1f;
        }
        int i = 0;
        if ((clsArr == null ? 0 : clsArr.length) + 1 != clsArr2.length) {
            return 0.0f;
        }
        float f = 1.0f;
        if (clsArr != null) {
            int length = clsArr.length;
            float fA = 1.0f;
            int i2 = 0;
            while (i < length) {
                fA *= a(clsArr[i], clsArr2[i2]);
                i++;
                i2++;
            }
            f = fA;
        }
        return f * a(cls, clsArr2[clsArr2.length - 1]);
    }

    private static Class a(String str, int[] iArr) {
        while (iArr[0] < str.length()) {
            int i = iArr[0];
            iArr[0] = i + 1;
            char cCharAt = str.charAt(i);
            if (cCharAt != '(' && cCharAt != ')') {
                if (cCharAt == 'L') {
                    int iIndexOf = str.indexOf(59, iArr[0]);
                    if (iIndexOf == -1) {
                        return null;
                    }
                    String strSubstring = str.substring(iArr[0], iIndexOf);
                    iArr[0] = iIndexOf + 1;
                    try {
                        return Class.forName(strSubstring.replace('/', '.'));
                    } catch (ClassNotFoundException unused) {
                        return null;
                    }
                }
                if (cCharAt == 'Z') {
                    return Boolean.TYPE;
                }
                if (cCharAt == 'I') {
                    return Integer.TYPE;
                }
                if (cCharAt == 'F') {
                    return Float.TYPE;
                }
                if (cCharAt == 'V') {
                    return Void.TYPE;
                }
                if (cCharAt == 'B') {
                    return Byte.TYPE;
                }
                if (cCharAt == 'C') {
                    return Character.TYPE;
                }
                if (cCharAt == 'S') {
                    return Short.TYPE;
                }
                if (cCharAt == 'J') {
                    return Long.TYPE;
                }
                if (cCharAt == 'D') {
                    return Double.TYPE;
                }
                if (cCharAt == '[') {
                    return Array.newInstance((Class<?>) a(str, iArr), 0).getClass();
                }
                AbstractC1536u.Log(5, "! parseType; " + cCharAt + " is not known!");
                return null;
            }
        }
        return null;
    }

    private static synchronized boolean a(b bVar) {
        b[] bVarArr = f4351a;
        b bVar2 = bVarArr[bVar.d & (bVarArr.length - 1)];
        if (!bVar.equals(bVar2)) {
            return false;
        }
        bVar.e = bVar2.e;
        return true;
    }

    private static Class[] a(String str) {
        Class clsA;
        int i = 0;
        int[] iArr = {0};
        ArrayList arrayList = new ArrayList();
        while (iArr[0] < str.length() && (clsA = a(str, iArr)) != null) {
            arrayList.add(clsA);
        }
        Class[] clsArr = new Class[arrayList.size()];
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            clsArr[i] = (Class) it.next();
            i++;
        }
        return clsArr;
    }

    protected static synchronized boolean beginProxyCall(long j) {
        boolean z;
        if (j == b) {
            c++;
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    protected static synchronized void endProxyCall() {
        long j = c - 1;
        c = j;
        if (0 == j && d) {
            ReflectionHelper.class.notifyAll();
        }
    }

    protected static synchronized void endUnityLaunch() {
        try {
            b++;
            d = true;
            while (c > 0) {
                ReflectionHelper.class.wait();
            }
        } catch (InterruptedException unused) {
            AbstractC1536u.Log(6, "Interrupted while waiting for all proxies to exit.");
        }
        d = false;
    }

    protected static Constructor getConstructorID(Class cls, String str) throws SecurityException {
        Constructor<?> constructor;
        b bVar = new b(cls, "", str);
        if (a(bVar)) {
            constructor = (Constructor) bVar.e;
        } else {
            Class[] clsArrA = a(str);
            float f = 0.0f;
            Constructor<?> constructor2 = null;
            for (Constructor<?> constructor3 : cls.getConstructors()) {
                float fA = a(Void.TYPE, constructor3.getParameterTypes(), clsArrA);
                if (fA > f) {
                    constructor2 = constructor3;
                    if (fA == 1.0f) {
                        break;
                    }
                    f = fA;
                }
            }
            a(bVar, constructor2);
            constructor = constructor2;
        }
        if (constructor != null) {
            return constructor;
        }
        throw new NoSuchMethodError("<init>" + str + " in class " + cls.getName());
    }

    protected static Field getFieldID(Class cls, String str, String str2, boolean z) {
        Field field;
        Class superclass = cls;
        b bVar = new b(superclass, str, str2);
        if (a(bVar)) {
            field = (Field) bVar.e;
        } else {
            Class[] clsArrA = a(str2);
            float f = 0.0f;
            Field field2 = null;
            while (superclass != null) {
                Field[] declaredFields = superclass.getDeclaredFields();
                int length = declaredFields.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    Field field3 = declaredFields[i];
                    if (z == Modifier.isStatic(field3.getModifiers()) && field3.getName().compareTo(str) == 0) {
                        float fA = a(field3.getType(), null, clsArrA);
                        if (fA > f) {
                            field2 = field3;
                            if (fA == 1.0f) {
                                f = fA;
                                break;
                            }
                            f = fA;
                        } else {
                            continue;
                        }
                    }
                    i++;
                }
                if (f == 1.0f || superclass.isPrimitive() || superclass.isInterface() || superclass.equals(Object.class) || superclass.equals(Void.TYPE)) {
                    break;
                }
                superclass = superclass.getSuperclass();
            }
            a(bVar, field2);
            field = field2;
        }
        if (field != null) {
            return field;
        }
        Object[] objArr = new Object[4];
        objArr[0] = z ? "static" : "non-static";
        objArr[1] = str;
        objArr[2] = str2;
        objArr[3] = superclass.getName();
        throw new NoSuchFieldError(String.format("no %s field with name='%s' signature='%s' in class L%s;", objArr));
    }

    protected static String getFieldSignature(Field field) {
        Class<?> type = field.getType();
        if (type.isPrimitive()) {
            String name = type.getName();
            return TypedValues.Custom.S_BOOLEAN.equals(name) ? "Z" : "byte".equals(name) ? "B" : "char".equals(name) ? "C" : "double".equals(name) ? "D" : TypedValues.Custom.S_FLOAT.equals(name) ? "F" : "int".equals(name) ? "I" : "long".equals(name) ? "J" : "short".equals(name) ? "S" : name;
        }
        if (type.isArray()) {
            return type.getName().replace('.', '/');
        }
        return "L" + type.getName().replace('.', '/') + ";";
    }

    protected static Method getMethodID(Class cls, String str, String str2, boolean z) throws SecurityException {
        Method method;
        b bVar = new b(cls, str, str2);
        if (a(bVar)) {
            method = (Method) bVar.e;
        } else {
            Class[] clsArrA = a(str2);
            float f = 0.0f;
            Method method2 = null;
            while (cls != null) {
                Method[] declaredMethods = cls.getDeclaredMethods();
                int length = declaredMethods.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    Method method3 = declaredMethods[i];
                    if (z == Modifier.isStatic(method3.getModifiers()) && method3.getName().compareTo(str) == 0) {
                        float fA = a(method3.getReturnType(), method3.getParameterTypes(), clsArrA);
                        if (fA > f) {
                            method2 = method3;
                            if (fA == 1.0f) {
                                f = fA;
                                break;
                            }
                            f = fA;
                        } else {
                            continue;
                        }
                    }
                    i++;
                }
                if (f == 1.0f || cls.isPrimitive() || cls.isInterface() || cls.equals(Object.class) || cls.equals(Void.TYPE)) {
                    break;
                }
                cls = cls.getSuperclass();
            }
            a(bVar, method2);
            method = method2;
        }
        if (method != null) {
            return method;
        }
        Object[] objArr = new Object[4];
        objArr[0] = z ? "static" : "non-static";
        objArr[1] = str;
        objArr[2] = str2;
        objArr[3] = cls.getName();
        throw new NoSuchMethodError(String.format("no %s method with name='%s' signature='%s' in class L%s;", objArr));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeProxyFinalize(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public static native Object nativeProxyInvoke(long j, String str, Object[] objArr);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeProxyLogJNIInvokeException(long j);

    protected static Object newProxyInstance(UnityPlayer unityPlayer, long j, Class cls) {
        return newProxyInstance(unityPlayer, j, new Class[]{cls});
    }

    protected static Object newProxyInstance(UnityPlayer unityPlayer, long j, Class[] clsArr) {
        return Proxy.newProxyInstance(ReflectionHelper.class.getClassLoader(), clsArr, new a(j, unityPlayer, clsArr));
    }

    protected static void setNativeExceptionOnProxy(Object obj, long j, boolean z) {
        a aVar = (a) ((d) Proxy.getInvocationHandler(obj));
        aVar.d = j;
        aVar.e = z;
    }

    private static synchronized void a(b bVar, Member member) {
        bVar.e = member;
        f4351a[bVar.d & (r4.length - 1)] = bVar;
    }
}
