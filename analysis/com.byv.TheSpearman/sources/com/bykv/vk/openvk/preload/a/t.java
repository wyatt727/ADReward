package com.bykv.vk.openvk.preload.a;

import java.io.IOException;

/* compiled from: TypeAdapter.java */
/* loaded from: classes.dex */
public abstract class t<T> {
    public abstract T a(com.bykv.vk.openvk.preload.a.d.a aVar) throws IOException;

    public abstract void a(com.bykv.vk.openvk.preload.a.d.c cVar, T t) throws IOException;

    public final t<T> a() {
        return new t<T>() { // from class: com.bykv.vk.openvk.preload.a.t.1
            @Override // com.bykv.vk.openvk.preload.a.t
            public final void a(com.bykv.vk.openvk.preload.a.d.c cVar, T t) throws IOException {
                if (t == null) {
                    cVar.e();
                } else {
                    t.this.a(cVar, t);
                }
            }

            @Override // com.bykv.vk.openvk.preload.a.t
            public final T a(com.bykv.vk.openvk.preload.a.d.a aVar) throws IOException {
                if (aVar.f() == com.bykv.vk.openvk.preload.a.d.b.NULL) {
                    aVar.k();
                    return null;
                }
                return (T) t.this.a(aVar);
            }
        };
    }

    public final k a(T t) {
        try {
            com.bykv.vk.openvk.preload.a.b.a.f fVar = new com.bykv.vk.openvk.preload.a.b.a.f();
            a(fVar, t);
            if (!fVar.f1295a.isEmpty()) {
                throw new IllegalStateException("Expected one JSON element but was " + fVar.f1295a);
            }
            return fVar.b;
        } catch (IOException e) {
            throw new l(e);
        }
    }
}
