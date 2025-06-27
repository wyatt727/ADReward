package com.bykv.vk.openvk.preload.a.b.a;

import com.bykv.vk.openvk.preload.a.b.a.i;
import com.bykv.vk.openvk.preload.a.t;
import java.io.IOException;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/* compiled from: TypeAdapterRuntimeTypeWrapper.java */
/* loaded from: classes.dex */
final class m<T> extends t<T> {

    /* renamed from: a, reason: collision with root package name */
    private final com.bykv.vk.openvk.preload.a.f f1307a;
    private final t<T> b;
    private final Type c;

    m(com.bykv.vk.openvk.preload.a.f fVar, t<T> tVar, Type type) {
        this.f1307a = fVar;
        this.b = tVar;
        this.c = type;
    }

    @Override // com.bykv.vk.openvk.preload.a.t
    public final T a(com.bykv.vk.openvk.preload.a.d.a aVar) throws IOException {
        return this.b.a(aVar);
    }

    @Override // com.bykv.vk.openvk.preload.a.t
    public final void a(com.bykv.vk.openvk.preload.a.d.c cVar, T t) throws IOException {
        t<T> tVarA = this.b;
        Type type = this.c;
        if (t != null && (type == Object.class || (type instanceof TypeVariable) || (type instanceof Class))) {
            type = t.getClass();
        }
        if (type != this.c) {
            tVarA = this.f1307a.a((com.bykv.vk.openvk.preload.a.c.a) com.bykv.vk.openvk.preload.a.c.a.a(type));
            if (tVarA instanceof i.a) {
                t<T> tVar = this.b;
                if (!(tVar instanceof i.a)) {
                    tVarA = tVar;
                }
            }
        }
        tVarA.a(cVar, t);
    }
}
