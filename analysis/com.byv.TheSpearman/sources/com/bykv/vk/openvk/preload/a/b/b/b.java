package com.bykv.vk.openvk.preload.a.b.b;

import com.bykv.vk.openvk.preload.a.b.e;
import java.lang.reflect.AccessibleObject;

/* compiled from: ReflectionAccessor.java */
/* loaded from: classes2.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    private static final b f1320a;

    public abstract void a(AccessibleObject accessibleObject);

    static {
        f1320a = e.a() < 9 ? new a() : new c();
    }

    public static b a() {
        return f1320a;
    }
}
