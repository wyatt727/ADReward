package com.bykv.vk.openvk.preload.b;

/* compiled from: Pipe.java */
/* loaded from: classes2.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    Class<? extends d> f1377a;
    com.bykv.vk.openvk.preload.b.b.a b;
    Object[] c;

    /* synthetic */ h(a aVar, byte b) {
        this(aVar);
    }

    private h(a aVar) {
        this.f1377a = aVar.f1378a;
        this.b = aVar.b;
        this.c = aVar.c;
        if (this.f1377a == null) {
            throw new IllegalArgumentException("Interceptor class == null");
        }
    }

    /* compiled from: Pipe.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        Class<? extends d> f1378a;
        public com.bykv.vk.openvk.preload.b.b.a b;
        public Object[] c;

        public final a a(Class<? extends d> cls) {
            if (cls == null) {
                throw new IllegalArgumentException("interceptor class == null");
            }
            this.f1378a = cls;
            return this;
        }

        public final h a() {
            return new h(this, (byte) 0);
        }
    }
}
