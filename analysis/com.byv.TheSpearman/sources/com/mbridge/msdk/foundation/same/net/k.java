package com.mbridge.msdk.foundation.same.net;

/* compiled from: Response.java */
/* loaded from: classes4.dex */
public final class k<T> {

    /* renamed from: a, reason: collision with root package name */
    public com.mbridge.msdk.foundation.same.net.b.a f2900a;
    public com.mbridge.msdk.foundation.same.net.f.c b;
    public T c;

    private k(T t, com.mbridge.msdk.foundation.same.net.f.c cVar) {
        this.f2900a = null;
        this.b = null;
        this.c = null;
        this.c = t;
        this.b = cVar;
    }

    private k(com.mbridge.msdk.foundation.same.net.b.a aVar) {
        this.f2900a = null;
        this.b = null;
        this.c = null;
        this.f2900a = aVar;
    }

    public static <T> k<T> a(com.mbridge.msdk.foundation.same.net.b.a aVar) {
        return new k<>(aVar);
    }

    public static <T> k<T> a(T t, com.mbridge.msdk.foundation.same.net.f.c cVar) {
        return new k<>(t, cVar);
    }
}
