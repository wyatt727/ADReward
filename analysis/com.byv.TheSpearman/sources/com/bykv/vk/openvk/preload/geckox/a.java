package com.bykv.vk.openvk.preload.geckox;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import com.bykv.vk.openvk.preload.geckox.d.b.b.f;
import com.bykv.vk.openvk.preload.geckox.d.d;
import com.bykv.vk.openvk.preload.geckox.d.e;
import com.bykv.vk.openvk.preload.geckox.d.g;
import com.bykv.vk.openvk.preload.geckox.d.h;
import com.bykv.vk.openvk.preload.geckox.model.CheckRequestBodyModel;
import com.bykv.vk.openvk.preload.geckox.model.UpdatePackage;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

/* compiled from: GeckoClient.java */
/* loaded from: classes2.dex */
public final class a {
    b c;
    File d;
    private final List<String> e = new ArrayList();

    /* renamed from: a, reason: collision with root package name */
    com.bykv.vk.openvk.preload.geckox.e.b f1385a = new com.bykv.vk.openvk.preload.geckox.e.b();
    Queue<String> b = new LinkedBlockingQueue();

    a(b bVar) {
        this.c = bVar;
        File file = bVar.p;
        this.d = file;
        file.mkdirs();
        b bVar2 = this.c;
        a(e.class, com.bykv.vk.openvk.preload.geckox.statistic.b.a(bVar2));
        a(d.class, com.bykv.vk.openvk.preload.geckox.statistic.b.a(bVar2));
        a(com.bykv.vk.openvk.preload.geckox.d.a.b.c.class, com.bykv.vk.openvk.preload.geckox.statistic.b.b(bVar2.f1395a));
        a(com.bykv.vk.openvk.preload.geckox.d.a.b.b.class, new com.bykv.vk.openvk.preload.b.b.a() { // from class: com.bykv.vk.openvk.preload.geckox.statistic.b.6
            @Override // com.bykv.vk.openvk.preload.b.b.a
            public final <T> void b(com.bykv.vk.openvk.preload.b.b<T> bVar3, com.bykv.vk.openvk.preload.b.d dVar) {
                super.b(bVar3, dVar);
                a.a(dVar.f).a(((UpdatePackage) ((Pair) bVar3.b(h.class)).second).getChannel()).i = true;
            }

            @Override // com.bykv.vk.openvk.preload.b.b.a
            public final <T> void a(com.bykv.vk.openvk.preload.b.b<T> bVar3, com.bykv.vk.openvk.preload.b.d dVar, Throwable th) {
                super.a(bVar3, dVar, th);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a aVarA = a.a(dVar.f).a(((UpdatePackage) ((Pair) bVar3.b(h.class)).second).getChannel());
                aVarA.i = false;
                aVarA.l = SystemClock.uptimeMillis();
                aVarA.s = th.getMessage();
            }
        });
        a(com.bykv.vk.openvk.preload.geckox.d.a.b.d.class, new com.bykv.vk.openvk.preload.b.b.a() { // from class: com.bykv.vk.openvk.preload.geckox.statistic.b.7
            @Override // com.bykv.vk.openvk.preload.b.b.a
            public final <T> void b(com.bykv.vk.openvk.preload.b.b<T> bVar3, com.bykv.vk.openvk.preload.b.d dVar) {
                super.b(bVar3, dVar);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a aVarA = a.a(dVar.f).a(((UpdatePackage) ((Pair) bVar3.b(h.class)).second).getChannel());
                aVarA.j = true;
                aVarA.m = SystemClock.uptimeMillis();
            }

            @Override // com.bykv.vk.openvk.preload.b.b.a
            public final <T> void a(com.bykv.vk.openvk.preload.b.b<T> bVar3, com.bykv.vk.openvk.preload.b.d dVar, Throwable th) {
                super.a(bVar3, dVar, th);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a aVarA = a.a(dVar.f).a(((UpdatePackage) ((Pair) bVar3.b(h.class)).second).getChannel());
                aVarA.j = false;
                aVarA.m = SystemClock.uptimeMillis();
                aVarA.t = th.getMessage();
            }
        });
        a(com.bykv.vk.openvk.preload.geckox.d.a.b.a.class, new com.bykv.vk.openvk.preload.b.b.a() { // from class: com.bykv.vk.openvk.preload.geckox.statistic.b.8
            @Override // com.bykv.vk.openvk.preload.b.b.a
            public final <T> void b(com.bykv.vk.openvk.preload.b.b<T> bVar3, com.bykv.vk.openvk.preload.b.d dVar) {
                super.b(bVar3, dVar);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a aVarA = a.a(dVar.f).a(((UpdatePackage) ((Pair) bVar3.b(h.class)).second).getChannel());
                aVarA.j = true;
                aVarA.n = SystemClock.uptimeMillis();
            }

            @Override // com.bykv.vk.openvk.preload.b.b.a
            public final <T> void a(com.bykv.vk.openvk.preload.b.b<T> bVar3, com.bykv.vk.openvk.preload.b.d dVar, Throwable th) {
                super.a(bVar3, dVar, th);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a aVarA = a.a(dVar.f).a(((UpdatePackage) ((Pair) bVar3.b(h.class)).second).getChannel());
                aVarA.j = false;
                aVarA.n = SystemClock.uptimeMillis();
                aVarA.t = th.getMessage();
            }
        });
        a(com.bykv.vk.openvk.preload.geckox.d.a.b.e.class, new com.bykv.vk.openvk.preload.b.b.a() { // from class: com.bykv.vk.openvk.preload.geckox.statistic.b.11
            @Override // com.bykv.vk.openvk.preload.b.b.a
            public final <T> void b(com.bykv.vk.openvk.preload.b.b<T> bVar3, com.bykv.vk.openvk.preload.b.d dVar) {
                super.b(bVar3, dVar);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a aVarA = a.a(dVar.f).a(((UpdatePackage) ((Pair) bVar3.b(h.class)).second).getChannel());
                aVarA.k = true;
                aVarA.o = SystemClock.uptimeMillis();
            }

            @Override // com.bykv.vk.openvk.preload.b.b.a
            public final <T> void a(com.bykv.vk.openvk.preload.b.b<T> bVar3, com.bykv.vk.openvk.preload.b.d dVar, Throwable th) {
                super.a(bVar3, dVar, th);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a aVarA = a.a(dVar.f).a(((UpdatePackage) ((Pair) bVar3.b(h.class)).second).getChannel());
                aVarA.k = false;
                aVarA.u = th.getMessage();
                aVarA.o = SystemClock.uptimeMillis();
            }
        });
        a(com.bykv.vk.openvk.preload.geckox.d.a.a.b.class, com.bykv.vk.openvk.preload.geckox.statistic.b.a(bVar2.f1395a));
        a(com.bykv.vk.openvk.preload.geckox.d.a.a.a.class, new com.bykv.vk.openvk.preload.b.b.a() { // from class: com.bykv.vk.openvk.preload.geckox.statistic.b.9
            @Override // com.bykv.vk.openvk.preload.b.b.a
            public final <T> void b(com.bykv.vk.openvk.preload.b.b<T> bVar3, com.bykv.vk.openvk.preload.b.d dVar) {
                super.b(bVar3, dVar);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a aVarA = a.a(dVar.f).a(((UpdatePackage) ((Pair) bVar3.b(g.class)).second).getChannel());
                aVarA.C = true;
                aVarA.z = SystemClock.uptimeMillis();
            }

            @Override // com.bykv.vk.openvk.preload.b.b.a
            public final <T> void a(com.bykv.vk.openvk.preload.b.b<T> bVar3, com.bykv.vk.openvk.preload.b.d dVar, Throwable th) {
                super.a(bVar3, dVar, th);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a aVarA = a.a(dVar.f).a(((UpdatePackage) ((Pair) bVar3.b(g.class)).second).getChannel());
                aVarA.C = false;
                aVarA.z = SystemClock.uptimeMillis();
                aVarA.E = th.getMessage();
            }
        });
        a(com.bykv.vk.openvk.preload.geckox.d.a.a.c.class, new com.bykv.vk.openvk.preload.b.b.a() { // from class: com.bykv.vk.openvk.preload.geckox.statistic.b.10
            @Override // com.bykv.vk.openvk.preload.b.b.a
            public final <T> void b(com.bykv.vk.openvk.preload.b.b<T> bVar3, com.bykv.vk.openvk.preload.b.d dVar) {
                super.b(bVar3, dVar);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a aVarA = a.a(dVar.f).a(((UpdatePackage) ((Pair) bVar3.b(g.class)).second).getChannel());
                aVarA.D = true;
                aVarA.A = SystemClock.uptimeMillis();
            }

            @Override // com.bykv.vk.openvk.preload.b.b.a
            public final <T> void a(com.bykv.vk.openvk.preload.b.b<T> bVar3, com.bykv.vk.openvk.preload.b.d dVar, Throwable th) {
                super.a(bVar3, dVar, th);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a aVarA = a.a(dVar.f).a(((UpdatePackage) ((Pair) bVar3.b(g.class)).second).getChannel());
                aVarA.D = false;
                aVarA.A = SystemClock.uptimeMillis();
                aVarA.F = th.getMessage();
            }
        });
        a(com.bykv.vk.openvk.preload.geckox.d.b.b.c.class, com.bykv.vk.openvk.preload.geckox.statistic.b.b(bVar2.f1395a));
        a(com.bykv.vk.openvk.preload.geckox.d.b.b.b.class, new com.bykv.vk.openvk.preload.b.b.a() { // from class: com.bykv.vk.openvk.preload.geckox.statistic.b.6
            @Override // com.bykv.vk.openvk.preload.b.b.a
            public final <T> void b(com.bykv.vk.openvk.preload.b.b<T> bVar3, com.bykv.vk.openvk.preload.b.d dVar) {
                super.b(bVar3, dVar);
                a.a(dVar.f).a(((UpdatePackage) ((Pair) bVar3.b(h.class)).second).getChannel()).i = true;
            }

            @Override // com.bykv.vk.openvk.preload.b.b.a
            public final <T> void a(com.bykv.vk.openvk.preload.b.b<T> bVar3, com.bykv.vk.openvk.preload.b.d dVar, Throwable th) {
                super.a(bVar3, dVar, th);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a aVarA = a.a(dVar.f).a(((UpdatePackage) ((Pair) bVar3.b(h.class)).second).getChannel());
                aVarA.i = false;
                aVarA.l = SystemClock.uptimeMillis();
                aVarA.s = th.getMessage();
            }
        });
        a(com.bykv.vk.openvk.preload.geckox.d.b.b.d.class, new com.bykv.vk.openvk.preload.b.b.a() { // from class: com.bykv.vk.openvk.preload.geckox.statistic.b.7
            @Override // com.bykv.vk.openvk.preload.b.b.a
            public final <T> void b(com.bykv.vk.openvk.preload.b.b<T> bVar3, com.bykv.vk.openvk.preload.b.d dVar) {
                super.b(bVar3, dVar);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a aVarA = a.a(dVar.f).a(((UpdatePackage) ((Pair) bVar3.b(h.class)).second).getChannel());
                aVarA.j = true;
                aVarA.m = SystemClock.uptimeMillis();
            }

            @Override // com.bykv.vk.openvk.preload.b.b.a
            public final <T> void a(com.bykv.vk.openvk.preload.b.b<T> bVar3, com.bykv.vk.openvk.preload.b.d dVar, Throwable th) {
                super.a(bVar3, dVar, th);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a aVarA = a.a(dVar.f).a(((UpdatePackage) ((Pair) bVar3.b(h.class)).second).getChannel());
                aVarA.j = false;
                aVarA.m = SystemClock.uptimeMillis();
                aVarA.t = th.getMessage();
            }
        });
        a(com.bykv.vk.openvk.preload.geckox.d.b.b.a.class, new com.bykv.vk.openvk.preload.b.b.a() { // from class: com.bykv.vk.openvk.preload.geckox.statistic.b.8
            @Override // com.bykv.vk.openvk.preload.b.b.a
            public final <T> void b(com.bykv.vk.openvk.preload.b.b<T> bVar3, com.bykv.vk.openvk.preload.b.d dVar) {
                super.b(bVar3, dVar);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a aVarA = a.a(dVar.f).a(((UpdatePackage) ((Pair) bVar3.b(h.class)).second).getChannel());
                aVarA.j = true;
                aVarA.n = SystemClock.uptimeMillis();
            }

            @Override // com.bykv.vk.openvk.preload.b.b.a
            public final <T> void a(com.bykv.vk.openvk.preload.b.b<T> bVar3, com.bykv.vk.openvk.preload.b.d dVar, Throwable th) {
                super.a(bVar3, dVar, th);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a aVarA = a.a(dVar.f).a(((UpdatePackage) ((Pair) bVar3.b(h.class)).second).getChannel());
                aVarA.j = false;
                aVarA.n = SystemClock.uptimeMillis();
                aVarA.t = th.getMessage();
            }
        });
        a(f.class, new com.bykv.vk.openvk.preload.b.b.a() { // from class: com.bykv.vk.openvk.preload.geckox.statistic.b.3
            @Override // com.bykv.vk.openvk.preload.b.b.a
            public final <T> void b(com.bykv.vk.openvk.preload.b.b<T> bVar3, com.bykv.vk.openvk.preload.b.d dVar) {
                super.b(bVar3, dVar);
            }

            @Override // com.bykv.vk.openvk.preload.b.b.a
            public final <T> void a(com.bykv.vk.openvk.preload.b.b<T> bVar3, com.bykv.vk.openvk.preload.b.d dVar, Throwable th) {
                super.a(bVar3, dVar, th);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a aVarA = a.a(dVar.f).a(((UpdatePackage) ((Pair) bVar3.b(h.class)).second).getChannel());
                aVarA.k = false;
                aVarA.o = SystemClock.uptimeMillis();
                aVarA.u = th.getMessage();
            }

            @Override // com.bykv.vk.openvk.preload.b.b.a
            public final <T> void b(com.bykv.vk.openvk.preload.b.b<T> bVar3, com.bykv.vk.openvk.preload.b.d dVar, Throwable th) {
                super.b(bVar3, dVar, th);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a aVarA = a.a(dVar.f).a(((UpdatePackage) ((Pair) bVar3.b(h.class)).second).getChannel());
                aVarA.k = false;
                aVarA.o = SystemClock.uptimeMillis();
                aVarA.F = th.getMessage();
            }

            @Override // com.bykv.vk.openvk.preload.b.b.a
            public final <T> void c(com.bykv.vk.openvk.preload.b.b<T> bVar3, com.bykv.vk.openvk.preload.b.d dVar) {
                super.c(bVar3, dVar);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a aVarA = a.a(dVar.f).a(((UpdatePackage) ((Pair) bVar3.b(h.class)).second).getChannel());
                aVarA.k = true;
                aVarA.o = SystemClock.uptimeMillis();
            }
        });
        a(com.bykv.vk.openvk.preload.geckox.d.b.a.b.class, com.bykv.vk.openvk.preload.geckox.statistic.b.a(bVar2.f1395a));
        a(com.bykv.vk.openvk.preload.geckox.d.b.a.a.class, new com.bykv.vk.openvk.preload.b.b.a() { // from class: com.bykv.vk.openvk.preload.geckox.statistic.b.9
            @Override // com.bykv.vk.openvk.preload.b.b.a
            public final <T> void b(com.bykv.vk.openvk.preload.b.b<T> bVar3, com.bykv.vk.openvk.preload.b.d dVar) {
                super.b(bVar3, dVar);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a aVarA = a.a(dVar.f).a(((UpdatePackage) ((Pair) bVar3.b(g.class)).second).getChannel());
                aVarA.C = true;
                aVarA.z = SystemClock.uptimeMillis();
            }

            @Override // com.bykv.vk.openvk.preload.b.b.a
            public final <T> void a(com.bykv.vk.openvk.preload.b.b<T> bVar3, com.bykv.vk.openvk.preload.b.d dVar, Throwable th) {
                super.a(bVar3, dVar, th);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a aVarA = a.a(dVar.f).a(((UpdatePackage) ((Pair) bVar3.b(g.class)).second).getChannel());
                aVarA.C = false;
                aVarA.z = SystemClock.uptimeMillis();
                aVarA.E = th.getMessage();
            }
        });
        a(com.bykv.vk.openvk.preload.geckox.d.b.a.d.class, new com.bykv.vk.openvk.preload.b.b.a() { // from class: com.bykv.vk.openvk.preload.geckox.statistic.b.2
            @Override // com.bykv.vk.openvk.preload.b.b.a
            public final <T> void a(com.bykv.vk.openvk.preload.b.b<T> bVar3, com.bykv.vk.openvk.preload.b.d dVar, Throwable th) {
                super.a(bVar3, dVar, th);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a aVarA = a.a(dVar.f).a(((UpdatePackage) ((Pair) bVar3.b(g.class)).second).getChannel());
                aVarA.D = false;
                aVarA.A = SystemClock.uptimeMillis();
                aVarA.F = th.getMessage();
            }

            @Override // com.bykv.vk.openvk.preload.b.b.a
            public final <T> void b(com.bykv.vk.openvk.preload.b.b<T> bVar3, com.bykv.vk.openvk.preload.b.d dVar, Throwable th) {
                super.b(bVar3, dVar, th);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a aVarA = a.a(dVar.f).a(((UpdatePackage) ((Pair) bVar3.b(g.class)).second).getChannel());
                aVarA.D = false;
                aVarA.A = SystemClock.uptimeMillis();
                aVarA.F = th.getMessage();
            }

            @Override // com.bykv.vk.openvk.preload.b.b.a
            public final <T> void c(com.bykv.vk.openvk.preload.b.b<T> bVar3, com.bykv.vk.openvk.preload.b.d dVar) {
                super.c(bVar3, dVar);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a aVarA = a.a(dVar.f).a(((UpdatePackage) ((Pair) bVar3.b(g.class)).second).getChannel());
                aVarA.D = true;
                aVarA.A = SystemClock.uptimeMillis();
            }
        });
    }

    final boolean a(Map<String, List<CheckRequestBodyModel.TargetChannel>> map) {
        if (map.isEmpty()) {
            return true;
        }
        List<String> list = this.c.g;
        for (Map.Entry<String, List<CheckRequestBodyModel.TargetChannel>> entry : map.entrySet()) {
            Iterator<String> it = list.iterator();
            boolean z = false;
            while (it.hasNext()) {
                if (TextUtils.equals(it.next(), entry.getKey())) {
                    z = true;
                }
            }
            if (!z) {
                return false;
            }
        }
        return true;
    }

    final boolean a() {
        List<String> list = this.c.h;
        List<String> list2 = this.c.g;
        if (list == null || list.isEmpty() || list2 == null || list2.isEmpty()) {
            return false;
        }
        for (String str : list2) {
            Iterator<String> it = list.iterator();
            boolean z = false;
            while (it.hasNext()) {
                if (TextUtils.equals(str, it.next())) {
                    z = true;
                }
            }
            if (!z) {
                return false;
            }
        }
        return true;
    }

    private void a(Class<? extends com.bykv.vk.openvk.preload.b.d<?, ?>> cls, com.bykv.vk.openvk.preload.b.b.a aVar) {
        this.f1385a.a(cls, aVar);
    }
}
