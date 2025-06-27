package com.mbridge.msdk.dycreator.d;

import com.mbridge.msdk.dycreator.g.c;
import com.mbridge.msdk.dycreator.g.d;
import com.mbridge.msdk.dycreator.g.f;
import com.mbridge.msdk.dycreator.g.h;

/* compiled from: SubjectFactory.java */
/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static volatile a f2669a;

    /* compiled from: SubjectFactory.java */
    /* renamed from: com.mbridge.msdk.dycreator.d.a$a, reason: collision with other inner class name */
    public enum EnumC0260a {
        VIEW_OBSERVER,
        CLICK_OBSERVER,
        EFFECT_OBSERVER,
        REPORT_OBSERVER
    }

    private a() {
    }

    public static a a() {
        if (f2669a == null) {
            synchronized (a.class) {
                if (f2669a == null) {
                    f2669a = new a();
                }
            }
        }
        return f2669a;
    }

    /* compiled from: SubjectFactory.java */
    /* renamed from: com.mbridge.msdk.dycreator.d.a$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f2670a;

        static {
            int[] iArr = new int[EnumC0260a.values().length];
            f2670a = iArr;
            try {
                iArr[EnumC0260a.VIEW_OBSERVER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2670a[EnumC0260a.CLICK_OBSERVER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2670a[EnumC0260a.EFFECT_OBSERVER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2670a[EnumC0260a.REPORT_OBSERVER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public final <T extends com.mbridge.msdk.dycreator.g.a> T a(EnumC0260a enumC0260a) {
        int i = AnonymousClass1.f2670a[enumC0260a.ordinal()];
        if (i == 1) {
            return new d();
        }
        if (i == 2) {
            return new c();
        }
        if (i == 3) {
            return new f();
        }
        if (i != 4) {
            return null;
        }
        return new h();
    }
}
