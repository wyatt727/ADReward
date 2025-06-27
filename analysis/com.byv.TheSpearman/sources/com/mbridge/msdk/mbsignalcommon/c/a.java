package com.mbridge.msdk.mbsignalcommon.c;

import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.ad;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: Mapping.java */
/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static InterfaceC0277a f3152a;

    /* compiled from: Mapping.java */
    /* renamed from: com.mbridge.msdk.mbsignalcommon.c.a$a, reason: collision with other inner class name */
    public interface InterfaceC0277a {
        boolean a(b.C0278a c0278a);
    }

    /* compiled from: Mapping.java */
    public static abstract class b {

        /* compiled from: Mapping.java */
        /* renamed from: com.mbridge.msdk.mbsignalcommon.c.a$b$a, reason: collision with other inner class name */
        public static class C0278a extends Throwable {

            /* renamed from: a, reason: collision with root package name */
            private Class<?> f3153a;
            private String b;

            public C0278a(String str) {
                super(str);
            }

            public C0278a(Exception exc) {
                super(exc);
            }

            @Override // java.lang.Throwable
            public final String toString() {
                if (getCause() == null) {
                    return super.toString();
                }
                return getClass().getName() + ": " + getCause();
            }

            public final void a(Class<?> cls) {
                this.f3153a = cls;
            }

            public final void a(String str) {
                this.b = str;
            }
        }
    }

    /* compiled from: Mapping.java */
    public static class d {

        /* renamed from: a, reason: collision with root package name */
        protected final Method f3155a;

        public final Object a(Object obj, Object... objArr) throws IllegalArgumentException, InvocationTargetException {
            Method method = this.f3155a;
            if (method == null) {
                return null;
            }
            try {
                return method.invoke(obj, objArr);
            } catch (Exception e) {
                ad.a("MappingedMethod", "invoke error:" + e.getMessage());
                return null;
            }
        }

        d(Class<?> cls, String str, Class<?>[] clsArr, int i) throws b.C0278a, NoSuchMethodException, SecurityException {
            Method declaredMethod = null;
            if (cls == null) {
                return;
            }
            while (true) {
                if (cls == Object.class || cls == null) {
                    break;
                }
                try {
                    declaredMethod = cls.getDeclaredMethod(str, clsArr);
                    break;
                } catch (NoSuchMethodException e) {
                    if (MBridgeConstans.DEBUG && cls != null && cls.getSuperclass() == Object.class) {
                        e.printStackTrace();
                    }
                } catch (SecurityException e2) {
                    try {
                        try {
                            if (MBridgeConstans.DEBUG && cls != null && cls.getSuperclass() == Object.class) {
                                e2.printStackTrace();
                            }
                        } catch (Exception e3) {
                            b.C0278a c0278a = new b.C0278a(e3);
                            c0278a.a(cls);
                            c0278a.a(str);
                            a.b(c0278a);
                        }
                    } finally {
                        this.f3155a = declaredMethod;
                    }
                }
                cls = cls.getSuperclass();
            }
            if (declaredMethod != null) {
                if (i > 0 && (declaredMethod.getModifiers() & i) != i) {
                    a.b(new b.C0278a(declaredMethod + " does not match modifiers: " + i));
                }
                declaredMethod.setAccessible(true);
            }
        }

        public final Method a() {
            return this.f3155a;
        }
    }

    /* compiled from: Mapping.java */
    public static class c<C> {

        /* renamed from: a, reason: collision with root package name */
        protected Class<C> f3154a;

        public final d a(String str, Class<?>... clsArr) throws b.C0278a {
            return new d(this.f3154a, str, clsArr, 0);
        }

        public c(Class<C> cls) {
            this.f3154a = cls;
        }
    }

    public static <T> c<T> a(ClassLoader classLoader, String str) throws b.C0278a {
        try {
            return new c<>(classLoader.loadClass(str));
        } catch (Exception e) {
            b(new b.C0278a(e));
            return new c<>(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(b.C0278a c0278a) throws b.C0278a {
        InterfaceC0277a interfaceC0277a = f3152a;
        if (interfaceC0277a == null || !interfaceC0277a.a(c0278a)) {
            throw c0278a;
        }
    }
}
