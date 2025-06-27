package com.bykv.vk.openvk.preload.a.b;

import com.bykv.vk.openvk.preload.a.t;
import com.bykv.vk.openvk.preload.a.u;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: Excluder.java */
/* loaded from: classes.dex */
public final class d implements u, Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public static final d f1339a = new d();
    public boolean e;
    public double b = -1.0d;
    public int c = 136;
    public boolean d = true;
    public List<com.bykv.vk.openvk.preload.a.b> f = Collections.emptyList();
    public List<com.bykv.vk.openvk.preload.a.b> g = Collections.emptyList();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public d clone() {
        try {
            return (d) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public final boolean a(Class<?> cls) {
        if (this.b == -1.0d || a((com.bykv.vk.openvk.preload.a.a.d) cls.getAnnotation(com.bykv.vk.openvk.preload.a.a.d.class), (com.bykv.vk.openvk.preload.a.a.e) cls.getAnnotation(com.bykv.vk.openvk.preload.a.a.e.class))) {
            return (!this.d && c(cls)) || b(cls);
        }
        return true;
    }

    public final boolean a(boolean z) {
        Iterator<com.bykv.vk.openvk.preload.a.b> it = (z ? this.f : this.g).iterator();
        while (it.hasNext()) {
            if (it.next().b()) {
                return true;
            }
        }
        return false;
    }

    public static boolean b(Class<?> cls) {
        if (Enum.class.isAssignableFrom(cls)) {
            return false;
        }
        return cls.isAnonymousClass() || cls.isLocalClass();
    }

    public static boolean c(Class<?> cls) {
        return cls.isMemberClass() && !d(cls);
    }

    private static boolean d(Class<?> cls) {
        return (cls.getModifiers() & 8) != 0;
    }

    public final boolean a(com.bykv.vk.openvk.preload.a.a.d dVar, com.bykv.vk.openvk.preload.a.a.e eVar) {
        return a(dVar) && a(eVar);
    }

    private boolean a(com.bykv.vk.openvk.preload.a.a.d dVar) {
        return dVar == null || dVar.a() <= this.b;
    }

    private boolean a(com.bykv.vk.openvk.preload.a.a.e eVar) {
        return eVar == null || eVar.a() > this.b;
    }

    @Override // com.bykv.vk.openvk.preload.a.u
    public final <T> t<T> a(final com.bykv.vk.openvk.preload.a.f fVar, final com.bykv.vk.openvk.preload.a.c.a<T> aVar) {
        boolean zA = a(aVar.b);
        final boolean z = zA || a(true);
        final boolean z2 = zA || a(false);
        if (z || z2) {
            return new t<T>() { // from class: com.bykv.vk.openvk.preload.a.b.d.1
                private t<T> f;

                @Override // com.bykv.vk.openvk.preload.a.t
                public final T a(com.bykv.vk.openvk.preload.a.d.a aVar2) throws IOException {
                    if (z2) {
                        aVar2.o();
                        return null;
                    }
                    return b().a(aVar2);
                }

                @Override // com.bykv.vk.openvk.preload.a.t
                public final void a(com.bykv.vk.openvk.preload.a.d.c cVar, T t) throws IOException {
                    if (z) {
                        cVar.e();
                    } else {
                        b().a(cVar, t);
                    }
                }

                private t<T> b() {
                    t<T> tVar = this.f;
                    if (tVar != null) {
                        return tVar;
                    }
                    t<T> tVarA = fVar.a(d.this, aVar);
                    this.f = tVarA;
                    return tVarA;
                }
            };
        }
        return null;
    }
}
