package com.bykv.vk.openvk.preload.geckox.e;

import com.bykv.vk.openvk.preload.b.d;
import java.util.HashMap;
import java.util.Map;

/* compiled from: ListenerProvider.java */
/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final Map<Class<? extends d<?, ?>>, com.bykv.vk.openvk.preload.b.b.b> f1409a = new HashMap();

    public final void a(Class<? extends d<?, ?>> cls, com.bykv.vk.openvk.preload.b.b.a aVar) {
        synchronized (this.f1409a) {
            com.bykv.vk.openvk.preload.b.b.b bVar = this.f1409a.get(cls);
            if (bVar == null) {
                bVar = new com.bykv.vk.openvk.preload.b.b.b(new com.bykv.vk.openvk.preload.b.b.a[0]);
                this.f1409a.put(cls, bVar);
            }
            bVar.a(aVar);
        }
    }

    public final com.bykv.vk.openvk.preload.b.b.a a(Class<? extends d<?, ?>> cls) {
        com.bykv.vk.openvk.preload.b.b.b bVar;
        synchronized (this.f1409a) {
            bVar = this.f1409a.get(cls);
        }
        return bVar;
    }
}
