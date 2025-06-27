package com.mbridge.msdk.e.a;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: RequestQueue.java */
/* loaded from: classes4.dex */
public final class q {
    private final b e;
    private final j f;
    private final t g;
    private final k[] h;
    private c i;

    /* renamed from: a, reason: collision with root package name */
    private final AtomicInteger f2712a = new AtomicInteger();
    private final Set<p<?>> b = new HashSet();
    private final PriorityBlockingQueue<p<?>> c = new PriorityBlockingQueue<>();
    private final PriorityBlockingQueue<p<?>> d = new PriorityBlockingQueue<>();
    private final List<a> j = new ArrayList();

    /* compiled from: RequestQueue.java */
    public interface a {
        void a(p<?> pVar, int i);
    }

    public q(j jVar, t tVar, int i, b bVar) {
        this.e = bVar;
        this.f = jVar;
        this.h = new k[i];
        this.g = tVar;
    }

    public final <T> p<T> a(p<T> pVar) {
        pVar.a(this);
        synchronized (this.b) {
            this.b.add(pVar);
        }
        pVar.c(this.f2712a.incrementAndGet());
        a(pVar, 0);
        if (!pVar.p()) {
            c(pVar);
        } else {
            this.c.add(pVar);
        }
        return pVar;
    }

    final <T> void b(p<T> pVar) {
        synchronized (this.b) {
            this.b.remove(pVar);
        }
        a(pVar, 5);
    }

    final void a(p<?> pVar, int i) {
        synchronized (this.j) {
            Iterator<a> it = this.j.iterator();
            while (it.hasNext()) {
                it.next().a(pVar, i);
            }
        }
    }

    final <T> void c(p<T> pVar) {
        this.d.add(pVar);
    }

    public final void a() {
        c cVar = this.i;
        if (cVar != null) {
            cVar.a();
        }
        for (k kVar : this.h) {
            if (kVar != null) {
                kVar.a();
            }
        }
        c cVar2 = new c(this.c, this.d, this.e, this.g);
        this.i = cVar2;
        cVar2.start();
        for (int i = 0; i < this.h.length; i++) {
            k kVar2 = new k(this.d, this.f, this.e, this.g);
            this.h[i] = kVar2;
            kVar2.start();
        }
    }
}
