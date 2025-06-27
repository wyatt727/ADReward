package com.bykv.vk.openvk.preload.a.b.a;

import com.bykv.vk.openvk.preload.a.t;
import com.bykv.vk.openvk.preload.a.u;
import java.io.IOException;
import java.util.ArrayList;

/* compiled from: ObjectTypeAdapter.java */
/* loaded from: classes.dex */
public final class h extends t<Object> {

    /* renamed from: a, reason: collision with root package name */
    public static final u f1298a = new u() { // from class: com.bykv.vk.openvk.preload.a.b.a.h.1
        @Override // com.bykv.vk.openvk.preload.a.u
        public final <T> t<T> a(com.bykv.vk.openvk.preload.a.f fVar, com.bykv.vk.openvk.preload.a.c.a<T> aVar) {
            if (aVar.b == Object.class) {
                return new h(fVar);
            }
            return null;
        }
    };
    private final com.bykv.vk.openvk.preload.a.f b;

    h(com.bykv.vk.openvk.preload.a.f fVar) {
        this.b = fVar;
    }

    /* compiled from: ObjectTypeAdapter.java */
    /* renamed from: com.bykv.vk.openvk.preload.a.b.a.h$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f1299a;

        static {
            int[] iArr = new int[com.bykv.vk.openvk.preload.a.d.b.values().length];
            f1299a = iArr;
            try {
                iArr[com.bykv.vk.openvk.preload.a.d.b.BEGIN_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1299a[com.bykv.vk.openvk.preload.a.d.b.BEGIN_OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1299a[com.bykv.vk.openvk.preload.a.d.b.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1299a[com.bykv.vk.openvk.preload.a.d.b.NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f1299a[com.bykv.vk.openvk.preload.a.d.b.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f1299a[com.bykv.vk.openvk.preload.a.d.b.NULL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    @Override // com.bykv.vk.openvk.preload.a.t
    public final Object a(com.bykv.vk.openvk.preload.a.d.a aVar) throws IOException {
        switch (AnonymousClass2.f1299a[aVar.f().ordinal()]) {
            case 1:
                ArrayList arrayList = new ArrayList();
                aVar.a();
                while (aVar.e()) {
                    arrayList.add(a(aVar));
                }
                aVar.b();
                return arrayList;
            case 2:
                com.bykv.vk.openvk.preload.a.b.h hVar = new com.bykv.vk.openvk.preload.a.b.h();
                aVar.c();
                while (aVar.e()) {
                    hVar.put(aVar.h(), a(aVar));
                }
                aVar.d();
                return hVar;
            case 3:
                return aVar.i();
            case 4:
                return Double.valueOf(aVar.l());
            case 5:
                return Boolean.valueOf(aVar.j());
            case 6:
                aVar.k();
                return null;
            default:
                throw new IllegalStateException();
        }
    }

    @Override // com.bykv.vk.openvk.preload.a.t
    public final void a(com.bykv.vk.openvk.preload.a.d.c cVar, Object obj) throws IOException {
        if (obj == null) {
            cVar.e();
            return;
        }
        t tVarA = this.b.a((Class) obj.getClass());
        if (tVarA instanceof h) {
            cVar.c();
            cVar.d();
        } else {
            tVarA.a(cVar, obj);
        }
    }
}
