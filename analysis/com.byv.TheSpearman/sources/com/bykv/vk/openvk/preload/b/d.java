package com.bykv.vk.openvk.preload.b;

import java.util.concurrent.atomic.AtomicLong;

/* compiled from: Interceptor.java */
/* loaded from: classes2.dex */
public abstract class d<IN, OUT> {
    private static AtomicLong g = new AtomicLong();

    /* renamed from: a, reason: collision with root package name */
    d f1375a;
    IN b;
    public OUT c;
    com.bykv.vk.openvk.preload.b.b.a d;
    b e;
    public long f;

    public abstract Object a(b<OUT> bVar, IN in) throws Throwable;

    protected void a(Object... objArr) {
    }

    final void a(b bVar, d dVar, IN in, com.bykv.vk.openvk.preload.b.b.a aVar, Object[] objArr) {
        this.e = new m(bVar);
        this.f1375a = dVar;
        this.b = in;
        this.d = aVar;
        if (dVar != null) {
            this.f = dVar.f;
        } else {
            long andIncrement = g.getAndIncrement();
            this.f = andIncrement;
            if (andIncrement < 0) {
                throw new RuntimeException("Pipeline ID use up!");
            }
        }
        a(objArr);
    }

    protected final void b(Throwable th) {
        com.bykv.vk.openvk.preload.b.b.a aVar = this.d;
        if (aVar == null) {
            return;
        }
        aVar.c(this.e, this, th);
    }
}
