package com.bykv.vk.openvk.preload.b;

import java.util.List;

/* compiled from: RealInterceptorChain.java */
/* loaded from: classes2.dex */
final class i implements b {

    /* renamed from: a, reason: collision with root package name */
    protected e f1379a;
    private int b;
    private List<h> c;
    private d d;

    i(List<h> list, int i, e eVar, d dVar) {
        this.c = list;
        this.b = i;
        this.f1379a = eVar;
        this.d = dVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bykv.vk.openvk.preload.b.b
    public final Object a(Object obj) throws Exception {
        d dVar = this.d;
        if (dVar != null) {
            dVar.c = obj;
            d dVar2 = this.d;
            if (dVar2.d != null) {
                dVar2.d.b(dVar2.e, dVar2);
            }
        }
        if (this.b >= this.c.size()) {
            return obj;
        }
        h hVar = this.c.get(this.b);
        Class<? extends d> cls = hVar.f1377a;
        d dVar3 = (d) this.f1379a.a(cls);
        if (dVar3 == null) {
            throw new IllegalArgumentException("interceptor == null , index = " + obj + " , class: " + cls);
        }
        com.bykv.vk.openvk.preload.b.b.a aVar = hVar.b;
        i iVar = new i(this.c, this.b + 1, this.f1379a, dVar3);
        dVar3.a(iVar, this.d, obj, aVar, hVar.c);
        if (dVar3.d != null) {
            dVar3.d.a(dVar3.e, dVar3);
        }
        try {
            Object objA = dVar3.a(iVar, obj);
            if (dVar3.d != null) {
                dVar3.d.c(dVar3.e, dVar3);
            }
            return objA;
        } catch (a e) {
            Throwable cause = e.getCause();
            if (dVar3.d != null) {
                dVar3.d.b(dVar3.e, dVar3, cause);
            }
            throw e;
        } catch (Throwable th) {
            if (dVar3.d != null) {
                dVar3.d.a(dVar3.e, dVar3, th);
            }
            throw new a(th);
        }
    }

    @Override // com.bykv.vk.openvk.preload.b.b
    public final Object a(Class cls) {
        d dVarC = c(cls);
        if (dVarC == null) {
            throw new IllegalArgumentException("can not find pre Interceptor , class:".concat(String.valueOf(cls)));
        }
        return dVarC.b;
    }

    @Override // com.bykv.vk.openvk.preload.b.b
    public final Object b(Class cls) {
        d dVarC = c(cls);
        if (dVarC == null) {
            throw new IllegalArgumentException("can not find pre Interceptor , class:".concat(String.valueOf(cls)));
        }
        return dVarC.c;
    }

    private d c(Class cls) {
        d dVar = this.d;
        while (dVar != null && dVar.getClass() != cls) {
            dVar = dVar.f1375a;
        }
        return dVar;
    }

    /* compiled from: RealInterceptorChain.java */
    static final class a extends Exception {
        a(Throwable th) {
            super(th);
        }
    }
}
