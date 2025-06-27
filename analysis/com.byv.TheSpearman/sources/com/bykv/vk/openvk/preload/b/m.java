package com.bykv.vk.openvk.preload.b;

/* compiled from: UnProceedChain.java */
/* loaded from: classes2.dex */
final class m<IN> implements b<IN> {

    /* renamed from: a, reason: collision with root package name */
    private b<IN> f1382a;

    public m(b<IN> bVar) {
        this.f1382a = bVar;
    }

    @Override // com.bykv.vk.openvk.preload.b.b
    public final Object a(IN in) throws Exception {
        throw new UnsupportedOperationException();
    }

    @Override // com.bykv.vk.openvk.preload.b.b
    public final <I> I a(Class<? extends d<I, ?>> cls) {
        return (I) this.f1382a.a((Class) cls);
    }

    @Override // com.bykv.vk.openvk.preload.b.b
    public final <O> O b(Class<? extends d<?, O>> cls) {
        return (O) this.f1382a.b(cls);
    }
}
