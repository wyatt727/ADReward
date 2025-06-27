package com.mbridge.msdk.e.a;

import com.mbridge.msdk.e.a.b;

/* compiled from: Response.java */
/* loaded from: classes4.dex */
public final class r<T> {

    /* renamed from: a, reason: collision with root package name */
    public final T f2713a;
    public final b.a b;
    public final z c;
    public boolean d;

    /* compiled from: Response.java */
    public interface a {
        void a(z zVar);
    }

    /* compiled from: Response.java */
    public interface b<T> {
        void a(T t);
    }

    public static <T> r<T> a(T t, b.a aVar) {
        return new r<>(t, aVar);
    }

    public static <T> r<T> a(z zVar) {
        return new r<>(zVar);
    }

    public final boolean a() {
        return this.c == null;
    }

    private r(T t, b.a aVar) {
        this.d = false;
        this.f2713a = t;
        this.b = aVar;
        this.c = null;
    }

    private r(z zVar) {
        this.d = false;
        this.f2713a = null;
        this.b = null;
        this.c = zVar;
    }
}
