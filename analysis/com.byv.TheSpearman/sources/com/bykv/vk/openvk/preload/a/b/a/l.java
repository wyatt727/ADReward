package com.bykv.vk.openvk.preload.a.b.a;

import com.bykv.vk.openvk.preload.a.q;
import com.bykv.vk.openvk.preload.a.t;
import com.bykv.vk.openvk.preload.a.u;
import java.io.IOException;

/* compiled from: TreeTypeAdapter.java */
/* loaded from: classes.dex */
public final class l<T> extends t<T> {

    /* renamed from: a, reason: collision with root package name */
    final com.bykv.vk.openvk.preload.a.f f1305a;
    private final q<T> b;
    private final com.bykv.vk.openvk.preload.a.j<T> c;
    private final com.bykv.vk.openvk.preload.a.c.a<T> d;
    private t<T> g;
    private final l<T>.a f = new a(this, 0);
    private final u e = null;

    public l(q<T> qVar, com.bykv.vk.openvk.preload.a.j<T> jVar, com.bykv.vk.openvk.preload.a.f fVar, com.bykv.vk.openvk.preload.a.c.a<T> aVar) {
        this.b = qVar;
        this.c = jVar;
        this.f1305a = fVar;
        this.d = aVar;
    }

    @Override // com.bykv.vk.openvk.preload.a.t
    public final T a(com.bykv.vk.openvk.preload.a.d.a aVar) throws IOException {
        if (this.c == null) {
            return b().a(aVar);
        }
        if (com.bykv.vk.openvk.preload.a.b.k.a(aVar) instanceof com.bykv.vk.openvk.preload.a.m) {
            return null;
        }
        return this.c.a();
    }

    @Override // com.bykv.vk.openvk.preload.a.t
    public final void a(com.bykv.vk.openvk.preload.a.d.c cVar, T t) throws IOException {
        q<T> qVar = this.b;
        if (qVar == null) {
            b().a(cVar, t);
        } else if (t == null) {
            cVar.e();
        } else {
            com.bykv.vk.openvk.preload.a.b.k.a(qVar.a(), cVar);
        }
    }

    private t<T> b() {
        t<T> tVar = this.g;
        if (tVar != null) {
            return tVar;
        }
        t<T> tVarA = this.f1305a.a(this.e, this.d);
        this.g = tVarA;
        return tVarA;
    }

    /* compiled from: TreeTypeAdapter.java */
    final class a {
        private a() {
        }

        /* synthetic */ a(l lVar, byte b) {
            this();
        }
    }
}
