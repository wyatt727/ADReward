package com.apm.insight.runtime;

import com.apm.insight.CrashType;
import com.apm.insight.ICrashCallback;
import com.apm.insight.IOOMCallback;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private final List<ICrashCallback> f131a = new CopyOnWriteArrayList();
    private final List<ICrashCallback> b = new CopyOnWriteArrayList();
    private final List<ICrashCallback> c = new CopyOnWriteArrayList();
    private final List<ICrashCallback> d = new CopyOnWriteArrayList();
    private final List<IOOMCallback> e = new CopyOnWriteArrayList();

    /* renamed from: com.apm.insight.runtime.c$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f132a;

        static {
            int[] iArr = new int[CrashType.values().length];
            f132a = iArr;
            try {
                iArr[CrashType.ALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f132a[CrashType.ANR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f132a[CrashType.JAVA.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f132a[CrashType.LAUNCH.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f132a[CrashType.NATIVE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public List<IOOMCallback> a() {
        return this.e;
    }

    void a(ICrashCallback iCrashCallback, CrashType crashType) {
        List<ICrashCallback> list;
        int i = AnonymousClass1.f132a[crashType.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    list = this.b;
                } else if (i == 4) {
                    list = this.f131a;
                } else if (i != 5) {
                    return;
                } else {
                    list = this.c;
                }
            }
            list.add(iCrashCallback);
        }
        this.f131a.add(iCrashCallback);
        this.b.add(iCrashCallback);
        this.c.add(iCrashCallback);
        list = this.d;
        list.add(iCrashCallback);
    }

    void a(IOOMCallback iOOMCallback) {
        this.e.add(iOOMCallback);
    }

    public List<ICrashCallback> b() {
        return this.f131a;
    }

    void b(ICrashCallback iCrashCallback, CrashType crashType) {
        List<ICrashCallback> list;
        int i = AnonymousClass1.f132a[crashType.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    list = this.b;
                } else if (i == 4) {
                    list = this.f131a;
                } else if (i != 5) {
                    return;
                } else {
                    list = this.c;
                }
            }
            list.remove(iCrashCallback);
        }
        this.f131a.remove(iCrashCallback);
        this.b.remove(iCrashCallback);
        this.c.remove(iCrashCallback);
        list = this.d;
        list.remove(iCrashCallback);
    }

    void b(IOOMCallback iOOMCallback) {
        this.e.remove(iOOMCallback);
    }

    public List<ICrashCallback> c() {
        return this.b;
    }

    public List<ICrashCallback> d() {
        return this.c;
    }

    public List<ICrashCallback> e() {
        return this.d;
    }
}
